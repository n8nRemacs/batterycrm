package com.avito.android.notification_center.list.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ErrorSnippetItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207615a;

    public g(u uVar) {
        this.f207615a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.jakewharton.rxrelay3.c) this.f207615a.get());
    }
}
