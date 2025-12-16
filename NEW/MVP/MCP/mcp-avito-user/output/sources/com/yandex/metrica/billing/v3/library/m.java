package com.yandex.metrica.billing.v3.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.impl.ob.C38714c;
import com.yandex.metrica.impl.ob.C38739d;
import com.yandex.metrica.impl.ob.C38864i;
import com.yandex.metrica.impl.ob.InterfaceC38888j;
import com.yandex.metrica.impl.ob.InterfaceC38913k;
import com.yandex.metrica.impl.ob.InterfaceC38938l;
import com.yandex.metrica.impl.ob.InterfaceC38963m;
import com.yandex.metrica.impl.ob.InterfaceC39013o;
import j.N;
import j.P;
import j.l0;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class m implements InterfaceC38913k, InterfaceC38888j {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Context f377575a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Executor f377576b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final Executor f377577c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final C38714c f377578d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final C38739d f377579e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final InterfaceC38963m f377580f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public C38864i f377581g;

    public class a extends T21.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C38864i f377582b;

        public a(C38864i c38864i) {
            this.f377582b = c38864i;
        }

        @Override // T21.c
        public final void a() {
            m mVar = m.this;
            BillingClient billingClientBuild = BillingClient.newBuilder(mVar.f377575a).setListener(new h()).enablePendingPurchases().build();
            billingClientBuild.startConnection(new c(this.f377582b, mVar.f377576b, mVar.f377577c, billingClientBuild, mVar, new l(billingClientBuild)));
        }
    }

    public m(@N Context context, @N Executor executor, @N Executor executor2, @N C38714c c38714c, @N C38739d c38739d, @N InterfaceC38963m interfaceC38963m) {
        this.f377575a = context;
        this.f377576b = executor;
        this.f377577c = executor2;
        this.f377578d = c38714c;
        this.f377579e = c38739d;
        this.f377580f = interfaceC38963m;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @N
    public final Executor c() {
        return this.f377577c;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @N
    public final InterfaceC38938l e() {
        return this.f377578d;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @N
    public final InterfaceC39013o f() {
        return this.f377579e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38913k
    public final synchronized void a(@P C38864i c38864i) {
        this.f377581g = c38864i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38913k
    @l0
    public final void b() {
        C38864i c38864i = this.f377581g;
        if (c38864i != null) {
            this.f377577c.execute(new a(c38864i));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @N
    public final InterfaceC38963m d() {
        return this.f377580f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @N
    public final Executor a() {
        return this.f377576b;
    }
}
