package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimePicker.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/Pk;", "", "a", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class Pk {

    /* renamed from: b, reason: collision with root package name */
    public static final int f35305b;

    /* renamed from: a, reason: collision with root package name */
    public final int f35306a;

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Pk$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f35305b = 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Pk) {
            return this.f35306a == ((Pk) obj).f35306a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35306a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f35306a;
        return i12 == 0 ? "Horizontal" : i12 == f35305b ? "Vertical" : "Unknown";
    }
}
