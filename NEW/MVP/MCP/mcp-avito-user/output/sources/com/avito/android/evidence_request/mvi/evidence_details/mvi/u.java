package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f149101a;

    public u(Provider<InterfaceC35741a1> provider) {
        this.f149101a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f149101a.get());
    }
}
