package J21;

import Y61.k;
import Y61.l;
import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ScaleIndicatorAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ21/c;", "LJ21/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f8731a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArgbEvaluator f8732b = new ArgbEvaluator();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SparseArray<Float> f8733c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public int f8734d;

    public c(@k IndicatorParams.d dVar) {
        this.f8731a = dVar;
    }

    public final float a(int i12) {
        return this.f8733c.get(i12, Float.valueOf(0.0f)).floatValue();
    }

    @Override // J21.a
    public final void b(int i12) {
        SparseArray<Float> sparseArray = this.f8733c;
        sparseArray.clear();
        sparseArray.put(i12, Float.valueOf(1.0f));
    }

    @Override // J21.a
    public final float e(int i12) {
        IndicatorParams.d dVar = this.f8731a;
        IndicatorParams.c cVar = dVar.f370300b;
        if (!(cVar instanceof IndicatorParams.c.b)) {
            return 0.0f;
        }
        float f12 = ((IndicatorParams.c.b) dVar.f370301c).f370297c;
        return (a(i12) * (((IndicatorParams.c.b) cVar).f370297c - f12)) + f12;
    }

    @Override // J21.a
    @k
    public final IndicatorParams.b f(int i12) {
        IndicatorParams.d dVar = this.f8731a;
        IndicatorParams.c cVar = dVar.f370300b;
        if (cVar instanceof IndicatorParams.c.a) {
            float f12 = ((IndicatorParams.c.a) dVar.f370301c).f370294b.f370289a;
            return new IndicatorParams.b.a((a(i12) * (((IndicatorParams.c.a) cVar).f370294b.f370289a - f12)) + f12);
        }
        if (!(cVar instanceof IndicatorParams.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        IndicatorParams.c.b bVar = (IndicatorParams.c.b) dVar.f370301c;
        float f13 = bVar.f370296b.f370290a;
        IndicatorParams.c.b bVar2 = (IndicatorParams.c.b) cVar;
        float fA2 = (a(i12) * (bVar2.f370296b.f370290a - f13)) + f13;
        IndicatorParams.b.C10931b c10931b = bVar.f370296b;
        float f14 = c10931b.f370291b;
        float fA3 = (a(i12) * (bVar2.f370296b.f370291b - f14)) + f14;
        float f15 = c10931b.f370292c;
        return new IndicatorParams.b.C10931b(fA2, fA3, (a(i12) * (bVar2.f370296b.f370292c - f15)) + f15);
    }

    @Override // J21.a
    public final int g(int i12) {
        IndicatorParams.d dVar = this.f8731a;
        IndicatorParams.c cVar = dVar.f370300b;
        if (!(cVar instanceof IndicatorParams.c.b)) {
            return 0;
        }
        IndicatorParams.c.b bVar = (IndicatorParams.c.b) dVar.f370301c;
        Object objEvaluate = this.f8732b.evaluate(a(i12), Integer.valueOf(bVar.f370298d), Integer.valueOf(((IndicatorParams.c.b) cVar).f370298d));
        if (objEvaluate != null) {
            return ((Integer) objEvaluate).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    @Override // J21.a
    public final void h(int i12) {
        this.f8734d = i12;
    }

    @Override // J21.a
    public final void i(float f12, int i12) {
        l(1.0f - f12, i12);
        if (i12 < this.f8734d - 1) {
            l(f12, i12 + 1);
        } else {
            l(f12, 0);
        }
    }

    @Override // J21.a
    @l
    public final RectF j(float f12, float f13) {
        return null;
    }

    @Override // J21.a
    public final int k(int i12) {
        float fA2 = a(i12);
        IndicatorParams.d dVar = this.f8731a;
        Object objEvaluate = this.f8732b.evaluate(fA2, Integer.valueOf(dVar.f370301c.getF370295a()), Integer.valueOf(dVar.f370300b.getF370295a()));
        if (objEvaluate != null) {
            return ((Integer) objEvaluate).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final void l(float f12, int i12) {
        SparseArray<Float> sparseArray = this.f8733c;
        if (f12 == 0.0f) {
            sparseArray.remove(i12);
        } else {
            sparseArray.put(i12, Float.valueOf(Math.abs(f12)));
        }
    }
}
