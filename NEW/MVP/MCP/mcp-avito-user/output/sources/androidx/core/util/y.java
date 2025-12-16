package androidx.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Pools.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/core/util/y;", "", "<init>", "()V", "a", "b", "c", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* compiled from: Pools.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/core/util/y$a;", "", "T", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<T> {
        boolean a(@Y61.k T t12);

        @Y61.l
        T b();
    }

    /* compiled from: Pools.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/y$b;", "", "T", "Landroidx/core/util/y$a;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object[] f44899a;

        /* renamed from: b, reason: collision with root package name */
        public int f44900b;

        public b(@j.F int i12) {
            if (i12 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f44899a = new Object[i12];
        }

        @Override // androidx.core.util.y.a
        public boolean a(@Y61.k T t12) {
            Object[] objArr;
            boolean z12;
            int i12 = this.f44900b;
            int i13 = 0;
            while (true) {
                objArr = this.f44899a;
                if (i13 >= i12) {
                    z12 = false;
                    break;
                }
                if (objArr[i13] == t12) {
                    z12 = true;
                    break;
                }
                i13++;
            }
            if (z12) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i14 = this.f44900b;
            if (i14 >= objArr.length) {
                return false;
            }
            objArr[i14] = t12;
            this.f44900b = i14 + 1;
            return true;
        }

        @Override // androidx.core.util.y.a
        @Y61.l
        public T b() {
            int i12 = this.f44900b;
            if (i12 <= 0) {
                return null;
            }
            int i13 = i12 - 1;
            Object[] objArr = this.f44899a;
            T t12 = (T) objArr[i13];
            objArr[i13] = null;
            this.f44900b = i12 - 1;
            return t12;
        }
    }

    /* compiled from: Pools.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/y$c;", "", "T", "Landroidx/core/util/y$b;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Object f44901c;

        public c(int i12) {
            super(i12);
            this.f44901c = new Object();
        }

        @Override // androidx.core.util.y.b, androidx.core.util.y.a
        public final boolean a(@Y61.k T t12) {
            boolean zA2;
            synchronized (this.f44901c) {
                zA2 = super.a(t12);
            }
            return zA2;
        }

        @Override // androidx.core.util.y.b, androidx.core.util.y.a
        @Y61.l
        public final T b() {
            T t12;
            synchronized (this.f44901c) {
                t12 = (T) super.b();
            }
            return t12;
        }
    }
}
