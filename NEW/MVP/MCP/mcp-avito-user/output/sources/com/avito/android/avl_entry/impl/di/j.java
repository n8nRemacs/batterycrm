package com.avito.android.avl_entry.impl.di;

import com.avito.android.avl_entry.impl.data.model.ShortVideosWitcherNetworkModelImpl;
import com.avito.android.remote.model.SerpElement;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShortVideosJsonModule_ProvideShortVideosSerpSubtypeFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<Class<? extends SerpElement>> {

    /* compiled from: ShortVideosJsonModule_ProvideShortVideosSerpSubtypeFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f98480a = new j();
    }

    public static j a() {
        return a.f98480a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i.f98479a.getClass();
        return ShortVideosWitcherNetworkModelImpl.class;
    }
}
