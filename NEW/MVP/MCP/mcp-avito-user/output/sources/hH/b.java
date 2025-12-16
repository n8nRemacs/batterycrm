package HH;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QrScanParser_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f7024a;

    public b(f fVar) {
        this.f7024a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deep_linking.x) this.f7024a.get());
    }
}
