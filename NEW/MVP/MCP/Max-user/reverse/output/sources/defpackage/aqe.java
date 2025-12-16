package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class aqe extends y0f {
    public final n4e o;

    public aqe(n4e n4eVar, ExecutorService executorService) {
        super(executorService);
        this.o = n4eVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof zpe)) {
            d2fVar.z((t98) C(i));
            return;
        }
        zpe zpeVar = (zpe) d2fVar;
        View view = zpeVar.a;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof d8e) {
            zpeVar.z(t98Var);
            boolean z = ((d8e) t98Var).u0;
            n4e n4eVar = this.o;
            if (z) {
                ((roe) view).setEnabled(true);
                f8j.d(view, 300L, new wfe(n4eVar, 4, (d8e) t98Var));
            } else {
                ((roe) view).setEnabled(false);
                view.setOnClickListener(null);
            }
            ((roe) view).setOnSwitchCheckedListener(new qk(21, n4eVar));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == kbb.x) {
            return new zpe(new roe(viewGroup.getContext(), 0));
        }
        if (i == kbb.w) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = 16;
            textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            dpg.q.b(textView, t75.b);
            tqi.c(new ipe(3, null, 1), textView);
            return new v01(textView, 18);
        }
        if (i != kbb.y) {
            String name = aqe.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                }
            }
            return new v01(new View(viewGroup.getContext()), 20);
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        textView2.setLayoutParams(new xhd(-1, -2));
        textView2.setGravity(17);
        int iD = kti.d(15 * vw4.d().getDisplayMetrics().density);
        float f2 = 12;
        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), iD, kti.d(f2 * vw4.d().getDisplayMetrics().density), iD);
        dpg.G.b(textView2, t75.b);
        tqi.c(new ipe(3, null, 2), textView2);
        return new v01(textView2, 19);
    }
}
