package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;

/* loaded from: classes2.dex */
public final class fr0 {
    public final int a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Path h;
    public final int i;
    public final RectF j;
    public final RectF k;
    public final float[] l;
    public float m;
    public final RangeSeekBarView n;

    public fr0(int i, Context context, RangeSeekBarView rangeSeekBarView) {
        this.i = i;
        this.n = rangeSeekBarView;
        rw4 rw4VarA = rw4.a();
        int i2 = rw4VarA.j;
        this.a = i2;
        int i3 = rw4VarA.r;
        this.d = i2;
        int i4 = rw4VarA.d;
        this.e = i4;
        this.f = i2;
        this.g = s34.a(context, gvd.b);
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(q1gVarD.o);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(q1gVarD.w);
        paint2.setStrokeWidth(rw4VarA.b);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        this.h = new Path();
        if (i == 1) {
            this.j = new RectF(rangeSeekBarView.b(0.0f) - i2, 0.0f, rangeSeekBarView.b(0.0f), i3);
            float f = i4;
            this.l = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        } else {
            this.j = new RectF(rangeSeekBarView.b(1.0f), 0.0f, rangeSeekBarView.b(1.0f) + i2, i3);
            float f2 = i4;
            this.l = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
        }
        RectF rectF = this.j;
        float f3 = i2;
        this.k = new RectF(rectF.left - f3, rectF.top, rectF.right + f3, rectF.bottom);
    }

    public final void a(Canvas canvas) {
        Path path = this.h;
        path.reset();
        float[] fArr = this.l;
        Path.Direction direction = Path.Direction.CW;
        RectF rectF = this.j;
        path.addRoundRect(rectF, fArr, direction);
        int i = this.i;
        int i2 = this.g;
        int i3 = this.e;
        Paint paint = this.b;
        if (i == 0) {
            paint.setShadowLayer(i3, -1.0f, 0.0f, i2);
        } else {
            paint.setShadowLayer(i3, 1.0f, 0.0f, i2);
        }
        canvas.drawPath(path, paint);
        float f = this.f / 2.0f;
        canvas.drawLine(rectF.centerX(), rectF.centerY() - f, rectF.centerX(), rectF.centerY() + f, this.c);
    }

    public final float b() {
        int i = this.i;
        RectF rectF = this.j;
        RangeSeekBarView rangeSeekBarView = this.n;
        return i == 0 ? rangeSeekBarView.c(rectF.right) : rangeSeekBarView.c(rectF.left);
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RangeSeekBarView rangeSeekBarView = this.n;
        if (action == 0) {
            this.m = rangeSeekBarView.b(b()) - motionEvent.getX();
        } else {
            if (action != 2) {
                return;
            }
            e(rangeSeekBarView.c(motionEvent.getX() + this.m));
        }
    }

    public final void d() {
        int i = this.i;
        int i2 = this.d;
        RectF rectF = this.j;
        RectF rectF2 = this.k;
        if (i == 0) {
            rectF2.set(rectF.left - i2, rectF.top, rectF.right, rectF.bottom);
        } else {
            rectF2.set(rectF.left, rectF.top, rectF.right + i2, rectF.bottom);
        }
    }

    public final void e(float f) {
        int i = this.i;
        int i2 = this.d;
        RangeSeekBarView rangeSeekBarView = this.n;
        float fB = i == 0 ? rangeSeekBarView.b(f) - this.a : rangeSeekBarView.b(f);
        float f2 = fB - i2;
        RectF rectF = this.j;
        rectF.offsetTo(fB, rectF.top);
        RectF rectF2 = this.k;
        rectF2.offsetTo(f2, rectF2.top);
    }
}
