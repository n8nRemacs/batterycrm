package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium;

import RI0.a;
import RI0.b;
import Y61.k;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: ServiceFreemiumViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/a;", "Landroidx/lifecycle/M0;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final E f313833E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b f313834J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final R0 f313835K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public V0 f313836L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final Z1<RI0.b> f313837M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final InterfaceC43160i<G0> f313838N;

    @Inject
    public d(@k E e12, @k com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b bVar, @k R0 r02) {
        this.f313833E = e12;
        this.f313834J = bVar;
        this.f313835K = r02;
        P0 p0A = Q0.a();
        p0A.q3();
        this.f313836L = p0A;
        this.f313837M = p2.a(b.a.f14303a);
        this.f313838N = C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        RI0.a aVar = (RI0.a) obj;
        boolean z12 = aVar instanceof a.C0950a;
        Z1<RI0.b> z13 = this.f313837M;
        if (z12) {
            this.f313836L.c(null);
            while (!z13.N3(z13.getValue(), b.a.f14303a)) {
            }
        } else if (aVar instanceof a.b) {
            this.f313836L.c(null);
            while (!z13.N3(z13.getValue(), b.a.f14303a)) {
            }
            C43259k.d(N0.a(this), null, null, new b(this, null), 3);
        } else {
            if (!(aVar instanceof a.c) || (z13.getValue() instanceof b.C0951b)) {
                return;
            }
            this.f313836L.c(null);
            this.f313836L = (V0) C43259k.d(N0.a(this), this.f313835K.c(), null, new c(this, null), 2);
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<G0> getEvents() {
        return this.f313838N;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f313837M;
    }
}
