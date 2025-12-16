package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class r9h extends dtf implements ym6 {
    public /* synthetic */ h5h X;
    public /* synthetic */ g5h Y;
    public /* synthetic */ boolean Z;
    public int o;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ x9h t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9h(x9h x9hVar, b66 b66Var) {
        super(5, b66Var);
        this.t0 = x9hVar;
    }

    @Override // defpackage.ym6
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, b66 b66Var) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        r9h r9hVar = new r9h(this.t0, b66Var);
        r9hVar.X = (h5h) obj;
        r9hVar.Y = (g5h) obj2;
        r9hVar.Z = zBooleanValue;
        r9hVar.s0 = zBooleanValue2;
        return r9hVar.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        x9h x9hVar = this.t0;
        tcf tcfVar = x9hVar.x0;
        lzf lzfVar = x9hVar.c;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            h5h h5hVar = this.X;
            g5h g5hVar = this.Y;
            boolean z2 = this.Z;
            boolean z3 = this.s0;
            if (!(g5hVar instanceof d5h)) {
                if (fni.a(g5hVar, e5h.a)) {
                    return new m9h(null, z3, (Bitmap) tcfVar.getValue());
                }
                if (!fni.a(g5hVar, f5h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l22 l22VarP = ((q8h) x9hVar.b).p();
                return (l22VarP == null || ((ah6) l22VarP).a.h() != 0) ? new j9h(h5hVar, z2) : new k9h(z2);
            }
            d5h d5hVar = (d5h) g5hVar;
            List list = d5hVar.a;
            yy7[] yy7VarArr = x9h.B0;
            if (!list.isEmpty()) {
                x9hVar.y0.O(x9hVar, x9h.B0[0], svi.d(x9hVar.a, ((q2b) lzfVar).b(), i84.b, new q9h(x9hVar, list, null)));
            }
            List list2 = d5hVar.a;
            this.X = null;
            this.Z = z3;
            this.o = 1;
            obj = svi.i(((q2b) lzfVar).b(), new p9h(x9hVar, list2, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
            z = z3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z;
            g8j.b(obj);
        }
        return new m9h((g2h) obj, z, (Bitmap) tcfVar.getValue());
    }
}
