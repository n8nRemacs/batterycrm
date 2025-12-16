package xe0;

import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishBadgeStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: xe0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49932c implements h<C49931b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f442590a;

    public C49932c(u uVar) {
        this.f442590a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49931b((SharedPreferences) this.f442590a.get());
    }
}
