package com.avito.android.beduin.common.component.file_uploader;

import android.content.res.Resources;
import dagger.internal.y;

/* compiled from: BeduinFileUploaderPreparer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.context.di.e f101290a;

    public i(com.avito.android.beduin.context.di.e eVar) {
        this.f101290a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Resources) this.f101290a.get());
    }
}
