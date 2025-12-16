package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import d0.C39466o;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class W7 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f35748l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f35749m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(long j12, C22096n c22096n) {
        super(2);
        this.f35748l = j12;
        this.f35749m = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21859s9.f37272a.getClass();
            Pl plB = C21859s9.b(a13);
            C39466o.f393471a.getClass();
            Vc.a(this.f35748l, Ql.a(plB, C39466o.f393472b), androidx.compose.runtime.internal.r.b(a13, -1771489750, new V7(this.f35749m)), a13, 384);
        }
        return kotlin.G0.f406611a;
    }
}
