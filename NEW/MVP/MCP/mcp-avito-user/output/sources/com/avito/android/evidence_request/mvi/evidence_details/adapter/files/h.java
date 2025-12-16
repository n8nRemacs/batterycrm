package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import com.avito.android.photo_list_view.s;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FilesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148785a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f148786b;

    public h(u uVar, Provider provider) {
        this.f148785a = uVar;
        this.f148786b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((s) this.f148785a.get(), this.f148786b.get());
    }
}
