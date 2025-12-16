package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class cfd implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ cfd(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        final int i3 = 3;
        qqg qqgVar = qqg.a;
        Continuation continuation = null;
        int i4 = 17;
        final RecordControlsWidget recordControlsWidget = this.b;
        int i5 = 0;
        switch (i) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                View view = new View(frameLayout.getContext());
                view.setId(mab.h);
                float f = 8;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
                float f2 = 20;
                layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(vw4.d().getDisplayMetrics().density * f), 0);
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
                view.setBackground((GradientDrawable) recordControlsWidget.K0.getValue());
                tqi.c(new kga(recordControlsWidget, continuation, i4), view);
                frameLayout.addView(view);
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setId(mab.r);
                float f3 = 36;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 8388627;
                layoutParams2.leftMargin = kti.d(6 * vw4.d().getDisplayMetrics().density);
                imageView.setLayoutParams(layoutParams2);
                float f4 = 4;
                u45.n(f4, vw4.d().getDisplayMetrics().density, imageView);
                imageView.setImageResource(yud.y);
                imageView.setVisibility(8);
                frameLayout.addView(imageView);
                TextView textView = new TextView(frameLayout.getContext());
                textView.setId(mab.i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388627;
                layoutParams3.setMarginStart(kti.d(f * vw4.d().getDisplayMetrics().density) + u45.c(f2, vw4.d().getDisplayMetrics().density, u45.c(f, vw4.d().getDisplayMetrics().density, kti.d(f4 * vw4.d().getDisplayMetrics().density))));
                textView.setLayoutParams(layoutParams3);
                dpg.h.b(textView, t75.b);
                tqi.c(new x9(3, null, 29), textView);
                frameLayout.addView(textView);
                TextView textView2 = new TextView(frameLayout.getContext());
                textView2.setId(mab.g);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams4.gravity = 17;
                textView2.setLayoutParams(layoutParams4);
                textView2.setGravity(17);
                textView2.setText(z7.e(recordControlsWidget.getContext(), mvd.p));
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) recordControlsWidget.H0.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
                dpg.l.b(textView2, t75.b);
                tqi.c(new kga(recordControlsWidget, continuation, 16), textView2);
                frameLayout.addView(textView2);
                break;
            case 1:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                ffd ffdVar = recordControlsWidget.E0;
                if (recordControlsWidget.R0() == tdd.b) {
                    rkh rkhVar = new rkh(frameLayout2.getContext());
                    rkhVar.setCallback(new hfd(0, recordControlsWidget));
                    rkhVar.setDotDrawable((GradientDrawable) recordControlsWidget.K0.getValue());
                    recordControlsWidget.D0 = rkhVar;
                    frameLayout2.addView(rkhVar);
                }
                ImageView imageView2 = new ImageView(frameLayout2.getContext());
                imageView2.setId(mab.q);
                float f5 = 36;
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(vw4.d().getDisplayMetrics().density * f5));
                layoutParams5.gravity = 8388691;
                float f6 = 6;
                layoutParams5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f6), 0, kti.d(vw4.d().getDisplayMetrics().density * f6), kti.d(vw4.d().getDisplayMetrics().density * f6));
                imageView2.setLayoutParams(layoutParams5);
                float f7 = 4;
                u45.n(f7, vw4.d().getDisplayMetrics().density, imageView2);
                imageView2.setImageResource(yud.y);
                tqi.c(new nd0(i3, continuation, 12), imageView2);
                final int i6 = 1;
                f8j.d(imageView2, 300L, new View.OnClickListener() { // from class: dfd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i6;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i7) {
                            case 0:
                                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().K();
                                break;
                            case 1:
                                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().F();
                                break;
                            case 2:
                                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().J();
                                break;
                            default:
                                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                                zed zedVarS0 = recordControlsWidget2.S0();
                                yy7[] yy7VarArr6 = zed.I0;
                                zedVarS0.L(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView2);
                ImageView imageView3 = new ImageView(frameLayout2.getContext());
                imageView3.setId(mab.m);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(vw4.d().getDisplayMetrics().density * f5));
                layoutParams6.gravity = 81;
                layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, kti.d(vw4.d().getDisplayMetrics().density * f6));
                imageView3.setLayoutParams(layoutParams6);
                u45.n(f7, vw4.d().getDisplayMetrics().density, imageView3);
                imageView3.setImageResource(ffdVar.b);
                tqi.c(new nd0(i3, continuation, 10), imageView3);
                final int i7 = 2;
                f8j.d(imageView3, 300L, new View.OnClickListener() { // from class: dfd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i72 = i7;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i72) {
                            case 0:
                                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().K();
                                break;
                            case 1:
                                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().F();
                                break;
                            case 2:
                                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().J();
                                break;
                            default:
                                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                                zed zedVarS0 = recordControlsWidget2.S0();
                                yy7[] yy7VarArr6 = zed.I0;
                                zedVarS0.L(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView3);
                ImageView imageView4 = new ImageView(frameLayout2.getContext());
                imageView4.setId(mab.o);
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density));
                layoutParams7.gravity = 81;
                float f8 = 0;
                layoutParams7.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density), kti.d(f6 * vw4.d().getDisplayMetrics().density));
                imageView4.setLayoutParams(layoutParams7);
                u45.n(f7, vw4.d().getDisplayMetrics().density, imageView4);
                imageView4.setImageResource(ffdVar.c);
                tqi.c(new nd0(i3, continuation, 11), imageView4);
                imageView4.setVisibility(8);
                final int i8 = 0;
                f8j.d(imageView4, 300L, new View.OnClickListener() { // from class: dfd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i72 = i8;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i72) {
                            case 0:
                                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().K();
                                break;
                            case 1:
                                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().F();
                                break;
                            case 2:
                                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().J();
                                break;
                            default:
                                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                                zed zedVarS0 = recordControlsWidget2.S0();
                                yy7[] yy7VarArr6 = zed.I0;
                                zedVarS0.L(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView4);
                break;
            case 2:
                FrameLayout frameLayout3 = (FrameLayout) obj;
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                cfd cfdVar = new cfd(recordControlsWidget, i3);
                View frameLayout4 = new FrameLayout(frameLayout3.getContext());
                frameLayout4.setId(mab.c);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams8.gravity = 17;
                frameLayout4.setLayoutParams(layoutParams8);
                cfdVar.invoke(frameLayout4);
                frameLayout3.addView(frameLayout4);
                ImageView imageView5 = new ImageView(frameLayout3.getContext());
                imageView5.setId(mab.a);
                float f9 = 36;
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f9), kti.d(f9 * vw4.d().getDisplayMetrics().density));
                layoutParams9.gravity = 17;
                imageView5.setLayoutParams(layoutParams9);
                u45.n(4, vw4.d().getDisplayMetrics().density, imageView5);
                imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView5.setImageDrawable(recordControlsWidget.L0());
                f8j.d(imageView5, 300L, new View.OnClickListener() { // from class: dfd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i72 = i3;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i72) {
                            case 0:
                                yy7[] yy7VarArr22 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().K();
                                break;
                            case 1:
                                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().F();
                                break;
                            case 2:
                                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                                recordControlsWidget2.S0().J();
                                break;
                            default:
                                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                                zed zedVarS0 = recordControlsWidget2.S0();
                                yy7[] yy7VarArr6 = zed.I0;
                                zedVarS0.L(true);
                                break;
                        }
                    }
                });
                tqi.c(new kga(recordControlsWidget, continuation, 15), imageView5);
                frameLayout3.addView(imageView5);
                break;
            default:
                FrameLayout frameLayout5 = (FrameLayout) obj;
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                View frameLayout6 = new FrameLayout(frameLayout5.getContext());
                frameLayout6.setId(mab.b);
                float f10 = 124;
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f10), kti.d(vw4.d().getDisplayMetrics().density * f10));
                layoutParams10.gravity = 17;
                frameLayout6.setLayoutParams(layoutParams10);
                frameLayout6.setBackground((GradientDrawable) recordControlsWidget.I0.getValue());
                tqi.c(new gfd(recordControlsWidget, continuation, i2), frameLayout6);
                frameLayout5.addView(frameLayout6);
                View frameLayout7 = new FrameLayout(frameLayout5.getContext());
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f10), kti.d(f10 * vw4.d().getDisplayMetrics().density));
                layoutParams11.gravity = 17;
                frameLayout7.setLayoutParams(layoutParams11);
                frameLayout7.setBackground((GradientDrawable) recordControlsWidget.J0.getValue());
                tqi.c(new gfd(recordControlsWidget, continuation, i5), frameLayout7);
                frameLayout5.addView(frameLayout7);
                break;
        }
        return qqgVar;
    }
}
