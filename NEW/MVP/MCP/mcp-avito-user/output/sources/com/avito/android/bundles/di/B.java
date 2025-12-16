package com.avito.android.bundles.di;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasBundlesViewModelFactory.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/di/B;", "Landroidx/lifecycle/P0$c;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f108257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.repository.a f108258b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.b f108259c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f108260d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f108261e;

    @Inject
    public B(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.bundles.b bVar, @Y61.k com.avito.android.bundles.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @InterfaceC28905c @Y61.k String str) {
        this.f108257a = str;
        this.f108258b = aVar;
        this.f108259c = bVar;
        this.f108260d = interfaceC35745a5;
        this.f108261e = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(com.avito.android.bundles.viewmodel.i.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        com.avito.android.bundles.b bVar = this.f108259c;
        com.avito.android.bundles.repository.a aVar = this.f108258b;
        String str = this.f108257a;
        return new com.avito.android.bundles.viewmodel.i(this.f108261e, bVar, aVar, this.f108260d, str);
    }
}
