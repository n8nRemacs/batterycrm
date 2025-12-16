package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Dp.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/h;", "", "a", "value", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42849c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final float f42850d = Float.POSITIVE_INFINITY;

    /* renamed from: e, reason: collision with root package name */
    public static final float f42851e = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    public final float f42852b;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/h$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ h(float f12) {
        this.f42852b = f12;
    }

    public static final /* synthetic */ h a(float f12) {
        return new h(f12);
    }

    public static final boolean b(float f12, float f13) {
        return Float.compare(f12, f13) == 0;
    }

    @F3
    @Y61.k
    public static String c(float f12) {
        if (Float.isNaN(f12)) {
            return "Dp.Unspecified";
        }
        return f12 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return Float.compare(this.f42852b, hVar.f42852b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Float.compare(this.f42852b, ((h) obj).f42852b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42852b);
    }

    @F3
    @Y61.k
    public final String toString() {
        return c(this.f42852b);
    }
}
