package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.region.Region;
import com.avito.android.tariff_lf_constructor.configure.category.deeplink.TariffConfigureCategoryLink;
import com.avito.android.tariff_lf_constructor.configure.landing.deeplink.TariffConfigureLandingLink;
import com.avito.android.tariff_lf_constructor.configure.level.deeplink.TariffConfigureLevelLink;
import com.avito.android.tariff_lf_constructor.configure.locations.deeplink.TariffConfigureLocationsLink;
import com.avito.android.tariff_lf_constructor.configure.setting.deeplink.TariffConfigureSettingLink;
import com.avito.android.tariff_lf_constructor.configure.size.deeplink.TariffConfigureSizeLink;
import com.avito.android.tariff_lf_constructor.configure.subcategories.deeplink.TariffConfigureSubCategoriesLink;
import com.avito.android.tariff_lf_constructor.configure.vertical.deeplink.TariffConfigureVerticalLink;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_tariff_lf_constructor_implGeneratedDeeplinkMetaStorage.kt */
@P
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_tariff_lf_constructor_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_tariff_lf_constructor_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {
    public static final int $stable = 8;

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_tariff_lf_constructor_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(TariffConfigureCategoryLink.class, new C14159a(1, "/tariff/configure/lfs/category", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureLandingLink.class, new C14159a(1, "/tariff/configure/landing", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureLevelLink.class, new C14159a(1, "/tariff/configure/level", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureLocationsLink.class, new C14159a(1, "/tariff/configure/lfs/locations", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureSettingLink.class, new C14159a(1, "/tariff/configure", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureSizeLink.class, new C14159a(1, "/tariff/configure/lfs/size", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureSubCategoriesLink.class, new C14159a(1, "/tariff/configure/lfs/subcategories", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffConfigureVerticalLink.class, new C14159a(1, "/tariff/configure/vertical", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
