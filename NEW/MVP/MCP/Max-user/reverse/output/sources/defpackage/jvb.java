package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* loaded from: classes.dex */
public final class jvb extends dtf implements sm6 {
    public final /* synthetic */ PhotoViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvb(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.X = photoViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jvb jvbVar = (jvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jvb jvbVar = new jvb(continuation, this.X);
        jvbVar.o = obj;
        return jvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zh5 zh5Var = (zh5) this.o;
        yy7[] yy7VarArr = PhotoViewerWidget.o;
        boolean z = zh5Var instanceof ph5;
        PhotoViewerWidget photoViewerWidget = this.X;
        if (z) {
            ph5 ph5Var = (ph5) zh5Var;
            if (fni.a(ph5Var.a.w(), photoViewerWidget.y0()) && ph5Var.a.j() == photoViewerWidget.z0()) {
                j09 j09VarF = photoViewerWidget.B0().F(photoViewerWidget.z0(), photoViewerWidget.y0());
                b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
                if (b09Var != null) {
                    if (photoViewerWidget.A0().getFailure()) {
                        photoViewerWidget.B0().K(photoViewerWidget.z0(), photoViewerWidget.y0());
                        photoViewerWidget.A0().k(b09Var.d, photoViewerWidget.A0().getFailure());
                    } else {
                        photoViewerWidget.B0().L(photoViewerWidget.z0(), photoViewerWidget.y0());
                    }
                }
            }
        } else if (zh5Var instanceof rh5) {
            b09 b09Var2 = ((rh5) zh5Var).a;
            if (fni.a(b09Var2.X, photoViewerWidget.y0()) && b09Var2.a == photoViewerWidget.z0()) {
                photoViewerWidget.A0().k(b09Var2.d, true);
            }
        }
        return qqg.a;
    }
}
