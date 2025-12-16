package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class fih implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ hih d;
    public final /* synthetic */ View o;

    public /* synthetic */ fih(View view, ViewTreeObserver viewTreeObserver, hih hihVar, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.d = hihVar;
        this.o = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.o;
                hih hihVar = this.d;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!zIsAttachedToWindow) {
                    dy.c(hihVar, view2, viewTreeObserver);
                    break;
                } else {
                    view.addOnAttachStateChangeListener(new fih(view, viewTreeObserver, hihVar, view2, 1));
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                dy.c(this.d, this.o, this.c);
                break;
        }
    }
}
