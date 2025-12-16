package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzga extends zzfq implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final MessageDigest f350383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f350385d;

    /* renamed from: e, reason: collision with root package name */
    public final String f350386e;

    public zzga() throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean z12;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f350383b = messageDigest;
            this.f350384c = messageDigest.getDigestLength();
            this.f350386e = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z12 = true;
            } catch (CloneNotSupportedException unused) {
                z12 = false;
            }
            this.f350385d = z12;
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }

    public final String toString() {
        return this.f350386e;
    }

    @Override // com.google.android.gms.internal.fido.zzfu
    public final zzfv zza() {
        boolean z12 = this.f350385d;
        zzfy zzfyVar = null;
        int i12 = this.f350384c;
        MessageDigest messageDigest = this.f350383b;
        if (z12) {
            try {
                return new zzfz((MessageDigest) messageDigest.clone(), i12, zzfyVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new zzfz(MessageDigest.getInstance(messageDigest.getAlgorithm()), i12, zzfyVar);
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }
}
