package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import com.avito.android.beduin.common.local_deeplink.a;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import yi.C50254a;

/* compiled from: BottomSheetWithTabsScreenFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class g extends H implements Y41.l<com.avito.android.beduin.common.local_deeplink.a, G0> {
    @Override // Y41.l
    public final G0 invoke(com.avito.android.beduin.common.local_deeplink.a aVar) {
        com.avito.android.beduin.ui.screen.fragment.tab.g gVar;
        com.avito.android.beduin.common.local_deeplink.a aVar2 = aVar;
        BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = (BottomSheetWithTabsScreenFragment) this.receiver;
        BottomSheetWithTabsScreenFragment.a aVar3 = BottomSheetWithTabsScreenFragment.f104203P0;
        bottomSheetWithTabsScreenFragment.getClass();
        if ((aVar2 instanceof a.C3101a) && (gVar = bottomSheetWithTabsScreenFragment.f104214J0) != null) {
            a.C3101a c3101a = (a.C3101a) aVar2;
            Iterator<C50254a> it = gVar.f104305j.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (L.f(it.next().f443469a, c3101a.f103427a)) {
                    break;
                }
                i12++;
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                bottomSheetWithTabsScreenFragment.A5().setCurrentItem(numValueOf.intValue());
            }
        }
        return G0.f406611a;
    }
}
