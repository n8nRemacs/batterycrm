package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzqg;
import com.google.android.gms.measurement.internal.zzif;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class M1 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    public String f354787c;

    /* renamed from: d, reason: collision with root package name */
    public String f354788d;

    /* renamed from: e, reason: collision with root package name */
    public int f354789e;

    /* renamed from: f, reason: collision with root package name */
    public String f354790f;

    /* renamed from: g, reason: collision with root package name */
    public long f354791g;

    /* renamed from: h, reason: collision with root package name */
    public long f354792h;

    /* renamed from: i, reason: collision with root package name */
    public List<String> f354793i;

    /* renamed from: j, reason: collision with root package name */
    public String f354794j;

    /* renamed from: k, reason: collision with root package name */
    public int f354795k;

    /* renamed from: l, reason: collision with root package name */
    public String f354796l;

    /* renamed from: m, reason: collision with root package name */
    public String f354797m;

    /* renamed from: n, reason: collision with root package name */
    public String f354798n;

    /* renamed from: o, reason: collision with root package name */
    public long f354799o;

    /* renamed from: p, reason: collision with root package name */
    public String f354800p;

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

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @j.l0
    public final zzo l(String str) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str2;
        int i12;
        long j12;
        Class<?> clsLoadClass;
        int i13;
        List<String> list;
        long j13;
        String str3;
        int extensionVersion;
        super.e();
        zzif zzifVarO = super.b().o();
        boolean zZza = zzns.zza();
        String str4 = null;
        I2 i22 = this.f355183a;
        if (zZza && i22.f354715g.o(null, E.f354579J0)) {
            C36876f2 c36876f2B = super.b();
            c36876f2B.e();
            str2 = C36977u.b(c36876f2B.m().getString("dma_consent_settings", null)).f355391b;
            i12 = zzifVarO.f355544b;
        } else {
            str2 = "";
            i12 = 100;
        }
        String str5 = str2;
        int i14 = i12;
        String strM = m();
        String strN = n();
        i();
        String str6 = this.f354788d;
        i();
        long j14 = this.f354789e;
        i();
        C36729v.j(this.f354790f);
        String str7 = this.f354790f;
        i();
        super.e();
        if (this.f354791g == 0) {
            N5 n52 = i22.f354720l;
            I2.d(n52);
            Context context = i22.f354709a;
            this.f354791g = n52.l(context, context.getPackageName());
        }
        long j15 = this.f354791g;
        boolean zE2 = i22.e();
        Context context2 = i22.f354709a;
        boolean z12 = !super.b().f355141s;
        super.e();
        boolean zE3 = i22.e();
        C36880g c36880g = i22.f354715g;
        if (!zE3) {
            j12 = j15;
        } else if (zzqg.zza() && c36880g.o(null, E.f354626j0)) {
            super.zzj().f354897n.b("Disabled IID for tests.");
            j12 = j15;
        } else {
            try {
                clsLoadClass = context2.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            } catch (ClassNotFoundException unused) {
            }
            if (clsLoadClass == null) {
                j12 = j15;
            } else {
                j12 = j15;
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context2);
                    if (objInvoke != null) {
                        try {
                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                        } catch (Exception unused2) {
                            super.zzj().f354894k.b("Failed to retrieve Firebase Instance Id");
                        }
                    }
                } catch (Exception unused3) {
                    super.zzj().f354893j.b("Failed to obtain Firebase Analytics instance");
                }
            }
            str4 = null;
        }
        C36876f2 c36876f2 = i22.f354716h;
        I2.d(c36876f2);
        long jA2 = c36876f2.f355129g.a();
        long j16 = i22.f354708H;
        long jMin = jA2 == 0 ? j16 : Math.min(j16, jA2);
        i();
        int i15 = this.f354795k;
        Boolean boolN = c36880g.n("google_analytics_adid_collection_enabled");
        boolean z13 = boolN == null || boolN.booleanValue();
        C36876f2 c36876f2B2 = super.b();
        c36876f2B2.e();
        boolean z14 = c36876f2B2.m().getBoolean("deferred_analytics_collection", false);
        i();
        String str8 = this.f354797m;
        Boolean boolValueOf = c36880g.n("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r6.booleanValue());
        List<String> list2 = this.f354793i;
        String strI = zzifVarO.i();
        if (this.f354794j == null) {
            this.f354794j = super.c().s0();
        }
        String str9 = this.f354794j;
        if (zzpt.zza() && c36880g.o(null, E.f354640q0)) {
            super.e();
            list = list2;
            j13 = 0;
            if (this.f354799o != 0) {
                i22.f354722n.getClass();
                i13 = i15;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f354799o;
                if (this.f354798n != null && jCurrentTimeMillis > 86400000 && this.f354800p == null) {
                    o();
                }
            } else {
                i13 = i15;
            }
            if (this.f354798n == null) {
                o();
            }
            str3 = this.f354798n;
        } else {
            i13 = i15;
            list = list2;
            j13 = 0;
            str3 = null;
        }
        Boolean boolN2 = c36880g.n("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolN2 == null ? false : boolN2.booleanValue();
        long jF02 = super.c().f0(m());
        if (zzph.zza() && c36880g.o(null, E.f354567D0)) {
            super.c();
            extensionVersion = (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000);
        } else {
            extensionVersion = 0;
        }
        return new zzo(strM, strN, str6, j14, str7, 84002L, j12, str, zE2, z12, str4, jMin, i13, z13, z14, str8, boolValueOf, this.f354792h, list, strI, str9, str3, zBooleanValue, jF02, i14, str5, extensionVersion, (zzph.zza() && c36880g.o(null, E.f354567D0)) ? super.c().n0() : j13, c36880g.f355162c);
    }

    @j.l0
    public final String m() {
        i();
        C36729v.j(this.f354787c);
        return this.f354787c;
    }

    @j.l0
    public final String n() {
        super.e();
        i();
        C36729v.j(this.f354796l);
        return this.f354796l;
    }

    @j.l0
    public final void o() {
        String str;
        super.e();
        if (super.b().o().e(zzif.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            super.c().u0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            super.zzj().f354896m.b("Analytics Storage consent is not granted");
            str = null;
        }
        super.zzj().f354896m.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f354798n = str;
        this.f355183a.f354722n.getClass();
        this.f354799o = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154 A[Catch: IllegalStateException -> 0x0162, TryCatch #0 {IllegalStateException -> 0x0162, blocks: (B:49:0x0139, B:53:0x014c, B:55:0x0154, B:59:0x0166, B:61:0x0178, B:63:0x017d, B:62:0x017b), top: B:83:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166 A[Catch: IllegalStateException -> 0x0162, TryCatch #0 {IllegalStateException -> 0x0162, blocks: (B:49:0x0139, B:53:0x014c, B:55:0x0154, B:59:0x0166, B:61:0x0178, B:63:0x017d, B:62:0x017b), top: B:83:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    @v61.InterfaceC49173d
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M1.p():void");
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
