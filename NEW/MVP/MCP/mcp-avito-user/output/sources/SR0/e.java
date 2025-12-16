package sr0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImagesWithLinksItemModule_ProvidesImagesWithLinksItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.serp.adapter.images_and_links_item.item.b f438893a;

    public e(com.avito.android.serp.adapter.images_and_links_item.item.b bVar) {
        this.f438893a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.serp.adapter.images_and_links_item.item.a aVar = (com.avito.android.serp.adapter.images_and_links_item.item.a) this.f438893a.get();
        int i12 = C48405c.f438891a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
