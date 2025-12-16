package com.avito.android.extended_profile_personal_link_edit.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalLinkEditBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151519a;

    public d(l lVar) {
        this.f151519a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(((Boolean) this.f151519a.f393949a).booleanValue());
    }
}
