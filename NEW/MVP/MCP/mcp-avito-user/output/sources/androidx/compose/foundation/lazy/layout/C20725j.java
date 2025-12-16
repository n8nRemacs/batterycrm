package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/j;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20725j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a> f29438a = new androidx.compose.runtime.collection.e<>(new a[16], 0);

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/j$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.j$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29439a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29440b;

        public a(int i12, int i13) {
            this.f29439a = i12;
            this.f29440b = i13;
            if (!(i12 >= 0)) {
                androidx.compose.foundation.internal.e.a("negative start index");
            }
            if (i13 >= i12) {
                return;
            }
            androidx.compose.foundation.internal.e.a("end index greater than start");
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29439a == aVar.f29439a && this.f29440b == aVar.f29440b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f29440b) + (Integer.hashCode(this.f29439a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Interval(start=");
            sb2.append(this.f29439a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f29440b, ')');
        }
    }
}
