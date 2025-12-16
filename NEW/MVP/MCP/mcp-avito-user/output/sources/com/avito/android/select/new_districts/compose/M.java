package com.avito.android.select.new_districts.compose;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SelectedDistrictsChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class M extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f265711l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(int i12) {
        super(2);
        this.f265711l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265711l | 1);
        androidx.compose.runtime.B bE2 = a12.E(512653988);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i12 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA3);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i12))) {
                AK.c.y(i12, bE2, i12, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            List listU = C42745f0.U(new DistrictChip("title1", 0, 0), new DistrictChip("title2", 1, 0), new DistrictChip("title3", 2, 0), new DistrictChip("title444", 3, 0), new DistrictChip("title5", 4, 0), new DistrictChip("title6", 5, 1), new DistrictChip("title7", 6, 1), new DistrictChip("title7", 7, 1), new DistrictChip("title7", 8, 1), new DistrictChip("title8", 9, 1), new DistrictChip("title7", 10, 1));
            ArrayList arrayList = new ArrayList(20);
            for (int i13 = 0; i13 < 20; i13++) {
                arrayList.add(Boolean.TRUE);
            }
            U.a(listU, arrayList, L.f265710l, bE2, 448);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new M(iA2);
        }
        return G0.f406611a;
    }
}
