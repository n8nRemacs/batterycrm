package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class gv8 extends dtf implements sm6 {
    public final /* synthetic */ LinearLayout X;
    public final /* synthetic */ MediaBarWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv8(Continuation continuation, LinearLayout linearLayout, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = linearLayout;
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gv8 gv8Var = (gv8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gv8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gv8 gv8Var = new gv8(continuation, this.X, this.Y);
        gv8Var.o = obj;
        return gv8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ice iceVar;
        g8j.b(obj);
        int i = ((Boolean) this.o).booleanValue() ? 0 : 8;
        LinearLayout linearLayout = this.X;
        linearLayout.setVisibility(i);
        yy7[] yy7VarArr = MediaBarWidget.c1;
        MediaBarWidget mediaBarWidget = this.Y;
        sn0 sn0Var = mediaBarWidget.H0;
        yy7[] yy7VarArr2 = MediaBarWidget.c1;
        yy7 yy7Var = yy7VarArr2[12];
        RecyclerView recyclerView = (RecyclerView) sn0Var.getValue();
        if (linearLayout.getVisibility() == 0) {
            sn0 sn0Var2 = mediaBarWidget.G0;
            yy7 yy7Var2 = yy7VarArr2[11];
            iceVar = (ice) sn0Var2.getValue();
        } else {
            iceVar = null;
        }
        recyclerView.setAdapter(iceVar);
        return qqg.a;
    }
}
