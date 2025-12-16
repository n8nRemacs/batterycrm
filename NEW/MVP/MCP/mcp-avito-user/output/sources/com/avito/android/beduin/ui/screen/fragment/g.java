package com.avito.android.beduin.ui.screen.fragment;

import android.os.Bundle;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.network.model.screen.BottomSheetScreenModel;
import com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.deep_linking.links.ScreenStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import qi.InterfaceC47401b;

/* compiled from: BeduinFragmentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/g;", "Lcom/avito/android/beduin/ui/screen/fragment/f;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.f
    @Y61.l
    public final BeduinBaseScreenFragment a(@Y61.k InterfaceC47401b interfaceC47401b, @Y61.l ScreenStyle screenStyle, @Y61.k ScreenTransfer screenTransfer) {
        String id2 = interfaceC47401b.getId();
        String screenName = interfaceC47401b.getScreenName();
        if (screenName == null) {
            screenName = interfaceC47401b.getType();
        }
        BeduinScreenOpenParams beduinScreenOpenParams = new BeduinScreenOpenParams(id2, screenName, screenStyle, screenTransfer);
        if (interfaceC47401b instanceof BottomSheetWithTabsScreenModel) {
            BottomSheetWithTabsScreenFragment.f104203P0.getClass();
            BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = new BottomSheetWithTabsScreenFragment();
            bottomSheetWithTabsScreenFragment.f104130y0.setValue(bottomSheetWithTabsScreenFragment, BeduinBaseScreenFragment.f104118z0[0], beduinScreenOpenParams);
            return bottomSheetWithTabsScreenFragment;
        }
        if (!(interfaceC47401b instanceof BottomSheetScreenModel)) {
            if (!(interfaceC47401b instanceof TabsScreenModel)) {
                return null;
            }
            TabsScreenFragment.f104306N0.getClass();
            TabsScreenFragment tabsScreenFragment = new TabsScreenFragment();
            tabsScreenFragment.f104130y0.setValue(tabsScreenFragment, BeduinBaseScreenFragment.f104118z0[0], beduinScreenOpenParams);
            return tabsScreenFragment;
        }
        BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
        BeduinComponentTheme theme = ((BottomSheetScreenModel) interfaceC47401b).getTheme();
        aVar.getClass();
        BottomSheetScreenFragment bottomSheetScreenFragment = new BottomSheetScreenFragment();
        bottomSheetScreenFragment.f104130y0.setValue(bottomSheetScreenFragment, BeduinBaseScreenFragment.f104118z0[0], beduinScreenOpenParams);
        Bundle arguments = bottomSheetScreenFragment.getArguments();
        if (arguments != null) {
            arguments.putParcelable("arg_theme", theme);
        }
        return bottomSheetScreenFragment;
    }
}
