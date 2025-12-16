package com.avito.android.authorization.reset_password;

import android.content.res.Resources;
import com.avito.android.util.S3;

/* compiled from: ResetPasswordResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f94220a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f94221b;

    public z(dagger.internal.h hVar, S3 s32) {
        this.f94220a = hVar;
        this.f94221b = s32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new y((Resources) this.f94220a.get(), dagger.internal.g.b(this.f94221b));
    }
}
