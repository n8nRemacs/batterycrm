package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ha1 extends y0f {
    public final ExecutorService X;
    public final usd o;

    public ha1(usd usdVar, ExecutorService executorService) {
        super(executorService);
        this.o = usdVar;
        this.X = executorService;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k18] */
    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        ga1 ga1Var = (ga1) midVar;
        if (list.isEmpty()) {
            ga1Var.z((w37) this.d.f.get(i));
            return;
        }
        View view = ga1Var.a;
        nz5 nz5Var = new nz5(lee.g(new b26((zde) new at(2, list), (em6) new n8(22), (em6) nee.a), zx0.v0));
        while (nz5Var.hasNext()) {
            v37 v37Var = (v37) nz5Var.next();
            if (v37Var instanceof t37) {
                ((vu3) view).setTitle(((t37) v37Var).a);
            } else if (v37Var instanceof p37) {
                p37 p37Var = (p37) v37Var;
                boolean z = p37Var.d;
                long j = p37Var.a;
                if (z) {
                    vu3 vu3Var = (vu3) view;
                    vu3Var.C(j, null, null);
                    vu3Var.setAvatarOverlay((yd0) ga1Var.F0.getValue());
                } else {
                    vu3 vu3Var2 = (vu3) view;
                    vu3Var2.setAvatarOverlay(null);
                    CharSequence charSequence = p37Var.b;
                    String str = p37Var.c;
                    if (str == null) {
                        str = "";
                    }
                    vu3Var2.C(j, charSequence, str);
                }
            } else if (v37Var instanceof u37) {
                ((vu3) view).setTime(((u37) v37Var).a);
            } else if (v37Var instanceof s37) {
                ((vu3) view).B(((s37) v37Var).a);
            } else if (v37Var instanceof r37) {
                ((vu3) view).setDescription(((r37) v37Var).a);
            } else {
                if (!(v37Var instanceof q37)) {
                    throw new NoWhenBranchMatchedException();
                }
                vu3 vu3Var3 = (vu3) view;
                q37 q37Var = (q37) v37Var;
                vu3Var3.z(q37Var.a == 1);
                vu3Var3.A(q37Var.a == 2);
            }
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new ga1(new vu3(viewGroup.getContext()), this.o);
    }
}
