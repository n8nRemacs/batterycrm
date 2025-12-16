package defpackage;

import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class bah implements abh {
    public final /* synthetic */ VideoMessageWidget a;

    public bah(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    @Override // defpackage.abh
    public final void c() {
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        VideoMessageWidget videoMessageWidget = this.a;
        if (((gu5) ((rt5) videoMessageWidget.c.getValue())).r()) {
            ((o7h) videoMessageWidget.x0.getValue()).setAlpha(1.0f);
        }
    }

    @Override // defpackage.abh
    public final void g() {
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        this.a.J0();
    }

    @Override // defpackage.abh
    public final void o() {
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        this.a.J0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.abh
    public final void r() {
        x9f x9fVar;
        VideoMessageWidget videoMessageWidget = this.a;
        if (videoMessageWidget.Y.e() && videoMessageWidget.A0.e() && ((x9fVar = videoMessageWidget.G0) == null || !x9fVar.isActive())) {
            cbh cbhVarF0 = videoMessageWidget.F0();
            int i = s65.d;
            videoMessageWidget.G0 = gw0.w(aw0.a(new g56(gw0.m(new mwd(new ebh(cbhVarF0, v9j.h(16, y65.MILLISECONDS), null))), new tah(null, videoMessageWidget), 1), videoMessageWidget.getViewLifecycleOwner().p(), l38.d), videoMessageWidget.getViewLifecycleScope());
        }
        videoMessageWidget.G0().z0.m(null, Boolean.TRUE);
    }
}
