/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Nutzen;
import org.xtext.example.mydsl.myDsl.Ziel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ziel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ZielImpl#getZiel <em>Ziel</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ZielImpl#getNutzen <em>Nutzen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZielImpl extends MinimalEObjectImpl.Container implements Ziel
{
  /**
   * The default value of the '{@link #getZiel() <em>Ziel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZiel()
   * @generated
   * @ordered
   */
  protected static final String ZIEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZiel() <em>Ziel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZiel()
   * @generated
   * @ordered
   */
  protected String ziel = ZIEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getNutzen() <em>Nutzen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNutzen()
   * @generated
   * @ordered
   */
  protected EList<Nutzen> nutzen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ZielImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ZIEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getZiel()
  {
    return ziel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setZiel(String newZiel)
  {
    String oldZiel = ziel;
    ziel = newZiel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ZIEL__ZIEL, oldZiel, ziel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Nutzen> getNutzen()
  {
    if (nutzen == null)
    {
      nutzen = new EObjectContainmentEList<Nutzen>(Nutzen.class, this, MyDslPackage.ZIEL__NUTZEN);
    }
    return nutzen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ZIEL__NUTZEN:
        return ((InternalEList<?>)getNutzen()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ZIEL__ZIEL:
        return getZiel();
      case MyDslPackage.ZIEL__NUTZEN:
        return getNutzen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ZIEL__ZIEL:
        setZiel((String)newValue);
        return;
      case MyDslPackage.ZIEL__NUTZEN:
        getNutzen().clear();
        getNutzen().addAll((Collection<? extends Nutzen>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ZIEL__ZIEL:
        setZiel(ZIEL_EDEFAULT);
        return;
      case MyDslPackage.ZIEL__NUTZEN:
        getNutzen().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ZIEL__ZIEL:
        return ZIEL_EDEFAULT == null ? ziel != null : !ZIEL_EDEFAULT.equals(ziel);
      case MyDslPackage.ZIEL__NUTZEN:
        return nutzen != null && !nutzen.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (Ziel: ");
    result.append(ziel);
    result.append(')');
    return result.toString();
  }

} //ZielImpl
