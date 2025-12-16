package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21509d2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f36179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f36180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f36181n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21509d2(long j12, androidx.compose.foundation.layout.T1 t12, C22096n c22096n) {
        super(2);
        this.f36179l = j12;
        this.f36180m = t12;
        this.f36181n = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21859s9.f37272a.getClass();
            Vc.a(this.f36179l, C21859s9.b(a13).f35319m, androidx.compose.runtime.internal.r.b(a13, 1327513942, new C21486c2(this.f36180m, this.f36181n)), a13, 384);
        }
        return kotlin.G0.f406611a;
    }
}
