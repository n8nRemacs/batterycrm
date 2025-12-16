package com.avito.android.remote.model.universalDeliveryType;

import Y61.k;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalDeliveryTypeTabDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeTabDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "<init>", "()V", "Lcom/google/gson/i;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/g;", "context", "deserialize", "(Lcom/google/gson/i;Ljava/lang/reflect/Type;Lcom/google/gson/g;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalDeliveryTypeTabDeserializer implements h<UniversalDeliveryTypeContent.Tab> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.h
    @k
    public UniversalDeliveryTypeContent.Tab deserialize(@k i json, @k Type typeOfT, @k g context) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str;
        Class<BeduinModel> cls;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str2;
        Class<BeduinModel> cls2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        com.google.gson.k kVarI = json.i();
        com.google.gson.k kVarI2 = kVarI.I("content");
        String str3 = (String) context.b(kVarI.D("type"), String.class);
        i iVarD = kVarI.D("onSelectActions");
        i iVarD2 = kVarI.D("onManualSelectActions");
        int iHashCode = str3.hashCode();
        ArrayList arrayList11 = null;
        if (iHashCode != -1410668828) {
            String str4 = "mainComponents";
            String str5 = "mainFormId";
            Class<BeduinModel> cls3 = BeduinModel.class;
            if (iHashCode == 96673) {
                Class<BeduinModel> cls4 = cls3;
                String str6 = str3;
                if (str6.equals(ProfileTab.ALL)) {
                    String str7 = (String) context.b(kVarI.D("title"), String.class);
                    f fVarC = iVarD != null ? C34328m0.c(iVarD) : null;
                    if (fVarC == null) {
                        str = str6;
                        cls = cls4;
                        arrayList5 = null;
                    } else {
                        int size = fVarC.f362000b.size();
                        ArrayList arrayList12 = new ArrayList(size);
                        int iC2 = 0;
                        while (iC2 < size) {
                            i iVarW = fVarC.w(iC2);
                            ArrayList arrayList13 = arrayList12;
                            iC2 = b.c(context, iVarW != null ? iVarW.i() : null, BeduinAction.class, arrayList13, iC2, 1);
                            str6 = str6;
                            size = size;
                            arrayList12 = arrayList13;
                            fVarC = fVarC;
                            cls4 = cls4;
                        }
                        arrayList5 = arrayList12;
                        str = str6;
                        cls = cls4;
                    }
                    f fVarC2 = iVarD2 != null ? C34328m0.c(iVarD2) : null;
                    if (fVarC2 == null) {
                        arrayList6 = null;
                    } else {
                        int size2 = fVarC2.f362000b.size();
                        ArrayList arrayList14 = new ArrayList(size2);
                        int iC3 = 0;
                        while (iC3 < size2) {
                            i iVarW2 = fVarC2.w(iC3);
                            iC3 = b.c(context, iVarW2 != null ? iVarW2.i() : null, BeduinAction.class, arrayList14, iC3, 1);
                            size2 = size2;
                            arrayList14 = arrayList14;
                        }
                        arrayList6 = arrayList14;
                    }
                    i iVarD3 = kVarI.D("isEnabled");
                    Boolean bool = (Boolean) (iVarD3 == null ? null : context.b(iVarD3, Boolean.class));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    i iVarD4 = kVarI2.D("mainFormId");
                    String str8 = (String) (iVarD4 != null ? context.b(iVarD4, String.class) : null);
                    ArrayList arrayList15 = kVarI2.D("mainComponents").h().f362000b;
                    ArrayList arrayList16 = new ArrayList(arrayList15.size());
                    Iterator it = arrayList15.iterator();
                    while (it.hasNext()) {
                        arrayList16.add(context.b((i) it.next(), cls));
                    }
                    return new UniversalDeliveryTypeContent.Tab.ShippingCompetition(str, str7, arrayList5, arrayList6, zBooleanValue, str8, arrayList16);
                }
                str3 = str6;
            } else if (iHashCode == 957939245 && str3.equals("courier")) {
                String str9 = (String) context.b(kVarI.D("title"), String.class);
                f fVarC3 = iVarD != null ? C34328m0.c(iVarD) : null;
                if (fVarC3 == null) {
                    str2 = str3;
                    cls2 = cls3;
                    arrayList7 = null;
                } else {
                    int size3 = fVarC3.f362000b.size();
                    ArrayList arrayList17 = new ArrayList(size3);
                    int iC4 = 0;
                    while (iC4 < size3) {
                        i iVarW3 = fVarC3.w(iC4);
                        ArrayList arrayList18 = arrayList17;
                        iC4 = b.c(context, iVarW3 != null ? iVarW3.i() : null, BeduinAction.class, arrayList18, iC4, 1);
                        str5 = str5;
                        str4 = str4;
                        size3 = size3;
                        cls3 = cls3;
                        arrayList17 = arrayList18;
                        fVarC3 = fVarC3;
                        str3 = str3;
                    }
                    arrayList7 = arrayList17;
                    str2 = str3;
                    cls2 = cls3;
                }
                String str10 = str5;
                String str11 = str4;
                f fVarC4 = iVarD2 != null ? C34328m0.c(iVarD2) : null;
                if (fVarC4 == null) {
                    arrayList8 = null;
                } else {
                    int size4 = fVarC4.f362000b.size();
                    ArrayList arrayList19 = new ArrayList(size4);
                    int iC5 = 0;
                    while (iC5 < size4) {
                        i iVarW4 = fVarC4.w(iC5);
                        iC5 = b.c(context, iVarW4 != null ? iVarW4.i() : null, BeduinAction.class, arrayList19, iC5, 1);
                        size4 = size4;
                        arrayList19 = arrayList19;
                    }
                    arrayList8 = arrayList19;
                }
                i iVarD5 = kVarI.D("isEnabled");
                Boolean bool2 = (Boolean) (iVarD5 == null ? null : context.b(iVarD5, Boolean.class));
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                String str12 = (String) context.b(kVarI2.D(str10), String.class);
                ArrayList arrayList20 = kVarI2.D(str11).h().f362000b;
                ArrayList arrayList21 = new ArrayList(arrayList20.size());
                Iterator it2 = arrayList20.iterator();
                while (it2.hasNext()) {
                    arrayList21.add(context.b((i) it2.next(), cls2));
                }
                Class<BeduinModel> cls5 = cls2;
                i iVarD6 = kVarI2.D("bottomFormId");
                String str13 = (String) (iVarD6 == null ? null : context.b(iVarD6, String.class));
                i iVarD7 = kVarI2.D("bottomComponents");
                f fVarC5 = iVarD7 != null ? C34328m0.c(iVarD7) : null;
                if (fVarC5 == null) {
                    arrayList9 = null;
                } else {
                    int size5 = fVarC5.f362000b.size();
                    ArrayList arrayList22 = new ArrayList(size5);
                    int iC6 = 0;
                    while (iC6 < size5) {
                        i iVarW5 = fVarC5.w(iC6);
                        iC6 = b.c(context, iVarW5 != null ? iVarW5.i() : null, cls5, arrayList22, iC6, 1);
                    }
                    arrayList9 = arrayList22;
                }
                i iVarD8 = kVarI2.D("onOpenActions");
                f fVarC6 = iVarD8 != null ? C34328m0.c(iVarD8) : null;
                if (fVarC6 == null) {
                    arrayList10 = null;
                } else {
                    int size6 = fVarC6.f362000b.size();
                    ArrayList arrayList23 = new ArrayList(size6);
                    int iC7 = 0;
                    while (iC7 < size6) {
                        i iVarW6 = fVarC6.w(iC7);
                        iC7 = b.c(context, iVarW6 != null ? iVarW6.i() : null, BeduinAction.class, arrayList23, iC7, 1);
                    }
                    arrayList10 = arrayList23;
                }
                return new UniversalDeliveryTypeContent.Tab.Courier(str2, str9, arrayList7, arrayList8, zBooleanValue2, str12, arrayList21, str13, arrayList9, arrayList10);
            }
        } else if (str3.equals("pvzOnUniversalMap")) {
            String str14 = (String) context.b(kVarI.D("title"), String.class);
            f fVarC7 = iVarD != null ? C34328m0.c(iVarD) : null;
            if (fVarC7 == null) {
                arrayList = null;
            } else {
                int size7 = fVarC7.f362000b.size();
                ArrayList arrayList24 = new ArrayList(size7);
                int iC8 = 0;
                while (iC8 < size7) {
                    i iVarW7 = fVarC7.w(iC8);
                    iC8 = b.c(context, iVarW7 != null ? iVarW7.i() : null, BeduinAction.class, arrayList24, iC8, 1);
                    size7 = size7;
                    arrayList24 = arrayList24;
                }
                arrayList = arrayList24;
            }
            f fVarC8 = iVarD2 != null ? C34328m0.c(iVarD2) : null;
            if (fVarC8 == null) {
                arrayList2 = null;
            } else {
                int size8 = fVarC8.f362000b.size();
                ArrayList arrayList25 = new ArrayList(size8);
                int iC9 = 0;
                while (iC9 < size8) {
                    i iVarW8 = fVarC8.w(iC9);
                    iC9 = b.c(context, iVarW8 != null ? iVarW8.i() : null, BeduinAction.class, arrayList25, iC9, 1);
                    arrayList25 = arrayList25;
                }
                arrayList2 = arrayList25;
            }
            i iVarD9 = kVarI.D("isEnabled");
            Boolean bool3 = (Boolean) (iVarD9 == null ? null : context.b(iVarD9, Boolean.class));
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap.MapParams mapParams = (UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap.MapParams) context.b(kVarI2.D("params"), UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap.MapParams.class);
            i iVarD10 = kVarI2.D("onInitActions");
            f fVarC9 = iVarD10 != null ? C34328m0.c(iVarD10) : null;
            if (fVarC9 != null) {
                int size9 = fVarC9.f362000b.size();
                ArrayList arrayList26 = new ArrayList(size9);
                int iC10 = 0;
                while (iC10 < size9) {
                    i iVarW9 = fVarC9.w(iC10);
                    iC10 = b.c(context, iVarW9 != null ? iVarW9.i() : null, BeduinAction.class, arrayList26, iC10, 1);
                }
                arrayList11 = arrayList26;
            }
            return new UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap(str3, str14, arrayList, arrayList2, zBooleanValue3, mapParams, arrayList11);
        }
        i iVarD11 = kVarI.D("title");
        String str15 = (String) (iVarD11 == null ? null : context.b(iVarD11, String.class));
        if (str15 == null) {
            str15 = "";
        }
        String str16 = str15;
        f fVarC10 = iVarD != null ? C34328m0.c(iVarD) : null;
        if (fVarC10 == null) {
            arrayList3 = null;
        } else {
            int size10 = fVarC10.f362000b.size();
            arrayList3 = new ArrayList(size10);
            int iC11 = 0;
            while (iC11 < size10) {
                i iVarW10 = fVarC10.w(iC11);
                iC11 = b.c(context, iVarW10 != null ? iVarW10.i() : null, BeduinAction.class, arrayList3, iC11, 1);
            }
        }
        f fVarC11 = iVarD2 != null ? C34328m0.c(iVarD2) : null;
        if (fVarC11 == null) {
            arrayList4 = null;
        } else {
            int size11 = fVarC11.f362000b.size();
            ArrayList arrayList27 = new ArrayList(size11);
            int iC12 = 0;
            while (iC12 < size11) {
                i iVarW11 = fVarC11.w(iC12);
                iC12 = b.c(context, iVarW11 != null ? iVarW11.i() : null, BeduinAction.class, arrayList27, iC12, 1);
            }
            arrayList4 = arrayList27;
        }
        return new UniversalDeliveryTypeContent.Tab.Unknown(str3, str16, arrayList3, arrayList4, false);
    }
}
