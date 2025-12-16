package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class d6g implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ g6g c;

    public /* synthetic */ d6g(View view, g6g g6gVar, int i) {
        this.a = i;
        this.b = view;
        this.c = g6gVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [x38] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ipd] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        g6g ipdVar;
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                g6g g6gVar = this.c;
                g56 g56Var = new g56(new uxb(g6gVar.c.a, g6gVar, 27), new e6g(g6gVar, null), 1);
                try {
                    ipdVar = tfh.b(g6gVar.b);
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (!(ipdVar instanceof ipd)) {
                    g6gVar = ipdVar;
                }
                gw0.w(g56Var, g6gVar);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                g6g g6gVar = this.c;
                try {
                    CancellationException cancellationException = new CancellationException("onDetach");
                    cancellationException.initCause(null);
                    d7j.c(g6gVar, cancellationException);
                    break;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
