package Z51;

import Y41.p;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class d extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f19897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f19898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f19897l = interfaceC22204y1;
        this.f19898m = interfaceC22204y12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        this.f19897l.setValue((String) obj);
        this.f19898m.setValue(bool);
        return G0.f406611a;
    }
}
