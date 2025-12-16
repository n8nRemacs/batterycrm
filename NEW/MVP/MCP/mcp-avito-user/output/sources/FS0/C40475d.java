package fs0;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigPageUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: fs0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40475d implements h<C40474c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f396167a;

    public C40475d(Provider<SK0.b> provider) {
        this.f396167a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40474c(this.f396167a.get());
    }
}
