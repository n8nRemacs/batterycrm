package Ha0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ActiveServiceBookingsModule_ProvideItemBinder$_avito_profile_implFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ha0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13941d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13939b f7278a;

    /* renamed from: b, reason: collision with root package name */
    public final A f7279b;

    public C13941d(C13939b c13939b, A a12) {
        this.f7278a = c13939b;
        this.f7279b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f7279b.get();
        this.f7278a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
