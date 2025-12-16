package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kn7 extends dtf implements sm6 {
    public final /* synthetic */ yn7 X;
    public final /* synthetic */ k18 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn7(yn7 yn7Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = yn7Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kn7 kn7Var = (kn7) l((oh8) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kn7 kn7Var = new kn7(this.X, this.Y, continuation);
        kn7Var.o = obj;
        return kn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        oh8 oh8Var = (oh8) this.o;
        yn7 yn7Var = this.X;
        int i = ((x2b) yn7Var.x0.getValue()).b;
        String strO = dnf.o(6, "*");
        String str = (String) yn7Var.E0.getValue();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String str2 = "'+" + i + strO + vmf.a0(4, sb.toString()) + "'";
        boolean z = oh8Var instanceof kh8;
        k18 k18Var = this.Y;
        if (z) {
            kh8 kh8Var = (kh8) oh8Var;
            if (!kh8Var.d) {
                ((j94) k18Var.getValue()).a(null, new rh8(wy1.h("Phone: ", str2), kh8Var.b));
            }
        } else if (oh8Var instanceof lh8) {
            ((j94) k18Var.getValue()).a(null, new rh8(str2));
        } else if (oh8Var != null && !(oh8Var instanceof nh8)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqg.a;
    }
}
