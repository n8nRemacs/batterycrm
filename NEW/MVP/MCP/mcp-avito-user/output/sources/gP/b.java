package Gp;

import com.avito.android.H0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallLinkBuilderUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C13905a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f6745a;

    public b(Provider<H0> provider) {
        this.f6745a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13905a(this.f6745a.get());
    }
}
