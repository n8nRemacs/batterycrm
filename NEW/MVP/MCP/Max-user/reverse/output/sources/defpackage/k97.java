package defpackage;

import one.me.sdk.transfer.exceptions.HttpErrorException;

/* loaded from: classes2.dex */
public final /* synthetic */ class k97 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m97 b;

    public /* synthetic */ k97(m97 m97Var, int i) {
        this.a = i;
        this.b = m97Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m97 m97Var = this.b;
        switch (i) {
            case 0:
                if (!m97Var.X.get()) {
                    wqi.e("n97", "onFileDownloadInterrupted", null);
                    m97Var.o.onError(new HttpErrorException("url expired", null));
                    m97Var.i(false);
                    break;
                }
                break;
            case 1:
                if (!m97Var.X.get()) {
                    wqi.e("n97", "onFileDownloadFailed", null);
                    m97Var.o.onError(new HttpErrorException("onFileDownloadFailed", null));
                    m97Var.i(false);
                    break;
                }
                break;
            default:
                if (!m97Var.X.get()) {
                    wqi.e("n97", "onFileDownloadInterrupted", null);
                    m97Var.o.onError(new HttpErrorException("onFileDownloadInterrupted", null));
                    m97Var.i(false);
                    break;
                }
                break;
        }
    }
}
