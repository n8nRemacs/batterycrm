package com.avito.android.comfortable_deal.clients.mvi;

import androidx.compose.runtime.internal.P;
import ap.InterfaceC23648b;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import com.avito.android.comfortable_deal.paging.PagingState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kp.C43477c;
import kp.C43481g;
import kp.InterfaceC43475a;

/* compiled from: ClientsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lkp/a;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkp/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC43475a, ClientsInternalAction, C43481g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.clients.interactor.a f120343a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.clients.use_case.a f120344b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23648b f120345c;

    @Inject
    public g(@Y61.k com.avito.android.comfortable_deal.clients.interactor.a aVar, @Y61.k com.avito.android.comfortable_deal.clients.use_case.a aVar2, @Y61.k InterfaceC23648b interfaceC23648b) {
        this.f120343a = aVar;
        this.f120344b = aVar2;
        this.f120345c = interfaceC23648b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ClientsInternalAction> b(InterfaceC43475a interfaceC43475a, C43481g c43481g) {
        C43210w c43210w;
        InterfaceC43475a interfaceC43475a2 = interfaceC43475a;
        C43481g c43481g2 = c43481g;
        boolean zEquals = interfaceC43475a2.equals(InterfaceC43475a.i.f413187a);
        C43477c c43477c = c43481g2.f413210d;
        com.avito.android.comfortable_deal.clients.interactor.a aVar = this.f120343a;
        if (zEquals) {
            PagingState pagingState = PagingState.f122409c;
            PagingState pagingState2 = c43481g2.f413208b;
            if (pagingState2 == pagingState || pagingState2 == PagingState.f122411e) {
                return C43175k.w();
            }
            return aVar.a(c43481g2.f413209c + 1, c43481g2.c(), c43477c != null ? c43477c.f413193a : null, c43477c != null ? Boolean.valueOf(c43477c.f413194b) : null);
        }
        if (interfaceC43475a2 instanceof InterfaceC43475a.c) {
            return C43175k.G(new b(interfaceC43475a2, null));
        }
        if (interfaceC43475a2 instanceof InterfaceC43475a.k) {
            return C43175k.G(new c(c43481g2, interfaceC43475a2, this, null));
        }
        if (interfaceC43475a2 instanceof InterfaceC43475a.b) {
            return C43175k.G(new d(c43481g2, interfaceC43475a2, this, null));
        }
        if (interfaceC43475a2.equals(InterfaceC43475a.h.f413186a)) {
            return aVar.b(c43481g2.c(), c43477c);
        }
        if (interfaceC43475a2.equals(InterfaceC43475a.g.f413185a)) {
            return c43481g2.c() == RequestType.f120270d ? aVar.b(c43481g2.c(), c43477c) : C43175k.w();
        }
        boolean z12 = interfaceC43475a2 instanceof InterfaceC43475a.d;
        InterfaceC23648b interfaceC23648b = this.f120345c;
        if (z12) {
            if (((InterfaceC43475a.d) interfaceC43475a2).f413182a && c43481g2.c() == RequestType.f120270d) {
                interfaceC23648b.a();
            }
            return C43175k.w();
        }
        if (interfaceC43475a2 instanceof InterfaceC43475a.m) {
            return C43175k.G(new e(c43481g2, interfaceC43475a2, this, null));
        }
        if (interfaceC43475a2 instanceof InterfaceC43475a.f) {
            c43210w = new C43210w(ClientsInternalAction.OpenArchivingFilterDialog.f120328b);
        } else {
            if (interfaceC43475a2 instanceof InterfaceC43475a.l) {
                return C43175k.G(new f(c43481g2, interfaceC43475a2, this, null));
            }
            if (interfaceC43475a2 instanceof InterfaceC43475a.C11760a) {
                return new C43210w(new ClientsInternalAction.HandleDeeplink(((InterfaceC43475a.C11760a) interfaceC43475a2).f413179a));
            }
            if (!(interfaceC43475a2 instanceof InterfaceC43475a.e)) {
                if (!(interfaceC43475a2 instanceof InterfaceC43475a.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((InterfaceC43475a.j) interfaceC43475a2).f413188a;
                interfaceC23648b.b(str);
                return C43175k.G(new a(this.f120344b.a(str), null, c43481g2, this));
            }
            c43210w = new C43210w(ClientsInternalAction.DismissArchivingDialog.f120315b);
        }
        return c43210w;
    }
}
