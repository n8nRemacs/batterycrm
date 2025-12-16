package Hi0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.recommendation_items_loader_impl.deep_linking.RecommendationBlocksLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: RecommendationBlocksDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LHi0/a;", "LKu/a;", "Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationBlocksLink;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13995a extends AbstractC14350a<RecommendationBlocksLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new RecommendationBlocksLink(i.p(uri, "payload"), uri.getQueryParameter("additional"));
    }
}
