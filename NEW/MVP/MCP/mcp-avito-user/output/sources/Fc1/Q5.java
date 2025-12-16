package Fc1;

import androidx.compose.runtime.InterfaceC22204y1;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Q5 extends kotlin.jvm.internal.N implements Y41.l<Object, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Object> f5157l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, kotlin.G0> f5158m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f5157l = interfaceC22204y1;
        this.f5158m = lVar;
    }

    @Override // Y41.l
    @Y61.k
    public final Object invoke(@Y61.k Object obj) {
        boolean z12 = obj instanceof kotlin.G0;
        InterfaceC22204y1<Object> interfaceC22204y1 = this.f5157l;
        if (z12) {
            return interfaceC22204y1.getF42167b();
        }
        interfaceC22204y1.setValue(obj);
        this.f5158m.invoke(obj);
        return kotlin.G0.f406611a;
    }
}
