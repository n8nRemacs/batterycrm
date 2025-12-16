package J21;

import Y61.k;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.ranges.s;

/* compiled from: WormIndicatorAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ21/e;", "LJ21/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f8740a;

    /* renamed from: b, reason: collision with root package name */
    public float f8741b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f8742c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    public float f8743d;

    /* renamed from: e, reason: collision with root package name */
    public float f8744e;

    public e(@k IndicatorParams.d dVar) {
        this.f8740a = dVar;
    }

    @Override // J21.a
    public final void c(float f12) {
        this.f8743d = f12;
    }

    @Override // J21.a
    public final void d(float f12) {
        this.f8744e = f12;
    }

    @Override // J21.a
    public final float e(int i12) {
        IndicatorParams.c cVar = this.f8740a.f370301c;
        if (cVar instanceof IndicatorParams.c.b) {
            return ((IndicatorParams.c.b) cVar).f370297c;
        }
        return 0.0f;
    }

    @Override // J21.a
    @k
    public final IndicatorParams.b f(int i12) {
        return this.f8740a.f370301c.b();
    }

    @Override // J21.a
    public final int g(int i12) {
        IndicatorParams.c cVar = this.f8740a.f370301c;
        if (cVar instanceof IndicatorParams.c.b) {
            return ((IndicatorParams.c.b) cVar).f370298d;
        }
        return 0;
    }

    @Override // J21.a
    public final void i(float f12, int i12) {
        this.f8741b = f12;
    }

    @Override // J21.a
    @k
    public final RectF j(float f12, float f13) {
        float fB2 = this.f8744e;
        IndicatorParams.c cVar = this.f8740a.f370300b;
        if (fB2 == 0.0f) {
            fB2 = cVar.b().b();
        }
        RectF rectF = this.f8742c;
        rectF.top = f13 - (cVar.b().a() / 2.0f);
        float f14 = this.f8743d;
        float f15 = fB2 / 2.0f;
        rectF.right = s.c(this.f8741b * f14 * 2.0f, f14) + f12 + f15;
        rectF.bottom = (cVar.b().a() / 2.0f) + f13;
        rectF.left = (s.a(((this.f8741b - 0.5f) * this.f8743d) * 2.0f, 0.0f) + f12) - f15;
        return rectF;
    }

    @Override // J21.a
    public final int k(int i12) {
        return this.f8740a.f370301c.getF370295a();
    }

    @Override // J21.a
    public final void b(int i12) {
    }

    @Override // J21.a
    public final void h(int i12) {
    }
}
