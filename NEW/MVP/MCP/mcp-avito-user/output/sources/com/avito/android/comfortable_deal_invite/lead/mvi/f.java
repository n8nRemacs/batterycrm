package com.avito.android.comfortable_deal_invite.lead.mvi;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal_invite.lead.mvi.entity.ComfortableDealInviteInternalAction;
import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;
import zq.C50611c;
import zq.InterfaceC50609a;

/* compiled from: ComfortableDealInviteActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lzq/a;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lzq/c;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC50609a, ComfortableDealInviteInternalAction, C50611c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal_invite.lead.interactor.a f123704a;

    @Inject
    public f(@Y61.k com.avito.android.comfortable_deal_invite.lead.interactor.a aVar) {
        this.f123704a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ComfortableDealInviteInternalAction> b(InterfaceC50609a interfaceC50609a, C50611c c50611c) {
        C43210w c43210w;
        InterfaceC50609a interfaceC50609a2 = interfaceC50609a;
        C50611c c50611c2 = c50611c;
        if (interfaceC50609a2 instanceof InterfaceC50609a.k) {
            C43501a c43501a = ((InterfaceC50609a.k) interfaceC50609a2).f444271a;
            if (!L.f(c43501a.f413260a.f134521b, "create_client_request_key")) {
                return C43175k.w();
            }
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            CreateClientDeeplink.Result.Client client = interfaceC14249c instanceof CreateClientDeeplink.Result.Client ? (CreateClientDeeplink.Result.Client) interfaceC14249c : null;
            return client != null ? new C43210w(new ComfortableDealInviteInternalAction.SaveClientData(client.f326439b)) : new C43210w(ComfortableDealInviteInternalAction.Close.f123686b);
        }
        if (interfaceC50609a2 instanceof InterfaceC50609a.b) {
            return new C43210w(ComfortableDealInviteInternalAction.Close.f123686b);
        }
        if (interfaceC50609a2 instanceof InterfaceC50609a.j) {
            return C43175k.G(new a(interfaceC50609a2, null));
        }
        if (interfaceC50609a2 instanceof InterfaceC50609a.d) {
            return C43175k.G(new b(interfaceC50609a2, null));
        }
        if (interfaceC50609a2 instanceof InterfaceC50609a.e) {
            c43210w = new C43210w(new ComfortableDealInviteInternalAction.ContractSignedChecked(((InterfaceC50609a.e) interfaceC50609a2).f444265a));
        } else if (interfaceC50609a2 instanceof InterfaceC50609a.f) {
            c43210w = new C43210w(new ComfortableDealInviteInternalAction.HasMinorOwnersChecked(((InterfaceC50609a.f) interfaceC50609a2).f444266a));
        } else if (interfaceC50609a2 instanceof InterfaceC50609a.g) {
            c43210w = new C43210w(new ComfortableDealInviteInternalAction.HasRestrictionsChecked(((InterfaceC50609a.g) interfaceC50609a2).f444267a));
        } else {
            if (interfaceC50609a2 instanceof InterfaceC50609a.l) {
                return C43175k.G(new c(interfaceC50609a2, null));
            }
            if (interfaceC50609a2 instanceof InterfaceC50609a.c) {
                return C43175k.G(new d(interfaceC50609a2, null));
            }
            if (interfaceC50609a2 instanceof InterfaceC50609a.h) {
                c43210w = new C43210w(new ComfortableDealInviteInternalAction.IsCallConfirmedChecked(((InterfaceC50609a.h) interfaceC50609a2).f444268a));
            } else {
                if (!(interfaceC50609a2 instanceof InterfaceC50609a.i)) {
                    if (interfaceC50609a2 instanceof InterfaceC50609a.C12977a) {
                        return C43175k.G(new e(c50611c2, this, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new ComfortableDealInviteInternalAction.IsTermsConfirmedChecked(((InterfaceC50609a.i) interfaceC50609a2).f444269a));
            }
        }
        return c43210w;
    }
}
