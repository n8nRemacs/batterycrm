package com.avito.android.calltracking.remote.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerPhoneCallLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/a;", "LKu/a;", "Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC14350a<MessengerReallContactMethodLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        CallInitiator callInitiator;
        String strN = i.n(uri, "callInitiator");
        long jM2 = i.m(uri, "opponentPhoneID");
        CallInitiator.f113761c.getClass();
        CallInitiator[] callInitiatorArrValues = CallInitiator.values();
        int length = callInitiatorArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                callInitiator = null;
                break;
            }
            callInitiator = callInitiatorArrValues[i12];
            if (L.f(callInitiator.f113764b, strN)) {
                break;
            }
            i12++;
        }
        if (callInitiator == null) {
            callInitiator = CallInitiator.UNKNOWN;
        }
        return new MessengerReallContactMethodLink(jM2, callInitiator);
    }
}
