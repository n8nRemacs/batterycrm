package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class sug implements p97 {
    public final /* synthetic */ UploadExternalGifWorker a;

    public sug(UploadExternalGifWorker uploadExternalGifWorker) {
        this.a = uploadExternalGifWorker;
    }

    @Override // defpackage.p97
    public final String a() {
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        return uploadExternalGifWorker.c().d + "_" + uploadExternalGifWorker.c().c;
    }

    @Override // defpackage.p97
    public final void b() {
        wqi.e("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadFailed", null);
        this.a.y0 = tha.y0;
    }

    @Override // defpackage.p97
    public final void c() {
        wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCancelled", new Object[0]);
        this.a.y0 = rha.B0;
    }

    @Override // defpackage.p97
    public final void d() {
        wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onUrlExpired", new Object[0]);
        ((y3b) ((yi5) this.a.v0.getValue())).a(new IllegalStateException("ru.ok.tamtam.upload.workers.UploadExternalGifWorker. onUrlExpired. Tenor gif url expired"));
        this.a.y0 = wha.B0;
    }

    @Override // defpackage.p97
    public final void f(File file) throws Throwable {
        wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted", new Object[0]);
        ((a3g) this.a.Z.getValue()).d(this.a.c().a);
        UploadExternalGifWorker.b(this.a);
        si9 si9VarM = ((qi9) this.a.d.getValue()).m(this.a.c().d);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted: Message was deleted", new Object[0]);
            this.a.y0 = nug.a;
            return;
        }
        File fileJ = ((iz5) ((qx5) this.a.c.getValue())).j(this.a.c().f);
        if (!pbj.b(fileJ)) {
            ((u6b) this.a.s0.getValue()).d(file, fileJ);
        }
        this.a.y0 = new mug(new vo5(file.getAbsolutePath(), 0, 0, null, null, null));
    }

    @Override // defpackage.p97
    public final void g() {
        wqi.e("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadInterrupted: Can't download video", null);
        ((a3g) this.a.Z.getValue()).n(this.a.c().a, c3g.b);
        this.a.y0 = uha.B0;
    }

    @Override // defpackage.p97
    public final void h(float f, long j) throws Throwable {
        wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress progress = %s " + f, new Object[0]);
        long jNanoTime = System.nanoTime();
        if ((f > 1.0f || f < 100.0f) && Math.abs(jNanoTime - this.a.x0) < 500000000) {
            wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "Skip progress", new Object[0]);
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        uploadExternalGifWorker.x0 = jNanoTime;
        si9 si9VarM = ((qi9) uploadExternalGifWorker.d.getValue()).m(this.a.c().d);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            wqi.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress: Message was deleted", new Object[0]);
            ((q97) this.a.X.getValue()).a(((iz5) ((qx5) this.a.c.getValue())).l(this.a.c().f), this.a.c().f);
            ((a3g) this.a.Z.getValue()).d(this.a.c().a);
            UploadExternalGifWorker.b(this.a);
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker2 = this.a;
        int i = 0;
        if (!Float.isNaN(f)) {
            int iD = kti.d(f);
            if (iD < 0) {
                i = -1;
            } else if (iD != 0) {
                i = (1 > iD || iD >= 101) ? 100 : iD;
            }
        }
        uploadExternalGifWorker2.y0 = new oug(i, si9VarM.c);
    }
}
