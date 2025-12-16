package com.avito.android.cpx_promo_geo.screens.region_sheet.ui;

import Y41.l;
import android.app.Dialog;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "selectedIds", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<List<? extends Long>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetFragment f128473l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RegionSheetFragment regionSheetFragment) {
        super(1);
        this.f128473l = regionSheetFragment;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends Long> list) {
        List<? extends Long> list2 = list;
        RegionSheetFragment regionSheetFragment = this.f128473l;
        String tag = regionSheetFragment.getTag();
        if (tag == null) {
            tag = "";
        }
        List<? extends Long> list3 = list2;
        long[] jArr = new long[list3.size()];
        Iterator<? extends Long> it = list3.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        C22960s.a(C22777e.b(new Q("cpx_promo_geo_region_sheet_result_ids", jArr)), regionSheetFragment, tag);
        Dialog dialog = regionSheetFragment.getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
        if (dVar != null) {
            dVar.r();
        }
        return G0.f406611a;
    }
}
