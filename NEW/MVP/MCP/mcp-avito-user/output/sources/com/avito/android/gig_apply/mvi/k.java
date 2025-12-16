package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigApplyOpenParams;

/* compiled from: GigApplyReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159739a;

    public k(dagger.internal.l lVar) {
        this.f159739a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((GigApplyOpenParams) this.f159739a.f393949a);
    }
}
