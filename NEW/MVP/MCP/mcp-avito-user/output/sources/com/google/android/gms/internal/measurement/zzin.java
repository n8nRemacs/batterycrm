package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzin implements zzlk {

    /* renamed from: a, reason: collision with root package name */
    public final zzij f350858a;

    /* renamed from: b, reason: collision with root package name */
    public int f350859b;

    /* renamed from: c, reason: collision with root package name */
    public int f350860c;

    /* renamed from: d, reason: collision with root package name */
    public int f350861d = 0;

    public zzin(zzij zzijVar) {
        Charset charset = zzjh.f350896a;
        this.f350858a = zzijVar;
        zzijVar.f350856c = this;
    }

    public static void e(int i12) throws zzjq {
        if ((i12 & 3) != 0) {
            throw zzjq.d();
        }
    }

    public static void g(int i12) throws zzjq {
        if ((i12 & 7) != 0) {
            throw zzjq.d();
        }
    }

    public final Object a(zzmv zzmvVar, Class<?> cls, zzis zzisVar) throws zzjq {
        switch (zzim.f350857a[zzmvVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                d(2);
                zzlj zzljVarZza = zzlf.zza().zza((Class) cls);
                Object objZza = zzljVarZza.zza();
                h(objZza, zzljVarZza, zzisVar);
                zzljVarZza.zzc(objZza);
                return objZza;
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void b(int i12) throws zzjq {
        if (this.f350858a.zzc() != i12) {
            throw zzjq.e();
        }
    }

    public final void c(List<String> list, boolean z12) throws zzjp {
        int iZzi;
        int iZzi2;
        if ((this.f350859b & 7) != 2) {
            throw zzjq.a();
        }
        boolean z13 = list instanceof zzjx;
        zzij zzijVar = this.f350858a;
        if (!z13 || z12) {
            do {
                list.add(z12 ? zzr() : zzq());
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        do {
            zzjxVar.zza(zzp());
            if (zzijVar.zzt()) {
                return;
            } else {
                iZzi2 = zzijVar.zzi();
            }
        } while (iZzi2 == this.f350859b);
        this.f350861d = iZzi2;
    }

    public final void d(int i12) throws zzjp {
        if ((this.f350859b & 7) != i12) {
            throw zzjq.a();
        }
    }

    public final <T> void f(T t12, zzlj<T> zzljVar, zzis zzisVar) {
        int i12 = this.f350860c;
        this.f350860c = ((this.f350859b >>> 3) << 3) | 4;
        try {
            zzljVar.zza(t12, this, zzisVar);
            if (this.f350859b == this.f350860c) {
            } else {
                throw zzjq.d();
            }
        } finally {
            this.f350860c = i12;
        }
    }

    public final <T> void h(T t12, zzlj<T> zzljVar, zzis zzisVar) throws zzjq {
        zzij zzijVar = this.f350858a;
        int iZzj = zzijVar.zzj();
        if (zzijVar.f350854a >= zzijVar.f350855b) {
            throw new zzjq("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZza = zzijVar.zza(iZzj);
        zzijVar.f350854a++;
        zzljVar.zza(t12, this, zzisVar);
        zzijVar.zzb(0);
        zzijVar.f350854a--;
        zzijVar.zzc(iZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final double zza() throws zzjp {
        d(1);
        return this.f350858a.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final float zzb() throws zzjp {
        d(5);
        return this.f350858a.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzc() {
        int i12 = this.f350861d;
        if (i12 != 0) {
            this.f350859b = i12;
            this.f350861d = 0;
        } else {
            this.f350859b = this.f350858a.zzi();
        }
        int i13 = this.f350859b;
        if (i13 == 0 || i13 == this.f350860c) {
            return Integer.MAX_VALUE;
        }
        return i13 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzd() {
        return this.f350859b;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zze() throws zzjp {
        d(0);
        return this.f350858a.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzf() throws zzjp {
        d(5);
        return this.f350858a.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzg() throws zzjp {
        d(0);
        return this.f350858a.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzh() throws zzjp {
        d(5);
        return this.f350858a.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzi() throws zzjp {
        d(0);
        return this.f350858a.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zzj() throws zzjp {
        d(0);
        return this.f350858a.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final long zzk() throws zzjp {
        d(1);
        return this.f350858a.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final long zzl() throws zzjp {
        d(0);
        return this.f350858a.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final long zzm() throws zzjp {
        d(1);
        return this.f350858a.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final long zzn() throws zzjp {
        d(0);
        return this.f350858a.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final long zzo() throws zzjp {
        d(0);
        return this.f350858a.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final zzhu zzp() throws zzjp {
        d(2);
        return this.f350858a.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final String zzq() throws zzjp {
        d(2);
        return this.f350858a.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final String zzr() throws zzjp {
        d(2);
        return this.f350858a.zzs();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzs() throws zzjp {
        d(0);
        return this.f350858a.zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzt() {
        int i12;
        zzij zzijVar = this.f350858a;
        if (zzijVar.zzt() || (i12 = this.f350859b) == this.f350860c) {
            return false;
        }
        return zzijVar.zzd(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (!z12) {
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(zzijVar.zzd()));
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi = zzijVar.zzi();
                    }
                } while (iZzi == this.f350859b);
                this.f350861d = iZzi;
                return;
            }
            if (i12 != 2) {
                throw zzjq.a();
            }
            int iZzc = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Integer.valueOf(zzijVar.zzd()));
            } while (zzijVar.zzc() < iZzc);
            b(iZzc);
            return;
        }
        zzji zzjiVar = (zzji) list;
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                zzjiVar.zzd(zzijVar.zzd());
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi2 = zzijVar.zzi();
                }
            } while (iZzi2 == this.f350859b);
            this.f350861d = iZzi2;
            return;
        }
        if (i13 != 2) {
            throw zzjq.a();
        }
        int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
        do {
            zzjiVar.zzd(zzijVar.zzd());
        } while (zzijVar.zzc() < iZzc2);
        b(iZzc2);
    }

    public static zzin zza(zzij zzijVar) {
        zzin zzinVar = zzijVar.f350856c;
        return zzinVar != null ? zzinVar : new zzin(zzijVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final <T> void zzb(T t12, zzlj<T> zzljVar, zzis zzisVar) throws zzjq {
        d(2);
        h(t12, zzljVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzji zzjiVar = (zzji) list;
            int i12 = this.f350859b & 7;
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                e(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zzjiVar.zzd(zzijVar.zze());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            if (i12 == 5) {
                do {
                    zzjiVar.zzd(zzijVar.zze());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            e(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(zzijVar.zze()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        if (i13 == 5) {
            do {
                list.add(Integer.valueOf(zzijVar.zze()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(List<Long> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzkg;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzkg zzkgVar = (zzkg) list;
            int i12 = this.f350859b & 7;
            if (i12 == 1) {
                do {
                    zzkgVar.zza(zzijVar.zzk());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                g(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zzkgVar.zza(zzijVar.zzk());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 1) {
            do {
                list.add(Long.valueOf(zzijVar.zzk()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            g(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(zzijVar.zzk()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(List<Float> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzje;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzje zzjeVar = (zzje) list;
            int i12 = this.f350859b & 7;
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                e(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zzjeVar.zza(zzijVar.zzb());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            if (i12 == 5) {
                do {
                    zzjeVar.zza(zzijVar.zzb());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            e(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Float.valueOf(zzijVar.zzb()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        if (i13 == 5) {
            do {
                list.add(Float.valueOf(zzijVar.zzb()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzji zzjiVar = (zzji) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzjiVar.zzd(zzijVar.zzf());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzjiVar.zzd(zzijVar.zzf());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Integer.valueOf(zzijVar.zzf()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Integer.valueOf(zzijVar.zzf()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(List<Long> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzkg;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzkg zzkgVar = (zzkg) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzkgVar.zza(zzijVar.zzl());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzkgVar.zza(zzijVar.zzl());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Long.valueOf(zzijVar.zzl()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Long.valueOf(zzijVar.zzl()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzji zzjiVar = (zzji) list;
            int i12 = this.f350859b & 7;
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                e(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zzjiVar.zzd(zzijVar.zzg());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            if (i12 == 5) {
                do {
                    zzjiVar.zzd(zzijVar.zzg());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            e(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(zzijVar.zzg()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        if (i13 == 5) {
            do {
                list.add(Integer.valueOf(zzijVar.zzg()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(List<Long> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzkg;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzkg zzkgVar = (zzkg) list;
            int i12 = this.f350859b & 7;
            if (i12 == 1) {
                do {
                    zzkgVar.zza(zzijVar.zzn());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                g(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zzkgVar.zza(zzijVar.zzn());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 1) {
            do {
                list.add(Long.valueOf(zzijVar.zzn()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            g(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(zzijVar.zzn()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzji zzjiVar = (zzji) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzjiVar.zzd(zzijVar.zzh());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzjiVar.zzd(zzijVar.zzh());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Integer.valueOf(zzijVar.zzh()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Integer.valueOf(zzijVar.zzh()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzm(List<Long> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzkg;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzkg zzkgVar = (zzkg) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzkgVar.zza(zzijVar.zzo());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzkgVar.zza(zzijVar.zzo());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Long.valueOf(zzijVar.zzo()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Long.valueOf(zzijVar.zzo()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(List<String> list) throws zzjp {
        c(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(List<String> list) throws zzjp {
        c(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(List<Integer> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzji;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzji zzjiVar = (zzji) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzjiVar.zzd(zzijVar.zzj());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzjiVar.zzd(zzijVar.zzj());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Integer.valueOf(zzijVar.zzj()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Integer.valueOf(zzijVar.zzj()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzq(List<Long> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzkg;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzkg zzkgVar = (zzkg) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzkgVar.zza(zzijVar.zzp());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzkgVar.zza(zzijVar.zzp());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Long.valueOf(zzijVar.zzp()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Long.valueOf(zzijVar.zzp()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final <T> void zza(T t12, zzlj<T> zzljVar, zzis zzisVar) throws zzjp {
        d(3);
        f(t12, zzljVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(List<zzhu> list) throws zzjp {
        int iZzi;
        if ((this.f350859b & 7) == 2) {
            do {
                list.add(zzp());
                zzij zzijVar = this.f350858a;
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzc(List<Double> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zziq;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zziq zziqVar = (zziq) list;
            int i12 = this.f350859b & 7;
            if (i12 == 1) {
                do {
                    zziqVar.zza(zzijVar.zza());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzj = zzijVar.zzj();
                g(iZzj);
                int iZzc = zzijVar.zzc() + iZzj;
                do {
                    zziqVar.zza(zzijVar.zza());
                } while (zzijVar.zzc() < iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 1) {
            do {
                list.add(Double.valueOf(zzijVar.zza()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzj2 = zzijVar.zzj();
            g(iZzj2);
            int iZzc2 = zzijVar.zzc() + iZzj2;
            do {
                list.add(Double.valueOf(zzijVar.zza()));
            } while (zzijVar.zzc() < iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zza(List<Boolean> list) throws zzjq {
        int iZzi;
        int iZzi2;
        boolean z12 = list instanceof zzhs;
        zzij zzijVar = this.f350858a;
        if (z12) {
            zzhs zzhsVar = (zzhs) list;
            int i12 = this.f350859b & 7;
            if (i12 == 0) {
                do {
                    zzhsVar.zza(zzijVar.zzu());
                    if (zzijVar.zzt()) {
                        return;
                    } else {
                        iZzi2 = zzijVar.zzi();
                    }
                } while (iZzi2 == this.f350859b);
                this.f350861d = iZzi2;
                return;
            }
            if (i12 == 2) {
                int iZzc = zzijVar.zzc() + zzijVar.zzj();
                do {
                    zzhsVar.zza(zzijVar.zzu());
                } while (zzijVar.zzc() < iZzc);
                b(iZzc);
                return;
            }
            throw zzjq.a();
        }
        int i13 = this.f350859b & 7;
        if (i13 == 0) {
            do {
                list.add(Boolean.valueOf(zzijVar.zzu()));
                if (zzijVar.zzt()) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == this.f350859b);
            this.f350861d = iZzi;
            return;
        }
        if (i13 == 2) {
            int iZzc2 = zzijVar.zzc() + zzijVar.zzj();
            do {
                list.add(Boolean.valueOf(zzijVar.zzu()));
            } while (zzijVar.zzc() < iZzc2);
            b(iZzc2);
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final <T> void zzb(List<T> list, zzlj<T> zzljVar, zzis zzisVar) throws zzjq {
        int iZzi;
        int i12 = this.f350859b;
        if ((i12 & 7) == 2) {
            do {
                T tZza = zzljVar.zza();
                h(tZza, zzljVar, zzisVar);
                zzljVar.zzc(tZza);
                list.add(tZza);
                zzij zzijVar = this.f350858a;
                if (zzijVar.zzt() || this.f350861d != 0) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == i12);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    @Deprecated
    public final <T> void zza(List<T> list, zzlj<T> zzljVar, zzis zzisVar) throws zzjp {
        int iZzi;
        int i12 = this.f350859b;
        if ((i12 & 7) == 3) {
            do {
                T tZza = zzljVar.zza();
                f(tZza, zzljVar, zzisVar);
                zzljVar.zzc(tZza);
                list.add(tZza);
                zzij zzijVar = this.f350858a;
                if (zzijVar.zzt() || this.f350861d != 0) {
                    return;
                } else {
                    iZzi = zzijVar.zzi();
                }
            } while (iZzi == i12);
            this.f350861d = iZzi;
            return;
        }
        throw zzjq.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r9.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1.zzc(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void zza(java.util.Map<K, V> r9, com.google.android.gms.internal.measurement.zzkm<K, V> r10, com.google.android.gms.internal.measurement.zzis r11) throws com.google.android.gms.internal.measurement.zzjp {
        /*
            r8 = this;
            r0 = 2
            r8.d(r0)
            com.google.android.gms.internal.measurement.zzij r1 = r8.f350858a
            int r2 = r1.zzj()
            int r2 = r1.zza(r2)
            K r3 = r10.zzb
            V r4 = r10.zzd
        L12:
            int r5 = r8.zzc()     // Catch: java.lang.Throwable -> L35
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L59
            boolean r6 = r1.zzt()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L59
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L44
            if (r5 == r0) goto L37
            boolean r5 = r8.zzt()     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            if (r5 == 0) goto L2f
            goto L12
        L2f:
            com.google.android.gms.internal.measurement.zzjq r5 = new com.google.android.gms.internal.measurement.zzjq     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            throw r5     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
        L35:
            r9 = move-exception
            goto L60
        L37:
            com.google.android.gms.internal.measurement.zzmv r5 = r10.zzc     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            V r6 = r10.zzd     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            java.lang.Object r4 = r8.a(r5, r6, r11)     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            goto L12
        L44:
            com.google.android.gms.internal.measurement.zzmv r5 = r10.zza     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            r6 = 0
            java.lang.Object r3 = r8.a(r5, r6, r6)     // Catch: java.lang.Throwable -> L35 com.google.android.gms.internal.measurement.zzjp -> L4c
            goto L12
        L4c:
            boolean r5 = r8.zzt()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L53
            goto L12
        L53:
            com.google.android.gms.internal.measurement.zzjq r9 = new com.google.android.gms.internal.measurement.zzjq     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L35
            throw r9     // Catch: java.lang.Throwable -> L35
        L59:
            r9.put(r3, r4)     // Catch: java.lang.Throwable -> L35
            r1.zzc(r2)
            return
        L60:
            r1.zzc(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzin.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzis):void");
    }
}
