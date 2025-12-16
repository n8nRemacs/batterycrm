package com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.di.I1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.F0;

/* compiled from: DeleteChannelDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f190528a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f190529b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190530c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f190531d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f190532e;

    public e(I1 i12, Provider provider, Provider provider2, Provider provider3, dv.b bVar) {
        this.f190528a = i12;
        this.f190529b = provider;
        this.f190530c = provider2;
        this.f190531d = provider3;
        this.f190532e = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((F0) this.f190528a.get(), this.f190529b.get(), this.f190530c.get(), this.f190531d.get(), (a.i) this.f190532e.get());
    }
}
