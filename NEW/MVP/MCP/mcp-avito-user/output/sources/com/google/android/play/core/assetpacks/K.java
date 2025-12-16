package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class K extends com.google.android.play.core.assetpacks.internal.E {

    /* renamed from: g, reason: collision with root package name */
    public final Q0 f358154g;

    /* renamed from: h, reason: collision with root package name */
    public final C37187w0 f358155h;

    /* renamed from: i, reason: collision with root package name */
    public final C37126h0 f358156i;

    /* renamed from: j, reason: collision with root package name */
    public final C37196z0 f358157j;

    /* renamed from: k, reason: collision with root package name */
    public final C37165o1 f358158k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f358159l;

    /* renamed from: m, reason: collision with root package name */
    public final C37146p f358160m;

    /* renamed from: n, reason: collision with root package name */
    public final C37146p f358161n;

    /* renamed from: o, reason: collision with root package name */
    public final C37146p f358162o;

    public K(Context context, Q0 q02, C37187w0 c37187w0, C37146p c37146p, C37196z0 c37196z0, C37126h0 c37126h0, C37146p c37146p2, C37146p c37146p3, C37165o1 c37165o1) {
        super(new com.google.android.play.core.assetpacks.internal.F("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f358159l = new Handler(Looper.getMainLooper());
        this.f358154g = q02;
        this.f358155h = c37187w0;
        this.f358160m = c37146p;
        this.f358157j = c37196z0;
        this.f358156i = c37126h0;
        this.f358161n = c37146p2;
        this.f358162o = c37146p3;
        this.f358158k = c37165o1;
    }

    @Override // com.google.android.play.core.assetpacks.internal.E
    public final void b(Intent intent) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        com.google.android.play.core.assetpacks.internal.F f12 = this.f358339a;
        if (bundleExtra == null) {
            f12.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            f12.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateB = AssetPackState.b(bundleExtra, stringArrayList.get(0), this.f358157j, this.f358158k, new N() { // from class: com.google.android.play.core.assetpacks.M
            @Override // com.google.android.play.core.assetpacks.N
            public final int a(int i12, String str) {
                return i12;
            }
        });
        f12.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateB);
        if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
            this.f358156i.getClass();
        }
        ((Executor) this.f358162o.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.H
            @Override // java.lang.Runnable
            public final void run() {
                K k12 = this.f358135b;
                final Q0 q02 = k12.f358154g;
                q02.getClass();
                final Bundle bundle = bundleExtra;
                if (((Boolean) q02.c(new P0() { // from class: com.google.android.play.core.assetpacks.E0
                    @Override // com.google.android.play.core.assetpacks.P0
                    public final Object a() {
                        Q0 q03 = q02;
                        q03.getClass();
                        Bundle bundle2 = bundle;
                        int i12 = bundle2.getInt("session_id");
                        if (i12 == 0) {
                            return Boolean.TRUE;
                        }
                        HashMap map = q03.f358218c;
                        Integer numValueOf = Integer.valueOf(i12);
                        if (!map.containsKey(numValueOf)) {
                            return Boolean.TRUE;
                        }
                        if (((N0) map.get(numValueOf)).f358186c.f358180d == 6) {
                            return Boolean.FALSE;
                        }
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("pack_names");
                        if (stringArrayList2 == null || stringArrayList2.isEmpty()) {
                            throw new C37184v0("Session without pack received.");
                        }
                        return Boolean.valueOf(!P.b(r0.f358186c.f358180d, bundle2.getInt(HY0.f.a("status", stringArrayList2.get(0)))));
                    }
                })).booleanValue()) {
                    k12.f358159l.post(new J(k12, assetPackStateB));
                    ((a2) k12.f358160m.a()).f();
                }
            }
        });
        ((Executor) this.f358161n.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.G
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                S0 s0A;
                K k12 = this.f358130b;
                final Q0 q02 = k12.f358154g;
                q02.getClass();
                final Bundle bundle = bundleExtra;
                if (!((Boolean) q02.c(new P0() { // from class: com.google.android.play.core.assetpacks.H0
                    @Override // com.google.android.play.core.assetpacks.P0
                    public final Object a() {
                        boolean z12;
                        O0 o02;
                        Q0 q03 = q02;
                        q03.getClass();
                        Bundle bundle2 = bundle;
                        int i12 = bundle2.getInt("session_id");
                        if (i12 == 0) {
                            return Boolean.FALSE;
                        }
                        HashMap map = q03.f358218c;
                        Integer numValueOf = Integer.valueOf(i12);
                        boolean z13 = false;
                        boolean z14 = true;
                        if (map.containsKey(numValueOf)) {
                            M0 m02 = q03.b(i12).f358186c;
                            String str = m02.f358177a;
                            int i13 = bundle2.getInt(HY0.f.a("status", str));
                            int i14 = m02.f358180d;
                            if (P.b(i14, i13)) {
                                Q0.f358215g.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i14));
                                int i15 = m02.f358180d;
                                C37146p c37146p = q03.f358220e;
                                if (i15 == 4) {
                                    ((a2) c37146p.a()).b(i12, str);
                                } else if (i15 == 5) {
                                    ((a2) c37146p.a()).a(i12);
                                } else if (i15 == 6) {
                                    ((a2) c37146p.a()).f(Arrays.asList(str));
                                }
                            } else {
                                m02.f358180d = i13;
                                if (i13 == 5 || i13 == 6 || i13 == 4) {
                                    q03.c(new D0(q03, i12));
                                    q03.f358217b.b(str);
                                } else {
                                    Iterator it = m02.f358182f.iterator();
                                    while (it.hasNext()) {
                                        O0 o03 = (O0) it.next();
                                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(HY0.f.b("chunk_intents", str, o03.f358194a));
                                        if (parcelableArrayList != null) {
                                            for (int i16 = 0; i16 < parcelableArrayList.size(); i16++) {
                                                if (parcelableArrayList.get(i16) != null && ((Intent) parcelableArrayList.get(i16)).getData() != null) {
                                                    ((K0) o03.f358197d.get(i16)).f358163a = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("pack_names");
                            if (stringArrayList2 == null || stringArrayList2.isEmpty()) {
                                throw new C37184v0("Session without pack received.");
                            }
                            String str2 = stringArrayList2.get(0);
                            long j12 = bundle2.getLong(HY0.f.a("pack_version", str2));
                            String string = bundle2.getString(HY0.f.a("pack_version_tag", str2), "");
                            int i17 = bundle2.getInt(HY0.f.a("status", str2));
                            long j13 = bundle2.getLong(HY0.f.a("total_bytes_to_download", str2));
                            List<String> stringArrayList3 = bundle2.getStringArrayList(HY0.f.a("slice_ids", str2));
                            ArrayList arrayList = new ArrayList();
                            if (stringArrayList3 == null) {
                                stringArrayList3 = Collections.emptyList();
                            }
                            for (String str3 : stringArrayList3) {
                                List parcelableArrayList2 = bundle2.getParcelableArrayList(HY0.f.b("chunk_intents", str2, str3));
                                ArrayList arrayList2 = new ArrayList();
                                if (parcelableArrayList2 == null) {
                                    parcelableArrayList2 = Collections.emptyList();
                                }
                                Iterator it2 = parcelableArrayList2.iterator();
                                while (it2.hasNext()) {
                                    if (((Intent) it2.next()) == null) {
                                        z14 = z13;
                                    }
                                    K0 k02 = new K0();
                                    k02.f358163a = z14;
                                    arrayList2.add(k02);
                                    z13 = false;
                                    z14 = true;
                                }
                                String string2 = bundle2.getString(HY0.f.b("uncompressed_hash_sha256", str2, str3));
                                long j14 = bundle2.getLong(HY0.f.b("uncompressed_size", str2, str3));
                                int i18 = bundle2.getInt(HY0.f.b("patch_format", str2, str3), 0);
                                if (i18 != 0) {
                                    o02 = new O0(str3, string2, j14, arrayList2, 0, i18);
                                    z12 = false;
                                } else {
                                    z12 = false;
                                    o02 = new O0(str3, string2, j14, arrayList2, bundle2.getInt(HY0.f.b("compression_format", str2, str3), 0), 0);
                                }
                                arrayList.add(o02);
                                z13 = z12;
                                z14 = true;
                            }
                            map.put(Integer.valueOf(i12), new N0(i12, bundle2.getInt("app_version_code"), new M0(str2, j12, i17, j13, arrayList, string)));
                        }
                        return Boolean.TRUE;
                    }
                })).booleanValue()) {
                    return;
                }
                C37187w0 c37187w0 = k12.f358155h;
                C37146p c37146p = c37187w0.f358527j;
                com.google.android.play.core.assetpacks.internal.F f13 = C37187w0.f358517k;
                f13.a("Run extractor loop", new Object[0]);
                AtomicBoolean atomicBoolean = c37187w0.f358526i;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    f13.e("runLoop already looping; return", new Object[0]);
                    return;
                }
                while (true) {
                    try {
                        s0A = c37187w0.f358525h.a();
                    } catch (C37184v0 e12) {
                        f13.b("Error while getting next extraction task: %s", e12.getMessage());
                        int i12 = e12.f358512b;
                        if (i12 >= 0) {
                            ((a2) c37146p.a()).a(i12);
                            c37187w0.a(i12, e12);
                        }
                        s0A = null;
                    }
                    if (s0A == null) {
                        atomicBoolean.set(false);
                        return;
                    }
                    try {
                        if (s0A instanceof C37167p0) {
                            c37187w0.f358519b.a((C37167p0) s0A);
                        } else if (s0A instanceof E1) {
                            c37187w0.f358520c.a((E1) s0A);
                        } else if (s0A instanceof C37121f1) {
                            c37187w0.f358521d.a((C37121f1) s0A);
                        } else if (s0A instanceof C37130i1) {
                            c37187w0.f358522e.a((C37130i1) s0A);
                        } else if (s0A instanceof C37176s1) {
                            c37187w0.f358523f.a((C37176s1) s0A);
                        } else if (s0A instanceof C37185v1) {
                            c37187w0.f358524g.a((C37185v1) s0A);
                        } else {
                            f13.b("Unknown task type: %s", s0A.getClass().getName());
                        }
                    } catch (Exception e13) {
                        f13.b("Error during extraction task: %s", e13.getMessage());
                        ((a2) c37146p.a()).a(s0A.f358230a);
                        c37187w0.a(s0A.f358230a, e13);
                    }
                }
            }
        });
    }
}
