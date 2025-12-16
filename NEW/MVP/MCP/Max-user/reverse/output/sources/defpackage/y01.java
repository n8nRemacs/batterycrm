package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class y01 extends y0f {
    public final mc5 o;

    public y01(mc5 mc5Var, ExecutorService executorService) {
        super(executorService);
        this.o = mc5Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof x01)) {
            d2fVar.z((t98) C(i));
            return;
        }
        x01 x01Var = (x01) d2fVar;
        View view = x01Var.a;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof b21) {
            roe roeVar = (roe) view;
            roeVar.setThemeDepended(noe.b);
            x01Var.z(t98Var);
            boolean z = ((b21) t98Var).s0;
            mc5 mc5Var = this.o;
            if (z) {
                roeVar.setEnabled(true);
                f8j.d(view, 300L, new w01(x01Var, mc5Var, (b21) t98Var, 0));
            } else {
                roeVar.setEnabled(false);
                view.setOnClickListener(null);
            }
            roeVar.setOnSwitchCheckedListener(new qk(2, mc5Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        v1a v1aVar = a93.s0;
        if (i == j0b.g) {
            return new x01(new roe(viewGroup.getContext(), 0));
        }
        if (i == j0b.f) {
            TextView textView = new TextView(viewGroup.getContext());
            dpg.q.b(textView, t75.b);
            textView.setTextColor(v1aVar.B(textView).c.getText().g);
            return new v01(textView, 1);
        }
        if (i != j0b.e) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        dpg.j.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().g);
        return new v01(textView2, 0);
    }
}
