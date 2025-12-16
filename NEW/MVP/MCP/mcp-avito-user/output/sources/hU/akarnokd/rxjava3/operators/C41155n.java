package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;

/* compiled from: FlowableDebounceFirst.java */
/* renamed from: hu.akarnokd.rxjava3.operators.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41155n<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableDebounceFirst.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.n$a */
    public static final class a<T> implements ConditionalSubscriber<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398091b;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398091b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
