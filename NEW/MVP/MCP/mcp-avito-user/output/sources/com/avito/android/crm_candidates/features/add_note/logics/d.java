package com.avito.android.crm_candidates.features.add_note.logics;

import Ms.InterfaceC14524a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmAddNoteActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14524a> f129449a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f129450b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f129451c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f129452d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f129453e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f129454f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f129455g;

    public d(Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f129449a = provider;
        this.f129450b = provider2;
        this.f129451c = provider3;
        this.f129452d = lVar;
        this.f129453e = lVar2;
        this.f129454f = lVar3;
        this.f129455g = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f129449a.get(), this.f129450b.get(), this.f129451c.get(), (String) this.f129452d.f393949a, (String) this.f129453e.f393949a, (String) this.f129454f.f393949a, (String) this.f129455g.f393949a);
    }
}
