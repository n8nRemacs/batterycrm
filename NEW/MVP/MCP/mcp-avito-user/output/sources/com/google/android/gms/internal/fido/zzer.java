package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzer implements zzek {

    /* renamed from: a, reason: collision with root package name */
    public final String f350347a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdo f350348b;

    /* renamed from: c, reason: collision with root package name */
    public final Level f350349c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f350350d;

    /* renamed from: e, reason: collision with root package name */
    public final zzea f350351e;

    public zzer(zzdo zzdoVar, Level level, Set set, zzea zzeaVar) {
        this.f350347a = "";
        this.f350348b = zzdoVar;
        this.f350349c = level;
        this.f350350d = set;
        this.f350351e = zzeaVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzeu(this.f350347a, str, true, this.f350348b, this.f350349c, this.f350350d, this.f350351e, null);
    }

    public final zzer zzb(boolean z12) {
        return new zzer(this.f350348b, Level.OFF, this.f350350d, this.f350351e);
    }

    public zzer() {
        this(zzdo.zzb, Level.ALL, zzeu.f350353d, zzeu.f350354e);
    }
}
