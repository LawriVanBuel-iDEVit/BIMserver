/**
 * Copyright (C) 2009-2013 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Damper Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcDamperTypeEnum()
 * @model
 * @generated
 */
public enum IfcDamperTypeEnum implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>CONTROLDAMPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLDAMPER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLDAMPER(1, "CONTROLDAMPER", "CONTROLDAMPER"), /**
														* The '<em><b>FUMEHOODEXHAUST</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #FUMEHOODEXHAUST_VALUE
														* @generated
														* @ordered
														*/
	FUMEHOODEXHAUST(2, "FUMEHOODEXHAUST", "FUMEHOODEXHAUST"), /**
																* The '<em><b>BALANCINGDAMPER</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #BALANCINGDAMPER_VALUE
																* @generated
																* @ordered
																*/
	BALANCINGDAMPER(3, "BALANCINGDAMPER", "BALANCINGDAMPER"), /**
																* The '<em><b>GRAVITYRELIEFDAMPER</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #GRAVITYRELIEFDAMPER_VALUE
																* @generated
																* @ordered
																*/
	GRAVITYRELIEFDAMPER(4, "GRAVITYRELIEFDAMPER", "GRAVITYRELIEFDAMPER"), /**
																			* The '<em><b>USERDEFINED</b></em>' literal object.
																			* <!-- begin-user-doc -->
																			* <!-- end-user-doc -->
																			* @see #USERDEFINED_VALUE
																			* @generated
																			* @ordered
																			*/
	USERDEFINED(5, "USERDEFINED", "USERDEFINED"), /**
													* The '<em><b>FIREDAMPER</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #FIREDAMPER_VALUE
													* @generated
													* @ordered
													*/
	FIREDAMPER(6, "FIREDAMPER", "FIREDAMPER"), /**
												* The '<em><b>NOTDEFINED</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #NOTDEFINED_VALUE
												* @generated
												* @ordered
												*/
	NOTDEFINED(7, "NOTDEFINED", "NOTDEFINED"), /**
												* The '<em><b>GRAVITYDAMPER</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #GRAVITYDAMPER_VALUE
												* @generated
												* @ordered
												*/
	GRAVITYDAMPER(8, "GRAVITYDAMPER", "GRAVITYDAMPER"), /**
														* The '<em><b>BLASTDAMPER</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #BLASTDAMPER_VALUE
														* @generated
														* @ordered
														*/
	BLASTDAMPER(9, "BLASTDAMPER", "BLASTDAMPER"), /**
													* The '<em><b>BACKDRAFTDAMPER</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #BACKDRAFTDAMPER_VALUE
													* @generated
													* @ordered
													*/
	BACKDRAFTDAMPER(10, "BACKDRAFTDAMPER", "BACKDRAFTDAMPER"), /**
																* The '<em><b>FIRESMOKEDAMPER</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #FIRESMOKEDAMPER_VALUE
																* @generated
																* @ordered
																*/
	FIRESMOKEDAMPER(11, "FIRESMOKEDAMPER", "FIRESMOKEDAMPER"), /**
																* The '<em><b>RELIEFDAMPER</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #RELIEFDAMPER_VALUE
																* @generated
																* @ordered
																*/
	RELIEFDAMPER(12, "RELIEFDAMPER", "RELIEFDAMPER"), /**
														* The '<em><b>SMOKEDAMPER</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #SMOKEDAMPER_VALUE
														* @generated
														* @ordered
														*/
	SMOKEDAMPER(13, "SMOKEDAMPER", "SMOKEDAMPER");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>CONTROLDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROLDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLDAMPER_VALUE = 1;

	/**
	 * The '<em><b>FUMEHOODEXHAUST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUMEHOODEXHAUST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUMEHOODEXHAUST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUMEHOODEXHAUST_VALUE = 2;

	/**
	 * The '<em><b>BALANCINGDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BALANCINGDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALANCINGDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BALANCINGDAMPER_VALUE = 3;

	/**
	 * The '<em><b>GRAVITYRELIEFDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAVITYRELIEFDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAVITYRELIEFDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAVITYRELIEFDAMPER_VALUE = 4;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 5;

	/**
	 * The '<em><b>FIREDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIREDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIREDAMPER_VALUE = 6;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 7;

	/**
	 * The '<em><b>GRAVITYDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAVITYDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAVITYDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAVITYDAMPER_VALUE = 8;

	/**
	 * The '<em><b>BLASTDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLASTDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLASTDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLASTDAMPER_VALUE = 9;

	/**
	 * The '<em><b>BACKDRAFTDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACKDRAFTDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKDRAFTDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACKDRAFTDAMPER_VALUE = 10;

	/**
	 * The '<em><b>FIRESMOKEDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRESMOKEDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRESMOKEDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRESMOKEDAMPER_VALUE = 11;

	/**
	 * The '<em><b>RELIEFDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELIEFDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIEFDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELIEFDAMPER_VALUE = 12;

	/**
	 * The '<em><b>SMOKEDAMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMOKEDAMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOKEDAMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMOKEDAMPER_VALUE = 13;

	/**
	 * An array of all the '<em><b>Ifc Damper Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcDamperTypeEnum[] VALUES_ARRAY = new IfcDamperTypeEnum[] { NULL, CONTROLDAMPER,
			FUMEHOODEXHAUST, BALANCINGDAMPER, GRAVITYRELIEFDAMPER, USERDEFINED, FIREDAMPER, NOTDEFINED, GRAVITYDAMPER,
			BLASTDAMPER, BACKDRAFTDAMPER, FIRESMOKEDAMPER, RELIEFDAMPER, SMOKEDAMPER, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Damper Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcDamperTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Damper Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcDamperTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDamperTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Damper Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcDamperTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDamperTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Damper Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcDamperTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case CONTROLDAMPER_VALUE:
			return CONTROLDAMPER;
		case FUMEHOODEXHAUST_VALUE:
			return FUMEHOODEXHAUST;
		case BALANCINGDAMPER_VALUE:
			return BALANCINGDAMPER;
		case GRAVITYRELIEFDAMPER_VALUE:
			return GRAVITYRELIEFDAMPER;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case FIREDAMPER_VALUE:
			return FIREDAMPER;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case GRAVITYDAMPER_VALUE:
			return GRAVITYDAMPER;
		case BLASTDAMPER_VALUE:
			return BLASTDAMPER;
		case BACKDRAFTDAMPER_VALUE:
			return BACKDRAFTDAMPER;
		case FIRESMOKEDAMPER_VALUE:
			return FIRESMOKEDAMPER;
		case RELIEFDAMPER_VALUE:
			return RELIEFDAMPER;
		case SMOKEDAMPER_VALUE:
			return SMOKEDAMPER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcDamperTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IfcDamperTypeEnum
