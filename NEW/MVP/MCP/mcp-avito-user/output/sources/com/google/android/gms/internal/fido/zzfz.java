package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfz extends zzfp {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f350380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350381b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350382c;

    public /* synthetic */ zzfz(MessageDigest messageDigest, int i12, zzfy zzfyVar) {
        this.f350380a = messageDigest;
        this.f350381b = i12;
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    public final void a(int i12, byte[] bArr) {
        zzbm.zzf(!this.f350382c, "Cannot re-use a Hasher after calling hash() on it");
        this.f350380a.update(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzbm.zzf(!this.f350382c, "Cannot re-use a Hasher after calling hash() on it");
        this.f350382c = true;
        MessageDigest messageDigest = this.f350380a;
        int digestLength = messageDigest.getDigestLength();
        int i12 = this.f350381b;
        if (i12 == digestLength) {
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = zzft.f350378b;
            return new zzfs(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i12);
        char[] cArr2 = zzft.f350378b;
        return new zzfs(bArrCopyOf);
    }
}
