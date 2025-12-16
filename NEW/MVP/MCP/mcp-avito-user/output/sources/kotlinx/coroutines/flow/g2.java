package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbstractC43163a;
import kotlinx.coroutines.flow.internal.AbstractC43165c;

/* compiled from: SharedFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/g2;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/e2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g2 extends AbstractC43165c<e2<?>> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    public long f411406a = -1;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public kotlinx.coroutines.r f411407b;

    @Override // kotlinx.coroutines.flow.internal.AbstractC43165c
    public final boolean a(AbstractC43163a abstractC43163a) {
        e2 e2Var = (e2) abstractC43163a;
        if (this.f411406a >= 0) {
            return false;
        }
        long j12 = e2Var.f411366j;
        if (j12 < e2Var.f411367k) {
            e2Var.f411367k = j12;
        }
        this.f411406a = j12;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43165c
    public final Continuation[] b(AbstractC43163a abstractC43163a) {
        long j12 = this.f411406a;
        this.f411406a = -1L;
        this.f411407b = null;
        return ((e2) abstractC43163a).q(j12);
    }
}
