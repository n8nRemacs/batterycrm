package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/n;", "it", "Lkotlin/G0;", "invoke-uvyYCjk", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Ab extends kotlin.jvm.internal.N implements Y41.l<l0.n, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f32362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.n> f32363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab(float f12, InterfaceC22204y1<l0.n> interfaceC22204y1) {
        super(1);
        this.f32362l = f12;
        this.f32363m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(l0.n nVar) {
        long j12 = nVar.f413404a;
        float fE2 = l0.n.e(j12);
        float f12 = this.f32362l;
        float f13 = fE2 * f12;
        float fC2 = l0.n.c(j12) * f12;
        InterfaceC22204y1<l0.n> interfaceC22204y1 = this.f32363m;
        if (l0.n.e(interfaceC22204y1.getF42167b().f413404a) != f13 || l0.n.c(interfaceC22204y1.getF42167b().f413404a) != fC2) {
            interfaceC22204y1.setValue(l0.n.a(l0.o.a(f13, fC2)));
        }
        return kotlin.G0.f406611a;
    }
}
