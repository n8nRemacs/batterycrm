package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public final class d12 {
    public final ArrayList a;
    public final ArrayList b;
    public final ao6 c;
    public final n2 d;
    public final y6d e;
    public final CopyOnWriteArraySet f;
    public final Object g;
    public volatile String h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public d12(hqa hqaVar, CameraVideoCapturer cameraVideoCapturer, n2 n2Var, ArrayList arrayList, ArrayList arrayList2, boolean z, y6d y6dVar) {
        ArrayList arrayList3 = new ArrayList();
        this.a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.b = arrayList4;
        this.f = new CopyOnWriteArraySet();
        this.g = new Object();
        this.h = null;
        this.e = y6dVar;
        y6d y6dVar2 = ((i52) hqaVar).a;
        this.c = new ao6(24, new kob(cameraVideoCapturer, new g32(y6dVar2), y6dVar2));
        this.d = n2Var;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        this.i = z;
    }

    public final void a() {
        boolean z;
        ArrayList<CameraEnumerationAndroid.CaptureFormat> arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        boolean z2 = w0a.a;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        vs6 vs6Var = new vs6(27);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (CameraEnumerationAndroid.CaptureFormat captureFormat : arrayList) {
            int i = captureFormat.width;
            if (i >= 500) {
                int i2 = captureFormat.height;
                if (i * i2 <= 921600) {
                    float f = i / i2;
                    if (Math.abs(f - 1.7777778f) < 0.1f) {
                        arrayList2.add(captureFormat);
                    } else if (f > 1.1d && !z) {
                        arrayList3.add(captureFormat);
                    }
                }
            }
        }
        Collections.sort(arrayList2, vs6Var);
        Collections.sort(arrayList3, vs6Var);
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : arrayList3.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList3.get(0) : (CameraEnumerationAndroid.CaptureFormat) arrayList.get(arrayList.size() - 1);
        int iRound = Math.round(captureFormat2.framerate.max / 1000.0f);
        int i3 = (iRound <= 0 || iRound > 60) ? 30 : iRound;
        y6d y6dVar = this.e;
        StringBuilder sb = new StringBuilder("capture format selected, size: ");
        sb.append(captureFormat2.width);
        sb.append("x");
        hf3.g(sb, captureFormat2.height, ", frame rate: ", iRound, ", actual frame rate: ");
        sb.append(i3);
        y6dVar.log("CameraCapturerAdapter", sb.toString());
        int i4 = captureFormat2.width;
        int i5 = captureFormat2.height;
        int iRound2 = i3 < 1000 ? i3 : Math.round(i3 / 1000.0f);
        if (iRound2 != i3) {
            String strG = ho7.g("Unexpected frame rate requested: ", i3, iRound2, ", truncated to ");
            this.e.reportException("CameraCapturerAdapter", strG, new IllegalArgumentException(strG));
        }
        y6d y6dVar2 = this.e;
        StringBuilder sbK = wy1.k("changeFormat, ", i4, "x", i5, "@");
        sbK.append(iRound2);
        y6dVar2.log("CameraCapturerAdapter", sbK.toString());
        if (this.n != i4 || this.m != i5 || this.l != iRound2) {
            this.l = iRound2;
            this.m = i5;
            this.n = i4;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ie8 ie8Var = (ie8) it.next();
                if (this != ie8Var.r) {
                    ie8Var.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
                }
                ubh ubhVar = ie8Var.y;
                ((y6d) ubhVar.c).log("VideoRecord", ho7.g("Camera capture dimensions were changed to ", i4, i5, "x"));
                ubhVar.k.width = i4;
                ubhVar.k.height = i5;
                ubhVar.u();
            }
            if (this.k) {
                this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
                ((kob) this.c.b).changeCaptureFormat(i4, i5, iRound2);
            }
        }
        this.e.log("CameraCapturerAdapter", "start");
        if (this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already started");
            return;
        }
        if (this.n == 0 || this.m == 0 || this.l == 0) {
            this.e.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
        }
        try {
            ((kob) this.c.b).startCapture(this.n, this.m, this.l);
            this.k = true;
        } catch (RuntimeException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            ((kob) this.c.b).stopCapture();
            this.k = false;
        } catch (InterruptedException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }
}
