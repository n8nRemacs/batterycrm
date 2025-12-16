package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class hhf extends dtf implements sm6 {
    public final /* synthetic */ StickersScreen X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(Continuation continuation, StickersScreen stickersScreen, View view) {
        super(2, continuation);
        this.X = stickersScreen;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hhf hhfVar = (hhf) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hhfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hhf hhfVar = new hhf(continuation, this.X, this.Y);
        hhfVar.o = obj;
        return hhfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        StickersScreen stickersScreen = this.X;
        sn0 sn0Var = stickersScreen.Y;
        sn0 sn0Var2 = stickersScreen.X;
        ghf ghfVar = stickersScreen.a;
        ghf ghfVar2 = ghf.d;
        View view = this.Y;
        if (ghfVar == ghfVar2 && !sn0Var.e()) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                fqi.c(viewGroup, (View) sn0Var.getValue(), -1);
            }
            View view2 = (View) sn0Var.getValue();
            mgb.a(view2, new zn6(view2, 29, stickersScreen));
        }
        stickersScreen.t0.E(list);
        if (list.isEmpty()) {
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                fqi.c(viewGroup2, (View) sn0Var2.getValue(), -1);
            }
            if (sn0Var2.e()) {
                ugf ugfVar = (ugf) sn0Var2.getValue();
                ghf ghfVar3 = ghf.b;
                ugfVar.setTitle(ghfVar == ghfVar3 ? vdb.c : vdb.a);
                ugfVar.setSubtitle(ghfVar == ghfVar3 ? Integer.valueOf(vdb.b) : null);
                ugfVar.setIcon(tdb.b);
            }
            ((View) sn0Var2.getValue()).setVisibility(0);
            stickersScreen.y0().setVisibility(8);
            stickersScreen.z0().setRightActions(jfb.a);
        } else {
            stickersScreen.y0().setVisibility(0);
            bqi.a(sn0Var2);
            stickersScreen.z0().setRightActions(new nfb(new ts9(1, stickersScreen, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 14)));
        }
        return qqg.a;
    }
}
