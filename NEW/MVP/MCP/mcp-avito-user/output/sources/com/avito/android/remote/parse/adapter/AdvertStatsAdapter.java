package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertStats;
import com.avito.android.remote.model.AdvertStatsContact;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertStatsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertStatsAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AdvertStats;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertStatsAdapter implements com.google.gson.h<AdvertStats> {
    @Override // com.google.gson.h
    public final AdvertStats deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.i iVarD;
        com.google.gson.i iVarD2;
        com.google.gson.i iVarD3;
        com.google.gson.i iVarD4;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD5 = kVarI.D("views");
        Double dValueOf = null;
        com.google.gson.k kVarI2 = iVarD5 != null ? iVarD5.i() : null;
        Integer numValueOf = (kVarI2 == null || (iVarD4 = kVarI2.D("total")) == null) ? null : Integer.valueOf(iVarD4.g());
        Integer numValueOf2 = (kVarI2 == null || (iVarD3 = kVarI2.D("today")) == null) ? null : Integer.valueOf(iVarD3.g());
        com.google.gson.i iVarD6 = kVarI.D("favorites");
        com.google.gson.k kVarI3 = iVarD6 != null ? iVarD6.i() : null;
        Integer numValueOf3 = (kVarI3 == null || (iVarD2 = kVarI3.D("total")) == null) ? null : Integer.valueOf(iVarD2.g());
        com.google.gson.i iVarD7 = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
        DeepLink deepLink = (DeepLink) (iVarD7 == null ? null : gVar.b(iVarD7, DeepLink.class));
        com.google.gson.i iVarD8 = kVarI.D("contacts");
        AdvertStatsContact advertStatsContact = (AdvertStatsContact) (iVarD8 == null ? null : gVar.b(iVarD8, AdvertStatsContact.class));
        com.google.gson.i iVarD9 = kVarI.D("viewsToContactsConversion");
        com.google.gson.k kVarI4 = iVarD9 != null ? iVarD9.i() : null;
        if (kVarI4 != null && (iVarD = kVarI4.D("totalPercent")) != null) {
            dValueOf = Double.valueOf(iVarD.e());
        }
        return new AdvertStats(numValueOf, numValueOf2, numValueOf3, deepLink, advertStatsContact, dValueOf);
    }
}
