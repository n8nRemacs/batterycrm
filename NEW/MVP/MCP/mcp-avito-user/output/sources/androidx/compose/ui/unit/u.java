package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IntSize.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/u;", "", "a", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42871b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f42872a;

    /* compiled from: IntSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/u$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a() {
            a aVar = u.f42871b;
        }

        public a() {
        }
    }

    @X
    private /* synthetic */ u(long j12) {
        this.f42872a = j12;
    }

    public static final /* synthetic */ u a(long j12) {
        return new u(j12);
    }

    public static boolean b(long j12, Object obj) {
        return (obj instanceof u) && j12 == ((u) obj).f42872a;
    }

    public static final boolean c(long j12, long j13) {
        return j12 == j13;
    }

    @F3
    @Y61.k
    public static String d(long j12) {
        return ((int) (j12 >> 32)) + " x " + ((int) (j12 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return b(this.f42872a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f42872a);
    }

    @F3
    @Y61.k
    public final String toString() {
        return d(this.f42872a);
    }
}
