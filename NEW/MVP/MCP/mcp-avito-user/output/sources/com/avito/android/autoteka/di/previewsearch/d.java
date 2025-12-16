package com.avito.android.autoteka.di.previewsearch;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPreviewSearchModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.readyToPreviewSearch.b f96506a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.previewGeneration.b f96507b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.preview.b f96508c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.previewsearch.b f96509d;

    public d(com.avito.android.autoteka.items.readyToPreviewSearch.b bVar, com.avito.android.autoteka.items.previewGeneration.b bVar2, com.avito.android.autoteka.items.preview.b bVar3, com.avito.android.autoteka.items.fullScreenError.previewsearch.b bVar4) {
        this.f96506a = bVar;
        this.f96507b = bVar2;
        this.f96508c = bVar3;
        this.f96509d = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.readyToPreviewSearch.a aVar = (com.avito.android.autoteka.items.readyToPreviewSearch.a) this.f96506a.get();
        com.avito.android.autoteka.items.previewGeneration.a aVar2 = (com.avito.android.autoteka.items.previewGeneration.a) this.f96507b.get();
        com.avito.android.autoteka.items.preview.a aVar3 = (com.avito.android.autoteka.items.preview.a) this.f96508c.get();
        com.avito.android.autoteka.items.fullScreenError.previewsearch.a aVar4 = (com.avito.android.autoteka.items.fullScreenError.previewsearch.a) this.f96509d.get();
        b.f96503a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        return c10493a.a();
    }
}
