package defpackage;

import android.os.SystemClock;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* loaded from: classes.dex */
public final class bw1 extends dtf implements sm6 {
    public final /* synthetic */ ek1 X;
    public final /* synthetic */ hw1 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(ek1 ek1Var, hw1 hw1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ek1Var;
        this.Y = hw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bw1 bw1Var = (bw1) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bw1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bw1 bw1Var = new bw1(this.X, this.Y, continuation);
        bw1Var.o = obj;
        return bw1Var;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [zv1] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Conversation conversationA;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        final f84 f84Var = (f84) this.o;
        if (this.X.b != 0 && !((gu5) ((rt5) this.Y.F0.getValue())).u()) {
            wqi.c("CallEngineTag", "ignore group call push=" + this.X, new Object[0]);
            return qqgVar;
        }
        this.Y.p().d = rx1.b;
        this.Y.p().f = 1;
        this.Y.o().b(true);
        jx1 jx1VarO = this.Y.o();
        arb arbVar = arb.INCOMING_CALL_PROCESSING_INIT;
        jx1VarO.c().getClass();
        jx1VarO.c.m(arbVar, new zqb(arbVar, SystemClock.elapsedRealtime()));
        ek1 ek1Var = this.X;
        String str = ek1Var.c;
        long j = ek1Var.a;
        wqi.c("CallEngineTag", "showIncomingCall push=" + ek1Var, new Object[0]);
        if (((qv3) this.Y.J0.getValue()).m(j)) {
            svi.e(f84Var, ((q2b) ((lzf) this.Y.C0.getValue())).a(), null, new aw1(this.Y, j, null), 2);
        }
        Conversation conversationA2 = this.Y.q().a();
        boolean z = conversationA2 == null || !conversationA2.isDestroyed();
        Conversation conversationA3 = this.Y.q().a();
        boolean zIsAnswered = conversationA3 != null ? conversationA3.isAnswered() : false;
        mb4 mb4VarK = this.Y.k();
        hw1 hw1Var = this.Y;
        ek1 ek1Var2 = this.X;
        String str2 = mb4VarK.c;
        gxi gxiVar = mb4VarK.a;
        kr1 kr1Var = gxiVar instanceof kr1 ? (kr1) gxiVar : null;
        Long l = kr1Var != null ? new Long(kr1Var.a) : null;
        String str3 = mb4VarK.c;
        if (str3 != null && !vmf.F(str3)) {
            if (fni.a(str2, str) && z) {
                wqi.q("CallEngineTag", f84Var + " ignore repetitive push " + str + " current id " + str2, new Object[0]);
                hw1Var.o().d(1);
                return qqgVar;
            }
            if (z && l != null && j == l.longValue() && (conversationA = hw1Var.q().a()) != null && conversationA.isCaller()) {
                wqi.c("CallEngineTag", f84Var + " same incoming call userId=" + j + " answered=" + zIsAnswered, new Object[0]);
                hw1Var.o().d(2);
                if (!zIsAnswered) {
                    gxi gxiVar2 = mb4VarK.a;
                    hw1Var.f(gxiVar2 != null ? gxiVar2.a() : false);
                }
                hw1Var.p().f = 6;
                return qqgVar;
            }
            if (!fni.a(str2, str)) {
                wqi.c("CallEngineTag", f84Var + " ignore incoming conversation " + str + " we have an active one=" + str2 + " " + ek1Var2, new Object[0]);
                hw1Var.F(str, null, ek1Var2.f);
                hw1Var.o().d(3);
                ow1.a(hw1Var.c).hangup(m07.b, str);
                return qqgVar;
            }
        }
        wqi.c("CallEngineTag", f84Var + " create conversation for answer " + this.X, new Object[0]);
        this.Y.o().d(0);
        this.Y.j(this.X);
        final uid uidVar = new uid();
        final p51 p51Var = this.Y.b;
        if (str == null) {
            str = null;
        }
        ek1 ek1Var3 = this.X;
        String str4 = ek1Var3.g;
        long j2 = ek1Var3.a;
        final ek1 ek1Var4 = this.X;
        boolean z2 = ek1Var4.f;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final cl clVar = new cl();
        clVar.a = j2;
        clVar.b = str;
        clVar.c = str4;
        final hw1 hw1Var2 = this.Y;
        final ?? r12 = new em6() { // from class: zv1
            @Override // defpackage.em6
            public final Object invoke(Object obj2) {
                f84 f84Var2 = f84Var;
                hw1 hw1Var3 = hw1Var2;
                ek1 ek1Var5 = ek1Var4;
                uid uidVar2 = uidVar;
                wqi.c("CallEngineTag", f84Var2 + " conversation for answer is created " + ((Conversation) obj2).getConversationId(), new Object[0]);
                hw1Var3.p().f = 2;
                hw1Var3.F(ek1Var5.c, null, ek1Var5.f);
                o51 o51Var = (o51) uidVar2.a;
                if (o51Var != null) {
                    hw1Var3.h(o51Var);
                }
                return qqg.a;
            }
        };
        final ia iaVar = new ia(hw1Var2, 3, ek1Var4);
        final long jC = p51Var.c();
        o51 o51Var = new o51(ow1.a(p51Var.a).answer(new em6() { // from class: n51
            @Override // defpackage.em6
            public final Object invoke(Object obj2) {
                cl clVar2 = clVar;
                AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj2).setOpponentId(knb.b(clVar2.a));
                String str5 = clVar2.c;
                if (str5 != null) {
                    opponentId.setConversationParams(str5);
                }
                return opponentId.setConversationId(clVar2.b).setMyId(knb.b(jC)).setEventListener((ConversationEventsListener) p51Var.b.getValue()).setOnPrepared((em6) r12).setOnError((em6) iaVar).build();
            }
        }), new kr1(j2, z2), true, true);
        this.Y.i(o51Var);
        uidVar.a = o51Var;
        return qqgVar;
    }
}
