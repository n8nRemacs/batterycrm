package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.InterfaceC41770c;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC43075a;

/* compiled from: RxCompletable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/rx3/u;", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43297u extends AbstractC43075a<G0> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41770c f412124e;

    public C43297u(@Y61.k CoroutineContext coroutineContext, @Y61.k InterfaceC41770c interfaceC41770c) {
        super(coroutineContext, false, true);
        this.f412124e = interfaceC41770c;
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        try {
            if (this.f412124e.g(th2)) {
                return;
            }
        } catch (Throwable th3) {
            C42833p.a(th2, th3);
        }
        C43294q.a(this.f410748d, th2);
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(G0 g02) {
        try {
            this.f412124e.e();
        } catch (Throwable th2) {
            C43294q.a(this.f410748d, th2);
        }
    }
}
