package com.avito.android.autoteka.items.directPurchase;

import Y61.k;
import Y61.l;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DirectPurchaseView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/directPurchase/h;", "LTV0/e;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h extends TV0.e {

    /* compiled from: DirectPurchaseView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void HF(@l DirectPurchaseDetails.Button button, @k Y41.l<? super DeepLink, G0> lVar);

    void IV(@l DirectPurchaseDetails.Button button, @k Y41.l<? super DeepLink, G0> lVar);

    void b(@k String str);

    void q(@l AttributedText attributedText);
}
