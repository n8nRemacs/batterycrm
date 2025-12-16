package com.avito.android.evidence_request.details.di;

import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.b0;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideImageListUploadingInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<s.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b0> f148265a;

    public B(Provider<b0> provider) {
        this.f148265a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = this.f148265a.get();
        w.f148426a.getClass();
        return new x(b0Var);
    }
}
