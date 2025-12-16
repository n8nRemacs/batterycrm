package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class s extends zzec implements zzfm {
    private static final s zza;
    private byte zzA = 2;
    private int zze;
    private int zzf;
    private zzdb zzg;
    private String zzh;
    private int zzi;
    private H zzj;
    private O zzk;
    private zzci zzl;
    private C37655i zzm;
    private q zzn;
    private C37658l zzo;
    private C37651e zzp;
    private F zzq;
    private J zzr;
    private B zzs;
    private zzek zzt;
    private zzei zzu;
    private String zzv;
    private zzek zzw;
    private boolean zzx;
    private double zzy;
    private zzdb zzz;

    static {
        s sVar = new s();
        zza = sVar;
        zzec.k(s.class, sVar);
    }

    public s() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzg = zzdbVar;
        this.zzh = "";
        this.zzt = zzec.h();
        this.zzu = zzec.g();
        this.zzv = "";
        this.zzw = zzec.h();
        this.zzx = true;
        this.zzz = zzdbVar;
    }

    public static void B(s sVar, int i12, C37653g c37653g) {
        c37653g.getClass();
        zzek zzekVar = sVar.zzt;
        if (!zzekVar.zzc()) {
            int size = zzekVar.size();
            sVar.zzt = zzekVar.zzd(size == 0 ? 10 : size + size);
        }
        sVar.zzt.set(i12, c37653g);
    }

    public final zzek A() {
        return this.zzt;
    }

    public final boolean C() {
        return (this.zze & 2048) != 0;
    }

    public final boolean D() {
        return (this.zze & 16) != 0;
    }

    public final boolean E() {
        return (this.zze & 4096) != 0;
    }

    public final boolean F() {
        return (this.zze & 32) != 0;
    }

    public final boolean G() {
        return (this.zze & 1024) != 0;
    }

    public final boolean H() {
        return (this.zze & 64) != 0;
    }

    public final boolean I() {
        return (this.zze & 128) != 0;
    }

    public final boolean J() {
        return (this.zze & 512) != 0;
    }

    public final boolean K() {
        return (this.zze & 256) != 0;
    }

    public final int L() {
        int iA2 = v.a(this.zzf);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᔌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zze", "zzf", u.f362590a, "zzg", "zzh", "zzi", x.f362591a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C37653g.class, "zzv", "zzw", C37653g.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy"});
        }
        if (i13 == 3) {
            return new s();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new r(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzA = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int n() {
        int iA2 = y.a(this.zzi);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int o() {
        return this.zzt.size();
    }

    public final F q() {
        F f12 = this.zzq;
        return f12 == null ? F.q() : f12;
    }

    public final H r() {
        H h12 = this.zzj;
        return h12 == null ? H.p() : h12;
    }

    public final J s() {
        J j12 = this.zzr;
        return j12 == null ? J.o() : j12;
    }

    public final O t() {
        O o12 = this.zzk;
        return o12 == null ? O.o() : o12;
    }

    public final C37651e u() {
        C37651e c37651e = this.zzp;
        return c37651e == null ? C37651e.q() : c37651e;
    }

    public final C37655i v() {
        C37655i c37655i = this.zzm;
        return c37655i == null ? C37655i.o() : c37655i;
    }

    public final C37658l w() {
        C37658l c37658l = this.zzo;
        return c37658l == null ? C37658l.o() : c37658l;
    }

    public final q x() {
        q qVar = this.zzn;
        return qVar == null ? q.o() : qVar;
    }

    public final zzdb y() {
        return this.zzg;
    }

    public final String z() {
        return this.zzh;
    }

    public final zzci zzb() {
        zzci zzciVar = this.zzl;
        return zzciVar == null ? zzci.zzb() : zzciVar;
    }
}
