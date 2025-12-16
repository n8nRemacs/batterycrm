package J21;

import Y61.k;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.ranges.s;

/* compiled from: SliderIndicatorAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ21/d;", "LJ21/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f8735a;

    /* renamed from: b, reason: collision with root package name */
    public float f8736b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f8737c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    public float f8738d;

    /* renamed from: e, reason: collision with root package name */
    public float f8739e;

    public d(@k IndicatorParams.d dVar) {
        this.f8735a = dVar;
    }

    @Override // J21.a
    public final void c(float f12) {
        this.f8738d = f12;
    }

    @Override // J21.a
    public final void d(float f12) {
        this.f8739e = f12;
    }

    @Override // J21.a
    public final float e(int i12) {
        IndicatorParams.c cVar = this.f8735a.f370301c;
        if (cVar instanceof IndicatorParams.c.b) {
            return ((IndicatorParams.c.b) cVar).f370297c;
        }
        return 0.0f;
    }

    @Override // J21.a
    @k
    public final IndicatorParams.b f(int i12) {
        return this.f8735a.f370301c.b();
    }

    @Override // J21.a
    public final int g(int i12) {
        IndicatorParams.c cVar = this.f8735a.f370301c;
        if (cVar instanceof IndicatorParams.c.b) {
            return ((IndicatorParams.c.b) cVar).f370298d;
        }
        return 0;
    }

    @Override // J21.a
    public final void i(float f12, int i12) {
        this.f8736b = f12;
    }

    @Override // J21.a
    @k
    public final RectF j(float f12, float f13) {
        float fB2 = this.f8739e;
        IndicatorParams.c cVar = this.f8735a.f370300b;
        if (fB2 == 0.0f) {
            fB2 = cVar.b().b();
        }
        RectF rectF = this.f8737c;
        float f14 = fB2 / 2.0f;
        rectF.left = (s.a(this.f8738d * this.f8736b, 0.0f) + f12) - f14;
        rectF.top = f13 - (cVar.b().a() / 2.0f);
        float f15 = this.f8738d;
        rectF.right = s.c(this.f8736b * f15, f15) + f12 + f14;
        rectF.bottom = (cVar.b().a() / 2.0f) + f13;
        return rectF;
    }

    @Override // J21.a
    public final int k(int i12) {
        return this.f8735a.f370301c.getF370295a();
    }

    @Override // J21.a
    public final void b(int i12) {
    }

    @Override // J21.a
    public final void h(int i12) {
    }
}
