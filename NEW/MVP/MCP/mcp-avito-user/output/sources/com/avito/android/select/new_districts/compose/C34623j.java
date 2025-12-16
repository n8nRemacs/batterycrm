package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import com.avito.android.select.new_districts.mvi.entity.ui.RegionState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SelectDistrictScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.select.new_districts.compose.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34623j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f265751l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34623j(int i12) {
        super(2);
        this.f265751l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265751l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1978193445);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List listU = C42745f0.U(new UiItem.RegionItem("fullName", 0, 222L, "shortName", 0), new UiItem.DistrictItem(1, 333L, "name", 0, null), new UiItem.DistrictItem(2, 333L, "name1", 0, null));
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            A.a(new SelectDistrictViewState(listU, null, C42745f0.U(bool, bool2, bool2), Collections.singletonList(new RegionState(C42745f0.U(0, 1, 2), true, CheckBoxExpandableLineState.f265894c, 0, 8, null)), null, null, false, 114, null), C34622i.f265750l, bE2, 56);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C34623j(iA2);
        }
        return G0.f406611a;
    }
}
