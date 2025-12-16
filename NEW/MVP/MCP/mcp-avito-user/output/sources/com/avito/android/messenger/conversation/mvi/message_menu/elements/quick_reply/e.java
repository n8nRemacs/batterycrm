package com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply;

import com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c;
import com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddQuickReplyElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32188a> f191733a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<c.b> f191734b;

    /* renamed from: c, reason: collision with root package name */
    public final u f191735c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f191733a = provider;
        this.f191734b = provider2;
        this.f191735c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f191733a.get(), this.f191734b.get(), (f) this.f191735c.get());
    }
}
