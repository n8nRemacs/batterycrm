package defpackage;

import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class iu6 implements abh {
    public final /* synthetic */ int a;
    public final /* synthetic */ cbh b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu6(Object obj, cbh cbhVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = cbhVar;
    }

    @Override // defpackage.abh
    public final void c() {
        switch (this.a) {
            case 0:
                hc8 hc8Var = ((GifViewerWidget) this.c).Z;
                if (hc8Var != null) {
                    hc8Var.s();
                }
                this.b.C(this);
                break;
            case 1:
                ((qdh) this.c).c(true);
                this.b.C(this);
                break;
            default:
                hc8 hc8Var2 = ((VideoViewerWidget) this.c).Z;
                if (hc8Var2 != null) {
                    hc8Var2.s();
                }
                this.b.C(this);
                break;
        }
    }
}
