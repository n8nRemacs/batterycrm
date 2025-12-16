package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public abstract class en9 extends d2f implements ry2 {
    public final int E0;
    public final int F0;
    public final int G0;
    public fn9 H0;

    public en9(View view) {
        super(view);
        this.E0 = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.F0 = kti.d(2 * vw4.d().getDisplayMetrics().density);
        this.G0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        tqi.c(new ld0(this, view, (Continuation) null, 24), view);
    }

    public abstract void F(MessageModel messageModel, List list);

    public final void G(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof th9;
        th9 th9Var = z ? (th9) marginLayoutParams : null;
        boolean z2 = th9Var != null ? th9Var.a : true;
        int i3 = messageModel.K0;
        int i4 = 2080374784 & i3;
        int i5 = 134217728 & i3;
        int i6 = this.E0;
        if (i5 != 0) {
            marginLayoutParams.topMargin = i6;
            marginLayoutParams.bottomMargin = i6;
        } else {
            int i7 = 268435456 & i3;
            int i8 = this.F0;
            if (i7 != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i8;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i8;
                marginLayoutParams.bottomMargin = i8;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i8;
                marginLayoutParams.bottomMargin = i6;
            } else if (i3 == 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if (fn9.e(i3)) {
                int i9 = this.G0;
                marginLayoutParams.topMargin = i9;
                marginLayoutParams.bottomMargin = i9;
            }
        }
        if (i3 != 0 && !fn9.e(i3) && z) {
            ((th9) marginLayoutParams).a = du0.a(i4);
        }
        if (i == marginLayoutParams.topMargin && i2 == marginLayoutParams.bottomMargin && (!z || z2 == ((th9) marginLayoutParams).a)) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        F((MessageModel) t98Var, hd5.a);
    }
}
