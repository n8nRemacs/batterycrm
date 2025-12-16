package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class a25 extends q44 {
    public final /* synthetic */ DownloadFileFromWebAppWorker X;
    public int Y;
    public DownloadFileFromWebAppWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a25(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, q44 q44Var) {
        super(q44Var);
        this.X = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doForegroundWork(this);
    }
}
