package com.avito.android.entry_point_client_room.report.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oz.InterfaceC44959a;

/* compiled from: SendReportActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f147706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44959a> f147707b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f147708c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f147709d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f147710e;

    public c(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2) {
        this.f147706a = provider;
        this.f147707b = provider2;
        this.f147708c = lVar;
        this.f147709d = lVar2;
        this.f147710e = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f147706a.get(), this.f147707b.get(), (String) this.f147708c.f393949a, (String) this.f147709d.f393949a, (Integer) this.f147710e.f393949a);
    }
}
