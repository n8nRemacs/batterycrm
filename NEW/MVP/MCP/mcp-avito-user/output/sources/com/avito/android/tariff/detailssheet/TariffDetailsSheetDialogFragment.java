package com.avito.android.tariff.detailssheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23040h0;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.tariff.detailssheet.vm.l;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffDetailsSheetDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/detailssheet/TariffDetailsSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class TariffDetailsSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f297395n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public l f297396h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f297397i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextView f297398j0;

    /* renamed from: k0, reason: collision with root package name */
    public ViewGroup f297399k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f297400l0;

    /* renamed from: m0, reason: collision with root package name */
    public Button f297401m0;

    /* compiled from: TariffDetailsSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/detailssheet/TariffDetailsSheetDialogFragment$a;", "", "<init>", "()V", "", "KEY_DEEPLINK", "Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffDetailsSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment = (TariffDetailsSheetDialogFragment) this.receiver;
            a aVar = TariffDetailsSheetDialogFragment.f297395n0;
            tariffDetailsSheetDialogFragment.getClass();
            tariffDetailsSheetDialogFragment.f297398j0 = (TextView) view.findViewById(R.id.tariff_details_sheet_description);
            tariffDetailsSheetDialogFragment.f297399k0 = (ViewGroup) view.findViewById(R.id.tariff_details_sheet_loading_container);
            tariffDetailsSheetDialogFragment.f297401m0 = (Button) view.findViewById(R.id.tariff_details_sheet_button);
            ViewGroup viewGroup = tariffDetailsSheetDialogFragment.f297399k0;
            com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup == null ? null : viewGroup, R.id.tariff_details_sheet_content, null, 0, 0, 28, null);
            lVar.f231600j = new com.avito.android.tariff.detailssheet.b(tariffDetailsSheetDialogFragment);
            tariffDetailsSheetDialogFragment.f297400l0 = lVar;
            Button button = tariffDetailsSheetDialogFragment.f297401m0;
            (button != null ? button : null).setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(tariffDetailsSheetDialogFragment, 23));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: TariffDetailsSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f297402b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f297402b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f297402b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f297402b;
        }

        public final int hashCode() {
            return this.f297402b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f297402b.invoke(obj);
        }
    }

    public TariffDetailsSheetDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.l
    /* renamed from: f5, reason: merged with bridge method [inline-methods] */
    public final com.avito.android.lib.design.bottom_sheet.d getDialog() {
        Dialog dialog = super.getDialog();
        if (dialog instanceof com.avito.android.lib.design.bottom_sheet.d) {
            return (com.avito.android.lib.design.bottom_sheet.d) dialog;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable(Constants.DEEPLINK, DeepLink.class) : arguments.getParcelable(Constants.DEEPLINK));
            if (deepLink != null) {
                com.avito.android.tariff.detailssheet.di.a.a().a(this, (com.avito.android.tariff.detailssheet.di.b) C29972i.a(C29972i.b(this), com.avito.android.tariff.detailssheet.di.b.class), deepLink).a(this);
                return;
            }
        }
        throw new IllegalStateException("deeplink must be set");
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.E(R.layout.fragment_details_sheet_dialog, true, new b(1, this, TariffDetailsSheetDialogFragment.class, "setupViews", "setupViews(Landroid/view/View;)V", 0));
        dVar.setCancelable(true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, true, 0, 0, 0, 125);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        l lVar = this.f297396h0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.f297453Q.observe(requireActivity(), new c(new com.avito.android.tariff.detailssheet.c(this)));
        l lVar2 = this.f297396h0;
        (lVar2 != null ? lVar2 : null).f297454R.observe(requireActivity(), new c(new d(this)));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (requireActivity().isChangingConfigurations() || requireActivity().isFinishing()) {
            return;
        }
        requireActivity().setResult(0);
        requireActivity().finish();
    }
}
