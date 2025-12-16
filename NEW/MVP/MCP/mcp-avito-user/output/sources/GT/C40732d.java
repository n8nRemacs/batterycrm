package gt;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CrmPaidCvsIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: gt.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40732d implements h<C40730b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f396896a;

    public C40732d(l lVar) {
        this.f396896a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40730b((Application) this.f396896a.f393949a);
    }
}
