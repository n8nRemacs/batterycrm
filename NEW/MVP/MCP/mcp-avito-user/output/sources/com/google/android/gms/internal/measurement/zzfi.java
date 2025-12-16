package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzfi {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zza extends zzjf<zza, C10631zza> implements zzkt {
        private static final zza zzc;
        private static volatile zzle<zza> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza, reason: collision with other inner class name */
        public static final class C10631zza extends zzjf.zzb<zza, C10631zza> implements zzkt {
            public C10631zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C10631zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjf.i(zza.class, zzaVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10631zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zza> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzb extends zzjf<zzb, zza> implements zzkt {
        private static final zzb zzc;
        private static volatile zzle<zzb> zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzb, zza> implements zzkt {
            public zza() {
                super(zzb.zzc);
            }

            public final zza zza(boolean z12) {
                e();
                zzb.t((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zzb(boolean z12) {
                e();
                zzb.s((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zzc(boolean z12) {
                e();
                zzb.n((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zzd(boolean z12) {
                e();
                zzb.u((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zze(boolean z12) {
                e();
                zzb.p((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zzf(boolean z12) {
                e();
                zzb.q((zzb) this.f350893c, z12);
                return this;
            }

            public final zza zzg(boolean z12) {
                e();
                zzb.r((zzb) this.f350893c, z12);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjf.i(zzb.class, zzbVar);
        }

        public static void n(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 1;
            zzbVar.zzf = z12;
        }

        public static void p(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 2;
            zzbVar.zzg = z12;
        }

        public static void q(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 4;
            zzbVar.zzh = z12;
        }

        public static void r(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 8;
            zzbVar.zzi = z12;
        }

        public static void s(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 16;
            zzbVar.zzj = z12;
        }

        public static void t(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 32;
            zzbVar.zzk = z12;
        }

        public static void u(zzb zzbVar, boolean z12) {
            zzbVar.zze |= 64;
            zzbVar.zzl = z12;
        }

        public static zza zza() {
            return zzc.k();
        }

        public static zzb zzc() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzb> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzc extends zzjf<zzc, zza> implements zzkt {
        private static final zzc zzc;
        private static volatile zzle<zzc> zzd;
        private int zze;
        private int zzf;
        private zzl zzg;
        private zzl zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzc, zza> implements zzkt {
            public zza() {
                super(zzc.zzc);
            }

            public final zza zza(int i12) {
                e();
                zzc.n((zzc) this.f350893c, i12);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(zzl.zza zzaVar) {
                e();
                zzc.o((zzc) this.f350893c, (zzl) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zza(boolean z12) {
                e();
                zzc.p((zzc) this.f350893c, z12);
                return this;
            }

            public final zza zza(zzl zzlVar) {
                e();
                zzc.q((zzc) this.f350893c, zzlVar);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjf.i(zzc.class, zzcVar);
        }

        public static void n(zzc zzcVar, int i12) {
            zzcVar.zze |= 1;
            zzcVar.zzf = i12;
        }

        public static void o(zzc zzcVar, zzl zzlVar) {
            zzcVar.getClass();
            zzlVar.getClass();
            zzcVar.zzg = zzlVar;
            zzcVar.zze |= 2;
        }

        public static void p(zzc zzcVar, boolean z12) {
            zzcVar.zze |= 8;
            zzcVar.zzi = z12;
        }

        public static void q(zzc zzcVar, zzl zzlVar) {
            zzcVar.getClass();
            zzlVar.getClass();
            zzcVar.zzh = zzlVar;
            zzcVar.zze |= 4;
        }

        public static zza zzb() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzc> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzl zzd() {
            zzl zzlVar = this.zzg;
            return zzlVar == null ? zzl.zzg() : zzlVar;
        }

        public final zzl zze() {
            zzl zzlVar = this.zzh;
            return zzlVar == null ? zzl.zzg() : zzlVar;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzd extends zzjf<zzd, zza> implements zzkt {
        private static final zzd zzc;
        private static volatile zzle<zzd> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzd, zza> implements zzkt {
            public zza() {
                super(zzd.zzc);
            }

            public final zza zza(long j12) {
                e();
                zzd.o((zzd) this.f350893c, j12);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(int i12) {
                e();
                zzd.n((zzd) this.f350893c, i12);
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjf.i(zzd.class, zzdVar);
        }

        public static void n(zzd zzdVar, int i12) {
            zzdVar.zze |= 1;
            zzdVar.zzf = i12;
        }

        public static void o(zzd zzdVar, long j12) {
            zzdVar.zze |= 2;
            zzdVar.zzg = j12;
        }

        public static zza zzc() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzd> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzf;
        }

        public final long zzb() {
            return this.zzg;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zze extends zzjf<zze, zza> implements zzkt {
        private static final zze zzc;
        private static volatile zzle<zze> zzd;
        private int zze;
        private zzjn<zzg> zzf = zzli.zzd();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zze, zza> implements zzkt {
            public zza() {
                super(zze.zzc);
            }

            public final int zza() {
                return ((zze) this.f350893c).zzb();
            }

            public final long zzb() {
                return ((zze) this.f350893c).zzc();
            }

            public final long zzc() {
                return ((zze) this.f350893c).zzd();
            }

            public final zza zzd() {
                e();
                zze.p((zze) this.f350893c);
                return this;
            }

            public final String zze() {
                return ((zze) this.f350893c).zzg();
            }

            public final List<zzg> zzf() {
                return Collections.unmodifiableList(((zze) this.f350893c).zzh());
            }

            public final boolean zzg() {
                return ((zze) this.f350893c).zzk();
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                e();
                zze.s((zze) this.f350893c, iterable);
                return this;
            }

            public final zza zzb(long j12) {
                e();
                zze.o(j12, (zze) this.f350893c);
                return this;
            }

            public final zza zza(zzg.zza zzaVar) {
                e();
                zze.r((zze) this.f350893c, (zzg) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zzg zzb(int i12) {
                return ((zze) this.f350893c).zza(i12);
            }

            public final zza zza(zzg zzgVar) {
                e();
                zze.r((zze) this.f350893c, zzgVar);
                return this;
            }

            public final zza zza(int i12) {
                e();
                zze.n(i12, (zze) this.f350893c);
                return this;
            }

            public final zza zza(String str) {
                e();
                zze.t((zze) this.f350893c, str);
                return this;
            }

            public final zza zza(int i12, zzg.zza zzaVar) {
                e();
                zze.q((zze) this.f350893c, i12, (zzg) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zza(int i12, zzg zzgVar) {
                e();
                zze.q((zze) this.f350893c, i12, zzgVar);
                return this;
            }

            public final zza zza(long j12) {
                e();
                zze.u(j12, (zze) this.f350893c);
                return this;
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjf.i(zze.class, zzeVar);
        }

        public static void n(int i12, zze zzeVar) {
            zzeVar.w();
            zzeVar.zzf.remove(i12);
        }

        public static void o(long j12, zze zzeVar) {
            zzeVar.zze |= 2;
            zzeVar.zzh = j12;
        }

        public static void p(zze zzeVar) {
            zzeVar.getClass();
            zzeVar.zzf = zzli.zzd();
        }

        public static void q(zze zzeVar, int i12, zzg zzgVar) {
            zzeVar.getClass();
            zzgVar.getClass();
            zzeVar.w();
            zzeVar.zzf.set(i12, zzgVar);
        }

        public static void r(zze zzeVar, zzg zzgVar) {
            zzeVar.getClass();
            zzgVar.getClass();
            zzeVar.w();
            zzeVar.zzf.add(zzgVar);
        }

        public static void s(zze zzeVar, Iterable iterable) {
            zzeVar.w();
            zzhl.b(iterable, zzeVar.zzf);
        }

        public static void t(zze zzeVar, String str) {
            zzeVar.getClass();
            str.getClass();
            zzeVar.zze |= 1;
            zzeVar.zzg = str;
        }

        public static void u(long j12, zze zzeVar) {
            zzeVar.zze |= 4;
            zzeVar.zzi = j12;
        }

        public static zza zze() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzg.class, "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zze> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void w() {
            zzjn<zzg> zzjnVar = this.zzf;
            if (zzjnVar.zzc()) {
                return;
            }
            this.zzf = zzjf.f(zzjnVar);
        }

        public final int zza() {
            return this.zzj;
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzg> zzh() {
            return this.zzf;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }

        public final zzg zza(int i12) {
            return this.zzf.get(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzf extends zzjf<zzf, zza> implements zzkt {
        private static final zzf zzc;
        private static volatile zzle<zzf> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzf, zza> implements zzkt {
            public zza() {
                super(zzf.zzc);
            }

            public final zza zza(long j12) {
                e();
                zzf.n((zzf) this.f350893c, j12);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(String str) {
                e();
                zzf.o((zzf) this.f350893c, str);
                return this;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjf.i(zzf.class, zzfVar);
        }

        public static void n(zzf zzfVar, long j12) {
            zzfVar.zze |= 2;
            zzfVar.zzg = j12;
        }

        public static void o(zzf zzfVar, String str) {
            zzfVar.getClass();
            str.getClass();
            zzfVar.zze |= 1;
            zzfVar.zzf = str;
        }

        public static zza zza() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzf> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzg extends zzjf<zzg, zza> implements zzkt {
        private static final zzg zzc;
        private static volatile zzle<zzg> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzjn<zzg> zzk = zzli.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzg, zza> implements zzkt {
            public zza() {
                super(zzg.zzc);
            }

            public final int zza() {
                return ((zzg) this.f350893c).zzc();
            }

            public final zza zzb() {
                e();
                zzg.v((zzg) this.f350893c);
                return this;
            }

            public final zza zzc() {
                e();
                zzg.t((zzg) this.f350893c);
                return this;
            }

            public final zza zzd() {
                e();
                zzg.w((zzg) this.f350893c);
                return this;
            }

            public final zza zze() {
                e();
                zzg.s((zzg) this.f350893c);
                return this;
            }

            public final String zzf() {
                return ((zzg) this.f350893c).zzg();
            }

            public final String zzg() {
                return ((zzg) this.f350893c).zzh();
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                e();
                zzg.q((zzg) this.f350893c, iterable);
                return this;
            }

            public final zza zzb(String str) {
                e();
                zzg.u((zzg) this.f350893c, str);
                return this;
            }

            public final zza zza(zza zzaVar) {
                e();
                zzg.p((zzg) this.f350893c, (zzg) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zza(double d12) {
                e();
                zzg.n((zzg) this.f350893c, d12);
                return this;
            }

            public final zza zza(long j12) {
                e();
                zzg.o((zzg) this.f350893c, j12);
                return this;
            }

            public final zza zza(String str) {
                e();
                zzg.r((zzg) this.f350893c, str);
                return this;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjf.i(zzg.class, zzgVar);
        }

        public static void n(zzg zzgVar, double d12) {
            zzgVar.zze |= 16;
            zzgVar.zzj = d12;
        }

        public static void o(zzg zzgVar, long j12) {
            zzgVar.zze |= 4;
            zzgVar.zzh = j12;
        }

        public static void p(zzg zzgVar, zzg zzgVar2) {
            zzgVar.getClass();
            zzgVar2.getClass();
            zzjn<zzg> zzjnVar = zzgVar.zzk;
            if (!zzjnVar.zzc()) {
                zzgVar.zzk = zzjf.f(zzjnVar);
            }
            zzgVar.zzk.add(zzgVar2);
        }

        public static void q(zzg zzgVar, Iterable iterable) {
            zzjn<zzg> zzjnVar = zzgVar.zzk;
            if (!zzjnVar.zzc()) {
                zzgVar.zzk = zzjf.f(zzjnVar);
            }
            zzhl.b(iterable, zzgVar.zzk);
        }

        public static void r(zzg zzgVar, String str) {
            zzgVar.getClass();
            str.getClass();
            zzgVar.zze |= 1;
            zzgVar.zzf = str;
        }

        public static void s(zzg zzgVar) {
            zzgVar.zze &= -3;
            zzgVar.zzg = zzc.zzg;
        }

        public static void t(zzg zzgVar) {
            zzgVar.zze &= -5;
            zzgVar.zzh = 0L;
        }

        public static void u(zzg zzgVar, String str) {
            zzgVar.getClass();
            str.getClass();
            zzgVar.zze |= 2;
            zzgVar.zzg = str;
        }

        public static void v(zzg zzgVar) {
            zzgVar.zze &= -17;
            zzgVar.zzj = 0.0d;
        }

        public static void w(zzg zzgVar) {
            zzgVar.getClass();
            zzgVar.zzk = zzli.zzd();
        }

        public static zza zze() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzg> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final double zza() {
            return this.zzj;
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzg> zzi() {
            return this.zzk;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzh extends zzjf<zzh, zza> implements zzkt {
        private static final zzh zzc;
        private static volatile zzle<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zza zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzh, zza> implements zzkt {
            public zza() {
                super(zzh.zzc);
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjf.i(zzh.class, zzhVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzh> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzi extends zzjf<zzi, zza> implements zzkt {
        private static final zzi zzc;
        private static volatile zzle<zzi> zzd;
        private int zze;
        private zzjn<zzj> zzf = zzli.zzd();
        private String zzg = "";
        private String zzh = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzi, zza> implements zzkt {
            public zza() {
                super(zzi.zzc);
            }

            public final int zza() {
                return ((zzi) this.f350893c).zza();
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(zzj.zza zzaVar) {
                e();
                zzi.n((zzi) this.f350893c, (zzj) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zzj zza(int i12) {
                return ((zzi) this.f350893c).zza(0);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzjf.i(zzi.class, zziVar);
        }

        public static void n(zzi zziVar, zzj zzjVar) {
            zziVar.getClass();
            zzjVar.getClass();
            zzjn<zzj> zzjnVar = zziVar.zzf;
            if (!zzjnVar.zzc()) {
                zziVar.zzf = zzjf.f(zzjnVar);
            }
            zziVar.zzf.add(zzjVar);
        }

        public static zza zzb() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001", new Object[]{"zze", "zzf", zzj.class, "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzi> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzf.size();
        }

        public final List<zzj> zzd() {
            return this.zzf;
        }

        public final zzj zza(int i12) {
            return this.zzf.get(0);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzj extends zzjf<zzj, zza> implements zzkt {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f350752b = 0;
        private static final zzj zzc;
        private static volatile zzle<zzj> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzk zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzh zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzb zzbn;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzjn<zze> zzh = zzli.zzd();
        private zzjn<zzn> zzi = zzli.zzd();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzjn<zzc> zzag = zzli.zzd();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzjl zzat = zzji.zzd();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzjn<String> zzbe = zzli.zzd();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzj, zza> implements zzkt {
            public zza() {
                super(zzj.zzc);
            }

            public final int zza() {
                return ((zzj) this.f350893c).zza();
            }

            public final List<zze> zzaa() {
                return Collections.unmodifiableList(((zzj) this.f350893c).zzap());
            }

            public final List<zzn> zzab() {
                return Collections.unmodifiableList(((zzj) this.f350893c).zzaq());
            }

            public final boolean zzac() {
                return ((zzj) this.f350893c).zzas();
            }

            public final boolean zzad() {
                return ((zzj) this.f350893c).zzat();
            }

            public final int zzb() {
                return ((zzj) this.f350893c).zzb();
            }

            public final int zzc() {
                return ((zzj) this.f350893c).zzd();
            }

            public final int zzd() {
                return ((zzj) this.f350893c).zzh();
            }

            public final long zze() {
                return ((zzj) this.f350893c).zzl();
            }

            public final long zzf() {
                return ((zzj) this.f350893c).zzp();
            }

            public final zza zzg() {
                e();
                zzj.p0((zzj) this.f350893c);
                return this;
            }

            public final zza zzh() {
                e();
                zzj.v0((zzj) this.f350893c);
                return this;
            }

            public final zza zzi() {
                e();
                zzj.f0((zzj) this.f350893c);
                return this;
            }

            public final zza zzj() {
                e();
                zzj.y((zzj) this.f350893c);
                return this;
            }

            public final zza zzk() {
                e();
                zzj.M((zzj) this.f350893c);
                return this;
            }

            public final zza zzl() {
                e();
                zzj.s0((zzj) this.f350893c);
                return this;
            }

            public final zza zzm() {
                e();
                zzj.m0((zzj) this.f350893c);
                return this;
            }

            public final zza zzn() {
                e();
                zzj.b0((zzj) this.f350893c);
                return this;
            }

            public final zza zzo() {
                e();
                zzj.X((zzj) this.f350893c);
                return this;
            }

            public final zza zzp() {
                e();
                zzj.S((zzj) this.f350893c);
                return this;
            }

            public final zza zzq() {
                e();
                zzj.j0((zzj) this.f350893c);
                return this;
            }

            public final zza zzr() {
                e();
                zzj.E((zzj) this.f350893c);
                return this;
            }

            public final zza zzs() {
                e();
                zzj.x((zzj) this.f350893c);
                return this;
            }

            public final String zzt() {
                return ((zzj) this.f350893c).zzx();
            }

            public final String zzu() {
                return ((zzj) this.f350893c).zzy();
            }

            public final String zzv() {
                return ((zzj) this.f350893c).zzab();
            }

            public final String zzw() {
                return ((zzj) this.f350893c).zzad();
            }

            public final String zzx() {
                return ((zzj) this.f350893c).zzah();
            }

            public final String zzy() {
                return ((zzj) this.f350893c).zzaj();
            }

            public final String zzz() {
                return ((zzj) this.f350893c).zzal();
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zze zza(int i12) {
                return ((zzj) this.f350893c).zza(i12);
            }

            public final zza zzb(Iterable<? extends zze> iterable) {
                e();
                zzj.H((zzj) this.f350893c, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                e();
                zzj.v((zzj) this.f350893c, iterable);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                e();
                zzj.A((zzj) this.f350893c, iterable);
                return this;
            }

            public final zza zze(Iterable<? extends zzn> iterable) {
                e();
                zzj.P((zzj) this.f350893c, iterable);
                return this;
            }

            public final zza zzf(int i12) {
                e();
                zzj.c0((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zza(Iterable<? extends zzc> iterable) {
                e();
                zzj.V((zzj) this.f350893c, iterable);
                return this;
            }

            public final zza zzg(String str) {
                e();
                zzj.I((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzh(String str) {
                e();
                zzj.e0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzi(String str) {
                e();
                zzj.o0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzj(String str) {
                e();
                zzj zzjVar = (zzj) this.f350893c;
                int i12 = zzj.f350752b;
                zzjVar.getClass();
                throw null;
            }

            public final zza zzk(String str) {
                e();
                zzj.W((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzl(String str) {
                e();
                zzj.C0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzm(String str) {
                e();
                zzj.B0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzn(String str) {
                e();
                zzj.A0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzo(String str) {
                e();
                zzj.l0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzp(String str) {
                e();
                zzj.i0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzq(String str) {
                e();
                zzj.y0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzr(String str) {
                e();
                zzj.Q((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzs(String str) {
                e();
                zzj.r0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzb(int i12) {
                e();
                zzj.N((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zzc(int i12) {
                e();
                zzj.T((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zzd(int i12) {
                e();
                zzj.F((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zze(String str) {
                e();
                zzj.x0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzf(String str) {
                e();
                zzj.a0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zza(zze.zza zzaVar) {
                e();
                zzj.s((zzj) this.f350893c, (zze) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zzg(long j12) {
                e();
                zzj.k0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzh(long j12) {
                e();
                zzj.h0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzi(long j12) {
                e();
                zzj.Z((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzk(long j12) {
                e();
                zzj.U((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzl(long j12) {
                e();
                zzj.q0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzb(String str) {
                e();
                zzj.w0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzc(String str) {
                e();
                zzj.z0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zzd(String str) {
                e();
                zzj.u0((zzj) this.f350893c, str);
                return this;
            }

            public final zza zze(int i12) {
                e();
                zzj.g0((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zzf(long j12) {
                e();
                zzj.n0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zza(zzn.zza zzaVar) {
                e();
                zzj.u((zzj) this.f350893c, (zzn) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zzg(int i12) {
                e();
                zzj.D((zzj) this.f350893c);
                return this;
            }

            public final zza zzh(int i12) {
                e();
                zzj.n((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zzi(int i12) {
                e();
                zzj.Y((zzj) this.f350893c, i12);
                return this;
            }

            public final zza zzj(long j12) {
                e();
                zzj.O((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzb(long j12) {
                e();
                zzj.q((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzc(long j12) {
                e();
                zzj.t0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zzd(long j12) {
                e();
                zzj.z((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zze(long j12) {
                e();
                zzj.d0((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zza(zzn zznVar) {
                e();
                zzj.u((zzj) this.f350893c, zznVar);
                return this;
            }

            public final zzn zzj(int i12) {
                return ((zzj) this.f350893c).zzb(i12);
            }

            public final zza zzb(boolean z12) {
                e();
                zzj.C((zzj) this.f350893c, z12);
                return this;
            }

            public final zza zzc(boolean z12) {
                e();
                zzj.J((zzj) this.f350893c, z12);
                return this;
            }

            public final zza zzd(boolean z12) {
                e();
                zzj.R((zzj) this.f350893c, z12);
                return this;
            }

            public final zza zza(String str) {
                e();
                zzj.B((zzj) this.f350893c, str);
                return this;
            }

            public final zza zza(zzb zzbVar) {
                e();
                zzj.r((zzj) this.f350893c, zzbVar);
                return this;
            }

            public final zza zza(long j12) {
                e();
                zzj.G((zzj) this.f350893c, j12);
                return this;
            }

            public final zza zza(boolean z12) {
                e();
                zzj.w((zzj) this.f350893c, z12);
                return this;
            }

            public final zza zza(int i12, zze.zza zzaVar) {
                e();
                zzj.o((zzj) this.f350893c, i12, (zze) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zza zza(int i12, zze zzeVar) {
                e();
                zzj.o((zzj) this.f350893c, i12, zzeVar);
                return this;
            }

            public final zza zza(zzk.zzb zzbVar) {
                e();
                zzj.t((zzj) this.f350893c, (zzk) ((zzjf) zzbVar.zzah()));
                return this;
            }

            public final zza zza(int i12, zzn zznVar) {
                e();
                zzj.p((zzj) this.f350893c, i12, zznVar);
                return this;
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzjf.i(zzj.class, zzjVar);
        }

        public static void A(zzj zzjVar, Iterable iterable) {
            zzjn<String> zzjnVar = zzjVar.zzbe;
            if (!zzjnVar.zzc()) {
                zzjVar.zzbe = zzjf.f(zzjnVar);
            }
            zzhl.b(iterable, zzjVar.zzbe);
        }

        public static void A0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 2097152;
            zzjVar.zzad = str;
        }

        public static void B(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= 4;
            zzjVar.zzar = str;
        }

        public static void B0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 4194304;
            zzjVar.zzae = str;
        }

        public static void C(zzj zzjVar, boolean z12) {
            zzjVar.zzf |= 262144;
            zzjVar.zzbj = z12;
        }

        public static void C0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            zzjVar.zzah = str;
        }

        public static void D(zzj zzjVar) {
            zzjVar.zze |= 1;
            zzjVar.zzg = 1;
        }

        public static void E(zzj zzjVar) {
            zzjVar.zzf &= -8193;
            zzjVar.zzbd = zzc.zzbd;
        }

        public static void F(zzj zzjVar, int i12) {
            zzjVar.zzf |= 1048576;
            zzjVar.zzbl = i12;
        }

        public static void G(zzj zzjVar, long j12) {
            zzjVar.zzf |= 32;
            zzjVar.zzav = j12;
        }

        public static void H(zzj zzjVar, Iterable iterable) {
            zzjVar.K();
            zzhl.b(iterable, zzjVar.zzh);
        }

        public static void I(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= 128;
            zzjVar.zzax = str;
        }

        public static void J(zzj zzjVar, boolean z12) {
            zzjVar.zze |= 131072;
            zzjVar.zzz = z12;
        }

        public static void M(zzj zzjVar) {
            zzjVar.getClass();
            zzjVar.zzh = zzli.zzd();
        }

        public static void N(zzj zzjVar, int i12) {
            zzjVar.K();
            zzjVar.zzh.remove(i12);
        }

        public static void O(zzj zzjVar, long j12) {
            zzjVar.zzf |= 32768;
            zzjVar.zzbg = j12;
        }

        public static void P(zzj zzjVar, Iterable iterable) {
            zzjVar.L();
            zzhl.b(iterable, zzjVar.zzi);
        }

        public static void Q(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= 8192;
            zzjVar.zzbd = str;
        }

        public static void R(zzj zzjVar, boolean z12) {
            zzjVar.zze |= 8388608;
            zzjVar.zzaf = z12;
        }

        public static void S(zzj zzjVar) {
            zzjVar.zze &= -17;
            zzjVar.zzm = 0L;
        }

        public static void T(zzj zzjVar, int i12) {
            zzjVar.L();
            zzjVar.zzi.remove(i12);
        }

        public static void U(zzj zzjVar, long j12) {
            zzjVar.zze |= 2;
            zzjVar.zzj = j12;
        }

        public static void V(zzj zzjVar, Iterable iterable) {
            zzjn<zzc> zzjnVar = zzjVar.zzag;
            if (!zzjnVar.zzc()) {
                zzjVar.zzag = zzjf.f(zzjnVar);
            }
            zzhl.b(iterable, zzjVar.zzag);
        }

        public static void W(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
            zzjVar.zzbf = str;
        }

        public static void X(zzj zzjVar) {
            zzjVar.zze &= -33;
            zzjVar.zzn = 0L;
        }

        public static void Y(zzj zzjVar, int i12) {
            zzjVar.zze |= 1024;
            zzjVar.zzs = i12;
        }

        public static void Z(zzj zzjVar, long j12) {
            zzjVar.zze |= 4;
            zzjVar.zzk = j12;
        }

        public static void a0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= 131072;
            zzjVar.zzbi = str;
        }

        public static void b0(zzj zzjVar) {
            zzjVar.zze &= -129;
            zzjVar.zzp = zzc.zzp;
        }

        public static void c0(zzj zzjVar, int i12) {
            zzjVar.zze |= 1048576;
            zzjVar.zzac = i12;
        }

        public static void d0(zzj zzjVar, long j12) {
            zzjVar.zze |= 8;
            zzjVar.zzl = j12;
        }

        public static void e0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zzf |= 524288;
            zzjVar.zzbk = str;
        }

        public static void f0(zzj zzjVar) {
            zzjVar.zze &= -257;
            zzjVar.zzq = zzc.zzq;
        }

        public static void g0(zzj zzjVar, int i12) {
            zzjVar.zze |= 33554432;
            zzjVar.zzai = i12;
        }

        public static void h0(zzj zzjVar, long j12) {
            zzjVar.zze |= 16;
            zzjVar.zzm = j12;
        }

        public static void i0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 64;
            zzjVar.zzo = str;
        }

        public static void j0(zzj zzjVar) {
            zzjVar.zze &= -65537;
            zzjVar.zzy = zzc.zzy;
        }

        public static void k0(zzj zzjVar, long j12) {
            zzjVar.zze |= 32;
            zzjVar.zzn = j12;
        }

        public static void l0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 128;
            zzjVar.zzp = str;
        }

        public static void m0(zzj zzjVar) {
            zzjVar.zze &= -131073;
            zzjVar.zzz = false;
        }

        public static void n(zzj zzjVar, int i12) {
            zzjVar.zzf |= 2;
            zzjVar.zzaq = i12;
        }

        public static void n0(zzj zzjVar, long j12) {
            zzjVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
            zzjVar.zzw = j12;
        }

        public static void o(zzj zzjVar, int i12, zze zzeVar) {
            zzjVar.getClass();
            zzeVar.getClass();
            zzjVar.K();
            zzjVar.zzh.set(i12, zzeVar);
        }

        public static void o0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 256;
            zzjVar.zzq = str;
        }

        public static void p(zzj zzjVar, int i12, zzn zznVar) {
            zzjVar.getClass();
            zznVar.getClass();
            zzjVar.L();
            zzjVar.zzi.set(i12, zznVar);
        }

        public static void p0(zzj zzjVar) {
            zzjVar.zze &= -262145;
            zzjVar.zzaa = zzc.zzaa;
        }

        public static void q(zzj zzjVar, long j12) {
            zzjVar.zze |= 536870912;
            zzjVar.zzam = j12;
        }

        public static void q0(zzj zzjVar, long j12) {
            zzjVar.zze |= 32768;
            zzjVar.zzx = j12;
        }

        public static void r(zzj zzjVar, zzb zzbVar) {
            zzjVar.getClass();
            zzbVar.getClass();
            zzjVar.zzbn = zzbVar;
            zzjVar.zzf |= 4194304;
        }

        public static void r0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 512;
            zzjVar.zzr = str;
        }

        public static void s(zzj zzjVar, zze zzeVar) {
            zzjVar.getClass();
            zzeVar.getClass();
            zzjVar.K();
            zzjVar.zzh.add(zzeVar);
        }

        public static void s0(zzj zzjVar) {
            zzjVar.zze &= -2097153;
            zzjVar.zzad = zzc.zzad;
        }

        public static void t(zzj zzjVar, zzk zzkVar) {
            zzjVar.getClass();
            zzkVar.getClass();
            zzjVar.zzas = zzkVar;
            zzjVar.zzf |= 8;
        }

        public static void t0(zzj zzjVar, long j12) {
            zzjVar.zze |= 524288;
            zzjVar.zzab = j12;
        }

        public static void u(zzj zzjVar, zzn zznVar) {
            zzjVar.getClass();
            zznVar.getClass();
            zzjVar.L();
            zzjVar.zzi.add(zznVar);
        }

        public static void u0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 2048;
            zzjVar.zzt = str;
        }

        public static void v(zzj zzjVar, Iterable iterable) {
            zzjl zzjlVar = zzjVar.zzat;
            if (!zzjlVar.zzc()) {
                int size = zzjlVar.size();
                zzjVar.zzat = zzjlVar.zza(size == 0 ? 10 : size << 1);
            }
            zzhl.b(iterable, zzjVar.zzat);
        }

        public static void v0(zzj zzjVar) {
            zzjVar.getClass();
            zzjVar.zzag = zzli.zzd();
        }

        public static void w(zzj zzjVar, boolean z12) {
            zzjVar.zzf |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
            zzjVar.zzbh = z12;
        }

        public static void w0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 4096;
            zzjVar.zzu = str;
        }

        public static void x(zzj zzjVar) {
            zzjVar.zze &= -268435457;
            zzjVar.zzal = zzc.zzal;
        }

        public static void x0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 8192;
            zzjVar.zzv = str;
        }

        public static void y(zzj zzjVar) {
            zzjVar.zze &= Integer.MAX_VALUE;
            zzjVar.zzao = zzc.zzao;
        }

        public static void y0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
            zzjVar.zzy = str;
        }

        public static void z(zzj zzjVar, long j12) {
            zzjVar.zzf |= 16;
            zzjVar.zzau = j12;
        }

        public static void z0(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 262144;
            zzjVar.zzaa = str;
        }

        public static zza zzu() {
            return zzc.k();
        }

        public final void K() {
            zzjn<zze> zzjnVar = this.zzh;
            if (zzjnVar.zzc()) {
                return;
            }
            this.zzh = zzjf.f(zzjnVar);
        }

        public final void L() {
            zzjn<zzn> zzjnVar = this.zzi;
            if (zzjnVar.zzc()) {
                return;
            }
            this.zzi = zzjf.f(zzjnVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001<\u0000\u0002\u0001L<\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6", new Object[]{"zze", "zzf", "zzg", "zzh", zze.class, "zzi", zzn.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzc.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzfk.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzj> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzj.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzbl;
        }

        public final String zzaa() {
            return this.zzv;
        }

        public final String zzab() {
            return this.zzbi;
        }

        public final String zzac() {
            return this.zzax;
        }

        public final String zzad() {
            return this.zzbk;
        }

        public final String zzae() {
            return this.zzq;
        }

        public final String zzaf() {
            return this.zzao;
        }

        public final String zzag() {
            return this.zzah;
        }

        public final String zzah() {
            return this.zzae;
        }

        public final String zzai() {
            return this.zzad;
        }

        public final String zzaj() {
            return this.zzp;
        }

        public final String zzak() {
            return this.zzo;
        }

        public final String zzal() {
            return this.zzy;
        }

        public final String zzam() {
            return this.zzbd;
        }

        public final String zzan() {
            return this.zzr;
        }

        public final List<zzc> zzao() {
            return this.zzag;
        }

        public final List<zze> zzap() {
            return this.zzh;
        }

        public final List<zzn> zzaq() {
            return this.zzi;
        }

        public final boolean zzar() {
            return this.zzbh;
        }

        public final boolean zzas() {
            return this.zzbj;
        }

        public final boolean zzat() {
            return this.zzz;
        }

        public final boolean zzau() {
            return this.zzaf;
        }

        public final boolean zzav() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzaw() {
            return (this.zzf & 4194304) != 0;
        }

        public final boolean zzax() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzay() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzaz() {
            return (this.zzf & 131072) != 0;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final boolean zzba() {
            return (this.zzf & 128) != 0;
        }

        public final boolean zzbb() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbc() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbd() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbe() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbf() {
            return (this.zze & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        }

        public final boolean zzbg() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbh() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbl() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbn() {
            return (this.zzf & 8192) != 0;
        }

        public final boolean zzbo() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzbp() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbq() {
            return (this.zze & 1024) != 0;
        }

        public final boolean zzbr() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzbs() {
            return (this.zze & 32768) != 0;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final int zzd() {
            return this.zzh.size();
        }

        public final int zze() {
            return this.zzg;
        }

        public final int zzf() {
            return this.zzaq;
        }

        public final int zzg() {
            return this.zzs;
        }

        public final int zzh() {
            return this.zzi.size();
        }

        public final long zzi() {
            return this.zzam;
        }

        public final long zzj() {
            return this.zzab;
        }

        public final long zzk() {
            return this.zzau;
        }

        public final long zzl() {
            return this.zzl;
        }

        public final long zzm() {
            return this.zzw;
        }

        public final long zzn() {
            return this.zzn;
        }

        public final long zzo() {
            return this.zzm;
        }

        public final long zzp() {
            return this.zzk;
        }

        public final long zzq() {
            return this.zzbg;
        }

        public final long zzr() {
            return this.zzj;
        }

        public final long zzs() {
            return this.zzx;
        }

        public final zzb zzt() {
            zzb zzbVar = this.zzbn;
            return zzbVar == null ? zzb.zzc() : zzbVar;
        }

        public final String zzw() {
            return this.zzar;
        }

        public final String zzx() {
            return this.zzu;
        }

        public final String zzy() {
            return this.zzaa;
        }

        public final String zzz() {
            return this.zzt;
        }

        public final zze zza(int i12) {
            return this.zzh.get(i12);
        }

        public final zzn zzb(int i12) {
            return this.zzi.get(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzk extends zzjf<zzk, zzb> implements zzkt {
        private static final zzk zzc;
        private static volatile zzle<zzk> zzd;
        private int zze;
        private int zzf = 1;
        private zzjn<zzf> zzg = zzli.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public enum zza implements zzjk {
            RADS(1),
            PROVISIONING(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f350756b;

            static {
                new zzfn();
            }

            zza(int i12) {
                this.f350756b = i12;
            }

            public static zzjm zzb() {
                return zzfm.f350766a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350756b + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final int zza() {
                return this.f350756b;
            }

            public static zza zza(int i12) {
                if (i12 == 1) {
                    return RADS;
                }
                if (i12 != 2) {
                    return null;
                }
                return PROVISIONING;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zzb extends zzjf.zzb<zzk, zzb> implements zzkt {
            public zzb() {
                super(zzk.zzc);
            }

            public final zzb zza(zzf.zza zzaVar) {
                e();
                zzk.n((zzk) this.f350893c, (zzf) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public /* synthetic */ zzb(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzjf.i(zzk.class, zzkVar);
        }

        public static void n(zzk zzkVar, zzf zzfVar) {
            zzkVar.getClass();
            zzfVar.getClass();
            zzjn<zzf> zzjnVar = zzkVar.zzg;
            if (!zzjnVar.zzc()) {
                zzkVar.zzg = zzjf.f(zzjnVar);
            }
            zzkVar.zzg.add(zzfVar);
        }

        public static zzb zza() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zzb(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzf.class});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzk> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzk.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzl extends zzjf<zzl, zza> implements zzkt {
        private static final zzl zzc;
        private static volatile zzle<zzl> zzd;
        private zzjo zze = zzkg.zzd();
        private zzjo zzf = zzkg.zzd();
        private zzjn<zzd> zzg = zzli.zzd();
        private zzjn<zzm> zzh = zzli.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzl, zza> implements zzkt {
            public zza() {
                super(zzl.zzc);
            }

            public final zza zza(Iterable<? extends zzd> iterable) {
                e();
                zzl.s((zzl) this.f350893c, iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                e();
                zzl.p((zzl) this.f350893c, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends zzm> iterable) {
                e();
                zzl.u((zzl) this.f350893c, iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                e();
                zzl.n((zzl) this.f350893c, iterable);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza() {
                e();
                zzl.r((zzl) this.f350893c);
                return this;
            }

            public final zza zzb() {
                e();
                zzl.q((zzl) this.f350893c);
                return this;
            }

            public final zza zzc() {
                e();
                zzl.t((zzl) this.f350893c);
                return this;
            }

            public final zza zzd() {
                e();
                zzl.o((zzl) this.f350893c);
                return this;
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzjf.i(zzl.class, zzlVar);
        }

        public static void n(zzl zzlVar, Iterable iterable) {
            zzjo zzjoVar = zzlVar.zze;
            if (!zzjoVar.zzc()) {
                int size = zzjoVar.size();
                zzlVar.zze = zzjoVar.zza(size == 0 ? 10 : size << 1);
            }
            zzhl.b(iterable, zzlVar.zze);
        }

        public static void o(zzl zzlVar) {
            zzlVar.getClass();
            zzlVar.zze = zzkg.zzd();
        }

        public static void p(zzl zzlVar, Iterable iterable) {
            zzjo zzjoVar = zzlVar.zzf;
            if (!zzjoVar.zzc()) {
                int size = zzjoVar.size();
                zzlVar.zzf = zzjoVar.zza(size == 0 ? 10 : size << 1);
            }
            zzhl.b(iterable, zzlVar.zzf);
        }

        public static void q(zzl zzlVar) {
            zzlVar.getClass();
            zzlVar.zzf = zzkg.zzd();
        }

        public static void r(zzl zzlVar) {
            zzlVar.getClass();
            zzlVar.zzg = zzli.zzd();
        }

        public static void s(zzl zzlVar, Iterable iterable) {
            zzjn<zzd> zzjnVar = zzlVar.zzg;
            if (!zzjnVar.zzc()) {
                zzlVar.zzg = zzjf.f(zzjnVar);
            }
            zzhl.b(iterable, zzlVar.zzg);
        }

        public static void t(zzl zzlVar) {
            zzlVar.getClass();
            zzlVar.zzh = zzli.zzd();
        }

        public static void u(zzl zzlVar, Iterable iterable) {
            zzjn<zzm> zzjnVar = zzlVar.zzh;
            if (!zzjnVar.zzc()) {
                zzlVar.zzh = zzjf.f(zzjnVar);
            }
            zzhl.b(iterable, zzlVar.zzh);
        }

        public static zza zze() {
            return zzc.k();
        }

        public static zzl zzg() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class, "zzh", zzm.class});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzl> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzl.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zzd> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzm> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzm extends zzjf<zzm, zza> implements zzkt {
        private static final zzm zzc;
        private static volatile zzle<zzm> zzd;
        private int zze;
        private int zzf;
        private zzjo zzg = zzkg.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzm, zza> implements zzkt {
            public zza() {
                super(zzm.zzc);
            }

            public final zza zza(Iterable<? extends Long> iterable) {
                e();
                zzm.o((zzm) this.f350893c, iterable);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(int i12) {
                e();
                zzm.n((zzm) this.f350893c, i12);
                return this;
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzjf.i(zzm.class, zzmVar);
        }

        public static void n(zzm zzmVar, int i12) {
            zzmVar.zze |= 1;
            zzmVar.zzf = i12;
        }

        public static void o(zzm zzmVar, Iterable iterable) {
            zzjo zzjoVar = zzmVar.zzg;
            if (!zzjoVar.zzc()) {
                int size = zzjoVar.size();
                zzmVar.zzg = zzjoVar.zza(size == 0 ? 10 : size << 1);
            }
            zzhl.b(iterable, zzmVar.zzg);
        }

        public static zza zzc() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzm> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzm.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        public final long zza(int i12) {
            return this.zzg.zzb(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzn extends zzjf<zzn, zza> implements zzkt {
        private static final zzn zzc;
        private static volatile zzle<zzn> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzn, zza> implements zzkt {
            public zza() {
                super(zzn.zzc);
            }

            public final zza zza() {
                e();
                zzn.u((zzn) this.f350893c);
                return this;
            }

            public final zza zzb() {
                e();
                zzn.r((zzn) this.f350893c);
                return this;
            }

            public final zza zzc() {
                e();
                zzn.q((zzn) this.f350893c);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }

            public final zza zza(double d12) {
                e();
                zzn.n((zzn) this.f350893c, d12);
                return this;
            }

            public final zza zzb(long j12) {
                e();
                zzn.o((zzn) this.f350893c, j12);
                return this;
            }

            public final zza zza(long j12) {
                e();
                zzn.s((zzn) this.f350893c, j12);
                return this;
            }

            public final zza zzb(String str) {
                e();
                zzn.t((zzn) this.f350893c, str);
                return this;
            }

            public final zza zza(String str) {
                e();
                zzn.p((zzn) this.f350893c, str);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzjf.i(zzn.class, zznVar);
        }

        public static void n(zzn zznVar, double d12) {
            zznVar.zze |= 32;
            zznVar.zzk = d12;
        }

        public static void o(zzn zznVar, long j12) {
            zznVar.zze |= 1;
            zznVar.zzf = j12;
        }

        public static void p(zzn zznVar, String str) {
            zznVar.getClass();
            str.getClass();
            zznVar.zze |= 2;
            zznVar.zzg = str;
        }

        public static void q(zzn zznVar) {
            zznVar.zze &= -5;
            zznVar.zzh = zzc.zzh;
        }

        public static void r(zzn zznVar) {
            zznVar.zze &= -9;
            zznVar.zzi = 0L;
        }

        public static void s(zzn zznVar, long j12) {
            zznVar.zze |= 8;
            zznVar.zzi = j12;
        }

        public static void t(zzn zznVar, String str) {
            zznVar.getClass();
            str.getClass();
            zznVar.zze |= 4;
            zznVar.zzh = str;
        }

        public static void u(zzn zznVar) {
            zznVar.zze &= -33;
            zznVar.zzk = 0.0d;
        }

        public static zza zze() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfh zzfhVar = null;
            switch (zzfh.f350751a[i12 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(zzfhVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzle<zzn> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzn.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjf.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final double zza() {
            return this.zzk;
        }

        public final float zzb() {
            return this.zzj;
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }
    }
}
