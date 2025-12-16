package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IntOffset.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/q;", "", "a", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42862b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f42863c = 9223372034707292159L;

    /* renamed from: a, reason: collision with root package name */
    public final long f42864a;

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/q$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ q(long j12) {
        this.f42864a = j12;
    }

    public static final /* synthetic */ q a(long j12) {
        return new q(j12);
    }

    public static long b(int i12, int i13, long j12, int i14) {
        if ((i14 & 1) != 0) {
            i12 = (int) (j12 >> 32);
        }
        if ((i14 & 2) != 0) {
            i13 = (int) (j12 & 4294967295L);
        }
        return (i13 & 4294967295L) | (i12 << 32);
    }

    public static final boolean c(long j12, long j13) {
        return j12 == j13;
    }

    @F3
    public static final long d(long j12, long j13) {
        return ((((int) (j12 >> 32)) - ((int) (j13 >> 32))) << 32) | ((((int) (j12 & 4294967295L)) - ((int) (j13 & 4294967295L))) & 4294967295L);
    }

    @F3
    public static final long e(long j12, long j13) {
        return ((((int) (j12 >> 32)) + ((int) (j13 >> 32))) << 32) | ((((int) (j12 & 4294967295L)) + ((int) (j13 & 4294967295L))) & 4294967295L);
    }

    @F3
    @Y61.k
    public static String f(long j12) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j12 >> 32));
        sb2.append(", ");
        return androidx.appcompat.app.r.t(sb2, (int) (j12 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f42864a == ((q) obj).f42864a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42864a);
    }

    @F3
    @Y61.k
    public final String toString() {
        return f(this.f42864a);
    }
}
