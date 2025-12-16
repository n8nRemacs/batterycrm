package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzns;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.InterfaceC42151g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class M2 extends K1 {

    /* renamed from: a, reason: collision with root package name */
    public final C36997w5 f354801a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f354802b;

    /* renamed from: p, reason: collision with root package name */
    public String f354803p;

    public M2(C36997w5 c36997w5) {
        C36729v.j(c36997w5);
        this.f354801a = c36997w5;
        this.f354803p = null;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void B1(zzo zzoVar) {
        h4(zzoVar);
        f4(new N2(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void J(long j12, String str, String str2, String str3) {
        f4(new Q2(this, str2, str3, str, j12));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final List<zzae> S1(String str, String str2, zzo zzoVar) {
        h4(zzoVar);
        String str3 = zzoVar.f355567b;
        C36729v.j(str3);
        C36997w5 c36997w5 = this.f354801a;
        try {
            return (List) ((FutureTask) c36997w5.zzl().j(new T2(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e12) {
            c36997w5.zzj().f354889f.c("Failed to get conditional user properties", e12);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void U1(zzbe zzbeVar, zzo zzoVar) {
        C36729v.j(zzbeVar);
        h4(zzoVar);
        f4(new RunnableC36842a3(this, zzbeVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final List<zznb> W3(String str, String str2, boolean z12, zzo zzoVar) {
        h4(zzoVar);
        String str3 = zzoVar.f355567b;
        C36729v.j(str3);
        C36997w5 c36997w5 = this.f354801a;
        try {
            List<K5> list = (List) ((FutureTask) c36997w5.zzl().j(new R2(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (K5 k52 : list) {
                if (z12 || !N5.m0(k52.f354767c)) {
                    arrayList.add(new zznb(k52));
                }
            }
            return arrayList;
        } catch (InterruptedException e12) {
            e = e12;
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(S1.i(str3), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        } catch (ExecutionException e13) {
            e = e13;
            S1 s1Zzj2 = c36997w5.zzj();
            s1Zzj2.f354889f.a(S1.i(str3), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void Y0(zznb zznbVar, zzo zzoVar) {
        C36729v.j(zznbVar);
        h4(zzoVar);
        f4(new RunnableC36849b3(this, zznbVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final byte[] Y1(zzbe zzbeVar, String str) {
        C36729v.f(str);
        C36729v.j(zzbeVar);
        g4(str, true);
        C36997w5 c36997w5 = this.f354801a;
        S1 s1Zzj = c36997w5.zzj();
        I2 i22 = c36997w5.f355449l;
        R1 r12 = i22.f354721m;
        String str2 = zzbeVar.f355534b;
        s1Zzj.f354896m.c("Log and bundle. event", r12.c(str2));
        ((com.google.android.gms.common.util.k) c36997w5.zzb()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) ((FutureTask) c36997w5.zzl().m(new CallableC36856c3(this, zzbeVar, str))).get();
            if (bArr == null) {
                c36997w5.zzj().f354889f.c("Log and bundle returned null. appId", S1.i(str));
                bArr = new byte[0];
            }
            ((com.google.android.gms.common.util.k) c36997w5.zzb()).getClass();
            c36997w5.zzj().f354896m.d("Log and bundle processed. event, size, time_ms", i22.f354721m.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e12) {
            e = e12;
            S1 s1Zzj2 = c36997w5.zzj();
            s1Zzj2.f354889f.d("Failed to log and bundle. appId, event, error", S1.i(str), i22.f354721m.c(str2), e);
            return null;
        } catch (ExecutionException e13) {
            e = e13;
            S1 s1Zzj22 = c36997w5.zzj();
            s1Zzj22.f354889f.d("Failed to log and bundle. appId, event, error", S1.i(str), i22.f354721m.c(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final List<zzae> c2(String str, String str2, String str3) {
        g4(str, true);
        C36997w5 c36997w5 = this.f354801a;
        try {
            return (List) ((FutureTask) c36997w5.zzl().j(new W2(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e12) {
            c36997w5.zzj().f354889f.c("Failed to get conditional user properties as", e12);
            return Collections.emptyList();
        }
    }

    @j.k0
    public final void f4(Runnable runnable) {
        C36997w5 c36997w5 = this.f354801a;
        if (c36997w5.zzl().p()) {
            runnable.run();
        } else {
            c36997w5.zzl().n(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final zzaj g1(zzo zzoVar) {
        h4(zzoVar);
        String str = zzoVar.f355567b;
        C36729v.f(str);
        if (!zzns.zza()) {
            return new zzaj(null);
        }
        C36997w5 c36997w5 = this.f354801a;
        try {
            return (zzaj) ((FutureTask) c36997w5.zzl().m(new X2(this, zzoVar))).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e12) {
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(S1.i(str), "Failed to get consent. appId", e12);
            return new zzaj(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @j.InterfaceC42151g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g4(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "Unknown calling package name '"
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            com.google.android.gms.measurement.internal.w5 r2 = r4.f354801a
            if (r1 != 0) goto L94
            if (r6 == 0) goto L4e
            java.lang.Boolean r6 = r4.f354802b     // Catch: java.lang.SecurityException -> L3d
            if (r6 != 0) goto L46
            java.lang.String r6 = "com.google.android.gms"
            java.lang.String r1 = r4.f354803p     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = r6.equals(r1)     // Catch: java.lang.SecurityException -> L3d
            if (r6 != 0) goto L3f
            com.google.android.gms.measurement.internal.I2 r6 = r2.f355449l     // Catch: java.lang.SecurityException -> L3d
            android.content.Context r6 = r6.f354709a     // Catch: java.lang.SecurityException -> L3d
            int r1 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = com.google.android.gms.common.util.C.a(r1, r6)     // Catch: java.lang.SecurityException -> L3d
            if (r6 != 0) goto L3f
            com.google.android.gms.measurement.internal.I2 r6 = r2.f355449l     // Catch: java.lang.SecurityException -> L3d
            android.content.Context r6 = r6.f354709a     // Catch: java.lang.SecurityException -> L3d
            com.google.android.gms.common.j r6 = com.google.android.gms.common.C36734j.a(r6)     // Catch: java.lang.SecurityException -> L3d
            int r1 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = r6.b(r1)     // Catch: java.lang.SecurityException -> L3d
            if (r6 == 0) goto L3b
            goto L3f
        L3b:
            r6 = 0
            goto L40
        L3d:
            r6 = move-exception
            goto L84
        L3f:
            r6 = 1
        L40:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.SecurityException -> L3d
            r4.f354802b = r6     // Catch: java.lang.SecurityException -> L3d
        L46:
            java.lang.Boolean r6 = r4.f354802b     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.SecurityException -> L3d
            if (r6 != 0) goto L6c
        L4e:
            java.lang.String r6 = r4.f354803p     // Catch: java.lang.SecurityException -> L3d
            if (r6 != 0) goto L64
            com.google.android.gms.measurement.internal.I2 r6 = r2.f355449l     // Catch: java.lang.SecurityException -> L3d
            android.content.Context r6 = r6.f354709a     // Catch: java.lang.SecurityException -> L3d
            int r1 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L3d
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.android.gms.common.C36690i.f349291a     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = com.google.android.gms.common.util.C.b(r6, r1, r5)     // Catch: java.lang.SecurityException -> L3d
            if (r6 == 0) goto L64
            r4.f354803p = r5     // Catch: java.lang.SecurityException -> L3d
        L64:
            java.lang.String r6 = r4.f354803p     // Catch: java.lang.SecurityException -> L3d
            boolean r6 = r5.equals(r6)     // Catch: java.lang.SecurityException -> L3d
            if (r6 == 0) goto L6d
        L6c:
            return
        L6d:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.SecurityException -> L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L3d
            r1.<init>(r0)     // Catch: java.lang.SecurityException -> L3d
            r1.append(r5)     // Catch: java.lang.SecurityException -> L3d
            java.lang.String r0 = "'."
            r1.append(r0)     // Catch: java.lang.SecurityException -> L3d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.SecurityException -> L3d
            r6.<init>(r0)     // Catch: java.lang.SecurityException -> L3d
            throw r6     // Catch: java.lang.SecurityException -> L3d
        L84:
            com.google.android.gms.measurement.internal.S1 r0 = r2.zzj()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.S1.i(r5)
            com.google.android.gms.measurement.internal.U1 r0 = r0.f354889f
            java.lang.String r1 = "Measurement Service called with invalid calling package. appId"
            r0.c(r1, r5)
            throw r6
        L94:
            com.google.android.gms.measurement.internal.S1 r5 = r2.zzj()
            com.google.android.gms.measurement.internal.U1 r5 = r5.f354889f
            java.lang.String r6 = "Measurement Service called without app package"
            r5.b(r6)
            java.lang.SecurityException r5 = new java.lang.SecurityException
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M2.g4(java.lang.String, boolean):void");
    }

    @InterfaceC42151g
    public final void h4(zzo zzoVar) {
        C36729v.j(zzoVar);
        String str = zzoVar.f355567b;
        C36729v.f(str);
        g4(str, false);
        this.f354801a.P().R(zzoVar.f355568c, zzoVar.f355583r);
    }

    public final void i4(zzbe zzbeVar, zzo zzoVar) throws IOException {
        C36997w5 c36997w5 = this.f354801a;
        c36997w5.Q();
        c36997w5.k(zzbeVar, zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final List m(Bundle bundle, zzo zzoVar) {
        h4(zzoVar);
        String str = zzoVar.f355567b;
        C36729v.j(str);
        C36997w5 c36997w5 = this.f354801a;
        try {
            return (List) ((FutureTask) c36997w5.zzl().j(new CallableC36870e3(this, zzoVar, bundle))).get();
        } catch (InterruptedException | ExecutionException e12) {
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(S1.i(str), "Failed to get trigger URIs. appId", e12);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void q1(zzo zzoVar) {
        C36729v.f(zzoVar.f355567b);
        g4(zzoVar.f355567b, false);
        f4(new V2(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void s1(zzo zzoVar) {
        C36729v.f(zzoVar.f355567b);
        C36729v.j(zzoVar.f355588w);
        Y2 y22 = new Y2(this, zzoVar);
        C36997w5 c36997w5 = this.f354801a;
        if (c36997w5.zzl().p()) {
            y22.run();
        } else {
            c36997w5.zzl().o(y22);
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void t1(zzo zzoVar) {
        h4(zzoVar);
        f4(new O2(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final void w2(zzae zzaeVar, zzo zzoVar) {
        C36729v.j(zzaeVar);
        C36729v.j(zzaeVar.f355523d);
        h4(zzoVar);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.f355521b = zzoVar.f355567b;
        f4(new P2(this, zzaeVar2, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final List<zznb> x(String str, String str2, String str3, boolean z12) {
        g4(str, true);
        C36997w5 c36997w5 = this.f354801a;
        try {
            List<K5> list = (List) ((FutureTask) c36997w5.zzl().j(new U2(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (K5 k52 : list) {
                if (z12 || !N5.m0(k52.f354767c)) {
                    arrayList.add(new zznb(k52));
                }
            }
            return arrayList;
        } catch (InterruptedException e12) {
            e = e12;
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(S1.i(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        } catch (ExecutionException e13) {
            e = e13;
            S1 s1Zzj2 = c36997w5.zzj();
            s1Zzj2.f354889f.a(S1.i(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    public final String x1(zzo zzoVar) {
        h4(zzoVar);
        C36997w5 c36997w5 = this.f354801a;
        try {
            return (String) ((FutureTask) c36997w5.zzl().j(new A5(c36997w5, zzoVar))).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e12) {
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(S1.i(zzoVar.f355567b), "Failed to get app instance id. appId", e12);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.L1
    @InterfaceC42151g
    /* renamed from: m */
    public final void mo108m(final Bundle bundle, zzo zzoVar) {
        h4(zzoVar);
        final String str = zzoVar.f355567b;
        C36729v.j(str);
        f4(new Runnable() { // from class: com.google.android.gms.measurement.internal.L2
            @Override // java.lang.Runnable
            public final void run() {
                C36908k c36908k = this.f354772b.f354801a.f355440c;
                C36997w5.n(c36908k);
                c36908k.e();
                c36908k.i();
                String str2 = str;
                byte[] bArrZzbv = c36908k.f().q(new C36991w(c36908k.f355183a, "", str2, "dep", 0L, bundle)).zzbv();
                S1 s1Zzj = c36908k.zzj();
                s1Zzj.f354897n.a(c36908k.f355183a.f354721m.c(str2), "Saving default event parameters, appId, data size", Integer.valueOf(bArrZzbv.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str2);
                contentValues.put(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, bArrZzbv);
                try {
                    if (c36908k.l().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        c36908k.zzj().f354889f.c("Failed to insert default event parameters (got -1). appId", S1.i(str2));
                    }
                } catch (SQLiteException e12) {
                    S1 s1Zzj2 = c36908k.zzj();
                    s1Zzj2.f354889f.a(S1.i(str2), "Error storing default event parameters. appId", e12);
                }
            }
        });
    }
}
