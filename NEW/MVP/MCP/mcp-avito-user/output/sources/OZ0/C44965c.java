package oz0;

import com.avito.android.J0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersBuyerViewStateBuilderImpl_Factory.java */
@e
@y
@x
/* renamed from: oz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44965c implements h<C44964b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f422384a;

    public C44965c(Provider<J0> provider) {
        this.f422384a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44964b(this.f422384a.get());
    }
}
