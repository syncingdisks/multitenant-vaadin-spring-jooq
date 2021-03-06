/**
 * This class is generated by jOOQ
 */
package de.eiswind.vaadin.datalayer.tables.pojos;


import de.eiswind.vaadin.datalayer.tables.interfaces.IUser;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements IUser {

	private static final long serialVersionUID = -1547100626;

	private Long    id;
	private String  userName;
	private String  passwordHash;
	private Boolean active;

	public User() {}

	public User(User value) {
		this.id = value.id;
		this.userName = value.userName;
		this.passwordHash = value.passwordHash;
		this.active = value.active;
	}

	public User(
		Long    id,
		String  userName,
		String  passwordHash,
		Boolean active
	) {
		this.id = id;
		this.userName = userName;
		this.passwordHash = passwordHash;
		this.active = active;
	}

	@NotNull
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@NotNull
	@Size(max = 255)
	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@NotNull
	@Size(max = 2048)
	@Override
	public String getPasswordHash() {
		return this.passwordHash;
	}

	@Override
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	@NotNull
	@Override
	public Boolean getActive() {
		return this.active;
	}

	@Override
	public void setActive(Boolean active) {
		this.active = active;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IUser from) {
		setId(from.getId());
		setUserName(from.getUserName());
		setPasswordHash(from.getPasswordHash());
		setActive(from.getActive());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IUser> E into(E into) {
		into.from(this);
		return into;
	}
}
