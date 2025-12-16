package com.avito.android.avito_blog.article_screen.ui;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.avito_blog.article_screen.ui.AvitoBlogArticleActivity;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoBlogArticleIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/ui/c;", "Lcom/avito/android/avito_blog/article_screen/ui/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f97957a;

    @Inject
    public c(@k Application application) {
        this.f97957a = application;
    }

    @Override // com.avito.android.avito_blog.article_screen.ui.b
    @k
    public final Intent a(@k AvitoBlogArticle avitoBlogArticle) {
        AvitoBlogArticleActivity.a.f97955a.getClass();
        return new Intent(this.f97957a, (Class<?>) AvitoBlogArticleActivity.class).putExtra("articles", avitoBlogArticle);
    }
}
