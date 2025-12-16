package LX;

import LX.b;
import Y61.k;
import android.webkit.JavascriptInterface;
import com.adjust.sdk.Constants;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;

/* compiled from: MallJSInterface.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LLX/c;", "LLX/a;", "", Constants.DEEPLINK, "Lkotlin/G0;", "navigateWithDeeplink", "(Ljava/lang/String;)V", "payload", "onEventSubmit", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g<b> f9973a;

    @Inject
    public c(@k g<b> gVar) {
        this.f9973a = gVar;
    }

    @Override // LX.a
    @JavascriptInterface
    public void navigateWithDeeplink(@k String deeplink) {
        this.f9973a.accept(new b.C0616b(deeplink));
    }

    @Override // LX.a
    @JavascriptInterface
    public void onEventSubmit(@k String payload) {
        this.f9973a.accept(new b.a(payload));
    }
}
