package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class F1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358128b = new com.google.android.play.core.assetpacks.internal.F("VerifySliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358129a;

    public F1(Q q12) {
        this.f358129a = q12;
    }

    public final void a(E1 e12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str = e12.f358231b;
        File fileK = this.f358129a.k(e12.f358231b, e12.f358118e, e12.f358116c, e12.f358117d);
        boolean zExists = fileK.exists();
        String str2 = e12.f358118e;
        int i12 = e12.f358230a;
        if (!zExists) {
            throw new C37184v0(AK.c.k("Cannot find unverified files for slice ", str2, "."), i12);
        }
        try {
            Q q12 = this.f358129a;
            int i13 = e12.f358116c;
            long j12 = e12.f358117d;
            q12.getClass();
            File file = new File(new File(new File(q12.d(i13, j12, str), "_slices"), "_metadata"), str2);
            if (!file.exists()) {
                throw new C37184v0("Cannot find metadata files for slice " + str2 + ".", i12);
            }
            try {
                if (!C37112c1.a(D1.a(fileK, file)).equals(e12.f358119f)) {
                    throw new C37184v0(AK.c.k("Verification failed for slice ", str2, "."), i12);
                }
                f358128b.d("Verification of slice %s of pack %s successful.", str2, str);
                File fileL = this.f358129a.l(e12.f358231b, e12.f358118e, e12.f358116c, e12.f358117d);
                if (!fileL.exists()) {
                    fileL.mkdirs();
                }
                if (!fileK.renameTo(fileL)) {
                    throw new C37184v0(AK.c.k("Failed to move slice ", str2, " after verification."), i12);
                }
            } catch (IOException e13) {
                throw new C37184v0(i12, AK.c.k("Could not digest file during verification for slice ", str2, "."), e13);
            } catch (NoSuchAlgorithmException e14) {
                throw new C37184v0(i12, "SHA256 algorithm not supported.", e14);
            }
        } catch (IOException e15) {
            throw new C37184v0(i12, AK.c.k("Could not reconstruct slice archive during verification for slice ", str2, "."), e15);
        }
    }
}
