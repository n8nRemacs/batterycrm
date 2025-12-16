package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ya extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f35893l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f35894m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f35895n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f35896o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f35897p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f35898q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f35899r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f35900s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f35901t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f35902u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f35903v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f35904w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f35905x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f35906y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22369k0 f35907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ya(androidx.compose.ui.layout.K0 k02, boolean z12, float f12, androidx.compose.ui.layout.K0 k03, int i12, float f13, float f14, androidx.compose.ui.layout.K0 k04, int i13, float f15, androidx.compose.ui.layout.K0 k05, int i14, float f16, int i15, InterfaceC22369k0 interfaceC22369k0) {
        super(1);
        this.f35893l = k02;
        this.f35894m = z12;
        this.f35895n = f12;
        this.f35896o = k03;
        this.f35897p = i12;
        this.f35898q = f13;
        this.f35899r = f14;
        this.f35900s = k04;
        this.f35901t = i13;
        this.f35902u = f15;
        this.f35903v = k05;
        this.f35904w = i14;
        this.f35905x = f16;
        this.f35906y = i15;
        this.f35907z = interfaceC22369k0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        float f12 = this.f35902u;
        float f13 = this.f35899r;
        androidx.compose.ui.layout.K0 k02 = this.f35893l;
        if (k02 != null) {
            aVar2.h(k02, (this.f35906y - k02.f40345b) / 2, kotlin.math.b.b((f12 - this.f35907z.y0(Za.f35989e)) + f13), 0.0f);
        }
        if (this.f35894m || this.f35895n != 0.0f) {
            aVar2.h(this.f35896o, this.f35897p, kotlin.math.b.b(this.f35898q + f13), 0.0f);
        }
        aVar2.h(this.f35900s, this.f35901t, kotlin.math.b.b(f12 + f13), 0.0f);
        aVar2.h(this.f35903v, this.f35904w, kotlin.math.b.b(this.f35905x + f13), 0.0f);
        return kotlin.G0.f406611a;
    }
}
