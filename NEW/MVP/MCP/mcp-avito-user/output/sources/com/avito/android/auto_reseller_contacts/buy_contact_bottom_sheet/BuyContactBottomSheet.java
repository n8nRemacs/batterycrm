package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.N0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data.BuyContactOpenParams;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: BuyContactBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/BuyContactBottomSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuyContactBottomSheet extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final C35968w3 f95687h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.f f95688i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final O0 f95689j0;

    /* renamed from: k0, reason: collision with root package name */
    public Button f95690k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f95691l0;

    /* renamed from: m0, reason: collision with root package name */
    public TextView f95692m0;

    /* renamed from: n0, reason: collision with root package name */
    public TextView f95693n0;

    /* renamed from: o0, reason: collision with root package name */
    public LinearLayout f95694o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f95695p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f95696q0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f95686s0 = {m0.f406844a.e(new Y(BuyContactBottomSheet.class, "openParams", "getOpenParams()Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/data/BuyContactOpenParams;", 0))};

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f95685r0 = new a(null);

    /* compiled from: BuyContactBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/BuyContactBottomSheet$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BuyContactBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = BuyContactBottomSheet.f95685r0;
            BuyContactBottomSheet buyContactBottomSheet = BuyContactBottomSheet.this;
            View viewFindViewById = view2.findViewById(R.id.action_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            buyContactBottomSheet.f95690k0 = (Button) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.buy_contacts_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            buyContactBottomSheet.f95691l0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.buy_contacts_title);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            buyContactBottomSheet.f95692m0 = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.buy_contacts_footer);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            buyContactBottomSheet.f95693n0 = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.benefits_container);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            buyContactBottomSheet.f95694o0 = (LinearLayout) viewFindViewById5;
            com.avito.android.arch.mvi.android.f.a((com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e) buyContactBottomSheet.f95689j0.getValue(), buyContactBottomSheet, Lifecycle.State.f46682e, new com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.a(1, buyContactBottomSheet, BuyContactBottomSheet.class, "eventHandler", "eventHandler(Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsOneTimeEvent;)V", 0), new com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.b(buyContactBottomSheet));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f95698l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f95698l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f95698l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BuyContactBottomSheet.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f95700l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f95700l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f95700l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95701l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95701l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f95701l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95702l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95702l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f95702l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BuyContactBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e invoke() {
            com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.f fVar = BuyContactBottomSheet.this.f95688i0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e) fVar.get();
        }
    }

    public BuyContactBottomSheet() {
        super(0, 1, null);
        this.f95687h0 = new C35968w3(this);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f95689j0 = new O0(m0.f406844a.b(com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.c.a().a((com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.b) C29972i.a(C29972i.b(this), com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.b.class), cv.c.b(this), (BuyContactOpenParams) this.f95687h0.getValue(this, f95686s0[0])).a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f95695p0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.c(this, null), y.a(aVar.d9())), N0.a((com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e) this.f95689j0.getValue()));
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.BuyContactBottomSheetDialog);
        dVar.C(R.layout.buy_contact_dialog_layout, new b());
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        j.c(dVar, ((BuyContactOpenParams) this.f95687h0.getValue(this, f95686s0[0])).f95706b.getTitle(), true, 0, 0, 0, 120);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        return dVar;
    }
}
