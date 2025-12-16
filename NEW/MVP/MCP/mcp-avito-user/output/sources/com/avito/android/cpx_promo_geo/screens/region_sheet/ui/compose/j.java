package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose;

import Y41.p;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: RegionSheetScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f128529l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128529l | 1);
        B bE2 = a12.E(-1083100459);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i12 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, aVar);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i12))) {
                AK.c.y(i12, bE2, i12, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            d.a(new RegionSheetState(new RegionSheetState.SearchState(new RegionSheetState.SearchState.b(null, "321"), RegionSheetState.SearchState.UiState.f128416b, null, d.b(true)), new RegionSheetState.c("Все", false), d.b(false), new RegionSheetState.a("Сохранить"), new RegionSheetState.d("Не получилось загрузить", "Попробуйте еще раз", "Повторить"), null), h.f128505l, C43175k.w(), i.f128506l, bE2, 3640);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(iA2);
        }
        return G0.f406611a;
    }
}
