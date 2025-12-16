package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class iq5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iq5(View view, Object obj, int i, int i2) {
        this.a = i2;
        this.c = view;
        this.d = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 2;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                fakeInAppReviewBottomSheet.K0 = false;
                uh7 uh7Var = (uh7) qh7.a.getAccessor().f();
                if (uh7Var != null) {
                    uh7Var.c(4, Integer.valueOf(i3));
                }
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = new FrameLayout(fakeInAppReviewBottomSheet.getContext());
                frameLayout2.setId(l5b.h);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout2.getContext(), null);
                appCompatTextView.setId(l5b.k);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
                layoutParams.gravity = 49;
                appCompatTextView.setLayoutParams(layoutParams);
                dpg.c.b(appCompatTextView, t75.b);
                appCompatTextView.setText(n5b.e);
                appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                frameLayout2.addView(appCompatTextView);
                AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), null);
                appCompatImageView.setId(l5b.j);
                float f = 77;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                appCompatImageView.setImageResource(k5b.a);
                frameLayout2.addView(appCompatImageView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(frameLayout2.getContext(), null);
                appCompatTextView2.setId(l5b.i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.bottomMargin = kti.d(35 * vw4.d().getDisplayMetrics().density);
                layoutParams3.gravity = 81;
                appCompatTextView2.setLayoutParams(layoutParams3);
                dpg.e.b(appCompatTextView2, t75.b);
                appCompatTextView2.setText(n5b.a);
                appCompatTextView2.setTextColor(-16611745);
                f8j.d(appCompatTextView2, 300L, new hq5(fakeInAppReviewBottomSheet, 1));
                frameLayout2.addView(appCompatTextView2);
                tqi.c(new kq5(appCompatTextView, null), frameLayout2);
                frameLayout.addView(frameLayout2);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new sg(fakeInAppReviewBottomSheet, 4, valueAnimatorOfFloat));
                valueAnimatorOfFloat.addListener(new pf(fakeInAppReviewBottomSheet, i2, frameLayout));
                valueAnimatorOfFloat.start();
                return;
            case 1:
                pp6 pp6Var = (pp6) obj;
                tq6 tq6Var = ((io6) obj2).o;
                tq6Var.getClass();
                wqi.c("tq6", "onItemClicked: " + pp6Var, new Object[0]);
                xfh.r(tq6Var.P0, new imb(Integer.valueOf(i3), pp6Var));
                return;
            case 2:
                x7d x7dVar = (x7d) obj2;
                x7dVar.toggle();
                ((d8d) obj).b(x7dVar, x7dVar.b, i3);
                return;
            default:
                vqg vqgVar = (vqg) obj;
                wqg wqgVar = ((yqg) obj2).a;
                if (wqgVar != null) {
                    UnknownContactBottomSheet unknownContactBottomSheet = (UnknownContactBottomSheet) ((ehg) wqgVar).b;
                    yy7[] yy7VarArr = UnknownContactBottomSheet.J0;
                    int i4 = vqgVar.a;
                    int iV = az1.v(i3);
                    drg drgVar = drg.a;
                    if (iV != 0) {
                        if (iV != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (i4 != j0b.g2) {
                            nrg nrgVarO0 = unknownContactBottomSheet.O0();
                            svi.e(nrgVarO0.a, ((q2b) ((lzf) nrgVarO0.Y.getValue())).b(), null, new krg(nrgVarO0, i4, null), 2);
                            return;
                        } else {
                            nrg nrgVarO02 = unknownContactBottomSheet.O0();
                            nrgVarO02.t().j(wx1.CLOSE, nrgVarO02.b);
                            xfh.r(nrgVarO02.z0, drgVar);
                            return;
                        }
                    }
                    if (i4 == j0b.h2) {
                        nrg nrgVarO03 = unknownContactBottomSheet.O0();
                        nrgVarO03.v0.cancel((CancellationException) null);
                        nrgVarO03.t().j(wx1.EVERYTHING_OK, nrgVarO03.b);
                        xfh.r(nrgVarO03.z0, drgVar);
                        return;
                    }
                    if (i4 == j0b.d2) {
                        nrg nrgVarO04 = unknownContactBottomSheet.O0();
                        nrgVarO04.v0.cancel((CancellationException) null);
                        svi.e(nrgVarO04.a, ((q2b) ((lzf) nrgVarO04.Y.getValue())).b(), null, new jrg(nrgVarO04, null), 2);
                        return;
                    } else {
                        nrg nrgVarO05 = unknownContactBottomSheet.O0();
                        nrgVarO05.v0.cancel((CancellationException) null);
                        nrgVarO05.t().j(wx1.BLOCK, nrgVarO05.b);
                        svi.e(nrgVarO05.a, ((q2b) ((lzf) nrgVarO05.Y.getValue())).b(), null, new mrg(nrgVarO05, null), 2);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ iq5(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
