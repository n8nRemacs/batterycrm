package androidx.compose.ui.text;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextRange.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/v0;", "", "a", "packedValue", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42734b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f42735c = w0.a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f42736a;

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/v0$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ v0(long j12) {
        this.f42736a = j12;
    }

    public static final /* synthetic */ v0 a(long j12) {
        return new v0(j12);
    }

    public static final boolean b(long j12, long j13) {
        return (g(j12) <= g(j13)) & (f(j13) <= f(j12));
    }

    public static final boolean c(long j12, long j13) {
        return j12 == j13;
    }

    public static final boolean d(long j12) {
        return ((int) (j12 >> 32)) == ((int) (j12 & 4294967295L));
    }

    public static final int e(long j12) {
        return f(j12) - g(j12);
    }

    public static final int f(long j12) {
        return Math.max((int) (j12 >> 32), (int) (j12 & 4294967295L));
    }

    public static final int g(long j12) {
        return Math.min((int) (j12 >> 32), (int) (j12 & 4294967295L));
    }

    public static final boolean h(long j12) {
        return ((int) (j12 >> 32)) > ((int) (j12 & 4294967295L));
    }

    @Y61.k
    public static String i(long j12) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j12 >> 32));
        sb2.append(", ");
        return androidx.appcompat.app.r.t(sb2, (int) (j12 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            return this.f42736a == ((v0) obj).f42736a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42736a);
    }

    @Y61.k
    public final String toString() {
        return i(this.f42736a);
    }
}
