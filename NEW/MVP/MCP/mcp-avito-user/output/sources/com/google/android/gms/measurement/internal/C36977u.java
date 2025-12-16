package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzif;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36977u {

    /* renamed from: f, reason: collision with root package name */
    public static final C36977u f355389f = new C36977u((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f355390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f355391b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f355392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f355393d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap<zzif.zza, Boolean> f355394e;

    public C36977u() {
        throw null;
    }

    public C36977u(Boolean bool, int i12, Boolean bool2, String str) {
        EnumMap<zzif.zza, Boolean> enumMap = new EnumMap<>(zzif.zza.class);
        this.f355394e = enumMap;
        enumMap.put((EnumMap<zzif.zza, Boolean>) zzif.zza.AD_USER_DATA, (zzif.zza) bool);
        this.f355390a = i12;
        this.f355391b = c();
        this.f355392c = bool2;
        this.f355393d = str;
    }

    public static C36977u a(int i12, Bundle bundle) {
        if (bundle == null) {
            return new C36977u((Boolean) null, i12, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzif.zza.class);
        for (zzif.zza zzaVar : zzie.DMA.f355541b) {
            enumMap.put((EnumMap) zzaVar, (zzif.zza) zzif.g(bundle.getString(zzaVar.f355550b)));
        }
        return new C36977u((EnumMap<zzif.zza, Boolean>) enumMap, i12, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C36977u b(String str) {
        if (str == null || str.length() <= 0) {
            return f355389f;
        }
        String[] strArrSplit = str.split(":");
        int i12 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzif.zza.class);
        zzif.zza[] zzaVarArr = zzie.DMA.f355541b;
        int length = zzaVarArr.length;
        int i13 = 1;
        int i14 = 0;
        while (true) {
            Boolean bool = null;
            if (i14 >= length) {
                return new C36977u((EnumMap<zzif.zza, Boolean>) enumMap, i12, (Boolean) null, (String) null);
            }
            zzif.zza zzaVar = zzaVarArr[i14];
            int i15 = i13 + 1;
            char cCharAt = strArrSplit[i13].charAt(0);
            zzif zzifVar = zzif.f355542c;
            if (cCharAt == '0') {
                bool = Boolean.FALSE;
            } else if (cCharAt == '1') {
                bool = Boolean.TRUE;
            }
            enumMap.put((EnumMap) zzaVar, (zzif.zza) bool);
            i14++;
            i13 = i15;
        }
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f355390a);
        for (zzif.zza zzaVar : zzie.DMA.f355541b) {
            sb2.append(":");
            Boolean bool = this.f355394e.get(zzaVar);
            zzif zzifVar = zzif.f355542c;
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36977u)) {
            return false;
        }
        C36977u c36977u = (C36977u) obj;
        if (this.f355391b.equalsIgnoreCase(c36977u.f355391b) && Objects.equals(this.f355392c, c36977u.f355392c)) {
            return Objects.equals(this.f355393d, c36977u.f355393d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f355392c;
        int i12 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f355393d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i12 * 29) + this.f355391b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzif.d(this.f355390a));
        for (zzif.zza zzaVar : zzie.DMA.f355541b) {
            sb2.append(",");
            sb2.append(zzaVar.f355550b);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Boolean bool = this.f355394e.get(zzaVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        Boolean bool2 = this.f355392c;
        if (bool2 != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool2);
        }
        String str = this.f355393d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C36977u(EnumMap<zzif.zza, Boolean> enumMap, int i12, Boolean bool, String str) {
        EnumMap<zzif.zza, Boolean> enumMap2 = new EnumMap<>(zzif.zza.class);
        this.f355394e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f355390a = i12;
        this.f355391b = c();
        this.f355392c = bool;
        this.f355393d = str;
    }
}
