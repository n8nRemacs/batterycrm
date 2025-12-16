package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class tq5 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ FaqWebViewWidget Y;
    public Uri.Builder o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = faqWebViewWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tq5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tq5(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Uri.Builder builderBuildUpon;
        int i = this.X;
        FaqWebViewWidget faqWebViewWidget = this.Y;
        if (i == 0) {
            g8j.b(obj);
            builderBuildUpon = Uri.parse(z7.e(faqWebViewWidget.getContext(), mvd.P0)).buildUpon();
            cs4 cs4Var = faqWebViewWidget.Y;
            this.o = builderBuildUpon;
            this.X = 1;
            obj = cs4Var.awaitInternal(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builderBuildUpon = this.o;
            g8j.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            builderBuildUpon.appendQueryParameter("source", "settings");
        } else {
            builderBuildUpon.appendQueryParameter("source", "reg");
        }
        ((fgb) faqWebViewWidget.a.D(faqWebViewWidget, FaqWebViewWidget.s0[0])).loadUrl(builderBuildUpon.build().toString());
        return qqg.a;
    }
}
