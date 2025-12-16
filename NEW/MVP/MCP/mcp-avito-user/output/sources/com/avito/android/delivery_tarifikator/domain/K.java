package com.avito.android.delivery_tarifikator.domain;

import android.net.Uri;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffEditorDeeplinkProvider.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/K;", "Lcom/avito/android/delivery_tarifikator/domain/J;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135245a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f135246b;

    /* compiled from: TariffEditorDeeplinkProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/K$a;", "", "<init>", "()V", "", "DELIVERY_TYPE_PARAM_KEY", "Ljava/lang/String;", "EDITOR_PRESENTATION_STYLE", "EDITOR_SCREEN_NAME", "TARIFF_ID_PARAM_KEY", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public K(@Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams) {
        this.f135245a = deliveryTarifikatorParams;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.J
    public final void a(@Y61.l String str) {
        this.f135246b = str;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.J
    @Y61.l
    public final BeduinUniversalPageLink b() {
        String strD = d(null);
        if (strD != null) {
            return new BeduinUniversalPageLink(strD, "bottomSheet", "SellerCustomTariffEditor", null, null, null, null, 120, null);
        }
        return null;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.J
    @Y61.l
    public final BeduinUniversalPageLink c(long j12) {
        String strD = d(Long.valueOf(j12));
        if (strD != null) {
            return new BeduinUniversalPageLink(strD, "bottomSheet", "SellerCustomTariffEditor", null, null, null, null, 120, null);
        }
        return null;
    }

    public final String d(Long l12) {
        String str = this.f135246b;
        if (str == null) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().path(str).appendQueryParameter("deliveryType", this.f135245a.f135220b);
        if (l12 != null) {
            builderAppendQueryParameter.appendQueryParameter("id", String.valueOf(l12));
        }
        return builderAppendQueryParameter.build().toString();
    }
}
