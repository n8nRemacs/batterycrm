package kk;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import ok.InterfaceC44786a;

/* compiled from: BrandspaceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: kk.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42704d implements dagger.internal.h<C42701a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f406570a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.d f406571b;

    public C42704d(dv.b bVar, ok.d dVar) {
        this.f406570a = bVar;
        this.f406571b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42701a((a.InterfaceC4053a) this.f406570a.get(), (InterfaceC44786a) this.f406571b.get());
    }
}
