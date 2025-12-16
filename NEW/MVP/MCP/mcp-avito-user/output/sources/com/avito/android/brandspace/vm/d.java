package com.avito.android.brandspace.vm;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceAdjustParameters;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;
import lj.InterfaceC43779a;
import lj.d;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/vm/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/brandspace/vm/a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends M0 implements com.avito.android.brandspace.vm.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f107819E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC47104b f107820J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final com.avito.android.brandspace.interactor.d f107821K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final BrandspaceAnalyticsInteractor f107822L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final InterfaceC40691b f107823M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f107824N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final C23038g0<P2<Brandspace>> f107825O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final D<ApiError> f107826P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final InterfaceC43779a f107827Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final InterfaceC43779a f107828R;

    /* renamed from: S, reason: collision with root package name */
    @k
    public final InterfaceC43779a f107829S;

    /* renamed from: T, reason: collision with root package name */
    @k
    public final I0 f107830T;

    /* renamed from: U, reason: collision with root package name */
    @k
    public final I0 f107831U;

    /* renamed from: V, reason: collision with root package name */
    @k
    public final I0 f107832V;

    /* compiled from: BrandspaceViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((d) this.receiver).getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: BrandspaceViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: BrandspaceViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements p<BeduinAction, ApiError, G0> {
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.beduin_models.BeduinAction r11, com.avito.android.remote.error.ApiError r12) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.brandspace.vm.d.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BrandspaceViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/brandspace/remote/model/Brandspace;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.brandspace.vm.d$d, reason: collision with other inner class name */
    public static final class C3224d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C3224d<T, R> f107834b = new C3224d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: BrandspaceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/brandspace/remote/model/Brandspace;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2<Brandspace> p22 = (P2) obj;
            d dVar = d.this;
            dVar.getClass();
            boolean z12 = p22 instanceof P2.b;
            C23038g0<P2<Brandspace>> c23038g0 = dVar.f107825O;
            InterfaceC47104b interfaceC47104b = dVar.f107820J;
            if (!z12) {
                if (p22 instanceof P2.c) {
                    c23038g0.setValue(P2.c.f318721a);
                    G0 g02 = G0.f406611a;
                    return;
                } else {
                    if (!(p22 instanceof P2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ApiError apiError = ((P2.a) p22).f318719a;
                    interfaceC47104b.v(new J.a(apiError));
                    if (apiError instanceof ApiError.UnknownError) {
                        V2.f318762a.e(((ApiError.UnknownError) apiError).getF244063c(), ((ApiError.UnknownError) apiError).f253395c);
                    } else {
                        V2.f318762a.e(apiError.toString(), null);
                    }
                    c23038g0.setValue(p22);
                    G0 g03 = G0.f406611a;
                    return;
                }
            }
            interfaceC47104b.N();
            Brandspace brandspace = (Brandspace) ((P2.b) p22).f318720a;
            c23038g0.setValue(new P2.b(brandspace));
            List<BeduinModel> topComponents = brandspace.getTopComponents();
            if (topComponents == null) {
                topComponents = C42784z0.f406748b;
            }
            String topFormId = brandspace.getTopFormId();
            if (topFormId == null) {
                topFormId = "top";
            }
            dVar.f107827Q.h(new d.k(topComponents, topFormId));
            List<BeduinModel> mainComponents = brandspace.getMainComponents();
            String mainFormId = brandspace.getMainFormId();
            if (mainFormId == null) {
                mainFormId = "main";
            }
            dVar.f107828R.h(new d.k(mainComponents, mainFormId));
            List<BeduinModel> bottomComponents = brandspace.getBottomComponents();
            if (bottomComponents == null) {
                bottomComponents = C42784z0.f406748b;
            }
            String bottomFormId = brandspace.getBottomFormId();
            if (bottomFormId == null) {
                bottomFormId = "bottom";
            }
            dVar.f107829S.h(new d.k(bottomComponents, bottomFormId));
            interfaceC47104b.p();
            List<BeduinAction> onLoadedActions = brandspace.getOnLoadedActions();
            if (onLoadedActions == null) {
                onLoadedActions = C42784z0.f406748b;
            }
            BrandspaceAnalyticsInteractor brandspaceAnalyticsInteractor = dVar.f107822L;
            brandspaceAnalyticsInteractor.b(onLoadedActions);
            BrandspaceAdjustParameters adjustParams = brandspace.getAdjustParams();
            if (adjustParams != null) {
                long visitDuration = adjustParams.getVisitDuration();
                List<BeduinAction> onVisitedActions = brandspace.getOnVisitedActions();
                if (onVisitedActions == null) {
                    onVisitedActions = C42784z0.f406748b;
                }
                brandspaceAnalyticsInteractor.e(visitDuration, onVisitedActions);
                G0 g04 = G0.f406611a;
            }
        }
    }

    public d(@k BrandspaceAnalyticsInteractor brandspaceAnalyticsInteractor, @k com.avito.android.brandspace.interactor.d dVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC40691b interfaceC40691b, @k InterfaceC47104b interfaceC47104b) {
        this.f107819E = interfaceC35745a5;
        this.f107820J = interfaceC47104b;
        this.f107821K = dVar;
        this.f107822L = brandspaceAnalyticsInteractor;
        this.f107823M = interfaceC40691b;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f107824N = cVar;
        this.f107825O = new C23038g0<>();
        this.f107826P = new D<>();
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        this.f107827Q = interfaceC43779aJ;
        InterfaceC43779a interfaceC43779aJ2 = interfaceC40691b.j();
        this.f107828R = interfaceC43779aJ2;
        InterfaceC43779a interfaceC43779aJ3 = interfaceC40691b.j();
        this.f107829S = interfaceC43779aJ3;
        this.f107830T = interfaceC43779aJ.getF103348p().j0(interfaceC35745a5.e());
        this.f107831U = interfaceC43779aJ2.getF103348p().j0(interfaceC35745a5.e());
        this.f107832V = interfaceC43779aJ3.getF103348p().j0(interfaceC35745a5.e());
        ke();
        cVar.b(com.avito.android.beduin_shared.model.utils.p.a(interfaceC40691b.q(), new a(0, this, d.class, "onExecutingRequest", "onExecutingRequest()V", 0), new b(), new c(2, this, d.class, "onExecuteRequestError", "onExecuteRequestError(Lcom/avito/android/beduin_models/BeduinAction;Lcom/avito/android/remote/error/ApiError;)V", 0)));
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final InterfaceC39736a B0() {
        return this.f107820J.F();
    }

    @Override // com.avito.android.brandspace.vm.a
    @l
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> B5() {
        return this.f107827Q.d();
    }

    @Override // com.avito.android.brandspace.vm.a
    @l
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> Dd() {
        return this.f107828R.d();
    }

    @Override // com.avito.android.brandspace.vm.a
    /* renamed from: E6, reason: from getter */
    public final C23038g0 getF107825O() {
        return this.f107825O;
    }

    @Override // com.avito.android.brandspace.vm.a
    @l
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> H3() {
        return this.f107829S.d();
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> H6() {
        return this.f107831U;
    }

    @Override // com.avito.android.brandspace.vm.a
    public final void I0() {
        this.f107822L.d();
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> N8() {
        return this.f107830T;
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final Bundle P() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("analytics_onteractor_state", this.f107822L.H());
        return bundle;
    }

    @Override // com.avito.android.brandspace.vm.a
    public final AbstractC22991Y R4() {
        return this.f107826P;
    }

    @Override // com.avito.android.brandspace.vm.a
    public final void R8() {
        ke();
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final String Rd() {
        return this.f107827Q.getF103350r();
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    /* renamed from: V, reason: from getter */
    public final InterfaceC40691b getF107823M() {
        return this.f107823M;
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> V6() {
        return this.f107832V;
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final String W9() {
        return this.f107829S.getF103350r();
    }

    @Override // com.avito.android.brandspace.vm.a
    public final void b(@k Bundle bundle) {
        BrandspaceAnalyticsInteractor.State state = (BrandspaceAnalyticsInteractor.State) bundle.getParcelable("analytics_onteractor_state");
        if (state != null) {
            this.f107822L.c(state);
        }
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    /* renamed from: g1, reason: from getter */
    public final InterfaceC47104b getF107820J() {
        return this.f107820J;
    }

    public final void ke() {
        this.f107820J.B();
        I0 i0J0 = this.f107821K.a().r(C3224d.f107834b).F().r0(P2.c.f318721a).j0(this.f107819E.e());
        e eVar = new e();
        final V2 v22 = V2.f318762a;
        this.f107824N.b(i0J0.v0(eVar, new g() { // from class: com.avito.android.brandspace.vm.d.f
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.brandspace.vm.a
    @k
    public final String m0() {
        return this.f107828R.getF103350r();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f107824N.e();
        this.f107823M.onCleared();
    }

    @Override // com.avito.android.brandspace.vm.a
    public final void w8() {
        this.f107822L.a();
    }
}
