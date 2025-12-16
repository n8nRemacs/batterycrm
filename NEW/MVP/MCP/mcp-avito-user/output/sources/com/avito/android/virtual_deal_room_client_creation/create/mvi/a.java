package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import RN0.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.entity.CreateInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CreateActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LRN0/a;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "LRN0/c;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<RN0.a, CreateInternalAction, RN0.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.virtual_deal_room_client_creation.create.interactor.a f326846a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ON0.a f326847b;

    @Inject
    public a(@k com.avito.android.virtual_deal_room_client_creation.create.interactor.a aVar, @k ON0.a aVar2) {
        this.f326846a = aVar;
        this.f326847b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CreateInternalAction> b(RN0.a aVar, RN0.c cVar) {
        RN0.a aVar2 = aVar;
        RN0.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            return new C43210w(new CreateInternalAction.FirstNameInput(((a.b) aVar2).f14416a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new CreateInternalAction.LastNameInput(((a.c) aVar2).f14417a));
        }
        if (aVar2 instanceof a.d) {
            return new C43210w(new CreateInternalAction.MiddleNameInput(((a.d) aVar2).f14418a));
        }
        boolean z12 = aVar2 instanceof a.e;
        com.avito.android.virtual_deal_room_client_creation.create.interactor.a aVar3 = this.f326846a;
        if (z12) {
            aVar3.a();
            return new C43210w(new CreateInternalAction.PhoneInput(((a.e) aVar2).f14419a));
        }
        if (aVar2 instanceof a.g) {
            this.f326847b.f();
            return new C43210w(new CreateInternalAction.ClientSelected(((a.g) aVar2).f14421a));
        }
        if (aVar2.equals(a.C0962a.f14415a)) {
            return new C43210w(CreateInternalAction.CloseClicked.f326860b);
        }
        boolean zEquals = aVar2.equals(a.h.f14422a);
        QN0.a aVar4 = cVar2.f14430e;
        if (!zEquals) {
            if (aVar2.equals(a.f.f14420a)) {
                return aVar3.b(aVar4.f13702a);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = cVar2.f14427b.f13702a;
        String str2 = cVar2.f14428c.f13702a;
        String str3 = cVar2.f14429d.f13702a;
        if (C43066x.K(str3)) {
            str3 = null;
        }
        InterfaceC43160i<CreateInternalAction> interfaceC43160iC = aVar3.c(str, str2, str3, aVar4.f13702a);
        if (cVar2.f14433h) {
            interfaceC43160iC = null;
        }
        return interfaceC43160iC == null ? C43175k.w() : interfaceC43160iC;
    }
}
