package kotlinx.coroutines.rx3;

import kotlin.InterfaceC42730b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.N0;

/* compiled from: RxObservable.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K {
    @Y61.k
    public static final io.reactivex.rxjava3.internal.operators.observable.C a(@Y61.k CoroutineContext coroutineContext, @InterfaceC42730b @Y61.k Y41.p pVar) {
        if (coroutineContext.get(N0.f410716u2) == null) {
            return new io.reactivex.rxjava3.internal.operators.observable.C(new J(D0.f410691b, coroutineContext, pVar, 0));
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }
}
