package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import Jb.InterfaceC14183a;
import com.avito.android.ai_assistant.screens.chat.use_case.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AssistantChatInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f89380a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.screens.chat.use_case.e> f89381b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.screens.chat.use_case.a> f89382c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<m> f89383d;

    /* renamed from: e, reason: collision with root package name */
    public final u f89384e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f89385f;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f89380a = provider;
        this.f89381b = provider2;
        this.f89382c = provider3;
        this.f89383d = provider4;
        this.f89384e = uVar;
        this.f89385f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f89380a.get(), this.f89381b.get(), this.f89382c.get(), this.f89383d.get(), (InterfaceC14183a) this.f89384e.get(), this.f89385f.get());
    }
}
