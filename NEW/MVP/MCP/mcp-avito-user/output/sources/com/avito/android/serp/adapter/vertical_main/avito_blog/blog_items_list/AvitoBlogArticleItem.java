package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.vertical_main.ArticleType;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;

/* compiled from: AvitoBlogArticleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AvitoBlogArticleItem extends ParcelableItem {

    /* compiled from: AvitoBlogArticleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    AvitoBlogArticle I5();

    int f0();

    @l
    Analytics getAnalytics();

    @k
    Image getPreviewImageUrls();

    @k
    String getTitle();

    @l
    ArticleType getType();
}
