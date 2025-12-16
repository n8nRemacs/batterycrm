package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class qj1 extends FrameLayout {
    public static final /* synthetic */ yy7[] w0 = {new z8a(qj1.class, "boundariesOffset", "getBoundariesOffset()Lone/me/calls/ui/ui/pip/fake/boundaries/PipBoundariesOffset;"), u45.h(vid.a, qj1.class, "pipTheme", "getPipTheme()Lone/me/sdk/design/OneMeTheme;"), new z8a(qj1.class, "pipMode", "getPipMode()Lone/me/calls/ui/view/pip/CallPipView$Companion$PipMode;")};
    public final Object a;
    public final bwf b;
    public final k18 c;
    public v1c d;
    public final PointF o;
    public final pj1 s0;
    public final pj1 t0;
    public oj1 u0;
    public final pj1 v0;

    public qj1(Context context) {
        super(context, null);
        this.a = ipi.b(3, new g31(25));
        this.b = new bwf(new o40(context, this));
        this.c = gm1.a.getAccessor().d(HttpStatus.SC_INSUFFICIENT_STORAGE);
        this.d = t1c.a;
        this.o = new PointF();
        this.s0 = new pj1(new j1c(0, 0), this);
        this.t0 = new pj1(this, 0);
        this.v0 = new pj1(this, 1);
        setLayoutParams(new FrameLayout.LayoutParams(kti.d(118 * vw4.d().getDisplayMetrics().density), kti.d(174 * vw4.d().getDisplayMetrics().density)));
        addView(getFakePipView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it1 getFakePipView() {
        return (it1) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final int getFlag() {
        return ((Number) this.a.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lc1 getPipPositionMediator() {
        return (lc1) this.c.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        this.d.t(f, f2, i3 - i, i4 - i2, getBoundariesOffset());
        PointF pointF = this.o;
        if (pointF.x == 0.0f || pointF.y == 0.0f) {
            pointF = null;
        }
        if (pointF == null) {
            return;
        }
        this.d.c(pointF.x - f, pointF.y - f2);
    }

    public final void d(xib xibVar) {
        it1 fakePipView = getFakePipView();
        CharSequence charSequence = xibVar.j;
        yy7[] yy7VarArr = it1.l1;
        fakePipView.H(null, charSequence);
        fakePipView.setAvatar(xibVar.a);
        fakePipView.setButtonAction(xibVar.h);
        fakePipView.F(xibVar.d);
        fakePipView.D(xibVar.f);
        fakePipView.setOpponentVideo(xibVar.g);
    }

    public final oj1 getApplicationPipDepended() {
        return this.u0;
    }

    public final j1c getBoundariesOffset() {
        yy7 yy7Var = w0[0];
        return (j1c) this.s0.b;
    }

    public final nj1 getPipMode() {
        yy7 yy7Var = w0[2];
        return (nj1) this.v0.b;
    }

    public final yeb getPipTheme() {
        yy7 yy7Var = w0[1];
        return (yeb) this.t0.b;
    }

    public final WindowManager.LayoutParams getWindowsViewLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(kti.d(118 * vw4.d().getDisplayMetrics().density), kti.d(174 * vw4.d().getDisplayMetrics().density), 1000, getFlag(), -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(i, i2, i3, i4);
    }

    public final void setApplicationPipDepended(oj1 oj1Var) {
        this.u0 = oj1Var;
    }

    public final void setBackgroundCorners(float f) {
        getFakePipView().setBackgroundCorners(f);
    }

    public final void setBoundariesOffset(j1c j1cVar) {
        this.s0.O(this, w0[0], j1cVar);
    }

    public final void setListener(ft1 ft1Var) {
        it1 fakePipView = getFakePipView();
        fakePipView.h1 = zi1.c;
        fakePipView.b1 = ft1Var;
    }

    public final void setPipMode(nj1 nj1Var) {
        this.v0.O(this, w0[2], nj1Var);
    }

    public final void setPipTheme(yeb yebVar) {
        this.t0.O(this, w0[1], yebVar);
    }

    public final void setStartPosition(PointF pointF) {
        if (pointF != null) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.o;
            pointF2.x = f;
            pointF2.y = f2;
        }
        c(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void setVideoLayoutUpdatesControllerProvider(cm6 cm6Var) {
        getFakePipView().setVideoLayoutUpdatesControllerProvider(cm6Var);
    }
}
