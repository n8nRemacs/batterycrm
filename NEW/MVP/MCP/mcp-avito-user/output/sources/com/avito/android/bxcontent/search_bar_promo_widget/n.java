package com.avito.android.bxcontent.search_bar_promo_widget;

import com.avito.android.R;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import fG0.C40289a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nl.C44441d;

/* compiled from: UdfToolbarColorsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/n;", "Lcom/avito/android/bxcontent/search_bar_promo_widget/m;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements m {
    @Inject
    public n() {
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.m
    @Y61.k
    public final UdfToolbarColors a(@Y61.k ToolbarConfig toolbarConfig) {
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor;
        NavigationBarStyle.ThemeAppearance themeAppearance = toolbarConfig.getThemeAppearance();
        UdfToolbarStyle.Color.RippleColorByThemeAppearance rippleColorByThemeAppearance = themeAppearance != null ? new UdfToolbarStyle.Color.RippleColorByThemeAppearance(C44441d.b(themeAppearance)) : null;
        C40289a.f395790a.getClass();
        UdfToolbarStyle.Color.ByRes byRes = new UdfToolbarStyle.Color.ByRes(R.color.common_transparent_white);
        UniversalColor elementsColor = toolbarConfig.getElementsColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor2 = elementsColor != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor) : null;
        UniversalColor toolbarColor = toolbarConfig.getToolbarColor();
        UdfToolbarColors.NavigationIcon navigationIcon = new UdfToolbarColors.NavigationIcon(byUniversalColor2, toolbarColor != null ? new UdfToolbarStyle.Color.ByUniversalColor(toolbarColor) : null, rippleColorByThemeAppearance);
        UniversalColor elementsColor2 = toolbarConfig.getElementsColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor3 = elementsColor2 != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor2) : null;
        UniversalColor hintColor = toolbarConfig.getHintColor();
        if (hintColor != null) {
            byUniversalColor = new UdfToolbarStyle.Color.ByUniversalColor(hintColor);
        } else {
            UniversalColor elementsColor3 = toolbarConfig.getElementsColor();
            byUniversalColor = elementsColor3 != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor3) : null;
        }
        UniversalColor searchColor = toolbarConfig.getSearchColor();
        UdfToolbarColors.SearchInput searchInput = new UdfToolbarColors.SearchInput(byUniversalColor3, byUniversalColor, searchColor != null ? new UdfToolbarStyle.Color.ByUniversalColor(searchColor) : null);
        UniversalColor elementsColor4 = toolbarConfig.getElementsColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor4 = elementsColor4 != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor4) : null;
        UniversalColor searchColor2 = toolbarConfig.getSearchColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor5 = searchColor2 != null ? new UdfToolbarStyle.Color.ByUniversalColor(searchColor2) : null;
        UniversalColor cartPointColor = toolbarConfig.getCartPointColor();
        UdfToolbarColors.FilterIcon filterIcon = new UdfToolbarColors.FilterIcon(byUniversalColor4, rippleColorByThemeAppearance, new UdfToolbarColors.Point(byUniversalColor5, cartPointColor != null ? new UdfToolbarStyle.Color.ByUniversalColor(cartPointColor) : null));
        UniversalColor elementsColor5 = toolbarConfig.getElementsColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor6 = elementsColor5 != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor5) : null;
        UniversalColor toolbarColor2 = toolbarConfig.getToolbarColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor7 = toolbarColor2 != null ? new UdfToolbarStyle.Color.ByUniversalColor(toolbarColor2) : null;
        UniversalColor toolbarColor3 = toolbarConfig.getToolbarColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor8 = toolbarColor3 != null ? new UdfToolbarStyle.Color.ByUniversalColor(toolbarColor3) : null;
        UniversalColor cartPointColor2 = toolbarConfig.getCartPointColor();
        UdfToolbarColors.CartIcon cartIcon = new UdfToolbarColors.CartIcon(byUniversalColor6, byUniversalColor7, rippleColorByThemeAppearance, new UdfToolbarColors.Point(byUniversalColor8, cartPointColor2 != null ? new UdfToolbarStyle.Color.ByUniversalColor(cartPointColor2) : null));
        UniversalColor elementsColor6 = toolbarConfig.getElementsColor();
        UdfToolbarStyle.Color.ByUniversalColor byUniversalColor9 = elementsColor6 != null ? new UdfToolbarStyle.Color.ByUniversalColor(elementsColor6) : null;
        UniversalColor toolbarColor4 = toolbarConfig.getToolbarColor();
        return new UdfToolbarColors(byRes, navigationIcon, searchInput, filterIcon, cartIcon, new UdfToolbarColors.ShareIcon(byUniversalColor9, toolbarColor4 != null ? new UdfToolbarStyle.Color.ByUniversalColor(toolbarColor4) : null, rippleColorByThemeAppearance));
    }
}
