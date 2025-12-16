package com.avito.android.user_advert.advert.items.realty.verification;

import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RealtyVerificationItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/verification/j;", "LTV0/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface j extends TV0.e {

    /* compiled from: RealtyVerificationItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Au(@Y61.k String str, @Y61.k MyAdvertDetails.VerificationStatus verificationStatus);

    void DC(@Y61.l MyAdvertDetails.CadastralField cadastralField, @Y61.k Y41.a<G0> aVar);

    void Le(@Y61.l SimpleAdvertAction simpleAdvertAction, @Y61.k MyAdvertDetails.VerificationStatus verificationStatus, @Y61.k Y41.l<? super String, G0> lVar);

    void g(@Y61.k AttributedText attributedText);

    void nA(@Y61.k MyAdvertDetails.VerificationStatus verificationStatus);

    void rg(@Y61.k MyAdvertDetails.VerificationStatus verificationStatus, @Y61.k Y41.a<G0> aVar);

    void setLoading(boolean z12);
}
