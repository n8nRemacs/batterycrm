package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.C37203e;
import com.google.android.play.core.splitinstall.InterfaceC37201c;
import com.google.android.play.core.splitinstall.InterfaceC37205g;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.Z;
import com.google.android.play.core.splitinstall.g0;
import com.google.android.play.core.splitinstall.internal.S;
import com.google.android.play.core.splitinstall.internal.W;
import com.google.android.play.core.splitinstall.internal.X;
import com.google.android.play.core.splitinstall.internal.r0;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.zzo;
import j.P;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.testing.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37243a implements InterfaceC37201c {

    /* renamed from: o, reason: collision with root package name */
    public static final long f358838o = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f358839p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f358840a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f358841b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f358842c;

    /* renamed from: d, reason: collision with root package name */
    public final X f358843d;

    /* renamed from: e, reason: collision with root package name */
    public final S f358844e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f358845f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f358846g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f358847h;

    /* renamed from: i, reason: collision with root package name */
    public final zzo f358848i;

    /* renamed from: j, reason: collision with root package name */
    public final File f358849j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f358850k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f358851l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f358852m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f358853n;

    public C37243a(Context context, @P File file, g0 g0Var, X x12) {
        ThreadPoolExecutor threadPoolExecutorA = com.google.android.play.core.splitcompat.f.a();
        S s5 = new S(context);
        int i12 = m.f358881a;
        this.f358840a = new Handler(Looper.getMainLooper());
        this.f358850k = new AtomicReference();
        this.f358851l = Collections.synchronizedSet(new HashSet());
        this.f358852m = Collections.synchronizedSet(new HashSet());
        this.f358853n = new AtomicBoolean(false);
        this.f358841b = context;
        this.f358849j = file;
        this.f358842c = g0Var;
        this.f358843d = x12;
        this.f358847h = threadPoolExecutorA;
        this.f358844e = s5;
        this.f358846g = new r0();
        this.f358845f = new r0();
        this.f358848i = zzo.f358905b;
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final Task<Integer> a(C37203e c37203e) {
        int iIndexOf;
        String string;
        ArrayList arrayList;
        Integer numA;
        int i12;
        File[] fileArr;
        int i13;
        final C37203e c37203e2 = c37203e;
        char c12 = 0;
        int i14 = 2;
        try {
            AbstractC37204f abstractC37204fH = h(new u() { // from class: com.google.android.play.core.splitinstall.testing.n
                @Override // com.google.android.play.core.splitinstall.testing.u
                public final AbstractC37204f a(final AbstractC37204f abstractC37204f) {
                    final C37203e c37203e3 = c37203e2;
                    Callable callable = new Callable() { // from class: com.google.android.play.core.splitinstall.testing.q
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            int i15 = C37243a.f358839p;
                            AbstractC37204f abstractC37204f2 = abstractC37204f;
                            if (abstractC37204f2 == null || abstractC37204f2.d()) {
                                return AbstractC37204f.b(abstractC37204f2 != null ? 1 + abstractC37204f2.h() : 1, 1, 0, 0L, 0L, c37203e3.f358710a, new ArrayList());
                            }
                            throw new SplitInstallException(-1);
                        }
                    };
                    int i15 = zzbx.f358805b;
                    try {
                        return (AbstractC37204f) callable.call();
                    } catch (RuntimeException e12) {
                        throw e12;
                    } catch (Exception e13) {
                        throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e13);
                    }
                }
            });
            if (abstractC37204fH == null) {
                return f(-100);
            }
            int iH2 = abstractC37204fH.h();
            final ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = c37203e2.f358711b;
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Locale) it.next()).getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList4 = new ArrayList();
            File[] fileArrListFiles = this.f358849j.listFiles(new FileFilter() { // from class: com.google.android.play.core.splitinstall.testing.o
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i15 = C37243a.f358839p;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                return f(-5);
            }
            int length = fileArrListFiles.length;
            int i15 = 0;
            long length2 = 0;
            while (true) {
                arrayList = c37203e2.f358710a;
                if (i15 >= length) {
                    break;
                }
                File file = fileArrListFiles[i15];
                String strA = W.a(file);
                String str = strA.split("\\.config\\.", i14)[c12];
                hashSet.add(strA);
                if (arrayList.contains(str)) {
                    String str2 = strA.split("\\.config\\.", 2)[c12];
                    LocaleList locales = this.f358844e.f358738a.getResources().getConfiguration().getLocales();
                    fileArr = fileArrListFiles;
                    ArrayList arrayList5 = new ArrayList(locales.size());
                    i13 = length;
                    int i16 = 0;
                    while (true) {
                        i12 = iH2;
                        if (i16 >= locales.size()) {
                            break;
                        }
                        Locale locale = locales.get(i16);
                        arrayList5.add(String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry()))));
                        i16++;
                        iH2 = i12;
                    }
                    HashSet hashSet2 = new HashSet(arrayList5);
                    HashMap mapA = g().a(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapA.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        if (str3.contains("_")) {
                            str3 = str3.split("_", -1)[0];
                        }
                        hashSet4.add(str3);
                    }
                    hashSet4.addAll(this.f358852m);
                    hashSet4.addAll(arrayList2);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapA.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strA) || hashSet5.contains(strA)) {
                        length2 = file.length() + length2;
                        arrayList4.add(file);
                        break;
                    }
                    i15++;
                    c37203e2 = c37203e;
                    fileArrListFiles = fileArr;
                    length = i13;
                    iH2 = i12;
                    c12 = 0;
                    i14 = 2;
                } else {
                    i12 = iH2;
                    fileArr = fileArrListFiles;
                    i13 = length;
                }
                ArrayList arrayList6 = new ArrayList(this.f358851l);
                arrayList6.addAll(Arrays.asList("", "base"));
                HashMap mapA2 = g().a(arrayList6);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Locale locale2 = (Locale) it4.next();
                    if (mapA2.containsKey(locale2.getLanguage()) && ((Set) mapA2.get(locale2.getLanguage())).contains(strA)) {
                        length2 = file.length() + length2;
                        arrayList4.add(file);
                        break;
                        break;
                    }
                }
                i15++;
                c37203e2 = c37203e;
                fileArrListFiles = fileArr;
                length = i13;
                iH2 = i12;
                c12 = 0;
                i14 = 2;
            }
            int i17 = iH2;
            hashSet.toString();
            String.valueOf(arrayList);
            int size = arrayList.size();
            X x12 = this.f358843d;
            if (size != 1 || (numA = (Integer) ((y) x12.zza()).b().get(arrayList.get(0))) == null) {
                numA = ((y) x12.zza()).a();
            }
            if (numA != null) {
                return f(numA.intValue());
            }
            if (!hashSet.containsAll(new HashSet(arrayList))) {
                return f(-2);
            }
            Long lValueOf = Long.valueOf(length2);
            Integer numValueOf = Integer.valueOf(i17);
            i(1, 0, 0L, lValueOf, arrayList, numValueOf, arrayList2);
            this.f358847h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.p
                @Override // java.lang.Runnable
                public final void run() {
                    final C37243a c37243a = this.f358884b;
                    c37243a.getClass();
                    final ArrayList arrayList7 = new ArrayList();
                    final ArrayList arrayList8 = new ArrayList();
                    for (File file2 : arrayList4) {
                        String strA2 = W.a(file2);
                        Uri uriFromFile = Uri.fromFile(file2);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(uriFromFile, c37243a.f358841b.getContentResolver().getType(uriFromFile));
                        intent.addFlags(1);
                        intent.putExtra("module_name", strA2.split("\\.config\\.", 2)[0]);
                        intent.putExtra("split_id", strA2);
                        arrayList7.add(intent);
                        arrayList8.add(W.a(file2).split("\\.config\\.", 2)[0]);
                    }
                    AbstractC37204f abstractC37204f = (AbstractC37204f) c37243a.f358850k.get();
                    if (abstractC37204f == null) {
                        return;
                    }
                    final long j12 = abstractC37204f.j();
                    final List list = arrayList2;
                    c37243a.f358847h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            final long j13 = j12;
                            long j14 = j13 / 3;
                            long jMin = 0;
                            int i18 = 0;
                            while (true) {
                                final C37243a c37243a2 = c37243a;
                                if (i18 >= 3) {
                                    ThreadPoolExecutor threadPoolExecutor = c37243a2.f358847h;
                                    final List list2 = arrayList8;
                                    final List list3 = list;
                                    final List list4 = arrayList7;
                                    threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.g
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C37243a c37243a3 = c37243a2;
                                            if (c37243a3.f358853n.get()) {
                                                c37243a3.i(6, -6, null, null, null, null, null);
                                                return;
                                            }
                                            zzo zzoVar = c37243a3.f358848i;
                                            com.google.android.play.core.splitinstall.W wA2 = zzoVar.a();
                                            List list5 = list2;
                                            List list6 = list3;
                                            long j15 = j13;
                                            if (wA2 != null) {
                                                com.google.android.play.core.splitinstall.W wA3 = zzoVar.a();
                                                List list7 = list4;
                                                wA3.a(list7, new t(c37243a3, list5, list6, j15, false, list7));
                                            } else {
                                                c37243a3.f358851l.addAll(list5);
                                                c37243a3.f358852m.addAll(list6);
                                                Long lValueOf2 = Long.valueOf(j15);
                                                c37243a3.i(5, 0, lValueOf2, lValueOf2, null, null, null);
                                            }
                                        }
                                    });
                                    return;
                                }
                                c37243a2.getClass();
                                jMin = Math.min(j13, jMin + j14);
                                c37243a2.i(2, 0, Long.valueOf(jMin), Long.valueOf(j13), null, null, null);
                                SystemClock.sleep(C37243a.f358838o);
                                AbstractC37204f abstractC37204f2 = (AbstractC37204f) c37243a2.f358850k.get();
                                if (abstractC37204f2.i() == 9 || abstractC37204f2.i() == 7 || abstractC37204f2.i() == 6) {
                                    return;
                                } else {
                                    i18++;
                                }
                            }
                        }
                    });
                }
            });
            return C37030m.f(numValueOf);
        } catch (zzbx e12) {
            Class[] clsArr = {SplitInstallException.class};
            for (int i18 = 0; i18 <= 0; i18++) {
                Class cls = clsArr[i18];
                if (RuntimeException.class.isAssignableFrom(cls)) {
                    Object[] objArr = new Object[2];
                    int i19 = 0;
                    objArr[0] = "getCause";
                    objArr[1] = cls;
                    int i22 = 0;
                    for (int i23 = 2; i22 < i23; i23 = 2) {
                        Object obj = objArr[i22];
                        if (obj == null) {
                            string = "null";
                        } else {
                            try {
                                string = obj.toString();
                            } catch (Exception e13) {
                                String str4 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str4), (Throwable) e13);
                                StringBuilder sbA = androidx.appcompat.app.r.A("<", str4, " threw ");
                                sbA.append(e13.getClass().getName());
                                sbA.append(">");
                                string = sbA.toString();
                            }
                        }
                        objArr[i22] = string;
                        i22++;
                    }
                    StringBuilder sb2 = new StringBuilder(118);
                    int i24 = 0;
                    while (i19 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i24)) != -1) {
                        sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i24, iIndexOf);
                        sb2.append(objArr[i19]);
                        i19++;
                        i24 = iIndexOf + 2;
                    }
                    sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i24, 86);
                    if (i19 < 2) {
                        sb2.append(" [");
                        sb2.append(objArr[i19]);
                        for (int i25 = i19 + 1; i25 < 2; i25++) {
                            sb2.append(", ");
                            sb2.append(objArr[i25]);
                        }
                        sb2.append(']');
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            if (SplitInstallException.class.isInstance(e12.getCause())) {
                return f(((SplitInstallException) ((Exception) SplitInstallException.class.cast(e12.getCause()))).f348894b.f348905b);
            }
            Exception cause = e12.getCause();
            ClassCastException classCastException = new ClassCastException("getCause(" + SplitInstallException.class + ") doesn't match underlying exception");
            classCastException.initCause(cause);
            throw classCastException;
        }
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final void b(InterfaceC37205g interfaceC37205g) {
        r0 r0Var = this.f358846g;
        synchronized (r0Var) {
            r0Var.f358796a.remove(interfaceC37205g);
        }
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final void c(InterfaceC37205g interfaceC37205g) {
        r0 r0Var = this.f358846g;
        synchronized (r0Var) {
            r0Var.f358796a.add(interfaceC37205g);
        }
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final boolean d(AbstractC37204f abstractC37204f, Ae0.c cVar) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final Set<String> e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f358842c.b());
        hashSet.addAll(this.f358851l);
        return hashSet;
    }

    public final Task f(@PY0.a final int i12) {
        h(new u() { // from class: com.google.android.play.core.splitinstall.testing.s
            @Override // com.google.android.play.core.splitinstall.testing.u
            public final AbstractC37204f a(AbstractC37204f abstractC37204f) {
                int i13 = C37243a.f358839p;
                if (abstractC37204f == null) {
                    return null;
                }
                return AbstractC37204f.b(abstractC37204f.h(), 6, i12, abstractC37204f.a(), abstractC37204f.j(), abstractC37204f.f(), abstractC37204f.e());
            }
        });
        return C37030m.e(new SplitInstallException(i12));
    }

    public final Z g() throws Resources.NotFoundException {
        Context context = this.f358841b;
        try {
            Z zA2 = this.f358842c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (zA2 != null) {
                return zA2;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e12) {
            throw new IllegalStateException("App is not found in PackageManager", e12);
        }
    }

    @P
    public final synchronized AbstractC37204f h(u uVar) {
        AbstractC37204f abstractC37204f = (AbstractC37204f) this.f358850k.get();
        AbstractC37204f abstractC37204fA = uVar.a(abstractC37204f);
        AtomicReference atomicReference = this.f358850k;
        while (!atomicReference.compareAndSet(abstractC37204f, abstractC37204fA)) {
            if (atomicReference.get() != abstractC37204f && atomicReference.get() != abstractC37204f) {
                return null;
            }
        }
        return abstractC37204fA;
    }

    public final boolean i(final int i12, final int i13, @P final Long l12, @P final Long l13, @P final ArrayList arrayList, @P final Integer num, @P final ArrayList arrayList2) {
        final AbstractC37204f abstractC37204fH = h(new u() { // from class: com.google.android.play.core.splitinstall.testing.j
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
            @Override // com.google.android.play.core.splitinstall.testing.u
            public final AbstractC37204f a(AbstractC37204f abstractC37204f) {
                int i14 = C37243a.f358839p;
                if (abstractC37204f == null) {
                    abstractC37204f = AbstractC37204f.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                Integer num2 = num;
                int iH2 = num2 == null ? abstractC37204f.h() : num2.intValue();
                Long l14 = l12;
                long jA2 = l14 == null ? abstractC37204f.a() : l14.longValue();
                Long l15 = l13;
                long j12 = l15 == null ? abstractC37204f.j() : l15.longValue();
                List listF = arrayList;
                if (listF == null) {
                    listF = abstractC37204f.f();
                }
                List list = listF;
                ?? r02 = arrayList2;
                return AbstractC37204f.b(iH2, i12, i13, jA2, j12, list, r02 == 0 ? abstractC37204f.e() : r02);
            }
        });
        if (abstractC37204fH == null) {
            return false;
        }
        this.f358840a.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.i
            @Override // java.lang.Runnable
            public final void run() {
                C37243a c37243a = this.f358866b;
                r0 r0Var = c37243a.f358845f;
                AbstractC37204f abstractC37204f = abstractC37204fH;
                r0Var.a(abstractC37204f);
                c37243a.f358846g.a(abstractC37204f);
            }
        });
        return true;
    }
}
