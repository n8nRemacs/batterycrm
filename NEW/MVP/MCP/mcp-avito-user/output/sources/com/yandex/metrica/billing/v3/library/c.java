package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.yandex.metrica.impl.ob.C38864i;
import com.yandex.metrica.impl.ob.InterfaceC38888j;
import j.N;
import j.k0;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
class c implements BillingClientStateListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f377562f = 0;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Executor f377563a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Executor f377564b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final BillingClient f377565c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final InterfaceC38888j f377566d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final l f377567e;

    @k0
    public c(@N C38864i c38864i, @N Executor executor, @N Executor executor2, @N BillingClient billingClient, @N InterfaceC38888j interfaceC38888j, @N l lVar) {
        this.f377563a = executor;
        this.f377564b = executor2;
        this.f377565c = billingClient;
        this.f377566d = interfaceC38888j;
        this.f377567e = lVar;
    }
}
