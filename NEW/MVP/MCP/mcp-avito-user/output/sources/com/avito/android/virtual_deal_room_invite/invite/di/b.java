package com.avito.android.virtual_deal_room_invite.invite.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.virtual_deal_room_invite.invite.InviteFragment;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import cv.InterfaceC39417a;
import fO0.InterfaceC40325a;
import h31.d;
import h31.h;
import kotlin.Metadata;

/* compiled from: InviteComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/di/b;", "", "a", "b", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: InviteComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/di/b$a;", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @h
    public interface a {
    }

    /* compiled from: InviteComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/di/b$b;", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.virtual_deal_room_invite.invite.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC10128b {
        @k
        b a(@k InterfaceC40325a interfaceC40325a, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k InvitationArguments invitationArguments);
    }

    void a(@k InviteFragment inviteFragment);
}
