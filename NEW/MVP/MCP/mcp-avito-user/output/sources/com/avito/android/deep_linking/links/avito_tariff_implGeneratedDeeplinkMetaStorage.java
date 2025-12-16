package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.region.Region;
import com.avito.android.tariff.cpa.configure_advance.deeplink.ConfigureAdvanceLink;
import com.avito.android.tariff.cpa.configure_info.deeplink.CpaConfigureInfoLink;
import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceDeepLink;
import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceSaveDeepLink;
import com.avito.android.tariff.cpx.configure.advance_manual.deeplink.TariffCpxConfigureAdvanceManualDeepLink;
import com.avito.android.tariff.cpx.configure.landing.deeplink.TariffCpxConfigureLandingLink;
import com.avito.android.tariff.cpx.configure.levels.deeplink.TariffCpxConfigureLevelsLink;
import com.avito.android.tariff.cpx.info.limits.deeplink.TariffCpxInfoLimitsLink;
import com.avito.android.tariff.cpx.info.sf.menu.deeplink.TariffCpxInfoSfMenuLink;
import com.avito.android.tariff.cpx.limit.cancel.deeplink.TariffCpxLimitCancelLink;
import com.avito.android.tariff.cpx.limit.save.deeplink.TariffCpxLimitSaveLink;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitShowLink;
import com.avito.android.tariff.deeplink.CpaConfigureServicesLink;
import com.avito.android.tariff.deeplink.PublicationAdvanceLink;
import com.avito.android.tariff.deeplink.TariffCpaCloseLink;
import com.avito.android.tariff.deeplink.TariffCpaConfigureSaveLink;
import com.avito.android.tariff.deeplink.TariffCpaInfoLink;
import com.avito.android.tariff.deeplink.TariffCpaPublicationSaveLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceSaveLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoRefreshLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoSfTermsLink;
import com.avito.android.tariff.deeplink.TariffCpxLevelFeatureLink;
import com.avito.android.tariff.deeplink.TariffCpxSaveLink;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_tariff_implGeneratedDeeplinkMetaStorage.kt */
@P
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_tariff_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_tariff_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {
    public static final int $stable = 8;

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_tariff_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(ConfigureAdvanceLink.class, new C14159a(1, "/tariff/cpa/configure/advance", C42756l.l0(new Region[]{region, region2}), false)), new Q(CpaConfigureInfoLink.class, new C14159a(1, "/tariff/cpa/configure/info", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxConfigureAdvanceDeepLink.class, new C14159a(1, "/tariff/cpx/configure/advance", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxConfigureAdvanceSaveDeepLink.class, new C14159a(1, "/tariff/cpx/configure/advance/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxConfigureAdvanceManualDeepLink.class, new C14159a(1, "/tariff/cpx/configure/advance/manual", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxConfigureLandingLink.class, new C14159a(1, "/tariff/cpx/configure/landing", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxConfigureLevelsLink.class, new C14159a(1, "/tariff/cpx/configure/levels", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoLimitsLink.class, new C14159a(1, "/tariff/cpx/info/limits", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoSfMenuLink.class, new C14159a(1, "/tariff/cpx/info/sf/menu", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxLimitCancelLink.class, new C14159a(1, "/tariff/cpx/info/limit/cancel", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxLimitSaveLink.class, new C14159a(1, "/tariff/cpx/info/limit/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxLimitShowLink.class, new C14159a(1, "/tariff/cpx/info/limit/show", C42756l.l0(new Region[]{region, region2}), false)), new Q(CpaConfigureServicesLink.class, new C14159a(1, "/tariff/cpa/configure/services", C42756l.l0(new Region[]{region, region2}), false)), new Q(PublicationAdvanceLink.class, new C14159a(1, "/tariff/cpa/publication/advance", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpaCloseLink.class, new C14159a(1, "/tariff/cpa/close", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpaConfigureSaveLink.class, new C14159a(1, "/tariff/cpa/configure/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpaInfoLink.class, new C14159a(1, "/tariff/cpa/info", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpaPublicationSaveLink.class, new C14159a(1, "/tariff/cpa/publication/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoAdvanceSaveLink.class, new C14159a(1, "/tariff/cpx/info/advance/save", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoAdvanceShowLink.class, new C14159a(1, "/tariff/cpx/info/advance/show", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoLink.class, new C14159a(1, "/tariff/cpx/info", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoRefreshLink.class, new C14159a(1, "/tariff/cpx/info/refresh", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxInfoSfTermsLink.class, new C14159a(1, "/tariff/cpx/info/sf/terms", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxLevelFeatureLink.class, new C14159a(1, "/tariff/cpx/level/feature", C42756l.l0(new Region[]{region, region2}), false)), new Q(TariffCpxSaveLink.class, new C14159a(1, "/tariff/cpx/save", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
