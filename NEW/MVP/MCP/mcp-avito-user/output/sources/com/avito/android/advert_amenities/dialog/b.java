package com.avito.android.advert_amenities.dialog;

import Y61.k;
import Y61.l;
import androidx.core.os.C22777e;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.advert_amenities.AmenitiesBottomSheetDialog;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AmenitiesBottomSheetDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_amenities/dialog/b;", "Lcom/avito/android/advert_amenities/dialog/a;", "<init>", "()V", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.advert_amenities.dialog.a
    public final void a(@k ArrayList<Amenities.Amenity> arrayList, @l AttributedText attributedText, @k BaseFragment baseFragment) {
        AmenitiesBottomSheetDialog.f81125k0.getClass();
        AmenitiesBottomSheetDialog amenitiesBottomSheetDialog = new AmenitiesBottomSheetDialog();
        amenitiesBottomSheetDialog.setArguments(C22777e.b(new Q("reusable_amenities_key", arrayList), new Q("reusable_close_popup_btn_key", attributedText)));
        com.avito.android.lib.util.g.b(amenitiesBottomSheetDialog, baseFragment.requireContext(), baseFragment.getChildFragmentManager(), "reusable_amenities_screen");
    }
}
