package com.avito.android.advert_core.price_list.preview;

import Y41.p;
import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.imv_services.ImvServices;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertPriceListPreviewItemViewPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class g extends H implements p<String, ImvServices, G0> {
    @Override // Y41.p
    public final G0 invoke(String str, ImvServices imvServices) {
        String str2 = str;
        ImvServices imvServices2 = imvServices;
        i iVar = (i) this.receiver;
        if (imvServices2 == null) {
            iVar.getClass();
        } else {
            W0 w02 = iVar.f84133c;
            if (w02 != null) {
                w02.n(str2, imvServices2);
            }
        }
        return G0.f406611a;
    }
}
