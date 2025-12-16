package ym;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import com.avito.android.util.InterfaceC35950u;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import ym.InterfaceC50265a;
import zm.C50588b;
import zm.InterfaceC50587a;

/* compiled from: CaptchaLibModule_Providers_ProvideCaptchaStorageFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: ym.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50267c implements h<InterfaceC50587a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f443491a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f443492b;

    public C50267c(C30214v6 c30214v6, Provider provider) {
        this.f443491a = c30214v6;
        this.f443492b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f443491a.get();
        InterfaceC35950u interfaceC35950u = this.f443492b.get();
        InterfaceC50265a.C12916a.f443486a.getClass();
        return new C50588b(lVar, interfaceC35950u.l() ? TimeUnit.MINUTES.toMillis(3L) : TimeUnit.MINUTES.toMillis(1L));
    }
}
