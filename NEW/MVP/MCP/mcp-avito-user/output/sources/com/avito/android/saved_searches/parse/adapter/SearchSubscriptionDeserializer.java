package com.avito.android.saved_searches.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.saved_searches.model.SearchSubscription;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/saved_searches/parse/adapter/SearchSubscriptionDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "<init>", "()V", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSubscriptionDeserializer implements h<SearchSubscription> {
    @Override // com.google.gson.h
    public final SearchSubscription deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        i iVarD = kVarI.D("openAction");
        DeepLink deepLink = (DeepLink) (iVarD == null ? null : gVar.b(iVarD, DeepLink.class));
        if (deepLink == null) {
            i iVarD2 = kVarI.D("searchSubscriptionAction");
            deepLink = (DeepLink) (iVarD2 == null ? null : gVar.b(iVarD2, DeepLink.class));
        }
        DeepLink deepLink2 = deepLink;
        i iVarD3 = kVarI.D("editAction");
        DeepLink deepLink3 = (DeepLink) (iVarD3 == null ? null : gVar.b(iVarD3, DeepLink.class));
        String strS = kVarI.D("id").s();
        String strS2 = kVarI.D("title").s();
        String strS3 = kVarI.D("description").s();
        long jG2 = (kVarI.D("lastUpdateTime") != null ? r3.g() : 0) * 1000;
        boolean zD2 = kVarI.D("hasNewItems").d();
        i iVarD4 = kVarI.D("filter");
        SearchParams searchParams = (SearchParams) (iVarD4 == null ? null : gVar.b(iVarD4, SearchParams.class));
        i iVarD5 = kVarI.D("ssid");
        String strS4 = iVarD5 != null ? iVarD5.s() : null;
        i iVarD6 = kVarI.D("pushFrequency");
        return new SearchSubscription(strS, strS2, strS3, jG2, zD2, searchParams, strS4, iVarD6 != null ? Integer.valueOf(iVarD6.g()) : null, deepLink3, deepLink2);
    }
}
