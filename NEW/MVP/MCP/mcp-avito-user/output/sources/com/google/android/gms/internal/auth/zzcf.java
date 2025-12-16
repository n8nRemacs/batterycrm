package com.google.android.gms.internal.auth;

import android.database.ContentObserver;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzcf extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcg f350039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcgVar) {
        super(null);
        this.f350039a = zzcgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12) {
        this.f350039a.zze();
    }
}
