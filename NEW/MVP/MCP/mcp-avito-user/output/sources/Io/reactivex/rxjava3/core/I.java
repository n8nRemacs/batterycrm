package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.operators.flowable.C41874o1;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.single.C42008f;
import io.reactivex.rxjava3.internal.operators.single.C42015m;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import io.reactivex.rxjava3.internal.operators.single.C42021t;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.C42025x;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.S;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.internal.operators.single.V;
import io.reactivex.rxjava3.internal.operators.single.W;
import io.reactivex.rxjava3.internal.operators.single.Z;
import io.reactivex.rxjava3.internal.operators.single.a0;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.c0;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.g0;
import j41.InterfaceC42194a;
import j41.InterfaceC42196c;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n41.InterfaceC44186c;
import n41.InterfaceC44187d;
import n41.InterfaceC44188e;

/* compiled from: Single.java */
/* loaded from: classes8.dex */
public abstract class I<T> implements O<T> {
    @j41.e
    @InterfaceC42196c
    @j41.g
    public static a0 C(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new a0(j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static I G(@j41.e I i12, @j41.e I i13, @j41.e l41.c cVar) {
        Objects.requireNonNull(i12, "source1 is null");
        Objects.requireNonNull(i13, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return I(io.reactivex.rxjava3.internal.functions.a.m(cVar), i12, i13);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static g0 H(@j41.e Iterable iterable, @j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return new g0(iterable, oVar);
    }

    @InterfaceC42196c
    @SafeVarargs
    @j41.e
    @j41.g
    public static <T, R> I<R> I(@j41.e l41.o<? super Object[], ? extends R> oVar, @j41.e O<? extends T>... oArr) {
        return oArr.length == 0 ? l(new NoSuchElementException()) : new f0(oVar, oArr);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C42025x l(@j41.e Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new C42025x(io.reactivex.rxjava3.internal.functions.a.h(th2));
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static io.reactivex.rxjava3.internal.operators.single.M q(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new io.reactivex.rxjava3.internal.operators.single.M(obj);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final Z A(long j12, @j41.e TimeUnit timeUnit) {
        return B(j12, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b, null);
    }

    public final Z B(long j12, TimeUnit timeUnit, H h12, io.reactivex.rxjava3.internal.operators.single.M m12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new Z(this, j12, timeUnit, h12, m12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final AbstractC41777j<T> D() {
        return this instanceof InterfaceC44186c ? ((InterfaceC44186c) this).f() : new b0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final q<T> E() {
        return this instanceof InterfaceC44187d ? ((InterfaceC44187d) this).c() : new io.reactivex.rxjava3.internal.operators.maybe.O(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z<T> F() {
        return this instanceof InterfaceC44188e ? ((InterfaceC44188e) this).d() : new c0(this);
    }

    @Override // io.reactivex.rxjava3.core.O
    @j41.g
    public final void a(@j41.e L<? super T> l12) {
        Objects.requireNonNull(l12, "observer is null");
        try {
            y(l12);
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final T e() {
        io.reactivex.rxjava3.internal.observers.j jVar = new io.reactivex.rxjava3.internal.observers.j();
        a(jVar);
        return (T) jVar.a();
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42008f g(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new C42008f(this, j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42015m h(@j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onAfterSuccess is null");
        return new C42015m(this, gVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42019q i(@j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onError is null");
        return new C42019q(this, gVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42021t j(@j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        return new C42021t(this, gVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42022u k(@j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        return new C42022u(this, gVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final q<T> m(@j41.e l41.r<? super T> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.B(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42026y n(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new C42026y(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final AbstractC41768a o(@j41.e l41.o<? super T, ? extends InterfaceC41774g> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new io.reactivex.rxjava3.internal.operators.single.A(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <R> z<R> p(@j41.e l41.o<? super T, ? extends E<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new io.reactivex.rxjava3.internal.operators.mixed.z(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.single.O r(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new io.reactivex.rxjava3.internal.operators.single.O(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final S s(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new S(this, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final V t(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return new V(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final U u(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return new U(this, oVar, null);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final U v(@j41.e Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new U(this, null, obj);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41906z1 w(@j41.e l41.o oVar) {
        return new C41906z1(new C41874o1(D(), oVar));
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d x(@j41.e l41.g<? super T> gVar, @j41.e l41.g<? super Throwable> gVar2) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        io.reactivex.rxjava3.internal.observers.m mVar = new io.reactivex.rxjava3.internal.observers.m(gVar, gVar2);
        a(mVar);
        return mVar;
    }

    public abstract void y(@j41.e L<? super T> l12);

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final W z(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new W(this, h12);
    }
}
