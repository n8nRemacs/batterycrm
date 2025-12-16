package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class uu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uu8 uu8Var = (uu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uu8 uu8Var = new uu8(continuation, this.X);
        uu8Var.o = obj;
        return uu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String string;
        g8j.b(obj);
        wae waeVar = (wae) this.o;
        boolean z = waeVar instanceof vae;
        MediaBarWidget mediaBarWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = MediaBarWidget.c1;
            mediaBarWidget.L0().setVisibility(8);
        } else if (waeVar instanceof tae) {
            mediaBarWidget.F0 = ((tae) waeVar).a;
            MediaBarWidget.A0(mediaBarWidget);
            mediaBarWidget.M0().setDropdownRotationProgress(r5.a / 512.0f);
        } else if (waeVar instanceof uae) {
            yy7[] yy7VarArr2 = MediaBarWidget.c1;
            uae uaeVar = (uae) waeVar;
            xfh.r(mediaBarWidget.G0().d, new cp6(uaeVar.a));
            l4 l4VarC = uaeVar.a.a.c();
            if (l4VarC instanceof jo6) {
                string = mediaBarWidget.getContext().getString(((jo6) l4VarC).a);
            } else {
                if (!(l4VarC instanceof ko6)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = ((ko6) l4VarC).a;
            }
            mediaBarWidget.M0().setTitle(string);
        }
        return qqg.a;
    }
}
