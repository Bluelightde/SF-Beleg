/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Greetings;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Nutzen;
import org.xtext.example.mydsl.myDsl.Rolle;
import org.xtext.example.mydsl.myDsl.Ziel;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.GREETINGS:
				sequence_Greetings(context, (Greetings) semanticObject); 
				return; 
			case MyDslPackage.NUTZEN:
				sequence_Nutzen(context, (Nutzen) semanticObject); 
				return; 
			case MyDslPackage.ROLLE:
				sequence_Rolle(context, (Rolle) semanticObject); 
				return; 
			case MyDslPackage.ZIEL:
				sequence_Ziel(context, (Ziel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Greetings returns Greetings
	 *
	 * Constraint:
	 *     personlist+=Rolle+
	 * </pre>
	 */
	protected void sequence_Greetings(ISerializationContext context, Greetings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Nutzen returns Nutzen
	 *
	 * Constraint:
	 *     Nutzen=ID
	 * </pre>
	 */
	protected void sequence_Nutzen(ISerializationContext context, Nutzen semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUTZEN__NUTZEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUTZEN__NUTZEN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0(), semanticObject.getNutzen());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rolle returns Rolle
	 *
	 * Constraint:
	 *     (Rolle=ID Ziel+=Ziel+)
	 * </pre>
	 */
	protected void sequence_Rolle(ISerializationContext context, Rolle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ziel returns Ziel
	 *
	 * Constraint:
	 *     (Ziel=ID Nutzen+=Nutzen+)
	 * </pre>
	 */
	protected void sequence_Ziel(ISerializationContext context, Ziel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
