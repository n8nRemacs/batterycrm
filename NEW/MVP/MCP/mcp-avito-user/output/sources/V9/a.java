package V9;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.advert_details.UserIconType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    public static final int a(@k Context context, @l Integer num) {
        if (num.intValue() == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(num.intValue());
    }

    @k
    public static final UserIconType b(@k AdvertDetails advertDetails) {
        return advertDetails.isShopAdvert() ? UserIconType.SHOP : advertDetails.isFromCompany() ? UserIconType.COMPANY : UserIconType.PRIVATE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.remote.model.advert_details.ContactBarData c(com.avito.android.remote.model.AdvertDetails r49, java.lang.String r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V9.a.c(com.avito.android.remote.model.AdvertDetails, java.lang.String, boolean, boolean, boolean, boolean, boolean, int):com.avito.android.remote.model.advert_details.ContactBarData");
    }
}
