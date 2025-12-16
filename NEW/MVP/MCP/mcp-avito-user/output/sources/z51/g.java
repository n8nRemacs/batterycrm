package Z51;

import Y41.l;
import android.webkit.WebView;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class g extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f19909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f19910m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC22204y1 interfaceC22204y1, String str) {
        super(1);
        this.f19909l = str;
        this.f19910m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        WebView webView = (WebView) obj;
        webView.loadUrl(this.f19909l);
        this.f19910m.setValue(Boolean.valueOf(webView.canGoBack()));
        return G0.f406611a;
    }
}
