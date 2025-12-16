package PG0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocItemsModule_ProvideDocumentItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.upload_doc.view.document.b f12934a;

    public d(com.avito.android.upload_doc.view.document.b bVar) {
        this.f12934a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.upload_doc.view.document.a aVar = (com.avito.android.upload_doc.view.document.a) this.f12934a.get();
        b.f12932a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
