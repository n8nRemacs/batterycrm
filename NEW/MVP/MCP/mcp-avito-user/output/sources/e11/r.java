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

/* loaded from: classes7.dex */
public class r extends View {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Rect f394756b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Paint f394757c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final LightingColorFilter f394758d;

    /* renamed from: e, reason: collision with root package name */
    public final float f394759e;

    /* renamed from: f, reason: collision with root package name */
    public final int f394760f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public Bitmap f394761g;

    /* renamed from: h, reason: collision with root package name */
    public int f394762h;

    /* renamed from: i, reason: collision with root package name */
    public int f394763i;

    public r(@j.N Context context) {
        super(context);
        Paint paint = new Paint();
        this.f394757c = paint;
        paint.setFilterBitmap(true);
        int i12 = C39924z.f394913b;
        this.f394759e = C39924z.a.f394915a;
        this.f394760f = C39924z.c(10, context);
        this.f394756b = new Rect();
        this.f394758d = new LightingColorFilter(-3355444, 1);
    }

    public final void a(@j.P Bitmap bitmap, boolean z12) {
        int width;
        this.f394761g = bitmap;
        if (bitmap == null) {
            width = 0;
            this.f394763i = 0;
        } else {
            if (!z12) {
                this.f394762h = bitmap.getWidth();
                this.f394763i = this.f394761g.getHeight();
                int i12 = this.f394762h;
                int i13 = this.f394760f * 2;
                setMeasuredDimension(i12 + i13, this.f394763i + i13);
                requestLayout();
            }
            float f12 = this.f394759e;
            float f13 = f12 > 1.0f ? 2.0f : 1.0f;
            this.f394763i = (int) ((bitmap.getHeight() / f13) * f12);
            width = (int) ((this.f394761g.getWidth() / f13) * f12);
        }
        this.f394762h = width;
        int i122 = this.f394762h;
        int i132 = this.f394760f * 2;
        setMeasuredDimension(i122 + i132, this.f394763i + i132);
        requestLayout();
    }

    public int getPadding() {
        return this.f394760f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f394761g;
        if (bitmap != null) {
            Rect rect = this.f394756b;
            int i12 = this.f394760f;
            rect.left = i12;
            rect.top = i12;
            rect.right = this.f394762h + i12;
            rect.bottom = this.f394763i + i12;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f394757c);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LightingColorFilter lightingColorFilter;
        int action = motionEvent.getAction();
        Paint paint = this.f394757c;
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
            lightingColorFilter = this.f394758d;
        }
        paint.setColorFilter(lightingColorFilter);
        invalidate();
        return true;
    }
}
