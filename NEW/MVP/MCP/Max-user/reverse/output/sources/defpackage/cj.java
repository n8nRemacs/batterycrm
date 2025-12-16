package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.util.ArrayMap;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cj(fp4 fp4Var, ac0 ac0Var, o9g o9gVar, ba0 ba0Var) {
        this.a = 18;
        this.b = fp4Var;
        this.c = ac0Var;
        this.d = ba0Var;
    }

    /* JADX WARN: Type inference failed for: r2v78, types: [f55, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        k95 k95Var;
        Rect rect;
        Iterator it;
        AbstractMap.SimpleEntry simpleEntry;
        Iterator it2;
        Path path;
        Rect rect2;
        Iterator it3;
        switch (this.a) {
            case 0:
                ((ej) this.b).a(null, (ti1) this.c, (float[]) this.d);
                return;
            case 1:
                ej ejVar = (ej) this.b;
                HashMap map = (HashMap) this.c;
                Point point = (Point) this.d;
                ejVar.getClass();
                Point point2 = ejVar.m;
                point2.x = point.x;
                point2.y = point.y;
                for (Map.Entry entry : ejVar.i.entrySet()) {
                    u61 u61Var = (u61) map.get(entry.getKey());
                    fj fjVar = (fj) entry.getValue();
                    if (u61Var == null) {
                        fjVar.getClass();
                        throw null;
                    }
                    d3h d3hVar = u61Var.b;
                    int i = d3hVar.a;
                    int i2 = d3hVar.b;
                    Point point3 = ejVar.m;
                    fjVar.f(i, i2, (i < point3.x || i2 < point3.y) ? 2 : 3);
                }
                if (ejVar.p || ejVar.l.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(ejVar.l);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ti1 ti1Var = (ti1) obj;
                    ejVar.b(ti1Var);
                    ejVar.n.log("AniRenderDispatch", "Postponed renderer for " + ti1Var + " still can not be created");
                }
                return;
            case 2:
                xo8 xo8Var = (xo8) this.b;
                hf6 hf6Var = (hf6) this.c;
                sh4 sh4Var = (sh4) this.d;
                yl5 yl5Var = (yl5) xo8Var.c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 1009, new dj4(idVarH, hf6Var, sh4Var, 1));
                return;
            case 3:
                a60 a60Var = (a60) this.b;
                Executor executor = (Executor) this.c;
                enb enbVar = (enb) this.d;
                int iV = az1.v(a60Var.g);
                if (iV == 0) {
                    a60Var.j = executor;
                    a60Var.k = enbVar;
                    return;
                } else {
                    if (iV == 1 || iV == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 4:
                iv0 iv0Var = (iv0) this.b;
                r5j r5jVar = (r5j) this.c;
                qee qeeVar = (qee) this.d;
                d60 d60Var = iv0Var.g;
                z5j.f("AudioStream can not be started when setCallback.", !d60Var.d.get());
                d60Var.a();
                d60Var.h = r5jVar;
                d60Var.i = qeeVar;
                if (Build.VERSION.SDK_INT >= 29) {
                    c60 c60Var = d60Var.k;
                    if (c60Var != null) {
                        il.g(d60Var.a, c60Var);
                    }
                    if (d60Var.k == null) {
                        d60Var.k = new c60(d60Var);
                    }
                    il.e(d60Var.a, qeeVar, d60Var.k);
                    return;
                }
                return;
            case 5:
                uv0 uv0Var = (uv0) this.b;
                c1f c1fVar = (c1f) this.c;
                ce5 ce5Var = (ce5) this.d;
                t9f t9fVar = uv0Var.g;
                try {
                    uv0Var.c(c1fVar, ce5Var);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        t9fVar.z(c1fVar, ce5Var);
                        ce5Var.close();
                    }
                }
            case 6:
                k01 k01Var = (k01) this.b;
                rve rveVar = (rve) this.c;
                String str2 = (String) this.d;
                k01Var.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = rveVar.d;
                    if (peerConnectionFactory == null) {
                        return;
                    }
                    peerConnectionFactory.submitDumpRequest(str2, Integer.MAX_VALUE, null);
                    return;
                } catch (Throwable th2) {
                    k01Var.P.logException("OKRTCCall", "Error starting local audio dump", th2);
                    return;
                }
            case 7:
                k01 k01Var2 = (k01) this.b;
                rve rveVar2 = (rve) this.c;
                m08 m08Var = (m08) this.d;
                k01Var2.getClass();
                PeerConnectionFactory peerConnectionFactory2 = rveVar2.d;
                if (peerConnectionFactory2 == null) {
                    return;
                }
                try {
                    peerConnectionFactory2.setKeywordSpotterParams(m08Var.a, m08Var.b, m08Var.c);
                    return;
                } catch (Throwable th3) {
                    k01Var2.P.reportException("OKRTCCall", "Error setting wordspotter params", new IllegalStateException("Keyword spotter error", th3));
                    return;
                }
            case 8:
                int i4 = 0;
                k01 k01Var3 = (k01) this.b;
                x71 x71Var = (x71) this.c;
                Object obj2 = this.d;
                ArrayList arrayList2 = k01Var3.G;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    try {
                        ((g01) obj3).onEvent(k01Var3, x71Var, obj2);
                    } catch (Throwable th4) {
                        k01Var3.P.logException("OKRTCCall", "Error on dispatch event " + x71Var, th4);
                    }
                }
                return;
            case 9:
                k01 k01Var4 = (k01) this.b;
                try {
                    ((rve) this.d).d.setTFLiteLibraryPath(((li) this.c).f());
                    return;
                } catch (IllegalStateException e) {
                    k01Var4.P.reportException("OKRTCCall", "Error loading TFLite", e);
                    return;
                }
            case 10:
                k01 k01Var5 = (k01) this.b;
                ti1 ti1Var2 = (ti1) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                f01 f01Var = k01Var5.s0;
                if (f01Var != null) {
                    f01Var.onCustomData(ti1Var2, jSONObject);
                    return;
                }
                return;
            case 11:
                yg1 yg1Var = (yg1) this.b;
                int[] iArr = (int[]) this.c;
                EGLContext eGLContext = (EGLContext) this.d;
                y6d y6dVar = yg1Var.a;
                String str3 = yg1Var.j;
                y6dVar.log(str3, "Initialize OpenGL context on openGL thread");
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    y6dVar.log(str3, "No default display found, will not initialize");
                    return;
                }
                int[] iArr2 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                }
                if (iArr3[0] <= 0) {
                    throw new CallOpenGLContext$CallOpenGLContextException("No valid OpenGL context present, can not continue");
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig == null) {
                    throw new CallOpenGLContext$CallOpenGLContextException("Returned matching OpenGL context is null");
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, eGLContext, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                }
                yg1Var.d = eGLContextEglCreateContext;
                yg1Var.e = eGLDisplayEglGetDisplay;
                yg1Var.f = eGLConfig;
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ry1 ry1Var = (ry1) this.b;
                Executor executor2 = (Executor) this.c;
                k02 k02Var = (k02) this.d;
                oy1 oy1Var = ry1Var.z;
                ((HashSet) oy1Var.b).add(k02Var);
                ((ArrayMap) oy1Var.c).put(k02Var, executor2);
                return;
            case 13:
                yz1 yz1Var = (yz1) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                tu1 tu1Var = (tu1) this.d;
                gri.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                yz1Var.d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (wz1) atomicReference.get());
                tu1Var.b(null);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((y02) this.b).a.onSurfacePrepared((CameraCaptureSession) this.c, (Surface) this.d);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((ClipboardManager) ((Context) this.b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((String) this.c, (String) this.d));
                return;
            case 16:
                qs3 qs3Var = (qs3) this.b;
                g94 g94Var = (g94) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                Object obj4 = qs3Var.Z;
                v1a.I(Collections.singletonList(g94Var));
                countDownLatch.countDown();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                vb4 vb4Var = (vb4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                iv6 iv6Var = ((ub4) vb4Var.b.b).b;
                if (iv6Var != null) {
                    vgb vgbVar = (vgb) iv6Var.b;
                    vgbVar.k.b(vgbVar, str4, str5);
                    return;
                }
                return;
            case 18:
                fp4 fp4Var = (fp4) this.b;
                ac0 ac0Var = (ac0) this.c;
                String str6 = ac0Var.a;
                ba0 ba0Var = (ba0) this.d;
                fp4Var.getClass();
                Logger logger = fp4.f;
                try {
                    hig higVarA = fp4Var.c.a(str6);
                    if (higVarA == null) {
                        String str7 = "Transport backend '" + str6 + "' is not registered";
                        logger.warning(str7);
                        new IllegalArgumentException(str7);
                    } else {
                        ((gwd) fp4Var.e).Z(new nl(fp4Var, ac0Var, ((j62) higVarA).a(ba0Var), 2));
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    return;
                }
            case 19:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                mp4 mp4Var = (mp4) this.d;
                viewGroup.endViewTransition(view);
                ((v7f) mp4Var.c.b).c(mp4Var);
                return;
            case 20:
                yp4 yp4Var = (yp4) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (yp4Var.t0) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 21:
                yp4 yp4Var2 = (yp4) this.b;
                u75 u75Var = (u75) this.c;
                Map map2 = Collections.EMPTY_MAP;
                tu1 tu1Var2 = (tu1) this.d;
                try {
                    yp4Var2.a.n(u75Var);
                    tu1Var2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    tu1Var2.d(e3);
                    return;
                }
            case 22:
                by4 by4Var = (by4) this.b;
                Runnable runnable3 = (Runnable) this.c;
                zx4 zx4Var = (zx4) this.d;
                by4Var.getClass();
                runnable3.run();
                ie.d(new kr4(by4Var, 5, zx4Var));
                return;
            case 23:
                cy4 cy4Var = (cy4) this.b;
                Runnable runnable4 = (Runnable) this.c;
                zx4 zx4Var2 = (zx4) this.d;
                cy4Var.getClass();
                runnable4.run();
                ((ScheduledExecutorService) sxi.a.f.a.getValue()).execute(new kr4(cy4Var, 6, zx4Var2));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                d55 d55Var = (d55) this.b;
                this.c.e(d55Var.a, d55Var.b, (Exception) this.d);
                return;
            case 25:
                i65 i65Var = (i65) this.b;
                u75 u75Var2 = (u75) this.c;
                Map map3 = Collections.EMPTY_MAP;
                tu1 tu1Var3 = (tu1) this.d;
                try {
                    i65Var.a.n(u75Var2);
                    tu1Var3.b(null);
                    return;
                } catch (RuntimeException e4) {
                    tu1Var3.d(e4);
                    return;
                }
            case 26:
                i65 i65Var2 = (i65) this.b;
                Runnable runnable5 = (Runnable) this.c;
                Runnable runnable6 = (Runnable) this.d;
                if (i65Var2.X) {
                    runnable5.run();
                    return;
                } else {
                    runnable6.run();
                    return;
                }
            case 27:
                n95 n95Var = (n95) this.b;
                l95 l95Var = (l95) this.c;
                hf0 hf0Var = (hf0) this.d;
                r95 r95Var = n95Var.a;
                Rect rect3 = new Rect();
                if (l95Var != null && l95Var.d) {
                    int width = r95Var.getWidth();
                    int height = r95Var.getHeight();
                    hf0Var.c = width;
                    hf0Var.d = height;
                } else if (hf0Var.c == -1 && hf0Var.d == -1) {
                    if (l95Var != null) {
                        Rect rect4 = l95Var.c;
                        int iWidth = rect4.width();
                        int iHeight = rect4.height();
                        hf0Var.c = iWidth;
                        hf0Var.d = iHeight;
                    } else {
                        int width2 = r95Var.getWidth();
                        int measuredHeight = r95Var.getMeasuredHeight();
                        hf0Var.c = width2;
                        hf0Var.d = measuredHeight;
                    }
                }
                hf0.a(hf0Var, r95Var.getMeasuredWidth(), r95Var.getMeasuredHeight(), rect3);
                r95Var.setBounds(rect3);
                if (l95Var != null) {
                    Rect bounds = r95Var.getBounds();
                    ArrayList arrayList3 = new ArrayList();
                    HashMap map4 = new HashMap();
                    Iterator it4 = l95Var.a.iterator();
                    while (it4.hasNext()) {
                        g18 g18Var = (g18) it4.next();
                        Rect rect5 = l95Var.c;
                        int i5 = g18Var.b;
                        List list = g18Var.o;
                        if (az1.v(i5) != 0) {
                            rect = bounds;
                            it = it4;
                            simpleEntry = null;
                        } else {
                            float fWidth = bounds.width() / rect5.width();
                            float fHeight = bounds.height() / rect5.height();
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                float[] fArr = ((s45) it5.next()).b;
                                float f = fHeight;
                                if (fArr != null) {
                                    for (int i6 = 0; i6 < fArr.length; i6++) {
                                        if (i6 % 2 == 0) {
                                            float f2 = fArr[i6] - rect5.left;
                                            fArr[i6] = f2;
                                            float f3 = f2 * fWidth;
                                            fArr[i6] = f3;
                                            fArr[i6] = f3 + bounds.left;
                                        } else {
                                            float f4 = fArr[i6] - rect5.top;
                                            fArr[i6] = f4;
                                            float f5 = f4 * f;
                                            fArr[i6] = f5;
                                            fArr[i6] = f5 + bounds.top;
                                        }
                                    }
                                }
                                fHeight = f;
                            }
                            int i7 = 2;
                            r45 r45Var = new r45(g18Var.c, (bounds.width() / rect5.width()) * g18Var.d);
                            Path path2 = r45Var.b;
                            ArrayList arrayList4 = r45Var.a;
                            Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                s45 s45Var = (s45) it6.next();
                                float[] fArr2 = s45Var.b;
                                int iV2 = az1.v(s45Var.a);
                                if (iV2 != 0) {
                                    if (iV2 != 1) {
                                        it2 = it6;
                                        path = path2;
                                        rect2 = bounds;
                                    } else {
                                        float f6 = fArr2[0];
                                        float f7 = fArr2[1];
                                        float f8 = fArr2[i7];
                                        float f9 = fArr2[3];
                                        float f10 = fArr2[4];
                                        float f11 = fArr2[5];
                                        float f12 = fArr2[6];
                                        float f13 = fArr2[7];
                                        float[] fArr3 = new float[8];
                                        fArr3[0] = f6;
                                        fArr3[1] = f7;
                                        fArr3[i7] = f8;
                                        fArr3[3] = f9;
                                        fArr3[4] = f10;
                                        fArr3[5] = f11;
                                        fArr3[6] = f12;
                                        fArr3[7] = f13;
                                        it2 = it6;
                                        rect2 = bounds;
                                        arrayList4.add(new s45(i7, fArr3));
                                        path2.moveTo(f6, f7);
                                        Path path3 = path2;
                                        path3.cubicTo(f8, f9, f10, f11, f12, f13);
                                        path = path3;
                                    }
                                    it3 = it4;
                                } else {
                                    it2 = it6;
                                    path = path2;
                                    rect2 = bounds;
                                    float f14 = fArr2[0];
                                    float f15 = fArr2[1];
                                    float f16 = fArr2[i7];
                                    float f17 = fArr2[3];
                                    float[] fArr4 = new float[4];
                                    fArr4[0] = f14;
                                    fArr4[1] = f15;
                                    fArr4[i7] = f16;
                                    fArr4[3] = f17;
                                    it3 = it4;
                                    arrayList4.add(new s45(1, fArr4));
                                    path.moveTo(f14, f15);
                                    path.lineTo(f16, f17);
                                }
                                path2 = path;
                                it4 = it3;
                                it6 = it2;
                                bounds = rect2;
                                i7 = 2;
                            }
                            rect = bounds;
                            it = it4;
                            simpleEntry = new AbstractMap.SimpleEntry(Integer.valueOf(g18Var.a), r45Var);
                        }
                        if (simpleEntry != null) {
                            arrayList3.add((k95) simpleEntry.getValue());
                            map4.put((Integer) simpleEntry.getKey(), (k95) simpleEntry.getValue());
                        }
                        it4 = it;
                        bounds = rect;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (dg3 dg3Var : l95Var.b) {
                        u9 u9Var = (az1.v(dg3Var.a) == 0 && (k95Var = (k95) map4.get(Integer.valueOf(dg3Var.b))) != null) ? new u9(k95Var) : null;
                        if (u9Var != null) {
                            arrayList5.add(u9Var);
                        }
                    }
                    Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        r95Var.a.add((k95) it7.next());
                        r95Var.invalidate();
                    }
                    n95Var.d.addAll(arrayList5);
                    r95Var.setDrawStickerEnabled(l95Var.d);
                }
                n95Var.b();
                return;
            case 28:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            default:
                xa5 xa5Var = (xa5) this.b;
                eaj eajVar = (eaj) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    de6 de6VarD = n8j.d(xa5Var.a);
                    if (de6VarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ce6 ce6Var = (ce6) de6VarD.a;
                    synchronized (ce6Var.d) {
                        ce6Var.X = threadPoolExecutor;
                    }
                    de6VarD.a.b(new wa5(eajVar, threadPoolExecutor));
                    return;
                } catch (Throwable th5) {
                    eajVar.a(th5);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ cj(yp4 yp4Var, u75 u75Var, tu1 tu1Var) {
        this.a = 21;
        Map map = Collections.EMPTY_MAP;
        this.b = yp4Var;
        this.c = u75Var;
        this.d = tu1Var;
    }

    public /* synthetic */ cj(i65 i65Var, u75 u75Var, tu1 tu1Var) {
        this.a = 25;
        Map map = Collections.EMPTY_MAP;
        this.b = i65Var;
        this.c = u75Var;
        this.d = tu1Var;
    }

    public /* synthetic */ cj(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
