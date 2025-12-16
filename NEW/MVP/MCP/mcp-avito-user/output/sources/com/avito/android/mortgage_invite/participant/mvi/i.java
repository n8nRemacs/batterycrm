package com.avito.android.mortgage_invite.participant.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import p20.C46879d;
import p20.InterfaceC46876a;

/* compiled from: ParticipantActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "Lp20/a;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lp20/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements com.avito.android.arch.mvi.a<InterfaceC46876a, ParticipantInternalAction, C46879d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.participant.domain.validation.n f206221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.participant.interactor.d f206222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.participant.interactor.a f206223c;

    @Inject
    public i(@Y61.k com.avito.android.mortgage_invite.participant.domain.validation.n nVar, @Y61.k com.avito.android.mortgage_invite.participant.interactor.d dVar, @Y61.k com.avito.android.mortgage_invite.participant.interactor.a aVar) {
        this.f206221a = nVar;
        this.f206222b = dVar;
        this.f206223c = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ParticipantInternalAction> b(InterfaceC46876a interfaceC46876a, C46879d c46879d) {
        InterfaceC46876a interfaceC46876a2 = interfaceC46876a;
        C46879d c46879d2 = c46879d;
        if (interfaceC46876a2 instanceof InterfaceC46876a.c) {
            return C43175k.G(new a(c46879d2, null));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.g) {
            return new C43210w(ParticipantInternalAction.Close.f206195b);
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.j) {
            return this.f206222b.load();
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.b) {
            return C43175k.G(new b(this, interfaceC46876a2, null));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.d) {
            return C43175k.G(new c(this, null, interfaceC46876a2, c46879d2));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.C12252a) {
            return C43175k.G(new d(c46879d2, interfaceC46876a2, null));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.e) {
            return C43175k.G(new e(this, null, interfaceC46876a2, c46879d2));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.f) {
            return C43175k.G(new f(this, interfaceC46876a2, null));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.i) {
            return C43175k.G(new g(this, null));
        }
        if (interfaceC46876a2 instanceof InterfaceC46876a.h) {
            return C43175k.G(new h(c46879d2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
