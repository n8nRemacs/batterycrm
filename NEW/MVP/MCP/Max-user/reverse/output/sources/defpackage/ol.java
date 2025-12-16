package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.FileValidationConfig;

/* loaded from: classes2.dex */
public final /* synthetic */ class ol implements vl, uq4, w2f, uu1, yu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ol(uid uidVar, ql qlVar, yl ylVar, uid uidVar2) {
        this.a = uidVar;
        this.c = qlVar;
        this.d = ylVar;
        this.b = uidVar2;
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) throws CameraAccessException {
        awf awfVar = (awf) this.a;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        lie lieVar = (lie) this.c;
        List list = (List) this.d;
        if (awfVar.v.b) {
            Iterator it = awfVar.b.g().iterator();
            while (it.hasNext()) {
                ((awf) it.next()).j();
            }
        }
        awfVar.l("start openCaptureSession");
        synchronized (awfVar.a) {
            try {
                if (awfVar.m) {
                    return new ag7(1, new CancellationException("Opener is disabled"));
                }
                lz9 lz9Var = awfVar.b;
                synchronized (lz9Var.b) {
                    ((LinkedHashSet) lz9Var.o).add(awfVar);
                }
                wu1 wu1VarA = ixi.a(new ol(awfVar, list, new r5j(cameraDevice, awfVar.c), lieVar));
                awfVar.h = wu1VarA;
                wsf.b(wu1VarA, new s6b(awfVar), ayi.a());
                return wsf.g(awfVar.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vl
    public tl d(tl tlVar) {
        uid uidVar = (uid) this.a;
        ql qlVar = (ql) this.c;
        yl ylVar = (yl) this.d;
        uid uidVar2 = (uid) this.b;
        awd awdVar = new awd(2, tlVar);
        try {
            uidVar.a = qlVar.c(ylVar, awdVar);
        } catch (ApiInvocationException e) {
            uidVar2.a = e;
        }
        return (tl) awdVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    @Override // defpackage.uq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.zjd f(int r17, defpackage.lfg r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol.f(int, lfg, int[]):zjd");
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws Throwable {
        DownloadService.Impl.download$lambda$3((String) this.a, (File) this.b, (FileValidationConfig) this.c, (DownloadService.Impl) this.d, i2fVar);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        String str;
        awf awfVar = (awf) this.a;
        List list = (List) this.b;
        r5j r5jVar = (r5j) this.c;
        lie lieVar = (lie) this.d;
        synchronized (awfVar.a) {
            synchronized (awfVar.a) {
                synchronized (awfVar.a) {
                    try {
                        List list2 = awfVar.k;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((zr4) it.next()).b();
                            }
                            awfVar.k = null;
                        }
                    } finally {
                    }
                }
                if (!list.isEmpty()) {
                    int i = 0;
                    do {
                        try {
                            ((zr4) list.get(i)).d();
                            i++;
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((zr4) list.get(i2)).b();
                            }
                            throw e;
                        }
                    } while (i < list.size());
                }
                awfVar.k = list;
            }
            z5j.f("The openCaptureSessionCompleter can only set once!", awfVar.i == null);
            awfVar.i = tu1Var;
            ((y12) r5jVar.b).j0(lieVar);
            str = "openCaptureSession[session=" + awfVar + "]";
        }
        return str;
    }

    public /* synthetic */ ol(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
