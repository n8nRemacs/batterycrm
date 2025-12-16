package com.avito.android.component.toast.util;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompositeToastBarModule_ProvideCompositeToastBarPresenterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<c> {

    /* compiled from: CompositeToastBarModule_ProvideCompositeToastBarPresenterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f125270a = new b();
    }

    public static b a() {
        return a.f125270a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = com.avito.android.component.toast.util.a.f125269a;
        return new d();
    }
}
