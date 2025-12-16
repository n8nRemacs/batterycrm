package com.avito.android.tariff_lf_publication.count;

import Cd.C13243a;
import HV.a;
import MD0.a;
import MD0.b;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.tariff_lf_publication.count.TariffLfPublicationCountFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kr.C43490a;
import v50.C49166b;
import wZ.C49578b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: TariffLfPublicationCountFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/TariffLfPublicationCountFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffLfPublicationCountFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f300720G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public DescriptionParameterItem f300721A0;

    /* renamed from: B0, reason: collision with root package name */
    public StrikethroughTextView f300722B0;

    /* renamed from: C0, reason: collision with root package name */
    public TextView f300723C0;

    /* renamed from: D0, reason: collision with root package name */
    public View f300724D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f300725E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public C49899a f300726F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_publication.count.g f300727n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f300728o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f300729p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f300730q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f300731r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f300732s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f300733t0;

    /* renamed from: u0, reason: collision with root package name */
    public xZ.e f300734u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f300735v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f300736w0;

    /* renamed from: x0, reason: collision with root package name */
    public FloatingContainer f300737x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f300738y0;

    /* renamed from: z0, reason: collision with root package name */
    public Button f300739z0;

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/TariffLfPublicationCountFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = TariffLfPublicationCountFragment.f300720G0;
            TariffLfPublicationCountFragment.this.q5().accept(new a.f(new Bundle()));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_lf_publication/count/TariffLfPublicationCountFragment$c", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public c(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = TariffLfPublicationCountFragment.this.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<MD0.b, G0> {
        public final void f(@Y61.k MD0.b bVar) {
            Context context;
            TariffLfPublicationCountFragment tariffLfPublicationCountFragment = (TariffLfPublicationCountFragment) this.receiver;
            a aVar = TariffLfPublicationCountFragment.f300720G0;
            tariffLfPublicationCountFragment.getClass();
            if (bVar instanceof b.C0664b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffLfPublicationCountFragment.f300733t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.C0664b c0664b = (b.C0664b) bVar;
                aVar2.r6(c0664b.f10467b, c0664b.f10466a, "tariff_lf_publication_count_request_key");
                return;
            }
            if (bVar instanceof b.a) {
                ActivityC22955m activityC22955mL1 = tariffLfPublicationCountFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    return;
                }
                return;
            }
            if (bVar instanceof b.d) {
                ((com.avito.android.deeplink_handler.view.impl.i) tariffLfPublicationCountFragment.f300729p0.getValue()).a(((b.d) bVar).f10470a);
                return;
            }
            if (!(bVar instanceof b.c) || (context = tariffLfPublicationCountFragment.getContext()) == null) {
                return;
            }
            a.C0407a c0407a = HV.a.f7100w;
            int iJ2 = C35835l0.j(R.attr.toastBarError, context);
            c0407a.getClass();
            HV.a aVarB = a.C0407a.b(iJ2, context);
            C43490a.a(context, new ToastBarState(((b.c) bVar).f10468a, null, null, null, Collections.singletonList(IV.a.b(aVarB, tariffLfPublicationCountFragment.getString(R.string.error_layout_refresh), context, new com.avito.android.tariff_lf_publication.count.c(tariffLfPublicationCountFragment, bVar))), null, null, 2750, false, false, null, null, 3950, null), aVarB, 24);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(MD0.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<MD0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(MD0.c cVar) {
            MD0.c cVar2 = cVar;
            TariffLfPublicationCountFragment tariffLfPublicationCountFragment = (TariffLfPublicationCountFragment) this.receiver;
            a aVar = TariffLfPublicationCountFragment.f300720G0;
            tariffLfPublicationCountFragment.getClass();
            if (cVar2.f10473b) {
                View view = tariffLfPublicationCountFragment.f300735v0;
                if (view == null) {
                    view = null;
                }
                D6.H(view);
                xZ.e eVar = tariffLfPublicationCountFragment.f300734u0;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.c();
                FloatingContainer floatingContainer = tariffLfPublicationCountFragment.f300737x0;
                D6.w(floatingContainer != null ? floatingContainer : null);
            } else {
                Throwable th2 = cVar2.f10474c;
                if (th2 != null) {
                    xZ.e eVar2 = tariffLfPublicationCountFragment.f300734u0;
                    if (eVar2 == null) {
                        eVar2 = null;
                    }
                    eVar2.d(z.l(th2));
                    View view2 = tariffLfPublicationCountFragment.f300735v0;
                    if (view2 == null) {
                        view2 = null;
                    }
                    D6.w(view2);
                    FloatingContainer floatingContainer2 = tariffLfPublicationCountFragment.f300737x0;
                    D6.w(floatingContainer2 != null ? floatingContainer2 : null);
                } else {
                    xZ.e eVar3 = tariffLfPublicationCountFragment.f300734u0;
                    if (eVar3 == null) {
                        eVar3 = null;
                    }
                    eVar3.b();
                    View view3 = tariffLfPublicationCountFragment.f300735v0;
                    if (view3 == null) {
                        view3 = null;
                    }
                    D6.w(view3);
                    com.avito.konveyor.adapter.d dVar = tariffLfPublicationCountFragment.f300732s0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(cVar2.f10475d, null);
                    FloatingContainer floatingContainer3 = tariffLfPublicationCountFragment.f300737x0;
                    if (floatingContainer3 == null) {
                        floatingContainer3 = null;
                    }
                    D6.H(floatingContainer3);
                    FloatingContainer floatingContainer4 = tariffLfPublicationCountFragment.f300737x0;
                    if (floatingContainer4 == null) {
                        floatingContainer4 = null;
                    }
                    View view4 = tariffLfPublicationCountFragment.f300738y0;
                    if (view4 == null) {
                        view4 = null;
                    }
                    floatingContainer4.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.C5271a(view4)));
                    Button button = tariffLfPublicationCountFragment.f300739z0;
                    if (button == null) {
                        button = null;
                    }
                    C49578b c49578b = cVar2.f10476e;
                    String str = c49578b != null ? c49578b.f441546a : null;
                    button.setState(new UU.a(str == null ? "" : str, null, false, cVar2.f10477f, false, tariffLfPublicationCountFragment.f300725E0, null, null, null, false, 982, null));
                    DescriptionParameterItem descriptionParameterItem = tariffLfPublicationCountFragment.f300721A0;
                    if (descriptionParameterItem == null) {
                        descriptionParameterItem = null;
                    }
                    boolean z12 = cVar2.f10480i;
                    descriptionParameterItem.setVisibility(!z12 ? 0 : 8);
                    DescriptionParameterItem descriptionParameterItem2 = tariffLfPublicationCountFragment.f300721A0;
                    if (descriptionParameterItem2 == null) {
                        descriptionParameterItem2 = null;
                    }
                    String str2 = cVar2.f10478g;
                    descriptionParameterItem2.setState(new com.avito.android.lib.design.description_list.parameter_line.item.a(null, str2 == null ? "" : str2, "", 1, null));
                    StrikethroughTextView strikethroughTextView = tariffLfPublicationCountFragment.f300722B0;
                    if (strikethroughTextView == null) {
                        strikethroughTextView = null;
                    }
                    strikethroughTextView.setVisibility(!z12 ? 0 : 8);
                    StrikethroughTextView strikethroughTextView2 = tariffLfPublicationCountFragment.f300722B0;
                    if (strikethroughTextView2 == null) {
                        strikethroughTextView2 = null;
                    }
                    LD0.a aVar2 = cVar2.f10479h;
                    String str3 = aVar2 != null ? aVar2.f9876a : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    strikethroughTextView2.setState(new CV.a(str3, false, 2, null));
                    TextView textView = tariffLfPublicationCountFragment.f300723C0;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setVisibility(!z12 ? 0 : 8);
                    TextView textView2 = tariffLfPublicationCountFragment.f300723C0;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setText(aVar2 != null ? aVar2.f9877b : null);
                    View view5 = tariffLfPublicationCountFragment.f300724D0;
                    if (view5 == null) {
                        view5 = null;
                    }
                    view5.setVisibility(z12 ? 0 : 8);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffLfPublicationCountFragment.f300720G0;
            TariffLfPublicationCountFragment.this.q5().accept(new a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "countId", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Long, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            a aVar = TariffLfPublicationCountFragment.f300720G0;
            TariffLfPublicationCountFragment.this.q5().accept(new a.b(jLongValue));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/i;", "invoke", "()Lcom/avito/android/deeplink_handler/view/impl/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.deeplink_handler.view.impl.i> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.deeplink_handler.view.impl.i invoke() {
            return new com.avito.android.deeplink_handler.view.impl.i(TariffLfPublicationCountFragment.this.requireActivity());
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f300745l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f300745l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f300745l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TariffLfPublicationCountFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f300747l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f300747l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f300747l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f300748l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f300748l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f300748l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f300749l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f300749l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f300749l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffLfPublicationCountFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_lf_publication/count/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.tariff_lf_publication.count.f> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_lf_publication.count.f invoke() {
            com.avito.android.tariff_lf_publication.count.g gVar = TariffLfPublicationCountFragment.this.f300727n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.tariff_lf_publication.count.f) gVar.get();
        }
    }

    public TariffLfPublicationCountFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f300728o0 = new O0(m0.f406844a.b(com.avito.android.tariff_lf_publication.count.f.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f300729p0 = C42727D.c(new h());
        this.f300725E0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 22);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new c(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f300730q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        this.f300738y0 = layoutInflater.inflate(R.layout.tariff_lf_publication_footer, viewGroup, false);
        return layoutInflater.inflate(R.layout.tariff_lf_publication_count_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        this.f300734u0 = new xZ.e((ViewGroup) view.findViewById(R.id.tariff_lf_publication_count_content_container), new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_publication.count.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffLfPublicationCountFragment f300752c;

            {
                this.f300752c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffLfPublicationCountFragment tariffLfPublicationCountFragment = this.f300752c;
                switch (i12) {
                    case 0:
                        TariffLfPublicationCountFragment.a aVar = TariffLfPublicationCountFragment.f300720G0;
                        tariffLfPublicationCountFragment.q5().accept(a.c.f10459a);
                        break;
                    default:
                        TariffLfPublicationCountFragment.a aVar2 = TariffLfPublicationCountFragment.f300720G0;
                        tariffLfPublicationCountFragment.q5().accept(a.C0663a.f10457a);
                        break;
                }
            }
        }, null, 4, null);
        this.f300735v0 = view.findViewById(R.id.tariff_lf_publication_count_skeleton_item);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_arrowBack24, R.attr.black));
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_publication.count.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffLfPublicationCountFragment f300752c;

            {
                this.f300752c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffLfPublicationCountFragment tariffLfPublicationCountFragment = this.f300752c;
                switch (i13) {
                    case 0:
                        TariffLfPublicationCountFragment.a aVar = TariffLfPublicationCountFragment.f300720G0;
                        tariffLfPublicationCountFragment.q5().accept(a.c.f10459a);
                        break;
                    default:
                        TariffLfPublicationCountFragment.a aVar2 = TariffLfPublicationCountFragment.f300720G0;
                        tariffLfPublicationCountFragment.q5().accept(a.C0663a.f10457a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_lf_publication_count_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f300732s0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new ND0.c(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300730q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f300736w0 = recyclerView;
        View view2 = this.f300738y0;
        if (view2 == null) {
            view2 = null;
        }
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        FloatingContainer floatingContainer = (FloatingContainer) view.findViewById(R.id.tariff_lf_publication_count_floating_container);
        this.f300737x0 = floatingContainer;
        floatingContainer.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 25));
        View view3 = this.f300738y0;
        if (view3 == null) {
            view3 = null;
        }
        this.f300739z0 = (Button) view3.findViewById(R.id.tariff_lf_publication_footer_button);
        View view4 = this.f300738y0;
        if (view4 == null) {
            view4 = null;
        }
        this.f300721A0 = (DescriptionParameterItem) view4.findViewById(R.id.tariff_lf_publication_footer_dotted_text);
        View view5 = this.f300738y0;
        if (view5 == null) {
            view5 = null;
        }
        this.f300722B0 = (StrikethroughTextView) view5.findViewById(R.id.tariff_lf_publication_footer_old_price);
        View view6 = this.f300738y0;
        if (view6 == null) {
            view6 = null;
        }
        this.f300723C0 = (TextView) view6.findViewById(R.id.tariff_lf_publication_footer_price);
        View view7 = this.f300738y0;
        if (view7 == null) {
            view7 = null;
        }
        this.f300724D0 = view7.findViewById(R.id.tariff_lf_publication_price_skeleton_item);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f300730q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new d(1, this, TariffLfPublicationCountFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountOneTimeEvent;)V", 0), new e(1, this, TariffLfPublicationCountFragment.class, "render", "render(Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f300730q0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_publication.count.di.a.a().a((KD0.b) C29972i.a(C29972i.b(this), KD0.b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "tariff_lf_publication_remote_context"), new f(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300730q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f300730q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f300733t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.tariff_lf_publication.count.f q5() {
        return (com.avito.android.tariff_lf_publication.count.f) this.f300728o0.getValue();
    }
}
