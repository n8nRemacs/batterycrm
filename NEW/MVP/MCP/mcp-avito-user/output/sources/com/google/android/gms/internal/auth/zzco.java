package com.google.android.gms.internal.auth;

import I41.h;
import android.content.Context;
import android.database.ContentObserver;
import j.B;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzco implements zzcl {

    /* renamed from: c, reason: collision with root package name */
    @B
    public static zzco f350049c;

    /* renamed from: a, reason: collision with root package name */
    @h
    public final Context f350050a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final ContentObserver f350051b;

    public zzco() {
        this.f350050a = null;
        this.f350051b = null;
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    @h
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f350050a;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    @Override // com.google.android.gms.internal.auth.zzck
                    public final Object zza() {
                        zzco zzcoVar = this.zza;
                        return zzcb.zza(zzcoVar.f350050a.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public zzco(Context context) {
        this.f350050a = context;
        zzcn zzcnVar = new zzcn(null);
        this.f350051b = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
    }
}
