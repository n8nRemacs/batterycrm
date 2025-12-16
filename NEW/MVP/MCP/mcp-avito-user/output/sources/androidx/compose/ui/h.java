package androidx.compose.ui;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.H0;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Alignment.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/h;", "Landroidx/compose/ui/f;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class h implements InterfaceC22215f {

    /* renamed from: b, reason: collision with root package name */
    public final float f40042b;

    /* compiled from: Alignment.kt */
    @H0
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/h$a;", "Landroidx/compose/ui/f$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC22215f.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f40043a;

        public a(float f12) {
            this.f40043a = f12;
        }

        @Override // androidx.compose.ui.InterfaceC22215f.b
        public final int a(int i12, int i13, @Y61.k LayoutDirection layoutDirection) {
            return Math.round((1 + this.f40043a) * ((i13 - i12) / 2.0f));
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f40043a, ((a) obj).f40043a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f40043a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f40043a, new StringBuilder("Horizontal(bias="));
        }
    }

    public h(float f12) {
        this.f40042b = f12;
    }

    @Override // androidx.compose.ui.InterfaceC22215f
    public final long a(long j12, long j13, @Y61.k LayoutDirection layoutDirection) {
        long j14 = ((((int) (j13 >> 32)) - ((int) (j12 >> 32))) << 32) | ((((int) (j13 & 4294967295L)) - ((int) (j12 & 4294967295L))) & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        float f12 = 1;
        float f13 = (this.f40042b + f12) * (((int) (j14 >> 32)) / 2.0f);
        float f14 = (f12 - 1.0f) * (((int) (j14 & 4294967295L)) / 2.0f);
        long jRound = (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
        q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        return jRound;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Float.compare(this.f40042b, ((h) obj).f40042b) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f40042b) * 31);
    }

    @Y61.k
    public final String toString() {
        return G.d(this.f40042b, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
