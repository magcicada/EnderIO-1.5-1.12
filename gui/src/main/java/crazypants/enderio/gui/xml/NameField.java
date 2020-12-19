package crazypants.enderio.gui.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

public class NameField {

  public static class NameValue {

    private String value;
    private boolean negative;

    public NameValue(boolean negative, String value) {
      this.negative = negative;
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }

    public boolean isNegative() {
      return negative;
    }

    public void setNegative(boolean negative) {
      this.negative = negative;
    }

  }

  private final @Nonnull List<NameValue> names = new ArrayList<>();
  private String nbt;

  public @Nonnull NameField add(@Nonnull String name) {
    for (String split : name.split(",\\s*")) {
      if (split.startsWith("-")) {
        names.add(new NameValue(true, split.substring(1)));
      } else if (split.startsWith("+")) {
        names.add(new NameValue(false, split.substring(1)));
      } else {
        names.add(new NameValue(false, split));
      }
    }
    return this;
  }

  public @Nonnull NameField setNbt(@Nonnull String string) {
    nbt = string;
    return this;
  }

  public boolean isEmpty() {
    return names.isEmpty();
  }

  public boolean hasNbt() {
    return nbt != null && !nbt.isEmpty();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!names.isEmpty()) {
      builder.append("name='");
      builder.append(String.join(", ", names.stream().map(n -> n.toString()).collect(Collectors.toList())));
      builder.append("' ");
    }
    if (nbt != null && !nbt.isEmpty()) {
      builder.append("nbt='");
      builder.append(nbt);
      builder.append("' ");
    }
    return builder.toString();
  }

  public @Nonnull String getName() {
    return "" + String.join(", ", names.stream().map(n -> n.toString()).collect(Collectors.toList()));
  }

  public @Nonnull String getNbt() {
    return nbt != null ? nbt : "";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + names.hashCode();
    result = prime * result + ((nbt == null) ? 0 : nbt.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NameField other = (NameField) obj;
    if (!names.equals(other.names))
      return false;
    if (nbt == null) {
      if (other.nbt != null)
        return false;
    } else if (!nbt.equals(other.nbt))
      return false;
    return true;
  }

}