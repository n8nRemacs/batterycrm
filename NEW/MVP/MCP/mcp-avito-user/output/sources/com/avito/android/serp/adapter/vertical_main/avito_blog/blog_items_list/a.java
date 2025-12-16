package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBlogArticleBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/e;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, AvitoBlogArticleItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f272599a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f272600b = new g.a<>(R.layout.avito_blog_article, C8092a.f272601l);

    /* compiled from: AvitoBlogArticleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.a$a, reason: collision with other inner class name */
    public static final class C8092a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8092a f272601l = new C8092a();

        public C8092a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f272599a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272599a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f272600b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AvitoBlogArticleItem;
    }
}
