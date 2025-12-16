package com.avito.android.extended_profile_selection_create.select;

import androidx.fragment.app.Fragment;
import com.avito.android.search.filter.InterfaceC34598u;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSelectionCreateRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_selection_create.select.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30510l implements dagger.internal.h<C30509k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152286a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f152287b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34598u> f152288c;

    public C30510l(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f152286a = lVar;
        this.f152287b = lVar2;
        this.f152288c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30509k((Fragment) this.f152286a.f393949a, (Y41.l) this.f152287b.f393949a, this.f152288c.get());
    }
}
