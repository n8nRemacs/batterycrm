package com.avito.android.advert.item.select.controls;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.auto_select.SelectControlsButtonParams;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoSelectControlsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/controls/e;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface e extends TV0.e {

    /* compiled from: AutoSelectControlsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void BX(@Y61.l SelectControlsButtonParams selectControlsButtonParams);

    int N8();

    void SD(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void bP(@Y61.l SelectControlsButtonParams selectControlsButtonParams);
}
