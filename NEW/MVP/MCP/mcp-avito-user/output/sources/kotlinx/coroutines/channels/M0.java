package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/M0;", "E", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface M0<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void g(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar);

    boolean h(@Y61.l Throwable th2);

    boolean l();

    @Y61.l
    Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation);

    @Y61.k
    Object w(E e12);
}
