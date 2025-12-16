package Z51;

import android.webkit.WebView;
import androidx.compose.runtime.I3;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a f19899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I3 f19900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.a aVar, I3 i32) {
        super(0);
        this.f19899l = aVar;
        this.f19900m = i32;
    }

    @Override // Y41.a
    public final Object invoke() {
        WebView webView = (WebView) this.f19900m.getValue();
        Y41.a aVar = this.f19899l;
        if (webView == null || !webView.canGoBack()) {
            aVar.invoke();
        } else {
            webView.goBack();
        }
        return G0.f406611a;
    }
}
