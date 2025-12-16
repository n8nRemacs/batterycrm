package com.avito.android.historical_suggests.suggest.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vI.C49218c;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LvI/a;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "LvI/c;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC49216a, HistoricalSuggestsInternalAction, C49218c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.historical_suggests.suggest.interactor.a f162130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.historical_suggests.suggest.usecase.i f162131b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f162132c;

    @Inject
    public c(@Y61.k com.avito.android.historical_suggests.suggest.interactor.a aVar, @Y61.k com.avito.android.historical_suggests.suggest.usecase.i iVar) {
        this.f162130a = aVar;
        this.f162131b = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<HistoricalSuggestsInternalAction> b(InterfaceC49216a interfaceC49216a, C49218c c49218c) {
        InterfaceC49216a interfaceC49216a2 = interfaceC49216a;
        C49218c c49218c2 = c49218c;
        if (interfaceC49216a2 instanceof InterfaceC49216a.c) {
            return C43175k.G(new a(c49218c2, interfaceC49216a2, null));
        }
        if (interfaceC49216a2 instanceof InterfaceC49216a.d) {
            return C43175k.G(new b(interfaceC49216a2, this, null));
        }
        if (interfaceC49216a2 instanceof InterfaceC49216a.C12761a) {
            return new C43210w(new HistoricalSuggestsInternalAction.a(((InterfaceC49216a.C12761a) interfaceC49216a2).f440648a));
        }
        if (!(interfaceC49216a2 instanceof InterfaceC49216a.b)) {
            if (interfaceC49216a2 instanceof InterfaceC49216a.e) {
                return new C43210w(new HistoricalSuggestsInternalAction.d(((InterfaceC49216a.e) interfaceC49216a2).f440653a));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (this.f162132c) {
            return C43175k.w();
        }
        this.f162132c = true;
        InterfaceC49216a.b bVar = (InterfaceC49216a.b) interfaceC49216a2;
        return this.f162130a.a(bVar.f440649a, bVar.f440650b);
    }
}
