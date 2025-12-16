package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/N;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface N extends CoroutineContext.Element {

    /* renamed from: t2, reason: collision with root package name */
    @Y61.k
    public static final b f410714t2 = b.f410715b;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/N$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/N;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements CoroutineContext.Key<N> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f410715b = new b();
    }

    void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2);
}
