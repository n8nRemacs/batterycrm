package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d2g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2g b;
    public final /* synthetic */ p44 c;
    public final /* synthetic */ Task d;

    public /* synthetic */ d2g(o2g o2gVar, p44 p44Var, Task task, int i) {
        this.a = i;
        this.b = o2gVar;
        this.c = p44Var;
        this.d = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2g o2gVar = this.b;
                try {
                    o2gVar.c(this.c.a(this.d));
                    break;
                } catch (CancellationException unused) {
                    o2gVar.a();
                    return;
                } catch (Exception e) {
                    o2gVar.b(e);
                    return;
                }
            default:
                o2g o2gVar2 = this.b;
                try {
                    Task task = (Task) this.c.a(this.d);
                    if (task == null) {
                        o2gVar2.c(null);
                    } else {
                        task.continueWith(new e2g(0, this));
                    }
                    break;
                } catch (CancellationException unused2) {
                    o2gVar2.a();
                    return;
                } catch (Exception e2) {
                    o2gVar2.b(e2);
                    return;
                }
        }
    }
}
