package com.avito.android.remote.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertStatsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/adapter/MyAdvertStatsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats;", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertStatsDeserializer implements h<MyAdvertDetails.Stats> {
    @Override // com.google.gson.h
    public final MyAdvertDetails.Stats deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        MyAdvertDetails.Stats.Views views = (MyAdvertDetails.Stats.Views) gVar.b(kVarI.D("views"), MyAdvertDetails.Stats.Views.class);
        i iVarD = kVarI.D("favorites");
        MyAdvertDetails.Stats.Favorites favorites = (MyAdvertDetails.Stats.Favorites) (iVarD == null ? null : gVar.b(iVarD, MyAdvertDetails.Stats.Favorites.class));
        i iVarD2 = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
        DeepLink deepLink = (DeepLink) (iVarD2 == null ? null : gVar.b(iVarD2, DeepLink.class));
        i iVarD3 = kVarI.D("contacts");
        MyAdvertDetails.Stats.Contacts contacts = (MyAdvertDetails.Stats.Contacts) (iVarD3 == null ? null : gVar.b(iVarD3, MyAdvertDetails.Stats.Contacts.class));
        i iVarD4 = kVarI.D("metrics");
        MyAdvertDetails.Stats.StatsMetrics statsMetrics = (MyAdvertDetails.Stats.StatsMetrics) (iVarD4 == null ? null : gVar.b(iVarD4, MyAdvertDetails.Stats.StatsMetrics.class));
        i iVarD5 = kVarI.D("title");
        AttributedText attributedText = (AttributedText) (iVarD5 != null ? gVar.b(iVarD5, AttributedText.class) : null);
        i iVarD6 = kVarI.D("isProSeller");
        boolean zD2 = iVarD6 != null ? iVarD6.d() : false;
        i iVarD7 = kVarI.D("isSTR");
        return new MyAdvertDetails.Stats(views, favorites, deepLink, zD2, iVarD7 != null ? iVarD7.d() : false, contacts, statsMetrics, attributedText);
    }
}
