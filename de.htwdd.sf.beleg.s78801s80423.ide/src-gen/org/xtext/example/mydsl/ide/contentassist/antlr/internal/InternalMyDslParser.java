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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Als'", "'m\\u00F6chte ich'", "', um'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


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



    // $ANTLR start "entryRuleGreetings"
    // InternalMyDsl.g:53:1: entryRuleGreetings : ruleGreetings EOF ;
    public final void entryRuleGreetings() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleGreetings EOF )
            // InternalMyDsl.g:55:1: ruleGreetings EOF
            {
             before(grammarAccess.getGreetingsRule()); 
            pushFollow(FOLLOW_1);
            ruleGreetings();

            state._fsp--;

             after(grammarAccess.getGreetingsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreetings"


    // $ANTLR start "ruleGreetings"
    // InternalMyDsl.g:62:1: ruleGreetings : ( ( rule__Greetings__PersonlistAssignment )* ) ;
    public final void ruleGreetings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Greetings__PersonlistAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Greetings__PersonlistAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Greetings__PersonlistAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Greetings__PersonlistAssignment )*
            {
             before(grammarAccess.getGreetingsAccess().getPersonlistAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Greetings__PersonlistAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Greetings__PersonlistAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Greetings__PersonlistAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGreetingsAccess().getPersonlistAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreetings"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:78:1: entryRuleRolle : ruleRolle EOF ;
    public final void entryRuleRolle() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRolle EOF )
            // InternalMyDsl.g:80:1: ruleRolle EOF
            {
             before(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getRolleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:87:1: ruleRolle : ( ( rule__Rolle__Group__0 ) ) ;
    public final void ruleRolle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Rolle__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Rolle__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Rolle__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Rolle__Group__0 )
            {
             before(grammarAccess.getRolleAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Rolle__Group__0 )
            // InternalMyDsl.g:94:4: rule__Rolle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalMyDsl.g:103:1: entryRuleZiel : ruleZiel EOF ;
    public final void entryRuleZiel() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleZiel EOF )
            // InternalMyDsl.g:105:1: ruleZiel EOF
            {
             before(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getZielRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalMyDsl.g:112:1: ruleZiel : ( ( rule__Ziel__Group__0 ) ) ;
    public final void ruleZiel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Ziel__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Ziel__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Ziel__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Ziel__Group__0 )
            {
             before(grammarAccess.getZielAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Ziel__Group__0 )
            // InternalMyDsl.g:119:4: rule__Ziel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:128:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleNutzen EOF )
            // InternalMyDsl.g:130:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:137:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Nutzen__Group__0 )
            // InternalMyDsl.g:144:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "rule__Rolle__Group__0"
    // InternalMyDsl.g:152:1: rule__Rolle__Group__0 : rule__Rolle__Group__0__Impl rule__Rolle__Group__1 ;
    public final void rule__Rolle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Rolle__Group__0__Impl rule__Rolle__Group__1 )
            // InternalMyDsl.g:157:2: rule__Rolle__Group__0__Impl rule__Rolle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rolle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rolle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__0"


    // $ANTLR start "rule__Rolle__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__Rolle__Group__0__Impl : ( 'Als' ) ;
    public final void rule__Rolle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( 'Als' ) )
            // InternalMyDsl.g:169:1: ( 'Als' )
            {
            // InternalMyDsl.g:169:1: ( 'Als' )
            // InternalMyDsl.g:170:2: 'Als'
            {
             before(grammarAccess.getRolleAccess().getAlsKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRolleAccess().getAlsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__0__Impl"


    // $ANTLR start "rule__Rolle__Group__1"
    // InternalMyDsl.g:179:1: rule__Rolle__Group__1 : rule__Rolle__Group__1__Impl rule__Rolle__Group__2 ;
    public final void rule__Rolle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Rolle__Group__1__Impl rule__Rolle__Group__2 )
            // InternalMyDsl.g:184:2: rule__Rolle__Group__1__Impl rule__Rolle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rolle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rolle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__1"


    // $ANTLR start "rule__Rolle__Group__1__Impl"
    // InternalMyDsl.g:191:1: rule__Rolle__Group__1__Impl : ( ( rule__Rolle__RolleAssignment_1 ) ) ;
    public final void rule__Rolle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:195:1: ( ( ( rule__Rolle__RolleAssignment_1 ) ) )
            // InternalMyDsl.g:196:1: ( ( rule__Rolle__RolleAssignment_1 ) )
            {
            // InternalMyDsl.g:196:1: ( ( rule__Rolle__RolleAssignment_1 ) )
            // InternalMyDsl.g:197:2: ( rule__Rolle__RolleAssignment_1 )
            {
             before(grammarAccess.getRolleAccess().getRolleAssignment_1()); 
            // InternalMyDsl.g:198:2: ( rule__Rolle__RolleAssignment_1 )
            // InternalMyDsl.g:198:3: rule__Rolle__RolleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__RolleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getRolleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__1__Impl"


    // $ANTLR start "rule__Rolle__Group__2"
    // InternalMyDsl.g:206:1: rule__Rolle__Group__2 : rule__Rolle__Group__2__Impl ;
    public final void rule__Rolle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Rolle__Group__2__Impl )
            // InternalMyDsl.g:211:2: rule__Rolle__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__2"


    // $ANTLR start "rule__Rolle__Group__2__Impl"
    // InternalMyDsl.g:217:1: rule__Rolle__Group__2__Impl : ( ( ( rule__Rolle__ZielAssignment_2 ) ) ( ( rule__Rolle__ZielAssignment_2 )* ) ) ;
    public final void rule__Rolle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:221:1: ( ( ( ( rule__Rolle__ZielAssignment_2 ) ) ( ( rule__Rolle__ZielAssignment_2 )* ) ) )
            // InternalMyDsl.g:222:1: ( ( ( rule__Rolle__ZielAssignment_2 ) ) ( ( rule__Rolle__ZielAssignment_2 )* ) )
            {
            // InternalMyDsl.g:222:1: ( ( ( rule__Rolle__ZielAssignment_2 ) ) ( ( rule__Rolle__ZielAssignment_2 )* ) )
            // InternalMyDsl.g:223:2: ( ( rule__Rolle__ZielAssignment_2 ) ) ( ( rule__Rolle__ZielAssignment_2 )* )
            {
            // InternalMyDsl.g:223:2: ( ( rule__Rolle__ZielAssignment_2 ) )
            // InternalMyDsl.g:224:3: ( rule__Rolle__ZielAssignment_2 )
            {
             before(grammarAccess.getRolleAccess().getZielAssignment_2()); 
            // InternalMyDsl.g:225:3: ( rule__Rolle__ZielAssignment_2 )
            // InternalMyDsl.g:225:4: rule__Rolle__ZielAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Rolle__ZielAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getZielAssignment_2()); 

            }

            // InternalMyDsl.g:228:2: ( ( rule__Rolle__ZielAssignment_2 )* )
            // InternalMyDsl.g:229:3: ( rule__Rolle__ZielAssignment_2 )*
            {
             before(grammarAccess.getRolleAccess().getZielAssignment_2()); 
            // InternalMyDsl.g:230:3: ( rule__Rolle__ZielAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:230:4: rule__Rolle__ZielAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Rolle__ZielAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRolleAccess().getZielAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__Group__2__Impl"


    // $ANTLR start "rule__Ziel__Group__0"
    // InternalMyDsl.g:240:1: rule__Ziel__Group__0 : rule__Ziel__Group__0__Impl rule__Ziel__Group__1 ;
    public final void rule__Ziel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:244:1: ( rule__Ziel__Group__0__Impl rule__Ziel__Group__1 )
            // InternalMyDsl.g:245:2: rule__Ziel__Group__0__Impl rule__Ziel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ziel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0"


    // $ANTLR start "rule__Ziel__Group__0__Impl"
    // InternalMyDsl.g:252:1: rule__Ziel__Group__0__Impl : ( 'm\\u00F6chte ich' ) ;
    public final void rule__Ziel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( 'm\\u00F6chte ich' ) )
            // InternalMyDsl.g:257:1: ( 'm\\u00F6chte ich' )
            {
            // InternalMyDsl.g:257:1: ( 'm\\u00F6chte ich' )
            // InternalMyDsl.g:258:2: 'm\\u00F6chte ich'
            {
             before(grammarAccess.getZielAccess().getMöchteIchKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getZielAccess().getMöchteIchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0__Impl"


    // $ANTLR start "rule__Ziel__Group__1"
    // InternalMyDsl.g:267:1: rule__Ziel__Group__1 : rule__Ziel__Group__1__Impl rule__Ziel__Group__2 ;
    public final void rule__Ziel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:271:1: ( rule__Ziel__Group__1__Impl rule__Ziel__Group__2 )
            // InternalMyDsl.g:272:2: rule__Ziel__Group__1__Impl rule__Ziel__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Ziel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1"


    // $ANTLR start "rule__Ziel__Group__1__Impl"
    // InternalMyDsl.g:279:1: rule__Ziel__Group__1__Impl : ( ( rule__Ziel__ZielAssignment_1 ) ) ;
    public final void rule__Ziel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( ( ( rule__Ziel__ZielAssignment_1 ) ) )
            // InternalMyDsl.g:284:1: ( ( rule__Ziel__ZielAssignment_1 ) )
            {
            // InternalMyDsl.g:284:1: ( ( rule__Ziel__ZielAssignment_1 ) )
            // InternalMyDsl.g:285:2: ( rule__Ziel__ZielAssignment_1 )
            {
             before(grammarAccess.getZielAccess().getZielAssignment_1()); 
            // InternalMyDsl.g:286:2: ( rule__Ziel__ZielAssignment_1 )
            // InternalMyDsl.g:286:3: rule__Ziel__ZielAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__ZielAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getZielAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1__Impl"


    // $ANTLR start "rule__Ziel__Group__2"
    // InternalMyDsl.g:294:1: rule__Ziel__Group__2 : rule__Ziel__Group__2__Impl ;
    public final void rule__Ziel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:1: ( rule__Ziel__Group__2__Impl )
            // InternalMyDsl.g:299:2: rule__Ziel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__2"


    // $ANTLR start "rule__Ziel__Group__2__Impl"
    // InternalMyDsl.g:305:1: rule__Ziel__Group__2__Impl : ( ( ( rule__Ziel__NutzenAssignment_2 ) ) ( ( rule__Ziel__NutzenAssignment_2 )* ) ) ;
    public final void rule__Ziel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:309:1: ( ( ( ( rule__Ziel__NutzenAssignment_2 ) ) ( ( rule__Ziel__NutzenAssignment_2 )* ) ) )
            // InternalMyDsl.g:310:1: ( ( ( rule__Ziel__NutzenAssignment_2 ) ) ( ( rule__Ziel__NutzenAssignment_2 )* ) )
            {
            // InternalMyDsl.g:310:1: ( ( ( rule__Ziel__NutzenAssignment_2 ) ) ( ( rule__Ziel__NutzenAssignment_2 )* ) )
            // InternalMyDsl.g:311:2: ( ( rule__Ziel__NutzenAssignment_2 ) ) ( ( rule__Ziel__NutzenAssignment_2 )* )
            {
            // InternalMyDsl.g:311:2: ( ( rule__Ziel__NutzenAssignment_2 ) )
            // InternalMyDsl.g:312:3: ( rule__Ziel__NutzenAssignment_2 )
            {
             before(grammarAccess.getZielAccess().getNutzenAssignment_2()); 
            // InternalMyDsl.g:313:3: ( rule__Ziel__NutzenAssignment_2 )
            // InternalMyDsl.g:313:4: rule__Ziel__NutzenAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Ziel__NutzenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getNutzenAssignment_2()); 

            }

            // InternalMyDsl.g:316:2: ( ( rule__Ziel__NutzenAssignment_2 )* )
            // InternalMyDsl.g:317:3: ( rule__Ziel__NutzenAssignment_2 )*
            {
             before(grammarAccess.getZielAccess().getNutzenAssignment_2()); 
            // InternalMyDsl.g:318:3: ( rule__Ziel__NutzenAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:318:4: rule__Ziel__NutzenAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Ziel__NutzenAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getZielAccess().getNutzenAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__2__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalMyDsl.g:328:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalMyDsl.g:333:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalMyDsl.g:340:1: rule__Nutzen__Group__0__Impl : ( ', um' ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:344:1: ( ( ', um' ) )
            // InternalMyDsl.g:345:1: ( ', um' )
            {
            // InternalMyDsl.g:345:1: ( ', um' )
            // InternalMyDsl.g:346:2: ', um'
            {
             before(grammarAccess.getNutzenAccess().getUmKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getUmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalMyDsl.g:355:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2 ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2 )
            // InternalMyDsl.g:360:2: rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalMyDsl.g:367:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__NutzenAssignment_1 ) ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( ( rule__Nutzen__NutzenAssignment_1 ) ) )
            // InternalMyDsl.g:372:1: ( ( rule__Nutzen__NutzenAssignment_1 ) )
            {
            // InternalMyDsl.g:372:1: ( ( rule__Nutzen__NutzenAssignment_1 ) )
            // InternalMyDsl.g:373:2: ( rule__Nutzen__NutzenAssignment_1 )
            {
             before(grammarAccess.getNutzenAccess().getNutzenAssignment_1()); 
            // InternalMyDsl.g:374:2: ( rule__Nutzen__NutzenAssignment_1 )
            // InternalMyDsl.g:374:3: rule__Nutzen__NutzenAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__NutzenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getNutzenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__Nutzen__Group__2"
    // InternalMyDsl.g:382:1: rule__Nutzen__Group__2 : rule__Nutzen__Group__2__Impl ;
    public final void rule__Nutzen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( rule__Nutzen__Group__2__Impl )
            // InternalMyDsl.g:387:2: rule__Nutzen__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__2"


    // $ANTLR start "rule__Nutzen__Group__2__Impl"
    // InternalMyDsl.g:393:1: rule__Nutzen__Group__2__Impl : ( '.' ) ;
    public final void rule__Nutzen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( '.' ) )
            // InternalMyDsl.g:398:1: ( '.' )
            {
            // InternalMyDsl.g:398:1: ( '.' )
            // InternalMyDsl.g:399:2: '.'
            {
             before(grammarAccess.getNutzenAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__2__Impl"


    // $ANTLR start "rule__Greetings__PersonlistAssignment"
    // InternalMyDsl.g:409:1: rule__Greetings__PersonlistAssignment : ( ruleRolle ) ;
    public final void rule__Greetings__PersonlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( ruleRolle ) )
            // InternalMyDsl.g:414:2: ( ruleRolle )
            {
            // InternalMyDsl.g:414:2: ( ruleRolle )
            // InternalMyDsl.g:415:3: ruleRolle
            {
             before(grammarAccess.getGreetingsAccess().getPersonlistRolleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getGreetingsAccess().getPersonlistRolleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greetings__PersonlistAssignment"


    // $ANTLR start "rule__Rolle__RolleAssignment_1"
    // InternalMyDsl.g:424:1: rule__Rolle__RolleAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rolle__RolleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:429:2: ( RULE_ID )
            {
            // InternalMyDsl.g:429:2: ( RULE_ID )
            // InternalMyDsl.g:430:3: RULE_ID
            {
             before(grammarAccess.getRolleAccess().getRolleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRolleAccess().getRolleIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__RolleAssignment_1"


    // $ANTLR start "rule__Rolle__ZielAssignment_2"
    // InternalMyDsl.g:439:1: rule__Rolle__ZielAssignment_2 : ( ruleZiel ) ;
    public final void rule__Rolle__ZielAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ruleZiel ) )
            // InternalMyDsl.g:444:2: ( ruleZiel )
            {
            // InternalMyDsl.g:444:2: ( ruleZiel )
            // InternalMyDsl.g:445:3: ruleZiel
            {
             before(grammarAccess.getRolleAccess().getZielZielParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getRolleAccess().getZielZielParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__ZielAssignment_2"


    // $ANTLR start "rule__Ziel__ZielAssignment_1"
    // InternalMyDsl.g:454:1: rule__Ziel__ZielAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ziel__ZielAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:459:2: ( RULE_ID )
            {
            // InternalMyDsl.g:459:2: ( RULE_ID )
            // InternalMyDsl.g:460:3: RULE_ID
            {
             before(grammarAccess.getZielAccess().getZielIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getZielAccess().getZielIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__ZielAssignment_1"


    // $ANTLR start "rule__Ziel__NutzenAssignment_2"
    // InternalMyDsl.g:469:1: rule__Ziel__NutzenAssignment_2 : ( ruleNutzen ) ;
    public final void rule__Ziel__NutzenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ruleNutzen ) )
            // InternalMyDsl.g:474:2: ( ruleNutzen )
            {
            // InternalMyDsl.g:474:2: ( ruleNutzen )
            // InternalMyDsl.g:475:3: ruleNutzen
            {
             before(grammarAccess.getZielAccess().getNutzenNutzenParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getZielAccess().getNutzenNutzenParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__NutzenAssignment_2"


    // $ANTLR start "rule__Nutzen__NutzenAssignment_1"
    // InternalMyDsl.g:484:1: rule__Nutzen__NutzenAssignment_1 : ( RULE_ID ) ;
    public final void rule__Nutzen__NutzenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:489:2: ( RULE_ID )
            {
            // InternalMyDsl.g:489:2: ( RULE_ID )
            // InternalMyDsl.g:490:3: RULE_ID
            {
             before(grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__NutzenAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});

}