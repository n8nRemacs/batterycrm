package com.avito.android.services_onboarding.mvi;

import Zu0.InterfaceC19610a;
import Zu0.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.services_onboarding.di.q;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServicesOnboardingActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZu0/a;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "LZu0/c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC19610a, ServicesOnboardingInternalAction, Zu0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Yu0.g f279935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f279936b;

    @Inject
    public a(@Y61.k Yu0.g gVar, @Y61.l @q Integer num) {
        this.f279935a = gVar;
        this.f279936b = num;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ServicesOnboardingInternalAction> b(InterfaceC19610a interfaceC19610a, Zu0.c cVar) {
        InterfaceC19610a interfaceC19610a2 = interfaceC19610a;
        Zu0.c cVar2 = cVar;
        boolean zEquals = interfaceC19610a2.equals(InterfaceC19610a.b.f20550a);
        Yu0.g gVar = this.f279935a;
        if (zEquals) {
            return gVar.c(this.f279936b);
        }
        boolean z12 = interfaceC19610a2 instanceof InterfaceC19610a.C1469a;
        List<c.d> list = cVar2.f20557b;
        if (z12) {
            c.a aVar = cVar2.f20558c;
            return gVar.a(aVar != null ? aVar.f20564b : null, ((InterfaceC19610a.C1469a) interfaceC19610a2).f20549a, list.size());
        }
        if (interfaceC19610a2 instanceof InterfaceC19610a.c) {
            return gVar.b(((InterfaceC19610a.c) interfaceC19610a2).f20551a, list.size());
        }
        throw new NoWhenBranchMatchedException();
    }
}
