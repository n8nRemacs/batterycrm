package com.avito.android.help_center.di;

import com.avito.android.deep_linking.links.HelpCenterArticleShowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: HelpCenterDeeplinkHandlerModule_ProvideHelpCenterArticlesDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.help_center.help_center_articles.d f161670a;

    public e(com.avito.android.help_center.help_center_articles.d dVar) {
        this.f161670a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f161669a.getClass();
        return new C43834a(HelpCenterArticleShowLink.class, null, new C43834a.b.C11809b(this.f161670a));
    }
}
