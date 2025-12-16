package Yu;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.AppVersionDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DeeplinkContainerParser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYu/a;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AppVersionDeepLink;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18327a extends AbstractC14350a<AppVersionDeepLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f19721a;

    public C18327a(@Y61.k String str) {
        this.f19721a = str;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        double dJ2 = Ku.i.j(uri, "android");
        Double dW02 = C43066x.w0(this.f19721a);
        if (dW02 != null) {
            double dDoubleValue = dW02.doubleValue();
            return new AppVersionDeepLink(i.a(dDoubleValue == dJ2 ? "equal" : dDoubleValue > dJ2 ? "greater" : "less", uri, gson, xVar), uri);
        }
        Ku.i.g(this, uri, "Incorrect appVersion");
        throw null;
    }
}
