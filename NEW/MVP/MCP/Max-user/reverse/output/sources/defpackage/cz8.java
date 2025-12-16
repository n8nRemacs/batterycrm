package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class cz8 extends dtf implements sm6 {
    public final /* synthetic */ MediaGalleryWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.X = mediaGalleryWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cz8 cz8Var = (cz8) l((ap6) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cz8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cz8 cz8Var = new cz8(this.X, continuation);
        cz8Var.o = obj;
        return cz8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ap6 ap6Var = (ap6) this.o;
        if (!(ap6Var instanceof yo6)) {
            if (!(ap6Var instanceof zo6)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaGalleryWidget mediaGalleryWidget = this.X;
            ((qsb) mediaGalleryWidget.a.getValue()).k(new s2i(mediaGalleryWidget, 1));
        }
        return qqg.a;
    }
}
