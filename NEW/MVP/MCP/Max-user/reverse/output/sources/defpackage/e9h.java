package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class e9h extends View implements u6g {
    public c9h A0;
    public d9h B0;
    public Bitmap C0;
    public int a;
    public Bitmap b;
    public float c;
    public final Paint d;
    public final Paint o;
    public final float s0;
    public final float t0;
    public final Paint u0;
    public final Paint v0;
    public final RectF w0;
    public final RectF x0;
    public final float y0;
    public final Path z0;

    public e9h(Context context) {
        super(context, null);
        this.d = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(getBorderColor());
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
        this.o = paint;
        this.s0 = (vw4.d().getDisplayMetrics().density * 5.0f) / 2.0f;
        this.t0 = vw4.d().getDisplayMetrics().density * 5.0f;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(getCursorColor());
        this.u0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(getCursorBorderColor());
        paint3.setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
        this.v0 = paint3;
        this.w0 = new RectF();
        this.x0 = new RectF();
        this.y0 = vw4.d().getDisplayMetrics().density * 10.0f;
        this.z0 = new Path();
    }

    private final int getBorderColor() {
        return a93.s0.y(this).i().h;
    }

    private final int getCursorBorderColor() {
        return a93.s0.y(this).i().c;
    }

    private final int getCursorColor() {
        return a93.s0.y(this).i().h;
    }

    public final int a(int i, int i2) {
        int iMin = Math.min((i - getPaddingLeft()) - getPaddingRight(), ((i2 - getPaddingTop()) - getPaddingBottom()) - kti.d(6 * vw4.d().getDisplayMetrics().density));
        if (iMin < 1) {
            return 1;
        }
        return iMin;
    }

    public final Bitmap getFramesListBitmap() {
        return this.b;
    }

    public final float getProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iA = a(getWidth(), getHeight());
        float height = (getHeight() - iA) / 2.0f;
        int iSave = canvas.save();
        canvas.clipPath(this.z0);
        try {
            Bitmap bitmap = this.b;
            Paint paint = this.d;
            if (bitmap == null || (bitmap != null && bitmap.isRecycled())) {
                Bitmap bitmap2 = this.C0;
                if (bitmap2 != null) {
                    int i = this.a + 2;
                    for (int i2 = 0; i2 < i; i2++) {
                        int paddingLeft = (i2 * iA) + getPaddingLeft();
                        if (!bitmap2.isRecycled()) {
                            canvas.drawBitmap(bitmap2, paddingLeft, height, paint);
                        }
                    }
                }
            } else {
                Bitmap bitmap3 = this.b;
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    canvas.drawBitmap(bitmap3, getLeft() + getPaddingLeft(), height, paint);
                }
            }
            canvas.restoreToCount(iSave);
            float f = this.y0;
            Paint paint2 = this.o;
            RectF rectF = this.x0;
            canvas.drawRoundRect(rectF, f, f, paint2);
            float fWidth = rectF.width();
            float f2 = this.c * fWidth;
            float f3 = this.s0;
            float fB = n7j.b(f2, f3, fWidth - f3) + rectF.left;
            Paint paint3 = this.v0;
            float strokeWidth = paint3.getStrokeWidth() / 2.0f;
            float f4 = fB - f3;
            float paddingTop = getPaddingTop() + strokeWidth;
            float f5 = fB + f3;
            float height2 = (getHeight() - strokeWidth) - getPaddingBottom();
            RectF rectF2 = this.w0;
            rectF2.set(f4, paddingTop, f5, height2);
            Paint paint4 = this.u0;
            float f6 = this.t0;
            canvas.drawRoundRect(rectF2, f6, f6, paint4);
            canvas.drawRoundRect(rectF2, f6, f6, paint3);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int iA = a(i, i2);
        int paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) / iA;
        if (paddingLeft < 1) {
            paddingLeft = 1;
        }
        this.a = paddingLeft;
        c9h c9hVar = this.A0;
        if (c9hVar != null) {
            VideoMessageWidget videoMessageWidget = (VideoMessageWidget) ((ehg) c9hVar).b;
            yy7[] yy7VarArr = VideoMessageWidget.H0;
            x9h x9hVarG0 = videoMessageWidget.G0();
            x9hVarG0.t0 = paddingLeft + 2;
            x9hVarG0.u0 = iA;
        }
        float strokeWidth = this.o.getStrokeWidth() / 2.0f;
        this.x0.setEmpty();
        this.x0.set(getPaddingLeft() + strokeWidth, (vw4.d().getDisplayMetrics().density * 2.0f) + strokeWidth + getPaddingTop(), (i - strokeWidth) - getPaddingRight(), ((i2 - strokeWidth) - (vw4.d().getDisplayMetrics().density * 2.0f)) - getPaddingBottom());
        this.z0.reset();
        Path path = this.z0;
        RectF rectF = this.x0;
        float f = this.y0;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.o.setColor(getBorderColor());
        this.u0.setColor(getCursorColor());
        this.v0.setColor(getCursorBorderColor());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float width = getWidth();
        float f = this.s0;
        float fB = n7j.b(n7j.b(x, f, width - f) / getWidth(), 0.0f, 1.0f);
        int action = motionEvent.getAction();
        if (action == 0) {
            setProgress(fB);
            d9h d9hVar = this.B0;
            if (d9hVar != null) {
                float f2 = this.c;
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) ((ulc) d9hVar).b;
                yy7[] yy7VarArr = VideoMessageWidget.H0;
                xfh.r(videoMessageWidget.G0().s0, new w5h(f2));
            }
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                setProgress(fB);
                d9h d9hVar2 = this.B0;
                if (d9hVar2 != null) {
                    float f3 = this.c;
                    VideoMessageWidget videoMessageWidget2 = (VideoMessageWidget) ((ulc) d9hVar2).b;
                    yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                    xfh.r(videoMessageWidget2.G0().s0, new v5h(f3));
                }
                invalidate();
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        setProgress(fB);
        d9h d9hVar3 = this.B0;
        if (d9hVar3 != null) {
            VideoMessageWidget videoMessageWidget3 = (VideoMessageWidget) ((ulc) d9hVar3).b;
            yy7[] yy7VarArr3 = VideoMessageWidget.H0;
            xfh.r(videoMessageWidget3.G0().s0, u5h.b);
        }
        invalidate();
        return true;
    }

    public final void setFramesListBitmap(Bitmap bitmap) {
        this.b = bitmap;
    }

    public final void setFramesProvider(c9h c9hVar) {
        this.A0 = c9hVar;
    }

    public final void setPreviewBitmap(Bitmap bitmap) {
        if (fni.a(bitmap, this.C0)) {
            return;
        }
        this.C0 = bitmap;
    }

    public final void setProgress(float f) {
        this.c = f;
        invalidate();
    }

    public final void setSeekListener(d9h d9hVar) {
        this.B0 = d9hVar;
    }
}
