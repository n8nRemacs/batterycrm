package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelPeek.java */
/* loaded from: classes8.dex */
public final class m<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelPeek.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404462b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404463c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404462b, eVar)) {
                this.f404462b = eVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    eVar.cancel();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
                this.f404462b.cancel();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404463c) {
                return;
            }
            this.f404463c = true;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404463c) {
                C47998a.b(th2);
                return;
            }
            this.f404463c = true;
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                new CompositeException(th2, th3);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404463c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
                this.f404462b.request(j12);
            }
        }
    }
}
