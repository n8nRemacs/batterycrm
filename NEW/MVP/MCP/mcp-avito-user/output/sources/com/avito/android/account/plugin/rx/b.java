package com.avito.android.account.plugin.rx;

import A3.a;
import Y61.k;
import Y61.l;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AuthorizationPluginRx.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/account/plugin/rx/b;", "LA3/b;", "Lcom/avito/android/account/plugin/rx/a;", "<init>", "()V", "_avito_authorization-plugin-rx_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements A3.b, a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f68171a = new com.jakewharton.rxrelay3.c();

    @Inject
    public b() {
    }

    @Override // com.avito.android.account.plugin.rx.a
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF68171a() {
        return this.f68171a;
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
        this.f68171a.accept(c0004a);
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
        this.f68171a.accept(cVar);
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
        this.f68171a.accept(bVar);
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
        this.f68171a.accept(bVar);
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
        this.f68171a.accept(dVar);
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @k String str) {
    }
}
