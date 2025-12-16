package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Range;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpHost;
import org.webrtc.CapturerObserver;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;

/* loaded from: classes2.dex */
public final class vhb implements tof, CapturerObserver, xe7, cf5, rn6, v2f, gof, n8e, zua, s0i, lva {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ vhb(int i, boolean z) {
        this.a = i;
    }

    public static i3 v(View view, View view2) {
        if (view2 instanceof AdapterView) {
            return new j3e(view, 0);
        }
        if (view2 instanceof ScrollView) {
            return new j3e(view, 3);
        }
        if (view2 instanceof RecyclerView) {
            return new k3e(view, (RecyclerView) view2);
        }
        if (view2 instanceof NestedScrollView) {
            return new j3e(view, 2);
        }
        if (view2 instanceof HorizontalScrollView) {
            return new j3e(view, 1);
        }
        if (view2.getParent() instanceof View) {
            return v(view, (View) view2.getParent());
        }
        return null;
    }

    public static View w(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return w((View) view.getParent());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    @Override // defpackage.zua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g4i I(android.view.View r17, defpackage.g4i r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.b
            os0 r3 = (defpackage.os0) r3
            java.lang.Object r4 = r0.c
            u70 r4 = (defpackage.u70) r4
            int r5 = r4.b
            int r6 = r4.c
            int r4 = r4.d
            e4i r7 = r2.a
            r8 = 7
            co7 r8 = r7.f(r8)
            r9 = 32
            co7 r7 = r7.f(r9)
            java.lang.Object r9 = r3.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.b
            int r11 = r8.c
            int r12 = r8.a
            r9.w = r10
            boolean r10 = defpackage.yqi.e(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.o
            if (r0 == 0) goto L48
            int r13 = r2.a()
            r9.v = r13
            int r13 = r13 + r4
        L48:
            boolean r4 = r9.p
            if (r4 == 0) goto L53
            if (r10 == 0) goto L50
            r4 = r6
            goto L51
        L50:
            r4 = r5
        L51:
            int r14 = r4 + r12
        L53:
            boolean r4 = r9.q
            if (r4 == 0) goto L5d
            if (r10 == 0) goto L5a
            goto L5b
        L5a:
            r5 = r6
        L5b:
            int r15 = r5 + r11
        L5d:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.s
            r6 = 1
            if (r5 == 0) goto L70
            int r5 = r4.leftMargin
            if (r5 == r12) goto L70
            r4.leftMargin = r12
            r5 = r6
            goto L71
        L70:
            r5 = 0
        L71:
            boolean r10 = r9.t
            if (r10 == 0) goto L7c
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7c
            r4.rightMargin = r11
            r5 = r6
        L7c:
            boolean r10 = r9.u
            if (r10 == 0) goto L89
            int r10 = r4.topMargin
            int r8 = r8.b
            if (r10 == r8) goto L89
            r4.topMargin = r8
            goto L8a
        L89:
            r6 = r5
        L8a:
            if (r6 == 0) goto L8f
            r1.setLayoutParams(r4)
        L8f:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.a
            if (r1 == 0) goto L9e
            int r3 = r7.d
            r9.m = r3
        L9e:
            if (r0 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r9.R()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhb.I(android.view.View, g4i):g4i");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:32:0x00da, B:33:0x00e0, B:60:0x0156, B:35:0x00e5, B:38:0x00f1, B:41:0x00f7, B:42:0x00fe, B:45:0x0102, B:46:0x0110, B:47:0x0123, B:50:0x0127, B:54:0x0130, B:56:0x0135, B:57:0x0140, B:58:0x014c), top: B:76:0x00da }] */
    @Override // defpackage.rn6, defpackage.v2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhb.a(java.lang.Object):void");
    }

    @Override // defpackage.n8e
    public void b(y9g y9gVar, jp5 jp5Var, mjg mjgVar) {
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ((v2f) this.b).c(py4Var);
    }

    @Override // defpackage.n8e
    public void d(qyg qygVar) {
        ijg ijgVar = (ijg) this.c;
        SparseArray sparseArray = ijgVar.f;
        u62 u62Var = (u62) this.b;
        if (qygVar.s() == 0 && (qygVar.s() & 128) != 0) {
            qygVar.F(6);
            int iC = qygVar.c() / 4;
            for (int i = 0; i < iC; i++) {
                qygVar.e(0, u62Var.d, 4);
                u62Var.q(0);
                int i2 = u62Var.i(16);
                u62Var.t(3);
                if (i2 == 0) {
                    u62Var.t(13);
                } else {
                    int i3 = u62Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new p8e(new ggg(ijgVar, i3)));
                        ijgVar.l++;
                    }
                }
            }
            if (ijgVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.gof
    public int e(long j) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        Long lValueOf = Long.valueOf(j);
        int i2 = xxg.a;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < arrayList.size()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.xe7
    public void f() {
        ((xub) this.b).a((rx) ((uid) this.c).a, new Exception("onDownloadFailed"));
    }

    @Override // defpackage.gof
    public long g(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        fsi.b(i >= 0);
        fsi.b(i < arrayList.size());
        return ((Long) arrayList.get(i)).longValue();
    }

    @Override // defpackage.s0i
    public boolean h() {
        return ((pe8) ((uvh) this.b).Z).O();
    }

    @Override // defpackage.cf5
    public boolean i(int i) {
        return x(i) != null;
    }

    @Override // defpackage.s0i
    public void j() {
        Object value;
        uvh uvhVar = (uvh) this.b;
        String str = uvhVar.F0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onPageFinishLoading: " + uvhVar.K0.getValue(), null);
            }
        }
        tcf tcfVar = uvhVar.K0;
        do {
            value = tcfVar.getValue();
            zlb zlbVar = (zlb) value;
            if (!(zlbVar instanceof xlb) && !(zlbVar instanceof wlb) && zlbVar != null) {
                return;
            }
        } while (!tcfVar.c(value, new xlb()));
    }

    @Override // defpackage.s0i
    public void k() {
        ((uvh) this.b).y();
    }

    @Override // defpackage.s0i
    public boolean l(Uri uri) {
        qc4 qc4Var = (qc4) this.c;
        if (fni.a(uri.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) || fni.a(uri.getScheme(), "https")) {
            return false;
        }
        try {
            qc4Var.a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        } catch (Exception e) {
            wqi.e("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            return false;
        }
    }

    @Override // defpackage.gof
    public List m(long j) {
        int iD = xxg.d(Long.valueOf(j), (ArrayList) this.c, false);
        return iD == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(iD);
    }

    @Override // defpackage.cf5
    public df5 n(int i) {
        return x(i);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        kob kobVar = (kob) this.c;
        ((y6d) kobVar.d).log("PatchedVideoCapturer", "onCapturerStarted");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(z);
        }
        kobVar.getClass();
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        kob kobVar = (kob) this.c;
        ((y6d) kobVar.d).log("PatchedVideoCapturer", "onCapturerStopped");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
        kobVar.getClass();
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        try {
            ((pm0) ((hs8) this.c).c).accept(null, th);
        } catch (Throwable th2) {
            raj.c(th2);
            th = new CompositeException(th, th2);
        }
        ((v2f) this.b).onError(th);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        gb0 gb0Var;
        switch (this.a) {
            case 5:
                gri.j("Recorder", "VideoEncoder Setup error: " + th, th);
                mw4 mw4Var = (mw4) this.c;
                int i = mw4Var.c;
                if (i < mw4Var.a) {
                    mw4Var.c = i + 1;
                    awa awaVar = new awa(20, this);
                    mw4Var.f = ayi.d().schedule(new d8c(((bhd) mw4Var.g).e, 14, awaVar), bhd.p0, TimeUnit.MILLISECONDS);
                    return;
                }
                bhd bhdVar = (bhd) mw4Var.g;
                synchronized (bhdVar.h) {
                    try {
                        gb0Var = null;
                        switch (bhdVar.j.ordinal()) {
                            case 1:
                            case 2:
                                gb0 gb0Var2 = bhdVar.n;
                                bhdVar.n = null;
                                gb0Var = gb0Var2;
                            case 0:
                                bhdVar.E(-1);
                                bhdVar.D(ahd.s0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + bhdVar.j + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (gb0Var != null) {
                    bhdVar.j(gb0Var, 7, th);
                    return;
                }
                return;
            default:
                z5j.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof ksf);
                ((ju3) this.b).accept(new ub0(1, (Surface) this.c));
                return;
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        g32 g32Var = (g32) ((kob) this.c).b;
        g32Var.b.a();
        g32Var.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - g32Var.d >= WorkRequest.MIN_BACKOFF_MILLIS) {
            g32Var.a.log("CameraStatCollector", g32Var.toString());
            g32Var.d = SystemClock.elapsedRealtime();
        }
        VideoSink videoSink = (VideoSink) ((kob) this.c).c;
        if (dnf.n(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
            if (videoSink != null) {
                videoSink.onFrame(videoFrame);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
        } else {
            VideoFrame videoFrame2 = new VideoFrame(new wsd((VideoFrame.TextureBuffer) videoFrame.getBuffer(), videoFrame.getRotation(), ((SurfaceTextureHelper) ((kob) this.c).X).getHandler(), (YuvConverter) ((kob) this.c).o), 0, videoFrame.getTimestampNs());
            if (videoSink != null) {
                videoSink.onFrame(videoFrame2);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame2);
        }
    }

    @Override // defpackage.lva
    public void p(Task task) {
        z8j z8jVar = (z8j) this.b;
        n2g n2gVar = (n2g) this.c;
        synchronized (z8jVar.f) {
            z8jVar.e.remove(n2gVar);
        }
    }

    @Override // defpackage.s0i
    public void q(String str) {
        ((uvh) this.b).z(str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03a5, code lost:
    
        r0.addAll(r9);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    @Override // defpackage.tof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(byte[] r24, int r25, int r26, defpackage.sof r27, defpackage.fu3 r28) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhb.r(byte[], int, int, sof, fu3):void");
    }

    @Override // defpackage.gof
    public int s() {
        return ((ArrayList) this.c).size();
    }

    @Override // defpackage.xe7
    public void t(String str) {
        xub xubVar = (xub) this.b;
        rx rxVar = (rx) ((uid) this.c).a;
        File file = new File(str);
        if (xubVar.b) {
            return;
        }
        rxVar.f(file);
        rxVar.b();
    }

    public String toString() {
        switch (this.a) {
            case 16:
                String str = (String) this.b;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(u45.f(u45.f(2, str), str2));
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tof
    public int u() {
        return 1;
    }

    public df5 x(int i) {
        HashMap map = (HashMap) this.c;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((cf5) this.b).n(i) : (df5) map.get(Integer.valueOf(i));
    }

    public void y(sch schVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new n1h(this, 7, schVar));
        }
    }

    public /* synthetic */ vhb(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ vhb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public vhb(Context context) {
        this.a = 22;
        this.c = new AtomicLong(-1L);
        this.b = new bci(context, bci.k, new l3g("mlkit:vision"), rv6.c);
    }

    public vhb(long j, Looper looper) {
        this.a = 14;
        this.b = new LinkedHashSet();
        this.c = new a9g(j, this, looper);
    }

    public vhb(dy dyVar, View view) {
        this.a = 7;
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.HashMap] */
    public vhb(l22 l22Var, cf5 cf5Var, i17 i17Var) {
        Range rangeI;
        this.a = 4;
        this.b = cf5Var;
        ArrayList arrayListF = i17Var.f(ExtraSupportedQualityQuirk.class);
        if (arrayListF.isEmpty()) {
            return;
        }
        ?? map = 0;
        f3h f3hVarA = null;
        map = 0;
        map = 0;
        z5j.f(null, arrayListF.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListF.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if ("1".equals(l22Var.d()) && !cf5Var.i(4)) {
                df5 df5VarN = cf5Var.n(1);
                z90 z90Var = (df5VarN == null || df5VarN.d().isEmpty()) ? null : (z90) df5VarN.d().get(0);
                if (z90Var != null) {
                    try {
                        f3hVarA = h3h.a(g3h.L0(e2h.d(z90Var)), null);
                    } catch (InvalidConfigException e) {
                        gri.j("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
                    }
                    if (f3hVarA != null) {
                        rangeI = f3hVarA.I();
                    } else {
                        rangeI = fc0.f;
                    }
                    Range range = rangeI;
                    android.util.Size size = d4f.d;
                    int i = z90Var.c;
                    int i2 = z90Var.h;
                    int i3 = z90Var.d;
                    y90 y90VarE = y90.e(df5VarN.a(), df5VarN.b(), df5VarN.c(), Collections.singletonList(new z90(z90Var.a, z90Var.b, e2h.c(i, i2, i2, i3, i3, size.getWidth(), z90Var.e, size.getHeight(), z90Var.f, range), z90Var.d, size.getWidth(), size.getHeight(), z90Var.g, z90Var.h, z90Var.i, z90Var.j)));
                    map = new HashMap();
                    map.put(4, y90VarE);
                    android.util.Size size2 = new android.util.Size(z90Var.e, z90Var.f);
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        map.put(1, y90VarE);
                    }
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != 0) {
            this.c = new HashMap((Map) map);
        }
    }

    public vhb(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new b44(evd.h, new n5g(fvd.q), Integer.valueOf(ivd.s), (Integer) null, 20);
                this.c = new b44(evd.c, new n5g(fvd.m), Integer.valueOf(ivd.O), (Integer) null, 20);
                break;
            default:
                this.b = new umb();
                this.c = new qhb();
                break;
        }
    }

    public vhb(Handler handler, yl5 yl5Var) {
        this.a = 17;
        if (yl5Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = yl5Var;
    }

    public vhb(ijg ijgVar) {
        this.a = 15;
        this.c = ijgVar;
        this.b = new u62(new byte[4], 4, 2, (byte) 0);
    }
}
