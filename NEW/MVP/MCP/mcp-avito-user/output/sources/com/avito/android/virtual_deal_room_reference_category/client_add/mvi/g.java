package com.avito.android.virtual_deal_room_reference_category.client_add.mvi;

import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import rO0.C47580d;

/* compiled from: ClientAddFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f327200a;

    /* renamed from: b, reason: collision with root package name */
    public final i f327201b;

    /* renamed from: c, reason: collision with root package name */
    public final k f327202c;

    /* renamed from: d, reason: collision with root package name */
    public final l f327203d;

    public g(d dVar, i iVar, k kVar, l lVar) {
        this.f327200a = dVar;
        this.f327201b = iVar;
        this.f327202c = kVar;
        this.f327203d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f327200a.get();
        this.f327201b.getClass();
        h hVar = new h();
        this.f327202c.getClass();
        j jVar = new j();
        ClientAddArguments clientAddArguments = (ClientAddArguments) this.f327203d.f393949a;
        C47580d.f429801g.getClass();
        return new f("ClientAdd", new C47580d("", "", "", "", clientAddArguments.f327183b, false), new e(bVar, jVar, hVar));
    }
}
