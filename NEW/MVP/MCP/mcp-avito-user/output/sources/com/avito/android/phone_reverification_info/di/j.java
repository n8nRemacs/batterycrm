package com.avito.android.phone_reverification_info.di;

import android.content.res.Resources;
import androidx.appcompat.app.m;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneReverificationModule_ProvideActivityResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final l f216097a;

    public j(l lVar) {
        this.f216097a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f216097a.f393949a;
        h.f216096a.getClass();
        return mVar.getResources();
    }
}
