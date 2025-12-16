package r31;

import Y41.l;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.Toast;
import com.avito.android.R;
import com.vk.id.captcha.web.h;
import d31.AbstractC39497c;
import d31.AbstractC39501g;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class e extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebView f429572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView) {
        super(1);
        this.f429572l = webView;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        WebView webView = this.f429572l;
        boolean zC2 = AbstractC39501g.c(webView.getContext(), uri, null);
        AbstractC39497c.a();
        if (!zC2) {
            if (C43066x.q(uri.toString(), ".pdf", false)) {
                webView.post(new h(22, webView, uri));
            } else {
                Toast.makeText(webView.getContext(), webView.getContext().getText(R.string.browser_not_found_toast), 0).show();
            }
        }
        return G0.f406611a;
    }
}
