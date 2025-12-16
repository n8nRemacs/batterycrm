package yA;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.extended_profile_map.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileMapLinkSyncHandler_Factory.java */
@e
@y
@x
/* renamed from: yA.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50092c implements h<C50091b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f442961a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f442962b;

    /* renamed from: c, reason: collision with root package name */
    public final d f442963c;

    public C50092c(C30102l3 c30102l3, dv.b bVar, d dVar) {
        this.f442961a = c30102l3;
        this.f442962b = bVar;
        this.f442963c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f442961a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f442962b.get();
        this.f442963c.getClass();
        return new C50091b(context, interfaceC4053a, new com.avito.android.extended_profile_map.c());
    }
}
