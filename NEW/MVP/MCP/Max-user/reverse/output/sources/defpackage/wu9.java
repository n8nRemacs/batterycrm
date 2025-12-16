package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class wu9 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ wu9(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = 0;
        Object[] objArr = 0;
        int i2 = 5;
        int i3 = 1;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                ay9 ay9VarE = messagesListWidget.K0().E();
                ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new tx9(ay9VarE, null)));
                break;
            case 1:
                MessagesListWidget messagesListWidget2 = this.b;
                FrameLayout frameLayout = (FrameLayout) obj;
                yy7[] yy7VarArr2 = MessagesListWidget.b1;
                int i4 = 6;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
                endlessRecyclerView2.setId(j7b.Q);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.setLayoutManager(messagesListWidget2.E0());
                endlessRecyclerView2.setAdapter(messagesListWidget2.C0);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.setItemAnimator(null);
                endlessRecyclerView2.setThreshold(20);
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setPager(new co2(i4, messagesListWidget2));
                endlessRecyclerView2.m(messagesListWidget2.O0);
                endlessRecyclerView2.m(messagesListWidget2.P0);
                endlessRecyclerView2.m(messagesListWidget2.Q0);
                if (!messagesListWidget2.D0().c) {
                    endlessRecyclerView2.m((bid) messagesListWidget2.R0.getValue());
                }
                endlessRecyclerView2.k(new a08(i3, messagesListWidget2));
                wu9 wu9Var = new wu9(messagesListWidget2, i2);
                s7c s7cVar = new s7c();
                s7cVar.a = wu9Var;
                s7cVar.b = t75.b;
                messagesListWidget2.I0 = s7cVar;
                xrg xrgVar = new xrg(messagesListWidget2.C0, endlessRecyclerView2);
                endlessRecyclerView2.j(xrgVar);
                messagesListWidget2.H0 = xrgVar;
                okf okfVar = new okf(endlessRecyclerView2, messagesListWidget2.C0, s7cVar);
                endlessRecyclerView2.j(okfVar);
                messagesListWidget2.J0 = okfVar;
                int i5 = 4;
                endlessRecyclerView2.j(new y71(i5));
                WeakReference weakReference = new WeakReference(endlessRecyclerView2);
                ln lnVarRequireActivity = messagesListWidget2.requireActivity();
                k18 k18Var = fq9.a;
                hvf hvfVar = new hvf(gq9.a.getAccessor().d(540), weakReference, lnVarRequireActivity, new yu9(messagesListWidget2, 10), new wu9(messagesListWidget2, i4));
                messagesListWidget2.z0 = hvfVar;
                bw9 bw9Var = new bw9(messagesListWidget2, hvfVar);
                messagesListWidget2.A0 = bw9Var;
                bw9Var.i(endlessRecyclerView2);
                tqi.c(new ld0((Object) messagesListWidget2, continuation, 28, (boolean) (objArr == true ? 1 : 0)), endlessRecyclerView2);
                frameLayout.addView(endlessRecyclerView2);
                frameLayout.addView(messagesListWidget2.C0());
                sn0 sn0Var = messagesListWidget2.Y0;
                yy7 yy7Var = MessagesListWidget.b1[12];
                frameLayout.addView((k9d) sn0Var.getValue());
                d3e d3eVar = new d3e(frameLayout.getContext());
                d3eVar.setId(j7b.R);
                d3eVar.setOnClickListener(new wu9(messagesListWidget2, i5));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388693;
                frameLayout.addView(d3eVar, layoutParams);
                break;
            case 2:
                MessagesListWidget messagesListWidget3 = this.b;
                c1h c1hVar = (c1h) obj;
                yy7[] yy7VarArr3 = MessagesListWidget.b1;
                if (c1hVar instanceof a1h) {
                    vu9 vu9VarK0 = messagesListWidget3.K0();
                    a1h a1hVar = (a1h) c1hVar;
                    vu9VarK0.getClass();
                    vu9VarK0.v1.O(vu9VarK0, vu9.U1[5], xfh.o(vu9VarK0, null, new lu9(vu9VarK0, a1hVar, null), 1));
                    messagesListWidget3.K0().J(a1hVar.c, a1hVar.a, null);
                } else {
                    if (!(c1hVar instanceof b1h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vu9 vu9VarK02 = messagesListWidget3.K0();
                    b1h b1hVar = (b1h) c1hVar;
                    bq9 bq9Var = new bq9(b1hVar.a, b1hVar.b);
                    vgd vgdVar = vu9VarK02.s1;
                    yy7 yy7Var2 = vu9.U1[2];
                    ((rl) vgdVar.b).c(Collections.singletonList(bq9Var), new es9(vu9VarK02, i, bq9Var));
                }
                return qqg.a;
            case 3:
                MessagesListWidget messagesListWidget4 = this.b;
                long jLongValue = ((Long) obj).longValue();
                yy7[] yy7VarArr4 = MessagesListWidget.b1;
                messagesListWidget4.K0().I(jLongValue);
                break;
            case 4:
                MessagesListWidget messagesListWidget5 = this.b;
                yy7[] yy7VarArr5 = MessagesListWidget.b1;
                i84 i84Var = i84.b;
                int iOrdinal = ((x2e) obj).ordinal();
                if (iOrdinal == 0) {
                    MessageModel messageModelM = messagesListWidget5.C0.M(messagesListWidget5.H0().getLinearLayoutManager().Z0());
                    if (messageModelM != null) {
                        ay9 ay9VarE2 = messagesListWidget5.K0().E();
                        ay9VarE2.f(svi.d(ay9VarE2.c, ay9VarE2.b, i84Var, new xx9(ay9VarE2, messageModelM, null)));
                    }
                } else if (iOrdinal == 1) {
                    ay9 ay9VarE3 = messagesListWidget5.K0().E();
                    ay9VarE3.f(svi.d(ay9VarE3.c, ay9VarE3.b, i84Var, new qx9(ay9VarE3, null)));
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ay9 ay9VarE4 = messagesListWidget5.K0().E();
                    ay9VarE4.f(svi.d(ay9VarE4.c, ay9VarE4.b, i84Var, new sx9(ay9VarE4, null)));
                }
                return qqg.a;
            case 5:
                MessageModel messageModelM2 = this.b.C0.M(((Integer) obj).intValue());
                CharSequence charSequence = messageModelM2 != null ? messageModelM2.X : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            default:
                MessagesListWidget messagesListWidget6 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                yy7[] yy7VarArr6 = MessagesListWidget.b1;
                messagesListWidget6.L0();
                MessageModel messageModelM3 = messagesListWidget6.C0.M(iIntValue);
                if (messageModelM3 != null) {
                    xfh.r(messagesListWidget6.I0().s0, new bs9(messageModelM3.a));
                }
                return qqg.a;
        }
        return qqg.a;
    }
}
