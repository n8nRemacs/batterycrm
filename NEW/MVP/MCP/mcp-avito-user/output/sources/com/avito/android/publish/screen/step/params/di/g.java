package com.avito.android.publish.screen.step.params.di;

import androidx.fragment.app.Fragment;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDetailsModule_ProvideDefaultLoadingRendererFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<a.g> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241114a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f241115b;

    public g(d dVar, dagger.internal.l lVar) {
        this.f241114a = dVar;
        this.f241115b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f241115b.f393949a;
        this.f241114a.getClass();
        return new com.avito.android.deeplink_handler.view.impl.i(fragment.requireActivity());
    }
}
