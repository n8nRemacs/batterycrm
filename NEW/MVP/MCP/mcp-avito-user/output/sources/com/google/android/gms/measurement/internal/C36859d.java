package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzod;
import java.math.BigDecimal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36859d extends Y5 {

    /* renamed from: g, reason: collision with root package name */
    public final zzew.zze f355057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T5 f355058h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36859d(T5 t52, String str, int i12, zzew.zze zzeVar) {
        super(str, i12);
        this.f355058h = t52;
        this.f355057g = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.Y5
    public final int a() {
        return this.f355057g.zza();
    }

    @Override // com.google.android.gms.measurement.internal.Y5
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.Y5
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(Long l12, Long l13, zzfi.zzn zznVar, boolean z12) {
        boolean zZza = zzod.zza();
        T5 t52 = this.f355058h;
        Object[] objArr = zZza && t52.f355183a.f354715g.o(this.f354997a, E.f354618f0);
        zzew.zze zzeVar = this.f355057g;
        boolean zZzf = zzeVar.zzf();
        boolean zZzg = zzeVar.zzg();
        boolean zZzh = zzeVar.zzh();
        Object[] objArr2 = zZzf || zZzg || zZzh;
        Boolean boolC = null;
        boolE = null;
        Boolean boolE = null;
        boolC = null;
        boolC = null;
        boolC = null;
        Boolean boolE2 = null;
        boolC = null;
        if (z12 && objArr2 != true) {
            t52.zzj().f354897n.a(Integer.valueOf(this.f354998b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
            return true;
        }
        zzew.zzc zzcVarZzb = zzeVar.zzb();
        boolean zZzf2 = zzcVarZzb.zzf();
        if (zznVar.zzk()) {
            if (zzcVarZzb.zzh()) {
                boolC = Y5.c(Y5.b(zznVar.zzc(), zzcVarZzb.zzc()), zZzf2);
            } else {
                t52.zzj().f354892i.c("No number filter for long property. property", t52.f355183a.f354721m.g(zznVar.zzg()));
            }
        } else if (zznVar.zzi()) {
            if (zzcVarZzb.zzh()) {
                double dZza = zznVar.zza();
                try {
                    boolE = Y5.e(new BigDecimal(dZza), zzcVarZzb.zzc(), Math.ulp(dZza));
                } catch (NumberFormatException unused) {
                }
                boolC = Y5.c(boolE, zZzf2);
            } else {
                t52.zzj().f354892i.c("No number filter for double property. property", t52.f355183a.f354721m.g(zznVar.zzg()));
            }
        } else if (!zznVar.zzm()) {
            t52.zzj().f354892i.c("User property has no value, property", t52.f355183a.f354721m.g(zznVar.zzg()));
        } else if (zzcVarZzb.zzj()) {
            boolC = Y5.c(Y5.d(zznVar.zzh(), zzcVarZzb.zzd(), t52.zzj()), zZzf2);
        } else if (!zzcVarZzb.zzh()) {
            t52.zzj().f354892i.c("No string or number filter defined. property", t52.f355183a.f354721m.g(zznVar.zzg()));
        } else if (G5.R(zznVar.zzh())) {
            String strZzh = zznVar.zzh();
            zzew.zzd zzdVarZzc = zzcVarZzb.zzc();
            if (G5.R(strZzh)) {
                try {
                    boolE2 = Y5.e(new BigDecimal(strZzh), zzdVarZzc, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            boolC = Y5.c(boolE2, zZzf2);
        } else {
            t52.zzj().f354892i.a(t52.f355183a.f354721m.g(zznVar.zzg()), "Invalid user property value for Numeric number filter. property, value", zznVar.zzh());
        }
        t52.zzj().f354897n.c("Property filter result", boolC == null ? "null" : boolC);
        if (boolC == null) {
            return false;
        }
        this.f354999c = Boolean.TRUE;
        if (zZzh && !boolC.booleanValue()) {
            return true;
        }
        if (!z12 || zzeVar.zzf()) {
            this.f355000d = boolC;
        }
        if (boolC.booleanValue() && objArr2 != false && zznVar.zzl()) {
            long jZzd = zznVar.zzd();
            if (l12 != null) {
                jZzd = l12.longValue();
            }
            if (objArr != false && zzeVar.zzf() && !zzeVar.zzg() && l13 != null) {
                jZzd = l13.longValue();
            }
            if (zzeVar.zzg()) {
                this.f355002f = Long.valueOf(jZzd);
            } else {
                this.f355001e = Long.valueOf(jZzd);
            }
        }
        return true;
    }
}
