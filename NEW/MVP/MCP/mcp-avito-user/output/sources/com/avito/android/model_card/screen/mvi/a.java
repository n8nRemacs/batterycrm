package com.avito.android.model_card.screen.mvi;

import FZ.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.model_card.screen.mvi.entity.ModelCardInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ModelCardActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LFZ/a;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "LFZ/c;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<FZ.a, ModelCardInternalAction, FZ.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.model_card.screen.domain.a f198067a;

    @Inject
    public a(@Y61.k com.avito.android.model_card.screen.domain.a aVar) {
        this.f198067a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ModelCardInternalAction> b(FZ.a aVar, FZ.c cVar) {
        if (aVar.equals(a.C0293a.f4774a)) {
            return this.f198067a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
