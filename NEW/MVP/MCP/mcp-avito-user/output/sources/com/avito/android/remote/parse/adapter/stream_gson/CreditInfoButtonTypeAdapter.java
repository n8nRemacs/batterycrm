package com.avito.android.remote.parse.adapter.stream_gson;

import com.avito.android.remote.model.CreditInfo;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.util.V2;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CreditInfoButtonTypeFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/CreditInfoButtonTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/CreditInfo;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreditInfoButtonTypeAdapter extends TypeAdapter<CreditInfo> {

    /* compiled from: CreditInfoButtonTypeFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254291a;

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
            f254291a = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static BuzzoolaNetworkBannerItem a(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        String strB6 = null;
        LinkedHashMap linkedHashMapB = null;
        LinkedHashMap linkedHashMapB2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                switch (strX.hashCode()) {
                    case -1032180935:
                        if (!strX.equals("bannerCode")) {
                            break;
                        } else {
                            strB3 = aVar.B();
                            break;
                        }
                    case -995427962:
                        if (!strX.equals("params")) {
                            break;
                        } else {
                            linkedHashMapB = b(aVar);
                            break;
                        }
                    case -479333219:
                        if (!strX.equals("microCategoryId")) {
                            break;
                        } else {
                            strB5 = aVar.B();
                            break;
                        }
                    case 3355:
                        if (!strX.equals("id")) {
                            break;
                        } else {
                            strB = aVar.B();
                            break;
                        }
                    case 2996870:
                        if (!strX.equals("alid")) {
                            break;
                        } else {
                            strB2 = aVar.B();
                            break;
                        }
                    case 273563251:
                        if (!strX.equals("analyticParams")) {
                            break;
                        } else {
                            linkedHashMapB2 = b(aVar);
                            break;
                        }
                    case 1296531129:
                        if (!strX.equals("categoryId")) {
                            break;
                        } else {
                            strB4 = aVar.B();
                            break;
                        }
                    case 1541836720:
                        if (!strX.equals(SearchParamsConverterKt.LOCATION_ID)) {
                            break;
                        } else {
                            strB6 = aVar.B();
                            break;
                        }
                }
            }
            aVar.L();
        }
        aVar.g();
        if (strB != null) {
            return new BuzzoolaNetworkBannerItem(strB, strB2, strB3, strB4, strB5, strB6, linkedHashMapB, linkedHashMapB2);
        }
        return null;
    }

    public static LinkedHashMap b(com.google.gson.stream.a aVar) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        while (aVar.k()) {
            String strX = aVar.x();
            JsonToken jsonTokenF2 = aVar.F();
            int i12 = jsonTokenF2 == null ? -1 : a.f254291a[jsonTokenF2.ordinal()];
            if (i12 == 1) {
                linkedHashMap.put(strX, Integer.valueOf(aVar.q()));
            } else if (i12 == 2) {
                aVar.L();
            } else if (i12 != 3) {
                linkedHashMap.put(strX, aVar.B());
            } else {
                ArrayList arrayList = new ArrayList();
                JsonToken jsonTokenF3 = aVar.F();
                JsonToken jsonToken2 = JsonToken.f362196b;
                if (jsonTokenF3 != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.a();
                while (aVar.k()) {
                    JsonToken jsonTokenF4 = aVar.F();
                    if ((jsonTokenF4 == null ? -1 : a.f254291a[jsonTokenF4.ordinal()]) == 1) {
                        arrayList.add(Integer.valueOf(aVar.q()));
                    } else {
                        arrayList.add(aVar.B());
                    }
                }
                aVar.f();
                linkedHashMap.put(strX, arrayList);
            }
        }
        aVar.g();
        return linkedHashMap;
    }

    @Override // com.google.gson.TypeAdapter
    public final CreditInfo read(com.google.gson.stream.a aVar) {
        boolean zO2;
        LinkedHashMap linkedHashMapB;
        JsonToken jsonTokenF;
        JsonToken jsonToken;
        BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItemA = null;
        try {
            jsonTokenF = aVar.F();
            jsonToken = JsonToken.f362204j;
        } catch (Exception e12) {
            e = e12;
            zO2 = false;
            linkedHashMapB = null;
        }
        if (jsonTokenF == jsonToken) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken2) {
            throw new IllegalStateException("Expected " + jsonToken2 + " but was " + aVar.F() + " at " + aVar);
        }
        aVar.b();
        zO2 = false;
        linkedHashMapB = null;
        while (aVar.k()) {
            try {
                String strX = aVar.x();
                if (strX != null) {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1111047202) {
                        if (iHashCode != 273563251) {
                            if (iHashCode == 1707117674 && strX.equals("positions")) {
                                if (aVar.F() == jsonToken) {
                                    throw new JsonParseException("");
                                }
                                if (aVar.F() != jsonToken2) {
                                    throw new IllegalStateException("Expected " + jsonToken2 + " but was " + aVar.F() + " at " + aVar);
                                }
                                aVar.b();
                                while (aVar.k()) {
                                    if (L.f(aVar.x(), "app_button_android")) {
                                        JsonToken jsonTokenF3 = aVar.F();
                                        JsonToken jsonToken3 = JsonToken.f362196b;
                                        if (jsonTokenF3 != jsonToken3) {
                                            throw new IllegalStateException("Expected " + jsonToken3 + " but was " + aVar.F() + " at " + aVar);
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            if (aVar.F() == jsonToken) {
                                                throw new JsonParseException("");
                                            }
                                            if (aVar.F() != jsonToken2) {
                                                throw new IllegalStateException("Expected " + jsonToken2 + " but was " + aVar.F() + " at " + aVar);
                                            }
                                            aVar.b();
                                            while (aVar.k()) {
                                                if (L.f(aVar.x(), "buzzoola")) {
                                                    buzzoolaNetworkBannerItemA = a(aVar);
                                                } else {
                                                    aVar.L();
                                                }
                                            }
                                            aVar.g();
                                        }
                                        aVar.f();
                                    } else {
                                        aVar.L();
                                    }
                                }
                                aVar.g();
                            }
                        } else if (strX.equals("analyticParams")) {
                            linkedHashMapB = b(aVar);
                        }
                    } else if (strX.equals("enableEventSampling")) {
                        zO2 = aVar.o();
                    }
                }
                aVar.L();
            } catch (Exception e13) {
                e = e13;
                V2.f318762a.a("credit_error_tag", aVar.toString(), e);
                return new CreditInfo(buzzoolaNetworkBannerItemA, zO2, linkedHashMapB);
            }
        }
        aVar.g();
        return new CreditInfo(buzzoolaNetworkBannerItemA, zO2, linkedHashMapB);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, CreditInfo creditInfo) {
        throw new UnsupportedOperationException();
    }
}
