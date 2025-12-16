package com.avito.android.evidence_request.mvi.data.evidence_request;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f148648a;

    public c(l lVar) {
        this.f148648a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Resources) this.f148648a.f393949a);
    }
}
