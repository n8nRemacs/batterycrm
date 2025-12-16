package com.avito.android.advert.item.consultation;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConsultationAfterIceBreakersItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/A;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface A extends TV0.e {

    /* compiled from: ConsultationAfterIceBreakersItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C4(@Y61.l AttributedText attributedText);

    void JQ(@Y61.l String str, @Y61.k Y41.r<? super String, ? super String, ? super CallInterval, ? super String, G0> rVar);

    void R9(@Y61.l Landing landing, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void b(@Y61.l String str);

    void j(@Y61.l String str);

    void kS(@Y61.l SuperFormV4 superFormV4, @Y61.k Y41.a<G0> aVar);

    void mi(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar);

    void oW(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar);

    void p5(@Y61.k P2<? super ContactInfoResponse> p22);

    void ut(@Y61.l AttributedText attributedText, @Y61.k Y41.a<G0> aVar);
}
