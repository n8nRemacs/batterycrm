package yY0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C22767g;
import j.N;
import j.P;

/* compiled from: ShadowRenderer.java */
@RestrictTo
/* loaded from: classes6.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f443171i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f443172j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f443173k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f443174l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Paint f443175a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Paint f443176b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final Paint f443177c;

    /* renamed from: d, reason: collision with root package name */
    public int f443178d;

    /* renamed from: e, reason: collision with root package name */
    public int f443179e;

    /* renamed from: f, reason: collision with root package name */
    public int f443180f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f443181g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f443182h;

    public b() {
        Paint paint = new Paint();
        this.f443182h = paint;
        this.f443175a = new Paint();
        c(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f443176b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f443177c = new Paint(paint2);
    }

    public final void a(@N Canvas canvas, @P Matrix matrix, @N RectF rectF, int i12, float f12, float f13) {
        boolean z12 = f13 < 0.0f;
        Path path = this.f443181g;
        int[] iArr = f443173k;
        if (z12) {
            iArr[0] = 0;
            iArr[1] = this.f443180f;
            iArr[2] = this.f443179e;
            iArr[3] = this.f443178d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f12, f13);
            path.close();
            float f14 = -i12;
            rectF.inset(f14, f14);
            iArr[0] = 0;
            iArr[1] = this.f443178d;
            iArr[2] = this.f443179e;
            iArr[3] = this.f443180f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f15 = 1.0f - (i12 / fWidth);
        float[] fArr = f443174l;
        fArr[1] = f15;
        fArr[2] = ((1.0f - f15) / 2.0f) + f15;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = this.f443176b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z12) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f443182h);
        }
        canvas.drawArc(rectF, f12, f13, true, paint);
        canvas.restore();
    }

    public final void b(@N Canvas canvas, @P Matrix matrix, @N RectF rectF, int i12) {
        rectF.bottom += i12;
        rectF.offset(0.0f, -i12);
        int[] iArr = f443171i;
        iArr[0] = this.f443180f;
        iArr[1] = this.f443179e;
        iArr[2] = this.f443178d;
        Paint paint = this.f443177c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, f443172j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final void c(int i12) {
        this.f443178d = C22767g.i(i12, 68);
        this.f443179e = C22767g.i(i12, 20);
        this.f443180f = C22767g.i(i12, 0);
        this.f443175a.setColor(this.f443178d);
    }
}
