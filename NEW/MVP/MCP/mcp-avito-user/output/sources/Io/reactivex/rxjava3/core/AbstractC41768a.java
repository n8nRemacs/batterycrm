package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41818i;
import io.reactivex.rxjava3.internal.operators.completable.C41824o;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import io.reactivex.rxjava3.internal.operators.completable.Q;
import io.reactivex.rxjava3.internal.operators.completable.S;
import io.reactivex.rxjava3.internal.operators.completable.T;
import io.reactivex.rxjava3.internal.operators.flowable.C41874o1;
import io.reactivex.rxjava3.internal.operators.single.C42009g;
import j41.InterfaceC42196c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l41.InterfaceC43543a;
import n41.InterfaceC44186c;
import n41.InterfaceC44187d;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: Completable.java */
/* renamed from: io.reactivex.rxjava3.core.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41768a implements InterfaceC41774g {
    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41824o o(@j41.e Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new C41824o(th2);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static io.reactivex.rxjava3.internal.operators.completable.F p(@j41.e Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new io.reactivex.rxjava3.internal.operators.completable.F(iterable);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static io.reactivex.rxjava3.internal.operators.completable.P y(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.P(j12, timeUnit, h12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <T> z<T> A() {
        return this instanceof InterfaceC44188e ? ((InterfaceC44188e) this).d() : new S(this);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final T B(Object obj) {
        Objects.requireNonNull(obj, "completionValue is null");
        return new T(this, null, obj);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41774g
    @j41.g
    public final void a(@j41.e InterfaceC41771d interfaceC41771d) {
        Objects.requireNonNull(interfaceC41771d, "observer is null");
        try {
            w(interfaceC41771d);
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41811b g(@j41.e AbstractC41768a abstractC41768a) {
        Objects.requireNonNull(abstractC41768a, "next is null");
        return new C41811b(this, abstractC41768a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C42009g h(@j41.e I i12) {
        Objects.requireNonNull(i12, "next is null");
        return new C42009g(i12, this);
    }

    @j41.g
    public final void i() {
        io.reactivex.rxjava3.internal.observers.j jVar = new io.reactivex.rxjava3.internal.observers.j();
        a(jVar);
        jVar.a();
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41818i j(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new C41818i(this, j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.K k(@j41.e InterfaceC43543a interfaceC43543a) {
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a2 = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return m(gVar, gVar, interfaceC43543a, interfaceC43543a2, interfaceC43543a2, interfaceC43543a2);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.K l(@j41.e l41.g gVar) {
        l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return m(gVar2, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.K m(l41.g gVar, l41.g gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2, InterfaceC43543a interfaceC43543a3, InterfaceC43543a interfaceC43543a4) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        Objects.requireNonNull(interfaceC43543a2, "onTerminate is null");
        Objects.requireNonNull(interfaceC43543a3, "onAfterTerminate is null");
        Objects.requireNonNull(interfaceC43543a4, "onDispose is null");
        return new io.reactivex.rxjava3.internal.operators.completable.K(this, gVar, gVar2, interfaceC43543a, interfaceC43543a2, interfaceC43543a3, interfaceC43543a4);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.K n(@j41.e l41.g gVar) {
        l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return m(gVar, gVar2, interfaceC43543a, interfaceC43543a, interfaceC43543a, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.H q(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.H(this, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.I r() {
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        return new io.reactivex.rxjava3.internal.operators.completable.I(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.L s(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return new io.reactivex.rxjava3.internal.operators.completable.L(this, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41828t t(@j41.e l41.o oVar) {
        return new C41828t(new C41874o1(this instanceof InterfaceC44186c ? ((InterfaceC44186c) this).f() : new Q(this), oVar));
    }

    @j41.e
    @j41.g
    public final io.reactivex.rxjava3.disposables.d u() {
        io.reactivex.rxjava3.internal.observers.s sVar = new io.reactivex.rxjava3.internal.observers.s();
        a(sVar);
        return sVar;
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.observers.l v(@j41.e InterfaceC43543a interfaceC43543a, @j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        io.reactivex.rxjava3.internal.observers.l lVar = new io.reactivex.rxjava3.internal.observers.l(interfaceC43543a, gVar);
        a(lVar);
        return lVar;
    }

    public abstract void w(@j41.e InterfaceC41771d interfaceC41771d);

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.completable.M x(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.completable.M(this, h12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <T> q<T> z() {
        return this instanceof InterfaceC44187d ? ((InterfaceC44187d) this).c() : new io.reactivex.rxjava3.internal.operators.maybe.L(this);
    }
}
