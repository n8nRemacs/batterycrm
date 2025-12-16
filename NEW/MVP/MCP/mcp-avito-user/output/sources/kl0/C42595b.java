package kL0;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_discount.i;
import com.avito.android.vas_discount.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountDeepLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: kL0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42595b implements h<C42594a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f406242a;

    /* renamed from: b, reason: collision with root package name */
    public final k f406243b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f406244c;

    /* renamed from: d, reason: collision with root package name */
    public final C24193b f406245d;

    public C42595b(dv.b bVar, k kVar, dv.b bVar2, C24193b c24193b) {
        this.f406242a = bVar;
        this.f406243b = kVar;
        this.f406244c = bVar2;
        this.f406245d = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42594a((a.InterfaceC4053a) this.f406242a.get(), (i) this.f406243b.get(), (a.d) this.f406244c.get(), (C19616a) this.f406245d.get());
    }
}
