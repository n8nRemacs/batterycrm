package com.avito.android.user_adverts_filters.host;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsFiltersHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/UserAdvertsFiltersHostFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/user_adverts_filters/host/c;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsFiltersHostFragment extends DialogFragment implements InterfaceC28477j.a, c {

    /* renamed from: f0, reason: collision with root package name */
    @l
    public Drawable f315954f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public Drawable f315955g0;

    /* compiled from: UserAdvertsFiltersHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f315956l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsFiltersHostFragment f315957m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bundle bundle, UserAdvertsFiltersHostFragment userAdvertsFiltersHostFragment) {
            super(1);
            this.f315956l = bundle;
            this.f315957m = userAdvertsFiltersHostFragment;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            if (this.f315956l == null) {
                UserAdvertsFiltersHostFragment userAdvertsFiltersHostFragment = this.f315957m;
                H hE2 = userAdvertsFiltersHostFragment.getChildFragmentManager().e();
                Bundle bundleRequireArguments = userAdvertsFiltersHostFragment.requireArguments();
                UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = new UserAdvertsFiltersMainMviFragment();
                userAdvertsFiltersMainMviFragment.setArguments(bundleRequireArguments);
                hE2.n(R.id.user_adverts_filters_host_container, userAdvertsFiltersMainMviFragment, null);
                hE2.f();
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void I3() {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).z(this.f315955g0);
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void a4(@k String str, @l String str2) {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).L(str, str2, true, true);
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void d2(@l Y41.a<G0> aVar) {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).N(aVar != null);
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).R(aVar);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog getDialog() {
        Dialog dialog = super.getDialog();
        if (dialog instanceof com.avito.android.lib.design.bottom_sheet.d) {
            return (com.avito.android.lib.design.bottom_sheet.d) dialog;
        }
        return null;
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void ha(@l Y41.a<G0> aVar) {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).N(aVar != null);
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).R(aVar);
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void j4() {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).z(this.f315954f0);
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void kc(@l Y41.a<G0> aVar) {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).P(aVar);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        this.f315955g0 = C35835l0.m(requireContext(), R.attr.ic_arrowBack24, R.attr.black);
        this.f315954f0 = C35835l0.m(requireContext(), R.attr.ic_close24, R.attr.black);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.C(R.layout.user_adverts_filters_host_fragment_layout, new a(bundle, this));
        dVar.S(C35835l0.i(requireContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, requireContext().getString(R.string.user_adverts_filters_default_title), true, true, 2);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{C35835l0.d(R.attr.blue600, requireContext()), C35835l0.d(R.attr.gray36, requireContext())});
        q qVar = dVar.f178530x;
        if (qVar != null) {
            qVar.p(colorStateList);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (requireActivity().isChangingConfigurations() || requireActivity().isFinishing()) {
            return;
        }
        requireActivity().finish();
    }

    @Override // com.avito.android.user_adverts_filters.host.c
    public final void x2(boolean z12) {
        ((com.avito.android.lib.design.bottom_sheet.d) requireDialog()).x(z12);
    }
}
