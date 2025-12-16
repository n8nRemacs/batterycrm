package com.avito.android.beduin_shared.model.component.serp;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceOrderButtonModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/component/serp/ServiceOrderButtonModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ServiceOrderButtonModel extends BeduinModel {

    /* compiled from: ServiceOrderButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    ServiceOrderButtonModel copyModel(@l DeepLink deepLink, @l String str, @l String str2, boolean z12);

    @l
    String findServiceOrderDeeplinkAsString();

    @l
    DeepLink getDeeplinkToOverride();

    @l
    String getTheme();

    void setListener(@l Y41.a<G0> aVar);

    void setLoading(boolean z12);
}
