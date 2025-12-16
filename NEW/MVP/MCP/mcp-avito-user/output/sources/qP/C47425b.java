package qp;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoDataSource_Factory.java */
@e
@y
@x
/* renamed from: qp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47425b implements h<C47424a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429365a;

    public C47425b(u uVar) {
        this.f429365a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47424a((Context) this.f429365a.get());
    }
}
