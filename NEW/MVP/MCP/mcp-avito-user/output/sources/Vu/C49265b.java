package vU;

import Y61.k;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;

/* compiled from: FavoriteItemRepositoryClientModule_ProvideFromPageSourceFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LvU/b;", "Ldagger/internal/h;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vU.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49265b implements h<FromPageSource> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C49265b f440790a = new C49265b();

    @Override // javax.inject.Provider
    public final Object get() {
        C49264a.f440789a.getClass();
        FromPageSource.AppLink appLink = FromPageSource.AppLink.f82325c;
        t.b(appLink, "Cannot return null from a non-@Nullable @Provides method");
        return appLink;
    }
}
