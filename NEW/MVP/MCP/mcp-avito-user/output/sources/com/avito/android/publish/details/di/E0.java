package com.avito.android.publish.details.di;

/* compiled from: PublishDetailsTagsModule_ProvideTagsViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E0 implements dagger.internal.h<com.avito.android.ui.widget.tagged_input.m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233617a;

    public E0(dagger.internal.u uVar) {
        this.f233617a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.tags.e eVar = (com.avito.android.publish.details.tags.e) this.f233617a.get();
        C0.f233612a.getClass();
        return eVar;
    }
}
