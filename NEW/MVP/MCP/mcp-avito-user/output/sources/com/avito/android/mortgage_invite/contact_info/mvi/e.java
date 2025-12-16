package com.avito.android.mortgage_invite.contact_info.mvi;

import androidx.compose.runtime.internal.P;
import b20.InterfaceC25394a;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicationContactInfoActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lb20/a;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lb20/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC25394a, ApplicationContactInfoInternalAction, b20.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.contact_info.domain.c f205693a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.contact_info.domain.a f205694b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.contact_info.domain.validation.f f205695c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z10.a f205696d;

    @Inject
    public e(@Y61.k com.avito.android.mortgage_invite.contact_info.domain.c cVar, @Y61.k com.avito.android.mortgage_invite.contact_info.domain.a aVar, @Y61.k com.avito.android.mortgage_invite.contact_info.domain.validation.f fVar, @Y61.k Z10.a aVar2) {
        this.f205693a = cVar;
        this.f205694b = aVar;
        this.f205695c = fVar;
        this.f205696d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ApplicationContactInfoInternalAction> b(InterfaceC25394a interfaceC25394a, b20.d dVar) {
        C43210w c43210w;
        InterfaceC25394a interfaceC25394a2 = interfaceC25394a;
        b20.d dVar2 = dVar;
        if (interfaceC25394a2 instanceof InterfaceC25394a.c) {
            return new C43210w(ApplicationContactInfoInternalAction.Back.f205699b);
        }
        if (interfaceC25394a2 instanceof InterfaceC25394a.i) {
            return this.f205693a.a();
        }
        if (interfaceC25394a2 instanceof InterfaceC25394a.b) {
            return C43175k.G(new a(interfaceC25394a2, dVar2, null));
        }
        if (interfaceC25394a2 instanceof InterfaceC25394a.C1986a) {
            return C43175k.G(new b(interfaceC25394a2, dVar2, null));
        }
        if (interfaceC25394a2 instanceof InterfaceC25394a.d) {
            return C43175k.G(new c(interfaceC25394a2, dVar2, null));
        }
        if (interfaceC25394a2 instanceof InterfaceC25394a.e) {
            InterfaceC25394a.e eVar = (InterfaceC25394a.e) interfaceC25394a2;
            c43210w = new C43210w(new ApplicationContactInfoInternalAction.ClientFieldUpdated(eVar.f56830a, eVar.f56831b));
        } else {
            if (!(interfaceC25394a2 instanceof InterfaceC25394a.f)) {
                if (interfaceC25394a2 instanceof InterfaceC25394a.h) {
                    return new C43210w(ApplicationContactInfoInternalAction.CreateNewClientClicked.f205708b);
                }
                if (interfaceC25394a2 instanceof InterfaceC25394a.g) {
                    return C43175k.G(new d(dVar2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new ApplicationContactInfoInternalAction.ClientSelected(((InterfaceC25394a.f) interfaceC25394a2).f56832a));
        }
        return c43210w;
    }
}
