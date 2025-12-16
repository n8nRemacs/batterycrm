package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mmc extends dtf implements sm6 {
    public final /* synthetic */ r30 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmc(r30 r30Var, Continuation continuation) {
        super(2, continuation);
        this.X = r30Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mmc mmcVar = (mmc) l((ku3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mmcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mmc mmcVar = new mmc(this.X, continuation);
        mmcVar.o = obj;
        return mmcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object e2cVar;
        g8j.b(obj);
        ku3 ku3Var = (ku3) this.o;
        String strR = ku3Var != null ? ku3Var.r(il0.c) : null;
        CharSequence charSequenceO = ku3Var != null ? ku3Var.o() : null;
        long jP = ku3Var != null ? ku3Var.p() : 0L;
        if (strR == null || strR.length() == 0) {
            if (charSequenceO == null || ((String) charSequenceO).length() == 0) {
                e2cVar = f2c.a;
            } else {
                if (charSequenceO == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e2cVar = new e2c(charSequenceO, jP);
            }
        } else {
            if (strR == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            e2cVar = new h2c(strR);
        }
        ((tcf) this.X.o).m(null, e2cVar);
        return qqg.a;
    }
}
