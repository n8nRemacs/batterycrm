package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class hf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hf(View view, int i) {
        this.a = i;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = hfh.a;
                teh.c(view);
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = hfh.a;
                teh.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
