package defpackage;

import ru.ok.tamtam.loader.AsyncHistoryLoader$AsyncHistoryLoaderException;

/* loaded from: classes2.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul2 b;
    public final /* synthetic */ eh9 c;

    public /* synthetic */ zu(ul2 ul2Var, eh9 eh9Var, int i) {
        this.a = i;
        this.b = ul2Var;
        this.c = eh9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ul2 ul2Var = this.b;
                try {
                    ul2Var.b.b(this.c);
                    break;
                } catch (Throwable th) {
                    ((y3b) ul2Var.X).a(new AsyncHistoryLoader$AsyncHistoryLoaderException("addHistoryItem: exception", th));
                    return;
                }
            default:
                ul2 ul2Var2 = this.b;
                try {
                    ul2Var2.b.r(this.c);
                    break;
                } catch (Throwable th2) {
                    ((y3b) ul2Var2.X).a(new AsyncHistoryLoader$AsyncHistoryLoaderException("updateHistoryItemSync: exception", th2));
                }
        }
    }
}
