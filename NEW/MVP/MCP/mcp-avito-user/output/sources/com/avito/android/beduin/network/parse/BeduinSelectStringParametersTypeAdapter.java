package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.selectStringParameters.BeduinSelectStringParametersModel;
import com.avito.android.beduin.common.component.selectStringParameters.SelectItem;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin.network.model.SelectValue;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectStringParametersAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinSelectStringParametersTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSelectStringParametersTypeAdapter extends TypeAdapter<BeduinSelectStringParametersModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104045a;

    public BeduinSelectStringParametersTypeAdapter(@k Gson gson) {
        this.f104045a = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BeduinSelectStringParametersModel read(com.google.gson.stream.a aVar) throws IOException {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        String strB;
        boolean z12;
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
        String string = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        String str3 = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        Boolean boolValueOf = null;
        ArrayList arrayList = null;
        Integer numValueOf = null;
        String strB5 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        Boolean boolValueOf2 = null;
        while (aVar.k()) {
            if (!L.f(aVar.x(), "content")) {
                str = str3;
                aVar.L();
            } else {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                while (aVar.k()) {
                    String strX = aVar.x();
                    if (strX != null) {
                        int iHashCode = strX.hashCode();
                        str2 = string;
                        JsonToken jsonToken3 = JsonToken.f362196b;
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        strB = str3;
                        Gson gson = this.f104045a;
                        switch (iHashCode) {
                            case -1808143504:
                                if (strX.equals("onClearedActions")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        ArrayList arrayList4 = new ArrayList();
                                        if (aVar.F() != jsonToken3) {
                                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            BeduinAction beduinAction = (BeduinAction) gson.g(BeduinAction.class).read(aVar);
                                            if (beduinAction != null) {
                                                arrayList4.add(beduinAction);
                                            }
                                        }
                                        aVar.f();
                                        arrayList = arrayList4;
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case -1606703562:
                                if (strX.equals("constraints")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        ArrayList arrayList5 = new ArrayList();
                                        if (aVar.F() != jsonToken3) {
                                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            Constraint constraint = (Constraint) gson.g(Constraint.class).read(aVar);
                                            if (constraint != null) {
                                                arrayList5.add(constraint);
                                            }
                                        }
                                        aVar.f();
                                        arrayList2 = arrayList5;
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case -1569438897:
                                if (strX.equals("rightItem")) {
                                    obj8 = gson.g(SelectItem.class).read(aVar);
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case -1361906249:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)) {
                                    obj4 = gson.g(DisplayingPredicate.class).read(aVar);
                                    string = str2;
                                    obj5 = obj2;
                                    obj6 = obj3;
                                    str3 = strB;
                                }
                                break;
                            case -1271236376:
                                if (strX.equals("maximumLinesNumber")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        numValueOf = Integer.valueOf(aVar.q());
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case -1161803523:
                                if (strX.equals("actions")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        ArrayList arrayList6 = new ArrayList();
                                        if (aVar.F() != jsonToken3) {
                                            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                        }
                                        aVar.a();
                                        while (aVar.k()) {
                                            BeduinAction beduinAction2 = (BeduinAction) gson.g(BeduinAction.class).read(aVar);
                                            if (beduinAction2 != null) {
                                                arrayList6.add(beduinAction2);
                                            }
                                        }
                                        aVar.f();
                                        arrayList3 = arrayList6;
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 3355:
                                if (strX.equals("id")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        string = aVar.B();
                                    }
                                    obj4 = obj;
                                    obj5 = obj2;
                                    obj6 = obj3;
                                    str3 = strB;
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 3556653:
                                if (strX.equals("text")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        strB2 = aVar.B();
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 100931746:
                                if (strX.equals("showClearButton")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        boolValueOf = Boolean.valueOf(aVar.o());
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 109780401:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        strB = aVar.B();
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 110327241:
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)) {
                                    obj5 = gson.g(BeduinComponentTheme.class).read(aVar);
                                    string = str2;
                                    obj4 = obj;
                                    obj6 = obj3;
                                    str3 = strB;
                                }
                                break;
                            case 206580181:
                                if (strX.equals("selectValue")) {
                                    obj6 = gson.g(SelectValue.class).read(aVar);
                                    string = str2;
                                    obj4 = obj;
                                    obj5 = obj2;
                                    str3 = strB;
                                }
                                break;
                            case 598246771:
                                if (strX.equals(ChannelContext.Item.PLACEHOLDER)) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        strB4 = aVar.B();
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 1203236063:
                                if (strX.equals("errorMessage")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        strB5 = aVar.B();
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 1557721666:
                                if (strX.equals("details")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        strB3 = aVar.B();
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 1718105018:
                                if (strX.equals("leftItem")) {
                                    obj7 = gson.g(SelectItem.class).read(aVar);
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                            case 2105594551:
                                if (strX.equals("isEnabled")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        boolValueOf2 = Boolean.valueOf(aVar.o());
                                    }
                                }
                                string = str2;
                                obj4 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                str3 = strB;
                                break;
                        }
                    } else {
                        str2 = string;
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        strB = str3;
                    }
                    aVar.L();
                    string = str2;
                    obj4 = obj;
                    obj5 = obj2;
                    obj6 = obj3;
                    str3 = strB;
                }
                str = str3;
                aVar.g();
            }
            str3 = str;
        }
        String str4 = str3;
        aVar.g();
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        return new BeduinSelectStringParametersModel(string, string == null ? UUID.randomUUID().toString() : string, (DisplayingPredicate) obj4, (BeduinComponentTheme) obj5, str4, (SelectValue) obj6, strB2, strB3, strB4, (SelectItem) obj7, (SelectItem) obj8, boolValueOf, arrayList, numValueOf, strB5, arrayList2, arrayList3, boolValueOf2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, BeduinSelectStringParametersModel beduinSelectStringParametersModel) {
        throw new UnsupportedOperationException();
    }
}
