package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.data.DayRangeType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DayItem.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isPressed", "Landroidx/compose/ui/graphics/T;", "animatedBorderColor", "date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k DayRangeType dayRangeType, boolean z12, @Y61.k F f12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, @Y61.l v.a aVar, @Y61.k Y41.a aVar2, @Y61.l A a12, int i12) {
        int i13;
        v.a aVar3;
        com.akita.compose.foundation.p pVar;
        com.akita.compose.foundation.p pVar2;
        Object objA;
        B bE2 = a12.E(-145000829);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(dayRangeType) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.j(z12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(f12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.j(z13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.j(z14) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i13 |= bE2.j(z15) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i13 |= bE2.j(z16) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i13 |= bE2.j(z17) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i13 |= bE2.j(z18) ? 536870912 : 268435456;
        }
        int i14 = i13;
        int i15 = (bE2.j(z19) ? 4 : 2) | 48 | (bE2.u(aVar2) ? 256 : 128);
        if ((i14 & 1533916891) == 306783378 && (i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
        } else {
            v.a aVar4 = v.f42878y1;
            bE2.C(29804871);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            InterfaceC22204y1 interfaceC22204y1A = androidx.compose.foundation.interaction.q.a(mVar, bE2, 6);
            boolean zBooleanValue = ((Boolean) interfaceC22204y1A.getF42167b()).booleanValue();
            F.a aVar5 = f12.f61127a;
            com.akita.compose.foundation.p pVar3 = (!zBooleanValue || z14) ? z14 ? aVar5.f61153i : z13 ? aVar5.f61154j : (z15 && z16) ? aVar5.f61155k : aVar5.f61152h : aVar5.f61152h;
            if (z14) {
                aVar3 = aVar4;
                pVar = aVar5.f61157m;
            } else {
                aVar3 = aVar4;
                pVar = (z13 && z19) ? aVar5.f61159o : null;
            }
            boolean zBooleanValue2 = ((Boolean) interfaceC22204y1A.getF42167b()).booleanValue();
            int i16 = i14 >> 6;
            int i17 = com.akita.compose.component.floating_container.c.f61576e;
            com.akita.compose.foundation.p pVar4 = pVar;
            int i18 = (i14 & 7168) | (i16 & 14) | ((i14 >> 9) & 896) | 4096;
            bE2.C(-1456278029);
            bE2.C(1490587222);
            com.akita.compose.foundation.p pVar5 = pVar3;
            boolean zJ2 = ((((i18 & 896) ^ 384) > 256 && bE2.j(z14)) || (i18 & 384) == 256) | ((((i18 & 14) ^ 6) > 4 && bE2.j(z12)) || (i18 & 6) == 4) | bE2.j(zBooleanValue2);
            Object objT2 = bE2.t();
            if (zJ2 || objT2 == c1651a) {
                if (!z12 || zBooleanValue2 || z14) {
                    com.akita.compose.foundation.p.f63635e.getClass();
                    pVar2 = com.akita.compose.foundation.p.f63637g;
                } else {
                    pVar2 = aVar5.f61147c;
                }
                objT2 = pVar2;
                bE2.H(objT2);
            }
            com.akita.compose.foundation.p pVar6 = (com.akita.compose.foundation.p) objT2;
            bE2.X(false);
            bE2.X(false);
            int i19 = ((i14 >> 3) & 14) | 64 | (i16 & 112);
            bE2.C(1445032909);
            bE2.C(1037308153);
            boolean z22 = (((i19 & 14) ^ 6) > 4 && bE2.B(dayRangeType)) || (i19 & 6) == 4;
            Object objT3 = bE2.t();
            if (z22 || objT3 == c1651a) {
                int iOrdinal = dayRangeType.ordinal();
                if (iOrdinal == 0) {
                    objA = androidx.compose.foundation.shape.o.a(aVar5.f61146b);
                } else if (iOrdinal == 1) {
                    float f13 = aVar5.f61146b;
                    objA = androidx.compose.foundation.shape.o.c(f13, 0.0f, 0.0f, f13, 6);
                } else if (iOrdinal == 2) {
                    float f14 = aVar5.f61146b;
                    objA = androidx.compose.foundation.shape.o.c(0.0f, f14, f14, 0.0f, 9);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objA = Y0.f39346a;
                }
                objT3 = objA;
                bE2.H(objT3);
            }
            h1 h1Var = (h1) objT3;
            bE2.X(false);
            bE2.X(false);
            b(z18, str, aVar5.f61160p, aVar5.f61145a, pVar5, pVar4, z17, !z13, h1Var, aVar5.f61150f, ((Boolean) interfaceC22204y1A.getF42167b()).booleanValue() ? aVar5.f61151g : (z13 || (z15 && z16)) ? aVar5.f61149e : aVar5.f61151g, mVar, !z14 ? com.akita.compose.foundation.n.d(0.0f, 7, 0L, false) : null, androidx.compose.foundation.shape.o.a(aVar5.f61146b), aVar5.f61148d, pVar6, f12.f61136j, f12.f61128b, aVar2, aVar3, bE2, ((i14 >> 27) & 14) | ((i14 << 3) & 112) | (i16 & 3670016), ((i15 << 18) & 234881024) | 805306416);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(str, dayRangeType, z12, f12, z13, z14, z15, z16, z17, z18, z19, aVar3, aVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0248  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r42, @Y61.k java.lang.String r43, long r44, @Y61.k com.akita.compose.foundation.r r46, @Y61.k com.akita.compose.foundation.p r47, @Y61.l com.akita.compose.foundation.p r48, boolean r49, boolean r50, @Y61.k androidx.compose.ui.graphics.h1 r51, float r52, @Y61.l com.akita.compose.foundation.p r53, @Y61.k androidx.compose.foundation.interaction.m r54, @Y61.l androidx.compose.foundation.InterfaceC20834q1 r55, @Y61.k androidx.compose.foundation.shape.n r56, float r57, @Y61.k com.akita.compose.foundation.p r58, @Y61.k com.akita.compose.component.skeleton.d r59, @Y61.k com.akita.compose.component.date_picker.F.b r60, @Y61.k Y41.a r61, @Y61.l androidx.compose.ui.v r62, @Y61.l androidx.compose.runtime.A r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.date_picker.ui.i.b(boolean, java.lang.String, long, com.akita.compose.foundation.r, com.akita.compose.foundation.p, com.akita.compose.foundation.p, boolean, boolean, androidx.compose.ui.graphics.h1, float, com.akita.compose.foundation.p, androidx.compose.foundation.interaction.m, androidx.compose.foundation.q1, androidx.compose.foundation.shape.n, float, com.akita.compose.foundation.p, com.akita.compose.component.skeleton.d, com.akita.compose.component.date_picker.F$b, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(long j12, @Y61.k com.akita.compose.component.skeleton.d dVar, @Y61.k F.b bVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1570677015);
        if ((i12 & 14) == 0) {
            i13 = (bE2.n(j12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(dVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(bVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v vVarP = C20588k2.p(j12, vVar);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarP);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.p(bVar.f61164d, v.f42878y1), androidx.compose.foundation.shape.o.a(bVar.f61162b), dVar, true, bE2, 3072 | ((i13 << 3) & 896), 0), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(j12, dVar, bVar, vVar, i12);
        }
    }
}
