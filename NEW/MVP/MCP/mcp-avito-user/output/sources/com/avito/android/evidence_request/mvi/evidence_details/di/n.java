package com.avito.android.evidence_request.mvi.evidence_details.di;

import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.b0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideImageListUploadingInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<s.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b0> f148952a;

    public n(Provider<b0> provider) {
        this.f148952a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = this.f148952a.get();
        d.f148929a.getClass();
        return new e(b0Var);
    }
}
