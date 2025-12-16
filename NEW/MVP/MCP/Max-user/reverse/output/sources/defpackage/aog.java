package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aog extends dtf implements sm6 {
    public final /* synthetic */ eog o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aog(eog eogVar, Continuation continuation) {
        super(2, continuation);
        this.o = eogVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aog aogVar = (aog) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aogVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aog(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        eog eogVar = this.o;
        up7 up7Var = eogVar.c;
        tp7 tp7Var = up7Var != null ? up7Var.c : null;
        if (tp7Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        tcf tcfVar = eogVar.t0;
        int i = ivd.a;
        n5g n5gVar = new n5g(r4d.oneme_settings_twofa_creation_email_verify_title);
        int i2 = r4d.oneme_settings_twofa_creation_email_verify_subtitle;
        String str = tp7Var.a;
        if (str == null) {
            str = "";
        }
        tcfVar.m(null, new kog(n5gVar, new p5g(i2, ys.D(new Object[]{str})), tp7Var.c));
        eogVar.v0.m(null, Long.valueOf(tp7Var.d));
        x9f x9fVar = eogVar.z0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        eogVar.z0 = null;
        eogVar.z0 = xfh.o(eogVar, null, new dog(eogVar, null), 3);
        return qqg.a;
    }
}
