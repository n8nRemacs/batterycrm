package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;

/* compiled from: HtmlModule_ProvideHtmlEditorViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33729j implements dagger.internal.h<HtmlEditorViewModel> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234562a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f234563b;

    public C33729j(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f234562a = uVar;
        this.f234563b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.html_editor.q qVar = (com.avito.android.blueprints.publish.html_editor.q) this.f234562a.get();
        Fragment fragment = (Fragment) this.f234563b.f393949a;
        C33727i.f234558a.getClass();
        return (HtmlEditorViewModel) new P0(fragment, qVar).a(com.avito.android.blueprints.publish.html_editor.s.class);
    }
}
