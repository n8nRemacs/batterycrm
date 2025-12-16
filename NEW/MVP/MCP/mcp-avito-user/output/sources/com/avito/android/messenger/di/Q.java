package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideQuickReplyItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Q implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195697a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.quick_replies.adapter.h f195698b;

    public Q(C32431e c32431e, com.avito.android.messenger.conversation.mvi.quick_replies.adapter.h hVar) {
        this.f195697a = c32431e;
        this.f195698b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.quick_replies.adapter.g gVar = (com.avito.android.messenger.conversation.mvi.quick_replies.adapter.g) this.f195698b.get();
        this.f195697a.getClass();
        return new com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b(gVar);
    }
}
