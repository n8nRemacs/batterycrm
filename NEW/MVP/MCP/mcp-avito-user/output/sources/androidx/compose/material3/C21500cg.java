package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22034b2;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21500cg extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xf f36173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E7<Xf> f36174m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21500cg(Xf xf2, E7<Xf> e72) {
        super(0);
        this.f36173l = xf2;
        this.f36174m = e72;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        E7<Xf> e72 = this.f36174m;
        Object obj = e72.f34667a;
        Xf xf2 = this.f36173l;
        if (!kotlin.jvm.internal.L.f(xf2, obj)) {
            C42745f0.l0(new C21477bg(xf2), e72.f34668b);
            InterfaceC22034b2 interfaceC22034b2 = e72.f34669c;
            if (interfaceC22034b2 != null) {
                interfaceC22034b2.invalidate();
            }
        }
        return kotlin.G0.f406611a;
    }
}
