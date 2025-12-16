package kotlinx.coroutines.rx3;

import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43082c0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: RxScheduler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/rx3/U;", "Lkotlinx/coroutines/M;", "Lkotlinx/coroutines/c0;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U extends kotlinx.coroutines.M implements InterfaceC43082c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f412070d = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f412071c;

    public U(@Y61.k io.reactivex.rxjava3.core.H h12) {
        this.f412071c = h12;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof U) && ((U) obj).f412071c == this.f412071c;
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, @Y61.k final kotlinx.coroutines.r rVar) {
        rVar.r(new C43291n(this.f412071c.e(new Runnable() { // from class: kotlinx.coroutines.rx3.S
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = U.f412070d;
                rVar.B(this, G0.f406611a);
            }
        }, j12, TimeUnit.MILLISECONDS)));
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    @Y61.k
    public final InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        final io.reactivex.rxjava3.disposables.d dVarE = this.f412071c.e(runnable, j12, TimeUnit.MILLISECONDS);
        return new InterfaceC43268o0() { // from class: kotlinx.coroutines.rx3.T
            @Override // kotlinx.coroutines.InterfaceC43268o0
            public final void dispose() {
                int i12 = U.f412070d;
                dVarE.dispose();
            }
        };
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        this.f412071c.d(runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f412071c);
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return this.f412071c.toString();
    }
}
