package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClipOp.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/S;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39317b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39318c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f39319a;

    /* compiled from: ClipOp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/S$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return this.f39319a == ((S) obj).f39319a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39319a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f39319a;
        return i12 == 0 ? "Difference" : i12 == f39318c ? "Intersect" : "Unknown";
    }
}
