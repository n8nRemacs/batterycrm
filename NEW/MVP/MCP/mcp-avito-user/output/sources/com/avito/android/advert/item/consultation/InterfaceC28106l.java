package com.avito.android.advert.item.consultation;

import android.os.Bundle;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.advert_details.realty.IncomingLineButton;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.remote.model.advert_details.realty.Review;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/l;", "LTV0/e;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.consultation.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28106l extends TV0.e {

    /* compiled from: AdvertDetailsConsultationView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.consultation.l$a */
    public static final class a {
    }

    /* compiled from: AdvertDetailsConsultationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/l$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.consultation.l$b */
    public interface b {

        /* compiled from: AdvertDetailsConsultationView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.consultation.l$b$a */
        public static final class a {
        }

        void B0(@Y61.l String str, @Y61.l String str2, @Y61.l String str3);

        void F0(@Y61.l List<Review> list);

        void P(@Y61.k DeepLink deepLink);

        void f(@Y61.k DeepLink deepLink);

        void l0(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle);

        void q1(@Y61.l ConsultationFormData consultationFormData, @Y61.l String str, @Y61.k String str2);

        void t(@Y61.k DeepLink deepLink);
    }

    void IZ(@Y61.l IncomingLineButton incomingLineButton, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void R9(@Y61.l Landing landing, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void Tf(@Y61.k Y41.l<? super View, G0> lVar);

    void b(@Y61.l String str);

    void j(@Y61.k String str);

    void sm(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2);
}
