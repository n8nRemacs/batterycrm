package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* loaded from: classes2.dex */
public final class gbe extends dtf implements sm6 {
    public final /* synthetic */ SelectAlbumWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbe(Continuation continuation, SelectAlbumWidget selectAlbumWidget) {
        super(2, continuation);
        this.X = selectAlbumWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gbe gbeVar = (gbe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gbeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gbe gbeVar = new gbe(continuation, this.X);
        gbeVar.o = obj;
        return gbeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((rae) this.o) == null) {
            throw new NoWhenBranchMatchedException();
        }
        yy7[] yy7VarArr = SelectAlbumWidget.X;
        this.X.z0().j(true);
        return qqg.a;
    }
}
