package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: HitTestResult.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/s;", "", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22434s {

    /* renamed from: a, reason: collision with root package name */
    public final long f40868a;

    public static final int a(long j12, long j13) {
        boolean zD2 = d(j12);
        if (zD2 != d(j13)) {
            return zD2 ? -1 : 1;
        }
        int iSignum = (int) Math.signum(b(j12) - b(j13));
        return (Math.min(b(j12), b(j13)) >= 0.0f && c(j12) != c(j13)) ? c(j12) ? -1 : 1 : iSignum;
    }

    public static final float b(long j12) {
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    public static final boolean c(long j12) {
        return (j12 & 2) != 0;
    }

    public static final boolean d(long j12) {
        return (j12 & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22434s) {
            return this.f40868a == ((C22434s) obj).f40868a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40868a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("DistanceAndFlags(packedValue="), this.f40868a, ')');
    }
}
