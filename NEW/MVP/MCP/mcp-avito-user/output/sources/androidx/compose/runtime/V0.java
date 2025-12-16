package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/V0;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface V0 extends CoroutineContext.Element {

    /* renamed from: w1, reason: collision with root package name */
    @Y61.k
    public static final b f38155w1 = b.f38156b;

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/V0$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/V0;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements CoroutineContext.Key<V0> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f38156b = new b();
    }

    @Y61.l
    <R> Object N(@Y61.k Y41.l<? super Long, ? extends R> lVar, @Y61.k Continuation<? super R> continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    default CoroutineContext.Key<?> getKey() {
        return f38155w1;
    }
}
