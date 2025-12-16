package hu.akarnokd.rxjava3.debug.validator;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;

/* compiled from: FlowableValidator.java */
/* loaded from: classes8.dex */
final class d<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j<T> f397855c;

    /* compiled from: FlowableValidator.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397856b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397857c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397858d;

        public a(org.reactivestreams.d dVar) {
            this.f397856b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (eVar == null) {
                new NullOnSubscribeParameterException();
                throw null;
            }
            if (this.f397857c != null) {
                new MultipleOnSubscribeCallsException();
                throw null;
            }
            this.f397857c = eVar;
            this.f397856b.K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397857c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397857c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397858d) {
                new MultipleTerminationsException();
                throw null;
            }
            this.f397858d = true;
            this.f397856b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (th2 == null) {
                new NullOnErrorParameterException();
                throw null;
            }
            if (this.f397857c == null) {
                new OnSubscribeNotCalledException(th2);
                throw null;
            }
            if (this.f397858d) {
                new MultipleTerminationsException(th2);
                throw null;
            }
            this.f397858d = true;
            this.f397856b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (t12 == null) {
                new NullOnNextParameterException();
                throw null;
            }
            if (this.f397857c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397858d) {
                new OnNextAfterTerminationException();
                throw null;
            }
            this.f397856b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f397857c.request(j12);
        }
    }

    public d(AbstractC41777j abstractC41777j) {
        this.f397855c = abstractC41777j;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f397855c.q(new a(dVar));
    }
}
