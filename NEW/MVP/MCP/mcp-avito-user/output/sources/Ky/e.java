package ky;

import Y61.k;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import kotlin.Metadata;

/* compiled from: SellerType.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-management_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {
    @k
    public static final d a(@k BasicInfoV2Widget.ServicesSellerTypeConfig servicesSellerTypeConfig) {
        return new d(servicesSellerTypeConfig.getValue(), servicesSellerTypeConfig.getTypeId(), servicesSellerTypeConfig.getSubtypeId());
    }
}
