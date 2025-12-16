package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPreviewSearchReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f97665a;

    public m(dagger.internal.l lVar) {
        this.f97665a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((AutotekaPreviewSearchDetails) this.f97665a.f393949a);
    }
}
