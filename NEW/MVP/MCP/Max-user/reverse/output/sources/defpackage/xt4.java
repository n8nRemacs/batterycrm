package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.hardware.camera2.CaptureResult;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.ViewPropertyAnimator;
import android.view.animation.TranslateAnimation;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ProcessingException;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class xt4 implements ooe, r02, CameraVideoCapturer.CameraSwitchHandler, rn6, rk3, idb, wqa, m1f {
    public static final xt4 d = new xt4(1);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ xt4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xt4 i(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            xt4 r2 = new xt4     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 13
            r2.<init>(r5, r3, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xt4.i(android.content.Context):xt4");
    }

    public void A() throws IOException {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void B(final a3b a3bVar, final r84 r84Var, final ts9 ts9Var) throws JSONException {
        String str;
        pze pzeVar = (pze) ((cm6) this.c).invoke();
        if (pzeVar == null) {
            ts9Var.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-participant-list-chunk");
        jSONObject.put("count", 0);
        int i = st6.$EnumSwitchMapping$0[az1.v(1)];
        if (i == 1) {
            str = "GRID";
        } else if (i == 2) {
            str = "SIDE";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ADMIN";
        }
        jSONObject.put("listType", str);
        fje fjeVar = (fje) a3bVar.b;
        if (fjeVar instanceof eje) {
            jSONObject.put("roomId", ((eje) fjeVar).a);
        }
        pzeVar.j(jSONObject, new mze() { // from class: rt6
            @Override // defpackage.mze
            public final void onResponse(JSONObject jSONObject2) {
                fje fjeVar2 = (fje) a3bVar.b;
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                g0f g0fVarI = jSONObjectOptJSONObject != null ? ((py0) this.a.b).I(jSONObjectOptJSONObject, fjeVar2) : null;
                if (g0fVarI != null) {
                    r84Var.invoke(g0fVarI);
                    return;
                }
                ts9Var.invoke(new RuntimeException("Can't parse chunk " + jSONObject2));
            }
        }, new e01(this, ts9Var, 2));
    }

    public void C(final fqi fqiVar) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
        if (this == d) {
            fqiVar.g();
            fqiVar.f();
        } else {
            if (viewPropertyAnimator != null) {
                final int i = 0;
                viewPropertyAnimator.withStartAction(new Runnable() { // from class: og
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                fqiVar.g();
                                break;
                            default:
                                fqiVar.f();
                                break;
                        }
                    }
                });
                final int i2 = 1;
                viewPropertyAnimator.withEndAction(new Runnable() { // from class: og
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                fqiVar.g();
                                break;
                            default:
                                fqiVar.f();
                                break;
                        }
                    }
                });
                return;
            }
            TranslateAnimation translateAnimation = (TranslateAnimation) this.c;
            if (translateAnimation != null) {
                translateAnimation.setAnimationListener(new pg(0, fqiVar));
            }
        }
    }

    public void D(ConversationEndReason conversationEndReason) {
        y6d y6dVar = (y6d) this.b;
        if (conversationEndReason == null) {
            return;
        }
        ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
        if (conversationEndReason2 == null) {
            this.c = conversationEndReason;
            y6dVar.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
            return;
        }
        y6dVar.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
    }

    public rfg E(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new q65();
            }
            if (i == iArr[i2]) {
                return ((gxd[]) this.c)[i2];
            }
            i2++;
        }
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 11:
                break;
            default:
                fsf fsfVar = (fsf) obj;
                fsfVar.getClass();
                try {
                    ((gsf) ((t86) this.c).a).j(fsfVar);
                    break;
                } catch (ProcessingException e) {
                    gri.c("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        ((rk3) this.c).b();
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        ty4.d((qu1) this.b, py4Var);
    }

    @Override // defpackage.o1f
    public void clear() {
        switch (this.a) {
            case 19:
                this.b = null;
                this.c = null;
                return;
        }
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.r02
    public void d(gk5 gk5Var) {
        CaptureResult captureResult = (CaptureResult) this.c;
        super.d(gk5Var);
        ArrayList arrayList = gk5Var.a;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                gk5Var.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            gri.i("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            gk5Var.c("ExposureTime", String.valueOf(r2.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            gk5Var.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r3.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            gk5Var.c("SensitivityType", String.valueOf(3), arrayList);
            gk5Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            gk5Var.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            int iV = az1.v(num2.intValue() == 0 ? 2 : 1);
            gk5Var.c("WhiteBalance", iV != 0 ? iV != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // defpackage.r02
    public ryf e() {
        return (ryf) this.b;
    }

    @Override // defpackage.wqa
    public void f(Executor executor, uqa uqaVar) {
        synchronized (((HashMap) this.c)) {
            eb8 eb8Var = (eb8) ((HashMap) this.c).get(uqaVar);
            if (eb8Var != null) {
                eb8Var.a.set(false);
            }
            eb8 eb8Var2 = new eb8(executor, uqaVar);
            ((HashMap) this.c).put(uqaVar, eb8Var2);
            ayi.d().execute(new se5(this, eb8Var, eb8Var2, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hn6, sm6] */
    @Override // defpackage.ooe
    public void g(long j, boolean z) {
        ((hn6) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // defpackage.r02
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.o1f
    public boolean isEmpty() {
        return ((j4a) ((AtomicReference) this.c).get()) == ((j4a) ((AtomicReference) this.b).get());
    }

    public void j(EventItemsMap eventItemsMap) {
        NetworkCapabilities networkCapabilities;
        String str = "unknown";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasTransport(4)) {
                    str = "vpn";
                } else if (networkCapabilities.hasTransport(1)) {
                    str = "wifi";
                } else if (networkCapabilities.hasTransport(0)) {
                    str = "cellular";
                }
            }
        } catch (Throwable th) {
            ((y6d) this.c).reportException("NetworkInfoStatistics", "Can't get network state", new IllegalStateException("get.network.state.error", th));
        }
        eventItemsMap.set("network_type", str);
    }

    public void k() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            return;
        }
        TranslateAnimation translateAnimation = (TranslateAnimation) this.c;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [em6, hn6] */
    @Override // defpackage.ooe
    public void l(long j) {
        ((hn6) this.c).invoke(Long.valueOf(j));
    }

    @Override // defpackage.r02
    public p02 m() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        p02 p02Var = p02.a;
        if (num == null) {
            return p02Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return p02.b;
        }
        if (iIntValue == 1) {
            return p02.c;
        }
        if (iIntValue == 2) {
            return p02.d;
        }
        if (iIntValue == 3) {
            return p02.o;
        }
        gri.b("C2CameraCaptureResult", "Undefined awb state: " + num);
        return p02Var;
    }

    public void n(nh4 nh4Var) {
        synchronized (nh4Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ud(this, 9, nh4Var));
        }
    }

    @Override // defpackage.r02
    public int o() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        gri.b("C2CameraCaptureResult", "Undefined flash state: " + num);
        return 1;
    }

    @Override // defpackage.o1f
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        j4a j4aVar = new j4a();
        j4aVar.a = obj;
        ((j4a) ((AtomicReference) this.b).getAndSet(j4aVar)).lazySet(j4aVar);
        return true;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchDone(boolean z) {
        d12 d12Var = (d12) this.c;
        String str = (String) this.b;
        d12Var.e.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (d12Var.g) {
            d12Var.h = str;
            d12Var.i = z;
            d12Var.j = false;
        }
        Iterator it = d12Var.f.iterator();
        while (it.hasNext()) {
            ((ie8) it.next()).i(d12Var, true);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchError(String str) {
        d12 d12Var = (d12) this.c;
        d12Var.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(wy1.h("onCameraSwitchError, ", str)));
        synchronized (d12Var.g) {
            d12Var.j = false;
        }
        Iterator it = d12Var.f.iterator();
        while (it.hasNext()) {
            ((ie8) it.next()).i(d12Var, false);
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void onError(Throwable th) {
        ((rk3) this.c).onError(th);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 11:
                jei.b();
                iac iacVar = (iac) this.b;
                kw6 kw6Var = (kw6) this.c;
                if (iacVar == ((iac) kw6Var.a)) {
                    gri.i("CaptureNode", "request aborted, id=" + ((iac) kw6Var.a).a);
                    xo8 xo8Var = (xo8) kw6Var.o;
                    if (xo8Var != null) {
                        xo8Var.c = null;
                    }
                    kw6Var.a = null;
                    break;
                }
                break;
            default:
                int i = ((dsf) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    gri.j("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + rmb.c(i), th);
                    break;
                } else {
                    gri.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wqa
    public ha8 p() {
        return ixi.a(new sl6(9, this));
    }

    @Override // defpackage.o1f
    public Object poll() {
        j4a j4aVar;
        AtomicReference atomicReference = (AtomicReference) this.c;
        j4a j4aVar2 = (j4a) atomicReference.get();
        j4a j4aVar3 = (j4a) j4aVar2.get();
        if (j4aVar3 != null) {
            Object obj = j4aVar3.a;
            j4aVar3.a = null;
            atomicReference.lazySet(j4aVar3);
            return obj;
        }
        if (j4aVar2 == ((j4a) ((AtomicReference) this.b).get())) {
            return null;
        }
        do {
            j4aVar = (j4a) j4aVar2.get();
        } while (j4aVar == null);
        Object obj2 = j4aVar.a;
        j4aVar.a = null;
        atomicReference.lazySet(j4aVar);
        return obj2;
    }

    @Override // defpackage.r02
    public n02 q() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        n02 n02Var = n02.a;
        if (num == null) {
            return n02Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return n02.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return n02.o;
            }
            if (iIntValue == 3) {
                return n02.X;
            }
            if (iIntValue == 4) {
                return n02.d;
            }
            if (iIntValue != 5) {
                gri.b("C2CameraCaptureResult", "Undefined ae state: " + num);
                return n02Var;
            }
        }
        return n02.c;
    }

    @Override // defpackage.wqa
    public void r(uqa uqaVar) {
        synchronized (((HashMap) this.c)) {
            try {
                eb8 eb8Var = (eb8) ((HashMap) this.c).remove(uqaVar);
                if (eb8Var != null) {
                    eb8Var.a.set(false);
                    ayi.d().execute(new qz5(this, 19, eb8Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r02
    public CaptureResult s() {
        return (CaptureResult) this.c;
    }

    public byte[] t(mi5 mi5Var) throws IOException {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(mi5Var.a);
            dataOutputStream.writeByte(0);
            String str = mi5Var.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(mi5Var.c);
            dataOutputStream.writeLong(mi5Var.d);
            dataOutputStream.write(mi5Var.o);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int u(ArrayList arrayList, j37 j37Var, int i, boolean z) {
        int size;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Comparator comparator = (Comparator) ((jv) this.c).invoke();
        int iC = n7j.c(i, 0, arrayList.size());
        int i2 = ve3.i(arrayList);
        int i3 = iC - 1;
        while (iC <= i2) {
            int i4 = (iC + i2) >>> 1;
            j37 j37Var2 = (j37) arrayList.get(i4);
            if (j37Var2 instanceof i37) {
                if (z) {
                    iC = i4 + 1;
                } else {
                    i2 = i4 - 1;
                }
            } else if (comparator.compare(j37Var2, j37Var) <= 0) {
                iC = i4 + 1;
                i3 = i4;
            } else {
                i2 = i4 - 1;
            }
        }
        int iC2 = n7j.c(i3 + 1, 0, arrayList.size());
        if (iC2 < arrayList.size() && (arrayList.get(iC2) instanceof i37)) {
            iC2++;
            int size2 = arrayList.size();
            if (iC2 > size2) {
                iC2 = size2;
            }
            j37 j37Var3 = (j37) ue3.J(iC2, arrayList);
            if (j37Var3 != null && comparator.compare(j37Var3, j37Var) < 0 && (iC2 = iC2 + 1) > (size = arrayList.size())) {
                return size;
            }
        }
        return iC2;
    }

    @Override // defpackage.r02
    public o02 v() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        o02 o02Var = o02.a;
        if (num == null) {
            return o02Var;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                gri.b("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return o02Var;
    }

    public int w() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return 3;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return 4;
            }
            if (iIntValue != 5) {
                gri.b("C2CameraCaptureResult", "Undefined af mode: " + num);
                return 1;
            }
        }
        return 2;
    }

    public ArrayList x(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        dsd dsdVarC = dsd.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.isNull(0) ? null : cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public ConversationEndReason y() {
        ConversationEndReason conversationEndReason = (ConversationEndReason) this.c;
        return conversationEndReason == null ? ConversationEndReason.Unknown.INSTANCE : conversationEndReason;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(java.util.ArrayList r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xt4.z(java.util.ArrayList, java.util.List):void");
    }

    public /* synthetic */ xt4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xt4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public xt4(ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.b = viewPropertyAnimator;
        this.c = null;
    }

    public xt4(TranslateAnimation translateAnimation) {
        this.a = 1;
        this.b = null;
        this.c = translateAnimation;
    }

    public xt4(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 0;
        this.b = workDatabase_Impl;
        this.c = new ai(workDatabase_Impl, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xt4(sm6 sm6Var, em6 em6Var) {
        this.a = 2;
        this.b = (hn6) sm6Var;
        this.c = (hn6) em6Var;
    }

    public xt4(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = new AtomicBoolean(false);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 18:
                this.b = new CountDownLatch(1);
                this.c = new AtomicReference();
                break;
            case 19:
                break;
            case 22:
                this.b = new j8a();
                this.c = new HashMap();
                break;
            case 26:
                AtomicReference atomicReference = new AtomicReference();
                this.b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                j4a j4aVar = new j4a();
                atomicReference2.lazySet(j4aVar);
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    public xt4(String str) {
        this.a = 29;
        this.b = (ExtraSupportedOutputSizeQuirk) rv4.a.e(ExtraSupportedOutputSizeQuirk.class);
        this.c = new hj5(str);
    }

    public xt4(Context context) {
        this.a = 14;
        this.b = context == null ? null : context.getApplicationContext();
    }

    public xt4(ly8 ly8Var, Looper looper) {
        this.a = 24;
        this.c = ly8Var;
        this.b = new Handler(looper, new dn3(6, this));
    }
}
