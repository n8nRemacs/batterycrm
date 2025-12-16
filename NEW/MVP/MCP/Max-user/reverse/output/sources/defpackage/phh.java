package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class phh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ rhh c;
    public final /* synthetic */ ViewTreeObserver d;
    public final /* synthetic */ View o;

    public /* synthetic */ phh(View view, rhh rhhVar, ViewTreeObserver viewTreeObserver, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = rhhVar;
        this.d = viewTreeObserver;
        this.o = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.o;
                ViewTreeObserver viewTreeObserver = this.d;
                rhh rhhVar = this.c;
                if (!zIsAttachedToWindow) {
                    shh.a(rhhVar, viewTreeObserver, view2);
                    break;
                } else {
                    view.addOnAttachStateChangeListener(new phh(view, rhhVar, viewTreeObserver, view2, 2));
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.removeOnAttachStateChangeListener(this);
                shh.a(this.c, this.d, this.o);
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                shh.a(this.c, this.d, this.o);
                break;
        }
    }
}
