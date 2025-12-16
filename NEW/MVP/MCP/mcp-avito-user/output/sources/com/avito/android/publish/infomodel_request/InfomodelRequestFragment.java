package com.avito.android.publish.infomodel_request;

import Id0.InterfaceC14062b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.infomodel_request.d;
import com.avito.android.publish.infomodel_request.di.b;
import com.avito.android.publish.objects.di.C33930m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InfomodelRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/infomodel_request/InfomodelRequestFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InfomodelRequestFragment extends Fragment implements com.avito.android.ui.fragments.c, InterfaceC14062b, InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public o f236082f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f236083g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public Z f236084h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public C0 f236085i0;

    /* renamed from: j0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f236086j0;

    /* renamed from: k0, reason: collision with root package name */
    public f f236087k0;

    /* renamed from: l0, reason: collision with root package name */
    public F f236088l0;

    /* compiled from: InfomodelRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((PublishActivity) InfomodelRequestFragment.this.requireActivity()).d2(null);
            return G0.f406611a;
        }
    }

    /* compiled from: InfomodelRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            InfomodelRequestFragment.this.i0();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        f fVar = this.f236087k0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f236158R.ye();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        f fVar = this.f236087k0;
        if (fVar == null) {
            fVar = null;
        }
        if (bundle == null) {
            fVar.getClass();
        } else {
            fVar.f236163W = bundle.getBoolean("key_data_loaded", fVar.f236163W);
        }
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("is_initial_request") : true;
        Bundle arguments2 = getArguments();
        boolean z13 = arguments2 != null ? arguments2.getBoolean("track_draft_resumed") : false;
        f fVar2 = this.f236087k0;
        f fVar3 = fVar2 != null ? fVar2 : null;
        fVar3.f236160T = z12;
        fVar3.f236161U = z13;
        if (fVar3.f236163W) {
            return;
        }
        fVar3.le();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("draft_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C33930m c33930m = new C33930m(string);
        b.a aVarA = com.avito.android.publish.infomodel_request.di.a.a();
        aVarA.b((com.avito.android.publish.infomodel_request.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.infomodel_request.di.c.class));
        aVarA.a(c33930m);
        aVarA.build().a(this);
        Z z12 = this.f236084h0;
        if (z12 == null) {
            z12 = null;
        }
        z12.a(fA2.b());
        o oVar = this.f236082f0;
        this.f236087k0 = (f) R0.a(this, oVar != null ? oVar : null).a(f.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        D.f90335a.getClass();
        this.f236088l0 = D.a.a();
        return layoutInflater.inflate(R.layout.loading_progress_overlay_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f fVar = this.f236087k0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f236162V.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = this.f236087k0;
        if (fVar == null) {
            fVar = null;
        }
        bundle.putBoolean("key_data_loaded", fVar.f236163W);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View rootView = requireView().getRootView();
        C0 c02 = this.f236085i0;
        if (c02 == null) {
            c02 = null;
        }
        C33862g0 c33862g0 = new C33862g0(rootView, c02.qe());
        c33862g0.c(R.drawable.ic_back_24_black);
        c33862g0.b(new a(), new b());
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f236083g0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 18, null);
        this.f236086j0 = lVar;
        lVar.k(null);
        f fVar = this.f236087k0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f236162V.observe(getViewLifecycleOwner(), new d.b(new com.avito.android.publish.infomodel_request.b(this)));
        f fVar2 = this.f236087k0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        com.avito.android.progress_overlay.l lVar2 = this.f236086j0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.f231600j = new c(fVar2);
        Z z12 = this.f236084h0;
        if (z12 == null) {
            z12 = null;
        }
        F f12 = this.f236088l0;
        z12.b((f12 != null ? f12 : null).b());
    }
}
