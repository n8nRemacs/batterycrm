package com.avito.android.inline_filters.dialog.addresses;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.dialog.addresses.f;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.search.AddressFilterValue;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/inline_filters/dialog/addresses/SuggestAddressesDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuggestAddressesDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f171148k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.suggest_addresses.b f171149h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f171150i0;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public com.avito.android.inline_filters.dialog.addresses.c f171151j0;

    /* compiled from: SuggestAddressesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/addresses/SuggestAddressesDialogFragment$a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestAddressesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/addresses/SuggestAddressesDialogFragment$b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: SuggestAddressesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.addresses.c cVar = SuggestAddressesDialogFragment.this.f171151j0;
            if (cVar != null) {
                com.avito.android.inline_filters.dialog.addresses.d dVar = cVar.f171154a;
                SuggestAddressesDialogFragment suggestAddressesDialogFragment = dVar.f171159h;
                if (suggestAddressesDialogFragment != null) {
                    suggestAddressesDialogFragment.dismiss();
                }
                dVar.f171158g.invoke(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestAddressesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f171153l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(View view, MotionEvent motionEvent) {
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int left = view2.getLeft();
            int right = view2.getRight();
            int iB2 = kotlin.math.b.b(motionEvent2.getX());
            boolean z12 = left <= iB2 && iB2 <= right;
            int top = view2.getTop() + iArr[1];
            int bottom = view2.getBottom() + iArr[1];
            int iB3 = kotlin.math.b.b(motionEvent2.getY());
            return Boolean.valueOf((z12 && (top <= iB3 && iB3 <= bottom)) ? false : true);
        }
    }

    /* compiled from: SuggestAddressesDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<List<? extends SuggestAddress>, G0> {
        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(List<? extends SuggestAddress> list) {
            SuggestAddressesDialogFragment suggestAddressesDialogFragment = (SuggestAddressesDialogFragment) this.receiver;
            a aVar = SuggestAddressesDialogFragment.f171148k0;
            suggestAddressesDialogFragment.getClass();
            List<? extends SuggestAddress> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (SuggestAddress suggestAddress : list2) {
                arrayList.add(new AddressFilterValue(suggestAddress.getId(), suggestAddress.getAddress(), suggestAddress.getLocality(), suggestAddress.getParamId(), suggestAddress.getKind()));
            }
            InlineFilterValue.InlineFilterAddressesValue inlineFilterAddressesValue = new InlineFilterValue.InlineFilterAddressesValue(arrayList);
            com.avito.android.inline_filters.dialog.addresses.c cVar = suggestAddressesDialogFragment.f171151j0;
            if (cVar != null) {
                com.avito.android.inline_filters.dialog.addresses.d dVar = cVar.f171154a;
                SuggestAddressesDialogFragment suggestAddressesDialogFragment2 = dVar.f171159h;
                if (suggestAddressesDialogFragment2 != null) {
                    suggestAddressesDialogFragment2.dismiss();
                }
                dVar.f171157f.invoke(dVar.f171155d, inlineFilterAddressesValue);
            }
            return G0.f406611a;
        }
    }

    public SuggestAddressesDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        this.f171151j0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.inline_filters.dialog.addresses.di.a.a().a((com.avito.android.suggest_addresses.di.e) C29972i.a(C29972i.b(this), com.avito.android.suggest_addresses.di.e.class)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@l Bundle bundle) {
        super.onActivityCreated(bundle);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171150i0;
        if (dVar != null) {
            Window window = dVar.getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            dVar.T();
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("key.title") : null;
            if (string == null) {
                string = "";
            }
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, string, true, true, 2);
            dVar.K(true);
            dVar.R(new c());
            dVar.f178527u = true;
            dVar.z(C35835l0.k(R.drawable.common_ic_arrow_back_24, dVar.getContext()));
            dVar.f178532z = false;
            dVar.f178512A = false;
            dVar.O(AvitoMapView.class, d.f171153l);
            dVar.s();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f171151j0 == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName()), getTheme());
        this.f171150i0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.inline_filters_suggest_addresses, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        List<AddressFilterValue> selectedItems;
        super.onViewCreated(view, bundle);
        com.avito.android.suggest_addresses.b bVar = this.f171149h0;
        ?? arrayList = 0;
        arrayList = 0;
        if (bVar == null) {
            bVar = null;
        }
        Bundle arguments = getArguments();
        Filter filter = arguments != null ? (Filter) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key.filter", Filter.class) : arguments.getParcelable("key.filter")) : null;
        Bundle arguments2 = getArguments();
        SearchParams searchParams = arguments2 != null ? (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments2.getParcelable("key.search_parameters", SearchParams.class) : arguments2.getParcelable("key.search_parameters")) : null;
        f fVar = new f(this, bVar, filter, searchParams);
        Fragment fragmentH = getChildFragmentManager().H("tag.suggest_addresses_dialog_fragment");
        Fragment fragment = fragmentH;
        if (fragmentH == null) {
            String locationId = searchParams != null ? searchParams.getLocationId() : null;
            InlineFilterValue value = filter != null ? filter.getValue() : null;
            InlineFilterValue.InlineFilterAddressesValue inlineFilterAddressesValue = value instanceof InlineFilterValue.InlineFilterAddressesValue ? (InlineFilterValue.InlineFilterAddressesValue) value : null;
            if (inlineFilterAddressesValue != null && (selectedItems = inlineFilterAddressesValue.getSelectedItems()) != null) {
                List<AddressFilterValue> list = selectedItems;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                for (AddressFilterValue addressFilterValue : list) {
                    arrayList.add(new SuggestAddress(addressFilterValue.getId(), addressFilterValue.getAddress(), addressFilterValue.getLocality(), addressFilterValue.getParamId(), addressFilterValue.getKind(), null, 32, null));
                }
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
            SuggestAddressesFragment suggestAddressesFragmentA = fVar.f171161a.a(new SuggestAddressesParams(locationId, arrayList, true));
            suggestAddressesFragmentA.getF291783A0().observe(suggestAddressesFragmentA, new f.a(new g(fVar)));
            fragment = suggestAddressesFragmentA;
        }
        if (!fragment.isAdded()) {
            androidx.fragment.app.H hE2 = getChildFragmentManager().e();
            hE2.j(R.id.suggest_addresses_fragment_container, fragment, "tag.suggest_addresses_dialog_fragment", 1);
            hE2.e();
        }
        fVar.f171162b = new e(1, this, SuggestAddressesDialogFragment.class, "observeSelectedLocation", "observeSelectedLocation(Ljava/util/List;)V", 0);
    }
}
