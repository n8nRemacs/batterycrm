package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Scaffold.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/C7;", "", "a", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C7 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f34588b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34589c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f34590d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f34591e = 3;

    /* renamed from: a, reason: collision with root package name */
    public final int f34592a;

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/C7$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7) {
            return this.f34592a == ((C7) obj).f34592a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34592a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f34592a;
        return a(i12, 0) ? "FabPosition.Start" : a(i12, f34589c) ? "FabPosition.Center" : a(i12, f34590d) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }
}
