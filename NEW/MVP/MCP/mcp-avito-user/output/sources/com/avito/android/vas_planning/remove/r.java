package com.avito.android.vas_planning.remove;

import aM0.InterfaceC19791a;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlannerRemoveViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/remove/r;", "Landroidx/lifecycle/P0$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322509a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VasPlannerRemoveInfo f322510b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19791a f322511c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322512d;

    @Inject
    public r(@Y61.k InterfaceC19791a interfaceC19791a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k VasPlannerRemoveInfo vasPlannerRemoveInfo) {
        this.f322509a = interfaceC35745a5;
        this.f322510b = vasPlannerRemoveInfo;
        this.f322511c = interfaceC19791a;
        this.f322512d = interfaceC28373a;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(o.class)) {
            return new o(this.f322511c, this.f322512d, this.f322509a, this.f322510b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
