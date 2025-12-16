package com.avito.android.freemium.screens.rules.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction;
import eF.C39999c;
import eF.InterfaceC39997a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FreemiumRulesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LeF/a;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "LeF/c;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39997a, FreemiumRulesInternalAction, C39999c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.freemium.screens.rules.domain.c f159125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.freemium.screens.rules.domain.a f159126b;

    @Inject
    public a(@Y61.k com.avito.android.freemium.screens.rules.domain.c cVar, @Y61.k com.avito.android.freemium.screens.rules.domain.a aVar) {
        this.f159125a = cVar;
        this.f159126b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FreemiumRulesInternalAction> b(InterfaceC39997a interfaceC39997a, C39999c c39999c) {
        InterfaceC39997a interfaceC39997a2 = interfaceC39997a;
        if (interfaceC39997a2.equals(InterfaceC39997a.d.f395065a)) {
            return this.f159125a.a();
        }
        if (interfaceC39997a2.equals(InterfaceC39997a.C11061a.f395062a)) {
            return new C43210w(FreemiumRulesInternalAction.CloseScreen.f159138b);
        }
        if (interfaceC39997a2 instanceof InterfaceC39997a.c) {
            return new C43210w(new FreemiumRulesInternalAction.OpenDeepLink(((InterfaceC39997a.c) interfaceC39997a2).f395064a));
        }
        if (interfaceC39997a2.equals(InterfaceC39997a.b.f395063a)) {
            return this.f159126b.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
