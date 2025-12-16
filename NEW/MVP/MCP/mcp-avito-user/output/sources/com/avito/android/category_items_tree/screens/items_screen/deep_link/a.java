package com.avito.android.category_items_tree.screens.items_screen.deep_link;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_items_tree.CategoryItemsDeepLink;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsActivity;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryItemsDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/deep_link/a;", "Lev/b;", "Lcom/avito/android/category_items_tree/CategoryItemsDeepLink;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40162b<CategoryItemsDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f116924d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f116925e;

    @Inject
    public a(@k g gVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f116924d = gVar;
        this.f116925e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CategoryItemsDeepLink categoryItemsDeepLink = (CategoryItemsDeepLink) deepLink;
        g gVar = this.f116924d;
        gVar.getClass();
        Intent intent = new Intent(gVar.f116932a, (Class<?>) CategoryItemsActivity.class);
        intent.putExtra("categoryItemsArguments", new CategoryItemsArguments(categoryItemsDeepLink.f116775b, categoryItemsDeepLink.f116776c, categoryItemsDeepLink.f116777d, categoryItemsDeepLink.f116778e, categoryItemsDeepLink.f116779f));
        this.f116925e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
