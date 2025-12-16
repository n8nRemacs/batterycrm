package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzsi extends zzsn {

    /* renamed from: a, reason: collision with root package name */
    public String f353967a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353968b;

    /* renamed from: c, reason: collision with root package name */
    public int f353969c;

    /* renamed from: d, reason: collision with root package name */
    public byte f353970d;

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsn
    public final zzsn zza(boolean z12) {
        this.f353968b = true;
        this.f353970d = (byte) (1 | this.f353970d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsn
    public final zzsn zzb(int i12) {
        this.f353969c = 1;
        this.f353970d = (byte) (this.f353970d | 2);
        return this;
    }

    public final zzsn zzc(String str) {
        this.f353967a = "optional-module-face";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsn
    public final zzso zzd() {
        String str;
        if (this.f353970d == 3 && (str = this.f353967a) != null) {
            return new zzsk(str, this.f353968b, this.f353969c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f353967a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f353970d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f353970d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
