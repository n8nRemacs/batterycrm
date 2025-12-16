package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyTypeChangeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/o;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f308743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f308744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44256a f308745c;

    @Inject
    public o(@Y61.k q qVar, @Y61.k c cVar, @Y61.k InterfaceC44256a interfaceC44256a) {
        this.f308743a = qVar;
        this.f308744b = cVar;
        this.f308745c = interfaceC44256a;
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.l
    @Y61.k
    public final C43137a0 a(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, @Y61.k com.avito.android.user_advert.advert.items.multi_urgency.l lVar) {
        com.avito.android.user_advert.advert.items.multi_urgency.c cVarC = this.f308743a.c(cVar, lVar);
        return new C43137a0(new n(cVarC, null), C43175k.G(new m(this, cVarC, cVar, null)));
    }
}
