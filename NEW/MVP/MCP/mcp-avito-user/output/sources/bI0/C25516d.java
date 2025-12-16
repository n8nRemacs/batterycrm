package bI0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lD.C43617a;

/* compiled from: PublishTransportUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: bI0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25516d implements h<C25515c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f57033a;

    /* renamed from: b, reason: collision with root package name */
    public final u f57034b;

    public C25516d(u uVar, u uVar2) {
        this.f57033a = uVar;
        this.f57034b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C25515c((SK0.b) this.f57033a.get(), (C43617a) this.f57034b.get());
    }
}
