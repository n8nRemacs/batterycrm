package com.avito.android.services_transportation_widget.location_sheet;

import Fc1.DialogInterfaceOnShowListenerC13648j6;
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
import android.view.Window;
import androidx.core.view.L0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.location_picker.N0;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.location_sheet.e;
import com.avito.android.services_transportation_widget.location_sheet.f;
import com.avito.android.suggest_locations.SuggestLocationsArguments;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationLocationSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/ServiceTransportationLocationSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/location_picker/N0;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceTransportationLocationSheet extends BaseDialogFragment implements N0, InterfaceC28477j.a {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f280664j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f280665h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.android.services_transportation_widget.location_sheet.a f280666i0;

    /* compiled from: ServiceTransportationLocationSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/ServiceTransportationLocationSheet$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceTransportationLocationSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/ServiceTransportationLocationSheet$b;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: ServiceTransportationLocationSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.services_transportation_widget.location_sheet.a aVar = ServiceTransportationLocationSheet.this.f280666i0;
            if (aVar != null) {
                aVar.a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceTransportationLocationSheet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f280668l = new d();

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

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/w0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Window f280669b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f280670c;

        public e(Window window, View view) {
            this.f280669b = window;
            this.f280670c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f280670c;
            Window window = this.f280669b;
            if (window != null) {
                new L0(window, view).g(8);
            } else {
                K2.k(view, 3);
            }
        }
    }

    public ServiceTransportationLocationSheet() {
        super(0, 1, null);
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@k AddressParameter.Value value, @l String str) {
        com.avito.android.services_transportation_widget.location_sheet.a aVar = this.f280666i0;
        if (aVar != null) {
            Coordinates coordinates = new Coordinates(value.getLat(), value.getLng());
            String text = value.getText();
            if (text == null) {
                text = "";
            }
            aVar.b(new ServiceTransportationWidget.LocationField.LocationValue(coordinates, text));
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void R0() {
        if (getChildFragmentManager().L() > 0) {
            getChildFragmentManager().Y();
            return;
        }
        com.avito.android.services_transportation_widget.location_sheet.a aVar = this.f280666i0;
        if (aVar != null) {
            aVar.a();
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
        this.f280666i0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@l Bundle bundle) {
        super.onActivityCreated(bundle);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f280665h0;
        if (dVar != null) {
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
            dVar.f178532z = false;
            dVar.f178512A = true;
            dVar.O(AvitoMapView.class, d.f280668l);
            dVar.s();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f280666i0 == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), getTheme());
        this.f280665h0 = dVar;
        dVar.setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(dVar, 4));
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.service_transportation_widget_location_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        String str;
        Fragment fragment;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key.query") : null;
        if (string == null) {
            string = "";
        }
        String str2 = string;
        f fVar = new f(this, str2);
        Fragment fragmentH = getChildFragmentManager().H("tag.suggest_location_dialog_fragment");
        if (fragmentH == null) {
            SuggestLocationsFragment.a aVar = SuggestLocationsFragment.f292138F0;
            String str3 = null;
            str = "tag.suggest_location_dialog_fragment";
            SuggestLocationsArguments suggestLocationsArguments = new SuggestLocationsArguments(null, null, null, str2, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, new PublishIntentFactory.SuggestLocationsFlowType.SingleFlow(R.id.suggest_locations_fragment_container), null, null, true, false, true, str3, str3, null, null, 31424, null);
            aVar.getClass();
            SuggestLocationsFragment suggestLocationsFragmentA = SuggestLocationsFragment.a.a(suggestLocationsArguments);
            suggestLocationsFragmentA.f292143E0.observe(suggestLocationsFragmentA, new f.a(new g(fVar)));
            fragment = suggestLocationsFragmentA;
        } else {
            str = "tag.suggest_location_dialog_fragment";
            fragment = fragmentH;
        }
        if (!fragment.isAdded()) {
            H hE2 = getChildFragmentManager().e();
            hE2.j(R.id.suggest_locations_fragment_container, fragment, str, 1);
            hE2.e();
        }
        fVar.f280678a.observe(this, new e.a(new com.avito.android.services_transportation_widget.location_sheet.d(this)));
    }
}
