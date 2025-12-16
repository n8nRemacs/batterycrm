package PG0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.upload_doc.view.title.b f12935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.upload_doc.view.description.b f12936b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.upload_doc.view.sections.b f12937c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.upload_doc.view.checkbox.b f12938d;

    public e(com.avito.android.upload_doc.view.title.b bVar, com.avito.android.upload_doc.view.description.b bVar2, com.avito.android.upload_doc.view.sections.b bVar3, com.avito.android.upload_doc.view.checkbox.b bVar4) {
        this.f12935a = bVar;
        this.f12936b = bVar2;
        this.f12937c = bVar3;
        this.f12938d = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.upload_doc.view.title.a aVar = (com.avito.android.upload_doc.view.title.a) this.f12935a.get();
        com.avito.android.upload_doc.view.description.a aVar2 = (com.avito.android.upload_doc.view.description.a) this.f12936b.get();
        com.avito.android.upload_doc.view.sections.a aVar3 = (com.avito.android.upload_doc.view.sections.a) this.f12937c.get();
        com.avito.android.upload_doc.view.checkbox.a aVar4 = (com.avito.android.upload_doc.view.checkbox.a) this.f12938d.get();
        b.f12932a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar4);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
