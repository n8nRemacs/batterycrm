package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;

/* compiled from: HtmlModule_ProvideHtmlEditorViewModelFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33730k implements dagger.internal.h<com.avito.android.blueprints.publish.html_editor.q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234565a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234566b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234567c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f234568d;

    public C33730k(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f234565a = uVar;
        this.f234566b = uVar2;
        this.f234567c = uVar3;
        this.f234568d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.html_editor.b bVar = (com.avito.android.html_editor.b) this.f234565a.get();
        hJ.g gVar = (hJ.g) this.f234566b.get();
        hJ.h hVar = (hJ.h) this.f234567c.get();
        Fragment fragment = (Fragment) this.f234568d.f393949a;
        C33727i.f234558a.getClass();
        return new com.avito.android.blueprints.publish.html_editor.q(bVar, gVar, hVar, fragment);
    }
}
