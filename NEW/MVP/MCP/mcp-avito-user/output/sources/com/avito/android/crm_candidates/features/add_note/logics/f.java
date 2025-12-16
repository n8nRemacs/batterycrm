package com.avito.android.crm_candidates.features.add_note.logics;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmAddNoteBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f129462a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f129463b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f129464c;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f129462a = lVar;
        this.f129463b = lVar2;
        this.f129464c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f129462a.f393949a, (String) this.f129463b.f393949a, (String) this.f129464c.f393949a);
    }
}
