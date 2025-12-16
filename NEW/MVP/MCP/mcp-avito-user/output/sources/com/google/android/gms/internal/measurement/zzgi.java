package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzgi extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzgg f350798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgi(zzgg zzggVar) {
        super(null);
        this.f350798a = zzggVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12) {
        this.f350798a.zzd();
    }
}
