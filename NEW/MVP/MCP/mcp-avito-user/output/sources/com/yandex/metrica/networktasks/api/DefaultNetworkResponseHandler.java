package com.yandex.metrica.networktasks.api;

import com.adjust.sdk.Constants;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultResponseParser f382398a = new DefaultResponseParser();

    @Override // com.yandex.metrica.networktasks.api.NetworkResponseHandler
    public final Object handle(ResponseDataHolder responseDataHolder) {
        if (200 != responseDataHolder.f382435a) {
            return null;
        }
        byte[] bArr = responseDataHolder.f382436b;
        this.f382398a.getClass();
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new DefaultResponseParser.Response(new JSONObject(new String(bArr, Constants.ENCODING)).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
