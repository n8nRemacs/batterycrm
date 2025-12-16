package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReliableOwnerItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/h;", "LTV0/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h extends TV0.e {

    /* compiled from: ReliableOwnerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Kc(@l PromoStyle promoStyle);

    void Oh(@l MyAdvertDetails.ReliableOwner.ProgressBar progressBar);

    void Uc(@l AttributedText attributedText);

    void Xc(@l List<MyAdvertDetails.ReliableOwner.Insight> list);

    void setTitle(@k String str);

    void uf(@l SimpleAction simpleAction, @l SimpleAction simpleAction2, @k Y41.l<? super Uri, G0> lVar);
}
