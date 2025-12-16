package androidx.compose.ui.tooling;

import androidx.compose.runtime.InterfaceC22196w1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PreviewActivity.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f42744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object[] f42745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC22196w1 interfaceC22196w1, Object[] objArr) {
        super(0);
        this.f42744l = interfaceC22196w1;
        this.f42745m = objArr;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC22196w1 interfaceC22196w1 = this.f42744l;
        interfaceC22196w1.L3((interfaceC22196w1.e() + 1) % this.f42745m.length);
        return G0.f406611a;
    }
}
