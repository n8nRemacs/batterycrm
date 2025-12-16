package defpackage;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class wv1 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hw1 Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ o91 s0;
    public final /* synthetic */ jx0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv1(hw1 hw1Var, String str, o91 o91Var, jx0 jx0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = hw1Var;
        this.Z = str;
        this.s0 = o91Var;
        this.t0 = jx0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wv1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wv1 wv1Var = new wv1(this.Y, this.Z, this.s0, this.t0, continuation);
        wv1Var.X = obj;
        return wv1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        Object ipdVar;
        int i = this.o;
        hw1 hw1Var = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                wqi.c("CallEngineTag", "start creating p2p join link", new Object[0]);
                String str = this.Z;
                hwa hwaVar = (hwa) hw1Var.M0.getValue();
                wua wuaVar = new wua(xhb.J1, 22);
                wuaVar.x(ApiProtocol.PARAM_CONVERSATION_ID, str);
                this.o = 1;
                obj = hwaVar.F(wuaVar, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = (q51) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            yx1 yx1VarP = hw1Var.p();
            yx1VarP.getClass();
            yx1.d(yx1VarP, "CREATE_LINK_FAILED", null, null, null, null, null, true, 126);
            wqi.e("CallEngineTag", "fail creating p2p join link due to: " + thA.getMessage(), thA);
            hw1Var.R0 = null;
            this.s0.invoke();
        }
        if (!(ipdVar instanceof ipd)) {
            q51 q51Var = (q51) ipdVar;
            yx1 yx1VarP2 = hw1Var.p();
            yx1VarP2.getClass();
            yx1.d(yx1VarP2, "CREATED_GROUP_CALL_LINK", null, null, null, null, null, true, 126);
            wqi.c("CallEngineTag", "creating p2p join link was success", new Object[0]);
            hw1Var.R0 = null;
            hw1Var.d1.onJoinLinkUpdated(q51Var.c);
            this.t0.invoke(q51Var.c);
        }
        return qqg.a;
    }
}
