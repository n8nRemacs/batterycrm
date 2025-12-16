package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import android.content.res.Resources;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.a;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteRemoteMessageElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f191685a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a.InterfaceC5664a> f191686b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f191687c;

    /* renamed from: d, reason: collision with root package name */
    public final u f191688d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<JY.a> f191689e;

    public d(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f191685a = lVar;
        this.f191686b = provider;
        this.f191687c = provider2;
        this.f191688d = uVar;
        this.f191689e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Resources) this.f191685a.f393949a, this.f191686b.get(), this.f191687c.get(), (e) this.f191688d.get(), this.f191689e.get());
    }
}
