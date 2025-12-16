package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class p49 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ r49 a;

    public p49(r49 r49Var) {
        this.a = r49Var;
    }

    public final void onRoutesAdded(List list) {
        this.a.j();
    }

    public final void onRoutesChanged(List list) {
        this.a.j();
    }

    public final void onRoutesRemoved(List list) {
        this.a.j();
    }
}
