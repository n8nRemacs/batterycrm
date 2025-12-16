package com.avito.android.messenger.map.viewing.di;

import android.content.res.Resources;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.messenger.map.viewing.A;
import com.avito.android.messenger.map.viewing.di.a;
import com.avito.android.messenger.map.viewing.t;
import com.avito.android.messenger.map.viewing.w;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlatformMapFragmentModule_ProvidePlatformMapPresenterViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<M0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196837a;

    /* renamed from: b, reason: collision with root package name */
    public final w f196838b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f196839c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f196840d;

    /* renamed from: e, reason: collision with root package name */
    public final l f196841e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f196842f;

    public j(Provider provider, w wVar, Provider provider2, Provider provider3, l lVar, Provider provider4) {
        this.f196837a = provider;
        this.f196838b = wVar;
        this.f196839c = provider2;
        this.f196840d = provider3;
        this.f196841e = lVar;
        this.f196842f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.e) this.f196837a).get();
        t tVar = (t) this.f196838b.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) ((a.c.C5791a) this.f196839c).get();
        InterfaceC35741a1 interfaceC35741a1 = (InterfaceC35741a1) ((a.c.C5792c) this.f196840d).get();
        Resources resources = (Resources) this.f196841e.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.b) this.f196842f).get();
        d.f196836a.getClass();
        return new A(tVar, resources.getDimensionPixelSize(R.dimen.messenger_platform_map_lat_lng_bounds_padding), aVar, interfaceC35741a1, interfaceC35745a5, aVar2, new F(interfaceC35745a5.a(), null, 2, null));
    }
}
