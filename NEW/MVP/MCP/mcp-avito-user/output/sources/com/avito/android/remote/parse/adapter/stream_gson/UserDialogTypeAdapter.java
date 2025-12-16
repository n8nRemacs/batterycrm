package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserDialogTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/UserDialogTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserDialogTypeAdapter extends TypeAdapter<UserDialog> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254307a;

    public UserDialogTypeAdapter(@k Gson gson) {
        this.f254307a = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UserDialog read(com.google.gson.stream.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
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
        Boolean boolValueOf = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                switch (strX.hashCode()) {
                    case -1161803523:
                        if (!strX.equals("actions")) {
                            break;
                        } else {
                            JsonToken jsonTokenF2 = aVar.F();
                            JsonToken jsonToken2 = JsonToken.f362196b;
                            if (jsonTokenF2 != jsonToken2) {
                                throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                            }
                            aVar.a();
                            while (aVar.k()) {
                                arrayList.add(this.f254307a.g(Action.class).read(aVar));
                            }
                            aVar.f();
                        }
                    case 110371416:
                        if (!strX.equals("title")) {
                            break;
                        } else {
                            strB = aVar.B();
                        }
                    case 954925063:
                        if (!strX.equals("message")) {
                            break;
                        } else {
                            strB2 = aVar.B();
                        }
                    case 1889007316:
                        if (!strX.equals("cancelable")) {
                            break;
                        } else {
                            boolValueOf = Boolean.valueOf(aVar.o());
                        }
                }
            }
            aVar.L();
        }
        aVar.g();
        if (strB == null) {
            strB = "";
        }
        return new UserDialog(strB, strB2 != null ? strB2 : "", arrayList, boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, UserDialog userDialog) {
        throw new UnsupportedOperationException();
    }
}
