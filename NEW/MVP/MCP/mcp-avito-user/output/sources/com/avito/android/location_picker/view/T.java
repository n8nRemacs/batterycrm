package com.avito.android.location_picker.view;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.N0;
import com.avito.android.user_address.pin.BlackPinView;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LocationPickerViewImplRedesign.kt */
@com.avito.android.di.B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/T;", "Lcom/avito/android/location_picker/view/h;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class T extends AbstractC31586h {

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f182529v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public final Spinner f182530w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C31585g f182531x0;

    public /* synthetic */ T(View view, Fragment fragment, N0 n02, boolean z12, boolean z13, com.avito.android.location_picker.job.f fVar, LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, AvitoMapAttachHelper avitoMapAttachHelper, AvitoMapTarget avitoMapTarget, com.avito.android.location_picker.providers.z zVar, boolean z14, K0 k02, String str, int i12, C42822w c42822w) {
        this(view, fragment, n02, z12, z13, fVar, locationPickerChooseButtonLocation, avitoMapAttachHelper, avitoMapTarget, zVar, (i12 & 1024) != 0 ? false : z14, k02, str);
    }

    @Override // com.avito.android.location_picker.view.InterfaceC31579a
    @Y61.k
    public final l41.g<Boolean> A() {
        return this.f182531x0;
    }

    @Override // com.avito.android.location_picker.view.AbstractC31586h, com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        super.onMapAttach(avitoMap);
        AvitoMap avitoMap2 = this.f182610m;
        if (avitoMap2 != null) {
            AvitoMapUiSettings uiSettings = avitoMap2.getUiSettings();
            uiSettings.isMyLocationButtonEnabled(true);
            uiSettings.isZoomControlsEnabled(false);
            uiSettings.isCompassEnabled(false);
            uiSettings.isRotateGesturesEnabled(false);
            uiSettings.isFastTapEnabled(true);
            avitoMap2.addMoveStartListener(new Q(this));
            avitoMap2.addMoveEndListener(new S(this));
        }
        this.f182569I.accept(G0.f406611a);
    }

    @Inject
    public T(@Y61.k View view, @Y61.k Fragment fragment, @Y61.k N0 n02, @com.avito.android.location_picker.di.w boolean z12, @com.avito.android.location_picker.di.a boolean z13, @Y61.k com.avito.android.location_picker.job.f fVar, @Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.l AvitoMapTarget avitoMapTarget, @Y61.k com.avito.android.location_picker.providers.z zVar, @com.avito.android.location_picker.di.y boolean z14, @Y61.k K0 k02, @com.avito.android.location_picker.di.v @Y61.l String str) {
        super(view, fragment, n02, z12, z13, fVar, locationPickerChooseButtonLocation, avitoMapAttachHelper, avitoMapTarget, zVar, z14, k02, true, str);
        this.f182529v0 = z12;
        BlackPinView blackPinView = (BlackPinView) view.findViewById(R.id.pin_view);
        this.f182530w0 = (Spinner) view.findViewById(R.id.circular_progress);
        AvitoMap avitoMap = this.f182610m;
        if (avitoMap != null && blackPinView != null) {
            avitoMap.addMoveStartListener(blackPinView);
            avitoMap.addMoveEndListener(blackPinView);
        }
        this.f182531x0 = new C31585g(this, 14);
    }
}
