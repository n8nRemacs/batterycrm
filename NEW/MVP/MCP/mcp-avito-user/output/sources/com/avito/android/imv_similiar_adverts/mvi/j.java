package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import sN.InterfaceC48077b;

/* compiled from: ImvSimilarAdvertsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "LsN/b;", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements t<ImvSimilarAdvertsInternalAction, InterfaceC48077b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48077b b(ImvSimilarAdvertsInternalAction imvSimilarAdvertsInternalAction) {
        ImvSimilarAdvertsInternalAction imvSimilarAdvertsInternalAction2 = imvSimilarAdvertsInternalAction;
        if (imvSimilarAdvertsInternalAction2 instanceof ImvSimilarAdvertsInternalAction.Close) {
            return InterfaceC48077b.a.f437629a;
        }
        if (imvSimilarAdvertsInternalAction2 instanceof ImvSimilarAdvertsInternalAction.OpenAdvert) {
            return new InterfaceC48077b.C12613b(((ImvSimilarAdvertsInternalAction.OpenAdvert) imvSimilarAdvertsInternalAction2).f170908b);
        }
        return null;
    }
}
