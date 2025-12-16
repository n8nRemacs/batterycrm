package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class o69 extends MediaRouter.VolumeCallback {
    public final n69 a;

    public o69(n69 n69Var) {
        this.a = n69Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(routeInfo, i);
    }
}
