package com.avito.android.advert.item.amenities;

import androidx.core.os.C22777e;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.amenities.screen.AmenitiesBottomSheetDialog;
import com.avito.android.hotel.model.Amenities;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAmenitiesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsAmenitiesItem f72744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f72745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem, e eVar) {
        super(0);
        this.f72744l = advertDetailsAmenitiesItem;
        this.f72745m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem = this.f72744l;
        List<Amenities.AmenityGroup> list = advertDetailsAmenitiesItem.f72737h;
        if (list != null) {
            e eVar = this.f72745m;
            Z0 z02 = eVar.f72759c;
            if (z02 != null) {
                AmenitiesBottomSheetDialog.f72765k0.getClass();
                AmenitiesBottomSheetDialog amenitiesBottomSheetDialog = new AmenitiesBottomSheetDialog();
                amenitiesBottomSheetDialog.setArguments(C22777e.b(new Q("amenities_key", list)));
                AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
                com.avito.android.lib.util.g.b(amenitiesBottomSheetDialog, advertDetailsFragment.requireContext(), advertDetailsFragment.getChildFragmentManager(), "amenities_screen");
            }
            String str = advertDetailsAmenitiesItem.f72736g;
            if (str == null) {
                str = "";
            }
            eVar.f72758b.s(str);
        }
        return G0.f406611a;
    }
}
