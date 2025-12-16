package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertOldPriceHintSheet;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AdvertPriceHint;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPriceAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertPriceAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AdvertPrice;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertPriceAdapter implements com.google.gson.h<AdvertPrice> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedTextAdapter f254155a;

    public AdvertPriceAdapter(@Y61.k AttributedTextAdapter attributedTextAdapter) {
        this.f254155a = attributedTextAdapter;
    }

    @Override // com.google.gson.h
    public final AdvertPrice deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        String strS;
        String strS2;
        com.google.gson.k kVarI = iVar.i();
        if (kVarI.f362194b.containsKey("title")) {
            com.google.gson.i iVarD = kVarI.D("title");
            iVarD.getClass();
            if (iVarD instanceof com.google.gson.k) {
                com.google.gson.k kVarI2 = kVarI.I("title");
                com.google.gson.i iVarD2 = kVarI2.D("short");
                String strS3 = iVarD2 != null ? iVarD2.s() : null;
                com.google.gson.i iVarD3 = kVarI2.D("full");
                strS2 = iVarD3 != null ? iVarD3.s() : null;
                strS = strS3;
            } else {
                strS = kVarI.D("title").s();
                strS2 = null;
            }
        } else {
            strS = null;
            strS2 = null;
        }
        com.google.gson.i iVarD4 = kVarI.D("value_signed");
        String strS4 = iVarD4 != null ? iVarD4.s() : null;
        com.google.gson.i iVarD5 = kVarI.D("value_without_discount_signed");
        String strS5 = iVarD5 != null ? iVarD5.s() : null;
        com.google.gson.i iVarD6 = kVarI.D("hint");
        AdvertPriceHint advertPriceHint = (AdvertPriceHint) (iVarD6 == null ? null : gVar.b(iVarD6, AdvertPriceHint.class));
        com.google.gson.i iVarD7 = kVarI.D("value_old_hint_sheet");
        AdvertOldPriceHintSheet advertOldPriceHintSheet = (AdvertOldPriceHintSheet) (iVarD7 == null ? null : gVar.b(iVarD7, AdvertOldPriceHintSheet.class));
        com.google.gson.i iVarD8 = kVarI.D("current");
        AttributedText attributedTextB = iVarD8 != null ? this.f254155a.b(gVar, iVarD8) : null;
        String strS6 = kVarI.D("value").s();
        com.google.gson.i iVarD9 = kVarI.D("metric");
        String strS7 = iVarD9 != null ? iVarD9.s() : null;
        com.google.gson.i iVarD10 = kVarI.D("normalized_price");
        String strS8 = iVarD10 != null ? iVarD10.s() : null;
        com.google.gson.i iVarD11 = kVarI.D("value_old");
        String strS9 = iVarD11 != null ? iVarD11.s() : null;
        com.google.gson.i iVarD12 = kVarI.D("value_old_hint");
        String strS10 = iVarD12 != null ? iVarD12.s() : null;
        com.google.gson.i iVarD13 = kVarI.D("discount_percent");
        String strS11 = iVarD13 != null ? iVarD13.s() : null;
        com.google.gson.i iVarD14 = kVarI.D("presentation_style");
        return new AdvertPrice(strS, strS2, strS6, strS8, strS9, strS10, advertOldPriceHintSheet, strS7, strS4, strS5, advertPriceHint, strS11, iVarD14 != null ? iVarD14.s() : null, attributedTextB);
    }
}
