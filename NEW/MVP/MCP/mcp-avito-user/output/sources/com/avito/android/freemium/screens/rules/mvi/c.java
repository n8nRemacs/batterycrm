package com.avito.android.freemium.screens.rules.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FreemiumRulesBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.b<FreemiumRulesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.freemium.screens.rules.domain.c f159129a;

    @Inject
    public c(@Y61.k com.avito.android.freemium.screens.rules.domain.c cVar) {
        this.f159129a = cVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FreemiumRulesInternalAction> a() {
        return this.f159129a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
