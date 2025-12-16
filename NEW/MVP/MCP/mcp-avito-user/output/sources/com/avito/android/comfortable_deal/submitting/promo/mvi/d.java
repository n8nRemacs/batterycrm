package com.avito.android.comfortable_deal.submitting.promo.mvi;

import Yo.t;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.InputState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoInternalAction;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mq.InterfaceC44119a;

/* compiled from: PromoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lmq/a;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoState;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC44119a, PromoInternalAction, PromoState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.domain.e f123164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f123165b;

    @Inject
    public d(@Y61.k com.avito.android.comfortable_deal.domain.e eVar, @Y61.k t tVar) {
        this.f123164a = eVar;
        this.f123165b = tVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PromoInternalAction> b(InterfaceC44119a interfaceC44119a, PromoState promoState) {
        InterfaceC44119a interfaceC44119a2 = interfaceC44119a;
        PromoState promoState2 = promoState;
        if (interfaceC44119a2.equals(InterfaceC44119a.C11844a.f414765a)) {
            return new C43210w(PromoInternalAction.NavigateBack.f123183b);
        }
        boolean zEquals = interfaceC44119a2.equals(InterfaceC44119a.d.f414768a);
        InputState inputState = promoState2.f123189d;
        if (zEquals) {
            String str = inputState.f123176d;
            return new C43137a0(new c(2, null), new b(this.f123164a.a(str, "podacha"), this, str));
        }
        if (interfaceC44119a2 instanceof InterfaceC44119a.b) {
            return C43175k.G(new a(inputState.f123176d, this, null));
        }
        if (interfaceC44119a2 instanceof InterfaceC44119a.c) {
            return new C43210w(new PromoInternalAction.PhoneInputChanged(((InterfaceC44119a.c) interfaceC44119a2).f414767a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
