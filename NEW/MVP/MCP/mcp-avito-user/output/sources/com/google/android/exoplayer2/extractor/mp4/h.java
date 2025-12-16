package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.F;
import j.P;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
/* loaded from: classes6.dex */
public final class h {

    /* compiled from: PsshAtomUtil.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f344857a;

        /* renamed from: b, reason: collision with root package name */
        public final int f344858b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f344859c;

        public a(UUID uuid, int i12, byte[] bArr) {
            this.f344857a = uuid;
            this.f344858b = i12;
            this.f344859c = bArr;
        }
    }

    public static byte[] a(UUID uuid, @P byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @P
    public static a b(byte[] bArr) {
        int iB2;
        F f12 = new F(bArr);
        if (f12.f348072c < 32) {
            return null;
        }
        f12.B(0);
        if (f12.d() != f12.a() + 4 || f12.d() != 1886614376 || (iB2 = com.google.android.exoplayer2.extractor.mp4.a.b(f12.d())) > 1) {
            return null;
        }
        UUID uuid = new UUID(f12.l(), f12.l());
        if (iB2 == 1) {
            f12.C(f12.u() * 16);
        }
        int iU2 = f12.u();
        if (iU2 != f12.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iU2];
        f12.c(0, iU2, bArr2);
        return new a(uuid, iB2, bArr2);
    }

    @P
    public static byte[] c(UUID uuid, byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        UUID uuid2 = aVarB.f344857a;
        if (uuid.equals(uuid2)) {
            return aVarB.f344859c;
        }
        uuid.toString();
        Objects.toString(uuid2);
        return null;
    }

    public static int d(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.f344858b;
    }
}
