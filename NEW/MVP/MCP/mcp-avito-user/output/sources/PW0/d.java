package Pw0;

import com.avito.android.C36135w2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f13374a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f13375b;

    public d(Provider<SK0.b> provider, Provider<C36135w2> provider2) {
        this.f13374a = provider;
        this.f13375b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f13374a.get(), this.f13375b.get());
    }
}
