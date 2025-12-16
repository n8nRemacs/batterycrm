package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.rlottie.RLottieFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class p8 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p8(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((RecyclerView) this.c).getRecycledViewPool().getRecycledView(this.b);
            case 1:
                String str = (String) this.c;
                int i = this.b;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str, true, i, i, true), false, true, true, false, 18, null));
            case 2:
                cc5 cc5Var = (cc5) this.c;
                return svi.e((f84) cc5Var.f.getValue(), null, null, new bc5(this.b, cc5Var, null), 3);
            default:
                uc5 uc5Var = (uc5) this.c;
                ((Integer) obj).getClass();
                int i2 = 0;
                for (Object obj2 : ((rc5) uc5Var.t0.a.getValue()).b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ve3.p();
                        throw null;
                    }
                    t98 t98Var = (t98) obj2;
                    if (t98Var instanceof e62) {
                        int i4 = ((e62) t98Var).a;
                        int i5 = this.b;
                        if (i4 == i5) {
                            uc5Var.X.m(null, new sc5(i5, i2, 0, 4));
                        }
                    }
                    i2 = i3;
                }
                return qqg.a;
        }
    }
}
