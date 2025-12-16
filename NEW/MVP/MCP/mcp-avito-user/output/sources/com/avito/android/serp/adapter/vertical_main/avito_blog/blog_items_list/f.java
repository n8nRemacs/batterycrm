package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.remote.model.vertical_main.ArticleType;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBlogArticleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/e;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f272613b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f272614c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f272615d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f272616e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f272617f;

    /* compiled from: AvitoBlogArticleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/f$a;", "", "<init>", "()V", "", "IMAGE_RATIO", "D", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public f(@k View view) {
        super(view);
        this.f272613b = view;
        View viewFindViewById = view.findViewById(R.id.avito_blog_article_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272614c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avito_blog_article_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f272615d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon_video_play);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f272616e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tag_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272617f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.e
    public final void ow(@k AvitoBlogArticleItem avitoBlogArticleItem, int i12, @k C c12) {
        View view = this.f272613b;
        view.getLayoutParams().width = i12;
        this.f272615d.getLayoutParams().height = (int) (i12 / 1.58d);
        C35949t5.c(this.f272615d, com.avito.android.image_loader.b.b(avitoBlogArticleItem.getF272593c()), null, null, null, 14);
        this.f272614c.setText(avitoBlogArticleItem.getF272594d());
        D6.G(this.f272616e, avitoBlogArticleItem.getF272596f() == ArticleType.VIDEO);
        I5.a(this.f272617f, avitoBlogArticleItem.getF272595e().getTag(), false);
        view.setOnClickListener(c12);
    }
}
