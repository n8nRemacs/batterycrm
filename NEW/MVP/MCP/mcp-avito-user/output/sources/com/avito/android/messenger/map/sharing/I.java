package com.avito.android.messenger.map.sharing;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SharingMapPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196644a;

    /* renamed from: b, reason: collision with root package name */
    public final v f196645b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196646c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f196647d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f196648e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f196649f;

    public I(Provider provider, v vVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f196644a = provider;
        this.f196645b = vVar;
        this.f196646c = lVar;
        this.f196647d = lVar2;
        this.f196648e = lVar3;
        this.f196649f = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f196644a.get(), (s) this.f196645b.get(), (String) this.f196646c.f393949a, (String) this.f196647d.f393949a, (String) this.f196648e.f393949a, (MessageBody.Location) this.f196649f.f393949a);
    }
}
