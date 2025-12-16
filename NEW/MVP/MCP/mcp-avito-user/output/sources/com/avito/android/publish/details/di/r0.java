package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PublishDetailsModule_ProvideDefaultLoadingRendererFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r0 implements dagger.internal.h<a.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f234590a;

    public r0(dagger.internal.l lVar) {
        this.f234590a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f234590a.f393949a;
        n0.f234577a.getClass();
        return new com.avito.android.deeplink_handler.view.impl.i(fragment.requireActivity());
    }
}
