package androidx.media3.extractor.mp4;

import androidx.media3.common.util.J;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import j.P;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
@J
/* loaded from: classes.dex */
public final class h {

    /* compiled from: PsshAtomUtil.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f51030a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51031b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51032c;

        public a(UUID uuid, int i12, byte[] bArr) {
            this.f51030a = uuid;
            this.f51031b = i12;
            this.f51032c = bArr;
        }
    }

    @P
    public static a a(byte[] bArr) {
        z zVar = new z(bArr);
        if (zVar.f47964c < 32) {
            return null;
        }
        zVar.F(0);
        if (zVar.g() != zVar.a() + 4 || zVar.g() != 1886614376) {
            return null;
        }
        int iB2 = androidx.media3.extractor.mp4.a.b(zVar.g());
        if (iB2 > 1) {
            s.g();
            return null;
        }
        UUID uuid = new UUID(zVar.o(), zVar.o());
        if (iB2 == 1) {
            zVar.G(zVar.x() * 16);
        }
        int iX2 = zVar.x();
        if (iX2 != zVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iX2];
        zVar.e(0, iX2, bArr2);
        return new a(uuid, iB2, bArr2);
    }

    @P
    public static byte[] b(UUID uuid, byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return null;
        }
        UUID uuid2 = aVarA.f51030a;
        if (uuid.equals(uuid2)) {
            return aVarA.f51032c;
        }
        uuid.toString();
        uuid2.toString();
        s.g();
        return null;
    }

    public static int c(byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return -1;
        }
        return aVarA.f51031b;
    }
}
