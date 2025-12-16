package com.avito.android.evidence_request.details.files.view;

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
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148474a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f148475b;

    public f(u uVar, Provider provider) {
        this.f148474a = uVar;
        this.f148475b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((s) this.f148474a.get(), this.f148475b.get());
    }
}
