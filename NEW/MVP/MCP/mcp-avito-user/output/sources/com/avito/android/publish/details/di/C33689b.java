package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: AutoDescriptionModule_ProvideAutoDescriptionDelegateViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33689b implements dagger.internal.h<com.avito.android.publish.details.auto_description.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f233905a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.details.auto_description.i f233906b;

    public C33689b(dagger.internal.l lVar, com.avito.android.publish.details.auto_description.i iVar) {
        this.f233905a = lVar;
        this.f233906b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f233905a.f393949a;
        com.avito.android.publish.details.auto_description.h hVar = (com.avito.android.publish.details.auto_description.h) this.f233906b.get();
        C33687a.f233902a.getClass();
        return (com.avito.android.publish.details.auto_description.e) new P0(fragment, hVar).a(com.avito.android.publish.details.auto_description.e.class);
    }
}
