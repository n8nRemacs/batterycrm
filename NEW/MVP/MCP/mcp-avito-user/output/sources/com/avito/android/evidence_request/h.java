package com.avito.android.evidence_request;

import android.content.Context;
import com.avito.android.C30829i0;
import com.avito.android.C31094k0;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f148625a;

    /* renamed from: b, reason: collision with root package name */
    public final C31094k0 f148626b;

    public h(C30102l3 c30102l3, C31094k0 c31094k0) {
        this.f148625a = c30102l3;
        this.f148626b = c31094k0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f148625a.get(), (C30829i0) this.f148626b.get());
    }
}
