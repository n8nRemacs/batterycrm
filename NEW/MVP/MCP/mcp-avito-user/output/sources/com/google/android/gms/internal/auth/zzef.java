package com.google.android.gms.internal.auth;

import AK.c;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public abstract class zzef implements Iterable, Serializable {
    public static final zzef zzb = new zzec(zzfa.zzd);

    /* renamed from: b, reason: collision with root package name */
    public int f350087b = 0;

    static {
        int i12 = zzds.zza;
        new zzee(null);
        new zzdx();
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

    public static zzef zzk(byte[] bArr, int i12, int i13) {
        e(i12, i12 + i13, bArr.length);
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        return new zzec(bArr2);
    }

    public abstract byte a(int i12);

    public abstract int b(int i12, int i13);

    public abstract String d(Charset charset);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iB2 = this.f350087b;
        if (iB2 == 0) {
            int iZzd = zzd();
            iB2 = b(iZzd, iZzd);
            if (iB2 == 0) {
                iB2 = 1;
            }
            this.f350087b = iB2;
        }
        return iB2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strA = zzd() <= 50 ? zzgx.a(this) : zzgx.a(zzf(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzd);
        sb2.append(" contents=\"");
        return c.s(sb2, strA, "\">");
    }

    public abstract byte zza(int i12);

    public abstract int zzd();

    public abstract zzef zzf(int i12, int i13);

    public abstract boolean zzh();

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : d(charset);
    }
}
