package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final /* synthetic */ class ie1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ ie1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        final int i2 = 1;
        etd etdVar = etd.a;
        final int i3 = 0;
        final CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = CallJoinLinkPreviewWidget.A0;
                return new kj1(new bwf(new ie1(callJoinLinkPreviewWidget, 4)), new s2i(callJoinLinkPreviewWidget, 0));
            case 1:
                yy7[] yy7VarArr2 = CallJoinLinkPreviewWidget.A0;
                OneMeButton oneMeButton = new OneMeButton(callJoinLinkPreviewWidget.getContext(), null);
                oneMeButton.setId(View.generateViewId());
                oneMeButton.setText(m0b.r0);
                oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                oneMeButton.setMode(iza.a);
                oneMeButton.setSize(jza.c);
                oneMeButton.setAppearance(gza.d);
                f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: je1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z;
                        int i4 = i2;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i4) {
                            case 0:
                                yy7[] yy7VarArr3 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.getRouter().B(callJoinLinkPreviewWidget2);
                                break;
                            default:
                                yy7[] yy7VarArr4 = CallJoinLinkPreviewWidget.A0;
                                he1 he1VarC0 = callJoinLinkPreviewWidget2.C0();
                                ae1 ae1Var = (ae1) he1VarC0.x0.getValue();
                                ci5 ci5Var = he1VarC0.A0;
                                String str = he1VarC0.b;
                                boolean z2 = he1VarC0.X;
                                ms8 ms8Var = ae1Var.c;
                                boolean z3 = false;
                                ms8 ms8Var2 = ms8.b;
                                if (ms8Var == ms8Var2) {
                                    z = false;
                                    z3 = true;
                                } else {
                                    z = false;
                                }
                                xfh.r(ci5Var, new pc1(str, z2, z3, ae1Var.b != ms8Var2 ? z : true, ae1Var.d));
                                break;
                        }
                    }
                });
                return oneMeButton;
            case 2:
                yy7[] yy7VarArr3 = CallJoinLinkPreviewWidget.A0;
                return r34.b(callJoinLinkPreviewWidget.getContext(), i0b.S);
            case 3:
                yy7[] yy7VarArr4 = CallJoinLinkPreviewWidget.A0;
                return r34.b(callJoinLinkPreviewWidget.getContext(), i0b.T);
            case 4:
                yy7[] yy7VarArr5 = CallJoinLinkPreviewWidget.A0;
                return callJoinLinkPreviewWidget.getRouter();
            case 5:
                yy7[] yy7VarArr6 = CallJoinLinkPreviewWidget.A0;
                return r34.b(callJoinLinkPreviewWidget.getContext(), i0b.s0);
            case 6:
                yy7[] yy7VarArr7 = CallJoinLinkPreviewWidget.A0;
                return r34.b(callJoinLinkPreviewWidget.getContext(), i0b.u0);
            case 7:
                yy7[] yy7VarArr8 = CallJoinLinkPreviewWidget.A0;
                TextView textView = new TextView(callJoinLinkPreviewWidget.getContext());
                textView.setId(j0b.f0);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setText(m0b.s0);
                dpg.f.b(textView, t75.b);
                textView.setTextColor(a93.s0.B(textView).c.getText().e);
                return textView;
            case 8:
                yy7[] yy7VarArr9 = CallJoinLinkPreviewWidget.A0;
                jtd jtdVar = new jtd(callJoinLinkPreviewWidget.getContext(), 0);
                jtdVar.setId(j0b.d0);
                jtdVar.setContentDescription(jtdVar.getContext().getString(m0b.H));
                jtdVar.z(i0b.E, a93.s0.B(jtdVar).c.getIcon().f);
                f8j.d(jtdVar, 300L, new View.OnClickListener() { // from class: je1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z;
                        int i4 = i3;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i4) {
                            case 0:
                                yy7[] yy7VarArr32 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.getRouter().B(callJoinLinkPreviewWidget2);
                                break;
                            default:
                                yy7[] yy7VarArr42 = CallJoinLinkPreviewWidget.A0;
                                he1 he1VarC0 = callJoinLinkPreviewWidget2.C0();
                                ae1 ae1Var = (ae1) he1VarC0.x0.getValue();
                                ci5 ci5Var = he1VarC0.A0;
                                String str = he1VarC0.b;
                                boolean z2 = he1VarC0.X;
                                ms8 ms8Var = ae1Var.c;
                                boolean z3 = false;
                                ms8 ms8Var2 = ms8.b;
                                if (ms8Var == ms8Var2) {
                                    z = false;
                                    z3 = true;
                                } else {
                                    z = false;
                                }
                                xfh.r(ci5Var, new pc1(str, z2, z3, ae1Var.b != ms8Var2 ? z : true, ae1Var.d));
                                break;
                        }
                    }
                });
                float f = 40;
                jtdVar.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                jtdVar.setButtonPadding(kti.d(3 * vw4.d().getDisplayMetrics().density));
                jtdVar.setMode(etdVar);
                return jtdVar;
            case 9:
                yy7[] yy7VarArr10 = CallJoinLinkPreviewWidget.A0;
                kdb kdbVar = new kdb(callJoinLinkPreviewWidget.getContext());
                kdbVar.setId(j0b.e0);
                kdbVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return kdbVar;
            case 10:
                yy7[] yy7VarArr11 = CallJoinLinkPreviewWidget.A0;
                jtd jtdVar2 = new jtd(callJoinLinkPreviewWidget.getContext(), 0);
                jtdVar2.setId(j0b.g0);
                jtdVar2.setAccessibility(Integer.valueOf(m0b.q0));
                v1a v1aVar = a93.s0;
                jtdVar2.setTextColor(v1aVar.B(jtdVar2).c.getText().e);
                jtdVar2.setListener(new gtd() { // from class: ke1
                    @Override // defpackage.gtd
                    public final void a() {
                        int i4 = i3;
                        ms8 ms8Var = ms8.b;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i4) {
                            case 0:
                                yy7[] yy7VarArr12 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.C0().u(!(((ae1) callJoinLinkPreviewWidget2.C0().x0.getValue()).b == ms8Var));
                                break;
                            default:
                                yy7[] yy7VarArr13 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.C0().v(!(((ae1) callJoinLinkPreviewWidget2.C0().x0.getValue()).c == ms8Var));
                                break;
                        }
                    }
                });
                jtdVar2.setMode(etdVar);
                jtdVar2.z(i0b.R, v1aVar.B(jtdVar2).c.getIcon().f);
                float f2 = 54;
                jtdVar2.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                jtdVar2.setButtonPadding(kti.d(5 * vw4.d().getDisplayMetrics().density));
                return jtdVar2;
            default:
                yy7[] yy7VarArr12 = CallJoinLinkPreviewWidget.A0;
                jtd jtdVar3 = new jtd(callJoinLinkPreviewWidget.getContext(), 0);
                jtdVar3.setId(j0b.j0);
                int i4 = i0b.r0;
                v1a v1aVar2 = a93.s0;
                jtdVar3.z(i4, v1aVar2.B(jtdVar3).c.getIcon().f);
                jtdVar3.setAccessibility(Integer.valueOf(m0b.t0));
                jtdVar3.setTextColor(v1aVar2.B(jtdVar3).c.getText().e);
                jtdVar3.setMode(etdVar);
                jtdVar3.setListener(new gtd() { // from class: ke1
                    @Override // defpackage.gtd
                    public final void a() {
                        int i42 = i2;
                        ms8 ms8Var = ms8.b;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i42) {
                            case 0:
                                yy7[] yy7VarArr122 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.C0().u(!(((ae1) callJoinLinkPreviewWidget2.C0().x0.getValue()).b == ms8Var));
                                break;
                            default:
                                yy7[] yy7VarArr13 = CallJoinLinkPreviewWidget.A0;
                                callJoinLinkPreviewWidget2.C0().v(!(((ae1) callJoinLinkPreviewWidget2.C0().x0.getValue()).c == ms8Var));
                                break;
                        }
                    }
                });
                float f3 = 54;
                jtdVar3.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                jtdVar3.setButtonPadding(kti.d(5 * vw4.d().getDisplayMetrics().density));
                return jtdVar3;
        }
    }
}
