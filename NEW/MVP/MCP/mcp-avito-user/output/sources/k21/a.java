package K21;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;

/* compiled from: Circle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK21/a;", "LK21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f9218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f9219b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f9220c = new RectF();

    public a(@k IndicatorParams.d dVar) {
        this.f9218a = dVar;
    }

    @Override // K21.c
    public final void a(@k Canvas canvas, @k RectF rectF) {
        Paint paint = this.f9219b;
        paint.setColor(this.f9218a.f370300b.getF370295a());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, paint);
    }

    @Override // K21.c
    public final void b(@k Canvas canvas, float f12, float f13, @k IndicatorParams.b bVar, int i12, float f14, int i13) {
        IndicatorParams.b.a aVar = (IndicatorParams.b.a) bVar;
        Paint paint = this.f9219b;
        paint.setColor(i12);
        RectF rectF = this.f9220c;
        float f15 = aVar.f370289a;
        rectF.left = f12 - f15;
        rectF.top = f13 - f15;
        rectF.right = f12 + f15;
        rectF.bottom = f13 + f15;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), aVar.f370289a, paint);
    }
}
