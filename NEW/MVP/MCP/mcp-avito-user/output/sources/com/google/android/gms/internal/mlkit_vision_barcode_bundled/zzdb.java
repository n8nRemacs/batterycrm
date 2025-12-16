package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import AK.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzdb implements Iterable, Serializable {
    public static final zzdb zzb = new zzcz(zzel.zzd);

    /* renamed from: b, reason: collision with root package name */
    public int f352404b = 0;

    static {
        int i12 = zzcn.zza;
        new zzda(null);
        new zzcu();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb b(java.util.Iterator r8, int r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.b(java.util.Iterator, int):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb");
    }

    public static int s(int i12, int i13, int i14) {
        int i15 = i13 - i12;
        if ((i12 | i13 | i15 | (i14 - i13)) >= 0) {
            return i15;
        }
        if (i12 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i12);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i13 < i12) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i12);
            sb3.append(", ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i13);
        sb4.append(" >= ");
        sb4.append(i14);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static void t(int i12, int i13) {
        if (((i13 - (i12 + 1)) | i12) < 0) {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i12);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i12);
            sb3.append(", ");
            sb3.append(i13);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    public static zzdb zzr(byte[] bArr, int i12, int i13) {
        s(i12, i12 + i13, bArr.length);
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        return new zzcz(bArr2);
    }

    public static zzdb zzs(String str) {
        return new zzcz(str.getBytes(zzel.f352447a));
    }

    public static zzdb zzt(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                int i13 = inputStream.read(bArr, i12, iMin - i12);
                if (i13 == -1) {
                    break;
                }
                i12 += i13;
            }
            zzdb zzdbVarZzr = i12 == 0 ? null : zzr(bArr, 0, i12);
            if (zzdbVarZzr == null) {
                break;
            }
            arrayList.add(zzdbVarZzr);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : b(arrayList.iterator(), size);
    }

    public abstract byte a(int i12);

    public abstract void d(int i12, int i13, int i14, byte[] bArr);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract boolean g();

    public abstract int h(int i12, int i13, int i14);

    public final int hashCode() {
        int iH2 = this.f352404b;
        if (iH2 == 0) {
            int iZzd = zzd();
            iH2 = h(iZzd, 0, iZzd);
            if (iH2 == 0) {
                iH2 = 1;
            }
            this.f352404b = iH2;
        }
        return iH2;
    }

    public abstract int i(int i12, int i13, int i14);

    public abstract String l(Charset charset);

    public abstract void r(zzcr zzcrVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strA = zzd() <= 50 ? zzgn.a(this) : zzgn.a(zzk(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzd);
        sb2.append(" contents=\"");
        return c.s(sb2, strA, "\">");
    }

    public abstract byte zza(int i12);

    public abstract int zzd();

    public abstract zzdb zzk(int i12, int i13);

    public abstract boolean zzn();

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzcx iterator() {
        return new zzcs(this);
    }

    public final String zzu(Charset charset) {
        return zzd() == 0 ? "" : l(charset);
    }

    public final String zzv() {
        return zzu(zzel.f352447a);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i12, int i13, int i14) {
        s(0, i14, zzd());
        s(i13, i13 + i14, bArr.length);
        if (i14 > 0) {
            d(0, i13, i14, bArr);
        }
    }

    public final byte[] zzy() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzel.zzd;
        }
        byte[] bArr = new byte[iZzd];
        d(0, 0, iZzd, bArr);
        return bArr;
    }
}
