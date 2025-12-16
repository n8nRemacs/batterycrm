package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C20199a;
import androidx.collection.C20212g0;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzif;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36959r2 extends AbstractC36990v5 implements InterfaceC36894i {

    /* renamed from: d, reason: collision with root package name */
    public final C20199a f355340d;

    /* renamed from: e, reason: collision with root package name */
    @j.k0
    public final C20199a f355341e;

    /* renamed from: f, reason: collision with root package name */
    @j.k0
    public final C20199a f355342f;

    /* renamed from: g, reason: collision with root package name */
    @j.k0
    public final C20199a f355343g;

    /* renamed from: h, reason: collision with root package name */
    public final C20199a f355344h;

    /* renamed from: i, reason: collision with root package name */
    public final C20199a f355345i;

    /* renamed from: j, reason: collision with root package name */
    @j.k0
    public final C20212g0<String, zzb> f355346j;

    /* renamed from: k, reason: collision with root package name */
    public final zzv f355347k;

    /* renamed from: l, reason: collision with root package name */
    public final C20199a f355348l;

    /* renamed from: m, reason: collision with root package name */
    public final C20199a f355349m;

    /* renamed from: n, reason: collision with root package name */
    public final C20199a f355350n;

    public C36959r2(C36997w5 c36997w5) {
        super(c36997w5);
        this.f355340d = new C20199a();
        this.f355341e = new C20199a();
        this.f355342f = new C20199a();
        this.f355343g = new C20199a();
        this.f355344h = new C20199a();
        this.f355348l = new C20199a();
        this.f355349m = new C20199a();
        this.f355350n = new C20199a();
        this.f355345i = new C20199a();
        this.f355346j = new C37001x2(this);
        this.f355347k = new C36994w2(this);
    }

    public static C20199a m(zzfc.zzd zzdVar) {
        C20199a c20199a = new C20199a();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.zzn()) {
                c20199a.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return c20199a;
    }

    public static zzif.zza o(zzfc.zza.zze zzeVar) {
        int i12 = C37008y2.f355488b[zzeVar.ordinal()];
        if (i12 == 1) {
            return zzif.zza.AD_STORAGE;
        }
        if (i12 == 2) {
            return zzif.zza.ANALYTICS_STORAGE;
        }
        if (i12 == 3) {
            return zzif.zza.AD_USER_DATA;
        }
        if (i12 != 4) {
            return null;
        }
        return zzif.zza.AD_PERSONALIZATION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.l0
    public final String A(String str) {
        super.e();
        return (String) this.f355349m.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.l0
    public final String B(String str) {
        super.e();
        O(str);
        return (String) this.f355348l.get(str);
    }

    @j.l0
    public final Set<String> C(String str) {
        super.e();
        O(str);
        return (Set) this.f355341e.get(str);
    }

    @j.l0
    public final TreeSet D(String str) {
        super.e();
        O(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza zzaVarU = u(str);
        if (zzaVarU == null) {
            return treeSet;
        }
        Iterator<zzfc.zza.zzf> it = zzaVarU.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    @j.l0
    public final void E(String str) {
        super.e();
        this.f355349m.put(str, null);
    }

    @j.l0
    public final void F(String str) {
        super.e();
        this.f355344h.remove(str);
    }

    @j.l0
    public final boolean G(String str) {
        super.e();
        zzfc.zzd zzdVarW = w(str);
        if (zzdVarW == null) {
            return false;
        }
        return zzdVarW.zzo();
    }

    @j.l0
    public final boolean H(String str) {
        super.e();
        O(str);
        zzfc.zza zzaVarU = u(str);
        return zzaVarU == null || !zzaVarU.zzg() || zzaVarU.zzf();
    }

    @j.l0
    public final boolean I(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        return c20199a.get(str) != 0 && ((Set) c20199a.get(str)).contains("app_instance_id");
    }

    @j.l0
    public final boolean J(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        if (c20199a.get(str) != 0) {
            return ((Set) c20199a.get(str)).contains("device_model") || ((Set) c20199a.get(str)).contains("device_info");
        }
        return false;
    }

    @j.l0
    public final boolean K(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        return c20199a.get(str) != 0 && ((Set) c20199a.get(str)).contains("enhanced_user_id");
    }

    @j.l0
    public final boolean L(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        return c20199a.get(str) != 0 && ((Set) c20199a.get(str)).contains("google_signals");
    }

    @j.l0
    public final boolean M(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        if (c20199a.get(str) != 0) {
            return ((Set) c20199a.get(str)).contains("os_version") || ((Set) c20199a.get(str)).contains("device_info");
        }
        return false;
    }

    @j.l0
    public final boolean N(String str) {
        super.e();
        O(str);
        C20199a c20199a = this.f355341e;
        return c20199a.get(str) != 0 && ((Set) c20199a.get(str)).contains("user_id");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36959r2.O(java.lang.String):void");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36894i
    @j.l0
    public final String a(String str, String str2) {
        super.e();
        O(str);
        Map map = (Map) this.f355340d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ G5 f() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        return false;
    }

    @j.l0
    public final long l(String str) {
        String strA = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException e12) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354892i.a(S1.i(str), "Unable to parse timezone offset. appId", e12);
            return 0L;
        }
    }

    @j.l0
    public final zzfc.zzd n(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((zzjf) ((zzfc.zzd.zza) G5.s(zzfc.zzd.zze(), bArr)).zzah());
            super.zzj().f354897n.a(zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, "Parsed config. version, gmp_app_id", zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (zzjq e12) {
            super.zzj().f354892i.a(S1.i(str), "Unable to merge remote config. appId", e12);
            return zzfc.zzd.zzg();
        } catch (RuntimeException e13) {
            super.zzj().f354892i.a(S1.i(str), "Unable to merge remote config. appId", e13);
            return zzfc.zzd.zzg();
        }
    }

    @j.l0
    public final zzif.zza p(String str) {
        zzif.zza zzaVar = zzif.zza.AD_USER_DATA;
        super.e();
        O(str);
        zzfc.zza zzaVarU = u(str);
        if (zzaVarU == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : zzaVarU.zze()) {
            if (zzaVar == o(zzcVar.zzc())) {
                return o(zzcVar.zzb());
            }
        }
        return null;
    }

    public final void q(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C20199a c20199a = new C20199a();
        C20199a c20199a2 = new C20199a();
        C20199a c20199a3 = new C20199a();
        if (zzaVar != null) {
            Iterator<zzfc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i12 = 0; i12 < zzaVar.zza(); i12++) {
                zzfc.zzc.zza zzaVarZzby = zzaVar.zza(i12).zzby();
                if (zzaVarZzby.zzb().isEmpty()) {
                    super.zzj().f354892i.b("EventConfig contained null event name");
                } else {
                    String strZzb = zzaVarZzby.zzb();
                    String strA = C36920l4.a(zzaVarZzby.zzb(), C36912k3.f355240a, C36912k3.f355242c);
                    if (!TextUtils.isEmpty(strA)) {
                        zzaVarZzby = zzaVarZzby.zza(strA);
                        zzaVar.zza(i12, zzaVarZzby);
                    }
                    if (zzaVarZzby.zze() && zzaVarZzby.zzc()) {
                        c20199a.put(strZzb, Boolean.TRUE);
                    }
                    if (zzaVarZzby.zzf() && zzaVarZzby.zzd()) {
                        c20199a2.put(zzaVarZzby.zzb(), Boolean.TRUE);
                    }
                    if (zzaVarZzby.zzg()) {
                        if (zzaVarZzby.zza() < 2 || zzaVarZzby.zza() > 65535) {
                            S1 s1Zzj = super.zzj();
                            s1Zzj.f354892i.a(zzaVarZzby.zzb(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(zzaVarZzby.zza()));
                        } else {
                            c20199a3.put(zzaVarZzby.zzb(), Integer.valueOf(zzaVarZzby.zza()));
                        }
                    }
                }
            }
        }
        this.f355341e.put(str, hashSet);
        this.f355342f.put(str, c20199a);
        this.f355343g.put(str, c20199a2);
        this.f355345i.put(str, c20199a3);
    }

    @j.l0
    public final void r(final String str, zzfc.zzd zzdVar) {
        int iZza = zzdVar.zza();
        C20212g0<String, zzb> c20212g0 = this.f355346j;
        if (iZza == 0) {
            c20212g0.remove(str);
            return;
        }
        S1 s1Zzj = super.zzj();
        s1Zzj.f354897n.c("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzfp.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            zzb zzbVar = new zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.s2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzm("internal.remoteConfig", new C37015z2(this.f355360b, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.v2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C36959r2 c36959r2 = this.f355406b;
                    final String str2 = str;
                    return new zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.t2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C36908k c36908kG = c36959r2.g();
                            String str3 = str2;
                            C36862d2 c36862d2S = c36908kG.S(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 84002L);
                            if (c36862d2S != null) {
                                String strD = c36862d2S.d();
                                if (strD != null) {
                                    map.put("app_version", strD);
                                }
                                map.put("app_version_int", Long.valueOf(c36862d2S.m()));
                                map.put("dynamite_version", Long.valueOf(c36862d2S.D()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.u2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzr(this.f355397b.f355347k);
                }
            });
            zzbVar.zza(zzcVar);
            c20212g0.put(str, zzbVar);
            super.zzj().f354897n.a(str, "EES program loaded for appId, activities", Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzfp.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                super.zzj().f354897n.c("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            super.zzj().f354889f.c("Failed to load EES program. appId", str);
        }
    }

    @j.l0
    public final boolean s(String str, String str2, String str3, byte[] bArr) {
        byte[] bArrZzbv;
        boolean z12;
        String str4;
        boolean z13;
        i();
        super.e();
        C36729v.f(str);
        zzfc.zzd.zza zzaVarZzby = n(str, bArr).zzby();
        int i12 = 0;
        if (zzaVarZzby == null) {
            return false;
        }
        q(str, zzaVarZzby);
        r(str, (zzfc.zzd) ((zzjf) zzaVarZzby.zzah()));
        C20199a c20199a = this.f355344h;
        c20199a.put(str, (zzfc.zzd) ((zzjf) zzaVarZzby.zzah()));
        this.f355348l.put(str, zzaVarZzby.zzc());
        this.f355349m.put(str, str2);
        this.f355350n.put(str, str3);
        this.f355340d.put(str, m((zzfc.zzd) ((zzjf) zzaVarZzby.zzah())));
        C36908k c36908kG = super.g();
        ArrayList arrayList = new ArrayList(zzaVarZzby.zzd());
        String str5 = "app_id=? and audience_id=?";
        int i13 = 0;
        while (i13 < arrayList.size()) {
            zzew.zza.C10626zza c10626zzaZzby = ((zzew.zza) arrayList.get(i13)).zzby();
            if (c10626zzaZzby.zza() != 0) {
                while (i12 < c10626zzaZzby.zza()) {
                    zzew.zzb.zza zzaVarZzby2 = c10626zzaZzby.zza(i12).zzby();
                    zzew.zzb.zza zzaVar = (zzew.zzb.zza) ((zzjf.zzb) zzaVarZzby2.clone());
                    C20199a c20199a2 = c20199a;
                    String strA = C36920l4.a(zzaVarZzby2.zzb(), C36912k3.f355240a, C36912k3.f355242c);
                    if (strA != null) {
                        zzaVar.zza(strA);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    int i14 = 0;
                    while (i14 < zzaVarZzby2.zza()) {
                        zzew.zzc zzcVarZza = zzaVarZzby2.zza(i14);
                        zzew.zzb.zza zzaVar2 = zzaVarZzby2;
                        zzfc.zzd.zza zzaVar3 = zzaVarZzby;
                        String str6 = str5;
                        String strA2 = C36920l4.a(zzcVarZza.zze(), C36926m3.f355264a, C36926m3.f355265b);
                        if (strA2 != null) {
                            zzaVar.zza(i14, (zzew.zzc) ((zzjf) zzcVarZza.zzby().zza(strA2).zzah()));
                            z13 = true;
                        }
                        i14++;
                        zzaVarZzby2 = zzaVar2;
                        zzaVarZzby = zzaVar3;
                        str5 = str6;
                    }
                    zzfc.zzd.zza zzaVar4 = zzaVarZzby;
                    String str7 = str5;
                    if (z13) {
                        zzew.zza.C10626zza c10626zzaZza = c10626zzaZzby.zza(i12, zzaVar);
                        arrayList.set(i13, (zzew.zza) ((zzjf) c10626zzaZza.zzah()));
                        c10626zzaZzby = c10626zzaZza;
                    }
                    i12++;
                    c20199a = c20199a2;
                    zzaVarZzby = zzaVar4;
                    str5 = str7;
                }
            }
            zzfc.zzd.zza zzaVar5 = zzaVarZzby;
            C20199a c20199a3 = c20199a;
            String str8 = str5;
            if (c10626zzaZzby.zzb() != 0) {
                for (int i15 = 0; i15 < c10626zzaZzby.zzb(); i15++) {
                    zzew.zze zzeVarZzb = c10626zzaZzby.zzb(i15);
                    String strA3 = C36920l4.a(zzeVarZzb.zze(), C36919l3.f355256a, C36919l3.f355257b);
                    if (strA3 != null) {
                        zzew.zza.C10626zza c10626zzaZza2 = c10626zzaZzby.zza(i15, zzeVarZzb.zzby().zza(strA3));
                        arrayList.set(i13, (zzew.zza) ((zzjf) c10626zzaZza2.zzah()));
                        c10626zzaZzby = c10626zzaZza2;
                    }
                }
            }
            i13++;
            c20199a = c20199a3;
            zzaVarZzby = zzaVar5;
            str5 = str8;
            i12 = 0;
        }
        zzfc.zzd.zza zzaVar6 = zzaVarZzby;
        C20199a c20199a4 = c20199a;
        String str9 = str5;
        c36908kG.i();
        c36908kG.e();
        C36729v.f(str);
        SQLiteDatabase sQLiteDatabaseL = c36908kG.l();
        sQLiteDatabaseL.beginTransaction();
        try {
            c36908kG.i();
            c36908kG.e();
            C36729v.f(str);
            SQLiteDatabase sQLiteDatabaseL2 = c36908kG.l();
            sQLiteDatabaseL2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseL2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzew.zza zzaVar7 = (zzew.zza) it.next();
                c36908kG.i();
                c36908kG.e();
                C36729v.f(str);
                C36729v.j(zzaVar7);
                if (zzaVar7.zzg()) {
                    int iZza = zzaVar7.zza();
                    Iterator<zzew.zzb> it2 = zzaVar7.zze().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!it2.next().zzl()) {
                                c36908kG.zzj().f354892i.a(S1.i(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator<zzew.zze> it3 = zzaVar7.zzf().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!it3.next().zzi()) {
                                        c36908kG.zzj().f354892i.a(S1.i(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                                        break;
                                    }
                                } else {
                                    Iterator<zzew.zzb> it4 = zzaVar7.zze().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z12 = true;
                                            break;
                                        }
                                        if (!c36908kG.J(str, iZza, it4.next())) {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                    if (z12) {
                                        Iterator<zzew.zze> it5 = zzaVar7.zzf().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                break;
                                            }
                                            if (!c36908kG.K(str, iZza, it5.next())) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z12) {
                                        str4 = str9;
                                    } else {
                                        c36908kG.i();
                                        c36908kG.e();
                                        C36729v.f(str);
                                        SQLiteDatabase sQLiteDatabaseL3 = c36908kG.l();
                                        str4 = str9;
                                        sQLiteDatabaseL3.delete("property_filters", str4, new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseL3.delete("event_filters", str4, new String[]{str, String.valueOf(iZza)});
                                    }
                                    str9 = str4;
                                }
                            }
                        }
                    }
                } else {
                    c36908kG.zzj().f354892i.c("Audience with no ID. appId", S1.i(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                zzew.zza zzaVar8 = (zzew.zza) it6.next();
                arrayList2.add(zzaVar8.zzg() ? Integer.valueOf(zzaVar8.zza()) : null);
            }
            c36908kG.O(str, arrayList2);
            sQLiteDatabaseL.setTransactionSuccessful();
            sQLiteDatabaseL.endTransaction();
            try {
                zzaVar6.zzb();
                bArrZzbv = ((zzfc.zzd) ((zzjf) zzaVar6.zzah())).zzbv();
            } catch (RuntimeException e12) {
                super.zzj().f354892i.a(S1.i(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e12);
                bArrZzbv = bArr;
            }
            C36908k c36908kG2 = super.g();
            C36729v.f(str);
            c36908kG2.e();
            c36908kG2.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrZzbv);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c36908kG2.l().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c36908kG2.zzj().f354889f.c("Failed to update remote config (got 0). appId", S1.i(str));
                }
            } catch (SQLiteException e13) {
                c36908kG2.zzj().f354889f.a(S1.i(str), "Error storing remote config. appId", e13);
            }
            c20199a4.put(str, (zzfc.zzd) ((zzjf) zzaVar6.zzah()));
            return true;
        } catch (Throwable th2) {
            sQLiteDatabaseL.endTransaction();
            throw th2;
        }
    }

    @j.l0
    public final int t(String str, String str2) {
        Integer num;
        super.e();
        O(str);
        Map map = (Map) this.f355345i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @j.l0
    public final zzfc.zza u(String str) {
        super.e();
        O(str);
        zzfc.zzd zzdVarW = w(str);
        if (zzdVarW == null || !zzdVarW.zzp()) {
            return null;
        }
        return zzdVarW.zzd();
    }

    @j.l0
    public final boolean v(String str, zzif.zza zzaVar) {
        super.e();
        O(str);
        zzfc.zza zzaVarU = u(str);
        if (zzaVarU == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = zzaVarU.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (zzaVar == o(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.l0
    public final zzfc.zzd w(String str) {
        i();
        super.e();
        C36729v.f(str);
        O(str);
        return (zzfc.zzd) this.f355344h.get(str);
    }

    @j.l0
    public final boolean x(String str, String str2) {
        Boolean bool;
        super.e();
        O(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f355343g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.l0
    public final String y(String str) {
        super.e();
        return (String) this.f355350n.get(str);
    }

    @j.l0
    public final boolean z(String str, String str2) {
        Boolean bool;
        super.e();
        O(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && N5.m0(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && N5.o0(str2)) {
            return true;
        }
        Map map = (Map) this.f355342f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
