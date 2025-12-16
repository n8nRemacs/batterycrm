package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzlh implements zzkp {

    /* renamed from: a, reason: collision with root package name */
    public final zzkr f350953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350954b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f350955c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350956d;

    public zzlh(zzkr zzkrVar, String str, Object[] objArr) {
        this.f350953a = zzkrVar;
        this.f350954b = str;
        this.f350955c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f350956d = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 1;
        int i14 = 13;
        while (true) {
            int i15 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f350956d = i12 | (cCharAt2 << i14);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i13 = i15;
            }
        }
    }

    public final String a() {
        return this.f350954b;
    }

    public final Object[] b() {
        return this.f350955c;
    }

    @Override // com.google.android.gms.internal.measurement.zzkp
    public final zzkr zza() {
        return this.f350953a;
    }

    @Override // com.google.android.gms.internal.measurement.zzkp
    public final zzlg zzb() {
        int i12 = this.f350956d;
        return (i12 & 1) != 0 ? zzlg.zza : (i12 & 4) == 4 ? zzlg.zzc : zzlg.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzkp
    public final boolean zzc() {
        return (this.f350956d & 2) == 2;
    }
}
