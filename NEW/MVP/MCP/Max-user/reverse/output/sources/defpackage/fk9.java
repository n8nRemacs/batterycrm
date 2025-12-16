package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class fk9 extends w3b {
    public final /* synthetic */ ik9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk9(Context context, ik9 ik9Var) {
        super(context, 14);
        this.b = ik9Var;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        ik9 ik9Var = this.b;
        if (ik9Var.c == null) {
            return;
        }
        if (!hasSelection()) {
            dk9 dk9Var = ik9Var.c;
            if (dk9Var != null) {
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) ((ao6) dk9Var).b;
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                bl8 bl8VarD0 = messageWriteWidget.D0();
                bl8VarD0.getClass();
                bl8.t(bl8VarD0, 1);
                return;
            }
            return;
        }
        dk9 dk9Var2 = ik9Var.c;
        if (dk9Var2 != null) {
            MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) ((ao6) dk9Var2).b;
            yy7[] yy7VarArr2 = MessageWriteWidget.L0;
            bl8 bl8VarD02 = messageWriteWidget2.D0();
            if (((cl8) bl8VarD02.X.getValue()).b != 1) {
                return;
            }
            bl8.t(bl8VarD02, 2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
