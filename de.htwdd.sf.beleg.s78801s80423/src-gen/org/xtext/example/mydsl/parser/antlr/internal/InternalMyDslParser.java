package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Greetings";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGreetings"
    // InternalMyDsl.g:64:1: entryRuleGreetings returns [EObject current=null] : iv_ruleGreetings= ruleGreetings EOF ;
    public final EObject entryRuleGreetings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreetings = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleGreetings= ruleGreetings EOF )
            // InternalMyDsl.g:65:2: iv_ruleGreetings= ruleGreetings EOF
            {
             newCompositeNode(grammarAccess.getGreetingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreetings=ruleGreetings();

            state._fsp--;

             current =iv_ruleGreetings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreetings"


    // $ANTLR start "ruleGreetings"
    // InternalMyDsl.g:71:1: ruleGreetings returns [EObject current=null] : ( (lv_personlist_0_0= ruleRolle ) )* ;
    public final EObject ruleGreetings() throws RecognitionException {
        EObject current = null;

        EObject lv_personlist_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_personlist_0_0= ruleRolle ) )* )
            // InternalMyDsl.g:78:2: ( (lv_personlist_0_0= ruleRolle ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_personlist_0_0= ruleRolle ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_personlist_0_0= ruleRolle )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_personlist_0_0= ruleRolle )
            	    // InternalMyDsl.g:80:4: lv_personlist_0_0= ruleRolle
            	    {

            	    				newCompositeNode(grammarAccess.getGreetingsAccess().getPersonlistRolleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_personlist_0_0=ruleRolle();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGreetingsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"personlist",
            	    					lv_personlist_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Rolle");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreetings"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:100:1: entryRuleRolle returns [EObject current=null] : iv_ruleRolle= ruleRolle EOF ;
    public final EObject entryRuleRolle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolle = null;


        try {
            // InternalMyDsl.g:100:46: (iv_ruleRolle= ruleRolle EOF )
            // InternalMyDsl.g:101:2: iv_ruleRolle= ruleRolle EOF
            {
             newCompositeNode(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolle=ruleRolle();

            state._fsp--;

             current =iv_ruleRolle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:107:1: ruleRolle returns [EObject current=null] : (otherlv_0= 'Als' ( (lv_Rolle_1_0= RULE_ID ) ) ( (lv_Ziel_2_0= ruleZiel ) )+ ) ;
    public final EObject ruleRolle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Rolle_1_0=null;
        EObject lv_Ziel_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Als' ( (lv_Rolle_1_0= RULE_ID ) ) ( (lv_Ziel_2_0= ruleZiel ) )+ ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Als' ( (lv_Rolle_1_0= RULE_ID ) ) ( (lv_Ziel_2_0= ruleZiel ) )+ )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Als' ( (lv_Rolle_1_0= RULE_ID ) ) ( (lv_Ziel_2_0= ruleZiel ) )+ )
            // InternalMyDsl.g:115:3: otherlv_0= 'Als' ( (lv_Rolle_1_0= RULE_ID ) ) ( (lv_Ziel_2_0= ruleZiel ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRolleAccess().getAlsKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_Rolle_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_Rolle_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_Rolle_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_Rolle_1_0= RULE_ID
            {
            lv_Rolle_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_Rolle_1_0, grammarAccess.getRolleAccess().getRolleIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRolleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Rolle",
            						lv_Rolle_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:137:3: ( (lv_Ziel_2_0= ruleZiel ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:138:4: (lv_Ziel_2_0= ruleZiel )
            	    {
            	    // InternalMyDsl.g:138:4: (lv_Ziel_2_0= ruleZiel )
            	    // InternalMyDsl.g:139:5: lv_Ziel_2_0= ruleZiel
            	    {

            	    					newCompositeNode(grammarAccess.getRolleAccess().getZielZielParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_Ziel_2_0=ruleZiel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRolleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Ziel",
            	    						lv_Ziel_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Ziel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalMyDsl.g:160:1: entryRuleZiel returns [EObject current=null] : iv_ruleZiel= ruleZiel EOF ;
    public final EObject entryRuleZiel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZiel = null;


        try {
            // InternalMyDsl.g:160:45: (iv_ruleZiel= ruleZiel EOF )
            // InternalMyDsl.g:161:2: iv_ruleZiel= ruleZiel EOF
            {
             newCompositeNode(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZiel=ruleZiel();

            state._fsp--;

             current =iv_ruleZiel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalMyDsl.g:167:1: ruleZiel returns [EObject current=null] : (otherlv_0= 'm\\u00F6chte ich' ( (lv_Ziel_1_0= RULE_ID ) ) ( (lv_Nutzen_2_0= ruleNutzen ) )+ ) ;
    public final EObject ruleZiel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Ziel_1_0=null;
        EObject lv_Nutzen_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:173:2: ( (otherlv_0= 'm\\u00F6chte ich' ( (lv_Ziel_1_0= RULE_ID ) ) ( (lv_Nutzen_2_0= ruleNutzen ) )+ ) )
            // InternalMyDsl.g:174:2: (otherlv_0= 'm\\u00F6chte ich' ( (lv_Ziel_1_0= RULE_ID ) ) ( (lv_Nutzen_2_0= ruleNutzen ) )+ )
            {
            // InternalMyDsl.g:174:2: (otherlv_0= 'm\\u00F6chte ich' ( (lv_Ziel_1_0= RULE_ID ) ) ( (lv_Nutzen_2_0= ruleNutzen ) )+ )
            // InternalMyDsl.g:175:3: otherlv_0= 'm\\u00F6chte ich' ( (lv_Ziel_1_0= RULE_ID ) ) ( (lv_Nutzen_2_0= ruleNutzen ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getZielAccess().getMöchteIchKeyword_0());
            		
            // InternalMyDsl.g:179:3: ( (lv_Ziel_1_0= RULE_ID ) )
            // InternalMyDsl.g:180:4: (lv_Ziel_1_0= RULE_ID )
            {
            // InternalMyDsl.g:180:4: (lv_Ziel_1_0= RULE_ID )
            // InternalMyDsl.g:181:5: lv_Ziel_1_0= RULE_ID
            {
            lv_Ziel_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_Ziel_1_0, grammarAccess.getZielAccess().getZielIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZielRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Ziel",
            						lv_Ziel_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:197:3: ( (lv_Nutzen_2_0= ruleNutzen ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:198:4: (lv_Nutzen_2_0= ruleNutzen )
            	    {
            	    // InternalMyDsl.g:198:4: (lv_Nutzen_2_0= ruleNutzen )
            	    // InternalMyDsl.g:199:5: lv_Nutzen_2_0= ruleNutzen
            	    {

            	    					newCompositeNode(grammarAccess.getZielAccess().getNutzenNutzenParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Nutzen_2_0=ruleNutzen();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getZielRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Nutzen",
            	    						lv_Nutzen_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Nutzen");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:220:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalMyDsl.g:220:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalMyDsl.g:221:2: iv_ruleNutzen= ruleNutzen EOF
            {
             newCompositeNode(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutzen=ruleNutzen();

            state._fsp--;

             current =iv_ruleNutzen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:227:1: ruleNutzen returns [EObject current=null] : (otherlv_0= ', um' ( (lv_Nutzen_1_0= RULE_ID ) ) otherlv_2= '.' ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Nutzen_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:233:2: ( (otherlv_0= ', um' ( (lv_Nutzen_1_0= RULE_ID ) ) otherlv_2= '.' ) )
            // InternalMyDsl.g:234:2: (otherlv_0= ', um' ( (lv_Nutzen_1_0= RULE_ID ) ) otherlv_2= '.' )
            {
            // InternalMyDsl.g:234:2: (otherlv_0= ', um' ( (lv_Nutzen_1_0= RULE_ID ) ) otherlv_2= '.' )
            // InternalMyDsl.g:235:3: otherlv_0= ', um' ( (lv_Nutzen_1_0= RULE_ID ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNutzenAccess().getUmKeyword_0());
            		
            // InternalMyDsl.g:239:3: ( (lv_Nutzen_1_0= RULE_ID ) )
            // InternalMyDsl.g:240:4: (lv_Nutzen_1_0= RULE_ID )
            {
            // InternalMyDsl.g:240:4: (lv_Nutzen_1_0= RULE_ID )
            // InternalMyDsl.g:241:5: lv_Nutzen_1_0= RULE_ID
            {
            lv_Nutzen_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_Nutzen_1_0, grammarAccess.getNutzenAccess().getNutzenIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nutzen",
            						lv_Nutzen_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNutzenAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNutzen"

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