package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.position_in_search.stats.deeplink.SearchPositionDetailsDeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SearchPositionDetailsDeepLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/c;", "LKu/a;", "Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC14350a<SearchPositionDetailsDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SearchPositionDetailsDeepLink(Ku.i.m(uri, "itemId"), Ku.i.n(uri, "period"));
    }
}
