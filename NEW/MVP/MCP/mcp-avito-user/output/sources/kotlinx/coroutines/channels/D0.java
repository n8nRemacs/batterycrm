package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/D0;", "E", "Lkotlinx/coroutines/channels/a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class D0<E> extends C43084a<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f410784f = 0;

    public D0() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.C43124x, kotlinx.coroutines.V0, kotlinx.coroutines.channels.M0
    public final boolean h(@Y61.l Throwable th2) {
        boolean zH2 = super.h(th2);
        start();
        return zH2;
    }

    @Override // kotlinx.coroutines.channels.C43124x, kotlinx.coroutines.channels.M0
    @Y61.l
    public final Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        start();
        Object objSend = super.send(e12, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.channels.C43124x, kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(E e12) {
        start();
        return super.w(e12);
    }

    @Override // kotlinx.coroutines.V0
    public final void w0() {
        F51.a.a(null, this);
    }
}
