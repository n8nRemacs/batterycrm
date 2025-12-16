package com.avito.android.stories;

import com.avito.android.stories.D;

/* compiled from: StoriesViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class F implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final E f284979a;

    public F(E e12) {
        this.f284979a = e12;
    }

    @Override // com.avito.android.stories.D.a
    public final D create() {
        return new D((com.avito.android.stories.mvi.j) this.f284979a.f284978a.get(), null, 2, null);
    }
}
