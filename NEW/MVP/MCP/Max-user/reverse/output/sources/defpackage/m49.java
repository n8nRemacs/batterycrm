package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* loaded from: classes.dex */
public final class m49 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ r49 a;

    public m49(r49 r49Var) {
        this.a = r49Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.k(routingController);
    }
}
