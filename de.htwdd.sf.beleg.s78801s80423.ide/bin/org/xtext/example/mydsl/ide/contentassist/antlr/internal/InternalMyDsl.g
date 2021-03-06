/*
 * generated by Xtext 2.27.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGreetings
entryRuleGreetings
:
{ before(grammarAccess.getGreetingsRule()); }
	 ruleGreetings
{ after(grammarAccess.getGreetingsRule()); } 
	 EOF 
;

// Rule Greetings
ruleGreetings 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingsAccess().getPersonlistAssignment()); }
		(rule__Greetings__PersonlistAssignment)*
		{ after(grammarAccess.getGreetingsAccess().getPersonlistAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRolle
entryRuleRolle
:
{ before(grammarAccess.getRolleRule()); }
	 ruleRolle
{ after(grammarAccess.getRolleRule()); } 
	 EOF 
;

// Rule Rolle
ruleRolle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRolleAccess().getGroup()); }
		(rule__Rolle__Group__0)
		{ after(grammarAccess.getRolleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleZiel
entryRuleZiel
:
{ before(grammarAccess.getZielRule()); }
	 ruleZiel
{ after(grammarAccess.getZielRule()); } 
	 EOF 
;

// Rule Ziel
ruleZiel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getZielAccess().getGroup()); }
		(rule__Ziel__Group__0)
		{ after(grammarAccess.getZielAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNutzen
entryRuleNutzen
:
{ before(grammarAccess.getNutzenRule()); }
	 ruleNutzen
{ after(grammarAccess.getNutzenRule()); } 
	 EOF 
;

// Rule Nutzen
ruleNutzen 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNutzenAccess().getGroup()); }
		(rule__Nutzen__Group__0)
		{ after(grammarAccess.getNutzenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rolle__Group__0__Impl
	rule__Rolle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRolleAccess().getAlsKeyword_0()); }
	'Als'
	{ after(grammarAccess.getRolleAccess().getAlsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rolle__Group__1__Impl
	rule__Rolle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRolleAccess().getRolleAssignment_1()); }
	(rule__Rolle__RolleAssignment_1)
	{ after(grammarAccess.getRolleAccess().getRolleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rolle__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRolleAccess().getZielAssignment_2()); }
		(rule__Rolle__ZielAssignment_2)
		{ after(grammarAccess.getRolleAccess().getZielAssignment_2()); }
	)
	(
		{ before(grammarAccess.getRolleAccess().getZielAssignment_2()); }
		(rule__Rolle__ZielAssignment_2)*
		{ after(grammarAccess.getRolleAccess().getZielAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ziel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ziel__Group__0__Impl
	rule__Ziel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZielAccess().getM??chteIchKeyword_0()); }
	'm\u00F6chte ich'
	{ after(grammarAccess.getZielAccess().getM??chteIchKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ziel__Group__1__Impl
	rule__Ziel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZielAccess().getZielAssignment_1()); }
	(rule__Ziel__ZielAssignment_1)
	{ after(grammarAccess.getZielAccess().getZielAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ziel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getZielAccess().getNutzenAssignment_2()); }
		(rule__Ziel__NutzenAssignment_2)
		{ after(grammarAccess.getZielAccess().getNutzenAssignment_2()); }
	)
	(
		{ before(grammarAccess.getZielAccess().getNutzenAssignment_2()); }
		(rule__Ziel__NutzenAssignment_2)*
		{ after(grammarAccess.getZielAccess().getNutzenAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Nutzen__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nutzen__Group__0__Impl
	rule__Nutzen__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNutzenAccess().getUmKeyword_0()); }
	', um'
	{ after(grammarAccess.getNutzenAccess().getUmKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nutzen__Group__1__Impl
	rule__Nutzen__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNutzenAccess().getNutzenAssignment_1()); }
	(rule__Nutzen__NutzenAssignment_1)
	{ after(grammarAccess.getNutzenAccess().getNutzenAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nutzen__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNutzenAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getNutzenAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Greetings__PersonlistAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingsAccess().getPersonlistRolleParserRuleCall_0()); }
		ruleRolle
		{ after(grammarAccess.getGreetingsAccess().getPersonlistRolleParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__RolleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRolleAccess().getRolleIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRolleAccess().getRolleIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rolle__ZielAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRolleAccess().getZielZielParserRuleCall_2_0()); }
		ruleZiel
		{ after(grammarAccess.getRolleAccess().getZielZielParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__ZielAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZielAccess().getZielIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getZielAccess().getZielIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ziel__NutzenAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZielAccess().getNutzenNutzenParserRuleCall_2_0()); }
		ruleNutzen
		{ after(grammarAccess.getZielAccess().getNutzenNutzenParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nutzen__NutzenAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
