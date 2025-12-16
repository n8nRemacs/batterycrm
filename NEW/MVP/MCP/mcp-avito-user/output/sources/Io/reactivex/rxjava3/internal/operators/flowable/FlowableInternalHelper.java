package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41776i;
import java.util.Objects;
import k41.AbstractC42503a;
import l41.InterfaceC43543a;

/* loaded from: classes8.dex */
public final class FlowableInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestMax implements l41.g<org.reactivestreams.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final RequestMax f402334b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RequestMax[] f402335c;

        static {
            RequestMax requestMax = new RequestMax("INSTANCE", 0);
            f402334b = requestMax;
            f402335c = new RequestMax[]{requestMax};
        }

        public RequestMax() {
            throw null;
        }

        public static RequestMax valueOf(String str) {
            return (RequestMax) Enum.valueOf(RequestMax.class, str);
        }

        public static RequestMax[] values() {
            return (RequestMax[]) f402335c.clone();
        }

        @Override // l41.g
        public final void accept(org.reactivestreams.e eVar) {
            eVar.request(Long.MAX_VALUE);
        }
    }

    public static final class a<T> implements l41.s<AbstractC42503a<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    public static final class b<T> implements l41.s<AbstractC42503a<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    public static final class c<T, U> implements l41.o<T, org.reactivestreams.c<U>> {
        @Override // l41.o
        public final Object apply(Object obj) {
            throw null;
        }
    }

    public static final class d<U, R, T> implements l41.o<U, R> {
        public d() {
            throw null;
        }

        @Override // l41.o
        public final R apply(U u12) {
            throw null;
        }
    }

    public static final class e<T, R, U> implements l41.o<T, org.reactivestreams.c<R>> {
        @Override // l41.o
        public final Object apply(Object obj) {
            throw null;
        }
    }

    public static final class f<T, U> implements l41.o<T, org.reactivestreams.c<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final l41.o<? super T, ? extends org.reactivestreams.c<U>> f402336b;

        public f(l41.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
            this.f402336b = oVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            org.reactivestreams.c<U> cVarApply = this.f402336b.apply(obj);
            Objects.requireNonNull(cVarApply, "The itemDelay returned a null Publisher");
            G0 g0K = new M1(cVarApply).k(io.reactivex.rxjava3.internal.functions.a.g(obj));
            Objects.requireNonNull(obj, "defaultItem is null");
            return new G1(g0K, AbstractC41777j.j(obj));
        }
    }

    public static final class g<T> implements l41.s<AbstractC42503a<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    public static final class h<T, S> implements l41.c<S, InterfaceC41776i<T>, S> {
        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            throw null;
        }
    }

    public static final class i<T, S> implements l41.c<S, InterfaceC41776i<T>, S> {
        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            throw null;
        }
    }

    public static final class j<T> implements InterfaceC43543a {
        @Override // l41.InterfaceC43543a
        public final void run() {
            throw null;
        }
    }

    public static final class k<T> implements l41.g<Throwable> {
        @Override // l41.g
        public final void accept(Throwable th2) {
            throw null;
        }
    }

    public static final class l<T> implements l41.g<T> {
        @Override // l41.g
        public final void accept(T t12) {
            throw null;
        }
    }

    public static final class m<T> implements l41.s<AbstractC42503a<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    public FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> l41.o<T, org.reactivestreams.c<T>> a(l41.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
        return new f(oVar);
    }
}
