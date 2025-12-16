package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class N1 implements InterfaceC37110c {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358187f = new com.google.android.play.core.assetpacks.internal.F("AssetPackManager");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358188a;

    /* renamed from: b, reason: collision with root package name */
    public final K f358189b;

    /* renamed from: c, reason: collision with root package name */
    public final C37126h0 f358190c;

    /* renamed from: d, reason: collision with root package name */
    public final C37146p f358191d;

    /* renamed from: e, reason: collision with root package name */
    public final C37146p f358192e;

    public N1(Q q12, C37146p c37146p, K k12, C37196z0 c37196z0, C37126h0 c37126h0, C37146p c37146p2, C37165o1 c37165o1) {
        new Handler(Looper.getMainLooper());
        this.f358188a = q12;
        this.f358191d = c37146p;
        this.f358189b = k12;
        this.f358190c = c37126h0;
        this.f358192e = c37146p2;
    }

    public final void a(boolean z12) {
        com.google.android.play.core.assetpacks.internal.D d12;
        K k12 = this.f358189b;
        synchronized (k12) {
            d12 = k12.f358343e;
        }
        boolean z13 = d12 != null;
        K k13 = this.f358189b;
        synchronized (k13) {
            k13.f358344f = z12;
            k13.a();
        }
        if (!z12 || z13) {
            return;
        }
        ((Executor) this.f358192e.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.L1
            @Override // java.lang.Runnable
            public final void run() {
                N1 n12 = this.f358175b;
                a2 a2Var = (a2) n12.f358191d.a();
                final Q q12 = n12.f358188a;
                q12.getClass();
                HashMap map = new HashMap();
                com.google.android.play.core.assetpacks.internal.F f12 = Q.f358210c;
                HashMap map2 = new HashMap();
                try {
                    Iterator it = q12.f().iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        String strM = q12.m(file.getName());
                        W w12 = null;
                        if (strM != null) {
                            File file2 = new File(strM, "assets");
                            if (file2.isDirectory()) {
                                w12 = new W(0, strM, file2.getCanonicalPath());
                            } else {
                                f12.b("Failed to find assets directory: %s", file2);
                            }
                        }
                        if (w12 != null) {
                            map2.put(file.getName(), w12);
                        }
                    }
                } catch (IOException e12) {
                    f12.b("Could not process directory while scanning installed packs: %s", e12);
                }
                for (String str : map2.keySet()) {
                    map.put(str, Long.valueOf(Q.b(new File(q12.c(str), String.valueOf((int) Q.b(q12.c(str), true))), true)));
                }
                Task taskD = a2Var.d(map);
                C37146p c37146p = n12.f358192e;
                taskD.h((Executor) c37146p.a(), new InterfaceC37024g() { // from class: com.google.android.play.core.assetpacks.J1
                    @Override // com.google.android.gms.tasks.InterfaceC37024g
                    public final void onSuccess(Object obj) {
                        List list = (List) obj;
                        Q q13 = q12;
                        int iA2 = q13.f358214b.a();
                        Iterator it2 = q13.f().iterator();
                        while (it2.hasNext()) {
                            File file3 = (File) it2.next();
                            if (!list.contains(file3.getName()) && Q.b(file3, true) != iA2) {
                                Q.h(file3);
                            }
                        }
                    }
                });
                taskD.f((Executor) c37146p.a(), new InterfaceC37023f() { // from class: com.google.android.play.core.assetpacks.K1
                    @Override // com.google.android.gms.tasks.InterfaceC37023f
                    public final void onFailure(Exception exc) {
                        com.google.android.play.core.assetpacks.internal.F f13 = N1.f358187f;
                        N1.f358187f.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
                    }
                });
            }
        });
    }
}
