package zg;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvlElementConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: zg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50562c implements dagger.internal.h<C50561b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f444132a;

    public C50562c(dagger.internal.f fVar) {
        this.f444132a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50561b((com.avito.android.deep_linking.x) this.f444132a.get());
    }
}
