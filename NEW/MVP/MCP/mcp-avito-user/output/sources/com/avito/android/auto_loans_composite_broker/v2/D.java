package com.avito.android.auto_loans_composite_broker.v2;

import androidx.view.M0;
import androidx.view.P0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompositeBrokerV2ViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/D;", "Landroidx/lifecycle/P0$c;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28712a f95616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Me.q f95617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f95618c;

    @Inject
    public D(@Y61.k InterfaceC28712a interfaceC28712a, @Y61.k Me.q qVar, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f95616a = interfaceC28712a;
        this.f95617b = qVar;
        this.f95618c = xVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(F.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new F(this.f95616a, this.f95617b, this.f95618c);
    }
}
