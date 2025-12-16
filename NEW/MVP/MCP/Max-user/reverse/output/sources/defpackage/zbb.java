package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zbb extends View implements u6g {
    public final ArrayList A0;
    public final int a;
    public final m4f b;
    public final p4f c;
    public final Paint d;
    public int o;
    public int s0;
    public final ybb t0;
    public final ybb u0;
    public boolean v0;
    public float w0;
    public float x0;
    public final Paint y0;
    public final TextPaint z0;

    /* JADX WARN: Type inference failed for: r4v7, types: [ybb] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ybb] */
    public zbb(Context context) {
        super(context);
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.b = new m4f();
        this.c = new p4f();
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        this.d = paint;
        final int i = 0;
        this.t0 = new Runnable(this) { // from class: ybb
            public final /* synthetic */ zbb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                switch (i) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        this.b.b();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.u0 = new Runnable(this) { // from class: ybb
            public final /* synthetic */ zbb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                switch (i2) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        this.b.b();
                        break;
                }
            }
        };
        this.x0 = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(vw4.d().getDisplayMetrics().density * 4.0f, 0.0f, 0.0f, v4j.c(-16777216, 0.12f));
        this.y0 = paint2;
        TextPaint textPaint = new TextPaint();
        wsf.j(this, textPaint, dpg.f);
        this.z0 = textPaint;
        this.A0 = new ArrayList();
        float f = 16;
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(a93.s0.y(this));
    }

    private final void setLastThumbSnap(float f) {
        p4f p4fVar = this.c;
        float f2 = p4fVar.d;
        o4f o4fVar = p4fVar.c;
        yy7 yy7Var = p4f.g[2];
        float fFloatValue = ((Number) o4fVar.b).floatValue() / 2;
        int i = p4fVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            m4f m4fVar = this.b;
            RectF rectF = m4fVar.b;
            float fB = m4fVar.q.b(i2);
            rectF.left = fB;
            rectF.right = fB;
            rectF.top = m4fVar.n;
            rectF.bottom = m4fVar.o;
            if (Math.abs(rectF.centerX() - f) <= fFloatValue) {
                float fB2 = p4fVar.b();
                yy7 yy7Var2 = p4f.g[2];
                p4fVar.c((((Number) o4fVar.b).floatValue() * i2) + fB2);
                if (p4fVar.d != f2) {
                    ybb ybbVar = this.t0;
                    removeCallbacks(ybbVar);
                    removeCallbacks(this.u0);
                    post(ybbVar);
                }
            }
        }
        this.w0 = f;
    }

    public final boolean a() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final void b() throws JSONException {
        Object next;
        Object next2;
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            fr frVar = (fr) it.next();
            float f = this.c.d;
            AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = frVar.b;
            k18 k18Var = appearanceSettingsMultiThemeScreen.X;
            frVar.a.setVisibility(f == 1.0f ? 8 : 0);
            yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
            xr xrVarY0 = appearanceSettingsMultiThemeScreen.y0();
            int i = ((sxg) k18Var.getValue()).g.getInt("app.extra.text.size.mode", 1);
            pr prVar = (pr) xrVarY0.B0.getValue();
            if (prVar != null) {
                Iterator it2 = prVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((zq) next).b.equals(Boolean.TRUE)) {
                            break;
                        }
                    }
                }
                zq zqVar = (zq) next;
                Integer numValueOf = zqVar != null ? Integer.valueOf(zqVar.a.a) : null;
                Iterator it3 = prVar.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (((f7g) next2).a) {
                            break;
                        }
                    }
                }
                f7g f7gVar = (f7g) next2;
                String strA = xr.A(f7gVar != null ? f7gVar.n() : null, numValueOf, null, Boolean.FALSE);
                hg8 hg8VarD = strA != null ? xrVarY0.w("TEXT_SIZE", String.valueOf(i), strA).d() : null;
                if (hg8VarD != null) {
                    xrVarY0.y().h(hg8VarD);
                }
            }
            sxg sxgVar = (sxg) k18Var.getValue();
            int iC = n7j.c(kti.d(f), 0, 5);
            sxgVar.g(iC, "app.extra.text.size.mode");
            sxgVar.i.f(Integer.valueOf(iC));
        }
    }

    public final float getValue() {
        return this.c.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fApplyDimension = TypedValue.applyDimension(2, 12.0f, vw4.d().getDisplayMetrics());
        TextPaint textPaint = this.z0;
        textPaint.setTextSize(fApplyDimension);
        m4f m4fVar = this.b;
        PointF pointF = m4fVar.a;
        float f = m4fVar.e;
        pointF.x = f;
        float f2 = (m4fVar.d / 2.0f) + m4fVar.j;
        pointF.y = f2;
        canvas.drawText("A", f, f2, textPaint);
        textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, vw4.d().getDisplayMetrics()));
        PointF pointF2 = m4fVar.a;
        float f3 = (m4fVar.c - m4fVar.g) - m4fVar.l;
        pointF2.x = f3;
        float f4 = (m4fVar.d / 2.0f) + m4fVar.m;
        pointF2.y = f4;
        canvas.drawText("A", f3, f4, textPaint);
        RectF rectF = m4fVar.r;
        pointF2.x = m4fVar.s;
        pointF2.y = rectF.centerY();
        float f5 = pointF2.x;
        int i = this.o;
        Paint paint = this.d;
        paint.setColor(i);
        canvas.drawLine(rectF.left, rectF.top, f5, rectF.bottom, paint);
        int i2 = this.c.e;
        for (int i3 = 0; i3 < i2; i3++) {
            RectF rectF2 = m4fVar.b;
            float fB = m4fVar.q.b(i3);
            rectF2.left = fB;
            rectF2.right = fB;
            rectF2.top = m4fVar.n;
            rectF2.bottom = m4fVar.o;
            if (fB > f5) {
                paint.setColor(this.s0);
            }
            Paint paint2 = paint;
            canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, paint2);
            paint = paint2;
        }
        canvas.drawLine(f5, rectF.top, rectF.right, rectF.bottom, paint);
        float f6 = vw4.d().getDisplayMetrics().density * 12.0f;
        pointF2.x = m4fVar.s;
        float fCenterY = rectF.centerY();
        pointF2.y = fCenterY;
        canvas.drawCircle(pointF2.x, fCenterY, f6, this.y0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = vw4.d().getDisplayMetrics().density * 12.0f;
        TextPaint textPaint = this.z0;
        textPaint.setTextSize(f);
        textPaint.measureText("A");
        float f2 = 20;
        kti.d(vw4.d().getDisplayMetrics().density * f2);
        float fMeasureText = textPaint.measureText("A");
        float f3 = textPaint.getFontMetrics().descent;
        m4f m4fVar = this.b;
        m4fVar.getClass();
        if (fMeasureText < 0.0f) {
            fMeasureText = 0.0f;
        }
        m4fVar.i = fMeasureText + kti.d(vw4.d().getDisplayMetrics().density * f2);
        m4fVar.j = f3;
        m4fVar.d();
        m4fVar.b(m4fVar.p);
        textPaint.setTextSize(vw4.d().getDisplayMetrics().density * 18.0f);
        textPaint.measureText("A");
        kti.d(vw4.d().getDisplayMetrics().density * f2);
        float fMeasureText2 = textPaint.measureText("A");
        float f4 = textPaint.getFontMetrics().descent;
        float f5 = fMeasureText2 >= 0.0f ? fMeasureText2 : 0.0f;
        m4fVar.l = f5;
        m4fVar.k = f5 + kti.d(f2 * vw4.d().getDisplayMetrics().density);
        m4fVar.m = f4;
        m4fVar.d();
        m4fVar.b(m4fVar.p);
        setMeasuredDimension(View.MeasureSpec.getSize(i), kti.d(68 * vw4.d().getDisplayMetrics().density));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        m4fVar.c = measuredWidth;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        m4fVar.d = measuredHeight;
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        m4fVar.e = paddingLeft;
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        m4fVar.f = paddingTop;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        m4fVar.g = paddingRight;
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        m4fVar.h = paddingBottom;
        m4fVar.d();
        m4fVar.b(m4fVar.p);
        m4fVar.c(m4fVar.s);
        p4f p4fVar = this.c;
        m4fVar.b(p4fVar.e);
        RectF rectF = m4fVar.r;
        if (this.v0) {
            return;
        }
        m4fVar.c(m4fVar.a((rectF.width() * p4fVar.f) + rectF.left));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.o = yebVar.getIcon().k;
        this.s0 = rf3.g(yebVar.i().b.b, yebVar.b().h);
        this.d.setColor(this.o);
        this.y0.setColor(-1);
        this.z0.setColor(yebVar.getText().g);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            goto L37
        L8:
            int r0 = r6.getAction()
            m4f r2 = r5.b
            r3 = 1
            if (r0 == 0) goto L76
            if (r0 == r3) goto L63
            r4 = 2
            if (r0 == r4) goto L1b
            r4 = 3
            if (r0 == r4) goto L63
            goto La6
        L1b:
            boolean r0 = r5.v0
            if (r0 != 0) goto L3f
            boolean r0 = r5.a()
            if (r0 == 0) goto L38
            float r0 = r6.getX()
            float r4 = r5.x0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.a
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L38
        L37:
            return r1
        L38:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L3f:
            r5.v0 = r3
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            float r0 = r5.w0
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La6
            o07 r0 = defpackage.o07.CLOCK_TICK
            defpackage.uog.i(r5, r0)
            r5.setLastThumbSnap(r6)
            r2.c(r6)
            goto La6
        L63:
            r5.v0 = r1
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            r5.setLastThumbSnap(r6)
            float r6 = r5.w0
            r2.c(r6)
            goto La6
        L76:
            float r0 = r6.getX()
            r5.x0 = r0
            boolean r0 = r5.a()
            if (r0 == 0) goto L83
            goto La6
        L83:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.requestFocus()
            r5.v0 = r3
            float r0 = r6.getX()
            float r0 = r2.a(r0)
            r5.setLastThumbSnap(r0)
            float r6 = r6.getX()
            r2.c(r6)
            p07 r6 = defpackage.p07.GESTURE_START
            defpackage.uog.i(r5, r6)
        La6:
            r5.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setStepSize(float f) {
        p4f p4fVar = this.c;
        float f2 = p4fVar.d;
        p4fVar.c.O(p4fVar, p4f.g[2], Float.valueOf(f));
        int i = p4fVar.e;
        m4f m4fVar = this.b;
        m4fVar.b(i);
        RectF rectF = m4fVar.r;
        m4fVar.c(m4fVar.a((rectF.width() * p4fVar.f) + rectF.left));
        if (f2 != p4fVar.d) {
            removeCallbacks(this.t0);
            ybb ybbVar = this.u0;
            removeCallbacks(ybbVar);
            post(ybbVar);
        }
        postInvalidate();
    }

    public final void setValue(float f) {
        p4f p4fVar = this.c;
        float f2 = p4fVar.d;
        p4fVar.c(f);
        int i = p4fVar.e;
        m4f m4fVar = this.b;
        m4fVar.b(i);
        RectF rectF = m4fVar.r;
        m4fVar.c(m4fVar.a((rectF.width() * p4fVar.f) + rectF.left));
        if (f2 != p4fVar.d) {
            removeCallbacks(this.t0);
            ybb ybbVar = this.u0;
            removeCallbacks(ybbVar);
            post(ybbVar);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        p4f p4fVar = this.c;
        float f2 = p4fVar.d;
        p4fVar.a.O(p4fVar, p4f.g[0], Float.valueOf(f));
        int i = p4fVar.e;
        m4f m4fVar = this.b;
        m4fVar.b(i);
        RectF rectF = m4fVar.r;
        m4fVar.c(m4fVar.a((rectF.width() * p4fVar.f) + rectF.left));
        if (f2 != p4fVar.d) {
            removeCallbacks(this.t0);
            ybb ybbVar = this.u0;
            removeCallbacks(ybbVar);
            post(ybbVar);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        p4f p4fVar = this.c;
        float f2 = p4fVar.d;
        p4fVar.b.O(p4fVar, p4f.g[1], Float.valueOf(f));
        int i = p4fVar.e;
        m4f m4fVar = this.b;
        m4fVar.b(i);
        RectF rectF = m4fVar.r;
        m4fVar.c(m4fVar.a((rectF.width() * p4fVar.f) + rectF.left));
        if (f2 != p4fVar.d) {
            removeCallbacks(this.t0);
            ybb ybbVar = this.u0;
            removeCallbacks(ybbVar);
            post(ybbVar);
        }
        postInvalidate();
    }
}
