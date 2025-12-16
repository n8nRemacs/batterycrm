package D31;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.N;

/* loaded from: classes8.dex */
public final class d extends AbstractCoroutineContextElement implements N {
    @Override // kotlinx.coroutines.N
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        th2.getLocalizedMessage();
        th2.printStackTrace();
    }
}
