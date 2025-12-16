package com.avito.android.sx_address.selectaddresslist;

import Cd.C13243a;
import UA0.a;
import UA0.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.SelectAddressListLink;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.sx_address.SelectAddressListParams;
import com.avito.android.sx_address.selectaddresslist.domain.AddButton;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.domain.ListItemValue;
import com.avito.android.sx_address.selectaddresslist.domain.SelectListScreenData;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListState;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListViewState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.d2;
import z1.AbstractC50339a;

/* compiled from: SelectAddressListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/SelectAddressListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectAddressListFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.selectaddresslist.f f294015n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.selectaddresslist.b f294016o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f294017p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public j f294018q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public d2<AddressListViewItem> f294019r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f294020s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f294021t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f294022u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.sx_address.selectaddresslist.view.d f294023v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C35968w3 f294024w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f294014y0 = {m0.f406844a.e(new Y(SelectAddressListFragment.class, "openParams", "getOpenParams()Lcom/avito/android/sx_address/SelectAddressListParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f294013x0 = new a(null);

    /* compiled from: SelectAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/SelectAddressListFragment$a;", "", "<init>", "()V", "", "SELECT_ADDRESS_LIST_PARAMS_KEY", "Ljava/lang/String;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectAddressListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<UA0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(UA0.c cVar) {
            UA0.c cVar2 = cVar;
            SelectAddressListFragment selectAddressListFragment = (SelectAddressListFragment) this.receiver;
            a aVar = SelectAddressListFragment.f294013x0;
            selectAddressListFragment.getClass();
            if (cVar2 instanceof c.a) {
                selectAddressListFragment.requireActivity().finish();
            } else if (cVar2 instanceof c.C1106c) {
                AddressListViewItem addressListViewItem = ((c.C1106c) cVar2).f16261a;
                ListItemValue listItemValue = addressListViewItem.f294068f;
                AddressParameter.Value value = new AddressParameter.Value(listItemValue.f294073c, listItemValue.f294074d, listItemValue.f294075e, listItemValue.f294072b, new AddressParameter.Value.PublishValueSellerAddressData(addressListViewItem.f294065c, addressListViewItem.f294064b, addressListViewItem.f294070h, addressListViewItem.f294066d, addressListViewItem.f294067e));
                ActivityC22955m activityC22955mRequireActivity = selectAddressListFragment.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("result.select_address_list", new SelectAddressListLink.SelectAddressListResult.Success(value));
                G0 g02 = G0.f406611a;
                activityC22955mRequireActivity.setResult(-1, intent);
                selectAddressListFragment.requireActivity().finish();
            } else if (cVar2 instanceof c.e) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = selectAddressListFragment.f294021t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((c.e) cVar2).f16263a, null, null, 6);
            } else {
                if (cVar2 instanceof c.b ? true : L.f(cVar2, c.d.f16262a)) {
                    ((com.avito.android.sx_address.selectaddresslist.e) selectAddressListFragment.f294022u0.getValue()).accept(a.d.f16246a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<SelectAddressListState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SelectAddressListState selectAddressListState) {
            SelectAddressListState selectAddressListState2 = selectAddressListState;
            com.avito.android.sx_address.selectaddresslist.view.d dVar = SelectAddressListFragment.this.f294023v0;
            if (dVar != null) {
                SelectAddressListViewState selectAddressListViewState = selectAddressListState2.f294112c;
                boolean z12 = selectAddressListViewState instanceof SelectAddressListViewState.Content;
                View view = dVar.f294172l;
                LinearLayout linearLayout = dVar.f294170j;
                SpinnerOverlay spinnerOverlay = dVar.f294168h;
                Button button = dVar.f294176p;
                if (z12) {
                    D6.w(spinnerOverlay);
                    D6.w(linearLayout);
                    D6.H(view);
                    D6.H(button);
                    SelectListScreenData selectListScreenData = ((SelectAddressListViewState.Content) selectAddressListViewState).f294118b;
                    dVar.f294169i.setVisibility(selectListScreenData.f294085k ? 0 : 8);
                    I5.a(dVar.f294171k, selectListScreenData.f294080f, false);
                    I5.a(dVar.f294173m, selectListScreenData.f294079e, false);
                    Button button2 = dVar.f294174n;
                    Context context = button2.getContext();
                    AddButton addButton = selectListScreenData.f294078d;
                    com.avito.android.lib.design.button.b.a(button2, dVar.f294166f.c(context, addButton != null ? addButton.f294062b : null), false);
                    int i12 = L.f(selectListScreenData.f294081g, Boolean.TRUE) ? 0 : 8;
                    Input input = dVar.f294175o;
                    input.setVisibility(i12);
                    input.setHint(selectListScreenData.f294083i);
                    String f294032a = selectListScreenData.f294084j;
                    if (f294032a == null) {
                        f294032a = dVar.f294162b.getF294032a();
                    }
                    button.setText(f294032a);
                    dVar.f294163c.c(new UV0.c(selectListScreenData.f294076b));
                    dVar.f294164d.notifyDataSetChanged();
                } else if (selectAddressListViewState instanceof SelectAddressListViewState.Loading) {
                    D6.H(spinnerOverlay);
                    D6.w(button);
                    D6.w(linearLayout);
                    D6.w(view);
                } else if (selectAddressListViewState instanceof SelectAddressListViewState.Error) {
                    D6.w(spinnerOverlay);
                    D6.w(button);
                    D6.H(linearLayout);
                    D6.w(view);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f294026l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f294026l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f294026l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectAddressListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f294028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f294028l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f294028l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f294029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f294029l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f294029l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f294030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f294030l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f294030l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sx_address/selectaddresslist/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.sx_address.selectaddresslist.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.sx_address.selectaddresslist.e invoke() {
            com.avito.android.sx_address.selectaddresslist.f fVar = SelectAddressListFragment.this.f294015n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.sx_address.selectaddresslist.e) fVar.get();
        }
    }

    public SelectAddressListFragment() {
        super(R.layout.fragment_sx_address_select_address_list);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f294022u0 = new O0(m0.f406844a.b(com.avito.android.sx_address.selectaddresslist.e.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f294024w0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f294023v0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.sx_address.selectaddresslist.b bVar = this.f294016o0;
        com.avito.android.sx_address.selectaddresslist.b bVar2 = bVar != null ? bVar : null;
        com.avito.konveyor.adapter.a aVar = this.f294017p0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        j jVar = this.f294018q0;
        j jVar2 = jVar != null ? jVar : null;
        d2<AddressListViewItem> d2Var = this.f294019r0;
        d2<AddressListViewItem> d2Var2 = d2Var != null ? d2Var : null;
        com.avito.android.util.text.a aVar3 = this.f294020s0;
        com.avito.android.sx_address.selectaddresslist.view.d dVar = new com.avito.android.sx_address.selectaddresslist.view.d(view, viewLifecycleOwner, bVar2, aVar2, jVar2, d2Var2, aVar3 != null ? aVar3 : null);
        this.f294023v0 = dVar;
        O0 o02 = this.f294022u0;
        dVar.a((com.avito.android.sx_address.selectaddresslist.e) o02.getValue());
        com.avito.android.arch.mvi.android.f.a((com.avito.android.sx_address.selectaddresslist.e) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46681d, new b(1, this, SelectAddressListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListOneTimeEvent;)V", 0), new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            SelectAddressListParams selectAddressListParams = (SelectAddressListParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("select_address_list_params_key", SelectAddressListParams.class) : arguments.getParcelable("select_address_list_params_key"));
            if (selectAddressListParams != null) {
                this.f294024w0.setValue(this, f294014y0[0], selectAddressListParams);
                com.avito.android.sx_address.selectaddresslist.di.a.a().a(getResources(), selectAddressListParams, (com.avito.android.sx_address.selectaddresslist.di.c) C29972i.a(C29972i.b(this), com.avito.android.sx_address.selectaddresslist.di.c.class), cv.c.b(this)).a(this);
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }
}
