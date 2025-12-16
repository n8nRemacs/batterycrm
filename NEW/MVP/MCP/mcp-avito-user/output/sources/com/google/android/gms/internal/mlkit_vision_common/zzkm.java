package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzkm extends zzkq {

    /* renamed from: a, reason: collision with root package name */
    public String f352885a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f352886b;

    /* renamed from: c, reason: collision with root package name */
    public int f352887c;

    /* renamed from: d, reason: collision with root package name */
    public byte f352888d;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkq
    public final zzkq zza(boolean z12) {
        this.f352886b = true;
        this.f352888d = (byte) (1 | this.f352888d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkq
    public final zzkq zzb(int i12) {
        this.f352887c = 1;
        this.f352888d = (byte) (this.f352888d | 2);
        return this;
    }

    public final zzkq zzc(String str) {
        this.f352885a = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkq
    public final zzkr zzd() {
        String str;
        if (this.f352888d == 3 && (str = this.f352885a) != null) {
            return new zzko(str, this.f352886b, this.f352887c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f352885a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f352888d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f352888d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
