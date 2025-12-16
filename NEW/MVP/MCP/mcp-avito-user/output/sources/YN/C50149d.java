package yN;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import wN.InterfaceC49541a;

/* compiled from: InfoPageLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: yN.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50149d implements h<C50148c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f443083a;

    /* renamed from: b, reason: collision with root package name */
    public final wN.c f443084b;

    public C50149d(dv.b bVar, wN.c cVar) {
        this.f443083a = bVar;
        this.f443084b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50148c((a.InterfaceC4053a) this.f443083a.get(), (InterfaceC49541a) this.f443084b.get());
    }
}
