package ym;

import com.avito.android.D;
import com.avito.android.F;
import com.avito.android.captcha.w;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import id.C41383a;
import javax.inject.Provider;
import ym.InterfaceC50265a;

/* compiled from: CaptchaLibModule_Providers_CaptchaProviderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: ym.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50266b implements h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C41383a> f443487a;

    /* renamed from: b, reason: collision with root package name */
    public final F f443488b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f443489c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f443490d;

    public C50266b(F f12, Provider provider, Provider provider2, Provider provider3) {
        this.f443487a = provider;
        this.f443488b = f12;
        this.f443489c = provider2;
        this.f443490d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C41383a c41383a = this.f443487a.get();
        D d12 = (D) this.f443488b.get();
        InterfaceC35950u interfaceC35950u = this.f443489c.get();
        R0 r02 = this.f443490d.get();
        InterfaceC50265a.C12916a.f443486a.getClass();
        return new com.avito.android.captcha.x(d12, interfaceC35950u, r02, c41383a);
    }
}
