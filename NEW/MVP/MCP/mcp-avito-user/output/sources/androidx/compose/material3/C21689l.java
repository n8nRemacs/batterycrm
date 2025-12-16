package androidx.compose.material3;

import androidx.compose.material3.J9;
import androidx.compose.ui.i;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: MenuPosition.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/l;", "", "<init>", "()V", "a", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21689l {

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/l$a;", "Landroidx/compose/material3/J9$a;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.l$a */
    public static final /* data */ class a implements J9.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final i.a f36766a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final i.a f36767b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36768c;

        public a(@Y61.k i.a aVar, @Y61.k i.a aVar2, int i12) {
            this.f36766a = aVar;
            this.f36767b = aVar2;
            this.f36768c = i12;
        }

        @Override // androidx.compose.material3.J9.a
        public final int a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, int i12, @Y61.k LayoutDirection layoutDirection) {
            int iA2 = this.f36767b.a(0, sVar.d(), layoutDirection);
            int i13 = -this.f36766a.a(0, i12, layoutDirection);
            LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
            int i14 = this.f36768c;
            if (layoutDirection != layoutDirection2) {
                i14 = -i14;
            }
            return sVar.f42867a + iA2 + i13 + i14;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f36766a, aVar.f36766a) && kotlin.jvm.internal.L.f(this.f36767b, aVar.f36767b) && this.f36768c == aVar.f36768c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36768c) + androidx.appcompat.app.r.d(this.f36767b.f40046a, Float.hashCode(this.f36766a.f40046a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
            sb2.append(this.f36766a);
            sb2.append(", anchorAlignment=");
            sb2.append(this.f36767b);
            sb2.append(", offset=");
            return androidx.appcompat.app.r.t(sb2, this.f36768c, ')');
        }
    }

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/l$b;", "Landroidx/compose/material3/J9$b;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.l$b */
    public static final /* data */ class b implements J9.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final i.b f36769a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final i.b f36770b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36771c;

        public b(@Y61.k i.b bVar, @Y61.k i.b bVar2, int i12) {
            this.f36769a = bVar;
            this.f36770b = bVar2;
            this.f36771c = i12;
        }

        @Override // androidx.compose.material3.J9.b
        public final int a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, int i12) {
            int iA2 = this.f36770b.a(0, sVar.b());
            return sVar.f42868b + iA2 + (-this.f36769a.a(0, i12)) + this.f36771c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f36769a, bVar.f36769a) && kotlin.jvm.internal.L.f(this.f36770b, bVar.f36770b) && this.f36771c == bVar.f36771c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36771c) + androidx.appcompat.app.r.d(this.f36770b.f40047a, Float.hashCode(this.f36769a.f40047a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
            sb2.append(this.f36769a);
            sb2.append(", anchorAlignment=");
            sb2.append(this.f36770b);
            sb2.append(", offset=");
            return androidx.appcompat.app.r.t(sb2, this.f36771c, ')');
        }
    }

    static {
        new C21689l();
    }
}
