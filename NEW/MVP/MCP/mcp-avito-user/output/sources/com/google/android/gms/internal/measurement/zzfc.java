package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzjf;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzfc {

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zza extends zzjf<zza, C10627zza> implements zzkt {
        private static final zza zzc;
        private static volatile zzle<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzjn<zzb> zzf = zzli.zzd();
        private zzjn<zzc> zzg = zzli.zzd();
        private zzjn<zzf> zzh = zzli.zzd();
        private zzjn<zzb> zzj = zzli.zzd();

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zza, reason: collision with other inner class name */
        public static final class C10627zza extends zzjf.zzb<zza, C10627zza> implements zzkt {
            public C10627zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C10627zza(zzfb zzfbVar) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zzb extends zzjf<zzb, C10628zza> implements zzkt {
            private static final zzb zzc;
            private static volatile zzle<zzb> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzb$zza, reason: collision with other inner class name */
            public static final class C10628zza extends zzjf.zzb<zzb, C10628zza> implements zzkt {
                public C10628zza() {
                    super(zzb.zzc);
                }

                public /* synthetic */ C10628zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzc = zzbVar;
                zzjf.i(zzb.class, zzbVar);
            }

            @Override // com.google.android.gms.internal.measurement.zzjf
            public final Object g(int i12) {
                zzfb zzfbVar = null;
                switch (zzfb.f350743a[i12 - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C10628zza(zzfbVar);
                    case 3:
                        return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
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

            public final zzd zzb() {
                zzd zzdVarZza = zzd.zza(this.zzg);
                return zzdVarZza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zzdVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zzc extends zzjf<zzc, C10629zza> implements zzkt {
            private static final zzc zzc;
            private static volatile zzle<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzc$zza, reason: collision with other inner class name */
            public static final class C10629zza extends zzjf.zzb<zzc, C10629zza> implements zzkt {
                public C10629zza() {
                    super(zzc.zzc);
                }

                public /* synthetic */ C10629zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzc = zzcVar;
                zzjf.i(zzc.class, zzcVar);
            }

            @Override // com.google.android.gms.internal.measurement.zzjf
            public final Object g(int i12) {
                zzfb zzfbVar = null;
                switch (zzfb.f350743a[i12 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C10629zza(zzfbVar);
                    case 3:
                        return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
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

            public final zze zzb() {
                zze zzeVarZza = zze.zza(this.zzg);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public enum zzd implements zzjk {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f350746b;

            static {
                new zzfd();
            }

            zzd(int i12) {
                this.f350746b = i12;
            }

            public static zzjm zzb() {
                return zzfe.f350749a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350746b + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final int zza() {
                return this.f350746b;
            }

            public static zzd zza(int i12) {
                if (i12 == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i12 == 1) {
                    return GRANTED;
                }
                if (i12 != 2) {
                    return null;
                }
                return DENIED;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public enum zze implements zzjk {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);


            /* renamed from: b, reason: collision with root package name */
            public final int f350748b;

            static {
                new zzfg();
            }

            zze(int i12) {
                this.f350748b = i12;
            }

            public static zzjm zzb() {
                return zzff.f350750a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350748b + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final int zza() {
                return this.f350748b;
            }

            public static zze zza(int i12) {
                if (i12 == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i12 == 1) {
                    return AD_STORAGE;
                }
                if (i12 == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i12 == 3) {
                    return AD_USER_DATA;
                }
                if (i12 != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zzf extends zzjf<zzf, C10630zza> implements zzkt {
            private static final zzf zzc;
            private static volatile zzle<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzf$zza, reason: collision with other inner class name */
            public static final class C10630zza extends zzjf.zzb<zzf, C10630zza> implements zzkt {
                public C10630zza() {
                    super(zzf.zzc);
                }

                public /* synthetic */ C10630zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzjf.i(zzf.class, zzfVar);
            }

            @Override // com.google.android.gms.internal.measurement.zzjf
            public final Object g(int i12) {
                zzfb zzfbVar = null;
                switch (zzfb.f350743a[i12 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C10630zza(zzfbVar);
                    case 3:
                        return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

            public final String zzb() {
                return this.zzf;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjf.i(zza.class, zzaVar);
        }

        public static zza zzb() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10627zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", zzb.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", zzb.class});
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

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<zzb> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzb extends zzjf<zzb, zza> implements zzkt {
        private static final zzb zzc;
        private static volatile zzle<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjn<zzf> zzg = zzli.zzd();
        private boolean zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzb, zza> implements zzkt {
            public zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjf.i(zzb.class, zzbVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzf.class, "zzh"});
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

        public final String zzb() {
            return this.zzf;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzc extends zzjf<zzc, zza> implements zzkt {
        private static final zzc zzc;
        private static volatile zzle<zzc> zzd;
        private int zze;
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzc, zza> implements zzkt {
            public zza() {
                super(zzc.zzc);
            }

            public final int zza() {
                return ((zzc) this.f350893c).zza();
            }

            public final String zzb() {
                return ((zzc) this.f350893c).zzc();
            }

            public final boolean zzc() {
                return ((zzc) this.f350893c).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.f350893c).zze();
            }

            public final boolean zze() {
                return ((zzc) this.f350893c).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.f350893c).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.f350893c).zzh();
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }

            public final zza zza(String str) {
                e();
                zzc.n((zzc) this.f350893c, str);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjf.i(zzc.class, zzcVar);
        }

        public static void n(zzc zzcVar, String str) {
            zzcVar.getClass();
            str.getClass();
            zzcVar.zze |= 1;
            zzcVar.zzf = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
            return this.zzi;
        }

        public final String zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzd extends zzjf<zzd, zza> implements zzkt {
        private static final zzd zzc;
        private static volatile zzle<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzr;
        private zze zzs;
        private zzh zzt;
        private String zzg = "";
        private zzjn<zzg> zzi = zzli.zzd();
        private zzjn<zzc> zzj = zzli.zzd();
        private zzjn<zzew.zza> zzk = zzli.zzd();
        private String zzl = "";
        private zzjn<zzfp.zzc> zzn = zzli.zzd();
        private zzjn<zzb> zzo = zzli.zzd();
        private String zzp = "";
        private String zzq = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzd, zza> implements zzkt {
            public zza() {
                super(zzd.zzc);
            }

            public final int zza() {
                return ((zzd) this.f350893c).zzb();
            }

            public final zza zzb() {
                e();
                zzd.n((zzd) this.f350893c);
                return this;
            }

            public final String zzc() {
                return ((zzd) this.f350893c).zzj();
            }

            public final List<zzew.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.f350893c).zzk());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.f350893c).zzl());
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }

            public final zzc zza(int i12) {
                return ((zzd) this.f350893c).zza(i12);
            }

            public final zza zza(int i12, zzc.zza zzaVar) {
                e();
                zzd.o((zzd) this.f350893c, i12, (zzc) ((zzjf) zzaVar.zzah()));
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjf.i(zzd.class, zzdVar);
        }

        public static void n(zzd zzdVar) {
            zzdVar.getClass();
            zzdVar.zzk = zzli.zzd();
        }

        public static void o(zzd zzdVar, int i12, zzc zzcVar) {
            zzdVar.getClass();
            zzcVar.getClass();
            zzjn<zzc> zzjnVar = zzdVar.zzj;
            if (!zzjnVar.zzc()) {
                zzdVar.zzj = zzjf.f(zzjnVar);
            }
            zzdVar.zzj.set(i12, zzcVar);
        }

        public static zza zze() {
            return zzc.k();
        }

        public static zzd zzg() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzg.class, "zzj", zzc.class, "zzk", zzew.zza.class, "zzl", "zzm", "zzn", zzfp.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt"});
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
            return this.zzn.size();
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzr;
            return zzaVar == null ? zza.zzb() : zzaVar;
        }

        public final zzh zzh() {
            zzh zzhVar = this.zzt;
            return zzhVar == null ? zzh.zzb() : zzhVar;
        }

        public final String zzi() {
            return this.zzg;
        }

        public final String zzj() {
            return this.zzp;
        }

        public final List<zzew.zza> zzk() {
            return this.zzk;
        }

        public final List<zzb> zzl() {
            return this.zzo;
        }

        public final List<zzfp.zzc> zzm() {
            return this.zzn;
        }

        public final List<zzg> zzn() {
            return this.zzi;
        }

        public final boolean zzo() {
            return this.zzm;
        }

        public final boolean zzp() {
            return (this.zze & 128) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 512) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 1) != 0;
        }

        public final zzc zza(int i12) {
            return this.zzj.get(i12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zze extends zzjf<zze, zza> implements zzkt {
        private static final zze zzc;
        private static volatile zzle<zze> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zze, zza> implements zzkt {
            public zza() {
                super(zze.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjf.i(zze.class, zzeVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
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
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzf extends zzjf<zzf, zza> implements zzkt {
        private static final zzf zzc;
        private static volatile zzle<zzf> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzf, zza> implements zzkt {
            public zza() {
                super(zzf.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjf.i(zzf.class, zzfVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzg, zza> implements zzkt {
            public zza() {
                super(zzg.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjf.i(zzg.class, zzgVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    public static final class zzh extends zzjf<zzh, zza> implements zzkt {
        private static final zzh zzc;
        private static volatile zzle<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        public static final class zza extends zzjf.zzb<zzh, zza> implements zzkt {
            public zza() {
                super(zzh.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjf.i(zzh.class, zzhVar);
        }

        public static zzh zzb() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final Object g(int i12) {
            zzfb zzfbVar = null;
            switch (zzfb.f350743a[i12 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return new zzlh(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final String zzc() {
            return this.zzg;
        }

        public final String zzd() {
            return this.zzf;
        }
    }
}
