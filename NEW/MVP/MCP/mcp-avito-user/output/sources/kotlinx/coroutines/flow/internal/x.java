package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/x;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class x implements Continuation<Object> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final x f411580b = new x();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final EmptyCoroutineContext f411581c = EmptyCoroutineContext.INSTANCE;

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411447c() {
        return f411581c;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
    }
}
