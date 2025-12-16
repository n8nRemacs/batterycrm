package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzov;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36880g extends C36891h3 {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f355161b;

    /* renamed from: c, reason: collision with root package name */
    public String f355162c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC36894i f355163d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f355164e;

    public static long s() {
        return E.f354568E.a(null).longValue();
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

    @j.l0
    public final double f(String str, J1<Double> j12) {
        if (str == null) {
            return j12.a(null).doubleValue();
        }
        String strA = this.f355163d.a(str, j12.f354744a);
        if (TextUtils.isEmpty(strA)) {
            return j12.a(null).doubleValue();
        }
        try {
            return j12.a(Double.valueOf(Double.parseDouble(strA))).doubleValue();
        } catch (NumberFormatException unused) {
            return j12.a(null).doubleValue();
        }
    }

    public final int g(String str, boolean z12) {
        if (!zzoq.zza() || !this.f355183a.f354715g.o(null, E.f354595R0)) {
            return 100;
        }
        if (z12) {
            return Math.max(Math.min(j(str, E.f354596S), 500), 100);
        }
        return 500;
    }

    public final String h(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C36729v.j(str2);
            return str2;
        } catch (ClassNotFoundException e12) {
            super.zzj().f354889f.c("Could not find SystemProperties class", e12);
            return "";
        } catch (IllegalAccessException e13) {
            super.zzj().f354889f.c("Could not access SystemProperties.get()", e13);
            return "";
        } catch (NoSuchMethodException e14) {
            super.zzj().f354889f.c("Could not find SystemProperties.get() method", e14);
            return "";
        } catch (InvocationTargetException e15) {
            super.zzj().f354889f.c("SystemProperties.get() threw an exception", e15);
            return "";
        }
    }

    public final boolean i(J1<Boolean> j12) {
        return o(null, j12);
    }

    @j.l0
    public final int j(String str, J1<Integer> j12) {
        if (str == null) {
            return j12.a(null).intValue();
        }
        String strA = this.f355163d.a(str, j12.f354744a);
        if (TextUtils.isEmpty(strA)) {
            return j12.a(null).intValue();
        }
        try {
            return j12.a(Integer.valueOf(Integer.parseInt(strA))).intValue();
        } catch (NumberFormatException unused) {
            return j12.a(null).intValue();
        }
    }

    public final int k() {
        return (zzov.zza() && this.f355183a.f354715g.o(null, E.f354658z0) && super.c().X(231100000)) ? 35 : 0;
    }

    @j.l0
    public final long l(String str, J1<Long> j12) {
        if (str == null) {
            return j12.a(null).longValue();
        }
        String strA = this.f355163d.a(str, j12.f354744a);
        if (TextUtils.isEmpty(strA)) {
            return j12.a(null).longValue();
        }
        try {
            return j12.a(Long.valueOf(Long.parseLong(strA))).longValue();
        } catch (NumberFormatException unused) {
            return j12.a(null).longValue();
        }
    }

    @j.l0
    public final String m(String str, J1<String> j12) {
        return str == null ? j12.a(null) : j12.a(this.f355163d.a(str, j12.f354744a));
    }

    @j.k0
    public final Boolean n(@j.c0 String str) {
        C36729v.f(str);
        Bundle bundleW = w();
        if (bundleW == null) {
            super.zzj().f354889f.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleW.containsKey(str)) {
            return Boolean.valueOf(bundleW.getBoolean(str));
        }
        return null;
    }

    @j.l0
    public final boolean o(String str, J1<Boolean> j12) {
        if (str == null) {
            return j12.a(null).booleanValue();
        }
        String strA = this.f355163d.a(str, j12.f354744a);
        return TextUtils.isEmpty(strA) ? j12.a(null).booleanValue() : j12.a(Boolean.valueOf("1".equals(strA))).booleanValue();
    }

    public final int p() {
        return super.c().X(201500000) ? 100 : 25;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List q() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C36729v.f(r0)
            android.os.Bundle r1 = r4.w()
            r2 = 0
            if (r1 != 0) goto L19
            com.google.android.gms.measurement.internal.S1 r0 = super.zzj()
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            com.google.android.gms.measurement.internal.U1 r0 = r0.f354889f
            r0.b(r1)
        L17:
            r0 = r2
            goto L28
        L19:
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L20
            goto L17
        L20:
            int r0 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28:
            if (r0 != 0) goto L2b
            return r2
        L2b:
            com.google.android.gms.measurement.internal.I2 r1 = r4.f355183a     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.Context r1 = r1.f354709a     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r0 = r0.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r0 != 0) goto L3e
            return r2
        L3e:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r0
        L43:
            r0 = move-exception
            com.google.android.gms.measurement.internal.S1 r1 = super.zzj()
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            com.google.android.gms.measurement.internal.U1 r1 = r1.f354889f
            r1.c(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36880g.q():java.util.List");
    }

    public final boolean r(String str) {
        return "1".equals(this.f355163d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean t() {
        Boolean boolN = n("google_analytics_automatic_screen_reporting_enabled");
        return boolN == null || boolN.booleanValue();
    }

    @j.l0
    public final boolean u() {
        if (this.f355161b == null) {
            Boolean boolN = n("app_measurement_lite");
            this.f355161b = boolN;
            if (boolN == null) {
                this.f355161b = Boolean.FALSE;
            }
        }
        return this.f355161b.booleanValue() || !this.f355183a.f354713e;
    }

    @InterfaceC49173d
    public final boolean v() {
        if (this.f355164e == null) {
            synchronized (this) {
                try {
                    if (this.f355164e == null) {
                        ApplicationInfo applicationInfo = this.f355183a.f354709a.getApplicationInfo();
                        String strA = com.google.android.gms.common.util.x.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f355164e = Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (this.f355164e == null) {
                            this.f355164e = Boolean.TRUE;
                            super.zzj().f354889f.b("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f355164e.booleanValue();
    }

    @j.k0
    public final Bundle w() {
        I2 i22 = this.f355183a;
        try {
            Context context = i22.f354709a;
            Context context2 = i22.f354709a;
            if (context.getPackageManager() == null) {
                super.zzj().f354889f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = aY0.c.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            super.zzj().f354889f.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e12) {
            super.zzj().f354889f.c("Failed to load metadata: Package name not found", e12);
            return null;
        }
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
