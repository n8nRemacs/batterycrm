package Fc1;

import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: Fc1.u2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13742u2 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13608f2 f5845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5847n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13742u2(int i12, C13608f2 c13608f2, androidx.compose.runtime.snapshots.D d12) {
        super(3);
        this.f5845l = c13608f2;
        this.f5846m = d12;
        this.f5847n = i12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            J6.a(a13, 0);
            int i12 = this.f5847n;
            int i13 = i12 & WebSocketProtocol.PAYLOAD_SHORT;
            C13608f2 c13608f2 = this.f5845l;
            androidx.compose.runtime.snapshots.D<C13602e5> d12 = this.f5846m;
            Y.a(c13608f2, d12, a13, i13);
            L0.a(d12, a13, (i12 >> 3) & 14);
            C13689o2.a(c13608f2, d12, a13, i12 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        return kotlin.G0.f406611a;
    }
}
