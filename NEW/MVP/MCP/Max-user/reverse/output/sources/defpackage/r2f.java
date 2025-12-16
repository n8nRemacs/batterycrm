package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class r2f extends ea9 implements o2f, qdh {
    public final b3h D0;
    public final vs8 E0;
    public final OneMeDraweeView F0;
    public boolean G0;
    public final Object H0;
    public final Object I0;

    public r2f(Context context) {
        b3h b3hVar = new b3h();
        super(context);
        this.D0 = b3hVar;
        vs8 vs8Var = new vs8(context);
        vs8Var.setShowProgress(true);
        this.E0 = vs8Var;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.F0 = oneMeDraweeView;
        this.H0 = ipi.b(3, new p2f(context, 1));
        b3hVar.b = this;
        addView(oneMeDraweeView, -1, -2);
        addView(vs8Var, -1, -2);
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
        this.I0 = ipi.b(3, new p2f(context, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final xq0 getBlurPostProcessor() {
        return (xq0) this.H0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final rb9 getMediaType() {
        return (rb9) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final int b(int i, int i2) {
        vs8 vs8Var = this.E0;
        boolean zO = vs8Var.o();
        OneMeDraweeView oneMeDraweeView = this.F0;
        int measuredHeight = zO ? ((oneMeDraweeView.getMeasuredHeight() - vs8Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.G0 || vs8Var.o()) ? i : (getMeasuredWidth() - vs8Var.getMeasuredWidth()) / 2;
        if (this.G0) {
            cri.c(oneMeDraweeView, i, i2, 0, 12);
        }
        cri.c(vs8Var, measuredWidth, measuredHeight, 0, 12);
        b3h b3hVar = this.D0;
        if (dqi.r(b3hVar.c)) {
            b3hVar.W(measuredWidth, measuredHeight);
        }
        ?? r9 = this.I0;
        if (r9.e()) {
            float f = 4;
            cri.c((rb9) r9.getValue(), u45.c(f, vw4.d().getDisplayMetrics().density, vs8Var.getLeft()), vs8Var.getBottom() - (kti.d(f * vw4.d().getDisplayMetrics().density) + getMediaType().getMeasuredHeight()), 0, 12);
        }
        return this.G0 ? oneMeDraweeView.getMeasuredHeight() : vs8Var.getMeasuredHeight();
    }

    @Override // defpackage.qdh
    public final void c(boolean z) {
        this.D0.c(true);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        OneMeDraweeView oneMeDraweeView = this.F0;
        if (view == oneMeDraweeView && !this.G0) {
            return false;
        }
        if (view != this.E0 && view != oneMeDraweeView && view != this.D0.U()) {
            return super.drawChild(canvas, view, j);
        }
        float f = 1.0f * vw4.d().getDisplayMetrics().density;
        float[] fArrA = ((qh9) getBackground()).a();
        Rect bounds = ((qh9) getBackground()).getBounds();
        float f2 = ((qh9) getBackground()).q;
        float[] fArrA2 = dw8.a();
        int length = fArrA2.length;
        int i2 = 0;
        while (i < length) {
            float f3 = fArrA2[i];
            dw8.a()[i2] = Math.max(0.0f, fArrA[i2] - f);
            i++;
            i2++;
        }
        Path pathB = dw8.b();
        pathB.reset();
        pathB.addRoundRect(bounds.left + f, bounds.top + f, bounds.right - f, (bounds.bottom - f) - f2, dw8.a(), Path.Direction.CW);
        Path pathB2 = dw8.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(iSave);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // defpackage.qdh
    public View getPreviewView() {
        return this.E0;
    }

    @Override // defpackage.x4g, defpackage.ii9
    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (shh.c(this.E0, this).contains(x, y)) {
            return true;
        }
        return shh.c(this.F0, this).contains(x, y);
    }

    @Override // defpackage.qdh
    public final boolean k() {
        return this.E0.getImageAttach().e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final boolean n() {
        return dqi.r(this.D0.c);
    }

    @Override // defpackage.qdh
    public final void p(hdh hdhVar, m00 m00Var, long j, boolean z, boolean z2) {
        this.D0.p(hdhVar, m00Var, j, z, z2);
    }

    @Override // defpackage.qdh
    public void setVideoClickListener(sm6 sm6Var) {
        this.D0.d = sm6Var;
    }

    @Override // defpackage.qdh
    public void setVideoLongClickListener(sm6 sm6Var) {
        this.D0.o = sm6Var;
    }

    @Override // defpackage.ii9
    public final boolean t(MotionEvent motionEvent) {
        return this.E0.m(motionEvent);
    }

    @Override // defpackage.qdh
    public final boolean u() {
        return this.D0.u();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final long v(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        vs8 vs8Var = this.E0;
        vs8Var.measure(iMakeMeasureSpec, i4);
        ?? r6 = this.I0;
        if (r6.e()) {
            ((rb9) r6.getValue()).measure(i3, i4);
        }
        b3h b3hVar = this.D0;
        if (dqi.r(b3hVar.c)) {
            b3hVar.Y(View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = vs8Var.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.F0;
        if (blurOffset == 0) {
            boolean z = vs8Var.getMeasuredWidth() < i;
            this.G0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredHeight(), 1073741824));
            }
        } else if (vs8Var.P0 > 0) {
            this.G0 = true;
            int blurOffset2 = (vs8Var.getBlurOffset() * 2) + vs8Var.getMeasuredWidth();
            if (i < blurOffset2) {
                i = blurOffset2;
            }
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredHeight(), 1073741824));
        } else if (vs8Var.o()) {
            this.G0 = true;
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((vs8Var.getBlurOffset() * 2) + vs8Var.getMeasuredHeight(), 1073741824));
        } else {
            this.G0 = false;
        }
        return bhi.a(Math.max(this.G0 ? oneMeDraweeView.getMeasuredWidth() : vs8Var.getMeasuredWidth(), getDate$message_list_release().getMeasuredWidth() + dqi.m(r6)), Math.max(this.G0 ? oneMeDraweeView.getMeasuredHeight() : vs8Var.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), dqi.l(r6))));
    }

    @Override // defpackage.qdh
    public final void w() {
        this.D0.w();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final void x(ws8 ws8Var) throws NumberFormatException {
        od7 od7Var = ((n2f) ws8Var).c;
        this.E0.setImageAttach(od7Var);
        sf7 sf7VarD = sf7.d(od7Var.b);
        sf7VarD.d = od7Var.i;
        sf7VarD.k = getBlurPostProcessor();
        rf7 rf7VarA = sf7VarD.a();
        OneMeDraweeView oneMeDraweeView = this.F0;
        oneMeDraweeView.i(rf7VarA, null);
        ((gr6) oneMeDraweeView.getHierarchy()).h(od7Var.j);
        if (od7Var.e) {
            fqi.b(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
        } else {
            ?? r4 = this.I0;
            if (r4.e()) {
                ((rb9) r4.getValue()).setVisibility(8);
            }
        }
    }
}
