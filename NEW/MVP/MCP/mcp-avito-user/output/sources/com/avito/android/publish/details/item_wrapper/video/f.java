package com.avito.android.publish.details.item_wrapper.video;

import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33774n1;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoItemWrapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234800a;

    /* renamed from: b, reason: collision with root package name */
    public final C33774n1 f234801b;

    public f(u uVar, C33774n1 c33774n1) {
        this.f234800a = uVar;
        this.f234801b = c33774n1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a) this.f234800a.get(), (C33771m1) this.f234801b.get());
    }
}
