package com.avito.android.serp.adapter.vertical_main.avito_blog;

import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.J0;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.remote.model.vertical_main.AvitoBlogWidget;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItemImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBlogItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/g;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f272636a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f272637b;

    public g(@Y61.k J0 j02, @Y61.k C36135w2 c36135w2) {
        this.f272636a = j02;
        this.f272637b = c36135w2;
    }

    @Y61.l
    public final AvitoBlogItem a(@Y61.k AvitoBlogWidget avitoBlogWidget, int i12) {
        C36135w2 c36135w2 = this.f272637b;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[22];
        List<AvitoBlogArticle> mediaItems = ((Boolean) c36135w2.f327498s.a().invoke()).booleanValue() ? avitoBlogWidget.getMediaItems() : avitoBlogWidget.getArticles();
        if (mediaItems == null || mediaItems.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("vertical_avito_blog");
        J0 j02 = this.f272636a;
        String strK = com.avito.android.bxcontent.mvi.entity.f.k(j02, sb2);
        String title = avitoBlogWidget.getTitle();
        List<AvitoBlogArticle> list = mediaItems;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (AvitoBlogArticle avitoBlogArticle : list) {
            arrayList.add(new AvitoBlogArticleItemImpl(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("avitoBlogWidgetArticle")), avitoBlogArticle.getPreviewImageUrls(), avitoBlogArticle.getTitle(), avitoBlogArticle, avitoBlogArticle.getType(), i12, avitoBlogWidget.getAnalytics()));
        }
        return new AvitoBlogItem(strK, title, arrayList, avitoBlogWidget.getAnalytics(), avitoBlogWidget.getSettings());
    }
}
