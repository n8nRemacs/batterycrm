package com.google.android.gms.fido.u2f.api.messagebased;

import j.N;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes6.dex */
public enum RequestType {
    /* JADX INFO: Fake field, exist only in values array */
    REGISTER("u2f_register_request"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGN("u2f_sign_request");


    /* renamed from: b, reason: collision with root package name */
    public final String f349942b;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedRequestTypeException extends Exception {
    }

    RequestType(String str) {
        this.f349942b = str;
    }

    @Override // java.lang.Enum
    @N
    public final String toString() {
        return this.f349942b;
    }
}
