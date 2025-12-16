package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21496cc extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36142l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36143m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f36144n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36145o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f36146p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f36147q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f36148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f36150t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f36151u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36152v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f36153w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f36154x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f36155y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22369k0 f36156z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21496cc(androidx.compose.ui.layout.K0 k02, boolean z12, float f12, androidx.compose.ui.layout.K0 k03, int i12, float f13, float f14, androidx.compose.ui.layout.K0 k04, int i13, float f15, androidx.compose.ui.layout.K0 k05, int i14, float f16, int i15, InterfaceC22369k0 interfaceC22369k0) {
        super(1);
        this.f36142l = k02;
        this.f36143m = z12;
        this.f36144n = f12;
        this.f36145o = k03;
        this.f36146p = i12;
        this.f36147q = f13;
        this.f36148r = f14;
        this.f36149s = k04;
        this.f36150t = i13;
        this.f36151u = f15;
        this.f36152v = k05;
        this.f36153w = i14;
        this.f36154x = f16;
        this.f36155y = i15;
        this.f36156z = interfaceC22369k0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        float f12 = this.f36151u;
        float f13 = this.f36148r;
        androidx.compose.ui.layout.K0 k02 = this.f36142l;
        if (k02 != null) {
            aVar2.h(k02, (this.f36155y - k02.f40345b) / 2, kotlin.math.b.b((f12 - this.f36156z.M0(C21519dc.f36209e)) + f13), 0.0f);
        }
        if (this.f36143m || this.f36144n != 0.0f) {
            aVar2.h(this.f36145o, this.f36146p, kotlin.math.b.b(this.f36147q + f13), 0.0f);
        }
        aVar2.h(this.f36149s, this.f36150t, kotlin.math.b.b(f12 + f13), 0.0f);
        aVar2.h(this.f36152v, this.f36153w, kotlin.math.b.b(this.f36154x + f13), 0.0f);
        return kotlin.G0.f406611a;
    }
}
