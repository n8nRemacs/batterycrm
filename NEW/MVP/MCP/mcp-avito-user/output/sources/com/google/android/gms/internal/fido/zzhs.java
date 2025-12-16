package com.google.android.gms.internal.fido;

import AK.c;
import androidx.compose.foundation.H;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhs implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f350425b;

    /* renamed from: c, reason: collision with root package name */
    public zzhr f350426c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f350427d = new byte[8];

    /* renamed from: e, reason: collision with root package name */
    public final zzht f350428e = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.f350425b = inputStream;
    }

    public final long a() throws IOException {
        if (this.f350426c.zza() < 24) {
            long jZza = this.f350426c.zza();
            this.f350426c = null;
            return jZza;
        }
        if (this.f350426c.zza() == 24) {
            int i12 = this.f350425b.read();
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f350426c = null;
            return i12 & 255;
        }
        byte bZza = this.f350426c.zza();
        byte[] bArr = this.f350427d;
        if (bZza == 25) {
            d(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.f350426c.zza() == 26) {
            d(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (this.f350426c.zza() != 27) {
            throw new IOException(H.j(this.f350426c.zza(), this.f350426c.zzc(), "invalid additional information ", " for major type "));
        }
        d(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void b() {
        zzd();
        if (this.f350426c.zza() == 31) {
            throw new IllegalStateException(c.g(this.f350426c.zza(), "expected definite length but found "));
        }
    }

    public final void c(byte b12) {
        zzd();
        if (this.f350426c.zzb() != b12) {
            throw new IllegalStateException(H.j((b12 >> 5) & 7, this.f350426c.zzc(), "expected major type ", " but found "));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f350425b.close();
        this.f350428e.zzb();
    }

    public final void d(int i12, byte[] bArr) throws IOException {
        int i13 = 0;
        while (i13 != i12) {
            int i14 = this.f350425b.read(bArr, i13, i12 - i13);
            if (i14 == -1) {
                throw new EOFException();
            }
            i13 += i14;
        }
        this.f350426c = null;
    }

    public final byte[] f() throws IOException {
        b();
        long jA2 = a();
        if (jA2 < 0 || jA2 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f350425b.available() < jA2) {
            throw new EOFException();
        }
        int i12 = (int) jA2;
        byte[] bArr = new byte[i12];
        d(i12, bArr);
        return bArr;
    }

    public final long zza() {
        c((byte) -128);
        b();
        long jA2 = a();
        if (jA2 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jA2 > 0) {
            this.f350428e.zzg(jA2);
        }
        return jA2;
    }

    public final long zzb() {
        boolean z12;
        zzd();
        if (this.f350426c.zzb() == 0) {
            z12 = true;
        } else {
            if (this.f350426c.zzb() != 32) {
                throw new IllegalStateException(c.g(this.f350426c.zzc(), "expected major type 0 or 1 but found "));
            }
            z12 = false;
        }
        long jA2 = a();
        if (jA2 >= 0) {
            return z12 ? jA2 : ~jA2;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() {
        c((byte) -96);
        b();
        long jA2 = a();
        if (jA2 < 0 || jA2 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jA2 > 0) {
            this.f350428e.zzg(jA2 + jA2);
        }
        return jA2;
    }

    public final zzhr zzd() {
        if (this.f350426c == null) {
            int i12 = this.f350425b.read();
            zzht zzhtVar = this.f350428e;
            if (i12 == -1) {
                zzhtVar.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(i12);
            this.f350426c = zzhrVar;
            byte bZzb = zzhrVar.zzb();
            if (bZzb == -128 || bZzb == -96 || bZzb == -64) {
                zzhtVar.zzd();
                zzhtVar.zzf();
            } else {
                if (bZzb != -32) {
                    if (bZzb != 0 && bZzb != 32) {
                        if (bZzb == 64) {
                            zzhtVar.zze(-1L);
                        } else {
                            if (bZzb != 96) {
                                throw new IllegalStateException(c.g(this.f350426c.zzc(), "invalid major type: "));
                            }
                            zzhtVar.zze(-2L);
                        }
                    }
                    zzhtVar.zzf();
                } else if (this.f350426c.zza() == 31) {
                    zzhtVar.zzc();
                }
                zzhtVar.zzd();
                zzhtVar.zzf();
            }
        }
        return this.f350426c;
    }

    public final String zze() {
        c((byte) 96);
        return new String(f(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() {
        c((byte) -32);
        if (this.f350426c.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iA2 = (int) a();
        if (iA2 == 20) {
            return false;
        }
        if (iA2 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final byte[] zzg() {
        c((byte) 64);
        return f();
    }
}
