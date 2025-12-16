package com.google.common.util.concurrent;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.common.base.D;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.C37414t3;
import com.google.common.collect.O4;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClosingFuture.java */
@InterfaceC37531b0
@XY0.d
@aZ0.f
/* loaded from: classes6.dex */
public final class D<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f360502d = Logger.getLogger(D.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<n> f360503a = new AtomicReference<>(n.f360523b);

    /* renamed from: b, reason: collision with root package name */
    public final d f360504b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37545i0<V> f360505c;

    /* compiled from: ClosingFuture.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f360506a;

        static {
            int[] iArr = new int[n.values().length];
            f360506a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f360506a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f360506a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f360506a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f360506a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f360506a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ClosingFuture.java */
    public interface b<V> {
    }

    /* compiled from: ClosingFuture.java */
    public interface c<T, U> {
    }

    /* compiled from: ClosingFuture.java */
    public static final class d extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f360507b;

        public d() {
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
         */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f360507b) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f360507b) {
                        return;
                    }
                    this.f360507b = true;
                    for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                        D.a(entry.getKey(), entry.getValue());
                    }
                    clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ d(E e12) {
            this();
        }
    }

    /* compiled from: ClosingFuture.java */
    public interface e<V> {
    }

    /* compiled from: ClosingFuture.java */
    public interface f<T, U> {
    }

    /* compiled from: ClosingFuture.java */
    @aZ0.f
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final d f360508a;

        /* compiled from: ClosingFuture.java */
        public interface a<V> {
        }

        /* compiled from: ClosingFuture.java */
        public interface b<V> {
        }

        public g() {
            throw null;
        }

        public g(boolean z12, Iterable iterable, E e12) {
            this.f360508a = new d(null);
            AbstractC37401r1.t(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                D d12 = (D) it.next();
                d dVar = this.f360508a;
                n nVar = n.f360523b;
                n nVar2 = n.f360524c;
                AtomicReference<n> atomicReference = d12.f360503a;
                while (!atomicReference.compareAndSet(nVar, nVar2)) {
                    if (atomicReference.get() != nVar) {
                        throw new IllegalStateException(com.google.common.base.d0.b("Expected state to be %s, but it was %s", nVar, nVar2));
                    }
                }
                d dVar2 = d12.f360504b;
                EnumC37529a0 enumC37529a0 = EnumC37529a0.f360553b;
                if (dVar2 == null) {
                    dVar.getClass();
                } else {
                    synchronized (dVar) {
                        try {
                            if (dVar.f360507b) {
                                D.a(dVar2, enumC37529a0);
                            } else {
                                dVar.put(dVar2, enumC37529a0);
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class h<V1, V2> extends g {

        /* renamed from: b, reason: collision with root package name */
        public final D<V1> f360509b;

        /* renamed from: c, reason: collision with root package name */
        public final D<V2> f360510c;

        /* compiled from: ClosingFuture.java */
        public interface a<V1, V2, U> {
        }

        /* compiled from: ClosingFuture.java */
        public interface b<V1, V2, U> {
        }

        public h() {
            throw null;
        }

        public h(D d12, D d13, E e12) {
            super(true, AbstractC37401r1.I(d12, d13), null);
            this.f360509b = d12;
            this.f360510c = d13;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class i<V1, V2, V3> extends g {

        /* renamed from: b, reason: collision with root package name */
        public final D<V1> f360511b;

        /* renamed from: c, reason: collision with root package name */
        public final D<V2> f360512c;

        /* renamed from: d, reason: collision with root package name */
        public final D<V3> f360513d;

        /* compiled from: ClosingFuture.java */
        public interface a<V1, V2, V3, U> {
        }

        /* compiled from: ClosingFuture.java */
        public interface b<V1, V2, V3, U> {
        }

        public i() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public i(D d12, D d13, D d14, E e12) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            Object[] objArr = {d12, d13, d14};
            C37414t3.a(3, objArr);
            super(true, AbstractC37401r1.r(3, objArr), null);
            this.f360511b = d12;
            this.f360512c = d13;
            this.f360513d = d14;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class j<V1, V2, V3, V4> extends g {

        /* renamed from: b, reason: collision with root package name */
        public final D<V1> f360514b;

        /* renamed from: c, reason: collision with root package name */
        public final D<V2> f360515c;

        /* renamed from: d, reason: collision with root package name */
        public final D<V3> f360516d;

        /* renamed from: e, reason: collision with root package name */
        public final D<V4> f360517e;

        /* compiled from: ClosingFuture.java */
        public interface a<V1, V2, V3, V4, U> {
        }

        /* compiled from: ClosingFuture.java */
        public interface b<V1, V2, V3, V4, U> {
        }

        public j() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public j(D d12, D d13, D d14, D d15, E e12) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            Object[] objArr = {d12, d13, d14, d15};
            C37414t3.a(4, objArr);
            super(true, AbstractC37401r1.r(4, objArr), null);
            this.f360514b = d12;
            this.f360515c = d13;
            this.f360516d = d14;
            this.f360517e = d15;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class k<V1, V2, V3, V4, V5> extends g {

        /* renamed from: b, reason: collision with root package name */
        public final D<V1> f360518b;

        /* renamed from: c, reason: collision with root package name */
        public final D<V2> f360519c;

        /* renamed from: d, reason: collision with root package name */
        public final D<V3> f360520d;

        /* renamed from: e, reason: collision with root package name */
        public final D<V4> f360521e;

        /* renamed from: f, reason: collision with root package name */
        public final D<V5> f360522f;

        /* compiled from: ClosingFuture.java */
        public interface a<V1, V2, V3, V4, V5, U> {
        }

        /* compiled from: ClosingFuture.java */
        public interface b<V1, V2, V3, V4, V5, U> {
        }

        public k() {
            throw null;
        }

        public k(D d12, D d13, D d14, D d15, D d16, E e12) {
            super(true, AbstractC37401r1.K(d12, d13, d14, d15, d16), null);
            this.f360518b = d12;
            this.f360519c = d13;
            this.f360520d = d14;
            this.f360521e = d15;
            this.f360522f = d16;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class l {
    }

    /* compiled from: ClosingFuture.java */
    public static final class m {
        public m() {
            throw null;
        }

        public m(AbstractC37401r1 abstractC37401r1, E e12) {
            abstractC37401r1.getClass();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClosingFuture.java */
    public static final class n {

        /* renamed from: b, reason: collision with root package name */
        public static final n f360523b;

        /* renamed from: c, reason: collision with root package name */
        public static final n f360524c;

        /* renamed from: d, reason: collision with root package name */
        public static final n f360525d;

        /* renamed from: e, reason: collision with root package name */
        public static final n f360526e;

        /* renamed from: f, reason: collision with root package name */
        public static final n f360527f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ n[] f360528g;

        static {
            n nVar = new n("OPEN", 0);
            f360523b = nVar;
            n nVar2 = new n("SUBSUMED", 1);
            f360524c = nVar2;
            n nVar3 = new n("WILL_CLOSE", 2);
            f360525d = nVar3;
            n nVar4 = new n("CLOSING", 3);
            f360526e = nVar4;
            n nVar5 = new n("CLOSED", 4);
            f360527f = nVar5;
            f360528g = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, new n("WILL_CREATE_VALUE_AND_CLOSER", 5)};
        }

        public n() {
            throw null;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f360528g.clone();
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class o<V> {
    }

    /* compiled from: ClosingFuture.java */
    public interface p<V> {
    }

    public D(D0 d02, E e12) {
        int i12 = AbstractC37545i0.f360612i;
        this.f360505c = d02 instanceof AbstractC37545i0 ? (AbstractC37545i0) d02 : new C37555n0(d02);
    }

    public static void a(@I41.a Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(closeable, 11));
        } catch (RejectedExecutionException e12) {
            Level level = Level.WARNING;
            Logger logger = f360502d;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e12);
            }
            a(closeable, EnumC37529a0.f360553b);
        }
    }

    public final void finalize() {
        AtomicReference<n> atomicReference = this.f360503a;
        n nVar = atomicReference.get();
        n nVar2 = n.f360523b;
        if (nVar.equals(nVar2)) {
            Level level = Level.SEVERE;
            Logger logger = f360502d;
            logger.log(level, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            n nVar3 = n.f360525d;
            while (!atomicReference.compareAndSet(nVar2, nVar3)) {
                if (atomicReference.get() != nVar2) {
                    int iOrdinal = atomicReference.get().ordinal();
                    if (iOrdinal == 0) {
                        throw new AssertionError();
                    }
                    if (iOrdinal == 1) {
                        throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                    }
                    if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                        throw new IllegalStateException("Cannot call finishToFuture() twice");
                    }
                    if (iOrdinal == 5) {
                        throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                    }
                    return;
                }
            }
            logger.log(Level.FINER, "will close {0}", this);
            this.f360505c.N(new M(this), EnumC37529a0.f360553b);
        }
    }

    public final String toString() {
        D.b bVarB = com.google.common.base.D.b(this);
        bVarB.b(this.f360503a.get(), VoiceInfo.STATE);
        bVarB.d(this.f360505c);
        return bVarB.toString();
    }
}
