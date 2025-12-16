package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.AbstractC15411b;
import Tv.C15414e;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TarifikatorMainReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/y;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "LTv/e;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements com.avito.android.arch.mvi.u<TarifikatorMainInternalAction, C15414e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.i f135735b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a f135736c;

    @Inject
    public y(@Y61.k com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.i iVar, @Y61.k com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a aVar) {
        this.f135735b = iVar;
        this.f135736c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C15414e a(TarifikatorMainInternalAction tarifikatorMainInternalAction, C15414e c15414e) {
        TarifikatorMainInternalAction tarifikatorMainInternalAction2 = tarifikatorMainInternalAction;
        C15414e c15414e2 = c15414e;
        if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.SetScreenName) {
            return C15414e.a(c15414e2, com.avito.android.lib.design.nav_bar.a.a(c15414e2.f16013b, null, null, ((TarifikatorMainInternalAction.SetScreenName) tarifikatorMainInternalAction2).f135646b, null, null, null, 119), null, 2);
        }
        boolean z12 = tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TermsLoadingStarted;
        AbstractC15411b abstractC15411bA = c15414e2.f16014c;
        if (z12) {
            if (!(abstractC15411bA instanceof AbstractC15411b.a)) {
                abstractC15411bA = null;
            }
            AbstractC15411b.a aVar = (AbstractC15411b.a) abstractC15411bA;
            return C15414e.a(c15414e2, null, aVar != null ? AbstractC15411b.a.a(aVar, null, true, null, 5) : AbstractC15411b.c.f15983a, 1);
        }
        if (tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.LoadingSuccess.f135644b)) {
            AbstractC15411b.a aVar2 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
            if (aVar2 != null) {
                abstractC15411bA = AbstractC15411b.a.a(aVar2, null, false, null, 5);
            }
            return C15414e.a(c15414e2, null, abstractC15411bA, 1);
        }
        if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.LoadingFailed) {
            if (!(abstractC15411bA instanceof AbstractC15411b.a)) {
                abstractC15411bA = null;
            }
            AbstractC15411b.a aVar3 = (AbstractC15411b.a) abstractC15411bA;
            return C15414e.a(c15414e2, null, aVar3 != null ? AbstractC15411b.a.a(aVar3, null, false, null, 5) : AbstractC15411b.C1087b.f15982a, 1);
        }
        boolean z13 = tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.UpdateScreenContent;
        com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.i iVar = this.f135735b;
        if (z13) {
            TarifikatorMainInternalAction.UpdateScreenContent updateScreenContent = (TarifikatorMainInternalAction.UpdateScreenContent) tarifikatorMainInternalAction2;
            kotlin.collections.builders.b bVarB = iVar.b(updateScreenContent.f135661b, updateScreenContent.f135662c);
            if (!(abstractC15411bA instanceof AbstractC15411b.a)) {
                abstractC15411bA = null;
            }
            AbstractC15411b.a aVar4 = (AbstractC15411b.a) abstractC15411bA;
            return C15414e.a(c15414e2, null, aVar4 != null ? AbstractC15411b.a.a(aVar4, bVarB, false, null, 6) : new AbstractC15411b.a(bVarB, false, null, 6, null), 1);
        }
        if (tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.TermsSavingStarted.f135659b) ? true : tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.TariffDeleteStarted.f135654b)) {
            AbstractC15411b.a aVar5 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
            if (aVar5 != null) {
                abstractC15411bA = AbstractC15411b.a.a(aVar5, iVar.a(aVar5.f15979a, true), false, null, 6);
            }
            return C15414e.a(c15414e2, null, abstractC15411bA, 1);
        }
        if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TermsSavingSuccess ? true : tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TermsSavingFailed ? true : tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TariffDeleteSuccess ? true : tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TariffDeleteFailure) {
            AbstractC15411b.a aVar6 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
            if (aVar6 != null) {
                abstractC15411bA = AbstractC15411b.a.a(aVar6, iVar.a(aVar6.f15979a, false), false, null, 6);
            }
            return C15414e.a(c15414e2, null, abstractC15411bA, 1);
        }
        boolean z14 = tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.ShowAlertDialog;
        com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a aVar7 = this.f135736c;
        if (z14) {
            AbstractC15411b.a aVar8 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
            if (aVar8 != null) {
                abstractC15411bA = AbstractC15411b.a.a(aVar8, null, false, aVar7.a((TarifikatorMainInternalAction.ShowAlertDialog) tarifikatorMainInternalAction2), 3);
            }
            return C15414e.a(c15414e2, null, abstractC15411bA, 1);
        }
        if (tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.ClearAlertDialog.f135639b)) {
            AbstractC15411b.a aVar9 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
            if (aVar9 != null) {
                abstractC15411bA = AbstractC15411b.a.a(aVar9, null, false, null, 3);
            }
            return C15414e.a(c15414e2, null, abstractC15411bA, 1);
        }
        if (!(tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.ShowDeleteTariffDialog)) {
            return c15414e2;
        }
        AbstractC15411b.a aVar10 = (AbstractC15411b.a) (!(abstractC15411bA instanceof AbstractC15411b.a) ? null : abstractC15411bA);
        if (aVar10 != null) {
            abstractC15411bA = AbstractC15411b.a.a(aVar10, null, false, aVar7.b((TarifikatorMainInternalAction.ShowDeleteTariffDialog) tarifikatorMainInternalAction2), 3);
        }
        return C15414e.a(c15414e2, null, abstractC15411bA, 1);
    }
}
