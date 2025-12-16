package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;
import sN.C48078c;
import uk0.C49072b;

/* compiled from: ImvSimilarAdvertsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "LsN/c;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<ImvSimilarAdvertsInternalAction, C48078c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_similiar_adverts.d f170930b;

    @Inject
    public l(@Y61.k com.avito.android.imv_similiar_adverts.d dVar) {
        this.f170930b = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C48078c a(ImvSimilarAdvertsInternalAction imvSimilarAdvertsInternalAction, C48078c c48078c) {
        ImvSimilarAdvertsInternalAction imvSimilarAdvertsInternalAction2 = imvSimilarAdvertsInternalAction;
        C48078c c48078c2 = c48078c;
        if (!(imvSimilarAdvertsInternalAction2 instanceof ImvSimilarAdvertsInternalAction.ShowContent)) {
            return imvSimilarAdvertsInternalAction2 instanceof ImvSimilarAdvertsInternalAction.ShowLoading ? new C48078c(P2.c.f318721a) : imvSimilarAdvertsInternalAction2 instanceof ImvSimilarAdvertsInternalAction.ShowError ? new C48078c(new P2.a(((ImvSimilarAdvertsInternalAction.ShowError) imvSimilarAdvertsInternalAction2).f170910b)) : c48078c2;
        }
        C49072b c49072b = ((ImvSimilarAdvertsInternalAction.ShowContent) imvSimilarAdvertsInternalAction2).f170909b;
        return new C48078c(new P2.b(new UV0.c(this.f170930b.a(c49072b.b(), c49072b.getHeader(), SerpDisplayType.List))));
    }
}
