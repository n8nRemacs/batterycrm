package com.avito.android.vas_performance.ui.stickers.buy;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StickersBuyVasViewModelFactory.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/w;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f321985a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321986b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.r f321987c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321988d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321989e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321990f;

    @Inject
    public w(@com.avito.android.vas_performance.di.stickers.a @Y61.k String str, @com.avito.android.vas_performance.di.stickers.b @Y61.k String str2, @Y61.k com.avito.android.vas_performance.r rVar, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f321985a = str;
        this.f321986b = str2;
        this.f321987c = rVar;
        this.f321988d = aVar;
        this.f321989e = interfaceC35745a5;
        this.f321990f = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(v.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new v(this.f321985a, this.f321986b, this.f321987c, this.f321988d, this.f321989e, this.f321990f);
    }
}
