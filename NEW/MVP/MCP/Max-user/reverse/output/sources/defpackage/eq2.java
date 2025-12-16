package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq2(int i, yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.o = i;
        this.X = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        eq2 eq2Var = (eq2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        eq2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eq2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        float fA;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        int i = this.o;
        if (i != 0 && (i == 4 || i == 1)) {
            wqi.c(this.X.w0, "Media viewer. Ignore reversed orientation", new Object[0]);
            return qqgVar;
        }
        if (i != 0) {
            int i2 = ojb.d;
            fA = s4j.a(i);
        } else {
            fA = 0.0f;
        }
        String str = this.X.w0;
        int i3 = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Media viewer. New orientation: " + vb9.l(i3) + ", angle: " + fA, null);
            }
        }
        this.X.f1.m(null, new jp2(this.o, fA));
        return qqgVar;
    }
}
