/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greetings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Greetings#getPersonlist <em>Personlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreetings()
 * @model
 * @generated
 */
public interface Greetings extends EObject
{
  /**
   * Returns the value of the '<em><b>Personlist</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Rolle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personlist</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreetings_Personlist()
   * @model containment="true"
   * @generated
   */
  EList<Rolle> getPersonlist();

} // Greetings