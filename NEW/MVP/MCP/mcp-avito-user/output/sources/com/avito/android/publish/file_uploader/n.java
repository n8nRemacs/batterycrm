package com.avito.android.publish.file_uploader;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: FileUploaderModule_ProvideFileUploaderViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final l f235699a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235700b;

    /* renamed from: c, reason: collision with root package name */
    public final C f235701c;

    public n(l lVar, dagger.internal.l lVar2, C c12) {
        this.f235699a = lVar;
        this.f235700b = lVar2;
        this.f235701c = c12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f235700b.f393949a;
        B b12 = (B) this.f235701c.get();
        this.f235699a.getClass();
        return (t) new P0(fragment, b12).a(t.class);
    }
}
