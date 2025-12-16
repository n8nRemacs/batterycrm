package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.autoteka.deeplinks.AutotekaChoosingPurchaseLink;
import com.avito.android.autoteka.deeplinks.AutotekaDirectPurchaseLink;
import com.avito.android.autoteka.deeplinks.AutotekaLandingLink;
import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import com.avito.android.autoteka.deeplinks.AutotekaWaitingForPaymentLink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_autoteka_publicGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_autoteka_publicGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_autoteka_publicGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_autoteka_publicGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(AutotekaBuyReportLink.class, new C14159a(2, "/autoteka/buyReport", C42756l.l0(new Region[]{region, region2}), true)), new Q(AutotekaChoosingPurchaseLink.class, new C14159a(1, "/autoteka/step/products", C42756l.l0(new Region[]{region, region2}), true)), new Q(AutotekaDirectPurchaseLink.class, new C14159a(1, "/autoteka/step/directPurchase", C42756l.l0(new Region[]{region, region2}), false)), new Q(AutotekaLandingLink.class, new C14159a(1, "/autoteka/landing", C42756l.l0(new Region[]{region, region2}), true)), new Q(AutotekaPaymentLink.class, new C14159a(1, "/autoteka/step/order", C42756l.l0(new Region[]{region, region2}), true)), new Q(AutotekaPreviewSearchLink.class, new C14159a(1, "/autoteka/previewSearch", C42756l.l0(new Region[]{region, region2}), false)), new Q(AutotekaReportGenerationLink.class, new C14159a(1, "/autoteka/step/report-status", C42756l.l0(new Region[]{region, region2}), false)), new Q(AutotekaReportLink.class, new C14159a(1, "/autoteka/step/report", C42756l.l0(new Region[]{region, region2}), true)), new Q(AutotekaUnifiedButtonLink.class, new C14159a(1, "/autoteka/unifiedButton", C42756l.l0(new Region[]{region, region2}), false)), new Q(AutotekaWaitingForPaymentLink.class, new C14159a(1, "/autoteka/step/order-status", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
