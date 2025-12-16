package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Dp.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/l;", "", "a", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42859b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f42860c = 9205357640488583168L;

    /* renamed from: a, reason: collision with root package name */
    public final long f42861a;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/l$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ l(long j12) {
        this.f42861a = j12;
    }

    public static final /* synthetic */ l a(long j12) {
        return new l(j12);
    }

    public static final boolean b(long j12, long j13) {
        return j12 == j13;
    }

    public static final float c(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L));
        h.a aVar = h.f42849c;
        return fIntBitsToFloat;
    }

    public static final float d(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        h.a aVar = h.f42849c;
        return fIntBitsToFloat;
    }

    @F3
    @Y61.k
    public static String e(long j12) {
        if (j12 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.c(d(j12))) + " x " + ((Object) h.c(c(j12)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f42861a == ((l) obj).f42861a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42861a);
    }

    @F3
    @Y61.k
    public final String toString() {
        return e(this.f42861a);
    }
}
