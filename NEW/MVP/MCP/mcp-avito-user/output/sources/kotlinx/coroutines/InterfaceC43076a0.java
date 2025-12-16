package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Deferred.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/a0;", "T", "Lkotlinx/coroutines/N0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43076a0<T> extends N0 {

    /* compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.a0$a */
    public static final class a {
    }

    @Y61.l
    Object F(@Y61.k Continuation<? super T> continuation);

    @B0
    T i();
}
