package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class dl6 implements bp0, vta, kp5 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public dl6(gge ggeVar, boolean z) {
        this.b = ggeVar;
        this.a = z;
        this.c = new SparseArray();
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public sfg mo163B(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.c;
        kp5 kp5Var = (kp5) this.b;
        if (i2 != 3) {
            this.a = true;
            return kp5Var.mo163B(i, i2);
        }
        yof yofVar = (yof) sparseArray.get(i);
        if (yofVar != null) {
            return yofVar;
        }
        yof yofVar2 = new yof(kp5Var.mo163B(i, i2), (rof) this.d);
        sparseArray.put(i, yofVar2);
        return yofVar2;
    }

    @Override // defpackage.kp5
    public void Q(i9e i9eVar) {
        ((kp5) this.b).Q(i9eVar);
    }

    @Override // defpackage.vta
    public void b() {
        l42 l42Var = (l42) this.d;
        if (this.a) {
            if (l42Var.r()) {
                l42Var.resumeWith(this.c);
            }
        } else if (l42Var.r()) {
            l42Var.resumeWith(new ipd(new NoSuchElementException("No value received via onNext for ".concat("FIRST"))));
        }
    }

    @Override // defpackage.vta
    public void c(py4 py4Var) {
        this.b = py4Var;
        ((l42) this.d).e(new z11(19, py4Var));
    }

    @Override // defpackage.bp0
    public synchronized void clear() {
        try {
            vc3.P((qk4) this.d);
            this.d = null;
            int size = ((SparseArray) this.c).size();
            for (int i = 0; i < size; i++) {
                vc3.P((vc3) ((SparseArray) this.c).valueAt(i));
            }
            ((SparseArray) this.c).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bp0
    public synchronized boolean d(int i) {
        boolean zContainsKey;
        gge ggeVar = (gge) this.b;
        w84 w84Var = (w84) ggeVar.c;
        ff ffVar = new ff((hg) ggeVar.b, i);
        zk8 zk8Var = (zk8) w84Var;
        synchronized (zk8Var) {
            lk6 lk6Var = zk8Var.b;
            synchronized (lk6Var) {
                zContainsKey = ((LinkedHashMap) lk6Var.d).containsKey(ffVar);
            }
        }
        return zContainsKey;
    }

    public byte[] e(UUID uuid, cl5 cl5Var) throws MediaDrmCallbackException {
        String str = cl5Var.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            hsi.i(uri, "The uri must be set.");
            new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 0);
            throw new MediaDrmCallbackException(new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = cy0.e;
        map2.put(HTTP.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : cy0.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            map2.putAll((HashMap) this.d);
        }
        return t9j.a(((fn4) this.b).a(), str, cl5Var.a, map2);
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        l42 l42Var = (l42) this.d;
        int iV = az1.v(1);
        if (iV != 0 && iV != 1) {
            if (iV != 2 && iV != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.c = obj;
            this.a = true;
            return;
        }
        if (this.a) {
            return;
        }
        this.a = true;
        l42Var.resumeWith(obj);
        py4 py4Var = (py4) this.b;
        if (py4Var == null) {
            py4Var = null;
        }
        py4Var.dispose();
    }

    public byte[] g(dl5 dl5Var) {
        return t9j.a(((fn4) this.b).a(), dl5Var.b + "&signedRequest=" + zxg.q(dl5Var.a), null, Collections.EMPTY_MAP);
    }

    public int[] h() {
        synchronized (this) {
            try {
                if (!this.a) {
                    return null;
                }
                long[] jArr = (long[]) this.b;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.c;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.d;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.d)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.a = false;
                return (int[]) ((int[]) this.d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean i() {
        boolean z;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.a) {
                        Boolean boolN = n();
                        this.c = boolN;
                        if (boolN == null) {
                            ((ai5) ((bof) this.b)).a(new os5(9));
                        }
                        this.a = true;
                    }
                } finally {
                }
            }
            return zBooleanValue;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            h06 h06Var = ((FirebaseMessaging) this.d).a;
            h06Var.a();
            de4 de4Var = (de4) h06Var.g.get();
            synchronized (de4Var) {
                z = de4Var.a;
            }
            zBooleanValue = z;
        }
        return zBooleanValue;
    }

    public boolean j(ye yeVar) {
        fs3 fs3Var = (fs3) this.b;
        return yeVar.a == 0 && yeVar.b == 0 && yeVar.c == ((Rect) fs3Var.f).width() && yeVar.d == ((Rect) fs3Var.f).height();
    }

    public boolean k(int i) {
        if (i != 0) {
            ye[] yeVarArr = (ye[]) ((fs3) this.b).h;
            ye yeVar = yeVarArr[i];
            ye yeVar2 = yeVarArr[i - 1];
            yeVar.getClass();
            if (yeVar2.e != 2 || !j(yeVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bp0
    public synchronized vc3 l() {
        return mni.z(vc3.y((qk4) this.d));
    }

    @Override // defpackage.bp0
    public synchronized void m(int i, vc3 vc3Var) {
        qk4 qk4VarJ0;
        q(i);
        try {
            qk4VarJ0 = vc3.j0(CloseableStaticBitmap.of(vc3Var, fh7.d, 0));
            if (qk4VarJ0 != null) {
                try {
                    vc3.P((qk4) this.d);
                    gge ggeVar = (gge) this.b;
                    this.d = ((zk8) ((w84) ggeVar.c)).e(new ff((hg) ggeVar.b, i), qk4VarJ0, (x6i) ggeVar.d);
                } catch (Throwable th) {
                    th = th;
                    vc3.P(qk4VarJ0);
                    throw th;
                }
            }
            vc3.P(qk4VarJ0);
        } catch (Throwable th2) {
            th = th2;
            qk4VarJ0 = null;
        }
    }

    public Boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        h06 h06Var = ((FirebaseMessaging) this.d).a;
        h06Var.a();
        Context context = h06Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.bp0
    public synchronized void o(int i, vc3 vc3Var) {
        qk4 qk4VarJ0;
        try {
            qk4VarJ0 = vc3.j0(CloseableStaticBitmap.of(vc3Var, fh7.d, 0));
            if (qk4VarJ0 == null) {
                vc3.P(qk4VarJ0);
                return;
            }
            try {
                gge ggeVar = (gge) this.b;
                qk4 qk4VarE = ((zk8) ((w84) ggeVar.c)).e(new ff((hg) ggeVar.b, i), qk4VarJ0, (x6i) ggeVar.d);
                if (vc3.i0(qk4VarE)) {
                    vc3.P((vc3) ((SparseArray) this.c).get(i));
                    ((SparseArray) this.c).put(i, qk4VarE);
                    op5.e(dl6.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
                }
                qk4VarJ0.close();
            } catch (Throwable th) {
                th = th;
                vc3.P(qk4VarJ0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            qk4VarJ0 = null;
        }
    }

    @Override // defpackage.vta
    public void onError(Throwable th) {
        ((l42) this.d).resumeWith(new ipd(th));
    }

    @Override // defpackage.bp0
    public synchronized vc3 p() {
        if (!this.a) {
            return null;
        }
        return mni.z(((gge) this.b).c());
    }

    public synchronized void q(int i) {
        vc3 vc3Var = (vc3) ((SparseArray) this.c).get(i);
        if (vc3Var != null) {
            ((SparseArray) this.c).delete(i);
            vc3Var.close();
            op5.e(dl6.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r4 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(android.graphics.Bitmap r14, int r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl6.r(android.graphics.Bitmap, int):void");
    }

    @Override // defpackage.bp0
    public synchronized vc3 s(int i) {
        gge ggeVar;
        ggeVar = (gge) this.b;
        return mni.z(((zk8) ((w84) ggeVar.c)).get(new ff((hg) ggeVar.b, i)));
    }

    public void t() {
        wwf wwfVar = (wwf) this.d;
        if (this.a) {
            wwfVar.d(new o3(12, this));
            this.a = false;
        }
    }

    public void u(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new xaj(runnable, executor));
                } else {
                    this.a = true;
                    x(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                xaj xajVar = (xaj) ((ArrayDeque) this.c).remove();
                x(xajVar.b, xajVar.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp5
    public void w() {
        SparseArray sparseArray = (SparseArray) this.c;
        ((kp5) this.b).w();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((yof) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(new c5e(this, 16, runnable));
        } catch (RejectedExecutionException unused) {
            v();
        }
    }

    public dl6(int i, boolean z) {
        switch (i) {
            case 10:
                this.b = new Object();
                this.c = new ArrayDeque();
                this.d = new AtomicReference();
                break;
            default:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new i9g(0);
                break;
        }
    }

    public dl6(kp5 kp5Var, rof rofVar) {
        this.b = kp5Var;
        this.d = rofVar;
        this.c = new SparseArray();
    }

    public dl6(fs3 fs3Var, boolean z, ukd ukdVar) {
        this.b = fs3Var;
        this.c = ukdVar;
        this.a = z;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
