package com.avito.android.virtual_deal_room_invite.invite.interactor;

import Y61.k;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InviteInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/interactor/a;", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: InviteInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.virtual_deal_room_invite.invite.interactor.a$a, reason: collision with other inner class name */
    public static final class C10129a {
    }

    @k
    InterfaceC43160i<InviteInternalAction> a();

    @k
    InterfaceC43160i<InviteInternalAction> b(boolean z12);

    @k
    InterfaceC43160i<InviteInternalAction> c(@k Category category);
}
