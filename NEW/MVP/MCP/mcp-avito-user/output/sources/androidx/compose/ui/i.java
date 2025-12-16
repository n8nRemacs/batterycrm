package androidx.compose.ui;

import androidx.compose.runtime.H0;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Alignment.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/i;", "Landroidx/compose/ui/f;", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class i implements InterfaceC22215f {

    /* renamed from: b, reason: collision with root package name */
    public final float f40044b;

    /* renamed from: c, reason: collision with root package name */
    public final float f40045c;

    /* compiled from: Alignment.kt */
    @H0
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/i$a;", "Landroidx/compose/ui/f$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC22215f.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f40046a;

        public a(float f12) {
            this.f40046a = f12;
        }

        @Override // androidx.compose.ui.InterfaceC22215f.b
        public final int a(int i12, int i13, @Y61.k LayoutDirection layoutDirection) {
            float f12 = (i13 - i12) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
            float f13 = this.f40046a;
            if (layoutDirection != layoutDirection2) {
                f13 *= -1;
            }
            return Math.round((1 + f13) * f12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f40046a, ((a) obj).f40046a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f40046a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f40046a, new StringBuilder("Horizontal(bias="));
        }
    }

    /* compiled from: Alignment.kt */
    @H0
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/i$b;", "Landroidx/compose/ui/f$c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC22215f.c {

        /* renamed from: a, reason: collision with root package name */
        public final float f40047a;

        public b(float f12) {
            this.f40047a = f12;
        }

        @Override // androidx.compose.ui.InterfaceC22215f.c
        public final int a(int i12, int i13) {
            return Math.round((1 + this.f40047a) * ((i13 - i12) / 2.0f));
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f40047a, ((b) obj).f40047a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f40047a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f40047a, new StringBuilder("Vertical(bias="));
        }
    }

    public i(float f12, float f13) {
        this.f40044b = f12;
        this.f40045c = f13;
    }

    @Override // androidx.compose.ui.InterfaceC22215f
    public final long a(long j12, long j13, @Y61.k LayoutDirection layoutDirection) {
        float f12 = (((int) (j13 >> 32)) - ((int) (j12 >> 32))) / 2.0f;
        float f13 = (((int) (j13 & 4294967295L)) - ((int) (j12 & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
        float f14 = this.f40044b;
        if (layoutDirection != layoutDirection2) {
            f14 *= -1;
        }
        float f15 = 1;
        float f16 = (f14 + f15) * f12;
        float f17 = (f15 + this.f40045c) * f13;
        long jRound = (Math.round(f17) & 4294967295L) | (Math.round(f16) << 32);
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        return jRound;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f40044b, iVar.f40044b) == 0 && Float.compare(this.f40045c, iVar.f40045c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40045c) + (Float.hashCode(this.f40044b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f40044b);
        sb2.append(", verticalBias=");
        return androidx.appcompat.app.r.k(')', this.f40045c, sb2);
    }
}
