package com.avito.android.virtual_deal_room.client_room.interactor;

import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IN0.a> f326311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f326312b;

    /* renamed from: c, reason: collision with root package name */
    public final u f326313c;

    /* renamed from: d, reason: collision with root package name */
    public final l f326314d;

    /* renamed from: e, reason: collision with root package name */
    public final S3 f326315e;

    public h(Provider provider, Provider provider2, u uVar, l lVar, S3 s32) {
        this.f326311a = provider;
        this.f326312b = provider2;
        this.f326313c = uVar;
        this.f326314d = lVar;
        this.f326315e = s32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        IN0.a aVar = this.f326311a.get();
        R0 r02 = this.f326312b.get();
        a aVar2 = (a) this.f326313c.get();
        ClientRoomArguments clientRoomArguments = (ClientRoomArguments) this.f326314d.f393949a;
        this.f326315e.getClass();
        return new f(aVar, r02, aVar2, clientRoomArguments, S3.a());
    }
}
