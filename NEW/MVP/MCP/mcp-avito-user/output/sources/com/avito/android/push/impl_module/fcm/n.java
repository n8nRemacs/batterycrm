package com.avito.android.push.impl_module.fcm;

import android.content.Context;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.di.module.C30231x1;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40420d;
import hg0.InterfaceC40932a;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.B0;

/* compiled from: FcmPushTokenProviderModule_BindFcmPushTokenProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<Set<InterfaceC40420d>> {

    /* renamed from: a, reason: collision with root package name */
    public final m f245966a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f245967b;

    /* renamed from: c, reason: collision with root package name */
    public final C30231x1 f245968c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f245969d;

    /* renamed from: e, reason: collision with root package name */
    public final S f245970e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f245971f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC40932a> f245972g;

    /* renamed from: h, reason: collision with root package name */
    public final u f245973h;

    public n(m mVar, C30102l3 c30102l3, C30231x1 c30231x1, dagger.internal.f fVar, S s5, com.avito.android.push.impl_module.features.b bVar, Provider provider, u uVar) {
        this.f245966a = mVar;
        this.f245967b = c30102l3;
        this.f245968c = c30231x1;
        this.f245969d = fVar;
        this.f245970e = s5;
        this.f245971f = bVar;
        this.f245972g = provider;
        this.f245973h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f245967b.get();
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f245968c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f245969d.get();
        P p12 = (P) this.f245970e.get();
        this.f245971f.get();
        InterfaceC40932a interfaceC40932a = this.f245972g.get();
        e eVar = (e) this.f245973h.get();
        this.f245966a.getClass();
        b.f245946a.getClass();
        Set setSingleton = C36687f.f349287e.c(C36688g.f349288a, context) == 0 ? Collections.singleton(new i(firebaseMessaging, context, interfaceC28373a, p12, interfaceC40932a, eVar)) : B0.f406639b;
        t.d(setSingleton);
        return setSingleton;
    }
}
