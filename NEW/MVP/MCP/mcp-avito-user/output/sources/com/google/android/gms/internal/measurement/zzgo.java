package com.google.android.gms.internal.measurement;

import I41.h;
import android.content.Context;
import android.database.ContentObserver;
import j.B;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzgo implements zzgj {

    /* renamed from: c, reason: collision with root package name */
    @B
    public static zzgo f350802c;

    /* renamed from: a, reason: collision with root package name */
    @h
    public final Context f350803a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final ContentObserver f350804b;

    public zzgo() {
        this.f350803a = null;
        this.f350804b = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzgj
    @h
    public final Object zza(final String str) {
        Context context = this.f350803a;
        if (context == null || zzge.zza(context)) {
            return null;
        }
        try {
            return (String) zzgm.zza(new zzgl() { // from class: com.google.android.gms.internal.measurement.zzgn
                @Override // com.google.android.gms.internal.measurement.zzgl
                public final Object zza() {
                    return zzfr.zza(this.f350800a.f350803a.getContentResolver(), str, null);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public zzgo(Context context) {
        this.f350803a = context;
        zzgq zzgqVar = new zzgq(null);
        this.f350804b = zzgqVar;
        context.getContentResolver().registerContentObserver(zzfu.zza, true, zzgqVar);
    }
}
