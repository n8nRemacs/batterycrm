package com.avito.android.upload_doc.view.document;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocDocumentPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f307033a;

    /* renamed from: b, reason: collision with root package name */
    public final l f307034b;

    /* renamed from: c, reason: collision with root package name */
    public final l f307035c;

    public h(l lVar, l lVar2, l lVar3) {
        this.f307033a = lVar;
        this.f307034b = lVar2;
        this.f307035c = lVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f307033a.f393949a, (Y41.l) this.f307034b.f393949a, (Y41.l) this.f307035c.f393949a);
    }
}
