package Ff0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoUploadFeedbackHelper_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f5950a;

    public c(u uVar) {
        this.f5950a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SK0.b) this.f5950a.get());
    }
}
