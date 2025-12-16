package vm;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CampaignsSaleStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: vm.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49352g implements dagger.internal.h<C49349d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f440943a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f440944b;

    public C49352g(C30214v6 c30214v6, Provider provider) {
        this.f440943a = c30214v6;
        this.f440944b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49349d((l) this.f440943a.get(), this.f440944b.get());
    }
}
