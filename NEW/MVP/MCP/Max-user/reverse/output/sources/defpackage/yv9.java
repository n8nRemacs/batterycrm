package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class yv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yv9 yv9Var = (yv9) l((xr9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yv9 yv9Var = new yv9(continuation, this.X);
        yv9Var.o = obj;
        return yv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        y9d y9dVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        View contentView$message_list_release;
        g8j.b(obj);
        xr9 xr9Var = (xr9) this.o;
        boolean zA = fni.a(xr9Var, vr9.a);
        qqg qqgVar = qqg.a;
        MessagesListWidget messagesListWidget = this.X;
        if (zA) {
            yy7[] yy7VarArr = MessagesListWidget.b1;
            messagesListWidget.H0().x0(messagesListWidget.C0.j() - 1);
            return qqgVar;
        }
        if (fni.a(xr9Var, sr9.a)) {
            yy7[] yy7VarArr2 = MessagesListWidget.b1;
            messagesListWidget.K0().D().b();
            y9d y9dVar2 = messagesListWidget.K0;
            if (y9dVar2 != null) {
                y9dVar2.a();
                return qqgVar;
            }
        } else if (xr9Var instanceof ur9) {
            yy7[] yy7VarArr3 = MessagesListWidget.b1;
            p6a p6aVarD = messagesListWidget.K0().D();
            int i = ((ur9) xr9Var).a;
            List listD0 = ue3.d0(((g6a) p6aVarD.f.getValue()).a);
            if (listD0.isEmpty()) {
                p6aVarD.b();
                return qqgVar;
            }
            p6aVarD.d.invoke(listD0, Integer.valueOf(i));
            if (i == j7b.q || i == j7b.y || i == j7b.v) {
                p6aVarD.b();
                return qqgVar;
            }
        } else if (xr9Var instanceof tr9) {
            yd5 yd5Var = messagesListWidget.Z0;
            if (yd5Var != null) {
                yd5Var.q = true;
                return qqgVar;
            }
        } else {
            if (!(xr9Var instanceof wr9)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr4 = MessagesListWidget.b1;
            wr9 wr9Var = (wr9) xr9Var;
            MessageModel messageModelE = ((hr9) messagesListWidget.K0().D1.a.getValue()).e(wr9Var.a);
            o98 o98VarX = messagesListWidget.G0().t().x(messageModelE != null ? messageModelE.D0 : null, true);
            if (!o98VarX.isEmpty() && (y9dVar = messagesListWidget.K0) != null) {
                long j = wr9Var.a;
                rf5 rf5Var = y9dVar.h;
                Rect rect = y9dVar.g;
                RecyclerView recyclerView3 = y9dVar.a;
                mid midVarN = recyclerView3.N(j);
                if (midVarN == null) {
                    wqi.q(y9d.class.getName(), "not find viewholder for messageId " + j, new Object[0]);
                    return qqgVar;
                }
                View view = midVarN.a;
                uh9 uh9Var = view instanceof uh9 ? (uh9) view : null;
                if (uh9Var != null && (contentView$message_list_release = uh9Var.getContentView$message_list_release()) != null) {
                    view = contentView$message_list_release;
                }
                if (!recyclerView3.getGlobalVisibleRect(rect)) {
                    wqi.q(y9d.class.getName(), "empty recycler rect when try to show reactions popup picker", new Object[0]);
                    return qqgVar;
                }
                had hadVar = new had(recyclerView3.getContext(), y9dVar.e);
                hadVar.s0 = Long.valueOf(j);
                hadVar.o = view;
                view.getLocationOnScreen(hadVar.X);
                hadVar.d = new Rect(rect);
                Context context = hadVar.a;
                x9d x9dVar = new x9d(context, hadVar.b);
                x9dVar.a(o98VarX, null);
                x9dVar.b = hadVar;
                hadVar.c = x9dVar;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setClickable(false);
                frameLayout.setFocusable(false);
                x9d x9dVar2 = hadVar.c;
                RecyclerView recyclerView4 = x9dVar2 != null ? x9dVar2.d : null;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                float f = 6;
                layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                layoutParams.rightMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
                frameLayout.addView(recyclerView4, layoutParams);
                hadVar.setContentView(frameLayout);
                x9d x9dVar3 = hadVar.c;
                if (x9dVar3 != null && (recyclerView2 = x9dVar3.d) != null) {
                    Rect rect2 = hadVar.d;
                    recyclerView2.measure(View.MeasureSpec.makeMeasureSpec(rect2 != null ? rect2.width() : 0, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                x9d x9dVar4 = hadVar.c;
                int measuredWidth = (x9dVar4 == null || (recyclerView = x9dVar4.d) == null) ? 0 : recyclerView.getMeasuredWidth();
                if (measuredWidth <= 0) {
                    measuredWidth = -2;
                }
                hadVar.setWidth(measuredWidth);
                hadVar.setHeight(-2);
                hadVar.setElevation(vw4.d().getDisplayMetrics().density * 8.0f);
                hadVar.setOutsideTouchable(true);
                hadVar.setFocusable(false);
                hadVar.setBackgroundDrawable(new ColorDrawable(0));
                hadVar.v0 = new mc5(27, y9dVar);
                x9d x9dVar5 = hadVar.c;
                View view2 = hadVar.o;
                Rect rect3 = hadVar.d;
                if (x9dVar5 == null || view2 == null || rect3 == null || !view2.isAttachedToWindow()) {
                    wqi.c(had.class.getName(), "Can't show collapsed reaction popup", new Object[0]);
                } else {
                    dqi.e(view2, new fq(view2, hadVar, x9dVar5, rect3, 6));
                }
                recyclerView3.s0(rf5Var);
                recyclerView3.m(rf5Var);
                y9dVar.f = hadVar;
            }
        }
        return qqgVar;
    }
}
