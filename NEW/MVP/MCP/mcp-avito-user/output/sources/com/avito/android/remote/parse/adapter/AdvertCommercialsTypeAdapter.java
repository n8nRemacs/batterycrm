package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.PositionedCommercialCascade;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advert_details.commercials.AdvertCommercialsResponse;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCommercialsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertCommercialsTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/advert_details/commercials/AdvertCommercialsResponse;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertCommercialsTypeAdapter extends TypeAdapter<AdvertCommercialsResponse> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f254153a;

    /* compiled from: AdvertCommercialsTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254154a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f254154a = iArr;
        }
    }

    public AdvertCommercialsTypeAdapter(@Y61.k Gson gson) {
        this.f254153a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AdvertCommercialsResponse read(com.google.gson.stream.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362204j;
        if (jsonTokenF == jsonToken) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken2) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
        }
        aVar.b();
        boolean zO2 = false;
        LinkedHashMap linkedHashMap = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                if (iHashCode != -1111047202) {
                    JsonToken jsonToken3 = JsonToken.f362196b;
                    if (iHashCode != 273563251) {
                        if (iHashCode == 1707117674 && strX.equals("positions")) {
                            if (aVar.F() == jsonToken) {
                                throw new JsonParseException("");
                            }
                            if (aVar.F() != jsonToken2) {
                                throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                            }
                            aVar.b();
                            while (aVar.k()) {
                                ArrayList arrayList2 = new ArrayList();
                                String strX2 = aVar.x();
                                if (aVar.F() != jsonToken3) {
                                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                }
                                aVar.a();
                                while (aVar.k()) {
                                    SerpElement serpElement = (SerpElement) this.f254153a.g(SerpElement.class).read(aVar);
                                    if (serpElement != null) {
                                        arrayList2.add(serpElement);
                                    }
                                }
                                aVar.f();
                                arrayList.add(new PositionedCommercialCascade(strX2, arrayList2));
                            }
                            aVar.g();
                        }
                    } else if (strX.equals("analyticParams")) {
                        linkedHashMap = new LinkedHashMap();
                        if (aVar.F() == jsonToken) {
                            throw new JsonParseException("");
                        }
                        if (aVar.F() != jsonToken2) {
                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                        }
                        aVar.b();
                        while (aVar.k()) {
                            String strX3 = aVar.x();
                            JsonToken jsonTokenF3 = aVar.F();
                            int i12 = jsonTokenF3 == null ? -1 : a.f254154a[jsonTokenF3.ordinal()];
                            if (i12 == 1) {
                                linkedHashMap.put(strX3, Integer.valueOf(aVar.q()));
                            } else if (i12 == 2) {
                                aVar.L();
                            } else if (i12 != 3) {
                                linkedHashMap.put(strX3, aVar.B());
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                if (aVar.F() != jsonToken3) {
                                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                }
                                aVar.a();
                                while (aVar.k()) {
                                    JsonToken jsonTokenF4 = aVar.F();
                                    if ((jsonTokenF4 == null ? -1 : a.f254154a[jsonTokenF4.ordinal()]) == 1) {
                                        arrayList3.add(Integer.valueOf(aVar.q()));
                                    } else {
                                        arrayList3.add(aVar.B());
                                    }
                                }
                                aVar.f();
                                linkedHashMap.put(strX3, arrayList3);
                            }
                        }
                        aVar.g();
                    } else {
                        aVar.L();
                    }
                } else if (strX.equals("enableEventSampling")) {
                    zO2 = aVar.o();
                } else {
                    aVar.L();
                }
            }
            aVar.L();
        }
        aVar.g();
        return arrayList.isEmpty() ? new AdvertCommercialsResponse(C42784z0.f406748b, zO2, linkedHashMap) : new AdvertCommercialsResponse(arrayList, zO2, linkedHashMap);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, AdvertCommercialsResponse advertCommercialsResponse) {
        throw new UnsupportedOperationException();
    }
}
