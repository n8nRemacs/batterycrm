package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzfx extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzfv f350783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfx(zzfv zzfvVar) {
        super(null);
        this.f350783a = zzfvVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12) {
        this.f350783a.f350773a.set(true);
    }
}
