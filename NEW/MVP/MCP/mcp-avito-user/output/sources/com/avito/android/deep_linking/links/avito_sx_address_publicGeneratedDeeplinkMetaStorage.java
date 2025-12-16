package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.SelectAddressListLink;
import com.avito.android.SxAddressDeleteLink;
import com.avito.android.SxAddressEditLink;
import com.avito.android.SxAddressEntryLinks;
import com.avito.android.SxAddressListLink;
import com.avito.android.SxAddressListRefreshLink;
import com.avito.android.SxAddressRevalidateLink;
import com.avito.android.SxAddressVideoVerificationLink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_sx_address_publicGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_sx_address_publicGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_sx_address_publicGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_sx_address_publicGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(SxAddressListLink.class, new C14159a(1, "/geo/seller/address/list", C42756l.l0(new Region[]{region, region2}), true)), new Q(SxAddressDeleteLink.class, new C14159a(1, "/geo/seller/address/delete", C42756l.l0(new Region[]{region, region2}), false)), new Q(SxAddressEditLink.class, new C14159a(1, "/geo/seller/address/edit", C42756l.l0(new Region[]{region, region2}), false)), new Q(SxAddressRevalidateLink.class, new C14159a(1, "/geo/seller/address/revalidate", C42756l.l0(new Region[]{region, region2}), false)), new Q(SxAddressEntryLinks.class, new C14159a(1, "/geo/addresses/links", C42756l.l0(new Region[]{region, region2}), false)), new Q(SxAddressListRefreshLink.class, new C14159a(1, "/geo/seller/address/list/refresh", C42756l.l0(new Region[]{region, region2}), false)), new Q(SelectAddressListLink.class, new C14159a(1, "/geo/seller/address/publishList", C42756l.l0(new Region[]{region, region2}), false)), new Q(SxAddressVideoVerificationLink.class, new C14159a(1, "/geo/seller/address/videoVerify", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
