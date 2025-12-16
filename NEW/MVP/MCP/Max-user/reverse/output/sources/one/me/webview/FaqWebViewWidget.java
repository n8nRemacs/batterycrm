package one.me.webview;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import defpackage.bbd;
import defpackage.c7j;
import defpackage.cb6;
import defpackage.cs4;
import defpackage.d92;
import defpackage.eo7;
import defpackage.eza;
import defpackage.fgb;
import defpackage.gfb;
import defpackage.jgb;
import defpackage.k18;
import defpackage.lgb;
import defpackage.lzf;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qt7;
import defpackage.rq5;
import defpackage.sq5;
import defpackage.svi;
import defpackage.t0i;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tq5;
import defpackage.u45;
import defpackage.v17;
import defpackage.ve3;
import defpackage.vid;
import defpackage.wqi;
import defpackage.yfb;
import defpackage.yy7;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "v17", "webview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FaqWebViewWidget extends Widget {
    public final k18 X;
    public final cs4 Y;
    public final bbd a;
    public final eo7 b;
    public final t9f c;
    public final k18 d;
    public final cb6 o;
    public static final /* synthetic */ yy7[] s0 = {new toc(FaqWebViewWidget.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), u45.h(vid.a, FaqWebViewWidget.class, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;")};
    public static final v17 Z = new v17(20, 0);
    public static final List t0 = ve3.j("text/html", HTTP.PLAIN_TEXT_TYPE, "text/xml", "application/xhtml+xml", "application/xml");

    /* JADX WARN: Multi-variable type inference failed */
    public FaqWebViewWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = viewBinding(jgb.a);
        this.b = eo7.f;
        this.c = c7j.c();
        t0i t0iVar = t0i.a;
        this.d = t0iVar.getAccessor().d(124);
        this.o = new cb6(t0iVar.getAccessor().d(35), t0iVar.getAccessor().d(31), t0iVar.getAccessor().d(123), t0iVar.getAccessor().d(46), t0iVar.getAccessor().d(47), t0iVar.getAccessor().d(12));
        this.X = t0iVar.getAccessor().d(81);
        this.Y = svi.b(getLifecycleScope(), ((q2b) ((lzf) t0iVar.getAccessor().c(8))).a(), new rq5(2, null), 2);
    }

    public static final void y0(FaqWebViewWidget faqWebViewWidget, Uri uri) {
        try {
            faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            wqi.e(FaqWebViewWidget.class.getName(), "error handleUrl - " + uri + ": " + e.getMessage(), e);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setTitle(lgb.b);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new d92(22, this)));
        linearLayout.addView(yfbVar);
        fgb fgbVar = new fgb(linearLayout.getContext(), 14);
        fgbVar.setId(jgb.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        fgbVar.setLayoutParams(layoutParams);
        fgbVar.getSettings().setJavaScriptEnabled(true);
        fgbVar.getSettings().setDomStorageEnabled(true);
        ((eza) this.X.getValue()).getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        fgbVar.setWebViewClient(new sq5(this));
        linearLayout.addView(fgbVar);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        yy7[] yy7VarArr = s0;
        yy7 yy7Var = yy7VarArr[1];
        t9f t9fVar = this.c;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[1], null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        svi.e(getViewLifecycleScope(), null, null, new tq5(this, null), 3);
    }
}
