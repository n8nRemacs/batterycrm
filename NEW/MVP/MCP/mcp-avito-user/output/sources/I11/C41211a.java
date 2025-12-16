package i11;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f;
import j.N;
import j.P;

/* renamed from: i11.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C41211a extends View {

    /* renamed from: g, reason: collision with root package name */
    public static final Paint f398342g;

    /* renamed from: b, reason: collision with root package name */
    public int f398343b;

    /* renamed from: c, reason: collision with root package name */
    public float f398344c;

    /* renamed from: d, reason: collision with root package name */
    public float f398345d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Bitmap f398346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f398347f;

    static {
        Paint paint = new Paint();
        f398342g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    @N
    public final Path a(float f12, int i12, int i13) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        for (int i14 = 0; i14 < i13; i14++) {
            float f13 = i14;
            double d12 = (f13 * this.f398344c) + (f13 * f12 * 2.0f) + i12 + f12;
            double d13 = f12;
            float f14 = 2.0f * f12;
            path.moveTo((float) r.b(0.0d, d13, d12), f14 - ((float) ((Math.cos(0.0d) * d13) + d13)));
            double d14 = 0.45f * f12;
            path.lineTo((float) r.b(0.6283185307179586d, d14, d12), f14 - ((float) ((Math.cos(0.6283185307179586d) * d14) + d13)));
            for (int i15 = 1; i15 < 5; i15++) {
                double d15 = i15 * 1.2566370614359172d;
                path.lineTo((float) r.b(d15, d13, d12), f14 - ((float) ((Math.cos(d15) * d13) + d13)));
                double d16 = d15 + 0.6283185307179586d;
                path.lineTo((float) r.b(d16, d14, d12), f14 - ((float) ((Math.cos(d16) * d14) + d13)));
            }
        }
        path.close();
        return path;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f398345d > 0.0f) {
            Bitmap bitmap = this.f398346e;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                if (this.f398343b <= 0 || this.f398347f) {
                    return;
                }
                this.f398347f = true;
                post(new f(this, 28));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = this.f398343b;
        if (size <= 0) {
            size = View.MeasureSpec.getSize(i13);
            this.f398343b = size;
        }
        setMeasuredDimension((int) ((this.f398344c * 4.0f) + (size * 5)), size);
    }

    public void setRating(float f12) {
        setContentDescription(Float.toString(f12));
        if (f12 > 5.0f || f12 < 0.0f) {
            this.f398345d = 0.0f;
        } else {
            this.f398345d = f12;
        }
        invalidate();
    }

    public void setStarSize(int i12) {
        this.f398343b = i12;
    }

    public void setStarsPadding(float f12) {
        this.f398344c = f12;
    }
}
