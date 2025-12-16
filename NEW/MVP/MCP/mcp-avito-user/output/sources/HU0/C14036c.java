package Hu0;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceOrdersIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Hu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14036c implements h<C14035b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f7808a;

    public C14036c(O o12) {
        this.f7808a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14035b((L) this.f7808a.get());
    }
}
