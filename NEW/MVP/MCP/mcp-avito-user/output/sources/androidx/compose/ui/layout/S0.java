package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScaleFactor.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/S0;", "", "a", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40400b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f40401a;

    /* compiled from: ScaleFactor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/S0$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        Float.floatToRawIntBits(Float.NaN);
        Float.floatToRawIntBits(Float.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S0) {
            return this.f40401a == ((S0) obj).f40401a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40401a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScaleFactor(");
        long j12 = this.f40401a;
        sb2.append(Float.intBitsToFloat((int) (j12 >> 32)));
        sb2.append(", ");
        sb2.append(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        sb2.append(')');
        return sb2.toString();
    }
}
