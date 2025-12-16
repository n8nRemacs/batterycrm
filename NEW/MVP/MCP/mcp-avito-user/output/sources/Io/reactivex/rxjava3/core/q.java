package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.operators.maybe.C41910d;
import io.reactivex.rxjava3.internal.operators.maybe.W;
import io.reactivex.rxjava3.internal.operators.maybe.Y;
import io.reactivex.rxjava3.internal.operators.maybe.c0;
import io.reactivex.rxjava3.internal.operators.maybe.d0;
import io.reactivex.rxjava3.internal.operators.maybe.g0;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import io.reactivex.rxjava3.internal.operators.maybe.r0;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import j41.InterfaceC42196c;
import java.util.Objects;
import l41.InterfaceC43543a;
import n41.InterfaceC44188e;

/* compiled from: Maybe.java */
/* loaded from: classes8.dex */
public abstract class q<T> implements w<T> {
    @j41.e
    @InterfaceC42196c
    @j41.g
    public static W i(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new W(obj);
    }

    @Override // io.reactivex.rxjava3.core.w
    @j41.g
    public final void a(@j41.e t<? super T> tVar) {
        Objects.requireNonNull(tVar, "observer is null");
        try {
            o(tVar);
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
    public final g0 c(@j41.e l41.g gVar) {
        l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return new g0(this, gVar2, gVar, gVar2, interfaceC43543a, interfaceC43543a, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final q<T> g(@j41.e l41.r<? super T> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.A(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.maybe.I h(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.I(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final Y j(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new Y(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final c0 k(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new c0(this, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final d0 l() {
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        return new d0(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d m(@j41.e l41.g<? super T> gVar) {
        return n(gVar, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d n(@j41.e l41.g<? super T> gVar, @j41.e l41.g<? super Throwable> gVar2, @j41.e InterfaceC43543a interfaceC43543a) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        C41910d c41910d = new C41910d(gVar, gVar2, interfaceC43543a);
        a(c41910d);
        return c41910d;
    }

    public abstract void o(@j41.e t<? super T> tVar);

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final h0 p(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new h0(this, h12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z<T> q() {
        return this instanceof InterfaceC44188e ? ((InterfaceC44188e) this).d() : new r0(this);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final s0 r() {
        return new s0(this, null);
    }
}
