package org.reactivestreams;

import j$.util.concurrent.Flow$Processor;
import j$.util.concurrent.Flow$Publisher;
import j$.util.concurrent.Flow$Subscriber;
import j$.util.concurrent.Flow$Subscription;

/* compiled from: FlowAdapters.java */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: FlowAdapters.java */
    /* renamed from: org.reactivestreams.a$a, reason: collision with other inner class name */
    public static final class C12236a<T> implements Flow$Publisher<T> {
        @Override // j$.util.concurrent.Flow$Publisher
        public final void subscribe(Flow$Subscriber<? super T> flow$Subscriber) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class b<T, U> implements Flow$Processor<T, U> {
        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onNext(T t12) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onSubscribe(Flow$Subscription flow$Subscription) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Publisher
        public final void subscribe(Flow$Subscriber<? super U> flow$Subscriber) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class c<T> implements Flow$Subscriber<T> {
        public c() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onNext(T t12) {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public final void onSubscribe(Flow$Subscription flow$Subscription) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class d implements Flow$Subscription {
        @Override // j$.util.concurrent.Flow$Subscription
        public final void cancel() {
            throw null;
        }

        @Override // j$.util.concurrent.Flow$Subscription
        public final void request(long j12) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class e<T> implements org.reactivestreams.c<T> {
        @Override // org.reactivestreams.c
        public final void d(org.reactivestreams.d<? super T> dVar) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class f<T, U> implements org.reactivestreams.b<T, U> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            throw null;
        }

        @Override // org.reactivestreams.c
        public final void d(org.reactivestreams.d<? super U> dVar) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class g<T> implements org.reactivestreams.d<T> {
        public g() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }
    }

    /* compiled from: FlowAdapters.java */
    public static final class h implements org.reactivestreams.e {
        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }
    }

    public a() {
        throw new IllegalStateException("No instances!");
    }
}
