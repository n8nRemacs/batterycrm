package com.avito.android.user_adverts.root_screen.adverts_host;

import Zd.InterfaceC19542a;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import javax.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C35564b implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312375b;

    public /* synthetic */ C35564b(UserAdvertsHostFragment userAdvertsHostFragment, int i12) {
        this.f312374a = i12;
        this.f312375b = userAdvertsHostFragment;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        UserAdvertsHostFragment userAdvertsHostFragment = this.f312375b;
        switch (this.f312374a) {
            case 0:
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                if (f12 != null) {
                    return f12;
                }
                return null;
            case 1:
                InterfaceC19542a interfaceC19542a = userAdvertsHostFragment.f312331t0;
                if (interfaceC19542a != null) {
                    return interfaceC19542a;
                }
                return null;
            case 2:
                UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
                return userAdvertsHostFragment.F5();
            case 3:
                com.avito.android.vas_planning.balance_lack.f fVar = userAdvertsHostFragment.f312332u0;
                if (fVar != null) {
                    return fVar;
                }
                return null;
            case 4:
                UserAdvertsHostFragment.a aVar2 = UserAdvertsHostFragment.f312290o1;
                return userAdvertsHostFragment.F5();
            default:
                com.avito.android.user_adverts_filters.host.d dVar = userAdvertsHostFragment.f312333v0;
                if (dVar != null) {
                    return dVar;
                }
                return null;
        }
    }
}
