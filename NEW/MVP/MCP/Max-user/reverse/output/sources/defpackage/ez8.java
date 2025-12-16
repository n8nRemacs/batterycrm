package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class ez8 extends dtf implements sm6 {
    public final /* synthetic */ MediaGalleryWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.X = mediaGalleryWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ez8 ez8Var = (ez8) l((ep6) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ez8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ez8 ez8Var = new ez8(this.X, continuation);
        ez8Var.o = obj;
        return ez8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ep6 ep6Var = (ep6) this.o;
        boolean z = ep6Var instanceof bp6;
        MediaGalleryWidget mediaGalleryWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = MediaGalleryWidget.Y;
            mediaGalleryWidget.y0().x0(0);
            tq6.u(mediaGalleryWidget.A0(), 2);
        } else if (ep6Var instanceof dp6) {
            yy7[] yy7VarArr2 = MediaGalleryWidget.Y;
            tq6 tq6VarA0 = mediaGalleryWidget.A0();
            ece eceVar = ((dp6) ep6Var).a;
            tq6VarA0.getClass();
            tq6VarA0.x(eceVar.a, true);
        } else {
            if (!(ep6Var instanceof cp6)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr3 = MediaGalleryWidget.Y;
            tq6 tq6VarA02 = mediaGalleryWidget.A0();
            vo6 vo6Var = ((cp6) ep6Var).a;
            tcf tcfVar = tq6VarA02.A0;
            wqi.c("tq6", "selectAlbum " + vo6Var, new Object[0]);
            ((dd) tq6VarA02.I0.getValue()).e("MEDIA_SEND_ALBUM_CHANGED");
            vo6 vo6Var2 = (vo6) tcfVar.getValue();
            if (!fni.a(vo6Var2, vo6Var)) {
                try {
                    x9f x9fVar = tq6VarA02.G0;
                    if (x9fVar != null) {
                        x9fVar.cancel((CancellationException) null);
                    }
                    x9f x9fVar2 = tq6VarA02.H0;
                    if (x9fVar2 != null) {
                        x9fVar2.cancel((CancellationException) null);
                    }
                } catch (Throwable unused) {
                }
                tq6VarA02.y0.m(null, Boolean.FALSE);
                tcfVar.m(null, vo6Var);
                tq6VarA02.v0.m(null, hd5.a);
                tq6VarA02.H0 = xfh.o(tq6VarA02, tq6VarA02.d, new oq6(vo6Var2, tq6VarA02, vo6Var, null), 2);
            }
        }
        return qqg.a;
    }
}
