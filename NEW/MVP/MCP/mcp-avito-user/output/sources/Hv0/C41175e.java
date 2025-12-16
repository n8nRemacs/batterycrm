package hv0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.services_portfolio.deeplink.ServicesPortfolioProjectBuyerLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServicesPortfolioProjectBuyerLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhv0/e;", "LKu/a;", "Lcom/avito/android/services_portfolio/deeplink/ServicesPortfolioProjectBuyerLink;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hv0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41175e extends AbstractC14350a<ServicesPortfolioProjectBuyerLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new ServicesPortfolioProjectBuyerLink(i.m(uri, "projectId"), String.valueOf(uri.getQueryParameter("itemId")), String.valueOf(uri.getQueryParameter("x")), String.valueOf(uri.getQueryParameter("cid")), String.valueOf(uri.getQueryParameter("mcid")), Boolean.parseBoolean(i.p(uri, "canCall")), Boolean.parseBoolean(i.p(uri, "canMessage")));
    }
}
