package com.avito.android.serp.adapter.images_and_links_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import sr0.C48406d;

/* compiled from: ImagesWithLinksItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f270180a;

    /* renamed from: b, reason: collision with root package name */
    public final u f270181b;

    /* renamed from: c, reason: collision with root package name */
    public final C48406d f270182c;

    public c(j jVar, u uVar, C48406d c48406d) {
        this.f270180a = jVar;
        this.f270181b = uVar;
        this.f270182c = c48406d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((g) this.f270180a.get(), (com.avito.konveyor.a) this.f270181b.get(), this.f270182c);
    }
}
