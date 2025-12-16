package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes8.dex */
public abstract class qk {

    /* renamed from: a, reason: collision with root package name */
    private static final qk f389206a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final qk f389207b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final qk f389208c = new b(1);

    public static final class b extends qk {

        /* renamed from: d, reason: collision with root package name */
        final int f389209d;

        public b(int i12) {
            super(0);
            this.f389209d = i12;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(int i12, int i13) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final int d() {
            return this.f389209d;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(long j12, long j13) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final <T> qk a(T t12, T t13, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(boolean z12, boolean z13) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk b(boolean z12, boolean z13) {
            return this;
        }
    }

    public /* synthetic */ qk(int i12) {
        this();
    }

    public static qk e() {
        return f389206a;
    }

    public abstract qk a(int i12, int i13);

    public abstract qk a(long j12, long j13);

    public abstract <T> qk a(T t12, T t13, Comparator<T> comparator);

    public abstract qk a(boolean z12, boolean z13);

    public abstract qk b(boolean z12, boolean z13);

    public abstract int d();

    public class a extends qk {
        public a() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final <T> qk a(T t12, T t13, Comparator<T> comparator) {
            int iCompare = comparator.compare(t12, t13);
            return iCompare < 0 ? qk.f389207b : iCompare > 0 ? qk.f389208c : qk.f389206a;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk b(boolean z12, boolean z13) {
            char c12 = z13 == z12 ? (char) 0 : z13 ? (char) 1 : (char) 65535;
            return c12 < 0 ? qk.f389207b : c12 > 0 ? qk.f389208c : qk.f389206a;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final int d() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(int i12, int i13) {
            char c12 = i12 < i13 ? (char) 65535 : i12 > i13 ? (char) 1 : (char) 0;
            if (c12 < 0) {
                return qk.f389207b;
            }
            return c12 > 0 ? qk.f389208c : qk.f389206a;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(long j12, long j13) {
            char c12 = j12 < j13 ? (char) 65535 : j12 > j13 ? (char) 1 : (char) 0;
            if (c12 < 0) {
                return qk.f389207b;
            }
            return c12 > 0 ? qk.f389208c : qk.f389206a;
        }

        @Override // com.yandex.mobile.ads.impl.qk
        public final qk a(boolean z12, boolean z13) {
            char c12 = z12 == z13 ? (char) 0 : z12 ? (char) 1 : (char) 65535;
            if (c12 < 0) {
                return qk.f389207b;
            }
            return c12 > 0 ? qk.f389208c : qk.f389206a;
        }
    }

    private qk() {
    }
}
