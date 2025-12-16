package com.avito.android.travel_search.ui;

import android.os.Bundle;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchItemsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/ui/j;", "Lcom/avito/android/travel_search/ui/i;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49206a, G0> f303242b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super InterfaceC49206a, G0> lVar) {
        this.f303242b = lVar;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f303242b.invoke(new InterfaceC49206a.C12753a(s5, abstractC30567a));
    }

    @Override // rn0.InterfaceC47691c
    public final void d(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle, @Y61.l Boolean bool, @Y61.l String str) {
        this.f303242b.invoke(new InterfaceC49206a.b(deepLink, bundle, bool, str));
    }

    @Override // rn0.InterfaceC47691c
    public final void B(@Y61.k DeepLink deepLink) {
    }

    @Override // rn0.InterfaceC47692d
    public final void f(@Y61.k AvitoBlogArticleItem avitoBlogArticleItem) {
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // rn0.InterfaceC47691c
    public final void n(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.async_phone.InterfaceC28615a
    public final void G(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k ContactSource contactSource) {
    }

    @Override // com.avito.android.serp.adapter.constructor.q
    public final void i(@Y61.k DeepLink deepLink, @Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
    }

    @Override // rn0.InterfaceC47691c
    public final void q(@Y61.k DeepLink deepLink, @Y61.l Boolean bool) {
    }

    @Override // com.avito.android.serp.adapter.constructor.q
    public final void y(@Y61.k DeepLink deepLink, @Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.a
    public final void Sa(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource) {
    }

    @Override // rn0.e
    public final void W(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l ScreenIdField screenIdField, @Y61.l String str2) {
    }
}
