package androidx.compose.material;

import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A6 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f32344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f32345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32346n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f32347o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f32348p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f32349q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32350r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32351s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6(float f12, androidx.compose.ui.layout.K0 k02, int i12, int i13, int i14, androidx.compose.ui.layout.K0 k03, int i15, int i16) {
        super(1);
        this.f32344l = f12;
        this.f32345m = k02;
        this.f32346n = i12;
        this.f32347o = i13;
        this.f32348p = i14;
        this.f32349q = k03;
        this.f32350r = i15;
        this.f32351s = i16;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        float f12 = this.f32344l;
        int i12 = this.f32348p;
        if (f12 != 0.0f) {
            aVar2.h(this.f32345m, this.f32346n, this.f32347o + i12, 0.0f);
        }
        aVar2.h(this.f32349q, this.f32350r, this.f32351s + i12, 0.0f);
        return kotlin.G0.f406611a;
    }
}
