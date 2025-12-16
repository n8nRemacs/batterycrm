package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.region.Region;
import com.avito.android.reputation.links.BenefitLink;
import com.avito.android.reputation.links.CriteriaDetailsLink;
import com.avito.android.reputation.links.CriteriaLink;
import com.avito.android.reputation.links.GrayStateCriteriaLink;
import com.avito.android.reputation.links.GrayStateLink;
import com.avito.android.reputation.links.ReputationLink;
import com.avito.android.reputation.links.RestrictionLink;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_reputation_implGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_reputation_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_reputation_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_reputation_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(ReputationLink.class, new C14159a(1, "/reputation", C42756l.l0(new Region[]{region, region2}), false)), new Q(RestrictionLink.class, new C14159a(1, "/reputation/restriction", C42756l.l0(new Region[]{region, region2}), false)), new Q(CriteriaLink.class, new C14159a(1, "/reputation/criteria", C42756l.l0(new Region[]{region, region2}), false)), new Q(CriteriaDetailsLink.class, new C14159a(1, "/reputation/criteria/details", C42756l.l0(new Region[]{region, region2}), false)), new Q(BenefitLink.class, new C14159a(1, "/reputation/benefit", C42756l.l0(new Region[]{region, region2}), false)), new Q(GrayStateLink.class, new C14159a(1, "/reputation/gray", C42756l.l0(new Region[]{region, region2}), false)), new Q(GrayStateCriteriaLink.class, new C14159a(1, "/reputation/gray/criteria", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
