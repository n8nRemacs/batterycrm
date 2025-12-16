package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.region.Region;
import com.avito.android.tariff_cpt.configure.creation.deeplink.TariffCptCreationLink;
import com.avito.android.tariff_cpt.configure.forbidden.deeplink.TariffCptForbiddenLink;
import com.avito.android.tariff_cpt.configure.landing.deeplink.TariffCptConfigureLandingLink;
import com.avito.android.tariff_cpt.configure.levels.deeplink.TariffCptConfigureLevelsLink;
import com.avito.android.tariff_cpt.configure.migration.deeplink.TariffCptMigrationLink;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoLink;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoMonthsLink;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoRefreshLink;
import com.avito.android.tariff_cpt.level_feature.deeplink.TariffCptLevelFeatureLink;
import com.avito.android.tariff_cpt.levels.deeplink.TariffCptLevelSaveV3Link;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_tariff_cpt_implGeneratedDeeplinkMetaStorage.kt */
@P
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_tariff_cpt_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_tariff_cpt_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {
    public static final int $stable = 8;

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_tariff_cpt_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(TariffCptCreationLink.class, new C14159a(2, "/tariff/cpt/configure/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptForbiddenLink.class, new C14159a(2, "/tariff/cpt/configure/forbidden", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptConfigureLandingLink.class, new C14159a(2, "/tariff/cpt/configure/landing", C42756l.l0(new Region[]{region, region2}), true)), new Q(TariffCptConfigureLevelsLink.class, new C14159a(1, "/tariff/cpt/configure/levels", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptMigrationLink.class, new C14159a(2, "/tariff/cpt/configure/migration", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptInfoLink.class, new C14159a(1, "/tariff/cpt/info", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptInfoMonthsLink.class, new C14159a(1, "/tariff/cpt/info/months", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptInfoRefreshLink.class, new C14159a(1, "/tariff/cpt/info/refresh", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptLevelFeatureLink.class, new C14159a(1, "/tariff/cpt/level/feature", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCptLevelSaveV3Link.class, new C14159a(3, "/tariff/cpt/level/save", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
