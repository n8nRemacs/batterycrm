package io.reactivex.rxjava3.core;

import androidx.compose.foundation.text.selection.C21030p;
import io.reactivex.rxjava3.internal.operators.flowable.C41876p0;
import io.reactivex.rxjava3.internal.operators.flowable.P0;
import io.reactivex.rxjava3.internal.operators.flowable.R0;
import io.reactivex.rxjava3.internal.operators.flowable.S0;
import io.reactivex.rxjava3.internal.operators.flowable.T0;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.B1;
import io.reactivex.rxjava3.internal.operators.observable.C41937b1;
import io.reactivex.rxjava3.internal.operators.observable.C41939c0;
import io.reactivex.rxjava3.internal.operators.observable.C41943d1;
import io.reactivex.rxjava3.internal.operators.observable.C41945e0;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import io.reactivex.rxjava3.internal.operators.observable.C41949f1;
import io.reactivex.rxjava3.internal.operators.observable.C41957i0;
import io.reactivex.rxjava3.internal.operators.observable.C41966l0;
import io.reactivex.rxjava3.internal.operators.observable.C41967l1;
import io.reactivex.rxjava3.internal.operators.observable.C41968m;
import io.reactivex.rxjava3.internal.operators.observable.C41969m0;
import io.reactivex.rxjava3.internal.operators.observable.C41975o0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.C41985s;
import io.reactivex.rxjava3.internal.operators.observable.C41987s1;
import io.reactivex.rxjava3.internal.operators.observable.C41988t;
import io.reactivex.rxjava3.internal.operators.observable.C41990t1;
import io.reactivex.rxjava3.internal.operators.observable.C41991u;
import io.reactivex.rxjava3.internal.operators.observable.C41992u0;
import io.reactivex.rxjava3.internal.operators.observable.C41994v0;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.E1;
import io.reactivex.rxjava3.internal.operators.observable.F1;
import io.reactivex.rxjava3.internal.operators.observable.H1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import io.reactivex.rxjava3.internal.operators.observable.P1;
import io.reactivex.rxjava3.internal.operators.observable.R1;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.internal.operators.observable.U;
import io.reactivex.rxjava3.internal.operators.observable.V;
import io.reactivex.rxjava3.internal.operators.observable.W;
import io.reactivex.rxjava3.internal.operators.observable.X;
import io.reactivex.rxjava3.internal.operators.observable.x1;
import io.reactivex.rxjava3.internal.operators.observable.y1;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import j41.InterfaceC42194a;
import j41.InterfaceC42196c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l41.InterfaceC43543a;
import l41.InterfaceC43544b;
import s41.C47998a;

/* compiled from: Observable.java */
/* loaded from: classes8.dex */
public abstract class z<T> implements E<T> {

    /* compiled from: Observable.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f401976a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f401976a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f401976a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f401976a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f401976a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static F1 F0(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new F1(Math.max(j12, 0L), timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static <T> z<T> J0(@j41.e E<T> e12) {
        Objects.requireNonNull(e12, "source is null");
        return e12 instanceof z ? (z) e12 : new C41969m0(e12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z K0(@j41.e z zVar, @j41.e E e12, @j41.e l41.c cVar) {
        Objects.requireNonNull(e12, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        l41.o oVarM = io.reactivex.rxjava3.internal.functions.a.m(cVar);
        int i12 = AbstractC41777j.f401972b;
        E[] eArr = {zVar, e12};
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new R1(eArr, null, oVarM, i12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static R1 L0(@j41.e ArrayList arrayList, @j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "zipper is null");
        return new R1(null, arrayList, oVar, AbstractC41777j.f401972b);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static V M(@j41.e Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new V(io.reactivex.rxjava3.internal.functions.a.h(th2));
    }

    @InterfaceC42196c
    @SafeVarargs
    @j41.e
    @j41.g
    public static <T> z<T> V(@j41.e T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? U.f403867b : tArr.length == 1 ? c0(tArr[0]) : new C41945e0(tArr);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41948f0 W(@j41.e Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return new C41948f0(callable);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41957i0 X(@j41.e Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new C41957i0(iterable);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41966l0 Y(@j41.e l41.s sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return new C41966l0(sVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41992u0 a0(long j12, long j13, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new C41992u0(Math.max(0L, j12), Math.max(0L, j13), timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z b0(long j12, long j13, long j14, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "count >= 0 required but it was "));
        }
        if (j12 == 0) {
            return U.f403867b.z(j13, timeUnit, h12);
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new C41994v0(j12 - 1, Math.max(0L, j13), Math.max(0L, j14), timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41998x0 c0(@j41.e Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new C41998x0(obj);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z e0(@j41.e z zVar, @j41.e z zVar2, @j41.e z zVar3) {
        Objects.requireNonNull(zVar2, "source2 is null");
        Objects.requireNonNull(zVar3, "source3 is null");
        return V(zVar, zVar2, zVar3).T(io.reactivex.rxjava3.internal.functions.a.f401991a, 3);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z f0(@j41.e z zVar, @j41.e z zVar2, @j41.e z zVar3, @j41.e z zVar4) {
        Objects.requireNonNull(zVar, "source1 is null");
        Objects.requireNonNull(zVar2, "source2 is null");
        Objects.requireNonNull(zVar3, "source3 is null");
        Objects.requireNonNull(zVar4, "source4 is null");
        return V(zVar, zVar2, zVar3, zVar4).T(io.reactivex.rxjava3.internal.functions.a.f401991a, 4);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z g0(@j41.e z zVar, @j41.e E e12) {
        Objects.requireNonNull(zVar, "source1 is null");
        Objects.requireNonNull(e12, "source2 is null");
        return V(zVar, e12).T(io.reactivex.rxjava3.internal.functions.a.f401991a, 2);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static <T> z<T> h0(@j41.e Iterable<? extends E<? extends T>> iterable) {
        return X(iterable).T(io.reactivex.rxjava3.internal.functions.a.f401991a, Integer.MAX_VALUE);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z j(@j41.e z zVar, @j41.e z zVar2, @j41.e z zVar3, @j41.e l41.h hVar) {
        Objects.requireNonNull(zVar, "source1 is null");
        Objects.requireNonNull(zVar2, "source2 is null");
        Objects.requireNonNull(zVar3, "source3 is null");
        Objects.requireNonNull(hVar, "combiner is null");
        return n(new E[]{zVar, zVar2, zVar3}, io.reactivex.rxjava3.internal.functions.a.n(hVar), AbstractC41777j.f401972b);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static <T1, T2, R> z<R> k(@j41.e E<? extends T1> e12, @j41.e E<? extends T2> e13, @j41.e l41.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(e12, "source1 is null");
        Objects.requireNonNull(e13, "source2 is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return n(new E[]{e12, e13}, io.reactivex.rxjava3.internal.functions.a.m(cVar), AbstractC41777j.f401972b);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static C41988t m(@j41.e List list, @j41.e l41.o oVar) {
        int i12 = AbstractC41777j.f401972b;
        Objects.requireNonNull(oVar, "combiner is null");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new C41988t(null, list, oVar, i12 << 1);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static <T, R> z<R> n(@j41.e E<? extends T>[] eArr, @j41.e l41.o<? super Object[], ? extends R> oVar, int i12) {
        if (eArr.length == 0) {
            return U.f403867b;
        }
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new C41988t(eArr, null, oVar, i12 << 1);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public static z p(@j41.e z zVar, E e12) {
        Objects.requireNonNull(zVar, "source1 is null");
        Objects.requireNonNull(e12, "source2 is null");
        return q(zVar, e12);
    }

    @InterfaceC42196c
    @SafeVarargs
    @j41.e
    @j41.g
    public static <T> z<T> q(@j41.e E<? extends T>... eArr) {
        return eArr.length == 0 ? U.f403867b : eArr.length == 1 ? J0(eArr[0]) : new C41991u(V(eArr), io.reactivex.rxjava3.internal.functions.a.f401991a, AbstractC41777j.f401972b, ErrorMode.f404820c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.K A() {
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        l41.s sVarD = io.reactivex.rxjava3.internal.functions.a.d();
        Objects.requireNonNull(oVar, "keySelector is null");
        return new io.reactivex.rxjava3.internal.operators.observable.K(this, oVar, sVarD);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final x1 A0(@j41.e z zVar) {
        Objects.requireNonNull(zVar, "other is null");
        return new x1(this, zVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.L B(@j41.e l41.d dVar) {
        Objects.requireNonNull(dVar, "comparer is null");
        return new io.reactivex.rxjava3.internal.operators.observable.L(this, io.reactivex.rxjava3.internal.functions.a.f401991a, dVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final y1 B0(@j41.e l41.r rVar) {
        Objects.requireNonNull(rVar, "stopPredicate is null");
        return new y1(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final A1 C0(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new A1(this, j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.L D(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "keySelector is null");
        return new io.reactivex.rxjava3.internal.operators.observable.L(this, oVar, io.reactivex.rxjava3.internal.functions.b.f402016a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final B1 D0(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new B1(this, j12, timeUnit, h12);
    }

    @j41.e
    public final E1 E0(long j12, @j41.e TimeUnit timeUnit, @j41.f C41998x0 c41998x0, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new E1(this, j12, timeUnit, h12, c41998x0);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O F(@j41.e InterfaceC43543a interfaceC43543a) {
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        return H(gVar, gVar, interfaceC43543a, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O G(@j41.e l41.g gVar) {
        return H(io.reactivex.rxjava3.internal.functions.a.k(gVar), io.reactivex.rxjava3.internal.functions.a.j(gVar), io.reactivex.rxjava3.internal.functions.a.i(gVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final AbstractC41777j<T> G0(@j41.e BackpressureStrategy backpressureStrategy) {
        C41876p0 c41876p0 = new C41876p0(this);
        int iOrdinal = backpressureStrategy.ordinal();
        if (iOrdinal == 0) {
            return c41876p0;
        }
        if (iOrdinal == 1) {
            return new S0(c41876p0);
        }
        if (iOrdinal == 3) {
            return new R0(c41876p0);
        }
        if (iOrdinal == 4) {
            return new T0(c41876p0);
        }
        int i12 = AbstractC41777j.f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i12, "capacity");
        return new P0(c41876p0, i12, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O H(@j41.e l41.g gVar, @j41.e l41.g gVar2, @j41.e InterfaceC43543a interfaceC43543a, @j41.e InterfaceC43543a interfaceC43543a2) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        Objects.requireNonNull(interfaceC43543a2, "onAfterTerminate is null");
        return new io.reactivex.rxjava3.internal.operators.observable.O(this, gVar, gVar2, interfaceC43543a, interfaceC43543a2);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final H1 H0() {
        io.reactivex.rxjava3.internal.functions.b.a(16, "capacityHint");
        return new H1(this);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O I(@j41.e l41.g gVar) {
        l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return H(gVar2, gVar, interfaceC43543a, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final P1 I0(@j41.e E e12, @j41.e l41.c cVar) {
        Objects.requireNonNull(e12, "other is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return new P1(this, e12, cVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.P J(@j41.e InterfaceC43543a interfaceC43543a, @j41.e l41.g gVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(interfaceC43543a, "onDispose is null");
        return new io.reactivex.rxjava3.internal.operators.observable.P(this, gVar, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O K(@j41.e l41.g gVar) {
        l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return H(gVar, gVar2, interfaceC43543a, interfaceC43543a);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.O L(@j41.e InterfaceC43543a interfaceC43543a) {
        return H(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.a(interfaceC43543a), interfaceC43543a, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final W N(@j41.e l41.r rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return new W(this, rVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final T P(@j41.e Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new T(this, obj);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final T S() {
        return new T(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z T(@j41.e l41.o oVar, int i12) {
        int i13 = AbstractC41777j.f401972b;
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.a(i13, "bufferSize");
        if (!(this instanceof q41.e)) {
            return new X(this, oVar, i12, i13);
        }
        T t12 = ((q41.e) this).get();
        return t12 == null ? U.f403867b : C41943d1.a(t12, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41939c0 U(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new C41939c0(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41975o0 Z(@j41.e l41.o oVar) {
        l41.o<Object, Object> oVar2 = io.reactivex.rxjava3.internal.functions.a.f401991a;
        int i12 = AbstractC41777j.f401972b;
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(oVar2, "valueSelector is null");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new C41975o0(this, oVar, oVar2, i12);
    }

    @Override // io.reactivex.rxjava3.core.E
    @j41.g
    public final void c(@j41.e G<? super T> g12) {
        Objects.requireNonNull(g12, "observer is null");
        try {
            w0(g12);
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final T d() throws InterruptedException {
        io.reactivex.rxjava3.internal.observers.h hVar = new io.reactivex.rxjava3.internal.observers.h();
        c(hVar);
        if (hVar.getCount() != 0) {
            try {
                hVar.await();
            } catch (InterruptedException e12) {
                hVar.dispose();
                throw io.reactivex.rxjava3.internal.util.h.f(e12);
            }
        }
        Throwable th2 = hVar.f402103c;
        if (th2 != null) {
            throw io.reactivex.rxjava3.internal.util.h.f(th2);
        }
        T t12 = hVar.f402102b;
        if (t12 != null) {
            return t12;
        }
        throw new NoSuchElementException();
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final B0 d0(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new B0(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41968m f(int i12, int i13) {
        io.reactivex.rxjava3.internal.functions.b.a(i12, "count");
        io.reactivex.rxjava3.internal.functions.b.a(i13, "skip");
        return new C41968m(this, i12, i13);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final B0 g(@j41.e Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return d0(io.reactivex.rxjava3.internal.functions.a.b(cls));
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41985s h(@j41.e Serializable serializable, @j41.e InterfaceC43544b interfaceC43544b) {
        l41.s sVarH = io.reactivex.rxjava3.internal.functions.a.h(serializable);
        Objects.requireNonNull(interfaceC43544b, "collector is null");
        return new C41985s(this, sVarH, interfaceC43544b);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z<T> i0(@j41.e E<? extends T> e12) {
        Objects.requireNonNull(e12, "other is null");
        return g0(this, e12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final I0 j0(@j41.e H h12) {
        int i12 = AbstractC41777j.f401972b;
        Objects.requireNonNull(h12, "scheduler is null");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new I0(this, h12, i12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final B0 k0(@j41.e Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return N(io.reactivex.rxjava3.internal.functions.a.f(cls)).g(cls);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final K0 l0(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return new K0(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final L0 m0(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return new L0(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41937b1 n0(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new C41937b1(this, j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <R> z<R> o(@j41.e F<? super T, ? extends R> f12) {
        Objects.requireNonNull(f12, "composer is null");
        return J0(f12.a(this));
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41949f1 o0(@j41.e Object obj, @j41.e l41.c cVar) {
        Objects.requireNonNull(obj, "initialValue is null");
        l41.s sVarH = io.reactivex.rxjava3.internal.functions.a.h(obj);
        Objects.requireNonNull(cVar, "accumulator is null");
        return new C41949f1(this, sVarH, cVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.T0 p0() {
        return new io.reactivex.rxjava3.internal.operators.observable.T0(new M0(this), 0L, TimeUnit.NANOSECONDS, null);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z<T> q0(long j12) {
        if (j12 >= 0) {
            return j12 == 0 ? this : new C41967l1(this, j12);
        }
        throw new IllegalArgumentException(C21030p.a(j12, "count >= 0 expected but it was "));
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final z<T> r0(@j41.e T t12) {
        return q(c0(t12), this);
    }

    @j41.e
    @j41.g
    public final io.reactivex.rxjava3.disposables.d s0() {
        return v0(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d t0(@j41.e l41.g<? super T> gVar) {
        return v0(gVar, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <R> z<R> u(@j41.e l41.o<? super T, ? extends E<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        if (!(this instanceof q41.e)) {
            return new C41991u(this, oVar, 2, ErrorMode.f404819b);
        }
        T t12 = ((q41.e) this).get();
        return t12 == null ? U.f403867b : C41943d1.a(t12, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d u0(@j41.e l41.g<? super T> gVar, @j41.e l41.g<? super Throwable> gVar2) {
        return v0(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.mixed.s v(@j41.e l41.o oVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "capacityHint");
        return new io.reactivex.rxjava3.internal.operators.mixed.s(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.disposables.d v0(@j41.e l41.g<? super T> gVar, @j41.e l41.g<? super Throwable> gVar2, @j41.e InterfaceC43543a interfaceC43543a) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        io.reactivex.rxjava3.internal.observers.y yVar = new io.reactivex.rxjava3.internal.observers.y(gVar, gVar2, interfaceC43543a, io.reactivex.rxjava3.internal.functions.a.f401994d);
        c(yVar);
        return yVar;
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.mixed.u w(@j41.e l41.o oVar) {
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        return new io.reactivex.rxjava3.internal.operators.mixed.u(this, oVar);
    }

    public abstract void w0(@j41.e G<? super T> g12);

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.D x(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "debounceIndicator is null");
        return new io.reactivex.rxjava3.internal.operators.observable.D(this, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41982q1 x0(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        return new C41982q1(this, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.E y(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.observable.E(this, j12, timeUnit, h12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j41.e
    @InterfaceC42196c
    @j41.g
    public final <R> z<R> y0(@j41.e l41.o<? super T, ? extends E<? extends R>> oVar) {
        int i12 = AbstractC41777j.f401972b;
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        if (!(this instanceof q41.e)) {
            return new C41987s1(this, oVar, i12);
        }
        T t12 = ((q41.e) this).get();
        return t12 == null ? U.f403867b : C41943d1.a(t12, oVar);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final io.reactivex.rxjava3.internal.operators.observable.G z(long j12, @j41.e TimeUnit timeUnit, @j41.e H h12) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.observable.G(this, j12, timeUnit, h12);
    }

    @j41.e
    @InterfaceC42196c
    @j41.g
    public final C41990t1 z0(long j12) {
        if (j12 >= 0) {
            return new C41990t1(this, j12);
        }
        throw new IllegalArgumentException(C21030p.a(j12, "count >= 0 required but it was "));
    }
}
