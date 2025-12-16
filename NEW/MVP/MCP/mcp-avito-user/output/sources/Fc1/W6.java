package Fc1;

import android.os.SystemClock;
import androidx.compose.runtime.InterfaceC22204y1;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class W6 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f5283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a f5284m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(Y41.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f5283l = interfaceC22204y1;
        this.f5284m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        InterfaceC22204y1 interfaceC22204y1 = this.f5283l;
        if (jUptimeMillis - ((Number) interfaceC22204y1.getValue()).longValue() > 1000) {
            this.f5284m.invoke();
        }
        interfaceC22204y1.setValue(Long.valueOf(jUptimeMillis));
        return kotlin.G0.f406611a;
    }
}
