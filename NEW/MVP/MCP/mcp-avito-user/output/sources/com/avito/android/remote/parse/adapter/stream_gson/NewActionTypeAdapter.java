package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/NewActionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/Action;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NewActionTypeAdapter extends TypeAdapter<Action> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254294a;

    public NewActionTypeAdapter(@k Gson gson) {
        this.f254294a = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Action read(com.google.gson.stream.a aVar) throws IOException {
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
        Object obj = null;
        Object obj2 = null;
        String str = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                Gson gson = this.f254294a;
                switch (iHashCode) {
                    case 116076:
                        if (!strX.equals(TooltipAttribute.PARAM_DEEP_LINK)) {
                            break;
                        } else {
                            obj = gson.g(DeepLink.class).read(aVar);
                            break;
                        }
                    case 3575610:
                        if (!strX.equals("type")) {
                            break;
                        } else {
                            String strB2 = aVar.B();
                            if (strB2 != null) {
                                if (strB2.length() != 0 && strB2.charAt(0) != '/') {
                                    strB2 = "/".concat(strB2);
                                }
                                str = strB2;
                                break;
                            } else {
                                str = null;
                                break;
                            }
                        }
                    case 110371416:
                        if (!strX.equals("title")) {
                            break;
                        } else {
                            strB = aVar.B();
                            break;
                        }
                    case 2099153973:
                        if (!strX.equals("confirmation")) {
                            break;
                        } else {
                            obj2 = gson.g(Action.Confirmation.class).read(aVar);
                            break;
                        }
                }
            }
            aVar.L();
        }
        aVar.g();
        DeepLink deepLink = (DeepLink) obj;
        return new Action(strB == null ? null : strB, deepLink == null ? new NoMatchLink() : deepLink, (Action.Confirmation) obj2, str, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, Action action) {
        throw new UnsupportedOperationException();
    }
}
