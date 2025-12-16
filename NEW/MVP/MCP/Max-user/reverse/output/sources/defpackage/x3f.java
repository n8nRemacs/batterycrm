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
public final class x3f extends ea9 implements t3f, qdh, pdh {
    public final b3h D0;
    public final w2c E0;
    public final vs8 F0;
    public boolean G0;
    public final OneMeDraweeView H0;
    public final Object I0;
    public final l1h J0;
    public final Object K0;
    public final int L0;
    public final int M0;
    public r40 N0;
    public x9f O0;

    public x3f(Context context) {
        b3h b3hVar = new b3h();
        super(context);
        this.D0 = b3hVar;
        w2c w2cVar = new w2c(context);
        this.E0 = w2cVar;
        vs8 vs8Var = new vs8(context);
        vs8Var.setUseMaxDimensionsOnMeasure(true);
        vs8Var.setOverlayDrawable(w2cVar);
        vs8Var.setShowProgress(true);
        this.F0 = vs8Var;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.H0 = oneMeDraweeView;
        this.I0 = ipi.b(3, new p2f(context, 5));
        l1h l1hVar = new l1h(context);
        l1hVar.setDrawableEnabled(false);
        l1hVar.setBackgroundEnabled(true);
        this.J0 = l1hVar;
        this.K0 = ipi.b(3, new p2f(context, 6));
        float f = 4;
        this.L0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.M0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        b3hVar.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(vs8Var, new ViewGroup.LayoutParams(-1, -1));
        addView(l1hVar, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, k18] */
    public static final void B(x3f x3fVar, xz xzVar) {
        s3f s3fVar = (s3f) x3fVar.getModel();
        if (fni.a(s3fVar != null ? Long.valueOf(s3fVar.a) : null, xzVar != null ? Long.valueOf(xzVar.a()) : null)) {
            if (!(xzVar instanceof tz) && !(xzVar instanceof wz)) {
                ?? r4 = x3fVar.K0;
                if (r4.e()) {
                    ((l1h) r4.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            fqi.b(x3fVar, x3fVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
            x3fVar.getTransferStatusView().setVisibility(0);
            l1h transferStatusView = x3fVar.getTransferStatusView();
            CharSequence charSequenceB = xzVar.b().b(x3fVar.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            transferStatusView.setContent(charSequenceB);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final xq0 getBlurPostProcessor() {
        return (xq0) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final l1h getTransferStatusView() {
        return (l1h) this.K0.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final int b(int i, int i2) {
        vs8 vs8Var = this.F0;
        boolean zO = vs8Var.o();
        OneMeDraweeView oneMeDraweeView = this.H0;
        int measuredHeight = zO ? ((oneMeDraweeView.getMeasuredHeight() - vs8Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.G0 || vs8Var.o()) ? i : (getMeasuredWidth() - vs8Var.getMeasuredWidth()) / 2;
        if (this.G0) {
            cri.c(oneMeDraweeView, i, i2, 0, 12);
        }
        cri.c(vs8Var, measuredWidth, measuredHeight, 0, 12);
        b3h b3hVar = this.D0;
        if (dqi.r(b3hVar.c)) {
            b3hVar.W(((vs8Var.getMeasuredWidth() - b3hVar.N()) / 2) + measuredWidth, measuredHeight);
        }
        ?? r1 = this.K0;
        boolean zE = r1.e();
        int i3 = this.L0;
        int i4 = this.M0;
        if (zE) {
            cri.c((l1h) r1.getValue(), measuredWidth + i4, vs8Var.getTop() + i3, 0, 12);
        }
        int measuredHeight2 = vs8Var.getMeasuredHeight() + i2;
        l1h l1hVar = this.J0;
        cri.c(l1hVar, i + i4, (measuredHeight2 - l1hVar.getMeasuredHeight()) - i3, 0, 12);
        return this.G0 ? oneMeDraweeView.getMeasuredHeight() : vs8Var.getMeasuredHeight();
    }

    @Override // defpackage.qdh
    public final void c(boolean z) {
        this.D0.c(true);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        OneMeDraweeView oneMeDraweeView = this.H0;
        if (view == oneMeDraweeView && !this.G0) {
            return false;
        }
        if (view != this.F0 && view != oneMeDraweeView && view != this.D0.U()) {
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
        return this.F0;
    }

    @Override // defpackage.x4g, defpackage.ii9
    public final boolean i(MotionEvent motionEvent) {
        return shh.c(this.F0, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // defpackage.qdh
    public final boolean k() {
        return this.D0.k();
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

    @Override // defpackage.pdh
    public final ldh s(boolean z) {
        return u1j.B0;
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
        return this.F0.m(motionEvent);
    }

    @Override // defpackage.qdh
    public final boolean u() {
        return this.D0.u();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final long v(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        l1h l1hVar = this.J0;
        l1hVar.measure(iMakeMeasureSpec, i4);
        ?? r1 = this.K0;
        if (r1.e()) {
            ((l1h) r1.getValue()).measure(i3, i4);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        vs8 vs8Var = this.F0;
        vs8Var.measure(iMakeMeasureSpec2, i4);
        b3h b3hVar = this.D0;
        if (dqi.r(b3hVar.c)) {
            b3hVar.Y(View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vs8Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = vs8Var.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.H0;
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
        return bhi.a(Math.max(this.G0 ? oneMeDraweeView.getMeasuredWidth() : vs8Var.getMeasuredWidth(), Math.max(dqi.m(r1), l1hVar.getMeasuredWidth() + getDate$message_list_release().getMeasuredWidth())), Math.max(this.G0 ? oneMeDraweeView.getMeasuredHeight() : vs8Var.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), dqi.l(r1))));
    }

    @Override // defpackage.qdh
    public final void w() {
        this.D0.w();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    @Override // defpackage.d19
    public final void x(ws8 ws8Var) throws NumberFormatException {
        s3f s3fVar = (s3f) ws8Var;
        s0h s0hVar = s3fVar.c;
        this.F0.setImageAttach(new od7(0L, s0hVar.b, s0hVar.c, s0hVar.d, false, s0hVar.e, false, s0hVar.h, s0hVar.i, null, null, null, 7680));
        sf7 sf7VarD = sf7.d(s0hVar.b);
        sf7VarD.d = s0hVar.i;
        sf7VarD.k = getBlurPostProcessor();
        rf7 rf7VarA = sf7VarD.a();
        OneMeDraweeView oneMeDraweeView = this.H0;
        oneMeDraweeView.i(rf7VarA, null);
        ((gr6) oneMeDraweeView.getHierarchy()).h(tyd.c);
        long jG = s65.g(s0hVar.f);
        String[] strArr = l6g.b;
        this.J0.setContent(z7i.a(jG));
        mcf mcfVar = s3fVar.d.a;
        if ((mcfVar.getValue() instanceof tz) || (mcfVar.getValue() instanceof wz)) {
            return;
        }
        ?? r1 = this.K0;
        if (r1.e()) {
            ((l1h) r1.getValue()).setVisibility(8);
        }
    }
}
