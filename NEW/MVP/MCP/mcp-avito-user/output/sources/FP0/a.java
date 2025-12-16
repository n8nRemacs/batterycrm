package FP0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.CalledFrom;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: WebViewAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFP0/a;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {
    void a(@k Uri uri);

    void b(@k HP0.b bVar);

    @k
    Bundle c();

    void d(@l CalledFrom calledFrom, @l DeepLink deepLink);

    void e(@k Uri uri);

    void f(@l Bundle bundle);

    void g(@k ParametrizedClickStreamEvent parametrizedClickStreamEvent);
}
