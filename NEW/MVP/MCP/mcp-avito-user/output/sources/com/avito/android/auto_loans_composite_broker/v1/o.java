package com.avito.android.auto_loans_composite_broker.v1;

import androidx.view.M0;
import androidx.view.P0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompositeBrokerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/o;", "Landroidx/lifecycle/P0$c;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f95578a;

    @Inject
    public o(@Y61.k a aVar) {
        this.f95578a = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(q.class)) {
            return new q(this.f95578a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
