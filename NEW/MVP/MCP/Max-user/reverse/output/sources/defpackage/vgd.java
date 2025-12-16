package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes.dex */
public final class vgd implements rn6, bbd, gu3, zhf, jpf, hdh, ohh, vva, nva, kva, pi0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vgd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hdh
    public int B() {
        return 2;
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        return (rl) this.b;
    }

    @Override // defpackage.hdh
    public int F() {
        g2h g2hVar = ((VideoMessageWidget) this.b).y0;
        return g2hVar != null ? g2hVar.getHeight() : kti.d(352 * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.hdh
    public void J(Surface surface, a3h a3hVar) {
        String str = ((VideoMessageWidget) this.b).X;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Video Message screen, set surface " + surface, null);
            }
        }
        ((VideoMessageWidget) this.b).F0().a0(surface);
        ((VideoMessageWidget) this.b).F0().O(a3hVar);
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 0:
                gri.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(((a60) this.b).hashCode())));
                break;
            default:
                ((CountDownLatch) this.b).countDown();
                break;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Object next;
        rf2 rf2Var;
        p3b p3bVar;
        e94 e94Var;
        Float fK;
        switch (this.a) {
            case 2:
                wqi.e(((wge) this.b).o, "Error while runAfterDelay", (Throwable) obj);
                return;
            case 9:
                xm9 xm9Var = (xm9) obj;
                UploadDraftMediaWorker uploadDraftMediaWorker = (UploadDraftMediaWorker) this.b;
                uploadDraftMediaWorker.getClass();
                wqi.c("UploadDraftMediaWorker", "onUploadUpdate %s", xm9Var);
                if (xm9Var.a.a()) {
                    wqi.c("UploadDraftMediaWorker", "onUploadSuccess: key = " + uploadDraftMediaWorker.c().a + ", messageUploadState = " + xm9Var, new Object[0]);
                    pb2 pb2VarM = uploadDraftMediaWorker.b().M(uploadDraftMediaWorker.c().a.a);
                    if (pb2VarM == null) {
                        wqi.e("UploadDraftMediaWorker", "onUploadSuccess: chat is null", null);
                        return;
                    }
                    p3b p3bVar2 = pb2VarM.b.c0;
                    if (p3bVar2 == null) {
                        wqi.e("UploadDraftMediaWorker", "onUploadSuccess: draft is null", null);
                        uploadDraftMediaWorker.x0 = la8.a();
                        return;
                    }
                    jdc jdcVarA = p3bVar2.a();
                    if (jdcVarA == null) {
                        wqi.e("UploadDraftMediaWorker", "onUploadSuccess: attaches is null", null);
                        uploadDraftMediaWorker.x0 = la8.a();
                        return;
                    }
                    x10 x10VarD = jdcVarA.D();
                    to8.t(x10VarD, uploadDraftMediaWorker.c().a.b, new eug(xm9Var, 0));
                    x10VarD.c();
                    ((q3b) uploadDraftMediaWorker.o.getValue()).a(p3bVar2);
                    ve2 ve2VarB = uploadDraftMediaWorker.b();
                    long j = pb2VarM.a;
                    Long lB = p3bVar2.b();
                    ve2VarB.u(j, lB != null ? lB.longValue() : 0L, p3bVar2);
                    for (r2g r2gVar : ((a3g) uploadDraftMediaWorker.X.getValue()).i(Collections.singletonList(usb.V0))) {
                        tsb tsbVar = r2gVar.f;
                        if ((tsbVar instanceof b35) && ((b35) tsbVar).d == pb2VarM.a) {
                            ((a3g) uploadDraftMediaWorker.X.getValue()).d(r2gVar.a);
                        }
                    }
                    she.v((c6i) uploadDraftMediaWorker.c.getValue());
                    uploadDraftMediaWorker.x0 = la8.b();
                    return;
                }
                if (xm9Var.a.g != vvg.UPLOADING) {
                    wqi.e("UploadDraftMediaWorker", "onUploadUpdate: failed. Unknown upload state. key = " + uploadDraftMediaWorker.c().a + ", state = " + xm9Var, null);
                    uploadDraftMediaWorker.e(new Throwable("Internal error. Unknown upload state"));
                    return;
                }
                y25 y25Var = uploadDraftMediaWorker.c().a;
                wqi.c("UploadDraftMediaWorker", "onUploadProgress: key = " + y25Var + ", messageUploadState = " + xm9Var, new Object[0]);
                pb2 pb2VarM2 = uploadDraftMediaWorker.b().M(uploadDraftMediaWorker.c().a.a);
                jdc jdcVarA2 = (pb2VarM2 == null || (rf2Var = pb2VarM2.b) == null || (p3bVar = rf2Var.c0) == null) ? null : p3bVar.a();
                String str = uploadDraftMediaWorker.c().a.b;
                if (jdcVarA2 != null && jdcVarA2.p() > 0) {
                    Iterator it = ((List) jdcVarA2.b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (fni.a(((w10) next).r, str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (next != null) {
                        float f = xm9Var.a.e;
                        int i = 0;
                        if (!Float.isNaN(f)) {
                            int iD = kti.d(f);
                            if (iD < 0) {
                                i = -1;
                            } else if (iD != 0) {
                                i = (1 > iD || iD >= 101) ? 100 : iD;
                            }
                        }
                        uploadDraftMediaWorker.w0 = i;
                        pb2 pb2VarM3 = uploadDraftMediaWorker.b().M(y25Var.a);
                        if (pb2VarM3 == null) {
                            wqi.e("UploadDraftMediaWorker", "onUploadSuccess: chat is null", null);
                            uploadDraftMediaWorker.x0 = la8.a();
                            return;
                        }
                        p3b p3bVar3 = pb2VarM3.b.c0;
                        if (p3bVar3 == null) {
                            wqi.e("UploadDraftMediaWorker", "onUploadSuccess: draft is null", null);
                            uploadDraftMediaWorker.x0 = la8.a();
                            return;
                        }
                        jdc jdcVarA3 = p3bVar3.a();
                        if (jdcVarA3 == null) {
                            wqi.e("UploadDraftMediaWorker", "onUploadSuccess: attaches is null", null);
                            uploadDraftMediaWorker.x0 = la8.a();
                            return;
                        }
                        x10 x10VarD2 = jdcVarA3.D();
                        to8.t(x10VarD2, y25Var.b, new eug(xm9Var, 1));
                        x10VarD2.c();
                        ((q3b) uploadDraftMediaWorker.o.getValue()).a(p3bVar3);
                        ve2 ve2VarB2 = uploadDraftMediaWorker.b();
                        long j2 = pb2VarM3.a;
                        Long lB2 = p3bVar3.b();
                        ve2VarB2.u(j2, lB2 != null ? lB2.longValue() : 0L, p3bVar3);
                        return;
                    }
                }
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "UploadDraftMediaWorker", "cancelUploadIfAttachIsDeleted: chat or attach is deleted: attachLocalId =" + uploadDraftMediaWorker.c().a.b + ", chatId = " + uploadDraftMediaWorker.c().a.a, null);
                    }
                }
                uploadDraftMediaWorker.i();
                return;
            default:
                ((Number) obj).longValue();
                u00 u00Var = (u00) ((v6d) this.b).c;
                e94 e94VarE = ((rl) u00Var.d).e();
                if (e94VarE != null && (e94Var = (e94) ((rl) u00Var.d).c) != null && (fK = ((i5i) u00Var.c).k(e94VarE, e94Var)) != null) {
                    long jFloatValue = (long) (fK.floatValue() * 100 * ((Number) ((bwf) ((zva) u00Var.b).d).getValue()).longValue() * ((Number) ((bwf) ((zva) u00Var.b).b).getValue()).longValue());
                    synchronized (u00Var.g) {
                        u00Var.a = Math.max(u00Var.a, jFloatValue);
                    }
                    synchronized (u00Var.g) {
                        u00Var.f += jFloatValue;
                        u00Var.e++;
                    }
                }
                h1h h1hVar = (h1h) ((v6d) this.b).o;
                ((rl) h1hVar.f).e();
                e94 e94Var2 = (e94) ((rl) h1hVar.f).c;
                if (e94Var2 == null) {
                    return;
                }
                long jLongValue = ((Number) ((bwf) ((zva) h1hVar.b).c).getValue()).longValue() * e94Var2.b.f;
                synchronized (h1hVar.e) {
                    h1hVar.c = Math.max(jLongValue, h1hVar.c);
                }
                synchronized (h1hVar.e) {
                    h1hVar.d += jLongValue;
                    h1hVar.g++;
                }
                return;
        }
    }

    @Override // defpackage.kva
    public void b() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.ohh
    public lda c(int i) {
        List list = (List) ((SparseArray) this.b).get(i);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(ho7.f(i, "Cannot find the wrapper for global view type "));
        }
        return (lda) list.get(0);
    }

    @Override // defpackage.pi0
    public int d() {
        return ((zcj) this.b).X;
    }

    @Override // defpackage.zhf
    public void e(fff fffVar) {
        ((sgf) this.b).X.a(fffVar);
    }

    @Override // defpackage.pi0
    public Rect f() {
        Point[] pointArr = ((zcj) this.b).o;
        if (pointArr == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // defpackage.zhf
    public void g(fff fffVar) {
        t09 t09Var = (t09) ((sgf) this.b).X.a.b.getValue();
        xfh.r(t09Var.o, new q09(fffVar.a));
        xfh.r(t09Var.o, p09.a);
    }

    @Override // defpackage.pi0
    public int getFormat() {
        return ((zcj) this.b).a;
    }

    @Override // defpackage.pi0
    public String h() {
        return ((zcj) this.b).c;
    }

    @Override // defpackage.zhf
    public void i(dgf dgfVar) {
        KeyboardStickersWidget keyboardStickersWidget = ((sgf) this.b).X.a;
        yy7[] yy7VarArr = KeyboardStickersWidget.s0;
        ikf ikfVarA0 = keyboardStickersWidget.A0();
        ikfVarA0.x0.O(ikfVarA0, ikf.z0[1], svi.d(ikfVarA0.a, ((q2b) ikfVarA0.b).b(), i84.b, new fkf(ikfVarA0, dgfVar, null)));
    }

    @Override // defpackage.ohh
    public nhh j(lda ldaVar) {
        return new enb(this, ldaVar, false, 17);
    }

    @Override // defpackage.jpf
    public Object k(q44 q44Var) {
        xqf xqfVar = (xqf) this.b;
        return svi.i(((q2b) xqfVar.i).a(), new rqf(xqfVar, null), q44Var);
    }

    @Override // defpackage.pi0
    public Point[] l() {
        return ((zcj) this.b).o;
    }

    @Override // defpackage.hdh
    public int m() {
        g2h g2hVar = ((VideoMessageWidget) this.b).y0;
        return g2hVar != null ? g2hVar.getWidth() : kti.d(352 * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.hdh
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoMessageWidget) this.b).X;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "Video Message screen, surface destroyed " + surfaceTexture, null);
        }
    }

    public vgd(int i) {
        this.a = i;
        switch (i) {
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                this.b = new rl(6);
                break;
            case 13:
                this.b = new CountDownLatch(1);
                break;
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        gri.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((a60) this.b).hashCode())));
    }

    public vgd(View view) {
        this.a = 4;
        if (Build.VERSION.SDK_INT >= 30) {
            l6f l6fVar = new l6f(5, view);
            l6fVar.c = view;
            this.b = l6fVar;
            return;
        }
        this.b = new ulc(5, view);
    }

    public vgd(no3 no3Var) {
        this.a = 7;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), no3Var);
    }
}
