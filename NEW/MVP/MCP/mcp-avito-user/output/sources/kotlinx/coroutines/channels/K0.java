package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/K0;", "E", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface K0<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    kotlinx.coroutines.selects.j<B<E>> E();

    @Y61.k
    Object H();

    @Y61.l
    Object M(@Y61.k Continuation<? super E> continuation);

    void c(@Y61.l CancellationException cancellationException);

    @Y61.k
    InterfaceC43125y<E> iterator();

    @Y61.l
    Object s(@Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    kotlinx.coroutines.selects.j<E> v();
}
