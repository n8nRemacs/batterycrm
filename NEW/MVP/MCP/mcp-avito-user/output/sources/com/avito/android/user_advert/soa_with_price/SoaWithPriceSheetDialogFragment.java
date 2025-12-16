package com.avito.android.user_advert.soa_with_price;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import androidx.view.P0;
import com.avito.android.N2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.user_advert.soa_with_price.di.a;
import com.avito.android.user_advert.soa_with_price.j;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import j.e0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ur.InterfaceC49101b;

/* compiled from: SoaWithPriceSheetDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoaWithPriceSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f311851h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<com.avito.konveyor.adapter.b> f311852i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.soa_with_price.blueprint.d f311853j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f311854k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f311855l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f311856m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public E f311857n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public nt.f f311858o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f311859p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public N2 f311860q0;

    /* renamed from: r0, reason: collision with root package name */
    public D f311861r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f311862s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f311863t0;

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NavigationButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationButtonType navigationButtonType = NavigationButtonType.f311839b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f311864l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f311864l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f311864l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = SoaWithPriceSheetDialogFragment.this.f311861r0;
            if (d12 == null) {
                d12 = null;
            }
            d12.le();
            return G0.f406611a;
        }
    }

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = SoaWithPriceSheetDialogFragment.this.f311861r0;
            if (d12 == null) {
                d12 = null;
            }
            d12.O6();
            return G0.f406611a;
        }
    }

    public SoaWithPriceSheetDialogFragment() {
        super(0, 1, null);
    }

    public final void f5(com.avito.android.lib.design.bottom_sheet.d dVar, @e0 Integer num, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        String string;
        NavBar navBar = new NavBar(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), null, 0, 6, null);
        if (num != null && (string = navBar.getContext().getString(num.intValue())) != null) {
            NavBar.e(navBar, string, 0, 6);
        }
        navBar.c(R.attr.ic_arrowBack24, new b(aVar));
        ImageView imageViewA = navBar.a(R.attr.ic_close24);
        imageViewA.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.A(22, aVar2));
        G0 g02 = G0.f406611a;
        navBar.setActions(imageViewA);
        dVar.H(navBar);
    }

    public final void g5(com.avito.android.lib.design.bottom_sheet.d dVar, NavigationButtonType navigationButtonType) {
        dVar.N(true);
        int iOrdinal = navigationButtonType.ordinal();
        if (iOrdinal == 0) {
            dVar.y(R.drawable.ic_close_24);
            dVar.R(new c());
        } else {
            if (iOrdinal != 1) {
                return;
            }
            dVar.y(R.drawable.ic_back_24);
            dVar.R(new d());
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", SoaWithPriceArguments.class) : bundleRequireArguments.getParcelable("arguments");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SoaWithPriceArguments soaWithPriceArguments = (SoaWithPriceArguments) parcelable;
        this.f311862s0 = soaWithPriceArguments.f311844c;
        a.InterfaceC9517a interfaceC9517aA = com.avito.android.user_advert.soa_with_price.di.h.a();
        interfaceC9517aA.a((com.avito.android.user_advert.soa_with_price.di.b) C29972i.a(C29972i.b(this), com.avito.android.user_advert.soa_with_price.di.b.class));
        interfaceC9517aA.c(soaWithPriceArguments);
        interfaceC9517aA.b(getResources());
        interfaceC9517aA.build().a(this);
        E e12 = this.f311857n0;
        if (e12 == null) {
            e12 = null;
        }
        D d12 = (D) new P0(this, e12).a(D.class);
        this.f311861r0 = d12;
        if (d12.f311827M.getValue() instanceof j.c) {
            C23038g0<C35550d> c23038g0 = d12.f311826L;
            String str = d12.f311832R;
            CloseReason closeReason = d12.f311831Q;
            c23038g0.setValue(new C35550d(str, (closeReason != null ? closeReason : null).getMotivationText()));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        N2 n22 = this.f311860q0;
        if (n22 == null) {
            n22 = null;
        }
        Context contextB = n22.v().invoke().booleanValue() ? AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)) : requireContext();
        N2 n23 = this.f311860q0;
        if (n23 == null) {
            n23 = null;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextB, n23.v().invoke().booleanValue() ? R.style.Re23_BottomSheet_Default : 0);
        dVar.A(R.layout.soa_with_price_sheet_dialog, -1);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(false);
        dVar.S(C35835l0.g(contextB).y);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        D d12 = this.f311861r0;
        (d12 != null ? d12 : null).f311833S.observe(this, new o(this, dVar, 0));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f311863t0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        D d12 = this.f311861r0;
        if (d12 == null) {
            d12 = null;
        }
        d12.f311829O.e();
        d12.f311830P.e();
        super.onDestroyView();
    }
}
