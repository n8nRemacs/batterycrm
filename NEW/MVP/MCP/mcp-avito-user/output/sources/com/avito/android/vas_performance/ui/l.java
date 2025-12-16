package com.avito.android.vas_performance.ui;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36056j;
import kotlin.Metadata;

/* compiled from: PerformanceVasViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/l;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f321857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321859c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321860d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36056j f321861e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TL0.a f321862f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AK0.l f321863g;

    public l(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36056j interfaceC36056j, @Y61.k TL0.a aVar2, @Y61.k AK0.l lVar) {
        this.f321857a = str;
        this.f321858b = str2;
        this.f321859c = aVar;
        this.f321860d = interfaceC35745a5;
        this.f321861e = interfaceC36056j;
        this.f321862f = aVar2;
        this.f321863g = lVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(m.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new m(this.f321857a, this.f321858b, this.f321859c, this.f321860d, this.f321861e, this.f321862f, this.f321863g);
    }
}
