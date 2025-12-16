package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf_constructor.configure.category.ConstructorConfigureCategoryFragment;
import com.avito.android.tariff_lf_constructor.configure.category.deeplink.TariffConfigureCategoryLink;
import com.avito.android.tariff_lf_constructor.configure.level.ConstructorConfigureLevelFragment;
import com.avito.android.tariff_lf_constructor.configure.level.deeplink.TariffConfigureLevelLink;
import com.avito.android.tariff_lf_constructor.configure.locations.ConstructorConfigureLocationsFragment;
import com.avito.android.tariff_lf_constructor.configure.locations.deeplink.TariffConfigureLocationsLink;
import com.avito.android.tariff_lf_constructor.configure.setting.ConstructorSettingFragment;
import com.avito.android.tariff_lf_constructor.configure.setting.deeplink.TariffConfigureSettingLink;
import com.avito.android.tariff_lf_constructor.configure.size.ConstructorConfigureSizeFragment;
import com.avito.android.tariff_lf_constructor.configure.size.deeplink.TariffConfigureSizeLink;
import com.avito.android.tariff_lf_constructor.configure.subcategories.ConstructorConfigureSubCategoryFragment;
import com.avito.android.tariff_lf_constructor.configure.subcategories.deeplink.TariffConfigureSubCategoriesLink;
import com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment;
import com.avito.android.tariff_lf_constructor.configure.vertical.deeplink.TariffConfigureVerticalLink;
import hD0.AbstractC40809a;
import hD0.InterfaceC40810b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ConstructorTariffDeeplinkHandlerImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/bottom_sheet/g;", "LhD0/b;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements InterfaceC40810b {
    @Inject
    public g() {
    }

    @Override // hD0.InterfaceC40810b
    @Y61.k
    public final AbstractC40809a a(@Y61.k DeepLink deepLink) {
        if (deepLink instanceof TariffConfigureSizeLink) {
            TariffConfigureSizeLink tariffConfigureSizeLink = (TariffConfigureSizeLink) deepLink;
            ConstructorConfigureSizeFragment.f300239G0.getClass();
            ConstructorConfigureSizeFragment constructorConfigureSizeFragment = new ConstructorConfigureSizeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("configure_context", tariffConfigureSizeLink.f300266b);
            bundle.putString("configure_package_id", tariffConfigureSizeLink.f300267c);
            constructorConfigureSizeFragment.setArguments(bundle);
            return new AbstractC40809a.b(constructorConfigureSizeFragment);
        }
        if (deepLink instanceof TariffConfigureCategoryLink) {
            TariffConfigureCategoryLink tariffConfigureCategoryLink = (TariffConfigureCategoryLink) deepLink;
            ConstructorConfigureCategoryFragment.f299338y0.getClass();
            ConstructorConfigureCategoryFragment constructorConfigureCategoryFragment = new ConstructorConfigureCategoryFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("configure_context", tariffConfigureCategoryLink.f299356b);
            bundle2.putString("configure_package_id", tariffConfigureCategoryLink.f299357c);
            constructorConfigureCategoryFragment.setArguments(bundle2);
            return new AbstractC40809a.b(constructorConfigureCategoryFragment);
        }
        if (deepLink instanceof TariffConfigureLocationsLink) {
            TariffConfigureLocationsLink tariffConfigureLocationsLink = (TariffConfigureLocationsLink) deepLink;
            ConstructorConfigureLocationsFragment.f299851F0.getClass();
            ConstructorConfigureLocationsFragment constructorConfigureLocationsFragment = new ConstructorConfigureLocationsFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putString("configure_context", tariffConfigureLocationsLink.f299877b);
            bundle3.putString("configure_package_id", tariffConfigureLocationsLink.f299878c);
            constructorConfigureLocationsFragment.setArguments(bundle3);
            return new AbstractC40809a.b(constructorConfigureLocationsFragment);
        }
        if (deepLink instanceof TariffConfigureSubCategoriesLink) {
            TariffConfigureSubCategoriesLink tariffConfigureSubCategoriesLink = (TariffConfigureSubCategoriesLink) deepLink;
            ConstructorConfigureSubCategoryFragment.f300415C0.getClass();
            ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = new ConstructorConfigureSubCategoryFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putString("configure_context", tariffConfigureSubCategoriesLink.f300438b);
            bundle4.putString("configure_package_id", tariffConfigureSubCategoriesLink.f300439c);
            bundle4.putString("configure_category_id", tariffConfigureSubCategoriesLink.f300440d);
            constructorConfigureSubCategoryFragment.setArguments(bundle4);
            return new AbstractC40809a.b(constructorConfigureSubCategoryFragment);
        }
        if (deepLink instanceof TariffConfigureVerticalLink) {
            ConstructorConfigureVerticalFragment.f300552y0.getClass();
            return new AbstractC40809a.b(new ConstructorConfigureVerticalFragment());
        }
        if (deepLink instanceof TariffConfigureLevelLink) {
            ConstructorConfigureLevelFragment.f299737s0.getClass();
            ConstructorConfigureLevelFragment constructorConfigureLevelFragment = new ConstructorConfigureLevelFragment();
            constructorConfigureLevelFragment.setArguments(C22777e.b(new Q("configure_context", ((TariffConfigureLevelLink) deepLink).f299801b)));
            return new AbstractC40809a.b(constructorConfigureLevelFragment);
        }
        if (!(deepLink instanceof TariffConfigureSettingLink)) {
            return new AbstractC40809a.C11249a(null);
        }
        ConstructorSettingFragment.f300022A0.getClass();
        ConstructorSettingFragment constructorSettingFragment = new ConstructorSettingFragment();
        Bundle bundle5 = new Bundle();
        bundle5.putString("configure_context", ((TariffConfigureSettingLink) deepLink).f300042b);
        constructorSettingFragment.setArguments(bundle5);
        return new AbstractC40809a.b(constructorSettingFragment);
    }
}
