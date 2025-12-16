package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;

/* loaded from: classes2.dex */
public final class uaa extends j3 implements uz4 {
    public pz4 X;
    public final zg d;
    public pz4 o;

    public uaa(Context context, DoubleTapVideoViewWrapper doubleTapVideoViewWrapper, zg zgVar) {
        super(context);
        this.d = zgVar;
        this.c = doubleTapVideoViewWrapper;
        i();
        doubleTapVideoViewWrapper.setTouchEventListener(this);
    }

    @Override // defpackage.j3
    public final void i() {
        this.o = (pz4) ((View) this.c).findViewById(q0d.double_tap_video_view_wrapper__arrows_view_left);
        this.X = (pz4) ((View) this.c).findViewById(q0d.double_tap_video_view_wrapper__arrows_view_right);
        pz4 pz4Var = this.o;
        zg zgVar = this.d;
        pz4Var.setAnimations(zgVar);
        this.X.setAnimations(zgVar);
    }

    public final void z(taa taaVar) throws Resources.NotFoundException {
        boolean z = taaVar.c;
        int i = taaVar.a;
        if (!z) {
            this.o.a();
            this.X.a();
        } else if (taaVar.b) {
            this.o.a();
            this.X.b();
            this.X.c(i);
        } else {
            this.o.b();
            this.o.c(i);
            this.X.a();
        }
    }
}
