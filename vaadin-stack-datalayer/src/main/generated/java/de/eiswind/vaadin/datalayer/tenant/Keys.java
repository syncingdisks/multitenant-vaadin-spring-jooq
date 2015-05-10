/**
 * This class is generated by jOOQ
 */
package de.eiswind.vaadin.datalayer.tenant;


import de.eiswind.vaadin.datalayer.tenant.tables.User;
import de.eiswind.vaadin.datalayer.tenant.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>tenant</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<UserRecord> PK_USER = UniqueKeys0.PK_USER;
	public static final UniqueKey<UserRecord> UK_USER_USER_NAME = UniqueKeys0.UK_USER_USER_NAME;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<UserRecord, Long> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<UserRecord> PK_USER = createUniqueKey(User.USER, User.USER.ID);
		public static final UniqueKey<UserRecord> UK_USER_USER_NAME = createUniqueKey(User.USER, User.USER.USER_NAME);
	}
}