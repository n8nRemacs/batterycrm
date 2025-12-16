package ng;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.UUID;
import qg.C47395a;

/* compiled from: AvitoFinanceSessionModule_ProvideAvitoFinanceSessionIdFactory.java */
@e
@y
@x
/* renamed from: ng.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44419b implements h<C47395a> {

    /* renamed from: a, reason: collision with root package name */
    public final C44418a f419121a;

    public C44419b(C44418a c44418a) {
        this.f419121a = c44418a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f419121a.getClass();
        return new C47395a(UUID.randomUUID().toString());
    }
}
