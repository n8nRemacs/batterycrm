package com.avito.android.tariff.cpx.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxLevelsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements com.avito.android.arch.mvi.b<CpxLevelsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.levels.domain.a f297139a;

    @Inject
    public i(@Y61.k com.avito.android.tariff.cpx.levels.domain.a aVar) {
        this.f297139a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpxLevelsInternalAction> a() {
        return (InterfaceC43160i) this.f297139a.invoke();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
