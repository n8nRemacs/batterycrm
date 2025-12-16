package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.collection.e<InterfaceC22367j0> f28515l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(androidx.compose.runtime.collection.e<InterfaceC22367j0> eVar) {
        super(1);
        this.f28515l = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        androidx.compose.runtime.collection.e<InterfaceC22367j0> eVar = this.f28515l;
        InterfaceC22367j0[] interfaceC22367j0Arr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            interfaceC22367j0Arr[i13].u();
        }
        return kotlin.G0.f406611a;
    }
}
