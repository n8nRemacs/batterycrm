package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhk extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final long f350417b;

    public zzhk(long j12) {
        this.f350417b = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zza() != zzhpVar.zza()) {
            return zza() - zzhpVar.zza();
        }
        long jAbs = Math.abs(this.f350417b);
        long jAbs2 = Math.abs(((zzhk) zzhpVar).f350417b);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzhk.class == obj.getClass() && this.f350417b == ((zzhk) obj).f350417b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f350417b)});
    }

    public final String toString() {
        return Long.toString(this.f350417b);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c(this.f350417b >= 0 ? (byte) 0 : (byte) 32);
    }

    public final long zzc() {
        return this.f350417b;
    }
}
