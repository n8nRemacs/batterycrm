package com.avito.android.virtual_deal_room_invite.invite.interactor;

import cO0.AbstractC27078b;
import cO0.InterfaceC27080d;
import com.avito.android.di.B;
import com.avito.android.util.y6;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InviteTimerInteractor.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/interactor/e;", "LcO0/b;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC27078b<InviteInternalAction> {
    @Inject
    public e() {
        super(InterfaceC27080d.b.a(1.0f));
    }

    @Override // cO0.AbstractC27078b
    public final InviteInternalAction.CountDownValidationTimer a(InterfaceC27080d.a aVar) {
        return new InviteInternalAction.CountDownValidationTimer(y6.g(aVar.f57851a / 1000.0f));
    }
}
