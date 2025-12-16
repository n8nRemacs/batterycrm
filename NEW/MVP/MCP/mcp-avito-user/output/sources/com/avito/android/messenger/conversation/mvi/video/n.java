package com.avito.android.messenger.conversation.mvi.video;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoUploadAnalytics_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f195030a;

    /* renamed from: b, reason: collision with root package name */
    public final u f195031b;

    public n(u uVar, u uVar2) {
        this.f195030a = uVar;
        this.f195031b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((InterfaceC28373a) this.f195030a.get(), (C30277e1) this.f195031b.get());
    }
}
