package LF0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.time.Clock;

/* compiled from: TrxPromoGoodsConfigureMapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9886a;

    public c(u uVar) {
        this.f9886a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Clock) this.f9886a.get());
    }
}
