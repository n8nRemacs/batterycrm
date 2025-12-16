package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.action.BeduinScrollToComponentAction;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.lib.design.chips.Chips;
import gj.InterfaceC40691b;
import kotlin.Metadata;
import ui.C49063a;

/* compiled from: BottomSheetScreenFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/j;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScreenFragment f104191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f104192b;

    public j(BottomSheetScreenFragment bottomSheetScreenFragment, String str) {
        this.f104191a = bottomSheetScreenFragment;
        this.f104192b = str;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        q qVar = (q) hVar;
        BottomSheetScreenFragment bottomSheetScreenFragment = this.f104191a;
        bottomSheetScreenFragment.f104166P0 = qVar;
        bottomSheetScreenFragment.y5().o(qVar, true);
        Fragment fragmentH = bottomSheetScreenFragment.getChildFragmentManager().H("bottom_sheet_tab_fragment");
        BeduinTabFragment beduinTabFragment = fragmentH instanceof BeduinTabFragment ? (BeduinTabFragment) fragmentH : null;
        if (beduinTabFragment != null) {
            InterfaceC40691b interfaceC40691b = beduinTabFragment.f104279n0;
            if (interfaceC40691b == null) {
                interfaceC40691b = null;
            }
            interfaceC40691b.o(new BeduinScrollToComponentAction(beduinTabFragment.s5().f104294c, qVar.f104201b, Boolean.TRUE, BeduinScrollToComponentAction.ScrollPosition.TOP, Boolean.FALSE));
        }
        InterfaceC28373a interfaceC28373a = bottomSheetScreenFragment.f104122q0;
        (interfaceC28373a != null ? interfaceC28373a : null).c(new C49063a(this.f104192b, "click " + qVar.f104202c));
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
