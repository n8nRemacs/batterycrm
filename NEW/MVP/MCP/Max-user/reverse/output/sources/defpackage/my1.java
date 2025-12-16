package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Size;
import android.view.Surface;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.my.tracker.campaign.CampaignService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chats.list.ChatsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class my1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my1(ch4 ch4Var, Exception exc, long j) {
        this.a = 22;
        this.b = ch4Var;
        this.c = exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        iqa iqaVar;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ry1 ry1Var = (ry1) this.b;
                wsf.h(ixi.a(new ny1(ry1Var, ry1Var.A(), i2)), (tu1) this.c);
                return;
            case 1:
                py1 py1Var = (py1) this.b;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.c;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = (HashSet) py1Var.b;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    qy1 qy1Var = (qy1) it.next();
                    if (qy1Var.a(totalCaptureResult)) {
                        hashSet.add(qy1Var);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 2:
                ((fie) this.b).a((hie) this.c);
                return;
            case 3:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case 4:
                ez1 ez1Var = (ez1) this.b;
                tu1 tu1Var = (tu1) this.c;
                lz9 lz9Var = ez1Var.G0;
                if (lz9Var == null) {
                    tu1Var.b(Boolean.FALSE);
                    return;
                } else {
                    tu1Var.b(Boolean.valueOf(ez1Var.a.r(ez1.w(lz9Var))));
                    return;
                }
            case 5:
                ez1 ez1Var2 = (ez1) this.b;
                String str = (String) this.c;
                ez1Var2.t("Use case " + str + " INACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) ez1Var2.a.c;
                if (linkedHashMap.containsKey(str)) {
                    vwg vwgVar = (vwg) linkedHashMap.get(str);
                    vwgVar.f = false;
                    if (!vwgVar.e) {
                        linkedHashMap.remove(str);
                    }
                }
                ez1Var2.K();
                return;
            case 6:
                ((HashSet) ((ry1) this.b).b.b).remove((vz1) this.c);
                return;
            case 7:
                ((w12) this.b).a = (f32) this.c;
                return;
            case 8:
                ((CampaignService) this.b).a((String) this.c);
                return;
            case 9:
                ve2 ve2Var = (ve2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                kz4 kz4Var = ve2Var.m;
                kz4 kz4Var2 = ve2Var.z;
                ((deg) kz4Var2.get()).getClass();
                deg.a("ChatController.load().nonParticipantChats");
                try {
                    ((ie4) kz4Var.get()).a();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sf2 sf2Var = (sf2) it2.next();
                        ((ie4) kz4Var.get()).c.a(sf2Var.a, BuildConfig.MAX_TIME_TO_UPLOAD, rs4.REGULAR);
                        jrd jrdVar = ((ie4) kz4Var.get()).b;
                        long j = sf2Var.a;
                        jrdVar.getClass();
                        svi.g(bd5.a, new hrd(jrdVar, j, null));
                        hwa hwaVar = (hwa) ve2Var.q.get();
                        hwaVar.u().c(new jy2(hwaVar.t().a.k(), sf2Var.b.a, false), false, 0L, (12 & 8) != 0 ? 0 : 1);
                    }
                    ((ie4) kz4Var.get()).c();
                    ((ie4) kz4Var.get()).b();
                    ((deg) kz4Var2.get()).getClass();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    ((ie4) kz4Var.get()).b();
                    throw th;
                }
            case 10:
                y03 y03Var = (y03) this.b;
                v03 v03Var = (v03) this.c;
                yy7[] yy7VarArr = ChatsListWidget.L0;
                y03Var.E(v03Var.a);
                return;
            case 11:
                Context context = (Context) this.b;
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(context.getContentResolver(), "image/jpeg", (Uri) this.c));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                b bVar = (b) this.b;
                jva jvaVar = (jva) this.c;
                int i3 = nl3.C0;
                bVar.a.a(new hl3(jvaVar, i2, bVar));
                return;
            case 13:
                djb djbVar = (djb) this.b;
                rpc rpcVar = (rpc) this.c;
                if (djbVar.b != djb.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (djbVar) {
                    iqaVar = djbVar.a;
                    djbVar.a = null;
                    djbVar.b = rpcVar;
                }
                iqaVar.getClass();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                p18 p18Var = (p18) this.b;
                rpc rpcVar2 = (rpc) this.c;
                synchronized (p18Var) {
                    try {
                        if (p18Var.b == null) {
                            p18Var.a.add(rpcVar2);
                        } else {
                            p18Var.b.add(rpcVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bt3 bt3Var = (bt3) this.b;
                uqa uqaVar = (uqa) this.c;
                try {
                    uqaVar.a(bt3Var.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    uqaVar.onError(e);
                    return;
                }
            case 16:
                List<ht3> list = (List) this.b;
                vt3 vt3Var = (vt3) this.c;
                for (ht3 ht3Var : list) {
                    Object obj = vt3Var.d;
                    ht3Var.d = obj;
                    ht3Var.d(ht3Var.e, obj);
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                ha8 ha8Var = (ha8) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            ike ikeVar = constraintTrackingWorker.d;
                            String str2 = xt3.a;
                            ikeVar.i(new ja8());
                        } else {
                            constraintTrackingWorker.d.k(ha8Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 18:
                u44 u44Var = (u44) this.b;
                Runnable runnable = (Runnable) this.c;
                u44Var.getClass();
                runnable.run();
                ((CountDownLatch) u44Var.d).countDown();
                return;
            case 19:
                qs3 qs3Var = (qs3) this.b;
                g94 g94Var = (g94) this.c;
                Object obj2 = qs3Var.Z;
                v1a.I(Collections.singletonList(g94Var));
                return;
            case 20:
                bc4 bc4Var = (bc4) this.b;
                Runnable runnable2 = (Runnable) this.c;
                bc4Var.getClass();
                try {
                    Process.setThreadPriority(bc4Var.b);
                } catch (Throwable unused) {
                }
                runnable2.run();
                return;
            case 21:
                cc4 cc4Var = (cc4) this.b;
                Runnable runnable3 = (Runnable) this.c;
                Process.setThreadPriority(cc4Var.c);
                StrictMode.ThreadPolicy threadPolicy = cc4Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable3.run();
                return;
            case 22:
                ((ch4) this.b).g.d(VideoFrameProcessingException.a((Exception) this.c));
                return;
            case 23:
                y6i y6iVar = (y6i) this.b;
                x50 x50Var = (x50) this.c;
                xo8 xo8Var = ((mw8) y6iVar.b).P1;
                Handler handler = (Handler) xo8Var.b;
                if (handler != null) {
                    handler.post(new r50(xo8Var, x50Var, i));
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ql4 ql4Var = (ql4) this.b;
                hf6 hf6Var = (hf6) this.c;
                sl4 sl4Var = ql4Var.d;
                if (sl4Var.p == 0 || ql4Var.c) {
                    return;
                }
                Looper looper = sl4Var.t;
                looper.getClass();
                ql4Var.b = sl4Var.e(looper, ql4Var.a, hf6Var, false);
                sl4Var.n.add(ql4Var);
                return;
            case 25:
                zm4 zm4Var = (zm4) this.b;
                Uri uri = (Uri) this.c;
                zm4Var.s0 = false;
                zm4Var.b(uri);
                return;
            case 26:
                an4 an4Var = (an4) this.b;
                Uri uri2 = (Uri) this.c;
                an4Var.s0 = false;
                an4Var.d(uri2);
                return;
            case 27:
                ((yp4) this.b).u0.add((u90) this.c);
                return;
            case 28:
                yp4 yp4Var = (yp4) this.b;
                fsf fsfVar = (fsf) this.c;
                Surface surfaceD = fsfVar.d(yp4Var.c, new l32(yp4Var, i, fsfVar));
                yp4Var.a.p(surfaceD);
                yp4Var.Z.put(fsfVar, surfaceD);
                return;
            default:
                final yp4 yp4Var2 = (yp4) this.b;
                final msf msfVar = (msf) this.c;
                yp4Var2.s0++;
                tz4 tz4Var = yp4Var2.a;
                ho6.d((AtomicBoolean) tz4Var.c, true);
                ho6.c((Thread) tz4Var.e);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(tz4Var.b);
                Size size = msfVar.b;
                surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                a07 a07Var = yp4Var2.c;
                msfVar.c(a07Var, new i00(yp4Var2, 29, msfVar));
                msfVar.b(surface2, a07Var, new ju3() { // from class: xp4
                    @Override // defpackage.ju3
                    public final void accept(Object obj3) {
                        yp4 yp4Var3 = yp4Var2;
                        msf msfVar2 = msfVar;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        Surface surface3 = surface2;
                        synchronized (msfVar2.a) {
                            msfVar2.n = null;
                            msfVar2.o = null;
                        }
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface3.release();
                        yp4Var3.s0--;
                        yp4Var3.a();
                    }
                });
                surfaceTexture2.setOnFrameAvailableListener(yp4Var2, yp4Var2.d);
                return;
        }
    }

    public /* synthetic */ my1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
