package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzno extends zzns {

    /* renamed from: a, reason: collision with root package name */
    public String f353421a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353422b;

    /* renamed from: c, reason: collision with root package name */
    public int f353423c;

    /* renamed from: d, reason: collision with root package name */
    public byte f353424d;

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zza(boolean z12) {
        this.f353422b = true;
        this.f353424d = (byte) (1 | this.f353424d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zzb(int i12) {
        this.f353423c = 1;
        this.f353424d = (byte) (this.f353424d | 2);
        return this;
    }

    public final zzns zzc(String str) {
        this.f353421a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zznt zzd() {
        String str;
        if (this.f353424d == 3 && (str = this.f353421a) != null) {
            return new zznq(str, this.f353422b, this.f353423c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f353421a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f353424d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f353424d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
