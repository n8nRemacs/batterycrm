package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.links.badges.BadgeBarShowLink;
import com.avito.android.loyalty.links.criteria.CriteriaLink;
import com.avito.android.loyalty.links.criteria_gray.CriteriaGrayLink;
import com.avito.android.loyalty.links.quality_service.QualityServiceLink;
import com.avito.android.loyalty.links.quality_service_gray.QualityServiceGrayLink;
import com.avito.android.loyalty.links.reputation_unavailable.ReputationUnavailableLink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_loyalty_implGeneratedDeeplinkMetaStorage.kt */
@P
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_loyalty_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_loyalty_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {
    public static final int $stable = 8;

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_loyalty_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(BadgeBarShowLink.class, new C14159a(2, "/badgeBar/show", C42756l.l0(new Region[]{region, region2}), false)), new Q(CriteriaLink.class, new C14159a(2, "/loyalty/criteria", C42756l.l0(new Region[]{region, region2}), false)), new Q(CriteriaGrayLink.class, new C14159a(2, "/loyalty/gray/criteria", C42756l.l0(new Region[]{region, region2}), false)), new Q(QualityServiceLink.class, new C14159a(2, "/loyalty/general", C42756l.l0(new Region[]{region, region2}), false)), new Q(QualityServiceGrayLink.class, new C14159a(2, "/loyalty/gray/general", C42756l.l0(new Region[]{region, region2}), false)), new Q(ReputationUnavailableLink.class, new C14159a(2, "/loyalty/unavailable", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
