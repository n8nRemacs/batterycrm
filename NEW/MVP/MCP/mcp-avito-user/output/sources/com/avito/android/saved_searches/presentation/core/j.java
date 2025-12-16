package com.avito.android.saved_searches.presentation.core;

import androidx.fragment.app.DialogFragment;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f258413a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258414b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35845m2> f258415c;

    /* renamed from: d, reason: collision with root package name */
    public final l f258416d;

    public j(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f258413a = provider;
        this.f258414b = lVar;
        this.f258415c = provider2;
        this.f258416d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f258413a.get(), (DialogFragment) this.f258414b.f393949a, this.f258415c.get(), (SavedSearchParams) this.f258416d.f393949a);
    }
}
