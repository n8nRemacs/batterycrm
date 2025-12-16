package kotlinx.coroutines.rx3;

import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC43075a;

/* compiled from: RxSingle.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/rx3/P;", "", "T", "Lkotlinx/coroutines/a;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class P<T> extends AbstractC43075a<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.K<T> f412066e;

    public P(@Y61.k CoroutineContext coroutineContext, @Y61.k io.reactivex.rxjava3.core.K<T> k12) {
        super(coroutineContext, false, true);
        this.f412066e = k12;
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        try {
            if (this.f412066e.g(th2)) {
                return;
            }
        } catch (Throwable th3) {
            C42833p.a(th2, th3);
        }
        C43294q.a(this.f410748d, th2);
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(@Y61.k T t12) {
        try {
            this.f412066e.onSuccess(t12);
        } catch (Throwable th2) {
            C43294q.a(this.f410748d, th2);
        }
    }
}
