package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.N;
import com.google.android.play.core.splitinstall.f0;
import com.google.android.play.core.splitinstall.g0;
import com.google.android.play.core.splitinstall.internal.C37215h;
import com.google.android.play.core.splitinstall.internal.C37218k;
import com.google.android.play.core.splitinstall.internal.C37220m;
import com.google.android.play.core.splitinstall.internal.C37222o;
import com.google.android.play.core.splitinstall.internal.InterfaceC37221n;
import com.google.android.play.core.splitinstall.internal.K;
import com.google.android.play.core.splitinstall.internal.s0;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.l0;
import com.google.android.play.core.splitinstall.zzo;
import j.B;
import j.X;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f358652e = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f358653a;

    /* renamed from: b, reason: collision with root package name */
    public final N f358654b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public final HashSet f358655c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final c f358656d;

    public a(Context context) {
        try {
            this.f358653a = new g(context);
            this.f358656d = new c();
            this.f358654b = new N(context);
        } catch (PackageManager.NameNotFoundException e12) {
            throw new zzbh("Failed to initialize FileStorage", e12);
        }
    }

    public static boolean c(final Context context, boolean z12) {
        boolean z13;
        AtomicReference atomicReference = f358652e;
        a aVar = new a(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z13 = false;
                    break;
                }
            } else {
                z13 = true;
                break;
            }
        }
        a aVar2 = (a) atomicReference.get();
        if (z13) {
            zzo zzoVar = zzo.f358905b;
            ThreadPoolExecutor threadPoolExecutorA = f.a();
            g gVar = aVar2.f358653a;
            new C37215h();
            C37220m c37220m = new C37220m(context, gVar);
            new u();
            zzo.f358906c.set(new C37218k(context, threadPoolExecutorA, c37220m, aVar2.f358653a));
            r rVar = new r(aVar2);
            AtomicReference atomicReference2 = f0.f358714a;
            while (!atomicReference2.compareAndSet(null, rVar) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            f.a().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.q
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    AtomicReference atomicReference3 = a.f358652e;
                    try {
                        l0 l0VarC = l0.c(context2);
                        synchronized (l0VarC) {
                            l0VarC.f358795f = true;
                            l0VarC.b();
                        }
                    } catch (SecurityException unused) {
                    }
                }
            });
        }
        try {
            aVar2.b(context, z12);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            g gVar = this.f358653a;
            gVar.getClass();
            File file = new File(gVar.g(), "verified-splits");
            g.e(file);
            g.c(g.d(file, String.valueOf(str).concat(".apk")));
        }
        N n12 = this.f358654b;
        n12.getClass();
        synchronized (N.class) {
            n12.f358690a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    @X
    public final synchronized void b(Context context, boolean z12) {
        try {
            if (z12) {
                this.f358653a.b();
            } else {
                f.a().execute(new s(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet hashSetA = this.f358653a.a();
                Set setA = this.f358654b.a();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    String strB = ((v) it.next()).b();
                    if (!arrayList.contains(strB)) {
                        s0 s0Var = g0.f358715c;
                        if (setA.contains(strB.startsWith("config.") ? "" : strB.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet.add(strB);
                    it.remove();
                }
                if (z12) {
                    a(hashSet);
                } else if (!hashSet.isEmpty()) {
                    f.a().execute(new t(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSetA.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((v) it2.next()).b();
                    if (!g0.c(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!g0.c(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet hashSet3 = new HashSet(hashSetA.size());
                Iterator it3 = hashSetA.iterator();
                while (it3.hasNext()) {
                    v vVar = (v) it3.next();
                    String strB3 = vVar.b();
                    s0 s0Var2 = g0.f358715c;
                    if (!strB3.startsWith("config.")) {
                        String strB4 = vVar.b();
                        if (hashSet2.contains(strB4.startsWith("config.") ? "" : strB4.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet3.add(vVar);
                }
                p pVar = new p(this.f358653a);
                InterfaceC37221n interfaceC37221nA = C37222o.a();
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z12) {
                    interfaceC37221nA.a(classLoader, pVar.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        v vVar2 = (v) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        p.b(vVar2, new j(pVar, vVar2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            interfaceC37221nA.a(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    v vVar3 = (v) it5.next();
                    try {
                        ZipFile zipFile2 = new ZipFile(vVar3.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null) {
                                g gVar = this.f358653a;
                                String strB5 = vVar3.b();
                                gVar.getClass();
                                File file = new File(gVar.g(), "dex");
                                g.e(file);
                                File fileD = g.d(file, strB5);
                                g.e(fileD);
                                if (!interfaceC37221nA.b(classLoader, fileD, vVar3.a(), z12)) {
                                    "split was not installed ".concat(vVar3.a().toString());
                                }
                            }
                            hashSet5.add(vVar3.a());
                        } catch (IOException e12) {
                            e = e12;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e13) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e13);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e14) {
                        e = e14;
                    }
                }
                synchronized (this.f358656d) {
                    AssetManager assets = context.getAssets();
                    Iterator it6 = hashSet5.iterator();
                    while (it6.hasNext()) {
                        ((Integer) K.b(assets, "addAssetPath", Integer.class, String.class, ((File) it6.next()).getPath())).getClass();
                    }
                }
                HashSet hashSet6 = new HashSet();
                Iterator it7 = hashSet3.iterator();
                while (it7.hasNext()) {
                    v vVar4 = (v) it7.next();
                    if (hashSet5.contains(vVar4.a())) {
                        hashSet6.add(vVar4.b());
                    }
                }
                synchronized (this.f358655c) {
                    this.f358655c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e15) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e15);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
