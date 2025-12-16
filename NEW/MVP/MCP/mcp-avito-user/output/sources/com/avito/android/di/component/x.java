package com.avito.android.di.component;

import com.avito.android.di.component.K;
import com.avito.android.enabler.FetchRemoteTogglesTask;
import com.avito.android.util.R0;
import vx.InterfaceC49390a;

/* compiled from: DaggerRemoteTogglesFetcherComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class x {

    /* compiled from: DaggerRemoteTogglesFetcherComponent.java */
    public static final class b implements K.a {
        public b() {
        }

        @Override // com.avito.android.di.component.K.a
        public final K a(InterfaceC49390a interfaceC49390a) {
            return new c(interfaceC49390a, null);
        }
    }

    /* compiled from: DaggerRemoteTogglesFetcherComponent.java */
    public static final class c implements K {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC49390a f143754a;

        public c(InterfaceC49390a interfaceC49390a, a aVar) {
            this.f143754a = interfaceC49390a;
        }

        @Override // com.avito.android.di.component.K
        public final FetchRemoteTogglesTask a() {
            InterfaceC49390a interfaceC49390a = this.f143754a;
            com.avito.android.remote_toggles_fetcher.fetcher.c cVarIg = interfaceC49390a.ig();
            R0 r0C = interfaceC49390a.c();
            dagger.internal.t.c(r0C);
            return new FetchRemoteTogglesTask(cVarIg, r0C);
        }
    }

    public static K.a a() {
        return new b();
    }
}
