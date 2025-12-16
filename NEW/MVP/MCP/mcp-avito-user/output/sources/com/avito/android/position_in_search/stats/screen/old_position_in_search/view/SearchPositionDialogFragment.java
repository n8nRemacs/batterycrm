package com.avito.android.position_in_search.stats.screen.old_position_in_search.view;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment;
import com.avito.android.position_in_search.stats.view.SearchPositionParams;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/SearchPositionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionDialogFragment extends DialogFragment implements InterfaceC28477j.a {

    /* renamed from: f0, reason: collision with root package name */
    @k
    public static final a f220693f0 = new a(null);

    /* compiled from: SearchPositionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/SearchPositionDialogFragment$a;", "", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SearchPositionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f220694l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SearchPositionDialogFragment f220695m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bundle bundle, SearchPositionDialogFragment searchPositionDialogFragment) {
            super(1);
            this.f220694l = bundle;
            this.f220695m = searchPositionDialogFragment;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            if (this.f220694l == null) {
                a aVar = SearchPositionDialogFragment.f220693f0;
                SearchPositionDialogFragment searchPositionDialogFragment = this.f220695m;
                H hE2 = searchPositionDialogFragment.getChildFragmentManager().e();
                SearchPositionFragment.a aVar2 = SearchPositionFragment.f220696x0;
                SearchPositionParams.a aVar3 = SearchPositionParams.f221755d;
                Bundle bundleRequireArguments = searchPositionDialogFragment.requireArguments();
                aVar3.getClass();
                SearchPositionParams searchPositionParams = (SearchPositionParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("position_in_search.stats.search_position_params_key", SearchPositionParams.class) : bundleRequireArguments.getParcelable("position_in_search.stats.search_position_params_key"));
                if (searchPositionParams == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar2.getClass();
                SearchPositionFragment searchPositionFragment = new SearchPositionFragment();
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("position_in_search.stats.search_position_params_key", searchPositionParams);
                searchPositionFragment.setArguments(bundle);
                hE2.n(R.id.search_position_dialog_root_container, searchPositionFragment, null);
                hE2.e();
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.C(R.layout.position_in_search_stats_dialog_fragment_layout, new b(bundle, this));
        dVar.S(C35835l0.i(requireContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.getF21241d().c();
    }
}
