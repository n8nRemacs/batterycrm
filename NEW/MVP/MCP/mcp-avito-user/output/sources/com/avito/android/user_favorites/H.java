package com.avito.android.user_favorites;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserFavoritesTopWidgetDeps.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/H;", "", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.item.b f316785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Screen f316786b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f316787c;

    @Inject
    public H(@Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f316785a = bVar;
        this.f316786b = screen;
        this.f316787c = screenPerformanceTracker;
    }
}
