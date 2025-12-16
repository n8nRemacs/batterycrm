package com.avito.android.advert_collection_adding;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionAddingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/k;", "", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface k {
    @Y61.k
    InterfaceC43160i<AdvertCollectionAddingInternalAction> a();

    @Y61.k
    InterfaceC43160i b(@Y61.k DeepLink deepLink, @Y61.k String str);

    @Y61.k
    InterfaceC43160i<AdvertCollectionAddingInternalAction> c(@Y61.k String str);
}
