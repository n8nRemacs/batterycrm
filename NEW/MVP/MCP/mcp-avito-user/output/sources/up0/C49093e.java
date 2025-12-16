package up0;

import com.google.gson.Gson;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipV2MapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: up0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49093e implements h<C49092d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f440298a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f440299b;

    public C49093e(l lVar, Provider provider) {
        this.f440298a = lVar;
        this.f440299b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49092d((String) this.f440298a.f393949a, this.f440299b.get());
    }
}
