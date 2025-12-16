package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.region.Region;
import com.avito.android.vas_performance.deeplink.AppliedServicesLink;
import com.avito.android.vas_performance.deeplink.CompetitiveVasLink;
import com.avito.android.vas_performance.deeplink.StickersBuyVasLink;
import com.avito.android.vas_performance.deeplink.StickersEditVasLink;
import com.avito.android.vas_performance.deeplink.VisualVasLink;
import com.avito.android.vas_performance.deeplink.VisualVasV2Link;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_vas_performance_implGeneratedDeeplinkMetaStorage.kt */
@P
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_vas_performance_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_vas_performance_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {
    public static final int $stable = 8;

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_vas_performance_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(AppliedServicesLink.class, new C14159a(1, "/profile/item/appliedServices", C42756l.l0(new Region[]{region, region2}), false)), new Q(CompetitiveVasLink.class, new C14159a(1, "/competitiveVas", C42756l.l0(new Region[]{region, region2}), false)), new Q(StickersBuyVasLink.class, new C14159a(1, "/vas/stickers/buy", C42756l.l0(new Region[]{region, region2}), false)), new Q(StickersEditVasLink.class, new C14159a(1, "/vas/stickers/edit", C42756l.l0(new Region[]{region, region2}), false)), new Q(VisualVasLink.class, new C14159a(1, "/visualVas", C42756l.l0(new Region[]{region, region2}), false)), new Q(VisualVasV2Link.class, new C14159a(2, "/visualVas", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
