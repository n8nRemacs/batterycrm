package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.error.z;
import javax.inject.Inject;
import kotlin.Metadata;
import vs.InterfaceC49375b;

/* compiled from: RegionSheetOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lvs/b;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<RegionSheetInternalAction, InterfaceC49375b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49375b b(RegionSheetInternalAction regionSheetInternalAction) {
        RegionSheetInternalAction regionSheetInternalAction2 = regionSheetInternalAction;
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SaveSelection) {
            return new InterfaceC49375b.a(((RegionSheetInternalAction.SaveSelection) regionSheetInternalAction2).f128374b);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SearchSubError) {
            return new InterfaceC49375b.C12795b(z.k(((RegionSheetInternalAction.SearchSubError) regionSheetInternalAction2).f128378b));
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.ShowValidationError) {
            return new InterfaceC49375b.C12795b(((RegionSheetInternalAction.ShowValidationError) regionSheetInternalAction2).f128382b);
        }
        return null;
    }
}
