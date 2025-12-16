package OG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SlotShowQrApi_Module_ProvideSlotShowQrApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f12119a;

    public c(f fVar) {
        this.f12119a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f12119a.get();
        b.f12118a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
