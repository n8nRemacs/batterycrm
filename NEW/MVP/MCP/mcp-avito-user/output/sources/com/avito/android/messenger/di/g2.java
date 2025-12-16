package com.avito.android.messenger.di;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.di.module.C30102l3;

/* compiled from: MessengerSyncModule_ProvideSyncJobScheduler$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g2 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.sync.O0> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f195794a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f195795b;

    public g2(C30102l3 c30102l3, C30713g1 c30713g1) {
        this.f195794a = c30102l3;
        this.f195795b = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f195794a.get();
        C30277e1 c30277e1 = (C30277e1) this.f195795b.get();
        int i12 = W1.f195723a;
        return new com.avito.android.messenger.conversation.mvi.sync.N0(context.getApplicationContext(), c30277e1);
    }
}
