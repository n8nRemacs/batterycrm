package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22034b2;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z8 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U8 f33389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H4<U8> f33390m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(U8 u82, H4<U8> h42) {
        super(0);
        this.f33389l = u82;
        this.f33390m = h42;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        H4<U8> h42 = this.f33390m;
        Object obj = h42.f32709a;
        U8 u82 = this.f33389l;
        if (!kotlin.jvm.internal.L.f(u82, obj)) {
            C42745f0.l0(new Y8(u82), h42.f32710b);
            InterfaceC22034b2 interfaceC22034b2 = h42.f32711c;
            if (interfaceC22034b2 != null) {
                interfaceC22034b2.invalidate();
            }
        }
        return kotlin.G0.f406611a;
    }
}
