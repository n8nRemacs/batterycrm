package K21;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;

/* compiled from: RoundedRect.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK21/b;", "LK21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f9221a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f9222b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f9223c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f9224d;

    public b(@k IndicatorParams.d dVar) {
        this.f9221a = dVar;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f9223c = paint;
        this.f9224d = new RectF();
    }

    @Override // K21.c
    public final void a(@k Canvas canvas, @k RectF rectF) {
        IndicatorParams.c cVar = this.f9221a.f370300b;
        IndicatorParams.c.b bVar = (IndicatorParams.c.b) cVar;
        Paint paint = this.f9222b;
        paint.setColor(cVar.getF370295a());
        IndicatorParams.b.C10931b c10931b = bVar.f370296b;
        float f12 = c10931b.f370292c;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        int i12 = bVar.f370298d;
        if (i12 != 0) {
            float f13 = bVar.f370297c;
            if (f13 == 0.0f) {
                return;
            }
            Paint paint2 = this.f9223c;
            paint2.setColor(i12);
            paint2.setStrokeWidth(f13);
            float f14 = c10931b.f370292c;
            canvas.drawRoundRect(rectF, f14, f14, paint2);
        }
    }

    @Override // K21.c
    public final void b(@k Canvas canvas, float f12, float f13, @k IndicatorParams.b bVar, int i12, float f14, int i13) {
        IndicatorParams.b.C10931b c10931b = (IndicatorParams.b.C10931b) bVar;
        Paint paint = this.f9222b;
        paint.setColor(i12);
        RectF rectF = this.f9224d;
        float f15 = c10931b.f370290a / 2.0f;
        rectF.left = f12 - f15;
        float f16 = c10931b.f370291b / 2.0f;
        rectF.top = f13 - f16;
        rectF.right = f15 + f12;
        rectF.bottom = f16 + f13;
        float f17 = c10931b.f370292c;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        if (i13 == 0 || f14 == 0.0f) {
            return;
        }
        Paint paint2 = this.f9223c;
        paint2.setColor(i13);
        paint2.setStrokeWidth(f14);
        canvas.drawRoundRect(rectF, f17, f17, paint2);
    }
}
