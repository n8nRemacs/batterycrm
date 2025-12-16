package com.avito.android.analytics.screens.compose;

import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.categories_global.CategoriesScreen;
import kotlin.Metadata;

/* compiled from: ScreenMetadata.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/j;", "Lcom/avito/android/memory/consumption/c;", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements com.avito.android.memory.consumption.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f90582b;

    public j(InterfaceC22983P interfaceC22983P, CategoriesScreen categoriesScreen) {
        this.f90582b = interfaceC22983P;
    }

    @Override // androidx.view.InterfaceC22983P
    @Y61.k
    public final Lifecycle getLifecycle() {
        return this.f90582b.getLifecycle();
    }

    @Y61.k
    public final String toString() {
        return "CategoriesScreen";
    }
}
