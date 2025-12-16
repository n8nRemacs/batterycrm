package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class ei1 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ ei1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (i) {
            case 0:
                in inVar = (in) obj;
                yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                re3 re3Var = new re3(inVar.getContext());
                gn gnVar = new gn();
                gnVar.a = 19;
                re3Var.setLayoutParams(gnVar);
                re3Var.setTitleEnabled(false);
                Toolbar toolbar = new Toolbar(re3Var.getContext(), null);
                oe3 oe3Var = new oe3(-1, -2);
                oe3Var.a = 1;
                toolbar.setLayoutParams(oe3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                toolbar.addView(callOpponentsListWidget.D0());
                re3Var.addView(toolbar);
                ei1 ei1Var = new ei1(callOpponentsListWidget, 3);
                View viewZ0 = callOpponentsListWidget.z0();
                ei1Var.invoke(viewZ0);
                re3Var.addView(viewZ0);
                inVar.addView(re3Var);
                inVar.addView(callOpponentsListWidget.C0());
                break;
            case 1:
                yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
                break;
            case 2:
                yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                ci5 ci5Var = callOpponentsListWidget.E0().D0;
                ug1.c.getClass();
                xfh.r(ci5Var, new ei4(":call-admin-settings"));
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                sn0 sn0Var = callOpponentsListWidget.w0;
                yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                yy7 yy7Var = yy7VarArr5[5];
                linearLayout.addView((TextView) sn0Var.getValue());
                sn0 sn0Var2 = callOpponentsListWidget.x0;
                yy7 yy7Var2 = yy7VarArr5[6];
                linearLayout.addView((TextView) sn0Var2.getValue());
                linearLayout.addView(callOpponentsListWidget.B0());
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(j0b.W0);
                dpg.q.b(textView, t75.b);
                textView.setTextColor(a93.s0.B(textView).c.getText().g);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(m0b.A);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f = 12;
                layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                layoutParams.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                layoutParams.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(8);
                linearLayout.addView(textView);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setId(j0b.T0);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((la) callOpponentsListWidget.E0.getValue());
                recyclerView.setItemAnimator(null);
                linearLayout.addView(recyclerView);
                sn0 sn0Var3 = callOpponentsListWidget.y0;
                yy7 yy7Var3 = yy7VarArr5[7];
                linearLayout.addView((TextView) sn0Var3.getValue());
                break;
        }
        return qqgVar;
    }
}
