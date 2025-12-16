package androidx.mediarouter.app;

import android.view.animation.Animation;
import defpackage.pkb;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.N0;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            pkb pkbVar = (pkb) it.next();
            if (!pkbVar.j) {
                pkbVar.i = overlayListView.getDrawingTime();
                pkbVar.j = true;
            }
        }
        dVar.N0.postDelayed(dVar.x1, dVar.q1);
    }
}
