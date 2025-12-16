package com.avito.android.analytics.clickstream;

import com.avito.android.util.C35743a3;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.z;

/* compiled from: ClickStreamCommonSendingModule_ProvideClickStreamApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28393s implements dagger.internal.h<InterfaceC28377b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f89827a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f89828b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f89829c;

    public C28393s(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f89827a = provider;
        this.f89828b = provider2;
        this.f89829c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f89827a.get();
        h31.e eVarB = dagger.internal.g.b(this.f89828b);
        String str = (String) this.f89829c.get();
        int i12 = r.f89826a;
        if (!c12.l() && C35743a3.a()) {
            throw new IllegalStateException("Initializing Retrofit on the main thread.");
        }
        z.b bVar = new z.b();
        bVar.c(str);
        bVar.a(hu.akarnokd.rxjava3.retrofit.g.a());
        bVar.b(new retrofit2.converter.protobuf.a());
        bVar.f430133b = new C28392q(eVarB, 0);
        c12.getF125491k().getClass();
        InterfaceC28377b interfaceC28377b = (InterfaceC28377b) bVar.e().b(InterfaceC28377b.class);
        dagger.internal.t.d(interfaceC28377b);
        return interfaceC28377b;
    }
}
