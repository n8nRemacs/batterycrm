package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxTapArea;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxVerticalPosition;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
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

/* compiled from: BeduinCheckboxGroupAggregatorAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCheckboxGroupAggregatorTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCheckboxGroupAggregatorTypeAdapter extends TypeAdapter<CheckboxGroupAggregatorModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104038a;

    public BeduinCheckboxGroupAggregatorTypeAdapter(@k Gson gson) {
        this.f104038a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CheckboxGroupAggregatorModel read(com.google.gson.stream.a aVar) throws IOException {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
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
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (aVar.k()) {
            Object obj14 = obj13;
            Object obj15 = obj12;
            if (!L.f(aVar.x(), "content")) {
                aVar.L();
                obj12 = obj15;
            } else {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                Object obj16 = obj14;
                obj12 = obj15;
                while (aVar.k()) {
                    String str = string;
                    String strX = aVar.x();
                    if (strX != null) {
                        int iHashCode = strX.hashCode();
                        obj = obj6;
                        JsonToken jsonToken3 = JsonToken.f362196b;
                        obj2 = obj7;
                        obj3 = obj8;
                        obj5 = obj16;
                        Gson gson = this.f104038a;
                        switch (iHashCode) {
                            case -2121079748:
                                obj4 = obj9;
                                if (strX.equals("onCheckboxTapActions")) {
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
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case -1927529938:
                                obj4 = obj9;
                                if (strX.equals("onUncheckedActions")) {
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
                                            BeduinAction beduinAction2 = (BeduinAction) gson.g(BeduinAction.class).read(aVar);
                                            if (beduinAction2 != null) {
                                                arrayList5.add(beduinAction2);
                                            }
                                        }
                                        aVar.f();
                                        arrayList3 = arrayList5;
                                    }
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case -1361906249:
                                obj4 = obj9;
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)) {
                                    obj6 = gson.g(DisplayingPredicate.class).read(aVar);
                                    string = str;
                                    obj9 = obj4;
                                    obj7 = obj2;
                                    obj8 = obj3;
                                    obj16 = obj5;
                                }
                                break;
                            case -1229729094:
                                obj4 = obj9;
                                if (strX.equals("selectedBackgroundColor")) {
                                    obj12 = gson.g(UniversalColor.class).read(aVar);
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case -1221270899:
                                obj4 = obj9;
                                if (strX.equals("header")) {
                                    obj7 = gson.g(CheckboxGroupAggregatorModel.Header.class).read(aVar);
                                    string = str;
                                    obj9 = obj4;
                                    obj6 = obj;
                                    obj8 = obj3;
                                    obj16 = obj5;
                                }
                                break;
                            case -806339567:
                                obj4 = obj9;
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)) {
                                    obj11 = gson.g(BeduinContainerIndent.class).read(aVar);
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case 3355:
                                obj4 = obj9;
                                if (strX.equals("id")) {
                                    z12 = aVar.F() == jsonToken;
                                    if (z12) {
                                        aVar.L();
                                    }
                                    if (!z12) {
                                        string = aVar.B();
                                    }
                                    obj9 = obj4;
                                    obj6 = obj;
                                    obj7 = obj2;
                                    obj8 = obj3;
                                    obj16 = obj5;
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case 3029410:
                                obj4 = obj9;
                                if (strX.equals("body")) {
                                    obj8 = gson.g(CheckboxGroupAggregatorModel.Body.class).read(aVar);
                                    string = str;
                                    obj9 = obj4;
                                    obj6 = obj;
                                    obj7 = obj2;
                                    obj16 = obj5;
                                }
                                break;
                            case 110327241:
                                obj4 = obj9;
                                if (strX.equals(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)) {
                                    obj9 = gson.g(BeduinComponentTheme.class).read(aVar);
                                    string = str;
                                    obj6 = obj;
                                    obj7 = obj2;
                                    obj8 = obj3;
                                    obj16 = obj5;
                                }
                                break;
                            case 227215522:
                                obj4 = obj9;
                                if (strX.equals("checkboxVerticalPosition")) {
                                    obj5 = gson.g(CheckboxVerticalPosition.class).read(aVar);
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case 1442127637:
                                obj4 = obj9;
                                if (strX.equals("onCheckedActions")) {
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
                                            BeduinAction beduinAction3 = (BeduinAction) gson.g(BeduinAction.class).read(aVar);
                                            if (beduinAction3 != null) {
                                                arrayList6.add(beduinAction3);
                                            }
                                        }
                                        aVar.f();
                                        arrayList2 = arrayList6;
                                    }
                                }
                                string = str;
                                obj9 = obj4;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                obj16 = obj5;
                                break;
                            case 1470154125:
                                if (strX.equals("checkboxTapArea")) {
                                    obj10 = gson.g(CheckboxTapArea.class).read(aVar);
                                    string = str;
                                    obj6 = obj;
                                    obj7 = obj2;
                                    obj8 = obj3;
                                    obj16 = obj5;
                                }
                            default:
                                obj4 = obj9;
                                break;
                        }
                    } else {
                        obj = obj6;
                        obj2 = obj7;
                        obj3 = obj8;
                        obj4 = obj9;
                        obj5 = obj16;
                    }
                    aVar.L();
                    string = str;
                    obj9 = obj4;
                    obj6 = obj;
                    obj7 = obj2;
                    obj8 = obj3;
                    obj16 = obj5;
                }
                aVar.g();
                obj14 = obj16;
            }
            obj13 = obj14;
        }
        Object obj17 = obj12;
        Object obj18 = obj13;
        aVar.g();
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        String str2 = string;
        DisplayingPredicate displayingPredicate = (DisplayingPredicate) obj6;
        CheckboxGroupAggregatorModel.Header header = (CheckboxGroupAggregatorModel.Header) obj7;
        if (header == null) {
            throw new NullPointerException("header can't be null");
        }
        CheckboxGroupAggregatorModel.Body body = (CheckboxGroupAggregatorModel.Body) obj8;
        if (body != null) {
            return new CheckboxGroupAggregatorModel(str2, displayingPredicate, header, body, (BeduinComponentTheme) obj9, (CheckboxTapArea) obj10, arrayList, arrayList2, arrayList3, (BeduinContainerIndent) obj11, (UniversalColor) obj17, (CheckboxVerticalPosition) obj18);
        }
        throw new NullPointerException("body can't be null");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, CheckboxGroupAggregatorModel checkboxGroupAggregatorModel) {
        throw new UnsupportedOperationException();
    }
}
