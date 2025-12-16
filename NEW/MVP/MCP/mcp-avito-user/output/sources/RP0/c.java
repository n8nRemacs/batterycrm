package Rp0;

import com.avito.android.C34160q2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<com.avito.android.search_ux_feedback.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f14656a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14657b;

    public c(u uVar, u uVar2) {
        this.f14656a = uVar;
        this.f14657b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.search_ux_feedback.a((SK0.b) this.f14656a.get(), (C34160q2) this.f14657b.get());
    }
}
