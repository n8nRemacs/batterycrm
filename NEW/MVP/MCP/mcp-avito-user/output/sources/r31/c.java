package r31;

import Y41.q;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.auth.view.activity.WebViewActivity;

/* loaded from: classes8.dex */
public final class c extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f429570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WebViewActivity webViewActivity) {
        super(3);
        this.f429570l = webViewActivity;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final WebView webView = (WebView) obj;
        String str = (String) obj2;
        final boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int i12 = WebViewActivity.f437756g;
        final WebViewActivity webViewActivity = this.f429570l;
        ViewGroup viewGroup = webViewActivity.f437758c;
        if (viewGroup == null) {
            viewGroup = null;
        }
        TransitionManager.beginDelayedTransition(viewGroup);
        ProgressBar progressBar = webViewActivity.f437759d;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(8);
        Toolbar toolbar = webViewActivity.f437757b;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setSubtitle(str);
        Toolbar toolbar2 = webViewActivity.f437757b;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationIcon(zBooleanValue ? R.drawable.ic_baseline_arrow_24dp : R.drawable.ic_baseline_close_24dp);
        Toolbar toolbar3 = webViewActivity.f437757b;
        (toolbar3 != null ? toolbar3 : null).setNavigationOnClickListener(new View.OnClickListener() { // from class: Vb1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = WebViewActivity.f437756g;
                boolean z12 = zBooleanValue;
                WebViewActivity webViewActivity2 = webViewActivity;
                if (!z12) {
                    webViewActivity2.finish();
                    return;
                }
                WebView webView2 = webView;
                if (webView2 != null) {
                    if (webView2.canGoBack()) {
                        webView2.goBack();
                    } else {
                        webViewActivity2.finish();
                    }
                }
            }
        });
        return G0.f406611a;
    }
}
