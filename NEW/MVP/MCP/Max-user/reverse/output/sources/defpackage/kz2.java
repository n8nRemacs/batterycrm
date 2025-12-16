package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class kz2 extends dtf implements sm6 {
    public final /* synthetic */ sz2 X;
    public final /* synthetic */ k18 Y;
    public final /* synthetic */ k18 Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz2(sz2 sz2Var, k18 k18Var, k18 k18Var2, Continuation continuation) {
        super(2, continuation);
        this.X = sz2Var;
        this.Y = k18Var;
        this.Z = k18Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kz2 kz2Var = (kz2) l((o94) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kz2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kz2 kz2Var = new kz2(this.X, this.Y, this.Z, continuation);
        kz2Var.o = obj;
        return kz2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        sz2 sz2Var = this.X;
        ci5 ci5Var = sz2Var.y0;
        AtomicLong atomicLong = sz2Var.A0;
        g8j.b(obj);
        o94 o94Var = (o94) this.o;
        boolean z = o94Var instanceof m94;
        qqg qqgVar = qqg.a;
        if (z) {
            if (((m94) o94Var).a == atomicLong.get()) {
                xfh.r(sz2Var.z0, hz2.a);
                return qqgVar;
            }
        } else {
            if (!(o94Var instanceof n94)) {
                throw new NoWhenBranchMatchedException();
            }
            n94 n94Var = (n94) o94Var;
            long j = n94Var.a;
            long j2 = n94Var.b;
            if (j == atomicLong.get()) {
                sz2Var.C0.O(sz2Var, sz2.H0[1], xfh.o(sz2Var, ((q2b) ((lzf) this.Y.getValue())).b(), new jz2(sz2Var, o94Var, null), 2));
                gu5 gu5Var = (gu5) ((rt5) this.Z.getValue());
                gu5Var.getClass();
                if (gu5Var.j(PmsKey.f43editchanneltypescreenenabled, false)) {
                    xfh.r(ci5Var, new vy2(j2));
                    return qqgVar;
                }
                xfh.r(ci5Var, new uy2(j2));
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
