package com.avito.android.confirm_documents_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import wr.AbstractC49674b;

/* compiled from: ConfirmDocumentsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final f f125657a;

    /* renamed from: b, reason: collision with root package name */
    public final p f125658b;

    /* renamed from: c, reason: collision with root package name */
    public final j f125659c;

    /* renamed from: d, reason: collision with root package name */
    public final s f125660d;

    public m(f fVar, p pVar, j jVar, s sVar) {
        this.f125657a = fVar;
        this.f125658b = pVar;
        this.f125659c = jVar;
        this.f125660d = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f125657a.get();
        this.f125658b.getClass();
        o oVar = new o();
        i iVar = (i) this.f125659c.get();
        this.f125660d.getClass();
        return new l("ConfirmDocumentsBottomSheet", AbstractC49674b.c.f441820a, new k(eVar, oVar, iVar, new q()));
    }
}
