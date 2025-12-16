package com.avito.android.gsm_realty_trx_flow.impl_module.link;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: GsmRealtyTrxFlowLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gsm_realty_trx_flow/impl_module/link/g;", "LKu/a;", "Lcom/avito/android/gsm_realty_trx_flow/public_module/link/GsmRealtyTrxFlowLink;", "<init>", "()V", "_avito_gsm-realty-trx-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends AbstractC14350a<GsmRealtyTrxFlowLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new GsmRealtyTrxFlowLink();
    }
}
