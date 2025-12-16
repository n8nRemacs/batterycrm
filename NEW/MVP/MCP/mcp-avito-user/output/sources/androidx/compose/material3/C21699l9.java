package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ListItem.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/l9;", "", "a", "lines", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21699l9 implements Comparable<C21699l9> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f36794c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f36795d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f36796e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f36797f = 3;

    /* renamed from: b, reason: collision with root package name */
    public final int f36798b;

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/l9$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.l9$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21699l9 c21699l9) {
        return kotlin.jvm.internal.L.g(this.f36798b, c21699l9.f36798b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21699l9) {
            return this.f36798b == ((C21699l9) obj).f36798b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36798b);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("ListItemType(lines="), this.f36798b, ')');
    }
}
