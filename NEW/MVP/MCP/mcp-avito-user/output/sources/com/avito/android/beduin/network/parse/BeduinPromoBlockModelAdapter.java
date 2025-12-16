package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.container.promo_block.RoundEdges;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: BeduinPromoBlockModelAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinPromoBlockModelAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/container/promo_block/BeduinPromoBlockModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinPromoBlockModelAdapter extends TypeAdapter<BeduinPromoBlockModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104044a;

    public BeduinPromoBlockModelAdapter(@k Gson gson) {
        this.f104044a = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BeduinPromoBlockModel read(com.google.gson.stream.a aVar) throws IOException {
        String string;
        List listC;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
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
        String string2 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        List list = null;
        Object obj8 = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        ArrayList arrayList = null;
        boolean zO2 = false;
        while (aVar.k()) {
            Object obj9 = obj8;
            if (L.f(aVar.x(), "content")) {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                Object obj10 = obj9;
                while (aVar.k()) {
                    String strX = aVar.x();
                    if (strX != null) {
                        int iHashCode = strX.hashCode();
                        str = string2;
                        JsonToken jsonToken3 = JsonToken.f362196b;
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj10;
                        Gson gson = this.f104044a;
                        switch (iHashCode) {
                            case -1361906249:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)) {
                                    obj4 = gson.g(DisplayingPredicate.class).read(aVar);
                                    string2 = str;
                                    obj5 = obj2;
                                    obj10 = obj3;
                                }
                                break;
                            case -1332194002:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)) {
                                    obj5 = gson.g(BeduinContainerBackground.class).read(aVar);
                                    string2 = str;
                                    obj4 = obj;
                                    obj10 = obj3;
                                }
                                break;
                            case -1081309778:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)) {
                                    obj7 = gson.g(BeduinContainerIndent.class).read(aVar);
                                    break;
                                }
                                break;
                            case -806339567:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)) {
                                    obj6 = gson.g(BeduinContainerIndent.class).read(aVar);
                                    break;
                                }
                                break;
                            case -539596956:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS)) {
                                    boolean z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        ArrayList arrayList2 = new ArrayList();
                                        if (aVar.F() != jsonToken3) {
                                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            BeduinAction beduinAction = (BeduinAction) gson.g(BeduinAction.class).read(aVar);
                                            if (beduinAction != null) {
                                                arrayList2.add(beduinAction);
                                            }
                                        }
                                        aVar.f();
                                        arrayList = arrayList2;
                                        break;
                                    }
                                }
                                break;
                            case -482101422:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_CLOSEABLE)) {
                                    zO2 = aVar.o();
                                    break;
                                }
                                break;
                            case -170430104:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_ROUND_EDGES)) {
                                    obj3 = gson.g(RoundEdges.class).read(aVar);
                                    break;
                                }
                                break;
                            case 3355:
                                if (strX.equals("id")) {
                                    string2 = aVar.B();
                                }
                                obj4 = obj;
                                obj5 = obj2;
                                obj10 = obj3;
                                break;
                            case 109780401:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)) {
                                    strB = aVar.B();
                                    break;
                                }
                                break;
                            case 110327241:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)) {
                                    strB2 = aVar.B();
                                    break;
                                }
                                break;
                            case 110371416:
                                if (strX.equals("title")) {
                                    strB3 = aVar.B();
                                    break;
                                }
                                break;
                            case 1659526655:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)) {
                                    boolean z13 = aVar.F() == jsonToken;
                                    if (z13) {
                                        aVar.L();
                                    }
                                    if (!z13) {
                                        ArrayList arrayList3 = new ArrayList();
                                        if (aVar.F() != jsonToken3) {
                                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            BeduinModel beduinModel = (BeduinModel) gson.g(BeduinModel.class).read(aVar);
                                            if (beduinModel != null) {
                                                arrayList3.add(beduinModel);
                                            }
                                        }
                                        aVar.f();
                                        list = arrayList3;
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        str = string2;
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj10;
                    }
                    string2 = str;
                    obj4 = obj;
                    obj5 = obj2;
                    obj10 = obj3;
                }
                aVar.g();
                obj9 = obj10;
            }
            obj8 = obj9;
        }
        Object obj11 = obj8;
        aVar.g();
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
        }
        DisplayingPredicate displayingPredicate = (DisplayingPredicate) obj4;
        BeduinContainerBackground beduinContainerBackground = (BeduinContainerBackground) obj5;
        BeduinContainerIndent beduinContainerIndent = (BeduinContainerIndent) obj6;
        BeduinContainerIndent beduinContainerIndent2 = (BeduinContainerIndent) obj7;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        if (strB == null) {
            listC = list;
        } else {
            if (strB.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = strB.charAt(0);
                sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.f(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
                sb2.append(strB.substring(1));
                string = sb2.toString();
            } else {
                string = strB;
            }
            listC = C28809e.c(new c(string, strB), list);
        }
        return new BeduinPromoBlockModel(string2, displayingPredicate, beduinContainerBackground, beduinContainerIndent, beduinContainerIndent2, listC, strB2, strB, strB3, zO2, (RoundEdges) obj11, arrayList);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, BeduinPromoBlockModel beduinPromoBlockModel) {
        throw new UnsupportedOperationException();
    }
}
