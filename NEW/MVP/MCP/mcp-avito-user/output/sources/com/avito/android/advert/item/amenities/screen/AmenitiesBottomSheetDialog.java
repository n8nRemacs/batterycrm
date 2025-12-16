package com.avito.android.advert.item.amenities.screen;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.amenities.di.g;
import com.avito.android.advert.item.amenities.screen.items.amenity_row.AmenityRowItem;
import com.avito.android.advert.item.amenities.screen.items.c;
import com.avito.android.advert.item.amenities.screen.items.header.AmenityHeaderItem;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35976x4;
import com.avito.konveyor.adapter.d;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AmenitiesBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/AmenitiesBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmenitiesBottomSheetDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f72765k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public d f72766h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public c f72767i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.amenities.screen.items.a f72768j0;

    /* compiled from: AmenitiesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/AmenitiesBottomSheetDialog$a;", "", "<init>", "()V", "", "AMENITIES_KEY", "Ljava/lang/String;", "TAG", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public AmenitiesBottomSheetDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        g.a().create().a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23);
        View viewInflate = LayoutInflater.from(dVar).inflate(R.layout.amenities_bottom_sheet, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.amenities);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        C35976x4.a(recyclerView);
        c cVar = this.f72767i0;
        if (cVar == null) {
            cVar = null;
        }
        recyclerView.l(cVar, -1);
        d dVar2 = this.f72766h0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView.setAdapter(dVar2);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Bundle arguments = getArguments();
        Iterable<Amenities.AmenityGroup> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("amenities_key") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        d dVar3 = this.f72766h0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        com.avito.android.advert.item.amenities.screen.items.a aVar = this.f72768j0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Amenities.AmenityGroup amenityGroup : parcelableArrayList) {
            ArrayList arrayList2 = new ArrayList();
            String title = amenityGroup.getTitle();
            if (title != null) {
                arrayList2.add(new AmenityHeaderItem(String.valueOf(title.hashCode()), title));
            }
            List<Amenities.Amenity> listC = amenityGroup.c();
            if (listC != null) {
                List<Amenities.Amenity> list = listC;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                for (Amenities.Amenity amenity : list) {
                    arrayList3.add(Boolean.valueOf(arrayList2.add(new AmenityRowItem(String.valueOf(amenity.hashCode()), amenity.getIcon(), amenity.getTitle(), amenity.getPrice()))));
                }
            }
            C42745f0.h(arrayList2, arrayList);
        }
        dVar3.l(arrayList, null);
        com.avito.android.lib.design.bottom_sheet.d dVar4 = new com.avito.android.lib.design.bottom_sheet.d(dVar, 0, 2, null);
        dVar4.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar4, getString(R.string.advert_details_amenity_screen_title), true, true, 2);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar4, true);
        return dVar4;
    }
}
