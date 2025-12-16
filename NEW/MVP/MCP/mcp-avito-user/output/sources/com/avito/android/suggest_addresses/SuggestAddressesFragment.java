package com.avito.android.suggest_addresses;

import Cd.C13243a;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SuggestAddressesScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.suggest_addresses.presentation.SuggestAddressesToolbarImpl;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import oA0.C44612c;
import oA0.InterfaceC44610a;
import oA0.InterfaceC44611b;
import oA0.InterfaceC44613d;
import z1.AbstractC50339a;

/* compiled from: SuggestAddressesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_addresses/SuggestAddressesFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/suggest_addresses/a;", "<init>", "()V", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestAddressesFragment extends TabBaseFragment implements InterfaceC28477j.b, com.avito.android.suggest_addresses.a {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f291782B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final D<List<SuggestAddress>> f291783A0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.suggest_addresses.i f291784t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f291785u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f291786v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f291787w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f291788x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public com.avito.android.suggest_addresses.presentation.k f291789y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f291790z0;

    /* compiled from: SuggestAddressesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_addresses/SuggestAddressesFragment$a;", "", "<init>", "()V", "", "SUGGEST_ADDRESSES_PARAMS", "Ljava/lang/String;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SuggestAddressesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.suggest_addresses.SuggestAddressesFragment$a$a, reason: collision with other inner class name */
        public static final class C8835a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SuggestAddressesParams f291791l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8835a(SuggestAddressesParams suggestAddressesParams) {
                super(1);
                this.f291791l = suggestAddressesParams;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("suggest_addresses_params", this.f291791l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SuggestAddressesFragment a(@Y61.k SuggestAddressesParams suggestAddressesParams) {
            SuggestAddressesFragment suggestAddressesFragment = new SuggestAddressesFragment();
            C35966w1.a(suggestAddressesFragment, -1, new C8835a(suggestAddressesParams));
            return suggestAddressesFragment;
        }

        public a() {
        }
    }

    /* compiled from: SuggestAddressesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoA0/b;", "it", "Lkotlin/G0;", "invoke", "(LoA0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC44611b, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC44611b interfaceC44611b) {
            String string;
            InterfaceC44611b interfaceC44611b2 = interfaceC44611b;
            SuggestAddressesFragment suggestAddressesFragment = SuggestAddressesFragment.this;
            com.avito.android.suggest_addresses.presentation.k kVar = suggestAddressesFragment.f291789y0;
            if (kVar != null) {
                com.avito.android.suggest_addresses.e eVar = new com.avito.android.suggest_addresses.e(1, suggestAddressesFragment, SuggestAddressesFragment.class, "handleFragmentEvent", "handleFragmentEvent(Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesOneTimeEvent$FragmentOneTimeEvent;)V", 0);
                if (interfaceC44611b2.equals(InterfaceC44611b.c.f419484a)) {
                    kVar.f291974c.accept(new InterfaceC44610a.d(String.valueOf(kVar.f291977f.f291962b.m53getText())));
                } else if (interfaceC44611b2 instanceof InterfaceC44611b.a) {
                    eVar.invoke(interfaceC44611b2);
                } else if (interfaceC44611b2 instanceof InterfaceC44611b.C12169b) {
                    InterfaceC44611b.C12169b c12169b = (InterfaceC44611b.C12169b) interfaceC44611b2;
                    InterfaceC44613d.b bVar = InterfaceC44613d.b.f419492a;
                    InterfaceC44613d.b bVar2 = c12169b.f419482a;
                    boolean zF2 = L.f(bVar2, bVar);
                    SuggestAddressesFragment suggestAddressesFragment2 = kVar.f291973b;
                    if (zF2) {
                        string = suggestAddressesFragment2.getString(R.string.select_addresses_resolve_address_error);
                    } else {
                        if (!L.f(bVar2, InterfaceC44613d.a.f419491a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = suggestAddressesFragment2.getString(R.string.search_addresses_max_addresses, 10);
                    }
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, kVar.f291972a, com.avito.android.printable_text.b.f(string), null, null, null, c12169b.f419483b, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestAddressesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoA0/c;", "it", "Lkotlin/G0;", "invoke", "(LoA0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C44612c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C44612c c44612c) throws Resources.NotFoundException {
            String string;
            com.avito.android.suggest_addresses.domain.adapter.addresses.c[] cVarArr;
            C44612c c44612c2 = c44612c;
            com.avito.android.suggest_addresses.presentation.k kVar = SuggestAddressesFragment.this.f291789y0;
            if (kVar != null) {
                com.avito.android.suggest_addresses.domain.adapter.chips.c cVar = c44612c2.f419485b;
                int size = cVar.f291849b.size();
                Integer numValueOf = Integer.valueOf(size);
                if (size == 0) {
                    numValueOf = null;
                }
                boolean z12 = true;
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
                View view = kVar.f291972a;
                String quantityString = view.getContext().getResources().getQuantityString(R.plurals.select_addresses_button, iIntValue, Integer.valueOf(iIntValue));
                SuggestAddressesToolbarImpl suggestAddressesToolbarImpl = kVar.f291977f;
                boolean z13 = c44612c2.f419488e;
                if (z13) {
                    if (String.valueOf(suggestAddressesToolbarImpl.f291962b.m53getText()).length() == 0) {
                        suggestAddressesToolbarImpl.setText(c44612c2.f419490g);
                    }
                    string = view.getContext().getString(R.string.search_addresses_street_and_house);
                } else {
                    suggestAddressesToolbarImpl.setText("");
                    string = view.getContext().getString(R.string.search_addresses_max_addresses, 10);
                }
                suggestAddressesToolbarImpl.setLoading(c44612c2.f419489f);
                suggestAddressesToolbarImpl.setHint(string);
                suggestAddressesToolbarImpl.setEnabled(z13);
                boolean zIsEmpty = cVar.f291849b.isEmpty();
                List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list = c44612c2.f419486c;
                com.avito.android.suggest_addresses.domain.adapter.error.c cVar2 = c44612c2.f419487d;
                if (zIsEmpty && (list.isEmpty() || cVar2 != null)) {
                    z12 = false;
                }
                Button button = kVar.f291978g;
                button.setEnabled(z12);
                button.setText(quantityString);
                List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list2 = cVar2 == null ? list : null;
                if (list2 == null || (cVarArr = (com.avito.android.suggest_addresses.domain.adapter.addresses.c[]) list2.toArray(new com.avito.android.suggest_addresses.domain.adapter.addresses.c[0])) == null) {
                    cVarArr = new com.avito.android.suggest_addresses.domain.adapter.addresses.c[0];
                }
                t0 t0Var = new t0(3);
                t0Var.a(cVar);
                t0Var.a(cVar2);
                t0Var.b(cVarArr);
                ArrayList<Object> arrayList = t0Var.f406850a;
                kVar.f291976e.c(new UV0.c(C42756l.B(arrayList.toArray(new com.avito.conveyor_item.a[arrayList.size()]))));
                kVar.f291975d.notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestAddressesFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/suggest_addresses/entity/SuggestAddressesParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<SuggestAddressesParams> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final SuggestAddressesParams invoke() {
            SuggestAddressesParams suggestAddressesParams;
            Bundle arguments = SuggestAddressesFragment.this.getArguments();
            if (arguments != null) {
                suggestAddressesParams = (SuggestAddressesParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("suggest_addresses_params", SuggestAddressesParams.class) : arguments.getParcelable("suggest_addresses_params"));
            } else {
                suggestAddressesParams = null;
            }
            if (suggestAddressesParams != null) {
                return suggestAddressesParams;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: SuggestAddressesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoA0/a;", "it", "Lkotlin/G0;", "invoke", "(LoA0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC44610a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC44610a interfaceC44610a) {
            a aVar = SuggestAddressesFragment.f291782B0;
            ((com.avito.android.suggest_addresses.h) SuggestAddressesFragment.this.f291785u0.getValue()).accept(interfaceC44610a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f291796l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f291796l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f291796l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SuggestAddressesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f291798l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f291798l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f291798l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291799l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291799l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f291799l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291800l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f291800l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SuggestAddressesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/suggest_addresses/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.suggest_addresses.h> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.suggest_addresses.h invoke() {
            com.avito.android.suggest_addresses.i iVar = SuggestAddressesFragment.this.f291784t0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.suggest_addresses.h) iVar.get();
        }
    }

    public SuggestAddressesFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f291785u0 = new O0(m0.f406844a.b(com.avito.android.suggest_addresses.h.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f291790z0 = C42727D.c(new d());
        this.f291783A0 = new D<>();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f291786v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f291786v0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.suggest_addresses.h) this.f291785u0.getValue(), new b(), new c());
        return layoutInflater.inflate(R.layout.suggest_addresses_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f291789y0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.suggest_addresses.h hVar = (com.avito.android.suggest_addresses.h) this.f291785u0.getValue();
        com.avito.konveyor.adapter.j jVar = this.f291787w0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f291788x0;
        this.f291789y0 = new com.avito.android.suggest_addresses.presentation.k(view, this, hVar, jVar2, aVar != null ? aVar : null, ((SuggestAddressesParams) this.f291790z0.getValue()).f291891d);
        ScreenPerformanceTracker screenPerformanceTracker = this.f291786v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.suggest_addresses.di.b.a().a((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), (com.avito.android.suggest_addresses.di.d) C29972i.a(C29972i.b(this), com.avito.android.suggest_addresses.di.d.class), new C28478k(SuggestAddressesScreen.f90525d, s.c(this), null, 4, null), (SuggestAddressesParams) this.f291790z0.getValue(), new e()).yd(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f291786v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.suggest_addresses.a
    /* renamed from: r1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF291783A0() {
        return this.f291783A0;
    }
}
