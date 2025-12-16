package ru.ok.messages.media.trim.rangeSeekBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import defpackage.bwd;
import defpackage.bwf;
import defpackage.de;
import defpackage.fr0;
import defpackage.iqa;
import defpackage.kba;
import defpackage.n5c;
import defpackage.naa;
import defpackage.nca;
import defpackage.ny1;
import defpackage.pdf;
import defpackage.q1g;
import defpackage.rw4;
import defpackage.ssa;
import defpackage.sva;
import defpackage.u0e;
import defpackage.v08;
import defpackage.vk3;
import defpackage.vw4;
import defpackage.xu9;
import defpackage.zob;
import java.util.Set;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public class RangeSeekBarView extends View {
    public static int P0;
    public float A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final LongSparseArray F0;
    public Rect G0;
    public FrgTrimVideo H0;
    public v08 I0;
    public final Paint J0;
    public int K0;
    public float L0;
    public long M0;
    public final rw4 N0;
    public final boolean O0;
    public final int a;
    public final int b;
    public final int c;
    public sva d;
    public final int o;
    public final Paint s0;
    public int t0;
    public n5c u0;
    public fr0 v0;
    public fr0 w0;
    public boolean x0;
    public float y0;
    public float z0;

    public RangeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.F0 = new LongSparseArray();
        getContext();
        rw4 rw4VarA = rw4.a();
        this.N0 = rw4VarA;
        int i = rw4VarA.h;
        this.a = i;
        int i2 = rw4VarA.e;
        this.b = i2;
        this.c = i + i2;
        Paint paint = new Paint();
        this.s0 = paint;
        Context context2 = getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context2);
        paint.setColor(zob.b(q1gVarD.m, 0.8f));
        Paint paint2 = new Paint();
        this.J0 = paint2;
        paint2.setColor(q1gVarD.m);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.o = rw4VarA.r;
        setLayerType(1, null);
        this.O0 = getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void a() {
        int i = this.t0;
        if (i == 0) {
            if (this.v0.b() > this.w0.b()) {
                this.v0.e(this.w0.b());
            } else if (this.v0.b() < 0.0f) {
                this.v0.e(0.0f);
            }
            if (this.w0.b() - this.v0.b() > this.z0) {
                this.v0.e(this.w0.b() - this.z0);
            } else if (this.w0.b() - this.v0.b() < this.y0) {
                this.v0.e(this.w0.b() - this.y0);
            }
        } else if (i == 1) {
            if (this.w0.b() < this.v0.b()) {
                this.w0.e(this.v0.b());
            } else if (this.w0.b() > 1.0f) {
                this.w0.e(1.0f);
            }
            if (this.w0.b() - this.v0.b() > this.z0) {
                this.w0.e(this.v0.b() + this.z0);
            } else if (this.w0.b() - this.v0.b() < this.y0) {
                this.w0.e(this.v0.b() + this.y0);
            }
        }
        if (this.u0.a() < this.v0.b()) {
            this.u0.c(this.v0.b());
            this.x0 = true;
        } else if (this.u0.a() > this.w0.b()) {
            this.u0.c(this.w0.b());
            this.x0 = true;
        }
        getContext();
        rw4.a();
        float fB = vw4.b((int) 48.0f);
        float f = this.w0.j.left - (this.N0.j * 2);
        fr0 fr0Var = this.v0;
        RectF rectF = fr0Var.j;
        float f2 = rectF.right;
        if (fB > f - f2) {
            fr0Var.d();
            this.w0.d();
            return;
        }
        RectF rectF2 = fr0Var.k;
        float f3 = rectF.left;
        float f4 = fr0Var.d;
        rectF2.set(f3 - f4, rectF.top, f2 + f4, rectF.bottom);
        fr0 fr0Var2 = this.w0;
        RectF rectF3 = fr0Var2.k;
        RectF rectF4 = fr0Var2.j;
        float f5 = rectF4.left;
        float f6 = fr0Var2.d;
        rectF3.set(f5 - f6, rectF4.top, rectF4.right + f6, rectF4.bottom);
    }

    public final float b(float f) {
        return (((f - 0.0f) / 1.0f) * P0) + this.N0.j + this.a;
    }

    public final float c(float f) {
        return ((((f - this.N0.j) - this.a) * 1.0f) / P0) + 0.0f;
    }

    public final int d(long j) {
        float f = this.D0;
        return ((int) (((j - (0.0f * f)) / (1.0f * f)) * P0)) + this.N0.j + this.a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bwd.b(this.I0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.E0) {
            boolean z = this.O0;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
            }
            canvas.save();
            canvas.translate(0.0f, this.b);
            if (this.M0 != 0) {
                canvas.save();
                canvas.clipRect(this.G0);
                long j = this.M0;
                long j2 = (((long) (this.D0 * 0.0f)) / j) * j;
                long j3 = (j * (((int) this.L0) + 2)) + j2;
                int iD = d(j2);
                for (int iD2 = d(j3); iD < iD2; iD2 = iD2) {
                    int i = iD;
                    float f = i;
                    canvas.drawLine(f, 0, f, this.K0, this.J0);
                    iD = i + this.K0;
                }
                LongSparseArray longSparseArray = this.F0;
                if (longSparseArray.size() != 0) {
                    if (z) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
                    }
                    for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                        long jKeyAt = longSparseArray.keyAt(i2);
                        int iD3 = d(jKeyAt);
                        if (z) {
                            iD3 = getWidth() - iD3;
                        }
                        if (jKeyAt > j2 || jKeyAt < j3) {
                            canvas.drawBitmap((Bitmap) longSparseArray.valueAt(i2), iD3, 0, (Paint) null);
                        }
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
            float fB = this.v0.b();
            rw4 rw4Var = this.N0;
            float fC = c(rw4Var.j / 2);
            Paint paint = this.s0;
            if (fB > fC) {
                canvas.drawRect(b(0.0f), 0, b(this.v0.b()) - (rw4Var.j / 2), rw4Var.r, paint);
            }
            if (this.w0.b() < 1.0f - (c(rw4Var.j / 2) - 0.0f)) {
                canvas2 = canvas;
                canvas2.drawRect((rw4Var.j / 2) + b(this.w0.b()), 0, b(1.0f), rw4Var.r, paint);
            } else {
                canvas2 = canvas;
            }
            this.v0.a(canvas2);
            this.w0.a(canvas2);
            canvas2.restore();
            n5c n5cVar = this.u0;
            RectF rectF = n5cVar.i;
            canvas2.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, n5cVar.c);
            RectF rectF2 = n5cVar.j;
            Paint paint2 = n5cVar.e;
            canvas2.drawRect(rectF2, paint2);
            canvas2.drawRect(n5cVar.k, paint2);
            canvas2.drawCircle(n5cVar.g.centerX(), n5cVar.f, n5cVar.b, n5cVar.d);
            if (z) {
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        rw4 rw4Var = this.N0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), rw4Var.r + this.c + rw4Var.h + rw4Var.i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        rw4 rw4Var = this.N0;
        int i5 = width - (rw4Var.j * 2);
        int i6 = this.a;
        P0 = i5 - (i6 * 2);
        this.u0 = new n5c(this.b + rw4Var.r + this.c + rw4Var.h, getContext(), this);
        int i7 = 0;
        this.v0 = new fr0(0, getContext(), this);
        this.w0 = new fr0(1, getContext(), this);
        this.v0.e(this.A0);
        this.w0.e(this.B0);
        this.u0.c(this.C0);
        this.t0 = 1;
        a();
        this.t0 = 3;
        int i8 = rw4Var.j + i6;
        int i9 = P0 + i8;
        int i10 = this.o;
        this.G0 = new Rect(i8, 0, i9, i10);
        this.K0 = i10;
        this.L0 = (getWidth() - (rw4Var.j * 2)) / this.K0;
        this.M0 = (int) ((1.0f * this.D0) / r11);
        bwd.b(this.I0);
        LongSparseArray longSparseArray = this.F0;
        longSparseArray.clear();
        long j = this.M0;
        if (j != 0) {
            long j2 = (((long) (0.0f * this.D0)) / j) * j;
            long j3 = (j * (((int) this.L0) + 2)) + j2;
            while (i7 < longSparseArray.size()) {
                long jKeyAt = longSparseArray.keyAt(i7);
                long j4 = this.M0 * 30;
                if (jKeyAt < j2 - j4 || jKeyAt > j4 + j3) {
                    longSparseArray.removeAt(i7);
                    i7--;
                }
                i7++;
            }
            ssa ssaVarL = new vk3(2, new ny1(this, j2, 9)).p(u0e.a()).l(de.a());
            v08 v08Var = new v08(new xu9(22, this), new iqa(16), pdf.d);
            ssaVarL.a(v08Var);
            this.I0 = v08Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2 != 3) goto L110;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEndPosition(long j) {
        this.w0.e(j / this.D0);
        a();
        invalidate();
    }

    public void setOnChangeRangeSeekBarListener(sva svaVar) {
        fr0 fr0Var;
        this.d = svaVar;
        if (svaVar == null || (fr0Var = this.v0) == null || this.w0 == null || this.u0 == null) {
            return;
        }
        fr0Var.b();
        Set<naa> set = (Set) ((kba) svaVar).a;
        for (naa naaVar : set) {
            naaVar.O0();
            naaVar.N0();
            naaVar.X.i(naaVar.t0);
        }
        long jB = (long) (this.w0.b() * this.D0);
        for (naa naaVar2 : set) {
            naaVar2.s0 = jB;
            naaVar2.O0();
            naaVar2.N0();
            naaVar2.X.i(naaVar2.t0);
        }
        long jA = (long) (this.u0.a() * this.D0);
        for (naa naaVar3 : set) {
            naaVar3.t0 = jA;
            naaVar3.N0();
            naaVar3.X.i(jA);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public void setPointerPosition(long j) {
        this.u0.c(j / this.D0);
        a();
        invalidate();
    }

    public void setStartPosition(long j) {
        this.v0.e(j / this.D0);
        a();
        invalidate();
    }
}
