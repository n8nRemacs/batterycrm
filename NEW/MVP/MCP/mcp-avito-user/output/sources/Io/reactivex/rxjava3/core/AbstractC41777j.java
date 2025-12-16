package io.reactivex.rxjava3.core;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.util.rx3.H0;
import io.reactivex.rxjava3.internal.operators.flowable.C0;
import io.reactivex.rxjava3.internal.operators.flowable.C41831a0;
import io.reactivex.rxjava3.internal.operators.flowable.C41834b0;
import io.reactivex.rxjava3.internal.operators.flowable.C41835b1;
import io.reactivex.rxjava3.internal.operators.flowable.C41849g0;
import io.reactivex.rxjava3.internal.operators.flowable.C41871n1;
import io.reactivex.rxjava3.internal.operators.flowable.C41879q0;
import io.reactivex.rxjava3.internal.operators.flowable.C41882r1;
import io.reactivex.rxjava3.internal.operators.flowable.C41884s0;
import io.reactivex.rxjava3.internal.operators.flowable.G0;
import io.reactivex.rxjava3.internal.operators.flowable.H1;
import io.reactivex.rxjava3.internal.operators.flowable.I1;
import io.reactivex.rxjava3.internal.operators.flowable.O0;
import io.reactivex.rxjava3.internal.operators.flowable.Y;
import io.reactivex.rxjava3.internal.operators.flowable.Z;
import io.reactivex.rxjava3.internal.operators.flowable.h2;
import j41.InterfaceC42194a;
import j41.InterfaceC42196c;
import java.util.Objects;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: Flowable.java */
/* renamed from: io.reactivex.rxjava3.core.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41777j<T> implements org.reactivestreams.c<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f401972b = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    /* compiled from: Flowable.java */
    /* renamed from: io.reactivex.rxjava3.core.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f401973a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f401973a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f401973a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f401973a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f401973a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public static Z a(@j41.e Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new Z(io.reactivex.rxjava3.internal.functions.a.h(th2));
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public static <T> AbstractC41777j<T> g(@j41.e org.reactivestreams.c<? extends T> cVar) {
        if (cVar instanceof AbstractC41777j) {
            return (AbstractC41777j) cVar;
        }
        Objects.requireNonNull(cVar, "publisher is null");
        return new C41879q0(cVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public static C41884s0 h(@j41.e l41.s sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return new C41884s0(sVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public static C0 j(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new C0(obj);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public static AbstractC41777j n() {
        if (1 + 2147483646 <= 2147483647L) {
            return new C41835b1();
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final C41831a0 b(@j41.e l41.r rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return new C41831a0(this, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final <R> AbstractC41777j<R> c(@j41.e l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        int i12 = f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i12, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        if (!(this instanceof q41.e)) {
            return new C41834b0(this, oVar, i12, i12);
        }
        T t12 = ((q41.e) this).get();
        return t12 == null ? Y.f402580c : C41882r1.a(t12, oVar);
    }

    @Override // org.reactivestreams.c
    @InterfaceC42194a
    @j41.g
    public final void d(@j41.e org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof InterfaceC41782o) {
            q((InterfaceC41782o) dVar);
        } else {
            Objects.requireNonNull(dVar, "subscriber is null");
            q(new io.reactivex.rxjava3.internal.subscribers.v(dVar));
        }
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final C41849g0 f(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "maxConcurrency");
        return new C41849g0(this, oVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final G0 k(@j41.e l41.o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new G0(this, oVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final O0 m(@j41.e H h12) {
        Objects.requireNonNull(h12, "scheduler is null");
        int i12 = f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new O0(this, h12, i12);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final C41871n1 o(long j12) {
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "times >= 0 required but it was "));
        }
        Objects.requireNonNull(rVar, "predicate is null");
        return new C41871n1(this, j12, rVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final io.reactivex.rxjava3.disposables.d p(@j41.e l41.g<? super T> gVar, @j41.e l41.g<? super Throwable> gVar2, @j41.e InterfaceC43543a interfaceC43543a) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        io.reactivex.rxjava3.internal.subscribers.n nVar = new io.reactivex.rxjava3.internal.subscribers.n(gVar, gVar2, interfaceC43543a);
        q(nVar);
        return nVar;
    }

    @InterfaceC42194a
    @j41.g
    public final void q(@j41.e InterfaceC41782o<? super T> interfaceC41782o) {
        Objects.requireNonNull(interfaceC41782o, "subscriber is null");
        try {
            u(interfaceC41782o);
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

    public abstract void u(@j41.e org.reactivestreams.d<? super T> dVar);

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final void v() {
        Objects.requireNonNull((Object) null, "scheduler is null");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final <R> AbstractC41777j<R> w(@j41.e l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        int i12 = f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        if (!(this instanceof q41.e)) {
            return new H1(this, oVar, i12);
        }
        T t12 = ((q41.e) this).get();
        return t12 == null ? Y.f402580c : C41882r1.a(t12, oVar);
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final I1 x(long j12) {
        if (j12 >= 0) {
            return new I1(this, j12);
        }
        throw new IllegalArgumentException(C21030p.a(j12, "count >= 0 required but it was "));
    }

    @InterfaceC42194a
    @InterfaceC42196c
    @j41.e
    @j41.g
    public final h2 y(@j41.e AbstractC41777j abstractC41777j) {
        com.avito.android.analytics.timer.b bVar = H0.f319001a;
        Objects.requireNonNull(abstractC41777j, "other is null");
        l41.o oVarM = io.reactivex.rxjava3.internal.functions.a.m(bVar);
        org.reactivestreams.c[] cVarArr = {this, abstractC41777j};
        int i12 = f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i12, "bufferSize");
        return new h2(cVarArr, oVarM, i12);
    }
}
