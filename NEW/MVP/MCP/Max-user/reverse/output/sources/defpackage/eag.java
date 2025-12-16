package defpackage;

import javax.net.ssl.SSLException;

/* loaded from: classes2.dex */
public final /* synthetic */ class eag implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yag b;

    public /* synthetic */ eag(yag yagVar, int i) {
        this.a = i;
        this.b = yagVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws SSLException {
        switch (this.a) {
            case 0:
                Runnable delegatedTask = this.b.a.getDelegatedTask();
                if (delegatedTask != null) {
                    delegatedTask.run();
                    break;
                }
                break;
            case 1:
                this.b.a.beginHandshake();
                break;
            default:
                Runnable delegatedTask2 = this.b.a.getDelegatedTask();
                if (delegatedTask2 != null) {
                    delegatedTask2.run();
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
