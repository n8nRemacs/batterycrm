package i90;

import com.avito.android.B2;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import k90.InterfaceC42540a;

/* compiled from: PriceListUxFeedbackDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f398404a;

    /* renamed from: b, reason: collision with root package name */
    public final u f398405b;

    /* renamed from: c, reason: collision with root package name */
    public final u f398406c;

    public e(u uVar, u uVar2, u uVar3) {
        this.f398404a = uVar;
        this.f398405b = uVar2;
        this.f398406c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC42540a) this.f398404a.get(), (SK0.b) this.f398405b.get(), (B2) this.f398406c.get());
    }
}
