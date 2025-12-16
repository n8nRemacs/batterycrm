package com.avito.android.success.mvi;

import com.avito.android.success.mvi.entity.SuccessInternalAction;
import eA0.C39981c;
import eA0.InterfaceC39979a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuccessActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/success/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LeA0/a;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "LeA0/c;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC39979a, SuccessInternalAction, C39981c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.success.domain.a f291671a;

    @Inject
    public c(@Y61.k com.avito.android.success.domain.a aVar) {
        this.f291671a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f291668l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<SuccessInternalAction> b(InterfaceC39979a interfaceC39979a, C39981c c39981c) {
        return c(interfaceC39979a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC39979a interfaceC39979a) {
        if (interfaceC39979a.equals(InterfaceC39979a.b.f395032a)) {
            return this.f291671a.a();
        }
        if (interfaceC39979a instanceof InterfaceC39979a.C11056a) {
            return new C43210w(new SuccessInternalAction.HandleDeepLink(((InterfaceC39979a.C11056a) interfaceC39979a).f395031a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
