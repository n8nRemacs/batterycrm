package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36934n4 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    public volatile C36941o4 f355277c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C36941o4 f355278d;

    /* renamed from: e, reason: collision with root package name */
    @j.k0
    public C36941o4 f355279e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f355280f;

    /* renamed from: g, reason: collision with root package name */
    @j.B
    public Activity f355281g;

    /* renamed from: h, reason: collision with root package name */
    @j.B
    public volatile boolean f355282h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C36941o4 f355283i;

    /* renamed from: j, reason: collision with root package name */
    public C36941o4 f355284j;

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public boolean f355285k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f355286l;

    public C36934n4(I2 i22) {
        super(i22);
        this.f355286l = new Object();
        this.f355280f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void r(C36934n4 c36934n4, Bundle bundle, C36941o4 c36941o4, C36941o4 c36941o42, long j12) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c36934n4.s(c36941o4, c36941o42, j12, true, super.c().q("screen_view", bundle, null, false));
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

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return false;
    }

    @j.l0
    public final C36941o4 l(boolean z12) {
        i();
        super.e();
        if (!z12) {
            return this.f355279e;
        }
        C36941o4 c36941o4 = this.f355279e;
        return c36941o4 != null ? c36941o4 : this.f355284j;
    }

    @j.k0
    public final String m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        I2 i22 = this.f355183a;
        return length > i22.f354715g.g(null, false) ? str.substring(0, i22.f354715g.g(null, false)) : str;
    }

    @j.K
    public final void n(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f355183a.f354715g.t() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f355280f.put(activity, new C36941o4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @j.K
    public final void o(Activity activity, C36941o4 c36941o4, boolean z12) {
        C36941o4 c36941o42;
        C36941o4 c36941o43 = this.f355277c == null ? this.f355278d : this.f355277c;
        if (c36941o4.f355293b == null) {
            c36941o42 = new C36941o4(c36941o4.f355292a, activity != null ? m(activity.getClass()) : null, c36941o4.f355294c, c36941o4.f355296e, c36941o4.f355297f);
        } else {
            c36941o42 = c36941o4;
        }
        this.f355278d = this.f355277c;
        this.f355277c = c36941o42;
        this.f355183a.f354722n.getClass();
        super.zzl().n(new RunnableC36948p4(this, c36941o42, c36941o43, SystemClock.elapsedRealtime(), z12));
    }

    @Deprecated
    public final void p(@j.N Activity activity, @j.c0 String str, @j.c0 String str2) {
        if (!this.f355183a.f354715g.t()) {
            super.zzj().f354894k.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C36941o4 c36941o4 = this.f355277c;
        if (c36941o4 == null) {
            super.zzj().f354894k.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f355280f.get(activity) == null) {
            super.zzj().f354894k.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m(activity.getClass());
        }
        boolean zEquals = Objects.equals(c36941o4.f355293b, str2);
        boolean zEquals2 = Objects.equals(c36941o4.f355292a, str);
        if (zEquals && zEquals2) {
            super.zzj().f354894k.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > this.f355183a.f354715g.g(null, false))) {
            super.zzj().f354894k.c("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > this.f355183a.f354715g.g(null, false))) {
            super.zzj().f354894k.c("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        super.zzj().f354897n.a(str == null ? "null" : str, "Setting current screen to name, class", str2);
        C36941o4 c36941o42 = new C36941o4(str, str2, super.c().r0());
        this.f355280f.put(activity, c36941o42);
        o(activity, c36941o42, true);
    }

    public final void q(Bundle bundle, long j12) {
        synchronized (this.f355286l) {
            try {
                if (!this.f355285k) {
                    super.zzj().f354894k.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f355183a.f354715g.g(null, false))) {
                    super.zzj().f354894k.c("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f355183a.f354715g.g(null, false))) {
                    super.zzj().f354894k.c("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = this.f355281g;
                    string2 = activity != null ? m(activity.getClass()) : "Activity";
                }
                C36941o4 c36941o4 = this.f355277c;
                if (this.f355282h && c36941o4 != null) {
                    this.f355282h = false;
                    boolean zEquals = Objects.equals(c36941o4.f355293b, string2);
                    boolean zEquals2 = Objects.equals(c36941o4.f355292a, string);
                    if (zEquals && zEquals2) {
                        super.zzj().f354894k.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                super.zzj().f354897n.a(string == null ? "null" : string, "Logging screen view with name, class", string2 == null ? "null" : string2);
                C36941o4 c36941o42 = this.f355277c == null ? this.f355278d : this.f355277c;
                C36941o4 c36941o43 = new C36941o4(string, string2, super.c().r0(), true, j12);
                this.f355277c = c36941o43;
                this.f355278d = c36941o42;
                this.f355283i = c36941o43;
                this.f355183a.f354722n.getClass();
                super.zzl().n(new RunnableC36955q4(this, bundle, c36941o43, c36941o42, SystemClock.elapsedRealtime()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.google.android.gms.measurement.internal.C36941o4 r18, com.google.android.gms.measurement.internal.C36941o4 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            super.e()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L30
            long r8 = r1.f355294c
            long r10 = r2.f355294c
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto L30
            java.lang.String r8 = r2.f355293b
            java.lang.String r9 = r1.f355293b
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L30
            java.lang.String r8 = r2.f355292a
            java.lang.String r9 = r1.f355292a
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2e
            goto L30
        L2e:
            r8 = r6
            goto L31
        L30:
            r8 = r7
        L31:
            if (r22 == 0) goto L38
            com.google.android.gms.measurement.internal.o4 r9 = r0.f355279e
            if (r9 == 0) goto L38
            r6 = r7
        L38:
            boolean r9 = r1.f355296e
            com.google.android.gms.measurement.internal.I2 r10 = r0.f355183a
            if (r8 == 0) goto Lbb
            android.os.Bundle r8 = new android.os.Bundle
            if (r5 == 0) goto L47
            r8.<init>(r5)
        L45:
            r14 = r8
            goto L4b
        L47:
            r8.<init>()
            goto L45
        L4b:
            com.google.android.gms.measurement.internal.N5.G(r1, r14, r7)
            if (r2 == 0) goto L69
            java.lang.String r5 = r2.f355292a
            if (r5 == 0) goto L59
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L59:
            java.lang.String r5 = r2.f355293b
            if (r5 == 0) goto L62
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L62:
            java.lang.String r5 = "_pi"
            long r11 = r2.f355294c
            r14.putLong(r5, r11)
        L69:
            r11 = 0
            if (r6 == 0) goto L84
            com.google.android.gms.measurement.internal.f5 r2 = super.h()
            com.google.android.gms.measurement.internal.m5 r2 = r2.f355159f
            long r7 = r2.f355269b
            long r7 = r3 - r7
            r2.f355269b = r3
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L84
            com.google.android.gms.measurement.internal.N5 r2 = super.c()
            r2.x(r14, r7)
        L84:
            com.google.android.gms.measurement.internal.g r2 = r10.f354715g
            boolean r2 = r2.t()
            if (r2 != 0) goto L93
            java.lang.String r2 = "_mst"
            r7 = 1
            r14.putLong(r2, r7)
        L93:
            if (r9 == 0) goto L98
            java.lang.String r2 = "app"
            goto L9a
        L98:
            java.lang.String r2 = "auto"
        L9a:
            com.google.android.gms.common.util.k r7 = r10.f354722n
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            r22 = r6
            if (r9 == 0) goto Laf
            long r5 = r1.f355297f
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 == 0) goto Laf
            r15 = r5
            goto Lb0
        Laf:
            r15 = r7
        Lb0:
            com.google.android.gms.measurement.internal.s3 r11 = super.f()
            java.lang.String r13 = "_vs"
            r12 = r2
            r11.E(r12, r13, r14, r15)
            goto Lbd
        Lbb:
            r22 = r6
        Lbd:
            if (r22 == 0) goto Lc5
            com.google.android.gms.measurement.internal.o4 r2 = r0.f355279e
            r5 = 1
            r0.t(r2, r5, r3)
        Lc5:
            r0.f355279e = r1
            if (r9 == 0) goto Lcb
            r0.f355284j = r1
        Lcb:
            com.google.android.gms.measurement.internal.w4 r2 = r10.n()
            r2.s(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36934n4.s(com.google.android.gms.measurement.internal.o4, com.google.android.gms.measurement.internal.o4, long, boolean, android.os.Bundle):void");
    }

    @j.l0
    public final void t(C36941o4 c36941o4, boolean z12, long j12) {
        I2 i22 = this.f355183a;
        C37005y c37005yI = i22.i();
        i22.f354722n.getClass();
        c37005yI.i(SystemClock.elapsedRealtime());
        if (!super.h().f355159f.a(j12, c36941o4 != null && c36941o4.f355295d, z12) || c36941o4 == null) {
            return;
        }
        c36941o4.f355295d = false;
    }

    @j.K
    public final void u(Activity activity) {
        synchronized (this.f355286l) {
            this.f355285k = false;
            this.f355282h = true;
        }
        this.f355183a.f354722n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.f355183a.f354715g.t()) {
            this.f355277c = null;
            super.zzl().n(new RunnableC36961r4(this, jElapsedRealtime));
        } else {
            C36941o4 c36941o4W = w(activity);
            this.f355278d = this.f355277c;
            this.f355277c = null;
            super.zzl().n(new RunnableC36982u4(this, c36941o4W, jElapsedRealtime));
        }
    }

    @j.K
    public final void v(Activity activity) {
        synchronized (this.f355286l) {
            this.f355285k = true;
            if (activity != this.f355281g) {
                synchronized (this.f355286l) {
                    this.f355281g = activity;
                    this.f355282h = false;
                }
                if (this.f355183a.f354715g.t()) {
                    this.f355283i = null;
                    super.zzl().n(new RunnableC36975t4(this));
                }
            }
        }
        if (!this.f355183a.f354715g.t()) {
            this.f355277c = this.f355283i;
            super.zzl().n(new RunnableC36968s4(this));
            return;
        }
        o(activity, w(activity), false);
        C37005y c37005yI = this.f355183a.i();
        c37005yI.f355183a.f354722n.getClass();
        c37005yI.zzl().n(new Z(c37005yI, SystemClock.elapsedRealtime()));
    }

    @j.K
    public final C36941o4 w(@j.N Activity activity) {
        C36729v.j(activity);
        C36941o4 c36941o4 = (C36941o4) this.f355280f.get(activity);
        if (c36941o4 == null) {
            C36941o4 c36941o42 = new C36941o4(null, m(activity.getClass()), super.c().r0());
            this.f355280f.put(activity, c36941o42);
            c36941o4 = c36941o42;
        }
        return this.f355283i != null ? this.f355283i : c36941o4;
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
