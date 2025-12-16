package I81;

import Y41.q;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.InterfaceC22085c;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f8002l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8003m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC22085c interfaceC22085c, int i12) {
        super(3);
        this.f8002l = interfaceC22085c;
        this.f8003m = i12;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        J j12 = (J) obj;
        A a12 = (A) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a12.B(j12) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a12.c()) {
            a12.f();
        } else {
            this.f8002l.invoke(j12, a12, Integer.valueOf((iIntValue & 14) | ((this.f8003m >> 21) & 112)));
        }
        return G0.f406611a;
    }
}
