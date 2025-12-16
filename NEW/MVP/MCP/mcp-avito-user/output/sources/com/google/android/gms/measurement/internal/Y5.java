package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzew;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
abstract class Y5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f354997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354998b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f354999c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f355000d;

    /* renamed from: e, reason: collision with root package name */
    public Long f355001e;

    /* renamed from: f, reason: collision with root package name */
    public Long f355002f;

    public Y5(String str, int i12) {
        this.f354997a = str;
        this.f354998b = i12;
    }

    public static Boolean b(long j12, zzew.zzd zzdVar) {
        try {
            return e(new BigDecimal(j12), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @j.k0
    public static Boolean c(Boolean bool, boolean z12) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z12);
    }

    @j.k0
    public static Boolean d(String str, zzew.zzf zzfVar, S1 s12) {
        List<String> listZzf;
        C36729v.j(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzew.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzew.zzf.zza zzaVarZzb = zzfVar.zzb();
        zzew.zzf.zza zzaVar = zzew.zzf.zza.IN_LIST;
        if (zzaVarZzb == zzaVar) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzew.zzf.zza zzaVarZzb2 = zzfVar.zzb();
        boolean zZzg = zzfVar.zzg();
        String strZze = (zZzg || zzaVarZzb2 == zzew.zzf.zza.REGEXP || zzaVarZzb2 == zzaVar) ? zzfVar.zze() : zzfVar.zze().toUpperCase(Locale.ENGLISH);
        if (zzfVar.zza() == 0) {
            listZzf = null;
        } else {
            listZzf = zzfVar.zzf();
            if (!zZzg) {
                ArrayList arrayList = new ArrayList(listZzf.size());
                Iterator<String> it = listZzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listZzf = Collections.unmodifiableList(arrayList);
            }
        }
        zzew.zzf.zza zzaVar2 = zzew.zzf.zza.REGEXP;
        String str2 = zzaVarZzb2 == zzaVar2 ? strZze : null;
        if (zzaVarZzb2 == zzew.zzf.zza.IN_LIST) {
            if (listZzf == null || listZzf.isEmpty()) {
                return null;
            }
        } else if (strZze == null) {
            return null;
        }
        if (!zZzg && zzaVarZzb2 != zzaVar2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (S5.f354907a[zzaVarZzb2.ordinal()]) {
            case 1:
                if (str2 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        s12.f354892i.c("Invalid regular expression in REGEXP audience filter. expression", str2);
                        return null;
                    }
                }
                break;
            case 6:
                if (listZzf != null) {
                    break;
                }
                break;
        }
        return null;
    }

    @j.k0
    public static Boolean e(BigDecimal bigDecimal, zzew.zzd zzdVar, double d12) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C36729v.j(zzdVar);
        if (zzdVar.zzh() && zzdVar.zza() != zzew.zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            zzew.zzd.zzb zzbVarZza = zzdVar.zza();
            zzew.zzd.zzb zzbVar = zzew.zzd.zzb.BETWEEN;
            if (zzbVarZza == zzbVar) {
                if (!zzdVar.zzl() || !zzdVar.zzk()) {
                    return null;
                }
            } else if (!zzdVar.zzi()) {
                return null;
            }
            zzew.zzd.zzb zzbVarZza2 = zzdVar.zza();
            if (zzdVar.zza() == zzbVar) {
                if (G5.R(zzdVar.zzf()) && G5.R(zzdVar.zze())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzdVar.zzf());
                        bigDecimal4 = new BigDecimal(zzdVar.zze());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!G5.R(zzdVar.zzd())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzdVar.zzd());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zzbVarZza2 == zzbVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i12 = S5.f354908b[zzbVarZza2.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d12 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d12).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d12).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean f();

    public abstract boolean g();
}
