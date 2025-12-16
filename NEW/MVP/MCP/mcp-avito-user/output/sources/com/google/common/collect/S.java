package com.google.common.collect;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f359569a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final S f359570b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final S f359571c = new b(1);

    /* compiled from: ComparisonChain.java */
    public class a extends S {
        public a() {
            super(null);
        }

        public static S g(int i12) {
            return i12 < 0 ? S.f359570b : i12 > 0 ? S.f359571c : S.f359569a;
        }

        @Override // com.google.common.collect.S
        public final S a(int i12, int i13) {
            return g(i12 < i13 ? -1 : i12 > i13 ? 1 : 0);
        }

        @Override // com.google.common.collect.S
        public final S b(Comparable<?> comparable, Comparable<?> comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.S
        public final <T> S c(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13, Comparator<T> comparator) {
            return g(comparator.compare(t12, t13));
        }

        @Override // com.google.common.collect.S
        public final S d(boolean z12, boolean z13) {
            return g(z12 == z13 ? 0 : z12 ? 1 : -1);
        }

        @Override // com.google.common.collect.S
        public final S e(boolean z12, boolean z13) {
            return g(z13 == z12 ? 0 : z13 ? 1 : -1);
        }

        @Override // com.google.common.collect.S
        public final int f() {
            return 0;
        }
    }

    public /* synthetic */ S(a aVar) {
        this();
    }

    public abstract S a(int i12, int i13);

    public abstract S b(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> S c(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13, Comparator<T> comparator);

    public abstract S d(boolean z12, boolean z13);

    public abstract S e(boolean z12, boolean z13);

    public abstract int f();

    public S() {
    }

    /* compiled from: ComparisonChain.java */
    public static final class b extends S {

        /* renamed from: d, reason: collision with root package name */
        public final int f359572d;

        public b(int i12) {
            super(null);
            this.f359572d = i12;
        }

        @Override // com.google.common.collect.S
        public final int f() {
            return this.f359572d;
        }

        @Override // com.google.common.collect.S
        public final S a(int i12, int i13) {
            return this;
        }

        @Override // com.google.common.collect.S
        public final S b(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.S
        public final S d(boolean z12, boolean z13) {
            return this;
        }

        @Override // com.google.common.collect.S
        public final S e(boolean z12, boolean z13) {
            return this;
        }

        @Override // com.google.common.collect.S
        public final <T> S c(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13, Comparator<T> comparator) {
            return this;
        }
    }
}
