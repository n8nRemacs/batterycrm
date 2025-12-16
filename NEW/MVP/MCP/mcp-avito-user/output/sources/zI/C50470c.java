package zI;

import com.avito.android.serp.analytics.widgets_tracker.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTabsItemModule_ProvideSectionTabsItemPresenterFactory.java */
@e
@y
@x
/* renamed from: zI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50470c implements h<com.avito.android.home.tabs_item.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C50468a f444008a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f444009b;

    public C50470c(C50468a c50468a, Provider<g> provider) {
        this.f444008a = c50468a;
        this.f444009b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f444009b.get();
        this.f444008a.getClass();
        return new com.avito.android.home.tabs_item.e(gVar);
    }
}
