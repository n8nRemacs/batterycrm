package e11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: e11.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39899q0 extends View {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Paint f394745b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Paint f394746c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Paint f394747d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final C39924z f394748e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public RectF f394749f;

    /* renamed from: g, reason: collision with root package name */
    public long f394750g;

    /* renamed from: h, reason: collision with root package name */
    public float f394751h;

    /* renamed from: i, reason: collision with root package name */
    public float f394752i;

    /* renamed from: j, reason: collision with root package name */
    public float f394753j;

    /* renamed from: k, reason: collision with root package name */
    public int f394754k;

    /* renamed from: l, reason: collision with root package name */
    public int f394755l;

    public C39899q0(@j.N Context context) {
        super(context);
        this.f394745b = new Paint();
        this.f394746c = new Paint();
        this.f394747d = new Paint();
        this.f394749f = new RectF();
        this.f394750g = 0L;
        this.f394751h = 0.0f;
        this.f394752i = 0.0f;
        this.f394753j = 230.0f;
        C39924z c39924z = new C39924z(context);
        this.f394748e = c39924z;
        this.f394755l = c39924z.a(28);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z12;
        super.onDraw(canvas);
        canvas.drawOval(this.f394749f, this.f394746c);
        if (this.f394751h != this.f394752i) {
            this.f394751h = Math.min(this.f394751h + (((SystemClock.uptimeMillis() - this.f394750g) / 1000.0f) * this.f394753j), this.f394752i);
            this.f394750g = SystemClock.uptimeMillis();
            z12 = true;
        } else {
            z12 = false;
        }
        float f12 = this.f394751h;
        if (isInEditMode()) {
            f12 = 360.0f;
        }
        canvas.drawArc(this.f394749f, -90.0f, f12, false, this.f394745b);
        Paint paint = this.f394747d;
        paint.setColor(-1);
        paint.setTextSize(this.f394748e.a(12));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f394754k), (int) this.f394749f.centerX(), (int) (this.f394749f.centerY() - ((paint.ascent() + paint.descent()) / 2.0f)), paint);
        if (z12) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.f394755l;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f394755l;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        } else if (mode == 1073741824) {
            paddingRight = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f12 = 1;
        C39924z c39924z = this.f394748e;
        this.f394749f = new RectF(c39924z.a(f12) + paddingLeft, c39924z.a(f12) + paddingTop, (i12 - paddingRight) - c39924z.a(f12), (i13 - paddingBottom) - c39924z.a(f12));
        Paint paint = this.f394745b;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(c39924z.a(f12));
        Paint paint2 = this.f394746c;
        paint2.setColor(-2013265920);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(c39924z.a(4));
        invalidate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@j.N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        if (i12 == 0) {
            this.f394750g = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i12) {
        this.f394754k = i12;
    }

    public void setMax(float f12) {
        if (f12 > 0.0f) {
            this.f394753j = 360.0f / f12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            float r0 = r2.f394752i
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L15
            return
        L15:
            float r1 = r2.f394751h
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L21
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.f394750g = r0
        L21:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 * r0
            float r3 = java.lang.Math.min(r3, r0)
            r2.f394752i = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39899q0.setProgress(float):void");
    }

    public void setSize(int i12) {
        this.f394755l = i12;
    }
}
