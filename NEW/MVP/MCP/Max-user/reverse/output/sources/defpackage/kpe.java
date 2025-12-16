package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class kpe extends y0f {
    public final awd o;

    public kpe(awd awdVar, ExecutorService executorService) {
        super(executorService);
        this.o = awdVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof jpe)) {
            d2fVar.z((t98) C(i));
            return;
        }
        jpe jpeVar = (jpe) d2fVar;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof l8e) {
            jpeVar.z(t98Var);
            roe roeVar = (roe) jpeVar.a;
            boolean z = ((l8e) t98Var).o instanceof doe;
            awd awdVar = this.o;
            if (z) {
                roeVar.setOnSwitchCheckedListener(new qk(20, awdVar));
            } else {
                roeVar.setOnSwitchListener(null);
            }
            f8j.d(roeVar, 300L, new wfe(awdVar, 3, (l8e) t98Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == gbb.A) {
            return new jpe(new roe(viewGroup.getContext(), 0));
        }
        if (i != gbb.z) {
            String name = kpe.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                }
            }
            return new v01(new View(viewGroup.getContext()), 17);
        }
        TextView textView = new TextView(viewGroup.getContext());
        float f = 16;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        dpg.q.b(textView, t75.b);
        tqi.c(new ipe(3, null, 0), textView);
        return new v01(textView, 16);
    }
}
