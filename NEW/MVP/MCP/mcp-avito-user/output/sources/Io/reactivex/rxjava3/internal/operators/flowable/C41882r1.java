package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;

/* compiled from: FlowableScalarXMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41882r1 {

    /* compiled from: FlowableScalarXMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.r1$a */
    public static final class a<T, R> extends AbstractC41777j<R> {

        /* renamed from: c, reason: collision with root package name */
        public final T f402957c;

        /* renamed from: d, reason: collision with root package name */
        public final l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> f402958d;

        public a(T t12, l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
            this.f402957c = t12;
            this.f402958d = oVar;
        }

        @Override // io.reactivex.rxjava3.core.AbstractC41777j
        public final void u(org.reactivestreams.d<? super R> dVar) {
            try {
                org.reactivestreams.c<? extends R> cVarApply = this.f402958d.apply(this.f402957c);
                Objects.requireNonNull(cVarApply, "The mapper returned a null Publisher");
                org.reactivestreams.c<? extends R> cVar = cVarApply;
                if (!(cVar instanceof l41.s)) {
                    cVar.d(dVar);
                    return;
                }
                try {
                    Object obj = ((l41.s) cVar).get();
                    if (obj == null) {
                        EmptySubscription.a(dVar);
                    } else {
                        dVar.K(new o41.g(obj, dVar));
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    EmptySubscription.b(th2, dVar);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                EmptySubscription.b(th3, dVar);
            }
        }
    }

    public C41882r1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> AbstractC41777j<U> a(T t12, l41.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar) {
        return new a(t12, oVar);
    }

    public static boolean b(org.reactivestreams.c cVar, InterfaceC41782o interfaceC41782o, l41.o oVar) {
        if (!(cVar instanceof l41.s)) {
            return false;
        }
        try {
            Object obj = ((l41.s) cVar).get();
            if (obj == null) {
                EmptySubscription.a(interfaceC41782o);
                return true;
            }
            try {
                Object objApply = oVar.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                org.reactivestreams.c cVar2 = (org.reactivestreams.c) objApply;
                if (cVar2 instanceof l41.s) {
                    try {
                        Object obj2 = ((l41.s) cVar2).get();
                        if (obj2 == null) {
                            EmptySubscription.a(interfaceC41782o);
                            return true;
                        }
                        interfaceC41782o.K(new o41.g(obj2, interfaceC41782o));
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        EmptySubscription.b(th2, interfaceC41782o);
                        return true;
                    }
                } else {
                    cVar2.d(interfaceC41782o);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                EmptySubscription.b(th3, interfaceC41782o);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            EmptySubscription.b(th4, interfaceC41782o);
            return true;
        }
    }
}
