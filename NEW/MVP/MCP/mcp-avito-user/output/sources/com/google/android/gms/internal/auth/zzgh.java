package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgh implements zzfu {

    /* renamed from: a, reason: collision with root package name */
    public final zzhs f350143a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f350144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350145c;

    public zzgh(zzhs zzhsVar, Object[] objArr) {
        this.f350143a = zzhsVar;
        this.f350144b = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f350145c = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 13;
        int i14 = 1;
        while (true) {
            int i15 = i14 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i14);
            if (cCharAt2 < 55296) {
                this.f350145c = i12 | (cCharAt2 << i13);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i14 = i15;
            }
        }
    }

    public final Object[] a() {
        return this.f350144b;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzfx zza() {
        return this.f350143a;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
        return (this.f350145c & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
        return (this.f350145c & 1) != 0 ? 1 : 2;
    }
}
