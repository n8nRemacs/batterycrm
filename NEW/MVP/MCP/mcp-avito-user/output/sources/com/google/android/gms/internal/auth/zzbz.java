package com.google.android.gms.internal.auth;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import j.P;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @P
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
