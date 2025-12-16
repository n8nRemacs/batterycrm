package com.avito.android.model_card.screen.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.model_card.screen.mvi.entity.ModelCardInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ModelCardReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "LFZ/c;", "<init>", "()V", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<ModelCardInternalAction, FZ.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final FZ.c a(ModelCardInternalAction modelCardInternalAction, FZ.c cVar) {
        ModelCardInternalAction modelCardInternalAction2 = modelCardInternalAction;
        FZ.c cVar2 = cVar;
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.ContentLoaded) {
            ModelCardInternalAction.ContentLoaded contentLoaded = (ModelCardInternalAction.ContentLoaded) modelCardInternalAction2;
            return new FZ.c(false, null, contentLoaded.f198085b, contentLoaded.f198086c, contentLoaded.f198087d, contentLoaded.f198088e, contentLoaded.f198089f, contentLoaded.f198090g, contentLoaded.f198091h);
        }
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.Error) {
            return FZ.c.a(cVar2, false, ((ModelCardInternalAction.Error) modelCardInternalAction2).f198092b, null, null, null, 508);
        }
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.Loading) {
            return FZ.c.a(cVar2, true, null, null, null, null, 510);
        }
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.MainComponentsChanged) {
            return FZ.c.a(cVar2, false, null, null, null, ((ModelCardInternalAction.MainComponentsChanged) modelCardInternalAction2).f198095b, 255);
        }
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.BottomComponentsChanged) {
            return FZ.c.a(cVar2, false, null, null, ((ModelCardInternalAction.BottomComponentsChanged) modelCardInternalAction2).f198084b, null, 383);
        }
        if (modelCardInternalAction2 instanceof ModelCardInternalAction.NavBarMainComponentsChanged) {
            return FZ.c.a(cVar2, false, null, ((ModelCardInternalAction.NavBarMainComponentsChanged) modelCardInternalAction2).f198096b, null, null, 479);
        }
        throw new NoWhenBranchMatchedException();
    }
}
