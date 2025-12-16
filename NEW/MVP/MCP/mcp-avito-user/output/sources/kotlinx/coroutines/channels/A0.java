package kotlinx.coroutines.channels;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC43230i1;

/* compiled from: BroadcastChannel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/A0;", "E", "Lkotlinx/coroutines/channels/d;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43230i1
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class A0<E> implements InterfaceC43090d<E> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43092e<E> f410771b = new C43092e<>();

    @Override // kotlinx.coroutines.channels.M0
    public final void g(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        this.f410771b.g(lVar);
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean h(@Y61.l Throwable th2) {
        return this.f410771b.h(th2);
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    public final Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        return this.f410771b.send(e12, continuation);
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(E e12) {
        return this.f410771b.w(e12);
    }
}
