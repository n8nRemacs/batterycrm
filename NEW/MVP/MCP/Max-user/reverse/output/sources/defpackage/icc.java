package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class icc extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jcc Y;
    public final /* synthetic */ fbc Z;
    public int o;
    public final /* synthetic */ cbc s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icc(jcc jccVar, fbc fbcVar, cbc cbcVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = jccVar;
        this.Z = fbcVar;
        this.s0 = cbcVar;
        this.t0 = str;
        this.u0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((icc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        icc iccVar = new icc(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
        iccVar.X = obj;
        return iccVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        nbc nbcVar;
        boolean z;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                xfh.r(this.Y.Y, gcc.a);
                jcc jccVar = this.Y;
                fbc fbcVar = this.Z;
                cbc cbcVar = this.s0;
                String str = this.t0;
                int i2 = this.u0;
                nbc nbcVar2 = jccVar.b;
                if (jccVar.X == i2) {
                    nbcVar = nbcVar2;
                    z = true;
                } else {
                    nbcVar = nbcVar2;
                    z = false;
                }
                ts9 ts9Var = new ts9(1, jccVar, jcc.class, "mapAndNotifyEvent", "mapAndNotifyEvent(Lone/me/profile/screens/avatars/ProfileAvatars$Event;)V", 0, 8);
                this.o = 1;
                if (nbcVar.e(fbcVar, cbcVar, str, z, ts9Var, this) == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = qqgVar;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            Throwable thA = kpd.a(ipdVar);
            if (!(thA instanceof CancellationException)) {
                wqi.e(this.Y.c, "action " + this.Z + ": failed", thA);
                s5g s5gVar = this.Z.c;
                if (s5gVar != null) {
                    xfh.r(this.Y.Y, new dcc(s5gVar, true));
                }
            }
        } else {
            s5g s5gVar2 = this.Z.b;
            if (s5gVar2 != null) {
                xfh.r(this.Y.Y, new dcc(s5gVar2, false));
            }
        }
        xfh.r(this.Y.Y, ccc.a);
        return qqgVar;
    }
}
