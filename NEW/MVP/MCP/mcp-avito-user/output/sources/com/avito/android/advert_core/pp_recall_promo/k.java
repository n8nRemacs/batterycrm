package com.avito.android.advert_core.pp_recall_promo;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPpRecallPromoView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/k;", "LTV0/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface k extends TV0.e {

    /* compiled from: AdvertDetailsPpRecallPromoView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Gt(@Y61.k List list, boolean z12);

    void Zk(@Y61.k Y41.l lVar, @Y61.k AttributedText attributedText);

    void b(@Y61.k String str);

    void jD(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l UniversalColor universalColor);

    void kg(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void na(@Y61.k UniversalImage universalImage, int i12, int i13, int i14, int i15);

    void pn(@Y61.k String str, @Y61.k Y41.l<? super String, G0> lVar);

    void q9(@Y61.k String str);

    void setLoading(boolean z12);

    void tb(@Y61.k Y41.l lVar, @Y61.k AttributedText attributedText);

    void z4(@Y61.k String str);
}
