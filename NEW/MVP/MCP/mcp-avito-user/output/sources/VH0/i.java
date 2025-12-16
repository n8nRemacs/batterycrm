package VH0;

import AK0.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishCsatUxFeedbackStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17047a;

    public i(u uVar) {
        this.f17047a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((l) this.f17047a.get());
    }
}
