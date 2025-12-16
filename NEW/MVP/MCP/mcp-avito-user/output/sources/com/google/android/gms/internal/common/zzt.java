package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class zzt extends zzw {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzu f350241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.f350241h = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int b(int i12) {
        return i12 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int c(int i12) {
        CharSequence charSequence = this.f350245d;
        int length = charSequence.length();
        zzs.zzb(i12, length, "index");
        while (i12 < length) {
            if (this.f350241h.f350242a.zza(charSequence.charAt(i12))) {
                return i12;
            }
            i12++;
        }
        return -1;
    }
}
