package hu.akarnokd.rxjava3.string;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44584d;

/* compiled from: FlowableCharSequence.java */
/* loaded from: classes8.dex */
final class a extends AbstractC41777j<Integer> {

    /* compiled from: FlowableCharSequence.java */
    /* renamed from: hu.akarnokd.rxjava3.string.a$a, reason: collision with other inner class name */
    public static final class C11356a extends AbstractC44584d<Integer> {
        private static final long serialVersionUID = -4593793201463047197L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398264b;

        /* renamed from: c, reason: collision with root package name */
        public int f398265c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f398266d;

        public C11356a(InterfaceC41782o interfaceC41782o) {
            this.f398264b = interfaceC41782o;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398266d = true;
        }

        @Override // q41.g
        public final void clear() {
            this.f398265c = 0;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f398265c == 0;
        }

        @Override // q41.g
        public final Object poll() {
            int i12 = this.f398265c;
            if (i12 == 0) {
                return null;
            }
            this.f398265c = i12 + 1;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (!SubscriptionHelper.h(j12) || io.reactivex.rxjava3.internal.util.c.a(this, j12) != 0) {
                return;
            }
            if (j12 == Long.MAX_VALUE) {
                InterfaceC41782o interfaceC41782o = this.f398264b;
                if (this.f398265c != 0) {
                    if (!this.f398266d) {
                        throw null;
                    }
                    return;
                } else {
                    if (this.f398266d) {
                        return;
                    }
                    interfaceC41782o.e();
                    return;
                }
            }
            int i12 = this.f398265c;
            InterfaceC41782o interfaceC41782o2 = this.f398264b;
            while (true) {
                if (0 != j12 && i12 != 0) {
                    if (!this.f398266d) {
                        throw null;
                    }
                    return;
                } else if (i12 == 0) {
                    if (this.f398266d) {
                        return;
                    }
                    interfaceC41782o2.e();
                    return;
                } else {
                    j12 = get();
                    if (0 == j12) {
                        this.f398265c = i12;
                        j12 = addAndGet(-0L);
                        if (j12 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 1;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Integer> dVar) {
        new C11356a((InterfaceC41782o) dVar);
        throw null;
    }
}
