package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateInput.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/E8;", "", "a", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E8 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f34670b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34671c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f34672d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f34673a;

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/E8$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E8) {
            return this.f34673a == ((E8) obj).f34673a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34673a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f34673a;
        return i12 == 0 ? "SingleDateInput" : i12 == f34671c ? "StartDateInput" : i12 == f34672d ? "EndDateInput" : "Unknown";
    }
}
