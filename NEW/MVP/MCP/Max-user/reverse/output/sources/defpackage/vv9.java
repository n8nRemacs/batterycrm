package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class vv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vv9 vv9Var = (vv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vv9 vv9Var = new vv9(continuation, this.X);
        vv9Var.o = obj;
        return vv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        t75 t75Var = (t75) this.o;
        MessagesListWidget messagesListWidget = this.X;
        xrg xrgVar = messagesListWidget.H0;
        if (xrgVar != null) {
            xrgVar.Y = t75Var;
            FrameLayout frameLayout = xrgVar.X;
            View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                vz2.g.b(textView, xrgVar.Y);
            }
        }
        s7c s7cVar = messagesListWidget.I0;
        if (s7cVar != null) {
            s7cVar.b = t75Var;
        }
        okf okfVar = messagesListWidget.J0;
        if (okfVar != null) {
            okfVar.j();
        }
        messagesListWidget.H0().Y();
        messagesListWidget.H0().invalidate();
        return qqg.a;
    }
}
