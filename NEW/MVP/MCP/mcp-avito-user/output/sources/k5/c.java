package K5;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AdvertHotelReviewModule_ProvideHotelBadgesItemBinder$_avito_advert_details_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f9265a;

    /* renamed from: b, reason: collision with root package name */
    public final A f9266b;

    public c(a aVar, A a12) {
        this.f9265a = aVar;
        this.f9266b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f9266b.get();
        this.f9265a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
