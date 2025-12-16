package com.avito.android.category_items_tree.screens.items_screen.deep_link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_items_tree.CategoryItemsDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryItemsDeepLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/deep_link/e;", "LKu/a;", "Lcom/avito/android/category_items_tree/CategoryItemsDeepLink;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC14350a<CategoryItemsDeepLink> {
    @Inject
    public e() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new CategoryItemsDeepLink(i.p(uri, "promoType"), uri.getQueryParameter("promoTypeId"), i.p(uri, "title"), i.p(uri, "categoryId"), i.p(uri, "fromPage"));
    }
}
