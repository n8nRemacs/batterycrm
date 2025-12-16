package yg;

import Lg.InterfaceC14392c;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvlDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: yg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50244b implements h<C50243a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f443438a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14392c> f443439b;

    /* renamed from: c, reason: collision with root package name */
    public final O f443440c;

    public C50244b(dv.b bVar, Provider provider, O o12) {
        this.f443438a = bVar;
        this.f443439b = provider;
        this.f443440c = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50243a((a.InterfaceC4053a) this.f443438a.get(), this.f443439b.get(), (L) this.f443440c.get());
    }
}
