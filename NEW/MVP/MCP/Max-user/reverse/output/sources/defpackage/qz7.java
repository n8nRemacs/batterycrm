package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class qz7 extends dtf implements sm6 {
    public final /* synthetic */ KeyboardEmojiWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.X = keyboardEmojiWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qz7 qz7Var = (qz7) l((sc5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qz7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qz7 qz7Var = new qz7(this.X, continuation);
        qz7Var.o = obj;
        return qz7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sc5 sc5Var = (sc5) this.o;
        yy7[] yy7VarArr = KeyboardEmojiWidget.Z;
        KeyboardEmojiWidget keyboardEmojiWidget = this.X;
        RecyclerView recyclerViewY0 = keyboardEmojiWidget.y0();
        int i = sc5Var.b;
        if (i >= 0) {
            recyclerViewY0.E0();
            GridLayoutManager gridLayoutManagerD = x7j.d(recyclerViewY0);
            if (gridLayoutManagerD != null) {
                gridLayoutManagerD.o1(i, 0);
            }
        }
        RecyclerView recyclerViewZ0 = keyboardEmojiWidget.z0();
        int i2 = sc5Var.c;
        if (i2 >= 0) {
            recyclerViewZ0.E0();
            recyclerViewZ0.x0(i2);
        }
        if (sc5Var.b >= 0) {
            keyboardEmojiWidget.y0().Y();
        }
        return qqg.a;
    }
}
