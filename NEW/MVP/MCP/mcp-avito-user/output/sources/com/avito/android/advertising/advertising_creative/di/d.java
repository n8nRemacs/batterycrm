package com.avito.android.advertising.advertising_creative.di;

import com.avito.android.remote.model.advertising.AvitoNetworkBannerRawResponse;
import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: JsonModule_ProvideTypedResultEntriesFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class d implements h<Set<C35873q0>> {

    /* compiled from: JsonModule_ProvideTypedResultEntriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f87761a = new d();
    }

    public static d a() {
        return a.f87761a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = b.f87759a;
        return Collections.singleton(new C35873q0(AvitoNetworkBannerRawResponse.class, P0.g(new Q("success", AvitoNetworkBannerRawResponse.Success.class), new Q("no-content", AvitoNetworkBannerRawResponse.NoContent.class))));
    }
}
