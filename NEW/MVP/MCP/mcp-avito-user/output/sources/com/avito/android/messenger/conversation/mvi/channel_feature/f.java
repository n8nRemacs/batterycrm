package com.avito.android.messenger.conversation.mvi.channel_feature;

import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.InterfaceC31954a;
import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.M;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f189716a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f189717b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<M> f189718c;

    /* renamed from: d, reason: collision with root package name */
    public final u f189719d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f189720e;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f189716a = provider;
        this.f189717b = provider2;
        this.f189718c = provider3;
        this.f189719d = uVar;
        this.f189720e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String str = this.f189716a.get();
        this.f189717b.get();
        return new a(str, this.f189718c.get(), (InterfaceC31954a) this.f189719d.get(), this.f189720e.get());
    }
}
