package com.avito.android.saved_searches.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionControlLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/h;", "LKu/a;", "Lcom/avito/android/saved_searches/deeplinks/SearchSubscriptionControlLink;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends AbstractC14350a<SearchSubscriptionControlLink> {
    @Inject
    public h() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SearchSubscriptionControlLink();
    }
}
