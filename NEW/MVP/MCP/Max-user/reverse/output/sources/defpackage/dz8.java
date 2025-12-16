package defpackage;

import android.util.Log;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class dz8 extends dtf implements sm6 {
    public final /* synthetic */ MediaGalleryWidget X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.X = mediaGalleryWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        dz8 dz8Var = (dz8) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dz8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dz8 dz8Var = new dz8(this.X, continuation);
        dz8Var.o = ((Boolean) obj).booleanValue();
        return dz8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        Log.d("MediaGalleryWidget", "isItemsLoading = " + z);
        yy7[] yy7VarArr = MediaGalleryWidget.Y;
        this.X.y0().setRefreshingNext(z);
        return qqg.a;
    }
}
