package com.google.android.gms.internal.fido;

import androidx.compose.ui.graphics.colorspace.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzhp implements Comparable {
    public static int c(byte b12) {
        return (b12 >> 5) & 7;
    }

    public static zzhk zzg(long j12) {
        return new zzhk(j12);
    }

    public static zzhn zzi(String str) {
        return new zzhn(str);
    }

    public static zzhp zzj(byte... bArr) {
        bArr.getClass();
        zzhs zzhsVar = new zzhs(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return zzhq.a(zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static zzhp zzk(InputStream inputStream) {
        zzhs zzhsVar = new zzhs(inputStream);
        try {
            return zzhq.a(zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final zzhp b(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(e.n("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();

    public final zzhi zze() {
        return (zzhi) b(zzhi.class);
    }

    public final zzhk zzf() {
        return (zzhk) b(zzhk.class);
    }

    public final zzhm zzh() {
        return (zzhm) b(zzhm.class);
    }
}
