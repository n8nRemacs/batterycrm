package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertItemActions;
import com.avito.android.remote.model.HideAction;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertItemActionsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertItemActionsTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/AdvertItemActions;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertItemActionsTypeAdapter extends TypeAdapter<AdvertItemActions> {
    @Override // com.google.gson.TypeAdapter
    public final AdvertItemActions read(com.google.gson.stream.a aVar) throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2;
        JsonToken jsonToken3;
        ArrayList arrayList = new ArrayList();
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken4 = JsonToken.f362204j;
        if (jsonTokenF == jsonToken4) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken5 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken5) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken5, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (kotlin.jvm.internal.L.f(strX, "actions")) {
                JsonToken jsonTokenF3 = aVar.F();
                JsonToken jsonToken6 = JsonToken.f362196b;
                if (jsonTokenF3 != jsonToken6) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken6, " but was "), " at ", aVar));
                }
                aVar.a();
                while (aVar.k()) {
                    if (aVar.F() == jsonToken4) {
                        throw new JsonParseException("");
                    }
                    if (aVar.F() != jsonToken5) {
                        throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken5, " but was "), " at ", aVar));
                    }
                    aVar.b();
                    HideAction hideAction = null;
                    while (aVar.k()) {
                        if (!kotlin.jvm.internal.L.f(aVar.x(), ConstraintKt.CONDITION_FLOW_HIDE)) {
                            jsonToken2 = jsonToken4;
                            aVar.L();
                        } else {
                            if (aVar.F() == jsonToken4) {
                                throw new JsonParseException("");
                            }
                            if (aVar.F() != jsonToken5) {
                                throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken5, " but was "), " at ", aVar));
                            }
                            aVar.b();
                            boolean zO2 = true;
                            String strB2 = null;
                            String strB3 = null;
                            while (aVar.k()) {
                                String strX2 = aVar.x();
                                if (strX2 != null) {
                                    int iHashCode = strX2.hashCode();
                                    jsonToken3 = jsonToken4;
                                    if (iHashCode != -283407311) {
                                        if (iHashCode != 102727412) {
                                            if (iHashCode == 110371416 && strX2.equals("title")) {
                                                strB3 = aVar.B();
                                            }
                                        } else if (strX2.equals("label")) {
                                            strB2 = aVar.B();
                                        }
                                    } else if (strX2.equals("use_icon")) {
                                        zO2 = aVar.o();
                                    }
                                    jsonToken4 = jsonToken3;
                                } else {
                                    jsonToken3 = jsonToken4;
                                }
                                aVar.L();
                                jsonToken4 = jsonToken3;
                            }
                            jsonToken2 = jsonToken4;
                            aVar.g();
                            if (strB2 != null && strB3 != null) {
                                hideAction = new HideAction(strB2, strB3, zO2);
                            }
                        }
                        jsonToken4 = jsonToken2;
                    }
                    JsonToken jsonToken7 = jsonToken4;
                    aVar.g();
                    if (hideAction != null) {
                        arrayList.add(hideAction);
                    }
                    jsonToken4 = jsonToken7;
                }
                jsonToken = jsonToken4;
                aVar.f();
            } else {
                jsonToken = jsonToken4;
                if (kotlin.jvm.internal.L.f(strX, "title")) {
                    strB = aVar.B();
                } else {
                    aVar.L();
                }
            }
            jsonToken4 = jsonToken;
        }
        aVar.g();
        return new AdvertItemActions(arrayList, strB);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, AdvertItemActions advertItemActions) {
        throw new UnsupportedOperationException();
    }
}
