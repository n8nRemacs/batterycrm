package com.google.android.gms.internal.fido;

import AK.c;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    public static final zzgx zzb = new zzgu(zzhc.zzd);

    /* renamed from: b, reason: collision with root package name */
    public int f350409b = 0;

    static {
        int i12 = zzgn.zza;
        new zzgw(null);
        new zzgp();
    }

    public static int e(int i12, int i13, int i14) {
        int i15 = i13 - i12;
        if ((i12 | i13 | i15 | (i14 - i13)) >= 0) {
            return i15;
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(G.e(i12, "Beginning index: ", " < 0"));
        }
        if (i13 < i12) {
            throw new IndexOutOfBoundsException(H.j(i12, i13, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(H.j(i13, i14, "End index: ", " >= "));
    }

    public static zzgx zzl(byte[] bArr, int i12, int i13) {
        e(0, i13, bArr.length);
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return new zzgu(bArr2);
    }

    public abstract byte a(int i12);

    public abstract void b(int i12, byte[] bArr);

    public abstract int d(int i12, int i13);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iD2 = this.f350409b;
        if (iD2 == 0) {
            int iZzd = zzd();
            iD2 = d(iZzd, iZzd);
            if (iD2 == 0) {
                iD2 = 1;
            }
            this.f350409b = iD2;
        }
        return iD2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgo(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strA = zzd() <= 50 ? zzhe.a(this) : zzhe.a(zzg(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzd);
        sb2.append(" contents=\"");
        return c.s(sb2, strA, "\">");
    }

    public abstract byte zza(int i12);

    public abstract int zzd();

    public abstract zzgx zzg(int i12, int i13);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzhc.zzd;
        }
        byte[] bArr = new byte[iZzd];
        b(iZzd, bArr);
        return bArr;
    }
}
