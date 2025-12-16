package com.avito.android.position_in_search.stats.screen.position_in_search.sort_dialog;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortBody;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SearchInPositionSortDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/sort_dialog/SearchInPositionSortDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchInPositionSortDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f221538h0 = new a(null);

    /* compiled from: SearchInPositionSortDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/sort_dialog/SearchInPositionSortDialogFragment$a;", "", "<init>", "()V", "", "KEY_PIS_SORT_DIALOG_EXTRA_DATA", "Ljava/lang/String;", "KEY_PIS_SORT_DIALOG_EXTRA_SLUG", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SearchInPositionSortDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SearchPositionSortBody f221539l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f221540m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f221541n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SearchInPositionSortDialogFragment f221542o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SearchPositionSortBody searchPositionSortBody, String str, com.avito.android.lib.design.bottom_sheet.d dVar, SearchInPositionSortDialogFragment searchInPositionSortDialogFragment) {
            super(2);
            this.f221539l = searchPositionSortBody;
            this.f221540m = str;
            this.f221541n = dVar;
            this.f221542o = searchInPositionSortDialogFragment;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(447128898, new c(this.f221539l, this.f221540m, this.f221541n, this.f221542o), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public SearchInPositionSortDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    @SuppressLint({"HardcodeStringDetector"})
    public final Dialog onCreateDialog(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            SearchPositionSortBody searchPositionSortBody = (SearchPositionSortBody) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("pis_sort_dialog_extra_data", SearchPositionSortBody.class) : arguments.getParcelable("pis_sort_dialog_extra_data"));
            if (searchPositionSortBody != null) {
                Bundle arguments2 = getArguments();
                String string = arguments2 != null ? arguments2.getString("pis_sort_dialog_extra_slug") : null;
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
                ComposeView composeView = new ComposeView(dVar.getContext(), null, 0, 6, null);
                composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                composeView.setContent(new C22096n(-728660249, new b(searchPositionSortBody, string, dVar, this), true));
                dVar.setContentView(composeView);
                return dVar;
            }
        }
        throw new IllegalArgumentException("pis_sort_dialog_extra_data - must be not null");
    }
}
