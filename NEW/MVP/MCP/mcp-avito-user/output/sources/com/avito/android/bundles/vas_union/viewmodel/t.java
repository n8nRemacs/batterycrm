package com.avito.android.bundles.vas_union.viewmodel;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.vas_union.di.InterfaceC28906a;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasUnionViewModelFactory.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/viewmodel/t;", "Landroidx/lifecycle/P0$c;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f108736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.vas_union.repository.a f108737b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.vas_union.a f108738c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f108739d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f108740e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AK0.l f108741f;

    @Inject
    public t(@Y61.k AK0.l lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.bundles.vas_union.a aVar, @Y61.k com.avito.android.bundles.vas_union.repository.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @InterfaceC28906a @Y61.k String str) {
        this.f108736a = str;
        this.f108737b = aVar2;
        this.f108738c = aVar;
        this.f108739d = interfaceC35745a5;
        this.f108740e = screenPerformanceTracker;
        this.f108741f = lVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(a.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        String str = this.f108736a;
        com.avito.android.bundles.vas_union.repository.a aVar = this.f108737b;
        InterfaceC35745a5 interfaceC35745a5 = this.f108739d;
        com.avito.android.bundles.vas_union.a aVar2 = this.f108738c;
        return new a(this.f108741f, this.f108740e, aVar2, aVar, interfaceC35745a5, str);
    }
}
