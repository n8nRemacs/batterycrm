package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.O;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import o41.AbstractC44583c;

/* compiled from: NonoMergeIterable.java */
/* loaded from: classes8.dex */
final class P extends AbstractC41062i {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }

    /* compiled from: NonoMergeIterable.java */
    public static final class a extends AbstractC44583c<Void> implements O.c {
        private static final long serialVersionUID = -58058606508277827L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // hu.akarnokd.rxjava3.basetypes.O.c
        public final void h(O.a aVar, Throwable th2) {
            throw null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // hu.akarnokd.rxjava3.basetypes.O.c
        public final void k(O.a aVar) {
            throw null;
        }

        @Override // q41.g
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
