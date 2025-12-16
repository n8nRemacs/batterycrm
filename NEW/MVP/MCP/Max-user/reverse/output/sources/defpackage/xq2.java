package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq2(yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.o = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xq2 xq2Var = (xq2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xq2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xq2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        g8j.b(obj);
        int i = ((jp2) this.o.f1.getValue()).a;
        if (i == 0 || !(i == 2 || i == 1)) {
            int i2 = ojb.d;
            float fA = s4j.a(2);
            String str = this.o.w0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Media viewer. New orientation by toggle: landscape, angle: " + fA, null);
            }
            this.o.f1.m(null, new jp2(2, fA));
        } else {
            int i3 = ojb.d;
            float fA2 = s4j.a(3);
            String str2 = this.o.w0;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, "Media viewer. New orientation by toggle: portrait, angle: " + fA2, null);
            }
            this.o.f1.m(null, new jp2(3, fA2));
        }
        return qqg.a;
    }
}
