package com.avito.android.comfortable_deal.submitting.success.mvi;

import Yo.t;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.submitting.success.mvi.entity.SubmittingSuccessInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rq.C47710c;
import rq.InterfaceC47708a;

/* compiled from: SubmittingSuccessActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lrq/a;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "Lrq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC47708a, SubmittingSuccessInternalAction, C47710c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t f123419a;

    @Inject
    public d(@Y61.k t tVar) {
        this.f123419a = tVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SubmittingSuccessInternalAction> b(InterfaceC47708a interfaceC47708a, C47710c c47710c) {
        InterfaceC47708a interfaceC47708a2 = interfaceC47708a;
        C47710c c47710c2 = c47710c;
        if (interfaceC47708a2 instanceof InterfaceC47708a.c) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC47708a2 instanceof InterfaceC47708a.b) {
            return C43175k.G(new b(this, c47710c2, null));
        }
        if (interfaceC47708a2 instanceof InterfaceC47708a.C12397a) {
            return C43175k.G(new c(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
