package com.avito.android.floating_views;

import android.os.Bundle;
import dagger.internal.x;
import dagger.internal.y;
import java.io.Serializable;

/* compiled from: FloatingViewsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f158461a;

    public d(dagger.internal.l lVar) {
        this.f158461a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f158461a.f393949a;
        b bVar = new b();
        bVar.f158458d = VisibilityState.f158451c;
        bVar.f158460f = -8;
        Serializable serializable = bundle != null ? bundle.getSerializable("subscriber_visibility") : null;
        VisibilityState visibilityState = serializable instanceof VisibilityState ? (VisibilityState) serializable : null;
        if (visibilityState != null) {
            bVar.f158458d = visibilityState;
        }
        return bVar;
    }
}
