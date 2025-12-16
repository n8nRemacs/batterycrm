package com.avito.android.favorite_comparison.presentation;

import Uq.InterfaceC15558a;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import sC.InterfaceC48028e;

/* compiled from: FavoriteComparisonViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/p;", "Landroidx/lifecycle/P0$c;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15558a f155358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d f155359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f155361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48028e f155363f;

    @Inject
    public p(@Y61.k InterfaceC15558a interfaceC15558a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d dVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC48028e interfaceC48028e) {
        this.f155358a = interfaceC15558a;
        this.f155359b = dVar;
        this.f155360c = aVar;
        this.f155361d = fVar;
        this.f155362e = interfaceC35745a5;
        this.f155363f = interfaceC48028e;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(y.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        com.avito.android.remote.error.f fVar = this.f155361d;
        return cls.cast(new y(this.f155358a, this.f155360c, this.f155359b, fVar, this.f155362e, this.f155363f));
    }
}
