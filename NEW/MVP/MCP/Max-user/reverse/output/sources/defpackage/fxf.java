package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class fxf extends a69 {
    public final Object a;

    public fxf(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.a69
    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.a69
    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
