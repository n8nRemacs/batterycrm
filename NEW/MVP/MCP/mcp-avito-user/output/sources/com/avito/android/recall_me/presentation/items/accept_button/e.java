package com.avito.android.recall_me.presentation.items.accept_button;

import com.avito.android.recall_me.di.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeAcceptButtonPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final k f251940a;

    public e(k kVar) {
        this.f251940a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.jakewharton.rxrelay3.c) this.f251940a.get());
    }
}
