package D31;

import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;

/* loaded from: classes8.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f2879l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.f2879l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        return U.a(K.f411877a.plus(t1.b()).plus((kotlinx.coroutines.N) this.f2879l.f2882c.getValue()));
    }
}
