package wV;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: LinearDrawingDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV/b;", "LwV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wV.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49563b extends AbstractC49562a {

    /* renamed from: g, reason: collision with root package name */
    public int f441463g;

    /* renamed from: h, reason: collision with root package name */
    public float f441464h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Paint f441465i = new Paint(1);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Path f441466j = new Path();

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RectF f441467k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Paint f441468l = new Paint(1);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Path f441469m = new Path();

    /* renamed from: n, reason: collision with root package name */
    @k
    public final RectF f441470n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    public float f441471o;

    /* renamed from: p, reason: collision with root package name */
    public float f441472p;

    @Override // wV.AbstractC49562a
    public final void a(@k Canvas canvas) {
        float f12 = this.f441464h;
        if (0.01f <= f12 && f12 <= 0.1f) {
            float f13 = this.f441471o;
            float f14 = f12 * f13;
            float f15 = this.f441463g;
            if (f14 < f15) {
                f12 = f15 / f13;
            }
        } else if (0.91f <= f12 && f12 <= 0.99f) {
            float f16 = this.f441471o;
            float f17 = f12 * f16;
            float f18 = this.f441463g;
            if (f17 > f16 - f18) {
                f12 = 1 - (f18 / f16);
            }
        }
        Path path = this.f441466j;
        path.reset();
        Path path2 = this.f441469m;
        path2.reset();
        int i12 = this.f441458b;
        float f19 = this.f441471o;
        float f22 = i12 / 2;
        float f23 = (f19 * f12) - f22;
        float f24 = ((1.0f - f12) * f19) - f22;
        float f25 = i12 + f23;
        RectF rectF = this.f441470n;
        rectF.set(0.0f, 0.0f, f23, this.f441472p);
        RectF rectF2 = this.f441467k;
        rectF2.set(f25, 0.0f, f25 + f24, this.f441472p);
        if (f12 > 0.99f) {
            float f26 = this.f441457a;
            path2.addRoundRect(rectF, f26, f26, Path.Direction.CW);
        } else if (f12 < 0.01f) {
            rectF2.set(0.0f, 0.0f, f24, this.f441472p);
            float f27 = this.f441457a;
            path.addRoundRect(rectF2, f27, f27, Path.Direction.CW);
        } else {
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF, this.f441459c, direction);
            path.addRoundRect(rectF2, this.f441460d, direction);
        }
        canvas.drawPath(path2, this.f441468l);
        canvas.drawPath(path, this.f441465i);
    }

    @Override // wV.AbstractC49562a
    public final void b(@k RectF rectF) {
        this.f441471o = rectF.width();
        this.f441472p = rectF.height();
    }
}
