package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import e11.C39924z;

/* renamed from: e11.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39880k extends View {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Rect f394623b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Paint f394624c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final LightingColorFilter f394625d;

    /* renamed from: e, reason: collision with root package name */
    public final float f394626e;

    /* renamed from: f, reason: collision with root package name */
    public int f394627f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public Bitmap f394628g;

    /* renamed from: h, reason: collision with root package name */
    public int f394629h;

    /* renamed from: i, reason: collision with root package name */
    public int f394630i;

    public C39880k(@j.N Context context) {
        super(context);
        Paint paint = new Paint();
        this.f394624c = paint;
        paint.setFilterBitmap(true);
        int i12 = C39924z.f394913b;
        this.f394626e = C39924z.a.f394915a;
        this.f394627f = C39924z.c(10, context);
        this.f394623b = new Rect();
        this.f394625d = new LightingColorFilter(-3355444, 1);
    }

    public final void a(@j.P Bitmap bitmap, boolean z12) {
        int width;
        this.f394628g = bitmap;
        if (bitmap == null) {
            width = 0;
            this.f394630i = 0;
        } else if (!z12) {
            this.f394629h = bitmap.getWidth();
            this.f394630i = this.f394628g.getHeight();
            requestLayout();
        } else {
            float f12 = this.f394626e;
            float f13 = f12 > 1.0f ? 2.0f : 1.0f;
            this.f394630i = (int) ((bitmap.getHeight() / f13) * f12);
            width = (int) ((this.f394628g.getWidth() / f13) * f12);
        }
        this.f394629h = width;
        requestLayout();
    }

    public int getPadding() {
        return this.f394627f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f394628g != null) {
            int i12 = this.f394627f;
            Rect rect = this.f394623b;
            rect.left = i12;
            rect.top = i12;
            rect.right = getMeasuredWidth() - this.f394627f;
            rect.bottom = getMeasuredHeight() - this.f394627f;
            canvas.drawBitmap(this.f394628g, (Rect) null, rect, this.f394624c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            int r12 = android.view.View.MeasureSpec.getMode(r12)
            int r2 = r10.f394627f
            int r2 = r2 * 2
            int r3 = r0 - r2
            int r2 = r1 - r2
            android.graphics.Bitmap r4 = r10.f394628g
            if (r4 == 0) goto L64
            int r4 = r10.f394629h
            if (r4 <= 0) goto L64
            int r5 = r10.f394630i
            if (r5 <= 0) goto L64
            float r6 = (float) r4
            float r7 = (float) r5
            float r8 = r6 / r7
            r9 = 1073741824(0x40000000, float:2.0)
            if (r11 != r9) goto L32
            if (r12 != r9) goto L32
            r10.setMeasuredDimension(r0, r1)
            return
        L32:
            if (r11 != 0) goto L39
            if (r12 != 0) goto L39
            r3 = r4
            r2 = r5
            goto L5a
        L39:
            if (r11 != 0) goto L3f
            float r11 = (float) r2
            float r11 = r11 * r8
            int r3 = (int) r11
            goto L5a
        L3f:
            float r11 = (float) r3
            if (r12 != 0) goto L45
        L42:
            float r11 = r11 / r8
            int r2 = (int) r11
            goto L5a
        L45:
            float r12 = r11 / r6
            float r0 = (float) r2
            float r1 = r0 / r7
            float r1 = java.lang.Math.min(r12, r1)
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 != 0) goto L58
            r12 = 0
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 <= 0) goto L58
            goto L42
        L58:
            float r0 = r0 * r8
            int r3 = (int) r0
        L5a:
            int r11 = r10.f394627f
            int r11 = r11 * 2
            int r3 = r3 + r11
            int r2 = r2 + r11
            r10.setMeasuredDimension(r3, r2)
            goto L68
        L64:
            r11 = 0
            r10.setMeasuredDimension(r11, r11)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39880k.onMeasure(int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LightingColorFilter lightingColorFilter;
        int action = motionEvent.getAction();
        Paint paint = this.f394624c;
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                performClick();
            }
            lightingColorFilter = null;
        } else {
            lightingColorFilter = this.f394625d;
        }
        paint.setColorFilter(lightingColorFilter);
        invalidate();
        return true;
    }

    public void setPadding(int i12) {
        this.f394627f = i12;
    }
}
