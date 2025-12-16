package tc1;

import Y41.l;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a f439341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f439342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f439341l = aVar;
        this.f439342m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        this.f439342m.setValue(Boolean.TRUE);
        Y41.a aVar = this.f439341l;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
