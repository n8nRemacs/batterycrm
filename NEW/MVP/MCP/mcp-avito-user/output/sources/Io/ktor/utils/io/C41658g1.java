package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.InterfaceC43030m;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.InterfaceC43308w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Coroutines.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/g1;", "Lio/ktor/utils/io/Z1;", "Lio/ktor/utils/io/d2;", "Lkotlinx/coroutines/N0;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41658g1 implements Z1, d2, kotlinx.coroutines.N0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.N0 f400964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41619a f400965c;

    public C41658g1(@Y61.k kotlinx.coroutines.N0 n02, @Y61.k C41619a c41619a) {
        this.f400964b = n02;
        this.f400965c = c41619a;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    public final Object A(@Y61.k Continuation<? super kotlin.G0> continuation) {
        return this.f400964b.A(continuation);
    }

    @Override // kotlinx.coroutines.N0
    @kotlinx.coroutines.I0
    @Y61.k
    public final CancellationException J() {
        return this.f400964b.J();
    }

    @Override // kotlinx.coroutines.N0
    @kotlinx.coroutines.I0
    @Y61.k
    public final InterfaceC43308w L(@Y61.k kotlinx.coroutines.V0 v02) {
        return ((kotlinx.coroutines.V0) this.f400964b).L(v02);
    }

    @Override // kotlinx.coroutines.N0
    @kotlinx.coroutines.I0
    @Y61.k
    public final InterfaceC43268o0 Q(boolean z12, boolean z13, @Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return ((kotlinx.coroutines.V0) this.f400964b).Q(z12, z13, lVar);
    }

    @Override // io.ktor.utils.io.Z1
    public final X a() {
        return this.f400965c;
    }

    @Override // kotlinx.coroutines.N0
    public final void c(@Y61.l CancellationException cancellationException) {
        this.f400964b.c(cancellationException);
    }

    @Override // kotlinx.coroutines.N0
    public final boolean c0() {
        return this.f400964b.c0();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) this.f400964b.fold(r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) this.f400964b.get(key);
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43030m<kotlinx.coroutines.N0> getChildren() {
        return this.f400964b.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    public final CoroutineContext.Key<?> getKey() {
        return this.f400964b.getKey();
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    public final kotlinx.coroutines.N0 getParent() {
        return ((kotlinx.coroutines.V0) this.f400964b).getParent();
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isActive() {
        return this.f400964b.isActive();
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isCancelled() {
        return this.f400964b.isCancelled();
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43268o0 k(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return ((kotlinx.coroutines.V0) this.f400964b).k(lVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return this.f400964b.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return this.f400964b.plus(coroutineContext);
    }

    @Override // kotlinx.coroutines.N0
    public final boolean start() {
        return this.f400964b.start();
    }

    @Y61.k
    public final String toString() {
        return "ChannelJob[" + this.f400964b + ']';
    }

    @Override // io.ktor.utils.io.d2
    public final X x() {
        return this.f400965c;
    }
}
