package com.avito.android.services_seller_subscription_payment.deeplinks;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesSellerSubscriptionPaymentResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/d;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes3.dex */
public final class d implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        return new j(bVar instanceof ServicesSellerSubscriptionPaymentLink.b ? new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k(ContextActionHandler.Link.DEEPLINK, ((ServicesSellerSubscriptionPaymentLink.b) bVar).getF280444b().toString())} : new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof ServicesSellerSubscriptionPaymentLink.b.C8343b ? ResultStatus.f337439c : bVar instanceof ServicesSellerSubscriptionPaymentLink.b.a ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
