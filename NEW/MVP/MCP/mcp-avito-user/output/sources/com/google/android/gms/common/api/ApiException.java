package com.google.android.gms.common.api;

import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public class ApiException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @N
    @Deprecated
    public final Status f348894b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(@N Status status) {
        int i12 = status.f348905b;
        String str = status.f348906c;
        super(i12 + ": " + (str == null ? "" : str));
        this.f348894b = status;
    }
}
