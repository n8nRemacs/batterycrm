package Wz;

import com.avito.android.account.G;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceRequestInfoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Wz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15813c implements h<C15812b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f18092a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f18093b;

    public C15813c(u uVar, Provider provider) {
        this.f18092a = uVar;
        this.f18093b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15812b((com.avito.android.evidence_request.mvi.data.evidence_request.a) this.f18092a.get(), this.f18093b.get());
    }
}
