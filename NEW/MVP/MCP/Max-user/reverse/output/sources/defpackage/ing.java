package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class ing extends y0f {
    public final zid o;

    public ing(zid zidVar, ExecutorService executorService) {
        super(executorService);
        this.o = zidVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof hng)) {
            d2fVar.z((t98) C(i));
            return;
        }
        hng hngVar = (hng) d2fVar;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof eng) {
            hngVar.z(t98Var);
            zid zidVar = this.o;
            f8j.d(hngVar.a, 300L, new wfe(zidVar, 18, (eng) t98Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == e0d.oneme_settings_twofa_configuration_setting_item) {
            return new hng(new roe(viewGroup.getContext(), 0));
        }
        if (i == e0d.oneme_settings_twofa_configuration_header_item) {
            TextView textView = new TextView(viewGroup.getContext());
            dpg.q.b(textView, t75.b);
            tqi.c(new ipe(3, null, 11), textView);
            return new gng(textView, 0);
        }
        if (i == e0d.oneme_settings_twofa_configuration_description_item) {
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setLayoutParams(new xhd(-1, -2));
            dpg.l.b(textView2, t75.b);
            tqi.c(new ipe(3, null, 10), textView2);
            return new v01(textView2, 29);
        }
        String name = ing.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
            }
        }
        return new gng(new View(viewGroup.getContext()), 1);
    }
}
