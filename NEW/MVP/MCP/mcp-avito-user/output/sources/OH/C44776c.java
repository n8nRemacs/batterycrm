package oh;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblApi_Module_ProvideBblApiFactory.java */
@e
@y
@x
/* renamed from: oh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44776c implements h<InterfaceC44774a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f419992a;

    public C44776c(f fVar) {
        this.f419992a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419992a.get();
        C44775b.f419991a.getClass();
        InterfaceC44774a interfaceC44774a = (InterfaceC44774a) r02.create(InterfaceC44774a.class);
        t.d(interfaceC44774a);
        return interfaceC44774a;
    }
}
