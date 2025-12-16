package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: b, reason: collision with root package name */
    public final Feature f348909b;

    @RX0.a
    public UnsupportedApiCallException(@N Feature feature) {
        this.f348909b = feature;
    }

    @Override // java.lang.Throwable
    @N
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f348909b));
    }
}
