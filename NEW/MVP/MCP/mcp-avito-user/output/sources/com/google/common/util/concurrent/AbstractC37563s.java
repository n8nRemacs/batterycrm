package com.google.common.util.concurrent;

import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.N4;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AggregateFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37563s<InputT, OutputT> extends AbstractC37565t<OutputT> {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f360640o = Logger.getLogger(AbstractC37563s.class.getName());

    /* renamed from: m, reason: collision with root package name */
    @I41.a
    public AbstractC37378n1<? extends D0<? extends InputT>> f360641m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f360642n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregateFuture.java */
    /* renamed from: com.google.common.util.concurrent.s$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360643b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f360644c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f360645d;

        static {
            a aVar = new a("OUTPUT_FUTURE_DONE", 0);
            f360643b = aVar;
            a aVar2 = new a("ALL_INPUT_FUTURES_PROCESSED", 1);
            f360644c = aVar2;
            f360645d = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360645d.clone();
        }
    }

    public AbstractC37563s(AbstractC37378n1 abstractC37378n1, boolean z12) {
        int size = abstractC37378n1.size();
        this.f360648i = null;
        this.f360649j = size;
        this.f360641m = abstractC37378n1;
        this.f360642n = z12;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void c() {
        AbstractC37378n1<? extends D0<? extends InputT>> abstractC37378n1 = this.f360641m;
        v(a.f360643b);
        if (isCancelled() && (abstractC37378n1 != null)) {
            boolean zQ2 = q();
            N4<? extends D0<? extends InputT>> it = abstractC37378n1.iterator();
            while (it.hasNext()) {
                it.next().cancel(zQ2);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    @I41.a
    public final String l() {
        AbstractC37378n1<? extends D0<? extends InputT>> abstractC37378n1 = this.f360641m;
        if (abstractC37378n1 == null) {
            return super.l();
        }
        return "futures=" + abstractC37378n1;
    }

    public final void r(int i12, Future<? extends InputT> future) {
        try {
            C37568u0.b(future);
        } catch (Error e12) {
            e = e12;
            u(e);
        } catch (RuntimeException e13) {
            e = e13;
            u(e);
        } catch (ExecutionException e14) {
            u(e14.getCause());
        }
    }

    public final void s(@I41.a AbstractC37378n1<? extends Future<? extends InputT>> abstractC37378n1) {
        int iB2 = AbstractC37565t.f360646k.b(this);
        int i12 = 0;
        com.google.common.base.M.n("Less than 0 remaining futures", iB2 >= 0);
        if (iB2 == 0) {
            if (abstractC37378n1 != null) {
                N4<? extends Future<? extends InputT>> it = abstractC37378n1.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        r(i12, next);
                    }
                    i12++;
                }
            }
            this.f360648i = null;
            t();
            v(a.f360644c);
        }
    }

    public abstract void t();

    public final void u(Throwable th2) {
        th2.getClass();
        if (this.f360642n && !o(th2)) {
            Set<Throwable> set = this.f360648i;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                AbstractC37565t.f360646k.a(this, setNewSetFromMap);
                Set<Throwable> set2 = this.f360648i;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f360640o.log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
            return;
        }
        boolean z12 = th2 instanceof Error;
        if (z12) {
            f360640o.log(Level.SEVERE, z12 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
        }
    }

    @aZ0.q
    @aZ0.g
    public void v(a aVar) {
        this.f360641m = null;
    }
}
