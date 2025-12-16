package com.avito.android.advert_core.safedeal;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertSafeDealServicesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/s;", "Landroidx/lifecycle/P0$c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f84247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f84248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f84249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> f84250d;

    @Inject
    public s(@Y61.k d dVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k b bVar, @com.avito.android.advert_core.safedeal.di.e @Y61.k com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> dVar2) {
        this.f84247a = dVar;
        this.f84248b = interfaceC35745a5;
        this.f84249c = bVar;
        this.f84250d = dVar2;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(r.class)) {
            return new r(this.f84247a, this.f84248b, this.f84249c, this.f84250d);
        }
        throw new IllegalStateException("Unknown ViewModel class");
    }
}
