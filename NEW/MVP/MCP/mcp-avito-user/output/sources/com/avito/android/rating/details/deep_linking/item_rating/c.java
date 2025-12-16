package com.avito.android.rating.details.deep_linking.item_rating;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.ItemRatingsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ItemRatingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/deep_linking/item_rating/c;", "Lev/a;", "Lcom/avito/android/deep_linking/ItemRatingsLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends AbstractC40161a<ItemRatingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f246955f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f246956g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f246957h;

    @Inject
    public c(@k f fVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f246955f = fVar;
        this.f246956g = interfaceC4053a;
        this.f246957h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ItemRatingsLink itemRatingsLink = (ItemRatingsLink) deepLink;
        this.f246957h.b(itemRatingsLink, this, null, new b(bundle, this, itemRatingsLink));
    }
}
