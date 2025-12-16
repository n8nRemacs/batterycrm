package defpackage;

import android.view.View;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ui implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ui(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        ss3 ss3Var;
        int i = 4;
        boolean z = true;
        ScheduledFuture scheduledFuture = null;
        switch (this.a) {
            case 0:
                r30 r30Var = (r30) this.c;
                ((rve) r30Var.c).d.setAnimojiParams(this.b, (String) r30Var.a, (NativeDoubleArrayConsumer.Consumer) r30Var.X);
                return;
            case 1:
                xo8 xo8Var = (xo8) this.c;
                boolean z2 = this.b;
                yl5 yl5Var = (yl5) xo8Var.c;
                String str = zxg.a;
                em5 em5Var = yl5Var.a;
                if (em5Var.h1 == z2) {
                    return;
                }
                em5Var.h1 = z2;
                em5Var.x0.f(23, new j21(z2, 3));
                return;
            case 2:
                xt4 xt4Var = (xt4) this.c;
                boolean z3 = this.b;
                xl5 xl5Var = (xl5) xt4Var.c;
                int i2 = xxg.a;
                dm5 dm5Var = xl5Var.a;
                if (dm5Var.e1 == z3) {
                    return;
                }
                dm5Var.e1 = z3;
                dm5Var.w0.j(23, new j21(z3, i));
                return;
            case 3:
                enb enbVar = (enb) this.c;
                boolean z4 = this.b;
                bhd bhdVar = (bhd) enbVar.c;
                if (bhdVar.W != z4) {
                    bhdVar.W = z4;
                    bhdVar.K();
                    return;
                } else {
                    gri.i("Recorder", "Audio source silenced transitions to the same state " + z4);
                    return;
                }
            case 4:
                r5j r5jVar = (r5j) this.c;
                boolean z5 = this.b;
                a60 a60Var = (a60) r5jVar.b;
                a60Var.q = z5;
                if (a60Var.g == 2) {
                    a60Var.a();
                    return;
                }
                return;
            case 5:
                CallsAudioManagerV3Impl.updateProximityTrackingState$lambda$10(this.b, (CallsAudioManagerV3Impl) this.c);
                return;
            case 6:
                vw1 vw1Var = (vw1) this.c;
                boolean z6 = this.b;
                vw1Var.e();
                if (vw1Var.Z != 0) {
                    return;
                }
                long j = vw1Var.c.a.a;
                Iterator it = vw1Var.d.iterator();
                long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                while (it.hasNext()) {
                    long j3 = ((eh9) it.next()).a.c;
                    if (j3 < j2) {
                        j2 = j3;
                    }
                }
                long j4 = j2 - 1;
                wqi.c("vw1", "loadNext: from db from: " + d8j.a(Long.valueOf(j)) + " to: " + d8j.a(Long.valueOf(j4)), new Object[0]);
                ArrayList arrayListK = vw1Var.w0.k(j, j4);
                vw1Var.a(vw1Var.d.size(), arrayListK);
                wqi.c("vw1", "loadNext: loaded from db: " + arrayListK.size() + " messages", new Object[0]);
                vw1Var.b = arrayListK.isEmpty();
                vw1Var.f();
                if (z6 && arrayListK.size() < 100 && vw1Var.c.d) {
                    vw1Var.d();
                    return;
                }
                return;
            case 7:
                iy1 iy1Var = (iy1) this.c;
                boolean z7 = this.b;
                if (iy1Var.a == z7) {
                    return;
                }
                iy1Var.a = z7;
                if (z7) {
                    if (iy1Var.b) {
                        ry1 ry1Var = (ry1) iy1Var.c;
                        ry1Var.getClass();
                        wsf.g(ixi.a(new xtd(21, ry1Var))).d(new o3(29, iy1Var), (qee) iy1Var.d);
                        iy1Var.b = false;
                        return;
                    }
                    return;
                }
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                tu1 tu1Var = (tu1) iy1Var.g;
                if (tu1Var != null) {
                    tu1Var.d(cameraControl$OperationCanceledException);
                    iy1Var.g = null;
                    return;
                }
                return;
            case 8:
                ez1 ez1Var = (ez1) this.c;
                boolean z8 = this.b;
                ez1Var.M0 = z8;
                if (z8 && ez1Var.R0 == 4) {
                    ez1Var.I(false);
                    return;
                }
                return;
            case 9:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) this.c;
                boolean z9 = this.b;
                View view = mediaBarPreviewLayout.H0;
                if (z9) {
                    view.setVisibility(0);
                    return;
                } else {
                    view.setVisibility(8);
                    return;
                }
            case 10:
                t9b t9bVar = (t9b) this.c;
                boolean z10 = this.b;
                try {
                    ScheduledFuture scheduledFuture2 = t9bVar.Z;
                    if (scheduledFuture2 != null) {
                        scheduledFuture = scheduledFuture2;
                    }
                    if (scheduledFuture.isCancelled()) {
                        throw new InterruptedException("ScheduledFuture is cancelled");
                    }
                    t9bVar.X = t9bVar.a.call();
                    if (z10) {
                        return;
                    }
                    t9bVar.d.set(true);
                    t9bVar.o.countDown();
                    return;
                } catch (Exception e) {
                    t9bVar.Y.set(e);
                    t9bVar.d.set(true);
                    t9bVar.c.set(true);
                    t9bVar.o.countDown();
                    return;
                }
            case 11:
                ((j0c) this.c).J0.setVisibility(this.b ? 0 : 8);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                pze pzeVar = (pze) this.c;
                boolean z11 = this.b;
                Iterator it2 = pzeVar.m.iterator();
                while (it2.hasNext()) {
                    sz0 sz0Var = (sz0) it2.next();
                    int i3 = sz0Var.a;
                    fr1 fr1Var = sz0Var.b;
                    switch (i3) {
                        case 0:
                            ss3Var = fr1Var.k;
                            if (ss3Var.i != z11) {
                                ss3Var.i = z11;
                                if (!ss3Var.c.a) {
                                    break;
                                } else {
                                    ss3Var.a();
                                    break;
                                }
                            } else {
                                break;
                            }
                        default:
                            ss3Var = fr1Var.k;
                            if (ss3Var.i != z11) {
                                ss3Var.i = z11;
                                if (!ss3Var.c.a) {
                                    break;
                                } else {
                                    ss3Var.a();
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
                return;
            default:
                awd awdVar = (awd) this.c;
                boolean z12 = this.b;
                k01 k01Var = (k01) awdVar.b;
                try {
                    boolean zJ = k01Var.j();
                    r8a r8aVar = k01Var.u0;
                    if (zJ) {
                        k01Var.G0.getClass();
                        if (r8aVar.b) {
                            r8aVar.b = false;
                            r8aVar.c = false;
                            r8aVar.a();
                        } else {
                            z = false;
                        }
                        if (z) {
                            k01Var.J();
                            k01Var.l(x71.o, null);
                        }
                        ds1 ds1Var = k01Var.o0;
                        if (ds1Var == null) {
                            return;
                        }
                        zpb zpbVar = (!r8aVar.b || k01Var.Y0) ? k01Var.h1 : k01Var.g1;
                        if (zpbVar == null) {
                            return;
                        }
                        if (ds1Var.F()) {
                            ds1 ds1Var2 = k01Var.o0;
                            ds1Var2.r = zpbVar;
                            us8 us8Var = ds1Var2.m;
                            if (us8Var != null) {
                                us8Var.f = zpbVar;
                                us8Var.c();
                                return;
                            }
                            return;
                        }
                        ds1 ds1Var3 = k01Var.o0;
                        ds1Var3.r = zpbVar;
                        us8 us8Var2 = ds1Var3.m;
                        if (us8Var2 == null) {
                            ds1Var3.R(zpbVar);
                            return;
                        } else {
                            us8Var2.f = zpbVar;
                            us8Var2.c();
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    k01Var.P.logException("OKRTCCall", xrf.p("Error apply screen capture stopped state (fast=", ")", z12), th);
                    return;
                }
        }
    }

    public /* synthetic */ ui(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        this.a = 5;
        this.b = z;
        this.c = callsAudioManagerV3Impl;
    }
}
