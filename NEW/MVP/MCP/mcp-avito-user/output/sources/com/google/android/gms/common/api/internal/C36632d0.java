package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36632d0 implements com.google.android.gms.common.internal.T {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36653k0 f349110b;

    public C36632d0(C36653k0 c36653k0) {
        this.f349110b = c36653k0;
    }

    @Override // com.google.android.gms.common.internal.T
    public final boolean isConnected() {
        H0 h02 = this.f349110b.f349149d;
        return h02 != null && h02.h();
    }
}
