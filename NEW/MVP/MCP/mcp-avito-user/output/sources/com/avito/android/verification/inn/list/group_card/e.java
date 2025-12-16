package com.avito.android.verification.inn.list.group_card;

import com.avito.android.deep_linking.links.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupCardItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f324006a;

    public e(Provider<w> provider) {
        this.f324006a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f324006a.get());
    }
}
