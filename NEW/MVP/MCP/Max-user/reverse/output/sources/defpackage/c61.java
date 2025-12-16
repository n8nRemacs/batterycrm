package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class c61 extends y0f {
    public final h08 o;

    public c61(h08 h08Var, ExecutorService executorService) {
        super(executorService);
        this.o = h08Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof b61)) {
            d2fVar.z((t98) C(i));
            return;
        }
        b61 b61Var = (b61) d2fVar;
        View view = b61Var.a;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof g61) {
            roe roeVar = (roe) view;
            roeVar.setThemeDepended(noe.b);
            b61Var.z(t98Var);
            ((g61) t98Var).getClass();
            roeVar.setEnabled(true);
            h08 h08Var = this.o;
            f8j.d(view, 300L, new ub(h08Var, 3, (g61) t98Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == j0b.G) {
            return new b61(new roe(viewGroup.getContext(), 0));
        }
        if (i != j0b.F) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        TextView textView = new TextView(viewGroup.getContext());
        dpg.q.b(textView, t75.b);
        textView.setTextColor(a93.s0.B(textView).c.getText().g);
        return new v01(textView, 2);
    }
}
