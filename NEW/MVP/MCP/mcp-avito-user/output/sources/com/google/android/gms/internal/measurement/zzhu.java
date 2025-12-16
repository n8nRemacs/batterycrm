package com.google.android.gms.internal.measurement;

import AK.c;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzhu implements Serializable, Iterable<Byte> {

    /* renamed from: b, reason: collision with root package name */
    public int f350838b = 0;
    public static final zzhu zza = new zzie(zzjh.zzb);

    /* renamed from: c, reason: collision with root package name */
    public static final zzih f350837c = new zzih();

    static {
        new zzhw();
    }

    public static int a(int i12, int i13, int i14) {
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

    public static zzhu zza(byte[] bArr, int i12, int i13) {
        a(i12, i12 + i13, bArr.length);
        return new zzie(f350837c.zza(bArr, i12, i13));
    }

    public abstract String b(Charset charset);

    public abstract void d(zzhv zzhvVar);

    public abstract byte e(int i12);

    public abstract boolean equals(Object obj);

    public abstract int g(int i12, int i13);

    public final int hashCode() {
        int iG2 = this.f350838b;
        if (iG2 == 0) {
            int iZzb = zzb();
            iG2 = g(iZzb, iZzb);
            if (iG2 == 0) {
                iG2 = 1;
            }
            this.f350838b = iG2;
        }
        return iG2;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhx(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        String strA = zzb() <= 50 ? zzme.a(this) : r.q(zzme.a(zza(0, 47)), "...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzb);
        sb2.append(" contents=\"");
        return c.s(sb2, strA, "\">");
    }

    public abstract byte zza(int i12);

    public abstract zzhu zza(int i12, int i13);

    public abstract int zzb();

    public final String zzc() {
        return zzb() == 0 ? "" : b(zzjh.f350896a);
    }

    public abstract boolean zzd();

    public static zzhu zza(String str) {
        return new zzie(str.getBytes(zzjh.f350896a));
    }
}
