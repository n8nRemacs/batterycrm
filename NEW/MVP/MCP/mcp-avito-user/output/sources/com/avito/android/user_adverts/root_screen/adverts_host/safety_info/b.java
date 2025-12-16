package com.avito.android.user_adverts.root_screen.adverts_host.safety_info;

import PI0.a;
import PI0.b;
import Y61.k;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DetailsSheetLink;
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

/* compiled from: SafetyInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/safety_info/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/safety_info/a;", "Landroidx/lifecycle/M0;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends M0 implements com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.user_adverts_common.safety.b f313807E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC28373a f313808J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final E f313809K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final R0 f313810L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public V0 f313811M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final Z1<PI0.b> f313812N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final InterfaceC43160i<G0> f313813O;

    /* compiled from: SafetyInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/safety_info/b$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f313814a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DetailsSheetLink f313815b;

        public a(@k DetailsSheetLink detailsSheetLink, @k String str) {
            this.f313814a = str;
            this.f313815b = detailsSheetLink;
        }
    }

    @Inject
    public b(@k com.avito.android.user_adverts_common.safety.b bVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k R0 r02) {
        this.f313807E = bVar;
        this.f313808J = interfaceC28373a;
        this.f313809K = e12;
        this.f313810L = r02;
        P0 p0A = Q0.a();
        p0A.q3();
        this.f313811M = p0A;
        this.f313812N = p2.a(b.a.f12955a);
        this.f313813O = C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        PI0.a aVar = (PI0.a) obj;
        boolean z12 = aVar instanceof a.C0839a;
        R0 r02 = this.f313810L;
        if (z12) {
            this.f313811M.c(null);
            C43259k.d(N0.a(this), r02.c(), null, new c(this, null), 2);
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            PI0.b value = this.f313812N.getValue();
            b.C0840b c0840b = value instanceof b.C0840b ? (b.C0840b) value : null;
            if (L.f(c0840b != null ? c0840b.f12957b : null, bVar.f12954a)) {
                return;
            }
            this.f313811M.c(null);
            this.f313811M = (V0) C43259k.d(N0.a(this), r02.c(), null, new e(this, bVar, null), 2);
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<G0> getEvents() {
        return this.f313813O;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f313812N;
    }
}
