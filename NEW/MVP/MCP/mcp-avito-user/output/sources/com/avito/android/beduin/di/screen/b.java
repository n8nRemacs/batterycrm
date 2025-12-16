package com.avito.android.beduin.di.screen;

import com.avito.android.analytics.screens.r;
import com.avito.android.beduin.di.InterfaceC28862y;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.perf.BaseBeduinScreen;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: BeduinScreenFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/di/screen/b;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BeduinScreenFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/di/screen/b$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k InterfaceC28862y interfaceC28862y, @Y61.k c cVar, @Y61.k InterfaceC30106l7 interfaceC30106l7, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k com.avito.android.universal_map.j jVar, @h31.b @Y61.k BaseBeduinScreen baseBeduinScreen, @h31.b @Y61.k r rVar);
    }

    void a(@Y61.k BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment);

    void b(@Y61.k BottomSheetScreenFragment bottomSheetScreenFragment);

    void c(@Y61.k BeduinBaseScreenFragment<com.avito.android.beduin.ui.screen.fragment.i> beduinBaseScreenFragment);

    void d(@Y61.k TabsScreenFragment tabsScreenFragment);

    void e(@Y61.k BeduinTabFragment beduinTabFragment);
}
