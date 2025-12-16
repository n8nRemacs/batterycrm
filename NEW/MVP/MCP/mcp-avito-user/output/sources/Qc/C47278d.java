package qC;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteItemFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* renamed from: qC.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47278d implements h<C47277c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f429103a;

    public C47278d(Provider<SK0.b> provider) {
        this.f429103a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47277c(this.f429103a.get());
    }
}
