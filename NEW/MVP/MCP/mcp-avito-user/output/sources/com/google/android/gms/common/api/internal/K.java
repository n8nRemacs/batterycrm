package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public class K extends com.google.android.gms.common.api.i {

    /* renamed from: b, reason: collision with root package name */
    public final String f349022b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    @Override // com.google.android.gms.common.api.i
    public final void d() {
        throw new UnsupportedOperationException(this.f349022b);
    }

    @Override // com.google.android.gms.common.api.i
    public final void e() {
        throw new UnsupportedOperationException(this.f349022b);
    }
}
