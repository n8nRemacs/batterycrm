package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdw extends zzdy {

    /* renamed from: b, reason: collision with root package name */
    public int f350082b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f350083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzef f350084d;

    public zzdw(zzef zzefVar) {
        this.f350084d = zzefVar;
        this.f350083c = zzefVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350082b < this.f350083c;
    }

    @Override // com.google.android.gms.internal.auth.zzea
    public final byte zza() {
        int i12 = this.f350082b;
        if (i12 >= this.f350083c) {
            throw new NoSuchElementException();
        }
        this.f350082b = i12 + 1;
        return this.f350084d.a(i12);
    }
}
