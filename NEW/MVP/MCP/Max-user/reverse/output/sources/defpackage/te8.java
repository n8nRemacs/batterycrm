package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.fragment.app.b;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import org.apache.http.HttpStatus;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* loaded from: classes2.dex */
public final class te8 implements t3h, jc8, cf5, qf8, lyb, ezf, qp5, fvf, lva {
    public static final /* synthetic */ int Y = 0;
    public Object a;
    public Object b;
    public Object c;
    public static final y21 d = new y21(-9223372036854775807L, 0, 5, false);
    public static final y21 o = new y21(-9223372036854775807L, 2, 5, false);
    public static final y21 X = new y21(-9223372036854775807L, 3, 5, false);

    public /* synthetic */ te8(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static sl4 f(vz8 vz8Var) {
        fn4 fn4Var = new fn4();
        fn4Var.c = null;
        Uri uri = vz8Var.b;
        String string = uri == null ? null : uri.toString();
        boolean z = vz8Var.f;
        dl6 dl6Var = new dl6();
        hsi.b((z && TextUtils.isEmpty(string)) ? false : true);
        dl6Var.b = fn4Var;
        dl6Var.c = string;
        dl6Var.a = z;
        dl6Var.d = new HashMap();
        rrg rrgVarG = vz8Var.c.entrySet().iterator();
        while (rrgVarG.hasNext()) {
            Map.Entry entry = (Map.Entry) rrgVarG.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) dl6Var.d)) {
                ((HashMap) dl6Var.d).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = cy0.a;
        tha thaVar = new tha(18);
        UUID uuid2 = vz8Var.a;
        uuid2.getClass();
        boolean z2 = vz8Var.d;
        boolean z3 = vz8Var.e;
        int[] iArrI = jni.i(vz8Var.g);
        int length = iArrI.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArrI[i];
            hsi.b(i2 == 2 || i2 == 1);
        }
        sl4 sl4Var = new sl4(uuid2, dl6Var, map, z2, (int[]) iArrI.clone(), z3, thaVar);
        byte[] bArr = vz8Var.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        hsi.g(sl4Var.m.isEmpty());
        sl4Var.v = bArrCopyOf;
        return sl4Var;
    }

    public boolean A() {
        return ((cc8) this.b) != null;
    }

    public String B() {
        if (!y()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.a;
        this.a = null;
        return str;
    }

    public void C(k38 k38Var) {
        cz1 cz1Var = (cz1) this.c;
        if (cz1Var != null) {
            cz1Var.run();
        }
        cz1 cz1Var2 = new cz1((l48) this.a, k38Var);
        this.c = cz1Var2;
        ((Handler) this.b).postAtFrontOfQueue(cz1Var2);
    }

    public void D(gc8 gc8Var) {
        hkd hkdVar = (hkd) this.a;
        cc8 cc8Var = (cc8) this.b;
        if (cc8Var != null) {
            cc8Var.a(true);
        }
        if (gc8Var != null) {
            hkdVar.execute(new r98(3, gc8Var));
        }
        hkdVar.b.accept(hkdVar.a);
    }

    public void E() {
        FrgLocationMap frgLocationMap = (FrgLocationMap) this.b;
        Context contextV = frgLocationMap.v();
        String[] strArr = lfi.b;
        if (!lfi.b(contextV, strArr)) {
            FrgDlgPermissions frgDlgPermissionsY0 = FrgDlgPermissions.y0(strArr, mvd.j1, mvd.h1, mvd.i1, false);
            frgDlgPermissionsY0.q0(frgLocationMap, 169);
            frgDlgPermissionsY0.x0(frgLocationMap.x(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
        } else {
            Context contextV2 = frgLocationMap.v();
            if (contextV2 == null) {
                return;
            }
            u().getClass();
            ew6.a(contextV2, this);
        }
    }

    public void F(ec8 ec8Var, bc8 bc8Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        hsi.h(looperMyLooper);
        this.c = null;
        cc8 cc8Var = new cc8(this, looperMyLooper, ec8Var, bc8Var, i, SystemClock.elapsedRealtime(), 1);
        hsi.g(((cc8) this.b) == null);
        this.b = cc8Var;
        cc8Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.t3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.jc8
    public void b() throws IOException {
        IOException iOException = (IOException) this.c;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) this.b;
        if (cc8Var != null) {
            int i = cc8Var.b;
            IOException iOException2 = cc8Var.d;
            if (iOException2 != null && cc8Var.o > i) {
                throw iOException2;
            }
        }
    }

    public void c() {
        cc8 cc8Var = (cc8) this.b;
        hsi.h(cc8Var);
        cc8Var.a(false);
    }

    @Override // defpackage.ezf
    public void d(l0g l0gVar) {
        u0g u0gVar = (u0g) this.c;
        long j = ((sm) this.a).a;
        CopyOnWriteArraySet copyOnWriteArraySet = u0gVar.c;
        boolean zContains = copyOnWriteArraySet.contains(Long.valueOf(j));
        if (zContains) {
            copyOnWriteArraySet.remove(Long.valueOf(j));
            ((a3g) u0gVar.d.getValue()).d(j);
        }
        if (zContains) {
            wqi.c(u0g.z0, "executeTask: cancelling task after processing with requestId=" + ((sm) this.a).a, new Object[0]);
            return;
        }
        if (!((ExecutorService) ((u0g) this.c).w0.getValue()).isShutdown()) {
            if (((j1g) this.b).b().a.get()) {
                return;
            }
            ((ExecutorService) ((u0g) this.c).w0.getValue()).execute(new q0g(this, (sm) this.a, (j1g) this.b, l0gVar));
            return;
        }
        boolean z = ((sm) this.a) instanceof ji8;
        if (z) {
            u0g u0gVar2 = (u0g) this.c;
            if (!z || u0gVar2.b == null) {
                return;
            }
            wqi.c(u0g.z0, "countDownSyncLogoutLatch", new Object[0]);
            u0gVar2.b.countDown();
        }
    }

    @Override // defpackage.ezf
    public void e(pzf pzfVar) {
        if (((ExecutorService) ((u0g) this.c).w0.getValue()).isShutdown() || ((j1g) this.b).b().a.get()) {
            return;
        }
        ((ExecutorService) ((u0g) this.c).w0.getValue()).execute(new r0g(this, (j1g) this.b, (sm) this.a, pzfVar));
    }

    @Override // defpackage.fvf
    public int g() {
        return u45.q(12, vw4.d().getDisplayMetrics().density, ((gvf) this.b).getMeasuredHeight() - ((jr7) this.c).getMeasuredHeight());
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new mig(new iwf(), new nwf(), (i0e) ((hk4) this.a).get(), (awg) ((vl3) this.b).get(), (y4i) ((ywf) this.c).get());
    }

    @Override // defpackage.fvf
    public int h() {
        return ((jr7) this.c).getTop();
    }

    @Override // defpackage.cf5
    public boolean i(int i) {
        return ((jkc) this.a).i(i) && w(i) != null;
    }

    @Override // defpackage.fvf
    public void j() {
        ((ljh) ((VpnPanelWidget) this.a).b.getValue()).b.o(dxg.c);
    }

    @Override // defpackage.ezf
    public long k() {
        return ((sm) this.a).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r0 != 4) goto L20;
     */
    @Override // defpackage.lyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.x26 l(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            fde r0 = (defpackage.fde) r0
            java.util.Set r0 = r0.r()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            yyb r2 = (defpackage.yyb) r2
            long r2 = r2.a
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto Lc
            goto L21
        L20:
            r1 = 0
        L21:
            yyb r1 = (defpackage.yyb) r1
            if (r1 != 0) goto L26
            goto L37
        L26:
            int r0 = r1.c
            int r0 = defpackage.az1.v(r0)
            if (r0 == 0) goto L43
            r1 = 1
            if (r0 == r1) goto L3a
            r1 = 3
            if (r0 == r1) goto L43
            r1 = 4
            if (r0 == r1) goto L43
        L37:
            fd5 r5 = defpackage.fd5.a
            return r5
        L3a:
            java.lang.Object r0 = r4.c
            i5i r0 = (defpackage.i5i) r0
            x26 r5 = r0.l(r5)
            return r5
        L43:
            java.lang.Object r0 = r4.b
            r5j r0 = (defpackage.r5j) r0
            x26 r5 = r0.l(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.l(long):x26");
    }

    @Override // defpackage.fvf
    public View m() {
        return (jr7) this.c;
    }

    @Override // defpackage.cf5
    public df5 n(int i) {
        return w(i);
    }

    @Override // defpackage.fvf
    public int o() {
        return ((gvf) this.b).getMeasuredHeight();
    }

    @Override // defpackage.fvf
    public void onDismiss() {
        ((ljh) ((VpnPanelWidget) this.a).b.getValue()).b.o(dxg.c);
    }

    @Override // defpackage.lva
    public void p(Task task) {
        fud fudVar = (fud) this.b;
        String str = (String) this.a;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        synchronized (fudVar.a) {
            fudVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public k55 q(k09 k09Var) {
        sl4 sl4Var;
        k09Var.b.getClass();
        vz8 vz8Var = k09Var.b.c;
        if (vz8Var == null) {
            return k55.a;
        }
        synchronized (this.a) {
            try {
                if (!vz8Var.equals((vz8) this.b)) {
                    this.b = vz8Var;
                    this.c = f(vz8Var);
                }
                sl4Var = (sl4) this.c;
                sl4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sl4Var;
    }

    public m14 r() {
        return (m14) ((bwf) this.b).getValue();
    }

    @Override // defpackage.qf8
    public void s() {
        wqi.c("te8", "onSuccessCheckSettings", new Object[0]);
    }

    @Override // defpackage.qf8
    public void t(Exception exc) throws IntentSender.SendIntentException {
        b bVarT;
        wqi.e("te8", "onFailureCheckSettings", exc);
        u().getClass();
        if ((exc instanceof ResolvableApiException) && (bVarT = ((FrgLocationMap) this.b).t()) != null) {
            try {
                u().getClass();
                if (exc == null) {
                    return;
                }
                PendingIntent pendingIntent = ((ResolvableApiException) exc).a.c;
                if (pendingIntent != null) {
                    s5j.g(pendingIntent);
                    bVarT.startIntentSenderForResult(pendingIntent.getIntentSender(), HttpStatus.SC_MOVED_PERMANENTLY, null, 0, 0, 0);
                }
            } catch (IntentSender.SendIntentException unused) {
                wqi.b("te8", "Can't resolve check settings error", exc);
                ((y3b) ((yi5) this.a)).a(new IllegalStateException("Can't resolve check settings error"));
            }
        }
    }

    public ew6 u() {
        if (((ew6) this.c) == null) {
            this.c = (ew6) ((t1b) ((qm3) ((FrgLocationMap) this.b).l1.b)).getAccessor().c(105);
        }
        return (ew6) this.c;
    }

    public Size[] v(int i) {
        List arrayList;
        ArrayList arrayList2;
        HashMap map = (HashMap) this.c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((zid) this.a).a).getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            gri.i("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        xt4 xt4Var = (xt4) this.b;
        xt4Var.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) xt4Var.b) != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr));
            }
        }
        hj5 hj5Var = (hj5) xt4Var.c;
        hj5Var.getClass();
        if (((ExcludedSupportedSizesQuirk) rv4.a.e(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = hj5Var.a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(q0f.CLOSE_SOCKET_CODE_TIMEOUT, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(q0f.CLOSE_SOCKET_CODE_TIMEOUT, 3000));
                }
            } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(720, 720));
                    arrayList2.add(new Size(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST));
                }
            } else if (ExcludedSupportedSizesQuirk.f()) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(3264, 2448));
                    arrayList2.add(new Size(3264, 1836));
                    arrayList2.add(new Size(2448, 2448));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if (ExcludedSupportedSizesQuirk.e()) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(2576, 1932));
                    arrayList2.add(new Size(2560, 1440));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(9280, 6944));
                }
            } else {
                gri.i("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                arrayList = Collections.EMPTY_LIST;
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            arrayList3.removeAll(arrayList);
        }
        if (arrayList3.isEmpty()) {
            gri.i("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [df5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.df5 w(int r35) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.w(int):df5");
    }

    public boolean x() {
        return ((IOException) this.c) != null;
    }

    public boolean y() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.a) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.a = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.b).readLine();
                this.a = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.a = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public long z(zv3 zv3Var) {
        m14 m14VarR = r();
        long j = zv3Var.a;
        List list = zv3Var.f;
        uw3 uw3Var = new uw3(0L, j, 0, 0, zv3Var);
        ConcurrentHashMap concurrentHashMap = ((ul6) ((bwf) this.c).getValue()).a;
        m14VarR.getClass();
        lrd lrdVar = m14VarR.a;
        lrdVar.b();
        lrdVar.c();
        try {
            long jC = m14VarR.b.C(uw3Var);
            lrdVar.q();
            lrdVar.k();
            if (zv3Var.j == 0 || !zv3Var.a()) {
                Object obj = concurrentHashMap.get(Long.valueOf(j));
                if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                    concurrentHashMap.remove(Long.valueOf(j));
                    yid yidVar = xl6.a;
                    vl6 vl6VarB = xl6.b(list);
                    if (vl6VarB != null) {
                        String strB = m6g.b(zv3Var.p);
                        if (l8g.c(strB)) {
                            strB = "";
                        }
                        String strL = o7e.l(strB);
                        String str = vl6VarB.a;
                        String str2 = vl6VarB.b;
                        vl6 vl6Var = vl6VarB.c;
                        m14VarR.b(j, strL, str, str2, vl6Var != null ? vl6Var.a : null, vl6Var != null ? vl6Var.b : null);
                        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                        wy1.q(j, "update_fts_title_contacts2 for #", m14.class.getName());
                    }
                }
            }
            return jC;
        } catch (Throwable th) {
            lrdVar.k();
            throw th;
        }
    }

    public te8(k18 k18Var, k18 k18Var2, Context context) {
        this.c = context;
        this.a = k18Var;
        this.b = k18Var2;
    }

    public te8() {
        this.a = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public te8(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = zxg.a;
        this(new hkd(Executors.newSingleThreadExecutor(new nn3(2, strConcat)), new zb8(0)));
    }

    public te8(hkd hkdVar) {
        this.a = hkdVar;
    }

    public te8(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
