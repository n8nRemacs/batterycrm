package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class op3 extends dtf implements sm6 {
    public final /* synthetic */ vp3 X;
    public final /* synthetic */ k18 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op3(vp3 vp3Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = vp3Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        op3 op3Var = (op3) l((n5f) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        op3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        op3 op3Var = new op3(this.X, this.Y, continuation);
        op3Var.o = obj;
        return op3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        n5f n5fVar = (n5f) this.o;
        if (n5fVar instanceof l5f) {
            try {
                String str = this.X.o;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                int length2 = string.length() - 3;
                if (length2 < 3) {
                    length2 = 3;
                }
                ipdVar = "+" + vmf.O(string, 3, length2, dnf.o(length2 - 3, "*")).toString();
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            vp3 vp3Var = this.X;
            String str2 = vp3Var.o;
            if (ipdVar instanceof ipd) {
                ipdVar = str2;
            }
            String str3 = (String) ipdVar;
            l5f l5fVar = (l5f) n5fVar;
            oh8 oh8Var = l5fVar.a;
            if (oh8Var instanceof kh8) {
                if (!((kh8) oh8Var).d) {
                    ((j94) this.Y.getValue()).a(null, new rh8(wy1.j("Code: '", this.X.B0, "', Phone: '", str3, "'"), l5fVar.a.b));
                }
            } else if (oh8Var instanceof lh8) {
                ((j94) this.Y.getValue()).a(null, new rh8(str3));
            } else {
                if (!(oh8Var instanceof nh8)) {
                    throw new NoWhenBranchMatchedException();
                }
                xfh.r(vp3Var.w0, new bp3(str2));
            }
        }
        this.X.B0 = null;
        return qqg.a;
    }
}
