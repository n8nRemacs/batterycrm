package Nv;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Jv.InterfaceC14252a;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorLink;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryTarifikatorLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LNv/a;", "Lev/b;", "Lcom/avito/android/delivery_tarifikator/DeliveryTarifikatorLink;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14615a extends AbstractC40162b<DeliveryTarifikatorLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f11802d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14252a f11803e;

    @Inject
    public C14615a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC14252a interfaceC14252a) {
        this.f11802d = interfaceC4053a;
        this.f11803e = interfaceC14252a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryTarifikatorLink deliveryTarifikatorLink = (DeliveryTarifikatorLink) deepLink;
        this.f11802d.R(this.f11803e.a(new DeliveryTarifikatorParams(deliveryTarifikatorLink.f135218b, deliveryTarifikatorLink.f135219c)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
