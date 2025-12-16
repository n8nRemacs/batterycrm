package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: AvitoBlogArticlePresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/c;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/e;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<e, AvitoBlogArticleItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272603b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f272604c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272605d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C36135w2 f272606e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.avito_blog.a f272607f;

    @Inject
    public c(@k h31.e<InterfaceC47690b> eVar, @k g gVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar2, @k C36135w2 c36135w2, @k com.avito.android.serp.adapter.vertical_main.avito_blog.a aVar) {
        this.f272603b = eVar;
        this.f272604c = gVar;
        this.f272605d = gVar2;
        this.f272606e = c36135w2;
        this.f272607f = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        AvitoBlogArticleItem avitoBlogArticleItem = (AvitoBlogArticleItem) aVar;
        g gVar = this.f272604c;
        int iC2 = gVar.f272618a.c();
        if (iC2 <= 0) {
            gVar.f272619b.c(new NonFatalErrorEvent("Avito Blog. Screen width is not positive value", null, null, null, 14, null));
        } else {
            iC2 = (int) (gVar.f272620c * iC2);
        }
        eVar2.ow(avitoBlogArticleItem, iC2, new C(this, avitoBlogArticleItem, i12, 13));
    }
}
