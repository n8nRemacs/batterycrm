package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimePicker.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/Ee;", "", "a", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ee {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f34679b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34680c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f34681a;

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Ee$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ Ee(int i12) {
        this.f34681a = i12;
    }

    public static final /* synthetic */ Ee a(int i12) {
        return new Ee(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Ee) {
            return this.f34681a == ((Ee) obj).f34681a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34681a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("Selection(value="), this.f34681a, ')');
    }
}
