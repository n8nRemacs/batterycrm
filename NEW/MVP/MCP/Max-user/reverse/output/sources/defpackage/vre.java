package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class vre extends y0f {
    public final zid o;

    public vre(zid zidVar, ExecutorService executorService) {
        super(executorService);
        this.o = zidVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        boolean z = d2fVar instanceof ure;
        zid zidVar = this.o;
        if (z) {
            ure ureVar = (ure) d2fVar;
            t98 t98Var = (t98) C(i);
            if (t98Var instanceof x8e) {
                ureVar.z(t98Var);
                f8j.d((roe) ureVar.a, 300L, new wfe(zidVar, 7, (x8e) t98Var));
                return;
            }
            return;
        }
        if (!(d2fVar instanceof tre)) {
            d2fVar.z((t98) C(i));
            return;
        }
        tre treVar = (tre) d2fVar;
        t98 t98Var2 = (t98) C(i);
        if (t98Var2 instanceof v8e) {
            treVar.z(t98Var2);
            f8j.d((OneMeButton) treVar.a, 300L, new wfe(zidVar, 6, (v8e) t98Var2));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == tbb.H) {
            return new ure(new roe(viewGroup.getContext(), 0));
        }
        if (i == tbb.G) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = 16;
            float f2 = 4;
            textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
            dpg.q.b(textView, t75.b);
            tqi.c(new ipe(3, null, 6), textView);
            return new v01(textView, 24);
        }
        if (i != tbb.F) {
            String name = vre.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                }
            }
            return new v01(new View(viewGroup.getContext()), 25);
        }
        OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iD;
        layoutParams.rightMargin = iD;
        layoutParams.topMargin = iD;
        layoutParams.bottomMargin = iD;
        oneMeButton.setLayoutParams(layoutParams);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        return new tre(oneMeButton);
    }
}
