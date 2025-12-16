package com.avito.android.auto_evidence_request.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEvidenceRequestModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auto_evidence_request.items.upload_file_form_item.b f95062a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.auto_evidence_request.items.attributed_text_item.c f95063b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.auto_evidence_request.items.spacer_item.c f95064c;

    public h(com.avito.android.auto_evidence_request.items.upload_file_form_item.b bVar, com.avito.android.auto_evidence_request.items.attributed_text_item.c cVar, com.avito.android.auto_evidence_request.items.spacer_item.c cVar2) {
        this.f95062a = bVar;
        this.f95063b = cVar;
        this.f95064c = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.auto_evidence_request.items.upload_file_form_item.a aVar = (com.avito.android.auto_evidence_request.items.upload_file_form_item.a) this.f95062a.get();
        com.avito.android.auto_evidence_request.items.attributed_text_item.b bVar = (com.avito.android.auto_evidence_request.items.attributed_text_item.b) this.f95063b.get();
        com.avito.android.auto_evidence_request.items.spacer_item.b bVar2 = (com.avito.android.auto_evidence_request.items.spacer_item.b) this.f95064c.get();
        f.f95060a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
