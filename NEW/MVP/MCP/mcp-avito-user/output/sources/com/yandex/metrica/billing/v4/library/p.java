package com.yandex.metrica.billing.v4.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.impl.ob.C38789f;
import com.yandex.metrica.impl.ob.C38839h;
import com.yandex.metrica.impl.ob.C38864i;
import com.yandex.metrica.impl.ob.InterfaceC38888j;
import com.yandex.metrica.impl.ob.InterfaceC38913k;
import com.yandex.metrica.impl.ob.InterfaceC38938l;
import com.yandex.metrica.impl.ob.InterfaceC38963m;
import com.yandex.metrica.impl.ob.InterfaceC39013o;
import j.l0;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class p implements InterfaceC38913k, InterfaceC38888j {

    /* renamed from: a, reason: collision with root package name */
    public C38864i f377597a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f377598b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f377599c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f377600d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC38963m f377601e;

    /* renamed from: f, reason: collision with root package name */
    public final C38789f f377602f;

    /* renamed from: g, reason: collision with root package name */
    public final C38839h f377603g;

    public static final class a extends T21.c {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C38864i f377605c;

        public a(C38864i c38864i) {
            this.f377605c = c38864i;
        }

        @Override // T21.c
        public final void a() {
            p pVar = p.this;
            BillingClient billingClientBuild = BillingClient.newBuilder(pVar.f377598b).setListener(new j()).enablePendingPurchases().build();
            billingClientBuild.startConnection(new c(this.f377605c, billingClientBuild, pVar));
        }
    }

    public p(@Y61.k Context context, @Y61.k Executor executor, @Y61.k Executor executor2, @Y61.k InterfaceC38963m interfaceC38963m, @Y61.k C38789f c38789f, @Y61.k C38839h c38839h) {
        this.f377598b = context;
        this.f377599c = executor;
        this.f377600d = executor2;
        this.f377601e = interfaceC38963m;
        this.f377602f = c38789f;
        this.f377603g = c38839h;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38913k
    @l0
    public final void b() {
        C38864i c38864i = this.f377597a;
        if (c38864i != null) {
            this.f377600d.execute(new a(c38864i));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @Y61.k
    public final Executor c() {
        return this.f377600d;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @Y61.k
    public final InterfaceC38963m d() {
        return this.f377601e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @Y61.k
    public final InterfaceC38938l e() {
        return this.f377602f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @Y61.k
    public final InterfaceC39013o f() {
        return this.f377603g;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38913k
    public final synchronized void a(@Y61.l C38864i c38864i) {
        this.f377597a = c38864i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38888j
    @Y61.k
    public final Executor a() {
        return this.f377599c;
    }
}
