package com.avito.android.related_products.bottom_sheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RelatedProductsBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "<init>", "()V", "a", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NotMarkedActivityOrFragmentWithPerf"})
/* loaded from: classes16.dex */
public final class RelatedProductsBottomSheetFragment extends BaseDialogFragment {

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final a f252827i0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f252828h0;

    /* compiled from: RelatedProductsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetFragment$a;", "", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RelatedProductsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            RelatedProductsBottomSheetFragment.this.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: RelatedProductsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetFragment$c", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.lib.design.bottom_sheet.d {
    }

    public RelatedProductsBottomSheetFragment() {
        super(0, 1, null);
        this.f252828h0 = new b();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        c cVar = new c(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(cVar, null, false, true, 7);
        cVar.setCancelable(true);
        cVar.setCanceledOnTouchOutside(true);
        return cVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_related_products_empty, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        ScreenTransfer screenTransfer;
        super.onViewCreated(view, bundle);
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(true);
        dVar.J(true);
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                screenTransfer = (ScreenTransfer) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("SCREEN_TRANSFER_KEY", ScreenTransfer.class) : arguments.getParcelable("SCREEN_TRANSFER_KEY"));
            } else {
                screenTransfer = null;
            }
            RelatedProductsPageFragment.f252830w0.getClass();
            RelatedProductsPageFragment relatedProductsPageFragment = new RelatedProductsPageFragment();
            C35966w1.a(relatedProductsPageFragment, -1, new w(screenTransfer));
            relatedProductsPageFragment.f252838v0 = this.f252828h0;
            H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.content_container, relatedProductsPageFragment, null);
            hE2.e();
        }
    }
}
