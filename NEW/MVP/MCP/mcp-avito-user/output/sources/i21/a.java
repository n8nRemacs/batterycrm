package I21;

import K21.c;
import Y61.k;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IndicatorsStripDrawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI21/a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IndicatorParams.d f7881a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f7882b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final J21.a f7883c;

    /* renamed from: d, reason: collision with root package name */
    public int f7884d;

    /* renamed from: e, reason: collision with root package name */
    public int f7885e;

    /* renamed from: f, reason: collision with root package name */
    public float f7886f;

    /* renamed from: g, reason: collision with root package name */
    public float f7887g;

    /* renamed from: h, reason: collision with root package name */
    public float f7888h;

    /* renamed from: i, reason: collision with root package name */
    public float f7889i;

    /* renamed from: j, reason: collision with root package name */
    public int f7890j;

    /* renamed from: k, reason: collision with root package name */
    public int f7891k;

    /* renamed from: l, reason: collision with root package name */
    public int f7892l;

    /* renamed from: m, reason: collision with root package name */
    public float f7893m;

    /* renamed from: n, reason: collision with root package name */
    public float f7894n;

    /* renamed from: o, reason: collision with root package name */
    public int f7895o;

    /* renamed from: p, reason: collision with root package name */
    public int f7896p;

    public a(@k IndicatorParams.d dVar, @k c cVar, @k J21.a aVar) {
        this.f7881a = dVar;
        this.f7882b = cVar;
        this.f7883c = aVar;
        IndicatorParams.c cVar2 = dVar.f370301c;
        this.f7886f = cVar2.b().b();
        this.f7887g = cVar2.b().b() / 2;
        this.f7889i = 1.0f;
        this.f7896p = this.f7885e - 1;
    }

    public final void a(float f12, int i12) {
        float f13;
        int i13;
        int i14 = this.f7884d;
        int i15 = this.f7885e;
        float f14 = 0.0f;
        if (i14 <= i15) {
            this.f7894n = 0.0f;
        } else {
            int i16 = i15 / 2;
            int i17 = i15 % 2;
            int i18 = (i14 - i16) - i17;
            float f15 = i17 == 0 ? this.f7888h / 2 : 0.0f;
            if (i14 > i15) {
                if (i12 < i16) {
                    f13 = (this.f7888h * i16) + this.f7887g;
                    i13 = this.f7890j / 2;
                } else if (i12 >= i18) {
                    f13 = (this.f7888h * i18) + this.f7887g;
                    i13 = this.f7890j / 2;
                } else {
                    float f16 = this.f7887g;
                    float f17 = this.f7888h;
                    f14 = (((f17 * f12) + ((i12 * f17) + f16)) - (this.f7890j / 2)) - f15;
                }
                f14 = (f13 - i13) - f15;
            }
            this.f7894n = f14;
        }
        float f18 = this.f7894n - this.f7887g;
        float f19 = this.f7888h;
        int i19 = (int) (f18 / f19);
        if (i19 < 0) {
            i19 = 0;
        }
        this.f7895o = i19;
        int i22 = (int) ((this.f7890j / f19) + i19 + 1);
        int i23 = i14 - 1;
        if (i22 > i23) {
            i22 = i23;
        }
        this.f7896p = i22;
    }

    public final void b() {
        int iB2;
        IndicatorParams.d dVar = this.f7881a;
        IndicatorParams.a aVar = dVar.f370303e;
        if (aVar instanceof IndicatorParams.a.C10930a) {
            iB2 = (int) ((this.f7890j - dVar.f370300b.b().b()) / ((IndicatorParams.a.C10930a) aVar).f370286a);
        } else {
            if (!(aVar instanceof IndicatorParams.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            iB2 = ((IndicatorParams.a.b) aVar).f370288b;
        }
        int i12 = this.f7884d;
        if (iB2 > i12) {
            iB2 = i12;
        }
        this.f7885e = iB2;
    }

    public final void c(int i12, int i13) {
        if (i12 == 0 || i13 == 0) {
            return;
        }
        this.f7890j = i12;
        this.f7891k = i13;
        b();
        IndicatorParams.d dVar = this.f7881a;
        IndicatorParams.a aVar = dVar.f370303e;
        if (aVar instanceof IndicatorParams.a.C10930a) {
            this.f7888h = ((IndicatorParams.a.C10930a) aVar).f370286a;
            this.f7889i = 1.0f;
        } else if (aVar instanceof IndicatorParams.a.b) {
            float f12 = this.f7890j;
            float f13 = ((IndicatorParams.a.b) aVar).f370287a;
            float f14 = (f12 + f13) / this.f7885e;
            this.f7888h = f14;
            this.f7889i = (f14 - f13) / dVar.f370300b.b().b();
        }
        this.f7883c.c(this.f7888h);
        this.f7887g = (i12 - (this.f7888h * (this.f7885e - 1))) / 2.0f;
        this.f7886f = i13 / 2.0f;
        a(this.f7893m, this.f7892l);
    }
}
