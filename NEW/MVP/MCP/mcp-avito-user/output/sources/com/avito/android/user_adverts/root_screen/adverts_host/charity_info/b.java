package com.avito.android.user_adverts.root_screen.adverts_host.charity_info;

import Y61.k;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
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
import xI0.InterfaceC49844a;
import xI0.InterfaceC49845b;

/* compiled from: CharityViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/charity_info/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/charity_info/a;", "Landroidx/lifecycle/M0;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends M0 implements com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.charity.a f312531E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final R0 f312532J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final E f312533K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public V0 f312534L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final Z1<InterfaceC49845b> f312535M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final InterfaceC43160i<G0> f312536N;

    /* compiled from: CharityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/charity_info/b$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f312537a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f312538b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f312537a = str;
            this.f312538b = deepLink;
        }
    }

    @Inject
    public b(@k com.avito.android.charity.a aVar, @k R0 r02, @k E e12) {
        this.f312531E = aVar;
        this.f312532J = r02;
        this.f312533K = e12;
        P0 p0A = Q0.a();
        p0A.q3();
        this.f312534L = p0A;
        this.f312535M = p2.a(InterfaceC49845b.a.f442331a);
        this.f312536N = C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        InterfaceC49844a interfaceC49844a = (InterfaceC49844a) obj;
        boolean z12 = interfaceC49844a instanceof InterfaceC49844a.C12857a;
        Z1<InterfaceC49845b> z13 = this.f312535M;
        if (z12) {
            this.f312534L.c(null);
            while (!z13.N3(z13.getValue(), InterfaceC49845b.a.f442331a)) {
            }
        } else if (interfaceC49844a instanceof InterfaceC49844a.b) {
            InterfaceC49844a.b bVar = (InterfaceC49844a.b) interfaceC49844a;
            InterfaceC49845b value = z13.getValue();
            InterfaceC49845b.C12858b c12858b = value instanceof InterfaceC49845b.C12858b ? (InterfaceC49845b.C12858b) value : null;
            if (L.f(c12858b != null ? c12858b.f442333b : null, bVar.f442330a)) {
                return;
            }
            this.f312534L.c(null);
            this.f312534L = (V0) C43259k.d(N0.a(this), null, null, new d(this, bVar, null), 3);
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<G0> getEvents() {
        return this.f312536N;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f312535M;
    }
}
