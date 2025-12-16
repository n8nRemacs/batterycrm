package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* compiled from: DiscreteDomain.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37323e0<C extends Comparable> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f359673b;

    /* compiled from: DiscreteDomain.java */
    /* renamed from: com.google.common.collect.e0$b */
    public static final class b extends AbstractC37323e0<BigInteger> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final b f359674c = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final BigInteger f359675d = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: e, reason: collision with root package name */
        public static final BigInteger f359676e = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public b() {
            super(true);
        }

        private Object readResolve() {
            return f359674c;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final long a(Comparable comparable, Comparable comparable2) {
            return ((BigInteger) comparable2).subtract((BigInteger) comparable).max(f359675d).min(f359676e).longValue();
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final Comparable d(Comparable comparable) {
            return ((BigInteger) comparable).add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final Comparable e(Comparable comparable, long j12) {
            F.c(j12);
            return ((BigInteger) comparable).add(BigInteger.valueOf(j12));
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final Comparable f(Comparable comparable) {
            return ((BigInteger) comparable).subtract(BigInteger.ONE);
        }

        public final String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    /* compiled from: DiscreteDomain.java */
    /* renamed from: com.google.common.collect.e0$c */
    public static final class c extends AbstractC37323e0<Integer> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final c f359677c = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return f359677c;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final long a(Comparable comparable, Comparable comparable2) {
            return ((Integer) comparable2).intValue() - ((Integer) comparable).intValue();
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final /* bridge */ /* synthetic */ Comparable b() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final /* bridge */ /* synthetic */ Comparable c() {
            return Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION);
        }

        @Override // com.google.common.collect.AbstractC37323e0
        @I41.a
        public final Comparable d(Comparable comparable) {
            int iIntValue = ((Integer) comparable).intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final Comparable e(Comparable comparable, long j12) {
            F.c(j12);
            return Integer.valueOf(com.google.common.primitives.l.b(((Integer) comparable).longValue() + j12));
        }

        @Override // com.google.common.collect.AbstractC37323e0
        @I41.a
        public final Comparable f(Comparable comparable) {
            int iIntValue = ((Integer) comparable).intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        public final String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    /* compiled from: DiscreteDomain.java */
    /* renamed from: com.google.common.collect.e0$d */
    public static final class d extends AbstractC37323e0<Long> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final d f359678c = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super(true);
        }

        private Object readResolve() {
            return f359678c;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final long a(Comparable comparable, Comparable comparable2) {
            Long l12 = (Long) comparable;
            Long l13 = (Long) comparable2;
            long jLongValue = l13.longValue() - l12.longValue();
            if (l13.longValue() > l12.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l13.longValue() >= l12.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final /* bridge */ /* synthetic */ Comparable b() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final /* bridge */ /* synthetic */ Comparable c() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.AbstractC37323e0
        @I41.a
        public final Comparable d(Comparable comparable) {
            long jLongValue = ((Long) comparable).longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.AbstractC37323e0
        public final Comparable e(Comparable comparable, long j12) {
            Long l12 = (Long) comparable;
            F.c(j12);
            long jLongValue = l12.longValue() + j12;
            if (jLongValue < 0) {
                com.google.common.base.M.d("overflow", l12.longValue() < 0);
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.AbstractC37323e0
        @I41.a
        public final Comparable f(Comparable comparable) {
            long jLongValue = ((Long) comparable).longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        public final String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public abstract long a(C c12, C c13);

    @InterfaceC19845a
    public C b() {
        throw new NoSuchElementException();
    }

    @InterfaceC19845a
    public C c() {
        throw new NoSuchElementException();
    }

    @I41.a
    public abstract C d(C c12);

    public C e(C c12, long j12) {
        F.c(j12);
        C c13 = c12;
        for (long j13 = 0; j13 < j12; j13++) {
            c13 = (C) d(c13);
            if (c13 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c12 + ", " + j12 + ")");
            }
        }
        return c13;
    }

    @I41.a
    public abstract C f(C c12);

    public AbstractC37323e0() {
        this(false);
    }

    public AbstractC37323e0(boolean z12) {
        this.f359673b = z12;
    }
}
