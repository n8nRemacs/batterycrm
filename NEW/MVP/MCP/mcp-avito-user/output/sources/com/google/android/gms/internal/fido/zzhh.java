package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhh extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350415b;

    public zzhh(boolean z12) {
        this.f350415b = z12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC2 = zzhp.c((byte) -32);
        if (iC2 != iZza) {
            return iC2 - zzhpVar.zza();
        }
        return (true != this.f350415b ? 20 : 21) - (true != ((zzhh) zzhpVar).f350415b ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzhh.class == obj.getClass() && this.f350415b == ((zzhh) obj).f350415b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -32)), Boolean.valueOf(this.f350415b)});
    }

    public final String toString() {
        return Boolean.toString(this.f350415b);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -32);
    }
}
