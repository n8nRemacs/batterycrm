package com.avito.android.messenger.conversation.mvi.channel_feature;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ChannelViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final i f190146a;

    public o(i iVar) {
        this.f190146a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f190146a.get();
        i2.f411430a.getClass();
        return new n(hVar, i2.a.f411432b);
    }
}
