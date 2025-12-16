package androidx.compose.material3;

import androidx.compose.material3.J9;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.h;
import androidx.compose.ui.i;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: MenuPosition.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/Sl;", "", "<init>", "()V", "a", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Sl {

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Sl$a;", "Landroidx/compose/material3/J9$a;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a implements J9.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final h.a f35437a;

        public a(@Y61.k h.a aVar) {
            this.f35437a = aVar;
        }

        @Override // androidx.compose.material3.J9.a
        public final int a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, int i12, @Y61.k LayoutDirection layoutDirection) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            int i13 = (int) (j12 >> 32);
            if (i12 < i13) {
                return kotlin.ranges.s.g(this.f35437a.a(i12, i13, layoutDirection), 0, i13 - i12);
            }
            InterfaceC22215f.f39074a.getClass();
            return InterfaceC22215f.a.f39089o.a(i12, i13, layoutDirection);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return kotlin.jvm.internal.L.f(this.f35437a, ((a) obj).f35437a);
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Float.hashCode(this.f35437a.f40043a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Horizontal(alignment=" + this.f35437a + ", margin=0)";
        }
    }

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Sl$b;", "Landroidx/compose/material3/J9$b;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements J9.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final i.b f35438a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35439b;

        public b(@Y61.k i.b bVar, int i12) {
            this.f35438a = bVar;
            this.f35439b = i12;
        }

        @Override // androidx.compose.material3.J9.b
        public final int a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, int i12) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            int i13 = (int) (j12 & 4294967295L);
            int i14 = this.f35439b;
            if (i12 < i13 - (i14 * 2)) {
                return kotlin.ranges.s.g(this.f35438a.a(i12, i13), i14, (i13 - i14) - i12);
            }
            InterfaceC22215f.f39074a.getClass();
            return InterfaceC22215f.a.f39086l.a(i12, i13);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f35438a, bVar.f35438a) && this.f35439b == bVar.f35439b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f35439b) + (Float.hashCode(this.f35438a.f40047a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
            sb2.append(this.f35438a);
            sb2.append(", margin=");
            return androidx.appcompat.app.r.t(sb2, this.f35439b, ')');
        }
    }

    static {
        new Sl();
    }
}
