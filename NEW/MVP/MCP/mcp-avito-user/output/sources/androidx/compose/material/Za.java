package androidx.compose.material;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/Za;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Za {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Za f33391a = new Za();

    /* renamed from: b, reason: collision with root package name */
    public static final float f33392b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33393c;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33392b = 1;
        f33393c = 2;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l v.a aVar, float f12, long j12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        float f13;
        long j13;
        v.a aVar3;
        long jC2;
        float f14;
        androidx.compose.runtime.B bE2 = a12.E(910934799);
        int i13 = i12 | 150;
        if (bE2.p(i13 & 1, (i13 & 1171) != 1170)) {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar3 = androidx.compose.ui.v.f42878y1;
                jC2 = androidx.compose.ui.graphics.T.c(((androidx.compose.ui.graphics.T) bE2.o(A2.f32335a)).f39331a, 0.12f);
                f14 = f33392b;
            } else {
                bE2.f();
                aVar3 = aVar;
                f14 = f12;
                jC2 = j12;
            }
            bE2.Y();
            C21114b3.a(aVar3, jC2, f14, 0.0f, bE2, 6);
            long j14 = jC2;
            aVar2 = aVar3;
            f13 = f14;
            j13 = j14;
        } else {
            bE2.f();
            aVar2 = aVar;
            f13 = f12;
            j13 = j12;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Ua(this, aVar2, f13, j13, i12);
        }
    }
}
