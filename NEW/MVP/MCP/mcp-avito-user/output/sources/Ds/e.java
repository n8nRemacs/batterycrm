package Ds;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.V;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.credits.x;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.credit_broker.Contest;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.util.C35809h6;
import com.avito.android.util.architecture_components.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditBrokerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LDs/e;", "Landroidx/lifecycle/M0;", "LDs/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends M0 implements InterfaceC13437a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final V f3503E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final x f3504J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f3505K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final C23038g0<CreditCalculator> f3506L = new C23038g0<>();

    /* renamed from: M, reason: collision with root package name */
    @k
    public final D<Uri> f3507M = new D<>();

    /* renamed from: N, reason: collision with root package name */
    @k
    public final D<DeepLink> f3508N = new D<>();

    /* renamed from: O, reason: collision with root package name */
    @k
    public final D<g> f3509O = new D<>();

    /* renamed from: P, reason: collision with root package name */
    @k
    public final D<Uri> f3510P = new D<>();

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final C23038g0<Boolean> f3511Q = new C23038g0<>();

    /* renamed from: R, reason: collision with root package name */
    @k
    public final C23038g0<LoanTerms.Term> f3512R = new C23038g0<>();

    /* renamed from: S, reason: collision with root package name */
    @k
    public final D<G0> f3513S = new D<>();

    /* renamed from: T, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f3514T = new io.reactivex.rxjava3.disposables.c();

    public e(@k V v12, @k x xVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f3503E = v12;
        this.f3504J = xVar;
        this.f3505K = aVar;
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: C9, reason: from getter */
    public final D getF3508N() {
        return this.f3508N;
    }

    @Override // com.avito.android.credits.p
    public final void K7(int i12) {
        C23038g0<CreditCalculator> c23038g0 = this.f3506L;
        CreditCalculator value = c23038g0.getValue();
        if (value == null) {
            return;
        }
        value.c(value.f128973w, i12);
        c23038g0.setValue(value);
    }

    @Override // Ds.InterfaceC13437a
    @k
    /* renamed from: La, reason: from getter */
    public final C23038g0 getF3512R() {
        return this.f3512R;
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: P6, reason: from getter */
    public final C23038g0 getF3506L() {
        return this.f3506L;
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: P8, reason: from getter */
    public final D getF3513S() {
        return this.f3513S;
    }

    @Override // com.avito.android.credits.p
    public final void b4(@k DeepLink deepLink) {
        this.f3508N.setValue(deepLink);
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: f2, reason: from getter */
    public final C23038g0 getF3511Q() {
        return this.f3511Q;
    }

    @Override // com.avito.android.credits.p
    public final void f5(@l DeepLink deepLink) {
        CreditCalculator value = this.f3506L.getValue();
        if (deepLink != null) {
            this.f3508N.setValue(deepLink);
        } else if ((value instanceof com.avito.android.credits.models.c) || (value instanceof com.avito.android.credits.models.d)) {
            ke(true);
        } else {
            this.f3513S.setValue(G0.f406611a);
        }
        this.f3503E.m();
    }

    @Override // Ds.InterfaceC13437a
    public final void g5(@k CreditCalculator creditCalculator) {
        String planId;
        String strD = creditCalculator.getF129007C();
        V v12 = this.f3503E;
        v12.i(strD);
        C23038g0<CreditCalculator> c23038g0 = this.f3506L;
        if (c23038g0.getValue() == null) {
            c23038g0.setValue(creditCalculator);
            if (creditCalculator instanceof com.avito.android.credits.models.d) {
                com.avito.android.credits.models.d dVar = (com.avito.android.credits.models.d) creditCalculator;
                LoanTerms.Term term = dVar.f128993C;
                if (term == null || (planId = term.getPlanId()) == null) {
                    planId = dVar.f128998H;
                }
                v12.f(planId);
            }
            v12.d();
        }
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: he, reason: from getter */
    public final D getF3507M() {
        return this.f3507M;
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: i5, reason: from getter */
    public final D getF3510P() {
        return this.f3510P;
    }

    @Override // com.avito.android.credits.p
    public final void j9(@k Uri uri) {
        if (C35809h6.a(uri)) {
            return;
        }
        this.f3507M.setValue(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ke(boolean z12) {
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2;
        Uri.Builder builderAppendQueryParameter3;
        Uri.Builder builderBuildUpon2;
        Uri.Builder builderAppendQueryParameter4;
        Uri.Builder builderAppendQueryParameter5;
        CreditCalculator value = this.f3506L.getValue();
        if (value == 0) {
            return;
        }
        boolean z13 = value instanceof com.avito.android.credits.models.g;
        D<g> d12 = this.f3509O;
        D<Uri> d13 = this.f3510P;
        CreditCalculator.Type type = value.f128957g;
        if (z13) {
            com.avito.android.credits.models.g gVar = (com.avito.android.credits.models.g) value;
            Uri uriB = gVar.b();
            if (uriB != null) {
                d13.setValue(uriB);
                return;
            } else {
                d12.setValue(new g(gVar.a(), type));
                return;
            }
        }
        boolean z14 = value instanceof com.avito.android.credits.models.c;
        D<DeepLink> d14 = this.f3508N;
        if (z14) {
            DeepLink deepLink = ((com.avito.android.credits.models.c) value).f128988A;
            if (deepLink != null) {
                d14.setValue(deepLink);
                return;
            }
            return;
        }
        Uri uriBuild = null;
        DeepLink deepLink2 = null;
        uriBuild = null;
        uriBuild = null;
        uriBuild = null;
        Uri uriBuild2 = null;
        uriBuild = null;
        uriBuild = null;
        uriBuild = null;
        uriBuild = null;
        if (value instanceof com.avito.android.credits.models.d) {
            if (z12) {
                deepLink2 = ((com.avito.android.credits.models.d) value).f128992B;
            } else {
                LoanTerms.Term term = ((com.avito.android.credits.models.d) value).f128993C;
                if (term != null) {
                    deepLink2 = term.getDeepLink();
                }
            }
            if (deepLink2 == null) {
                deepLink2 = ((com.avito.android.credits.models.d) value).f128991A;
            }
            if (deepLink2 != null) {
                d14.setValue(deepLink2);
                return;
            }
            return;
        }
        if (value instanceof com.avito.android.credits.models.e) {
            com.avito.android.credits.models.e eVar = (com.avito.android.credits.models.e) value;
            Uri uri = eVar.f128963m;
            if (uri != null && (builderBuildUpon2 = uri.buildUpon()) != null && (builderAppendQueryParameter4 = builderBuildUpon2.appendQueryParameter("downPayment", String.valueOf(eVar.f128972v))) != null && (builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("durationMonth", String.valueOf(eVar.f128973w))) != null) {
                uriBuild2 = builderAppendQueryParameter5.build();
            }
            d13.setValue(uriBuild2);
            return;
        }
        if (value instanceof com.avito.android.credits.models.b) {
            com.avito.android.credits.models.b bVar = (com.avito.android.credits.models.b) value;
            Uri uri2 = bVar.f128963m;
            if (uri2 != null && (builderBuildUpon = uri2.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("payment", String.valueOf(bVar.f128972v))) != null && (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(DeliverySubsidiesSlotKt.AMOUNT, String.valueOf(bVar.f128971u))) != null && (builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("term", String.valueOf(bVar.f128973w))) != null) {
                uriBuild = builderAppendQueryParameter3.build();
            }
            d12.setValue(new g(uriBuild, type));
        }
    }

    @Override // com.avito.android.credits.p
    public final void lc() {
        C23038g0<CreditCalculator> c23038g0 = this.f3506L;
        if (c23038g0.getValue() instanceof com.avito.android.credits.models.f) {
            Contest contest = ((com.avito.android.credits.models.f) c23038g0.getValue()).f129010F;
            DeepLink deepLink = contest != null ? contest.getDeepLink() : null;
            if (deepLink != null) {
                this.f3508N.setValue(deepLink);
            }
        }
        V v12 = this.f3503E;
        v12.m();
        v12.r();
    }

    @Override // Ds.InterfaceC13437a
    /* renamed from: ob, reason: from getter */
    public final D getF3509O() {
        return this.f3509O;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f3514T.e();
        super.onCleared();
    }

    @Override // com.avito.android.credits.p
    public final void q8() {
        this.f3503E.g();
    }

    @Override // com.avito.android.credits.p
    public final void s2(@k LoanTerms.Term term) {
        CreditCalculator value = this.f3506L.getValue();
        com.avito.android.credits.models.d dVar = value instanceof com.avito.android.credits.models.d ? (com.avito.android.credits.models.d) value : null;
        if (dVar != null) {
            dVar.f128993C = term;
        }
        this.f3512R.setValue(term);
        String planId = term.getPlanId();
        V v12 = this.f3503E;
        v12.f(planId);
        v12.s(term.getPlanId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.credits.p
    public final void s7() {
        CreditCalculator value = this.f3506L.getValue();
        if (value == 0) {
            return;
        }
        int i12 = value.f128971u;
        int i13 = value.f128972v;
        int i14 = value.f128973w;
        com.avito.android.credits.models.g gVar = value instanceof com.avito.android.credits.models.g ? (com.avito.android.credits.models.g) value : null;
        this.f3503E.B(i12, i13, i14, (gVar != null ? gVar.b() : null) != null);
        ke(false);
    }

    @Override // com.avito.android.credits.p
    public final void yd(boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        C23038g0<Boolean> c23038g0 = this.f3511Q;
        if (boolValueOf.equals(c23038g0.getValue())) {
            return;
        }
        c23038g0.setValue(Boolean.valueOf(z12));
        if (z12) {
            this.f3503E.g();
        }
    }

    @Override // com.avito.android.credits.p
    public final void z2(int i12) {
        C23038g0<CreditCalculator> c23038g0 = this.f3506L;
        CreditCalculator value = c23038g0.getValue();
        if (value == null) {
            return;
        }
        value.c(i12, value.f128971u);
        c23038g0.setValue(value);
    }
}
