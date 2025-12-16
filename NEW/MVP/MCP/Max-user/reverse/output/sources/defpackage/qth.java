package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class qth implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ qth(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                WebAppRootScreen webAppRootScreen = this.b;
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                h6j.a(1).B((View) obj).o(Collections.singletonList(new b44(1, new n5g(z4d.web_app_root_dots_menu_refresh), Integer.valueOf(ivd.C0), (Integer) null, 20))).build().u(webAppRootScreen);
                break;
            case 1:
                WebAppRootScreen webAppRootScreen2 = this.b;
                yy7[] yy7VarArr2 = WebAppRootScreen.R0;
                ra3 ra3Var = webAppRootScreen2.N0().J0;
                svi.e((f84) ra3Var.a, null, null, new xv7(ra3Var, null), 3);
                break;
            case 2:
                WebAppRootScreen webAppRootScreen3 = this.b;
                yy7[] yy7VarArr3 = WebAppRootScreen.R0;
                uvh uvhVarN0 = webAppRootScreen3.N0();
                uvhVarN0.getClass();
                xfh.o(uvhVarN0, null, new gvh(uvhVarN0, null), 3);
                break;
            default:
                WebAppRootScreen webAppRootScreen4 = this.b;
                LinearLayout linearLayout = (LinearLayout) obj;
                yy7[] yy7VarArr4 = WebAppRootScreen.R0;
                yfb yfbVar = new yfb(linearLayout.getContext(), 6);
                yfbVar.setId(hgb.l);
                yfbVar.setForm(qfb.a);
                Object[] objArr = 0;
                yfbVar.setRightActions(new nfb(new qth(webAppRootScreen4, 0)));
                linearLayout.addView(yfbVar);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(hgb.d);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Context context = frameLayout.getContext();
                t3e t3eVar = new t3e(context, 8);
                t3eVar.setId(hgb.m);
                t3eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                t3eVar.getSettings().setJavaScriptEnabled(true);
                t3eVar.getSettings().setDomStorageEnabled(true);
                t3eVar.getSettings().setSupportMultipleWindows(true);
                t3eVar.getSettings().setAllowFileAccess(false);
                ((eza) webAppRootScreen4.K0.getValue()).getClass();
                WebView.setWebContentsDebuggingEnabled(false);
                String str = webAppRootScreen4.C0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, xc0.f("initWebView: ", ((gu5) ((rt5) webAppRootScreen4.I0.getValue())).z()), null);
                    }
                }
                if (((gu5) ((rt5) webAppRootScreen4.I0.getValue())).z()) {
                    Bundle bundle = webAppRootScreen4.P0;
                    if (bundle != null) {
                        t3eVar.restoreState(bundle);
                    }
                } else {
                    webAppRootScreen4.setRetainViewMode(b54.b);
                }
                t3eVar.setWebViewClient(new cgb(new vhb(webAppRootScreen4.N0(), new qc4(context), objArr == true ? 1 : 0, 19)));
                t3eVar.setWebChromeClient(new dgb(webAppRootScreen4.N0()));
                t3eVar.addJavascriptInterface(new y0i(webAppRootScreen4.N0()), "WebViewHandler");
                m9b m9bVar = new m9b(frameLayout.getContext());
                m9bVar.setId(hgb.g);
                m9bVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                m9bVar.setAppearance(b9b.a);
                Context context2 = frameLayout.getContext();
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setId(hgb.e);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                float f = 20;
                layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setOrientation(1);
                Drawable drawableMutate = r34.b(linearLayout2.getContext(), yud.x0).mutate();
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawableMutate);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                imageView.setLayoutParams(layoutParams2);
                TextView textView = new TextView(context2);
                textView.setText(mvd.r2);
                textView.setSingleLine();
                dpg.d.b(textView, t75.b);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 1;
                layoutParams3.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams3);
                TextView textView2 = new TextView(context2);
                textView2.setText(mvd.q2);
                textView2.setSingleLine();
                dpg.j.b(textView2, t75.b);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = kti.d(2 * vw4.d().getDisplayMetrics().density);
                layoutParams4.bottomMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
                layoutParams4.gravity = 1;
                textView2.setLayoutParams(layoutParams4);
                OneMeButton oneMeButton = new OneMeButton(context2, null);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 1;
                oneMeButton.setLayoutParams(layoutParams5);
                oneMeButton.setText(mvd.p2);
                oneMeButton.setMode(iza.b);
                oneMeButton.setAppearance(gza.d);
                f8j.d(oneMeButton, 300L, new sth(webAppRootScreen4, 0));
                tqi.c(new uh1(textView, textView2, drawableMutate, null, 6), linearLayout2);
                linearLayout2.addView(imageView);
                linearLayout2.addView(textView);
                linearLayout2.addView(textView2);
                linearLayout2.addView(oneMeButton);
                frameLayout.addView(t3eVar);
                gw0.w(new g56(aw0.a(new d53(webAppRootScreen4.N0().Y0, 12), webAppRootScreen4.getViewLifecycleOwner().p(), l38.d), new tth(null, webAppRootScreen4, t3eVar, frameLayout, linearLayout2, m9bVar), 1), webAppRootScreen4.getViewLifecycleScope());
                linearLayout.addView(frameLayout);
                break;
        }
        return qqg.a;
    }
}
