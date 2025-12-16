package com.avito.android.publish.slots.contact_info;

import android.content.Context;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactInfoResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f243223a;

    public c(u uVar) {
        this.f243223a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f243223a.get());
    }
}
