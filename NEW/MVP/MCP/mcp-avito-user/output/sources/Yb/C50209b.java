package yb;

import Cb.InterfaceC13237a;
import Cb.d;
import com.avito.android.advertising.p;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OpenCreativeTargetingLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50209b implements h<C50208a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f443205a;

    /* renamed from: b, reason: collision with root package name */
    public final d f443206b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f443207c;

    public C50209b(dv.b bVar, d dVar, Provider provider) {
        this.f443205a = bVar;
        this.f443206b = dVar;
        this.f443207c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50208a((a.InterfaceC4053a) this.f443205a.get(), (InterfaceC13237a) this.f443206b.get(), this.f443207c.get());
    }
}
