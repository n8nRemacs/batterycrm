package com.avito.android.vas_performance.ui.stickers.edit;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.v;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StickersEditVasViewModelFactory.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/r;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f322051a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f322052b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f322053c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322054d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f322055e;

    @Inject
    public r(@com.avito.android.vas_performance.di.stickers.a @Y61.k String str, @Y61.k v vVar, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f322051a = str;
        this.f322052b = vVar;
        this.f322053c = aVar;
        this.f322054d = interfaceC35745a5;
        this.f322055e = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(q.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new q(this.f322051a, this.f322052b, this.f322053c, this.f322054d, this.f322055e);
    }
}
