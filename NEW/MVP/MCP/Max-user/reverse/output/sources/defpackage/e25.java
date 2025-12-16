package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class e25 implements btf {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    public e25(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker) {
        this.a = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.btf
    public final String a() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        long j = downloadFileFromWebAppWorker.b().b;
        long j2 = downloadFileFromWebAppWorker.b().e;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r15, long r16, long r18, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.b(float, long, long, q44):java.lang.Object");
    }

    @Override // defpackage.btf
    public final Object c(q44 q44Var) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadCancelled: " + downloadFileFromWebAppWorker.b(), null);
            }
        }
        tw0 tw0VarC = this.a.c();
        long j = this.a.b().a;
        String str = this.a.b().c;
        tw0VarC.c(new zv5(j));
        this.a.w0 = u15.a;
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object d(q44 q44Var) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadFailed: " + downloadFileFromWebAppWorker.b(), null);
            }
        }
        tw0 tw0VarC = this.a.c();
        long j = this.a.b().a;
        String str = this.a.b().c;
        tw0VarC.c(new bw5(j));
        this.a.w0 = w15.a;
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object e(q44 q44Var) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "workers:DownloadFileFromWebAppWorker", "onUrlExpired", null);
            }
        }
        tw0 tw0VarC = this.a.c();
        long j = this.a.b().a;
        String str = this.a.b().c;
        tw0VarC.c(new bw5(j));
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object f(File file, q44 q44Var) {
        wqi.c("workers:DownloadFileFromWebAppWorker", "onFileDownloadCompleted: %s", this.a.b());
        if (file != null) {
            tw0 tw0VarC = this.a.c();
            long j = this.a.b().a;
            String str = this.a.b().c;
            tw0VarC.c(new cw5(j));
            ((mw5) this.a.X.getValue()).b(file);
        }
        this.a.w0 = v15.a;
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object g(boolean z, boolean z2, q44 q44Var) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "workers:DownloadFileFromWebAppWorker", "onFileDownloadInterrupted: " + downloadFileFromWebAppWorker.b() + ", isNetworkProblem:" + z + ", retryCount:" + downloadFileFromWebAppWorker.u0.get(), null);
            }
        }
        tw0 tw0VarC = this.a.c();
        long j = this.a.b().a;
        String str = this.a.b().c;
        tw0VarC.c(new bw5(j));
        this.a.w0 = (!z || (z ? this.a.u0.incrementAndGet() : 0) > 10) ? new x15(false) : new x15(true);
        return qqg.a;
    }
}
