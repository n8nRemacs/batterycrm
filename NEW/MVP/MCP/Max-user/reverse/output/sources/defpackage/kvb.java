package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* loaded from: classes.dex */
public final class kvb extends dtf implements sm6 {
    public final /* synthetic */ PhotoViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvb(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.X = photoViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kvb kvbVar = (kvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kvb kvbVar = new kvb(continuation, this.X);
        kvbVar.o = obj;
        return kvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jp2 jp2Var = (jp2) this.o;
        yy7[] yy7VarArr = PhotoViewerWidget.o;
        if (jp2Var.a != 0) {
            PhotoViewerWidget photoViewerWidget = this.X;
            j09 j09VarF = photoViewerWidget.B0().F(photoViewerWidget.z0(), photoViewerWidget.y0());
            b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
            if (b09Var != null) {
                photoViewerWidget.A0().setImageRotation(jp2Var.b);
                photoViewerWidget.A0().k(b09Var.d, true);
                photoViewerWidget.A0().requestLayout();
            }
        }
        return qqg.a;
    }
}
