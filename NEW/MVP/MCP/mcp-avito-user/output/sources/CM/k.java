package cM;

import com.avito.android.permissions.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProblemMicAccessCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final w f57826a;

    public k(w wVar) {
        this.f57826a = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.permissions.u) this.f57826a.get());
    }
}
