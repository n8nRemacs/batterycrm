package com.avito.android.messenger.service.user_last_activity;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.channels.mvi.data.f0;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UserLastActivitySyncAgentImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f197340a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f197341b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<f0> f197342c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f197343d;

    /* renamed from: e, reason: collision with root package name */
    public final C30713g1 f197344e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197345f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<z0> f197346g;

    public r(Provider provider, dagger.internal.f fVar, Provider provider2, Provider provider3, C30713g1 c30713g1, Provider provider4, Provider provider5) {
        this.f197340a = provider;
        this.f197341b = fVar;
        this.f197342c = provider2;
        this.f197343d = provider3;
        this.f197344e = c30713g1;
        this.f197345f = provider4;
        this.f197346g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f197340a.get(), (InterfaceC47842z) this.f197341b.get(), this.f197342c.get(), this.f197343d.get(), (C30277e1) this.f197344e.get(), this.f197345f.get(), this.f197346g.get());
    }
}
