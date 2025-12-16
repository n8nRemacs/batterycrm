package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.metrics.LogSessionId;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ywf implements re4, m7i, yt, qp5 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ ywf(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static void j(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = ho7.o(str, ": EGL error: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbO.toString());
    }

    public static String n(String str) throws NoSuchAlgorithmException, IOException {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            return e.toString();
        }
    }

    public static void t(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    @Override // defpackage.m7i
    public void a(TotalCaptureResult totalCaptureResult) {
        if (((tu1) this.c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((tu1) this.c).b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // defpackage.m7i
    public void b(ukd ukdVar) {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            ukdVar.M(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // defpackage.m7i
    public float c() {
        Float f = (Float) ((i12) this.a).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.m7i
    public float d() {
        return 1.0f;
    }

    @Override // defpackage.m7i
    public Rect e() {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((i12) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // defpackage.m7i
    public void f(float f, tu1 tu1Var) {
        ((Rect) ((i12) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        tu1 tu1Var2 = (tu1) this.c;
        if (tu1Var2 != null) {
            tu1Var2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.d = (Rect) this.b;
        this.c = tu1Var;
    }

    @Override // defpackage.m7i
    public void g() {
        this.d = null;
        this.b = null;
        tu1 tu1Var = (tu1) this.c;
        if (tu1Var != null) {
            tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.c = null;
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new y4i((Executor) ((Provider) this.a).get(), (ri5) ((Provider) this.b).get(), (st7) ((u5i) this.c).get(), (wvf) ((Provider) this.d).get());
    }

    @Override // defpackage.yt
    public au h(g95 g95Var, Looper looper, zt ztVar, ym3 ym3Var) {
        pm4 pm4Var = new pm4();
        g95Var.getClass();
        ho4 ho4Var = new ho4((Context) this.a, pm4Var);
        lq4 lq4Var = new lq4();
        lq4Var.C = true;
        lq4Var.J = false;
        return new ggg((Context) this.a, g95Var, ho4Var, (bd3) this.b, ym3Var.b, looper, ztVar, (mwf) this.c, new cq4(new nq4(lq4Var)), (LogSessionId) this.d);
    }

    public ArrayList i(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.a;
        t(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.b;
        t(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            jl0 jl0Var = (jl0) list.get(i);
            if (!map.containsKey(jl0Var.b) && !map2.containsKey(Integer.valueOf(jl0Var.c))) {
                arrayList.add(jl0Var);
            }
        }
        return arrayList;
    }

    public bnb k(ti1 ti1Var, JSONObject jSONObject, fje fjeVar) {
        sf1 sf1Var = (sf1) this.b;
        p8a p8aVarF = sf1Var.f(jSONObject, ti1Var, "createAddOrUpdateParamsForAcceptedParticipant", sf1Var.h(fjeVar).a(), true);
        r8a r8aVarL = paj.l(jSONObject);
        ArrayList arrayListU = paj.u(jSONObject);
        imb imbVarN = paj.n(jSONObject);
        xi1 xi1VarG = paj.G(jSONObject);
        if (imbVarN == null) {
            imbVarN = yi1.t;
        }
        o81 o81VarH = paj.h(jSONObject);
        pmb uhaVar = new uha(26);
        pmb uhaVar2 = new uha(26);
        pmb uhaVar3 = new uha(26);
        pmb uhaVar4 = new uha(26);
        k5 k5Var = new k5(imbVarN);
        k5 k5Var2 = new k5(p8aVarF);
        if (r8aVarL != null) {
            uhaVar = new k5(r8aVarL);
        }
        k5 k5Var3 = new k5(arrayListU);
        if (o81VarH != null) {
            uhaVar2 = new k5(o81VarH);
        }
        pmb pmbVar = uhaVar;
        pmb pmbVar2 = uhaVar2;
        k5 k5Var4 = new k5(((usd) this.c).s(jSONObject, fjeVar));
        Integer numB = paj.B(jSONObject);
        if (numB != null) {
            uhaVar3 = new k5(numB);
        }
        if (xi1VarG != null) {
            uhaVar4 = new k5(xi1VarG);
        }
        return new bnb(ti1Var, k5Var, k5Var2, pmbVar, k5Var3, pmbVar2, k5Var4, uhaVar3, uhaVar4);
    }

    public bnb l(ti1 ti1Var, JSONObject jSONObject, fje fjeVar) {
        sf1 sf1Var = (sf1) this.b;
        p8a p8aVarF = sf1Var.f(jSONObject, ti1Var, "createAddOrUpdateParamsForCalledParticipant", sf1Var.h(fjeVar).a(), true);
        r8a r8aVarL = paj.l(jSONObject);
        ArrayList arrayListU = paj.u(jSONObject);
        o81 o81VarH = paj.h(jSONObject);
        Integer numB = paj.B(jSONObject);
        xi1 xi1VarG = paj.G(jSONObject);
        uha uhaVar = new uha(26);
        pmb uhaVar2 = new uha(26);
        pmb uhaVar3 = new uha(26);
        pmb uhaVar4 = new uha(26);
        pmb uhaVar5 = new uha(26);
        k5 k5Var = new k5(p8aVarF);
        if (r8aVarL != null) {
            uhaVar2 = new k5(r8aVarL);
        }
        k5 k5Var2 = new k5(arrayListU);
        if (o81VarH != null) {
            uhaVar3 = new k5(o81VarH);
        }
        pmb pmbVar = uhaVar2;
        k5 k5Var3 = new k5(((usd) this.c).s(jSONObject, fjeVar));
        if (numB != null) {
            uhaVar4 = new k5(numB);
        }
        if (xi1VarG != null) {
            uhaVar5 = new k5(xi1VarG);
        }
        return new bnb(ti1Var, uhaVar, k5Var, pmbVar, k5Var2, uhaVar3, k5Var3, uhaVar4, uhaVar5);
    }

    @Override // defpackage.re4
    public List m(long j, j37 j37Var, int i, int i2, long j2, long j3) {
        pb2 pb2Var = (pb2) this.c;
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            arrayList.addAll(((ck2) this.a).a(pb2Var.a, j, (qi9) this.b, (Set) this.d, true, i));
        }
        if (i2 > 0) {
            arrayList.addAll(((ck2) this.a).a(pb2Var.a, j, (qi9) this.b, (Set) this.d, false, i2));
        }
        return new ArrayList(arrayList);
    }

    public xwf o(v4i v4iVar) {
        String str = v4iVar.a;
        int i = v4iVar.b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        dsdVarC.k(2, i);
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "work_spec_id");
            int iC2 = s7j.c(cursorN, "generation");
            int iC3 = s7j.c(cursorN, "system_id");
            xwf xwfVar = null;
            String string = null;
            if (cursorN.moveToFirst()) {
                if (!cursorN.isNull(iC)) {
                    string = cursorN.getString(iC);
                }
                xwfVar = new xwf(string, cursorN.getInt(iC2), cursorN.getInt(iC3));
            }
            return xwfVar;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public void p(xwf xwfVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((ai) this.b).B(xwfVar);
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r1 = defpackage.az1.n("Error when loading library: ", r3, ", library hash is ");
        r1.append(n(r8));
        r1.append(", LD_LIBRARY_PATH is ");
        r1.append(r7);
        android.util.Log.e("SoFileLoaderImpl", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r6.b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto Lc
            java.lang.System.load(r8)
            return
        Lc:
            r1 = 4
            r7 = r7 & r1
            if (r7 != r1) goto L15
            java.lang.Object r7 = r6.c
        L12:
            java.lang.String r7 = (java.lang.String) r7
            goto L18
        L15:
            java.lang.Object r7 = r6.d
            goto L12
        L18:
            r1 = 0
            java.lang.Object r2 = r6.a     // Catch: java.lang.Throwable -> L7c java.lang.Throwable -> L7e
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch: java.lang.Throwable -> L7c java.lang.Throwable -> L7e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7c java.lang.Throwable -> L7e
            java.lang.Object r3 = r6.b     // Catch: java.lang.Throwable -> L79
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = r6.a     // Catch: java.lang.Throwable -> L79
            java.lang.Runtime r4 = (java.lang.Runtime) r4     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.facebook.soloader.SoLoader> r5 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r5, r7}     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5b
            java.lang.String r0 = "SoFileLoaderImpl"
            java.lang.String r1 = "Error when loading library: "
            java.lang.String r2 = ", library hash is "
            java.lang.StringBuilder r1 = defpackage.az1.n(r1, r3, r2)
            java.lang.String r8 = n(r8)
            r1.append(r8)
            java.lang.String r8 = ", LD_LIBRARY_PATH is "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.e(r0, r7)
        L5b:
            return
        L5c:
            r0 = move-exception
            r1 = r3
            goto L7a
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            g6f r0 = new g6f     // Catch: java.lang.Throwable -> L79
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
        L7a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
        L7c:
            r0 = move-exception
            goto L9d
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "nativeLoad() error during invocation for "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            r0.append(r8)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ": "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            r0.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L9d:
            if (r1 == 0) goto Lbf
            java.lang.String r2 = "SoFileLoaderImpl"
            java.lang.String r3 = "Error when loading library: "
            java.lang.String r4 = ", library hash is "
            java.lang.StringBuilder r1 = defpackage.az1.n(r3, r1, r4)
            java.lang.String r8 = n(r8)
            r1.append(r8)
            java.lang.String r8 = ", LD_LIBRARY_PATH is "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.e(r2, r7)
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywf.q(int, java.lang.String):void");
    }

    public xo8 r(JSONArray jSONArray, fje fjeVar) {
        yi1 yi1Var = (yi1) this.a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            ti1 ti1VarW = paj.w(jSONObject);
            if (ti1VarW.equals(yi1Var.a)) {
                yi1Var.r = ((usd) this.c).s(jSONObject, fjeVar);
                ArrayList arrayListU = paj.u(jSONObject);
                ArrayList arrayList3 = yi1Var.d;
                arrayList3.clear();
                arrayList3.addAll(arrayListU);
                Integer numB = paj.B(jSONObject);
                if (numB != null) {
                    yi1Var.s = numB.intValue();
                }
                sf1 sf1Var = (sf1) this.b;
                sf1Var.o(jSONObject, "handleConversationParticipants", sf1Var.g(fjeVar, 2), true, false, fjeVar, fjeVar);
            } else if ("ACCEPTED".equals(string)) {
                arrayList.add(k(ti1VarW, jSONObject, fjeVar));
            } else if ("CALLED".equals(string)) {
                arrayList.add(l(ti1VarW, jSONObject, fjeVar));
            } else {
                hashSet.add(ti1VarW);
            }
            vi1 vi1VarD = ((lt2) this.d).d(jSONObject);
            if (vi1VarD != null) {
                arrayList2.add(vi1VarD);
            }
        }
        return new xo8(arrayList, 29, arrayList2);
    }

    public void s() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.c);
            EGL14.eglDestroyContext((EGLDisplay) this.a, (EGLContext) this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.a);
        }
        ((Surface) this.d).release();
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        this.d = null;
    }

    public jl0 u(List list) {
        jl0 jl0Var;
        HashMap map = (HashMap) this.c;
        ArrayList arrayListI = i(list);
        if (arrayListI.size() < 2) {
            return (jl0) uni.b(arrayListI, null);
        }
        Collections.sort(arrayListI, new o00(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((jl0) arrayListI.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListI.size()) {
                break;
            }
            jl0 jl0Var2 = (jl0) arrayListI.get(i3);
            if (i2 == jl0Var2.c) {
                arrayList.add(new Pair(jl0Var2.b, Integer.valueOf(jl0Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (jl0) arrayListI.get(0);
            }
        }
        jl0 jl0Var3 = (jl0) map.get(arrayList);
        if (jl0Var3 != null) {
            return jl0Var3;
        }
        List listSubList = arrayListI.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((jl0) listSubList.get(i5)).d;
        }
        int iNextInt = ((Random) this.d).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                jl0Var = (jl0) uni.c(listSubList);
                break;
            }
            jl0Var = (jl0) listSubList.get(i);
            i6 += jl0Var.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        map.put(arrayList, jl0Var);
        return jl0Var;
    }

    public ywf(k5i k5iVar) {
        ArrayList arrayList;
        this.a = (GifImage) k5iVar.b;
        this.c = vc3.y((vc3) k5iVar.c);
        ArrayList arrayList2 = (ArrayList) k5iVar.d;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(vc3.y((vc3) it.next()));
            }
            arrayList = arrayList3;
        }
        this.d = arrayList;
        this.b = (String) k5iVar.o;
    }

    public ywf(int i) throws NoSuchMethodException, SecurityException {
        switch (i) {
            case 9:
                this.a = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = fwf.getNativeLoadRuntimeMethod();
                this.b = nativeLoadRuntimeMethod;
                String strJoin = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? fwf.getClassLoaderLdLoadLibrary() : null;
                this.c = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] strArrSplit = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(strArrSplit.length);
                    for (String str : strArrSplit) {
                        if (!str.contains("!")) {
                            arrayList.add(str);
                        }
                    }
                    strJoin = TextUtils.join(":", arrayList);
                }
                this.d = strJoin;
                break;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }
}
