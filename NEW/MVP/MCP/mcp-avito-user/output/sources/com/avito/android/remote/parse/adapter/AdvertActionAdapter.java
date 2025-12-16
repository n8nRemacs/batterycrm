package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertActionAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertActionAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/AdvertAction;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertActionAdapter extends TypeAdapter<AdvertAction> {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter<DeepLink> f254151a;

    public AdvertActionAdapter(@Y61.k Gson gson) {
        this.f254151a = gson.g(DeepLink.class);
    }

    @Override // com.google.gson.TypeAdapter
    public final AdvertAction read(com.google.gson.stream.a aVar) throws IOException {
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
        DeepLink deepLink = null;
        String strB = null;
        String strB2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (kotlin.jvm.internal.L.f(strX, "type")) {
                strB2 = aVar.B();
            } else if (kotlin.jvm.internal.L.f(strX, "value")) {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                while (aVar.k()) {
                    String strX2 = aVar.x();
                    if (kotlin.jvm.internal.L.f(strX2, "title")) {
                        strB = aVar.B();
                    } else if (kotlin.jvm.internal.L.f(strX2, TooltipAttribute.PARAM_DEEP_LINK)) {
                        deepLink = this.f254151a.read(aVar);
                    } else {
                        aVar.L();
                    }
                }
                aVar.g();
            }
        }
        aVar.g();
        DeepLink deepLink2 = deepLink;
        if (strB == null || strB2 == null) {
            return null;
        }
        switch (strB2.hashCode()) {
            case -1436108013:
                if (strB2.equals(NotificationsSettings.Section.SECTION_MESSENGER)) {
                    return new AdvertAction.Messenger(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case -1060903024:
                if (strB2.equals("callOrder")) {
                    return new AdvertAction.CallOrder(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case -737036666:
                if (strB2.equals("onlineBooking")) {
                    return new AdvertAction.Booking(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case -501016147:
                if (strB2.equals("realtyLayout")) {
                    return new AdvertAction.RealtyLayout(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case 106642798:
                if (strB2.equals("phone")) {
                    return new AdvertAction.Phone(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case 345225625:
                if (strB2.equals("serviceOrder")) {
                    return new AdvertAction.ServiceOrderRequest(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case 418656841:
                if (strB2.equals("findShift")) {
                    return new AdvertAction.FindShift(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case 831723177:
                if (strB2.equals("gigApply")) {
                    return new AdvertAction.GigApply(strB, deepLink2, null, null, 12, null);
                }
                return null;
            case 1498608842:
                if (strB2.equals("secondaryAction")) {
                    return new AdvertAction.SecondaryAction(strB, null, deepLink2, null, null, 24, null);
                }
                return null;
            case 1713707670:
                if (strB2.equals("videoVoipCallRequest")) {
                    return new AdvertAction.IacVideoCallRequest(strB, deepLink2, null, null, 12, null);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, AdvertAction advertAction) {
        throw new UnsupportedOperationException();
    }
}
