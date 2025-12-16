package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.inset.AdditionalItem;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalItemValueTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdditionalItemValueTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/inset/AdditionalItem;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalItemValueTypeAdapter extends TypeAdapter<AdditionalItem> {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter<UniversalColor> f254148a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<DeepLink> f254149b;

    /* renamed from: c, reason: collision with root package name */
    public final TypeAdapter<UniversalImage> f254150c;

    public AdditionalItemValueTypeAdapter(@Y61.k Gson gson) {
        this.f254148a = gson.g(UniversalColor.class);
        this.f254149b = gson.g(DeepLink.class);
        this.f254150c = gson.g(UniversalImage.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.gson.TypeAdapter
    public final AdditionalItem read(com.google.gson.stream.a aVar) throws IOException {
        UniversalImage universalImage;
        DeepLink deepLink;
        JsonToken jsonToken;
        UniversalImage universalImage2;
        AdditionalItem.Position position;
        JsonToken jsonToken2;
        AdditionalItem.Position position2 = AdditionalItem.Position.END;
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken3 = JsonToken.f362204j;
        if (jsonTokenF == jsonToken3) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken4 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken4) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken4, " but was "), " at ", aVar));
        }
        aVar.b();
        AdditionalItem.Position position3 = position2;
        String strB = null;
        UniversalImage universalImage3 = null;
        DeepLink deepLink2 = null;
        UniversalColor universalColor = null;
        String strB2 = null;
        UniversalColor universalColor2 = null;
        while (aVar.k()) {
            while (aVar.k()) {
                String str = strB;
                String strX = aVar.x();
                if (strX != null) {
                    universalImage2 = universalImage3;
                    int iHashCode = strX.hashCode();
                    position = position3;
                    if (iHashCode == 3575610) {
                        jsonToken = jsonToken3;
                        if (strX.equals("type")) {
                            strB = aVar.B();
                        }
                        universalImage3 = universalImage2;
                        position3 = position;
                        jsonToken3 = jsonToken;
                    } else if (iHashCode != 111972721) {
                        if (iHashCode == 747804969 && strX.equals("position")) {
                            String strB3 = aVar.B();
                            position3 = kotlin.jvm.internal.L.f(strB3, "start") ? AdditionalItem.Position.START : kotlin.jvm.internal.L.f(strB3, "end") ? AdditionalItem.Position.END : AdditionalItem.Position.END;
                            strB = str;
                            universalImage3 = universalImage2;
                        } else {
                            jsonToken = jsonToken3;
                        }
                    } else if (!strX.equals("value")) {
                        jsonToken = jsonToken3;
                    } else {
                        if (aVar.F() == jsonToken3) {
                            throw new JsonParseException("");
                        }
                        if (aVar.F() != jsonToken4) {
                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken4, " but was "), " at ", aVar));
                        }
                        aVar.b();
                        universalImage3 = universalImage2;
                        while (aVar.k()) {
                            while (aVar.k()) {
                                String strX2 = aVar.x();
                                if (strX2 != null) {
                                    int iHashCode2 = strX2.hashCode();
                                    jsonToken2 = jsonToken3;
                                    TypeAdapter<UniversalColor> typeAdapter = this.f254148a;
                                    switch (iHashCode2) {
                                        case -1063571914:
                                            if (strX2.equals("textColor")) {
                                                universalColor2 = typeAdapter.read(aVar);
                                                break;
                                            }
                                            break;
                                        case 116076:
                                            if (strX2.equals(TooltipAttribute.PARAM_DEEP_LINK)) {
                                                deepLink2 = this.f254149b.read(aVar);
                                                break;
                                            }
                                            break;
                                        case 100313435:
                                            if (strX2.equals("image")) {
                                                universalImage3 = this.f254150c.read(aVar);
                                                break;
                                            }
                                            break;
                                        case 110371416:
                                            if (strX2.equals("title")) {
                                                strB2 = aVar.B();
                                                break;
                                            }
                                            break;
                                        case 1287124693:
                                            if (strX2.equals("backgroundColor")) {
                                                universalColor = typeAdapter.read(aVar);
                                                break;
                                            }
                                            break;
                                    }
                                    jsonToken3 = jsonToken2;
                                } else {
                                    jsonToken2 = jsonToken3;
                                }
                                aVar.L();
                                jsonToken3 = jsonToken2;
                            }
                        }
                        aVar.g();
                        strB = str;
                        position3 = position;
                    }
                } else {
                    jsonToken = jsonToken3;
                    universalImage2 = universalImage3;
                    position = position3;
                }
                aVar.L();
                strB = str;
                universalImage3 = universalImage2;
                position3 = position;
                jsonToken3 = jsonToken;
            }
        }
        aVar.g();
        if (kotlin.jvm.internal.L.f(strB, "showMore")) {
            if (strB2 != null && (deepLink = deepLink2) != null) {
                return new AdditionalItem.ShowMore(position3, universalColor, deepLink, strB2, universalColor2);
            }
        } else if (kotlin.jvm.internal.L.f(strB, "image") && (universalImage = universalImage3) != null) {
            return new AdditionalItem.Image(position3, universalColor, deepLink2, universalImage);
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, AdditionalItem additionalItem) {
        throw new UnsupportedOperationException();
    }
}
