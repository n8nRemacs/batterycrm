package com.avito.android.inline_filters.dialog.search_radius;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.location_picker.N0;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocationPickerDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/LocationPickerDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/location_picker/N0;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationPickerDialogFragment extends BaseDialogFragment implements N0, InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f171982j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f171983h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.android.inline_filters.dialog.search_radius.c f171984i0;

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/LocationPickerDialogFragment$a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/LocationPickerDialogFragment$b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.search_radius.c cVar = LocationPickerDialogFragment.this.f171984i0;
            if (cVar != null) {
                com.avito.android.inline_filters.dialog.search_radius.b bVar = cVar.f171996a;
                LocationPickerDialogFragment locationPickerDialogFragment = bVar.f171994i;
                if (locationPickerDialogFragment != null) {
                    locationPickerDialogFragment.dismiss();
                }
                bVar.f171992g.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f171986l = new d();

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

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.search_radius.c cVar = LocationPickerDialogFragment.this.f171984i0;
            if (cVar != null) {
                cVar.a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationPickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.inline_filters.dialog.search_radius.c cVar = LocationPickerDialogFragment.this.f171984i0;
            if (cVar != null) {
                cVar.b(new InlineFilterValue.InlineRadiusValue(null));
            }
            return G0.f406611a;
        }
    }

    public LocationPickerDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, com.avito.android.location_picker.N0
    public final void E3(@l Radius radius) {
        Radius radiusCopy$default;
        com.avito.android.inline_filters.dialog.search_radius.c cVar;
        if (radius != null && (radiusCopy$default = Radius.copy$default(radius, null, null, null, null, false, 31, null)) != null && (cVar = this.f171984i0) != null) {
            cVar.b(new InlineFilterValue.InlineRadiusValue(radiusCopy$default));
        }
        dismiss();
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@k AddressParameter.Value value, @l String str) {
        com.avito.android.inline_filters.dialog.search_radius.c cVar = this.f171984i0;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void R0() {
        com.avito.android.inline_filters.dialog.search_radius.c cVar = this.f171984i0;
        if (cVar != null) {
            cVar.a();
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
        this.f171984i0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f171984i0 == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName()), getTheme());
        this.f171983h0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.inline_filters_dialog_redesign_location_picker, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r32, @Y61.l android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.search_radius.LocationPickerDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
