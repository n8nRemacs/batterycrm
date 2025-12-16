package com.google.android.gms.internal.fido;

import AK.c;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhn extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final String f350422b;

    public zzhn(String str) {
        this.f350422b = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC2 = zzhp.c((byte) 96);
        if (iC2 != iZza) {
            return iC2 - zzhpVar.zza();
        }
        String str = ((zzhn) zzhpVar).f350422b;
        int length = str.length();
        String str2 = this.f350422b;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhn.class == obj.getClass()) {
            return this.f350422b.equals(((zzhn) obj).f350422b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) 96)), this.f350422b});
    }

    public final String toString() {
        return c.s(new StringBuilder("\""), this.f350422b, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) 96);
    }
}
