package com.avito.android.entry_point_client_room.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rz.InterfaceC47943a;

/* compiled from: SendReportDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final rz.c f147642a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f147643b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f147644c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f147645d;

    public b(rz.c cVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f147642a = cVar;
        this.f147643b = bVar;
        this.f147644c = bVar2;
        this.f147645d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC47943a) this.f147642a.get(), (a.InterfaceC4053a) this.f147643b.get(), (a.b) this.f147644c.get(), this.f147645d.get());
    }
}
