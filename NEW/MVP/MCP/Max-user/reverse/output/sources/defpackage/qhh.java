package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class qhh extends hn6 implements cm6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhh(hih hihVar, View view, ViewTreeObserver viewTreeObserver) {
        super(0, 0, cq7.class, viewTreeObserver, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V");
        this.c = hihVar;
        this.b = view;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                shh.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, (ViewTreeObserver) this.c, this.b);
                break;
            default:
                dy.c((hih) this.c, this.b, (ViewTreeObserver) this.receiver);
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhh(ViewTreeObserver viewTreeObserver, View view, rhh rhhVar) {
        super(0, 0, cq7.class, rhhVar, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V");
        this.c = viewTreeObserver;
        this.b = view;
    }
}
