package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class r13 extends dtf implements sm6 {
    public final /* synthetic */ z13 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r13(z13 z13Var, Continuation continuation) {
        super(2, continuation);
        this.X = z13Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r13) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r13(this.X, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Long lValueOf;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z13 z13Var = this.X;
            wqi.c(z13Var.x0, "loadNext", new Object[0]);
            v03 v03Var = (v03) z13Var.v0.getValue();
            ?? r2 = v03Var.a;
            boolean z = v03Var.b;
            if (r2.isEmpty() && z) {
                this.o = 1;
                Object objD = z13Var.d(this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            } else if (!r2.isEmpty() && z) {
                nz5 nz5Var = new nz5(lee.g(new at(2, r2), new gf1(23)));
                if (nz5Var.hasNext()) {
                    lValueOf = Long.valueOf(((hs2) nz5Var.next()).w0);
                    while (nz5Var.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((hs2) nz5Var.next()).w0);
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                z13Var.f(lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
