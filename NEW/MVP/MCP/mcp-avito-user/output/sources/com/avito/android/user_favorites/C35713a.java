package com.avito.android.user_favorites;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: FavoriteSearchDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_favorites/a;", "LKu/a;", "Lcom/avito/android/user_favorites/FavoritesLink;", "<init>", "()V", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_favorites.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35713a extends AbstractC14350a<FavoritesLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        String queryParameter = uri.getQueryParameter("categoryId");
        return new FavoritesLink(queryParameter != null ? C43066x.y0(queryParameter) : null);
    }
}
