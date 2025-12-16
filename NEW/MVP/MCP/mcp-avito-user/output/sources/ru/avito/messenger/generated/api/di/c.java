package ru.avito.messenger.generated.api.di;

import a91.InterfaceC19740u;
import b91.InterfaceC25479u;
import c91.InterfaceC26989u;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: MessengerJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes9.dex */
public final class c implements h<Set<r>> {

    /* compiled from: MessengerJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f430839a = new c();
    }

    public static c a() {
        return a.f430839a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ru.avito.messenger.generated.api.di.a.f430837a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC19740u.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC19740u.a.class, "item");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC19740u.b.class, ChannelContext.ReDeal.TYPE);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC19740u.c.class, ChannelContext.System.TYPE);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC19740u.d.class, ChannelContext.UserToUser.TYPE);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(InterfaceC25479u.class, InterfaceC25479u.a.class, "item", InterfaceC25479u.b.class, ChannelContext.ReDeal.TYPE);
        optimalRuntimeTypeAdapterFactoryK.b(InterfaceC25479u.c.class, ChannelContext.System.TYPE);
        optimalRuntimeTypeAdapterFactoryK.b(InterfaceC25479u.d.class, ChannelContext.UserToUser.TYPE);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(InterfaceC26989u.class, InterfaceC26989u.a.class, "item", InterfaceC26989u.b.class, ChannelContext.ReDeal.TYPE);
        optimalRuntimeTypeAdapterFactoryK2.b(InterfaceC26989u.c.class, ChannelContext.System.TYPE);
        optimalRuntimeTypeAdapterFactoryK2.b(InterfaceC26989u.d.class, ChannelContext.UserToUser.TYPE);
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2});
        t.d(setL0);
        return setL0;
    }
}
