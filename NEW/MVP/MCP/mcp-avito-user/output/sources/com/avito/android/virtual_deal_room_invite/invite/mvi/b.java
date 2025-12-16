package com.avito.android.virtual_deal_room_invite.invite.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lO0.InterfaceC43664a;
import nO0.C44303d;
import nO0.InterfaceC44300a;

/* compiled from: InviteActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LnO0/a;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "LnO0/d;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC44300a, InviteInternalAction, C44303d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_invite.invite.interactor.a f327048a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43664a f327049b;

    @Inject
    public b(@Y61.k com.avito.android.virtual_deal_room_invite.invite.interactor.a aVar, @Y61.k InterfaceC43664a interfaceC43664a) {
        this.f327048a = aVar;
        this.f327049b = interfaceC43664a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InviteInternalAction> b(InterfaceC44300a interfaceC44300a, C44303d c44303d) {
        C43210w c43210w;
        InterfaceC44300a interfaceC44300a2 = interfaceC44300a;
        C44303d c44303d2 = c44303d;
        boolean zEquals = interfaceC44300a2.equals(InterfaceC44300a.C11857a.f415096a);
        InterfaceC43664a interfaceC43664a = this.f327049b;
        com.avito.android.virtual_deal_room_invite.invite.interactor.a aVar = this.f327048a;
        if (zEquals) {
            interfaceC43664a.c();
            Category category = c44303d2.f415110c;
            if (category != null) {
                return aVar.c(category);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (interfaceC44300a2.equals(InterfaceC44300a.b.f415097a)) {
            c43210w = new C43210w(InviteInternalAction.Close.f327069b);
        } else {
            if (!interfaceC44300a2.equals(InterfaceC44300a.c.f415098a)) {
                if (interfaceC44300a2.equals(InterfaceC44300a.d.f415099a)) {
                    interfaceC43664a.d();
                    return aVar.a();
                }
                if (interfaceC44300a2.equals(InterfaceC44300a.e.f415100a)) {
                    return aVar.b(true);
                }
                if (interfaceC44300a2.equals(InterfaceC44300a.f.f415101a)) {
                    return C43175k.G(new a(c44303d2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InviteInternalAction.OpenDeeplink(new MainScreenLink(null, null, true, 3, null)));
        }
        return c43210w;
    }
}
