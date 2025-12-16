package com.avito.android.gsm_realty_trx_flow.impl_module.link;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gsm_realty_trx_flow.impl_module.splitter.ab.GsmRealtyTrxFlowTestGroup;
import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;

/* compiled from: GsmRealtyTrxFlowLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_realty_trx_flow/impl_module/link/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/gsm_realty_trx_flow/public_module/link/GsmRealtyTrxFlowLink;", "_avito_gsm-realty-trx-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GsmRealtyTrxFlowLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f161261g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final XH.a f161262h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final R0 f161263i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ZH.a f161264j;

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k XH.a aVar2, @k R0 r02, @k ZH.a aVar3) {
        super(r02);
        this.f161261g = aVar;
        this.f161262h = aVar2;
        this.f161263i = r02;
        this.f161264j = aVar3;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        GsmRealtyTrxFlowTestGroup gsmRealtyTrxFlowTestGroupA = this.f161264j.a().a();
        gsmRealtyTrxFlowTestGroupA.getClass();
        if (gsmRealtyTrxFlowTestGroupA != GsmRealtyTrxFlowTestGroup.f161272d) {
            V2.f318762a.c("GsmRealtyTrxFlowLinkHandler", "not in ab", null);
            return G0.f406611a;
        }
        C43259k.d(this.f134492f, this.f161263i.a(), null, new a(this, null), 2);
        return G0.f406611a;
    }
}
