package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class noa extends y0f {
    public final mc5 o;

    public noa(mc5 mc5Var, ExecutorService executorService) {
        super(executorService);
        this.o = mc5Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof moa)) {
            d2fVar.z((t98) C(i));
            return;
        }
        moa moaVar = (moa) d2fVar;
        View view = moaVar.a;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof eoa) {
            moaVar.z(t98Var);
            boolean z = ((eoa) t98Var).o instanceof doe;
            mc5 mc5Var = this.o;
            if (z) {
                ((roe) view).setOnSwitchCheckedListener(new qk(14, mc5Var));
            } else {
                ((roe) view).setOnSwitchListener(null);
            }
            f8j.d(view, 300L, new kg6(mc5Var, 21, (eoa) t98Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == z7b.o) {
            return new moa(new roe(viewGroup.getContext(), 0));
        }
        if (i != z7b.n) {
            String name = noa.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                }
            }
            return new v01(new View(viewGroup.getContext()), 13);
        }
        TextView textView = new TextView(viewGroup.getContext());
        float f = 12;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        dpg.q.b(textView, t75.b);
        tqi.c(new x9(3, null, 26), textView);
        return new v01(textView, 12);
    }
}
