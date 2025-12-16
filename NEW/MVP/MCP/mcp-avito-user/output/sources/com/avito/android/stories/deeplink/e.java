package com.avito.android.stories.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.stories.StoriesLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: StoriesLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/stories/deeplink/e;", "LKu/a;", "Lcom/avito/android/stories/StoriesLink;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<StoriesLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new StoriesLink(i.n(uri, ContextActionHandler.Link.URL), uri.getQueryParameter("selectedPage"), uri.getQueryParameter("categoryId"), uri.getQueryParameter("crossCategoryTag"), Boolean.parseBoolean(uri.getQueryParameter("needOpenIndependently")));
    }
}
