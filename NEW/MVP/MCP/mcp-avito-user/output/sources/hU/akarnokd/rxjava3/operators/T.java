package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableWindowPredicate.java */
/* loaded from: classes8.dex */
final class T<T> extends AbstractC41777j<AbstractC41777j<T>> implements InterfaceC41783p<T, AbstractC41777j<T>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlowableWindowPredicate.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f397984b = {new a("BEFORE", 0), new a("AFTER", 1), new a("SPLIT", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f397984b.clone();
        }
    }

    /* compiled from: FlowableWindowPredicate.java */
    public static final class b<T> extends AtomicInteger implements ConditionalSubscriber<T>, org.reactivestreams.e, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397985b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f397986c;

        public b(InterfaceC41782o interfaceC41782o) {
            super(1);
            this.f397986c = new AtomicBoolean();
            this.f397985b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f397986c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC41777j<T>> dVar) {
        new b((InterfaceC41782o) dVar);
        throw null;
    }
}
