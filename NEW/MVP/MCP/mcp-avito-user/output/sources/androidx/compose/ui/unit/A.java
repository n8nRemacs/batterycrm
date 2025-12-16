package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextUnit.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/A;", "", "a", "type", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42832b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f42833c = 4294967296L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f42834d = 8589934592L;

    /* renamed from: a, reason: collision with root package name */
    public final long f42835a;

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/A$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ A(long j12) {
        this.f42835a = j12;
    }

    public static final /* synthetic */ A a(long j12) {
        return new A(j12);
    }

    public static final boolean b(long j12, long j13) {
        return j12 == j13;
    }

    @Y61.k
    public static String c(long j12) {
        return b(j12, 0L) ? "Unspecified" : b(j12, f42833c) ? "Sp" : b(j12, f42834d) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f42835a == ((A) obj).f42835a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42835a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42835a);
    }
}
