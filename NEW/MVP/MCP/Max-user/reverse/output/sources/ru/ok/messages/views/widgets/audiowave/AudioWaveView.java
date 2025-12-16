package ru.ok.messages.views.widgets.audiowave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.kti;
import defpackage.m8j;
import defpackage.nca;
import defpackage.q1g;
import defpackage.rt0;
import defpackage.u6g;
import defpackage.vw4;
import defpackage.yeb;
import defpackage.yt0;
import defpackage.z60;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/messages/views/widgets/audiowave/AudioWaveView;", "Landroid/view/View;", "Lu6g;", "Lz60;", "listener", "Lqqg;", "setListener", "(Lz60;)V", "", "u0", "Z", "isIncomingMessage", "()Z", "setIncomingMessage", "(Z)V", "", "getDataWidth", "()I", "dataWidth", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioWaveView extends View implements u6g {
    public final float a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint o;
    public final Path s0;
    public boolean t0;

    /* renamed from: u0, reason: from kotlin metadata */
    public boolean isIncomingMessage;
    public boolean v0;

    public AudioWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s0 = new Path();
        setLayerType(1, null);
        float f = vw4.d().getDisplayMetrics().density;
        float f2 = vw4.d().getDisplayMetrics().density;
        float f3 = vw4.d().getDisplayMetrics().density * 2.0f;
        this.a = vw4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f3);
        this.b = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.o = paint3;
        this.c = new Paint(paint);
        m8j.a(this);
        if (m8j.d(this)) {
            setScaleX(-1.0f);
        }
    }

    private final int getDataWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Path path = this.s0;
        if (path.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = 0L;
        float width2 = ((f / f) * getWidth()) + 0.5f;
        boolean z = this.v0;
        float fD = kti.d(6 * getContext().getResources().getDisplayMetrics().density);
        if (this.v0) {
            fD += kti.d(2 * getContext().getResources().getDisplayMetrics().density);
        }
        if (z) {
            canvas.save();
            float fD2 = kti.d(2 * getContext().getResources().getDisplayMetrics().density) + fD;
            width = width2 < fD2 ? fD2 : width2;
            if (width > getWidth() - fD2) {
                width = getWidth() - fD2;
            }
        } else {
            width = 0.0f;
        }
        Paint paint = this.b;
        if (!z) {
            canvas.drawPath(path, paint);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, width2, canvas.getHeight());
            canvas.drawPath(path, this.c);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(width2, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, this.a + fD, this.o);
                canvas.drawCircle(width, measuredHeight, fD, this.d);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        q1g q1gVarD;
        yt0 yt0Var;
        q1g q1gVarD2;
        if (this.isIncomingMessage) {
            if (isInEditMode()) {
                q1gVarD2 = bq4.e0;
            } else {
                Context context = getContext();
                bwf bwfVar = q1g.a0;
                q1gVarD2 = nca.d(context);
            }
            yt0Var = q1gVarD2.h;
        } else {
            if (isInEditMode()) {
                q1gVarD = bq4.e0;
            } else {
                Context context2 = getContext();
                bwf bwfVar2 = q1g.a0;
                q1gVarD = nca.d(context2);
            }
            yt0Var = q1gVarD.g;
        }
        rt0 rt0Var = yt0Var.a;
        int i = rt0Var.e;
        this.b.setColor(rt0Var.f);
        this.d.setColor(i);
        this.o.setColor(yt0Var.c.a);
        this.c.setColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r4 != 3) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            boolean r0 = r3.v0
            if (r0 != 0) goto L9
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L9:
            int r4 = r4.getAction()
            r0 = 1
            if (r4 == 0) goto L32
            r1 = 0
            if (r4 == r0) goto L26
            r2 = 2
            if (r4 == r2) goto L1a
            r2 = 3
            if (r4 == r2) goto L26
            goto L25
        L1a:
            boolean r4 = r3.v0
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            boolean r4 = r3.t0
            if (r4 == 0) goto L25
            r3.t0 = r1
        L25:
            return r0
        L26:
            r3.t0 = r1
            r3.v0 = r1
            android.view.ViewParent r4 = r3.getParent()
            r4.requestDisallowInterceptTouchEvent(r1)
            return r0
        L32:
            r3.t0 = r0
            r3.v0 = r0
            android.view.ViewParent r4 = r3.getParent()
            r4.requestDisallowInterceptTouchEvent(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIncomingMessage(boolean z) {
        this.isIncomingMessage = z;
    }

    public final void setListener(z60 listener) {
    }
}
