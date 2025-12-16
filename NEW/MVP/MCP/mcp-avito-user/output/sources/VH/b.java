package Vh;

import com.avito.android.beduin.common.storage.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StoredParametersExtractionStrategy_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C15678a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f17359a;

    public b(Provider<d> provider) {
        this.f17359a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15678a(this.f17359a.get());
    }
}
