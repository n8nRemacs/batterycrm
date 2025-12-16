package com.avito.android.advert.icebreakerseditor.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IcebreakersEditorReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f71264a;

    public k(l lVar) {
        this.f71264a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(((Integer) this.f71264a.f393949a).intValue());
    }
}
