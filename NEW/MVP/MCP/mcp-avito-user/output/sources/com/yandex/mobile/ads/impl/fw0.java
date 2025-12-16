package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* loaded from: classes8.dex */
public final class fw0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f385513a;

        /* renamed from: b, reason: collision with root package name */
        private final int f385514b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f385515c;

        public a(UUID uuid, int i12, byte[] bArr) {
            this.f385513a = uuid;
            this.f385514b = i12;
            this.f385515c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    @j.P
    private static a b(byte[] bArr) {
        pr0 pr0Var = new pr0(bArr);
        if (pr0Var.e() < 32) {
            return null;
        }
        pr0Var.e(0);
        if (pr0Var.h() != pr0Var.a() + 4 || pr0Var.h() != 1886614376) {
            return null;
        }
        int iB2 = gc.b(pr0Var.h());
        if (iB2 > 1) {
            j90.a("Unsupported pssh version: ", iB2, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(pr0Var.p(), pr0Var.p());
        if (iB2 == 1) {
            pr0Var.f(pr0Var.x() * 16);
        }
        int iX2 = pr0Var.x();
        if (iX2 != pr0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iX2];
        pr0Var.a(bArr2, 0, iX2);
        return new a(uuid, iB2, bArr2);
    }

    @j.P
    public static UUID c(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f385513a;
    }

    public static int d(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.f385514b;
    }

    @j.P
    public static byte[] a(UUID uuid, byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        if (uuid.equals(aVarB.f385513a)) {
            return aVarB.f385515c;
        }
        ka0.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarB.f385513a + ".");
        return null;
    }
}
