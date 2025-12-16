package com.avito.android.vas_planning;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.W;
import com.avito.android.analytics.l0;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.phone_confirmation.C33153i;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.vas_planning.model.VasPlanningItem;
import com.avito.android.vas_planning_calendar.InterfaceC36074h;
import i.b;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;

/* compiled from: VasPlanningFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_planning/VasPlanningFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/vas_planning/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasPlanningFragment extends BaseFragment implements com.avito.android.vas_planning.b, InterfaceC28477j.b {

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f322179z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public VasPlanningItem.VasPlanningDateTime f322180n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f322181o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322182p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public q f322183q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f322184r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f322185s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC36074h f322186t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f322187u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public InterfaceC49447a f322188v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f322189w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f322190x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f322191y0;

    /* compiled from: VasPlanningFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/VasPlanningFragment$a;", "", "<init>", "()V", "", "ARGUMENT_ID", "Ljava/lang/String;", "KEY_ITEM_WAIT_FOR_UPDATE", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasPlanningFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/VasPlanningFragmentArgument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<VasPlanningFragmentArgument> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final VasPlanningFragmentArgument invoke() {
            VasPlanningFragmentArgument vasPlanningFragmentArgument;
            Bundle arguments = VasPlanningFragment.this.getArguments();
            if (arguments != null) {
                vasPlanningFragmentArgument = (VasPlanningFragmentArgument) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("argument_id_key", VasPlanningFragmentArgument.class) : arguments.getParcelable("argument_id_key"));
            } else {
                vasPlanningFragmentArgument = null;
            }
            if (vasPlanningFragmentArgument != null) {
                return vasPlanningFragmentArgument;
            }
            throw new IllegalArgumentException("Argument parameter is not provided");
        }
    }

    /* compiled from: VasPlanningFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<VasPlanningItem.VasPlanningDateTime, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
            VasPlanningFragment.this.P(vasPlanningDateTime);
            return G0.f406611a;
        }
    }

    /* compiled from: VasPlanningFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f322194b;

        public d(Y41.l lVar) {
            this.f322194b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f322194b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f322194b;
        }

        public final int hashCode() {
            return this.f322194b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322194b.invoke(obj);
        }
    }

    public VasPlanningFragment() {
        super(0, 1, null);
        this.f322182p0 = C42727D.c(new b());
        this.f322191y0 = registerForActivityResult(new b.m(), new com.avito.android.str_seller_orders.orders_seller.a(this, 4));
    }

    @Override // com.avito.android.vas_planning.b
    public final void P(@Y61.l VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        com.avito.android.lib.util.g.a(new com.avito.android.vas_planning.dialog.g(requireContext(), vasPlanningDateTime != null ? vasPlanningDateTime.f322424e : null, vasPlanningDateTime != null ? vasPlanningDateTime.f322423d : null, new C33153i(2, this, vasPlanningDateTime)));
    }

    @Override // com.avito.android.vas_planning.b
    public final void X2(@Y61.l VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        Date date;
        org.threeten.bp.e eVar;
        org.threeten.bp.d dVarT;
        if ((vasPlanningDateTime != null ? vasPlanningDateTime.f322423d : null) == null) {
            InterfaceC28373a interfaceC28373a = this.f322189w0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new l0(r5().f322195b, r5().f322197d));
        }
        this.f322180n0 = vasPlanningDateTime;
        if (vasPlanningDateTime == null || (eVar = vasPlanningDateTime.f322423d) == null || (dVarT = org.threeten.bp.f.G(eVar, org.threeten.bp.g.f422069h).t(org.threeten.bp.q.f422106g)) == null) {
            date = null;
        } else {
            long j12 = dVarT.f421935b;
            int i12 = dVarT.f421936c;
            date = new Date(j12 >= 0 ? w81.d.h(w81.d.j(j12, 1000L), i12 / 1000000) : w81.d.l(w81.d.j(j12 + 1, 1000L), 1000 - (i12 / 1000000)));
        }
        InterfaceC36074h interfaceC36074h = this.f322186t0;
        this.f322191y0.b((interfaceC36074h != null ? interfaceC36074h : null).a(date, CalendarSelectionType.f220022b));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f322188v0 = interfaceC49447a;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_vas_planning, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f322188v0 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("key_vas_planning_date_time_wait_for_update", this.f322180n0);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f322189w0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new W(r5().f322195b, r5().f322197d));
        com.avito.konveyor.adapter.a aVar = this.f322184r0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f322185s0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.a aVar3 = this.f322187u0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        Resources resources = getResources();
        VasPlanningFragmentArgument vasPlanningFragmentArgumentR5 = r5();
        q qVar = this.f322183q0;
        q qVar2 = qVar != null ? qVar : null;
        InterfaceC28373a interfaceC28373a2 = this.f322189w0;
        new o(view, aVar2, jVar2, this, aVar4, this, resources, vasPlanningFragmentArgumentR5, qVar2, interfaceC28373a2 != null ? interfaceC28373a2 : null);
        q qVar3 = this.f322183q0;
        (qVar3 != null ? qVar3 : null).getF322532U().observe(getViewLifecycleOwner(), new d(new c()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Y61.l Bundle bundle) {
        VasPlanningItem.VasPlanningDateTime vasPlanningDateTime;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            vasPlanningDateTime = (VasPlanningItem.VasPlanningDateTime) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("key_vas_planning_date_time_wait_for_update", VasPlanningItem.VasPlanningDateTime.class) : bundle.getParcelable("key_vas_planning_date_time_wait_for_update"));
        } else {
            vasPlanningDateTime = null;
        }
        this.f322180n0 = vasPlanningDateTime;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.vas_planning.di.a.a().a(r5(), this, this, getResources(), (com.avito.android.vas_planning.di.e) C29972i.a(C29972i.b(this), com.avito.android.vas_planning.di.e.class), cv.c.b(this)).a(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322190x0;
        if (aVar == null) {
            aVar = null;
        }
        C49166b.c(aVar, C49166b.a(this));
    }

    public final void q5(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322190x0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    public final VasPlanningFragmentArgument r5() {
        return (VasPlanningFragmentArgument) this.f322182p0.getValue();
    }
}
