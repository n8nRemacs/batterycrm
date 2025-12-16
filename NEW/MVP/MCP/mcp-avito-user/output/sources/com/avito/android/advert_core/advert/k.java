package com.avito.android.advert_core.advert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFlatView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/k;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface k {

    /* compiled from: AdvertDetailsFlatView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void E(@Y61.k AdvertParameters.Button button, @Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType, @Y61.l String str);

    void O0(@Y61.l DeepLink deepLink, @Y61.k String str);

    void g0();

    void h2();

    void w0(@Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType);
}
