
public class Dollar {

	public int amount;

	public Dollar(final int amount) {
		this.amount = amount;
	}

	public Dollar times(final int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(final Object object) {
		final Dollar other = (Dollar) object;

		return amount == other.amount;
	}

}
