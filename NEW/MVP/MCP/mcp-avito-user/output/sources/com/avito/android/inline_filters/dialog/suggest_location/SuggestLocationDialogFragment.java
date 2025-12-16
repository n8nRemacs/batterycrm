package com.avito.android.inline_filters.dialog.suggest_location;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.inline_filters.dialog.suggest_location.SuggestLocationDialogFragment;
import com.avito.android.inline_filters.dialog.suggest_location.c;
import com.avito.android.inline_filters.dialog.suggest_location.g;
import com.avito.android.location_picker.N0;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.suggest_locations.OpenEventFromBlock;
import com.avito.android.suggest_locations.SuggestLocationsArguments;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SuggestLocationDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/SuggestLocationDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/location_picker/N0;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuggestLocationDialogFragment extends BaseDialogFragment implements N0, InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f172261l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f172262h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.android.inline_filters.dialog.suggest_location.d f172263i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f172264j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public Boolean f172265k0;

    /* compiled from: SuggestLocationDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/SuggestLocationDialogFragment$a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestLocationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/SuggestLocationDialogFragment$b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: SuggestLocationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f172267m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(0);
            this.f172267m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.suggest_location.d dVar = SuggestLocationDialogFragment.this.f172263i0;
            if (dVar != null) {
                dVar.a(Integer.valueOf(this.f172267m));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestLocationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f172268l = new d();

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

    public SuggestLocationDialogFragment() {
        super(0, 1, null);
        Bundle arguments = getArguments();
        this.f172264j0 = arguments != null ? arguments.getBoolean("key.suggest_address", false) : false;
    }

    @Override // androidx.fragment.app.DialogFragment, com.avito.android.location_picker.N0
    public final void E3(@l Radius radius) {
        Radius radiusCopy$default;
        com.avito.android.inline_filters.dialog.suggest_location.d dVar;
        if (radius != null && (radiusCopy$default = Radius.copy$default(radius, null, null, null, null, false, 31, null)) != null && (dVar = this.f172263i0) != null) {
            dVar.b(new InlineFilterValue.InlineRadiusValue(radiusCopy$default));
        }
        dismiss();
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@k AddressParameter.Value value, @l String str) {
        int i12;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i12 = arguments.getInt("key.from_block");
        } else {
            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
            i12 = -1;
        }
        com.avito.android.inline_filters.dialog.suggest_location.d dVar = this.f172263i0;
        if (dVar != null) {
            dVar.a(Integer.valueOf(i12));
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void R0() {
        int i12;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i12 = arguments.getInt("key.from_block");
        } else {
            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
            i12 = -1;
        }
        com.avito.android.inline_filters.dialog.suggest_location.d dVar = this.f172263i0;
        if (dVar != null) {
            dVar.a(Integer.valueOf(i12));
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
        this.f172263i0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f172263i0 == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName()), getTheme());
        this.f172262h0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.inline_filters_suggest_locations, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        int i12;
        Filter filter;
        SearchParams searchParams;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i12 = arguments.getInt("key.from_block");
        } else {
            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
            i12 = -1;
        }
        final int i13 = i12;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f172262h0;
        if (dVar != null) {
            dVar.T();
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("key.title") : null;
            if (string == null || C43066x.K(string)) {
                string = getString(R.string.location_suggests_header_for_only_real_locations);
            }
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, string, true, true, 2);
            dVar.K(true);
            dVar.R(new c(i13));
            dVar.f178527u = true;
            dVar.f178532z = false;
            dVar.f178512A = false;
            dVar.O(AvitoMapView.class, d.f172268l);
            dVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.avito.android.inline_filters.dialog.suggest_location.a
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i14, KeyEvent keyEvent) {
                    SuggestLocationDialogFragment.a aVar = SuggestLocationDialogFragment.f172261l0;
                    if (i14 != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    d dVar2 = this.f172269b.f172263i0;
                    if (dVar2 == null) {
                        return true;
                    }
                    e eVar = dVar2.f172273a;
                    SuggestLocationDialogFragment suggestLocationDialogFragment = eVar.f172280j;
                    if (suggestLocationDialogFragment != null) {
                        suggestLocationDialogFragment.dismiss();
                    }
                    Y41.l<Integer, G0> lVar = eVar.f172279i;
                    if (lVar == null) {
                        return true;
                    }
                    lVar.invoke(Integer.valueOf(i13));
                    return true;
                }
            });
            dVar.s();
        }
        Bundle arguments3 = getArguments();
        this.f172265k0 = (arguments3 == null || !arguments3.containsKey("key.only_real_location")) ? null : Boolean.valueOf(arguments3.getBoolean("key.only_real_location"));
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            filter = (Filter) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments4.getParcelable("key.filter", Filter.class) : arguments4.getParcelable("key.filter"));
        } else {
            filter = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            searchParams = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments5.getParcelable("key.search_parameters", SearchParams.class) : arguments5.getParcelable("key.search_parameters"));
        } else {
            searchParams = null;
        }
        Boolean bool = this.f172265k0;
        boolean z12 = this.f172264j0;
        g gVar = new g(this, filter, i13, searchParams, z12, bool);
        Fragment fragmentH = getChildFragmentManager().H("tag.suggest_location_dialog_fragment");
        Fragment fragment = fragmentH;
        if (fragmentH == null) {
            SuggestLocationsFragment.a aVar = SuggestLocationsFragment.f292138F0;
            String locationId = searchParams != null ? searchParams.getLocationId() : null;
            String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
            PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c;
            String displayTitle = filter != null ? filter.getDisplayTitle() : null;
            if (displayTitle == null) {
                displayTitle = "";
            }
            SuggestLocationsArguments suggestLocationsArguments = new SuggestLocationsArguments(locationId, categoryId, Integer.valueOf(i13), z12 ? displayTitle : null, locationPickerChooseButtonLocation, null, null, null, false, false, true, null, null, null, bool, 15328, null);
            aVar.getClass();
            SuggestLocationsFragment suggestLocationsFragmentA = SuggestLocationsFragment.a.a(suggestLocationsArguments);
            fragment = suggestLocationsFragmentA;
            if (!z12) {
                suggestLocationsFragmentA.f292143E0.observe(suggestLocationsFragmentA, new g.a(new h(gVar)));
                fragment = suggestLocationsFragmentA;
            }
        }
        if (!fragment.isAdded()) {
            H hE2 = getChildFragmentManager().e();
            hE2.j(R.id.suggest_locations_fragment_container, fragment, "tag.suggest_location_dialog_fragment", 1);
            hE2.e();
        }
        if (this.f172264j0) {
            return;
        }
        gVar.f172281a.observe(this, new c.a(new com.avito.android.inline_filters.dialog.suggest_location.b(this)));
    }
}
