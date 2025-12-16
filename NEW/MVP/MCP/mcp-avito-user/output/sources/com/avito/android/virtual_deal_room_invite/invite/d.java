package com.avito.android.virtual_deal_room_invite.invite;

import com.avito.android.virtual_deal_room_invite.invite.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: InviteViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f326970a;

    public d(i iVar) {
        this.f326970a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.virtual_deal_room_invite.invite.mvi.h hVar = (com.avito.android.virtual_deal_room_invite.invite.mvi.h) this.f326970a.get();
        i2.f411430a.getClass();
        return new c(hVar, i2.a.f411433c);
    }
}
