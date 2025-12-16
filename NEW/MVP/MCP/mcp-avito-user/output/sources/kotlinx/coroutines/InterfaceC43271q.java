package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/q;", "T", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43271q<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.q$a */
    public static final class a {
    }

    @B0
    void C(@Y61.l Y41.l lVar, Object obj);

    @I0
    void I(@Y61.k Object obj);

    boolean f(@Y61.l Throwable th2);

    boolean isActive();

    @I0
    @Y61.l
    kotlinx.coroutines.internal.a0 t(@Y61.l Y41.l lVar, Object obj);
}
