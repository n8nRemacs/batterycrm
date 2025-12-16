package com.avito.android.bxcontent.analytics;

import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.GroupingAdvertsScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupingAdvertsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f109503a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f109504b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f109503a = lVar;
        this.f109504b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC22983P interfaceC22983P = (InterfaceC22983P) this.f109503a.f393949a;
        InterfaceC28481c interfaceC28481c = this.f109504b.get();
        o oVar = new o();
        m mVar = new m();
        GroupingAdvertsScreen groupingAdvertsScreen = GroupingAdvertsScreen.f90368d;
        com.avito.android.analytics.screens.r.f90693e.getClass();
        ((com.avito.android.analytics.screens.q) interfaceC28481c.b(groupingAdvertsScreen, r.a.a()).a()).b(mVar).a(interfaceC22983P);
        return oVar;
    }
}
