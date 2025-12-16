package com.avito.android.inline_filters.dialog.metro;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.inline_filters.dialog.metro.b;
import com.avito.android.inline_filters.dialog.metro.i;
import com.avito.android.location_picker.N0;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.MetroFilterValue;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.select.new_metro.SelectMetroFragment;
import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MetroSelectDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/MetroSelectDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/location_picker/N0;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MetroSelectDialogFragment extends BaseDialogFragment implements N0, InterfaceC28477j.a {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f171850j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f171851h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.android.inline_filters.dialog.metro.d f171852i0;

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/MetroSelectDialogFragment$a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/MetroSelectDialogFragment$b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.metro.d dVar = MetroSelectDialogFragment.this.f171852i0;
            if (dVar != null) {
                com.avito.android.inline_filters.dialog.metro.c cVar = dVar.f171866a;
                MetroSelectDialogFragment metroSelectDialogFragment = cVar.f171864i;
                if (metroSelectDialogFragment != null) {
                    metroSelectDialogFragment.dismiss();
                }
                cVar.f171862g.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f171854l = new d();

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

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.metro.d dVar = MetroSelectDialogFragment.this.f171852i0;
            if (dVar != null) {
                dVar.a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f171856l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h hVar) {
            super(0);
            this.f171856l = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            D<G0> d12 = this.f171856l.f171872d;
            G0 g02 = G0.f406611a;
            d12.setValue(g02);
            return g02;
        }
    }

    public MetroSelectDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, com.avito.android.location_picker.N0
    public final void E3(@l Radius radius) {
        Radius radiusCopy$default;
        com.avito.android.inline_filters.dialog.metro.d dVar;
        if (radius != null && (radiusCopy$default = Radius.copy$default(radius, null, null, null, null, false, 31, null)) != null && (dVar = this.f171852i0) != null) {
            dVar.b(new InlineFilterValue.InlineRadiusValue(radiusCopy$default));
        }
        dismiss();
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@k AddressParameter.Value value, @l String str) {
        com.avito.android.inline_filters.dialog.metro.d dVar = this.f171852i0;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void R0() {
        com.avito.android.inline_filters.dialog.metro.d dVar = this.f171852i0;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void T3() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", requireActivity().getPackageName(), null));
        startActivity(intent);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        this.f171852i0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f171852i0 == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName()), getTheme());
        this.f171851h0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.inline_filters_dialog_redesign_location_picker, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        ArrayList arrayList;
        List<MetroFilterValue> selectedItems;
        String categoryId;
        String locationId;
        Integer numY0;
        super.onViewCreated(view, bundle);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171851h0;
        if (dVar != null) {
            dVar.T();
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
            dVar.K(true);
            dVar.R(new c());
            dVar.f178527u = true;
            dVar.f178532z = false;
            dVar.f178512A = false;
            dVar.O(AvitoMapView.class, d.f171854l);
            dVar.s();
        }
        Bundle arguments = getArguments();
        Filter filter = arguments != null ? (Filter) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key.filter", Filter.class) : arguments.getParcelable("key.filter")) : null;
        Bundle arguments2 = getArguments();
        MetroResponseBody metroResponseBody = arguments2 != null ? (MetroResponseBody) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments2.getParcelable("key.metro_data", MetroResponseBody.class) : arguments2.getParcelable("key.metro_data")) : null;
        Bundle arguments3 = getArguments();
        SearchParams searchParams = arguments3 != null ? (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments3.getParcelable("key.search_parameters", SearchParams.class) : arguments3.getParcelable("key.search_parameters")) : null;
        h hVar = new h(view, this, filter, metroResponseBody, searchParams);
        Fragment fragmentH = getChildFragmentManager().H("tag.metro_select_dialog_fragment");
        Fragment fragment = fragmentH;
        if (fragmentH == null) {
            SelectMetroFragment.a aVar = SelectMetroFragment.f265914C0;
            int iIntValue = (searchParams == null || (locationId = searchParams.getLocationId()) == null || (numY0 = C43066x.y0(locationId)) == null) ? -1 : numY0.intValue();
            Integer numY02 = (searchParams == null || (categoryId = searchParams.getCategoryId()) == null) ? null : C43066x.y0(categoryId);
            InlineFilterValue value = filter != null ? filter.getValue() : null;
            InlineFilterValue.InlineFilterMetroValue inlineFilterMetroValue = value instanceof InlineFilterValue.InlineFilterMetroValue ? (InlineFilterValue.InlineFilterMetroValue) value : null;
            if (inlineFilterMetroValue == null || (selectedItems = inlineFilterMetroValue.getSelectedItems()) == null) {
                arrayList = null;
            } else {
                List<MetroFilterValue> list = selectedItems;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                for (MetroFilterValue metroFilterValue : list) {
                    arrayList.add(new Metro(String.valueOf(metroFilterValue.getId()), metroFilterValue.getName(), null));
                }
            }
            SelectMetroParams selectMetroParams = new SelectMetroParams(hVar.f171869a, SearchParamsConverterKt.METRO_ID, iIntValue, numY02, null, false, arrayList == null ? C42784z0.f406748b : arrayList, true);
            aVar.getClass();
            SelectMetroFragment selectMetroFragmentA = SelectMetroFragment.a.a(selectMetroParams);
            selectMetroFragmentA.f265923z0.observe(selectMetroFragmentA, new i.a(new com.avito.android.inline_filters.dialog.metro.f(hVar)));
            selectMetroFragmentA.f265915A0.observe(selectMetroFragmentA, new i.a(new g(hVar)));
            selectMetroFragmentA.f265916B0 = hVar.f171872d;
            fragment = selectMetroFragmentA;
        }
        if (!fragment.isAdded()) {
            H hE2 = getChildFragmentManager().e();
            hE2.j(R.id.location_picker_fragment_container, fragment, "tag.metro_select_dialog_fragment", 1);
            hE2.e();
        }
        hVar.f171871c.observe(this, new b.a(new com.avito.android.inline_filters.dialog.metro.a(this)));
        Bundle arguments4 = getArguments();
        String string = arguments4 != null ? arguments4.getString("key.title") : null;
        if (string == null) {
            string = "";
        }
        hVar.setTitle(string);
        hVar.Qd(new e());
        hVar.Sd(new f(hVar));
        Bundle arguments5 = getArguments();
        hVar.Ud(arguments5 != null ? arguments5.getBoolean("key.reset_is_clickable") : true);
    }
}
