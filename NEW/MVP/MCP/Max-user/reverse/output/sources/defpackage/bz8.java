package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class bz8 extends dtf implements sm6 {
    public final /* synthetic */ MediaGalleryWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.X = mediaGalleryWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bz8 bz8Var = (bz8) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bz8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bz8 bz8Var = new bz8(this.X, continuation);
        bz8Var.o = obj;
        return bz8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        u45.o(list.size(), "uiItems: handleEvent, size = ", "MediaGalleryWidget");
        yy7[] yy7VarArr = MediaGalleryWidget.Y;
        MediaGalleryWidget mediaGalleryWidget = this.X;
        mediaGalleryWidget.y0().setVisibility(!list.isEmpty() ? 0 : 8);
        ((io6) mediaGalleryWidget.d.getValue()).E(list);
        mediaGalleryWidget.z0().o.m(null, Integer.valueOf(list.size()));
        return qqg.a;
    }
}
