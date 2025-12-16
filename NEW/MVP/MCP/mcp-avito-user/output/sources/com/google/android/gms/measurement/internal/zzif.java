package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzif {

    /* renamed from: c, reason: collision with root package name */
    public static final zzif f355542c = new zzif(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap<zza, Boolean> f355543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355544b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: b, reason: collision with root package name */
        public final String f355550b;

        zza(String str) {
            this.f355550b = str;
        }
    }

    public zzif(EnumMap<zza, Boolean> enumMap, int i12) {
        EnumMap<zza, Boolean> enumMap2 = new EnumMap<>(zza.class);
        this.f355543a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f355544b = i12;
    }

    public static zzif a(int i12, Bundle bundle) {
        if (bundle == null) {
            return new zzif(null, null, i12);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzie.STORAGE.f355541b) {
            enumMap.put((EnumMap) zzaVar, (zza) g(bundle.getString(zzaVar.f355550b)));
        }
        return new zzif(enumMap, i12);
    }

    public static zzif b(int i12, String str) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str != null) {
            zzie zzieVar = zzie.STORAGE;
            int i13 = 0;
            while (true) {
                zza[] zzaVarArr = zzieVar.f355541b;
                if (i13 >= zzaVarArr.length) {
                    break;
                }
                zza zzaVar = zzaVarArr[i13];
                int i14 = i13 + 2;
                if (i14 < str.length()) {
                    char cCharAt = str.charAt(i14);
                    enumMap.put((EnumMap) zzaVar, (zza) (cCharAt != '0' ? cCharAt != '1' ? null : Boolean.TRUE : Boolean.FALSE));
                }
                i13++;
            }
        }
        return new zzif(enumMap, i12);
    }

    public static String d(int i12) {
        return i12 != -20 ? i12 != -10 ? i12 != 0 ? i12 != 30 ? i12 != 90 ? i12 != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static Boolean g(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final zzif c(zzif zzifVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzie.STORAGE.f355541b) {
            Boolean boolValueOf = this.f355543a.get(zzaVar);
            Boolean bool = zzifVar.f355543a.get(zzaVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put((EnumMap) zzaVar, (zza) boolValueOf);
        }
        return new zzif(enumMap, 100);
    }

    public final boolean e(zza zzaVar) {
        Boolean bool = this.f355543a.get(zzaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzif)) {
            return false;
        }
        zzif zzifVar = (zzif) obj;
        zza[] zzaVarArr = zzie.STORAGE.f355541b;
        int length = zzaVarArr.length;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= length) {
                return this.f355544b == zzifVar.f355544b;
            }
            zza zzaVar = zzaVarArr[i12];
            Boolean bool = this.f355543a.get(zzaVar);
            boolean z13 = bool == null ? false : bool.booleanValue() ? true : 2;
            Boolean bool2 = zzifVar.f355543a.get(zzaVar);
            if (bool2 == null) {
                z12 = false;
            } else if (!bool2.booleanValue()) {
                z12 = 2;
            }
            if (z13 != z12) {
                return false;
            }
            i12++;
        }
    }

    public final zzif f(zzif zzifVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzie.STORAGE.f355541b) {
            Boolean bool = this.f355543a.get(zzaVar);
            if (bool == null) {
                bool = zzifVar.f355543a.get(zzaVar);
            }
            enumMap.put((EnumMap) zzaVar, (zza) bool);
        }
        return new zzif(enumMap, this.f355544b);
    }

    public final boolean h(zzif zzifVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            Boolean bool = this.f355543a.get(zzaVar);
            Boolean bool2 = zzifVar.f355543a.get(zzaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f355544b * 17;
        Iterator<Boolean> it = this.f355543a.values().iterator();
        while (it.hasNext()) {
            Boolean next = it.next();
            i12 = (i12 * 31) + (next == null ? 0 : next.booleanValue() ? 1 : 2);
        }
        return i12;
    }

    public final String i() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (zza zzaVar : zzie.STORAGE.f355541b) {
            Boolean bool = this.f355543a.get(zzaVar);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean j() {
        return e(zza.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f355544b));
        for (zza zzaVar : zzie.STORAGE.f355541b) {
            sb2.append(",");
            sb2.append(zzaVar.f355550b);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Boolean bool = this.f355543a.get(zzaVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        return sb2.toString();
    }

    public zzif(Boolean bool, Boolean bool2, int i12) {
        EnumMap<zza, Boolean> enumMap = new EnumMap<>(zza.class);
        this.f355543a = enumMap;
        enumMap.put((EnumMap<zza, Boolean>) zza.AD_STORAGE, (zza) bool);
        enumMap.put((EnumMap<zza, Boolean>) zza.ANALYTICS_STORAGE, (zza) bool2);
        this.f355544b = i12;
    }
}
