package com.avito.android.advert_amenities;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.advert_amenities.amenity.c;
import com.avito.android.advert_amenities.dialog.CloseAmenitiesDialogItem;
import com.avito.android.advert_amenities.dialog.f;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.konveyor.adapter.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AmenitiesBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_amenities/AmenitiesBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmenitiesBottomSheetDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f81125k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public d f81126h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public c f81127i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public f f81128j0;

    /* compiled from: AmenitiesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/advert_amenities/AmenitiesBottomSheetDialog$a;", "", "<init>", "()V", "", "AMENITIES_KEY", "Ljava/lang/String;", "CLOSE_POPUP_BTN_KEY", "TAG", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AmenitiesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            AmenitiesBottomSheetDialog.this.dismiss();
            return G0.f406611a;
        }
    }

    public AmenitiesBottomSheetDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.advert_amenities.di.f.a().create().a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        AttributedText attributedText;
        ?? arrayList;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23);
        C42822w c42822w = null;
        View viewInflate = LayoutInflater.from(dVar).inflate(R.layout.advert_amenities_public_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.amenities);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        d dVar2 = this.f81126h0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView.setAdapter(dVar2);
        int i12 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Bundle arguments = getArguments();
        ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("reusable_amenities_key") : null;
        f fVar = this.f81128j0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(new b());
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            attributedText = (AttributedText) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments2.getParcelable("reusable_close_popup_btn_key", AttributedText.class) : arguments2.getParcelable("reusable_close_popup_btn_key"));
        } else {
            attributedText = null;
        }
        CloseAmenitiesDialogItem closeAmenitiesDialogItem = attributedText != null ? new CloseAmenitiesDialogItem(String.valueOf(attributedText.hashCode()), attributedText) : null;
        if (parcelableArrayList != null) {
            c cVar = this.f81127i0;
            if (cVar == null) {
                cVar = null;
            }
            arrayList = new ArrayList(C42745f0.q(parcelableArrayList, 10));
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.a((Amenities.Amenity) it.next()));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        ArrayList arrayListH0 = C42745f0.h0(C42745f0.V(closeAmenitiesDialogItem), (Collection) arrayList);
        d dVar3 = this.f81126h0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        dVar3.l(arrayListH0, null);
        com.avito.android.lib.design.bottom_sheet.d dVar4 = new com.avito.android.lib.design.bottom_sheet.d(dVar, i12, 2, c42822w);
        dVar4.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar4, null, false, true, 2);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar4, true);
        return dVar4;
    }
}
