package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.F0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.material3.InterfaceC21537e7;
import androidx.compose.material3.L3;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@InterfaceC21537e7
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/f;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f37091a = new f();

    static {
        androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k s sVar, @Y61.l v.a aVar, long j12, @Y61.l A a12, int i12) {
        int i13;
        v.a aVar2;
        long j13;
        long j14;
        v.a aVar3;
        B bE2 = a12.E(1160852333);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(sVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 384) == 0) {
            i14 = i13 | 176;
        }
        if ((i14 & 147) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
            j14 = j12;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar2 = androidx.compose.ui.v.f42878y1;
                j13 = ((T) bE2.o(L3.f35042a)).f39331a;
            } else {
                bE2.f();
                aVar2 = aVar;
                j13 = j12;
            }
            bE2.Y();
            F0.b(Boolean.valueOf(sVar.d()), null, C20310q.e(100, 0, null, 6), null, androidx.compose.runtime.internal.r.b(bE2, -1378661396, new d(aVar2, j13, sVar)), bE2, 24960, 10);
            j14 = j13;
            aVar3 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(this, sVar, aVar3, j14, i12);
        }
    }
}
