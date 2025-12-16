package tL0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: PerformanceVasDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LtL0/c;", "LKu/a;", "Lcom/avito/android/vas_performance/deeplink/PerformanceVasLink;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tL0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48572c extends AbstractC14350a<PerformanceVasLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new PerformanceVasLink(i.p(uri, "itemId"), i.p(uri, "checkoutContext"), Boolean.parseBoolean(uri.getQueryParameter("closable")), i.p(uri, "currentFlow"), Boolean.parseBoolean(uri.getQueryParameter("openAdvertDetailsOnClose")));
    }
}
