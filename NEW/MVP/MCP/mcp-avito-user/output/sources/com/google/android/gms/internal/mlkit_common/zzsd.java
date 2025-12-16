package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzsd extends zzsl {

    /* renamed from: a, reason: collision with root package name */
    public String f351703a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351704b;

    /* renamed from: c, reason: collision with root package name */
    public int f351705c;

    /* renamed from: d, reason: collision with root package name */
    public byte f351706d;

    @Override // com.google.android.gms.internal.mlkit_common.zzsl
    public final zzsl zza(boolean z12) {
        this.f351704b = true;
        this.f351706d = (byte) (1 | this.f351706d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsl
    public final zzsl zzb(int i12) {
        this.f351705c = 1;
        this.f351706d = (byte) (this.f351706d | 2);
        return this;
    }

    public final zzsl zzc(String str) {
        this.f351703a = "common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsl
    public final zzsm zzd() {
        String str;
        if (this.f351706d == 3 && (str = this.f351703a) != null) {
            return new zzsf(str, this.f351704b, this.f351705c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f351703a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f351706d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f351706d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
