package GM;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.image_perception.data.d;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zM.InterfaceC50484a;

/* compiled from: ImagePerceptionModule_ProvideImagePerceptionRepositoryFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f6468a;

    /* renamed from: b, reason: collision with root package name */
    public final u f6469b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f6470c;

    public c(C30102l3 c30102l3, u uVar, Provider provider) {
        this.f6468a = c30102l3;
        this.f6469b = uVar;
        this.f6470c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f6468a.get();
        InterfaceC50484a interfaceC50484a = (InterfaceC50484a) this.f6469b.get();
        R0 r02 = this.f6470c.get();
        a.f6467a.getClass();
        return new d(context, interfaceC50484a, r02);
    }
}
