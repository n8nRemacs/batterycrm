package com.avito.android.extended_profile_personal_link_edit.mvi;

import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalLinkEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_personal_link_edit.i> f151512a;

    /* renamed from: b, reason: collision with root package name */
    public final l f151513b;

    public b(l lVar, Provider provider) {
        this.f151512a = provider;
        this.f151513b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f151512a.get(), (PersonalLinkEditConfig) this.f151513b.f393949a);
    }
}
