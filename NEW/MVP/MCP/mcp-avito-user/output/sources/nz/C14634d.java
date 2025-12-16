package Nz;

import Jz.C14267d;
import Jz.InterfaceC14264a;
import Mz.C14548d;
import Mz.InterfaceC14545a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaWebViewDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Nz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14634d implements h<C14631a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f11889a;

    /* renamed from: b, reason: collision with root package name */
    public final C14548d f11890b;

    /* renamed from: c, reason: collision with root package name */
    public final C14267d f11891c;

    public C14634d(dv.b bVar, C14548d c14548d, C14267d c14267d) {
        this.f11889a = bVar;
        this.f11890b = c14548d;
        this.f11891c = c14267d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14631a((a.InterfaceC4053a) this.f11889a.get(), (InterfaceC14545a) this.f11890b.get(), (InterfaceC14264a) this.f11891c.get());
    }
}
