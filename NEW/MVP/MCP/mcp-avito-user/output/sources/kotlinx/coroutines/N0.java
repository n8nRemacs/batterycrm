package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/N0;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface N0 extends CoroutineContext.Element {

    /* renamed from: u2, reason: collision with root package name */
    @Y61.k
    public static final b f410716u2 = b.f410717b;

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/N0$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/N0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements CoroutineContext.Key<N0> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f410717b = new b();
    }

    @Y61.l
    Object A(@Y61.k Continuation<? super kotlin.G0> continuation);

    @I0
    @Y61.k
    CancellationException J();

    @I0
    @Y61.k
    InterfaceC43308w L(@Y61.k V0 v02);

    @I0
    @Y61.k
    InterfaceC43268o0 Q(boolean z12, boolean z13, @Y61.k Y41.l<? super Throwable, kotlin.G0> lVar);

    void c(@Y61.l CancellationException cancellationException);

    boolean c0();

    @Y61.k
    InterfaceC43030m<N0> getChildren();

    @Y61.l
    N0 getParent();

    boolean isActive();

    boolean isCancelled();

    @Y61.k
    InterfaceC43268o0 k(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar);

    boolean start();
}
