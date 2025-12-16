package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzew {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zza extends zzjf<zza, C10626zza> implements zzkt {
        private static final zza zzc;
        private static volatile zzle<zza> zzd;
        private int zze;
        private int zzf;
        private zzjn<zze> zzg = zzli.zzd();
        private zzjn<zzb> zzh = zzli.zzd();
        private boolean zzi;
        private boolean zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* renamed from: com.google.android.gms.internal.measurement.zzew$zza$zza, reason: collision with other inner class name */
        public static final class C10626zza extends zzjf.zzb<zza, C10626zza> implements zzkt {
            public C10626zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.f350893c).zzb();
            }

            public final int zzb() {
                return ((zza) this.f350893c).zzc();
            }

            public /* synthetic */ C10626zza(zzev zzevVar) {
                this();
            }

            public final C10626zza zza(int i12, zzb.zza zzaVar) {
                e();
                zza.n((zza) this.f350893c, i12, (zzb) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zze zzb(int i12) {
                return ((zza) this.f350893c).zzb(i12);
            }

            public final C10626zza zza(int i12, zze.zza zzaVar) {
                e();
                zza.o((zza) this.f350893c, i12, (zze) ((zzjf) zzaVar.zzah()));
                return this;
            }

            public final zzb zza(int i12) {
                return ((zza) this.f350893c).zza(i12);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjf.i(zza.class, zzaVar);
        }

        public static void n(zza zzaVar, int i12, zzb zzbVar) {
            zzaVar.getClass();
            zzbVar.getClass();
            zzjn<zzb> zzjnVar = zzaVar.zzh;
            if (!zzjnVar.zzc()) {
                zzaVar.zzh = zzjf.f(zzjnVar);
            }
            zzaVar.zzh.set(i12, zzbVar);
        }

        public static void o(zza zzaVar, int i12, zze zzeVar) {
            zzaVar.getClass();
            zzeVar.getClass();
            zzjn<zze> zzjnVar = zzaVar.zzg;
            if (!zzjnVar.zzc()) {
                zzaVar.zzg = zzjf.f(zzjnVar);
            }
            zzaVar.zzg.set(i12, zzeVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10626zza(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final zzb zza(int i12) {
            return this.zzh.get(i12);
        }

        public final zze zzb(int i12) {
            return this.zzg.get(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzb extends zzjf<zzb, zza> implements zzkt {
        private static final zzb zzc;
        private static volatile zzle<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjn<zzc> zzh = zzli.zzd();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzb, zza> implements zzkt {
            public zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.f350893c).zza();
            }

            public final String zzb() {
                return ((zzb) this.f350893c).zzf();
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }

            public final zza zza(String str) {
                e();
                zzb.o((zzb) this.f350893c, str);
                return this;
            }

            public final zza zza(int i12, zzc zzcVar) {
                e();
                zzb.n((zzb) this.f350893c, i12, zzcVar);
                return this;
            }

            public final zzc zza(int i12) {
                return ((zzb) this.f350893c).zza(i12);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjf.i(zzb.class, zzbVar);
        }

        public static void n(zzb zzbVar, int i12, zzc zzcVar) {
            zzbVar.getClass();
            zzcVar.getClass();
            zzjn<zzc> zzjnVar = zzbVar.zzh;
            if (!zzjnVar.zzc()) {
                zzbVar.zzh = zzjf.f(zzjnVar);
            }
            zzbVar.zzh.set(i12, zzcVar);
        }

        public static void o(zzb zzbVar, String str) {
            zzbVar.getClass();
            str.getClass();
            zzbVar.zze |= 2;
            zzbVar.zzg = str;
        }

        public static zza zzc() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 64) != 0;
        }

        public final zzc zza(int i12) {
            return this.zzh.get(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzc extends zzjf<zzc, zza> implements zzkt {
        private static final zzc zzc;
        private static volatile zzle<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzc, zza> implements zzkt {
            public zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                e();
                zzc.o((zzc) this.f350893c, str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjf.i(zzc.class, zzcVar);
        }

        public static void o(zzc zzcVar, String str) {
            zzcVar.getClass();
            str.getClass();
            zzcVar.zze |= 8;
            zzcVar.zzi = str;
        }

        public static zzc zzb() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            return zzfVar == null ? zzf.zzd() : zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzd extends zzjf<zzd, zza> implements zzkt {
        private static final zzd zzc;
        private static volatile zzle<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzd, zza> implements zzkt {
            public zza() {
                super(zzd.zzc);
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public enum zzb implements zzjk {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);


            /* renamed from: b, reason: collision with root package name */
            public final int f350734b;

            static {
                new zzex();
            }

            zzb(int i12) {
                this.f350734b = i12;
            }

            public static zzjm zzb() {
                return zzey.f350737a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350734b + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final int zza() {
                return this.f350734b;
            }

            public static zzb zza(int i12) {
                if (i12 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i12 == 1) {
                    return LESS_THAN;
                }
                if (i12 == 2) {
                    return GREATER_THAN;
                }
                if (i12 == 3) {
                    return EQUAL;
                }
                if (i12 != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjf.i(zzd.class, zzdVar);
        }

        public static zzd zzc() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
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

        public final zzb zza() {
            zzb zzbVarZza = zzb.zza(this.zzf);
            return zzbVarZza == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzbVarZza;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zze extends zzjf<zze, zza> implements zzkt {
        private static final zze zzc;
        private static volatile zzle<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zze, zza> implements zzkt {
            public zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                e();
                zze.n((zze) this.f350893c, str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjf.i(zze.class, zzeVar);
        }

        public static void n(zze zzeVar, String str) {
            zzeVar.getClass();
            str.getClass();
            zzeVar.zze |= 2;
            zzeVar.zzg = str;
        }

        public static zza zzc() {
            return zzc.k();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
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

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            return zzcVar == null ? zzc.zzb() : zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 32) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzf extends zzjf<zzf, zzb> implements zzkt {
        private static final zzf zzc;
        private static volatile zzle<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjn<String> zzi = zzli.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public enum zza implements zzjk {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);


            /* renamed from: b, reason: collision with root package name */
            public final int f350736b;

            static {
                new zzfa();
            }

            zza(int i12) {
                this.f350736b = i12;
            }

            public static zzjm zzb() {
                return zzez.f350738a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350736b + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final int zza() {
                return this.f350736b;
            }

            public static zza zza(int i12) {
                switch (i12) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zzb extends zzjf.zzb<zzf, zzb> implements zzkt {
            public zzb() {
                super(zzf.zzc);
            }

            public /* synthetic */ zzb(zzev zzevVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjf.i(zzf.class, zzfVar);
        }

        public static zzf zzd() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzev zzevVar = null;
            switch (zzev.f350732a[i12 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(zzevVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
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

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zzaVarZza = zza.zza(this.zzf);
            return zzaVarZza == null ? zza.UNKNOWN_MATCH_TYPE : zzaVarZza;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }
}
