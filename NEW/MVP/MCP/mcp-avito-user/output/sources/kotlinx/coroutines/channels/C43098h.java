package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.V0;

/* compiled from: Broadcast.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/h;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/G0;", "Lkotlinx/coroutines/channels/I0;", "Lkotlinx/coroutines/channels/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C43098h<E> extends AbstractC43075a<kotlin.G0> implements I0<E>, InterfaceC43090d<E> {
    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(kotlin.G0 g02) {
        throw null;
    }

    @Override // kotlinx.coroutines.V0
    public final void V(@Y61.k CancellationException cancellationException) {
        V0.A0(this, cancellationException);
        throw null;
    }

    @Override // kotlinx.coroutines.V0, kotlinx.coroutines.N0
    public final void c(@Y61.l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        V0.A0(this, cancellationException);
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    public final void g(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        throw null;
    }

    @Override // kotlinx.coroutines.V0, kotlinx.coroutines.channels.M0
    public final boolean h(@Y61.l Throwable th2) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    public final Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(E e12) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.I0
    @Y61.k
    public final M0<E> r() {
        return this;
    }
}
