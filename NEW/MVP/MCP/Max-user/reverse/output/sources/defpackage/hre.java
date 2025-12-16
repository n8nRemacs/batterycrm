package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class hre extends y0f {
    public final kme o;

    public hre(kme kmeVar, ExecutorService executorService) {
        super(executorService);
        this.o = kmeVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof gre)) {
            d2fVar.z((t98) C(i));
            return;
        }
        gre greVar = (gre) d2fVar;
        View view = greVar.a;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof t8e) {
            greVar.z(t98Var);
            t8e t8eVar = (t8e) t98Var;
            kme kmeVar = this.o;
            f8j.d(view, 300L, new wfe(kmeVar, 5, t8eVar));
            if (((t8e) t98Var).Z) {
                ((roe) view).setOnLongClickListener(new yi2(kmeVar, greVar, t8eVar, 8));
            } else {
                ((roe) view).setOnLongClickListener(null);
            }
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == qbb.e) {
            return new gre(new roe(viewGroup.getContext(), 0));
        }
        if (i == qbb.d) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = 12;
            textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            dpg.q.b(textView, t75.b);
            tqi.c(new ipe(3, null, 4), textView);
            return new v01(textView, 22);
        }
        if (i != qbb.a) {
            String name = hre.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                }
            }
            return new v01(new View(viewGroup.getContext()), 23);
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        float f2 = 12;
        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), textView2.getPaddingTop(), kti.d(f2 * vw4.d().getDisplayMetrics().density), textView2.getPaddingBottom());
        dpg.j.b(textView2, t75.b);
        tqi.c(new ipe(3, null, 3), textView2);
        return new v01(textView2, 21);
    }
}
