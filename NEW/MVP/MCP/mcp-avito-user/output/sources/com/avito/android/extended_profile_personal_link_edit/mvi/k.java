package com.avito.android.extended_profile_personal_link_edit.mvi;

import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalLinkEditReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151549a;

    public k(l lVar) {
        this.f151549a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((PersonalLinkEditConfig) this.f151549a.f393949a);
    }
}
