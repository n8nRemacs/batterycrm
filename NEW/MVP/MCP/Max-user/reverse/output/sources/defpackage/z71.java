package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.Collections;
import java.util.concurrent.Executor;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* loaded from: classes.dex */
public final class z71 extends y0f implements uf5 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z71(Executor executor, int i) {
        super(executor);
        this.o = i;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 5:
                throw new ClassCastException();
            case 6:
                fwe fweVar = ((dwe) ((hwe) d2fVar).a).d;
                fweVar.c = true;
                fweVar.b.c();
                return;
            default:
                super.r(d2fVar, i);
                return;
        }
    }

    @Override // defpackage.uf5
    public void d() {
        E(Collections.singletonList(y53.a));
    }

    @Override // defpackage.uf5
    public void g() {
        E(null);
    }

    @Override // defpackage.y0f, defpackage.phd
    public int l(int i) {
        switch (this.o) {
            case 0:
                return ((v71) ((t98) C(i))).d;
            case 1:
            case 2:
            default:
                return super.l(i);
            case 3:
                return pd5.b;
            case 4:
                return pc8.b;
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public void r(mid midVar, int i) {
        switch (this.o) {
            case 5:
                throw new ClassCastException();
            case 6:
                fwe fweVar = ((dwe) ((hwe) midVar).a).d;
                fweVar.c = true;
                fweVar.b.c();
                return;
            default:
                super.r(midVar, i);
                return;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                if (i == eyc.call_event_view_item) {
                    return new en0(new w71(viewGroup.getContext()));
                }
                throw new IllegalArgumentException("Not supported viewType for CallEventsAdapter");
            case 1:
                return new v01(new z53(viewGroup.getContext()), 8);
            case 2:
                return new v01(new EmptySearchView(viewGroup.getContext(), null), 9);
            case 3:
                x3b x3bVar = new x3b(viewGroup.getContext());
                v01 v01Var = new v01(x3bVar, 10);
                x3bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.i0));
                x3bVar.setSubtitle(new n5g(avd.g0));
                return v01Var;
            case 4:
                Context context = viewGroup.getContext();
                m5e m5eVar = new m5e(context);
                m5eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                float f = 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                cei.l(progressBar, a93.s0.y(progressBar).getIcon().i);
                m5eVar.addView(progressBar);
                return new v01(m5eVar, 11);
            case 5:
                return new voe(new OneMeButton(viewGroup.getContext(), null));
            default:
                return new hwe(new dwe(viewGroup.getContext()));
        }
    }
}
