package com.avito.android.virtual_deal_room_invite.invite.interactor;

import bO0.InterfaceC25538b;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gO0.InterfaceC40606a;
import java.util.Map;
import javax.inject.Provider;
import lO0.InterfaceC43664a;

/* compiled from: InviteInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40606a> f327028a;

    /* renamed from: b, reason: collision with root package name */
    public final l f327029b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC43664a> f327030c;

    /* renamed from: d, reason: collision with root package name */
    public final u f327031d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f327032e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f327033f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Map<Category, InterfaceC25538b>> f327034g;

    public d(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f327028a = provider;
        this.f327029b = lVar;
        this.f327030c = provider2;
        this.f327031d = uVar;
        this.f327032e = provider3;
        this.f327033f = provider4;
        this.f327034g = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f327028a.get(), (InvitationArguments) this.f327029b.f393949a, this.f327030c.get(), (e) this.f327031d.get(), this.f327032e.get(), this.f327033f.get(), this.f327034g.get());
    }
}
