package com.avito.android.user_address.map;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.SxAddAddressSource;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.deeplink.sx_new_address.SxAddAddressPayload;
import com.avito.android.user_address.map.UserAddressMapFragment;
import com.avito.android.user_address.map.domain.SellerAddNewAddressData;
import com.avito.android.user_address.map.mvi.Z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: UserAddressMapFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class b extends H implements l<Z, G0> {
    public final void f(@k Z z12) {
        com.avito.android.user_address.g gVar;
        UserAddressMapFragment userAddressMapFragment = (UserAddressMapFragment) this.receiver;
        UserAddressMapFragment.a aVar = UserAddressMapFragment.f307488A0;
        userAddressMapFragment.getClass();
        if (z12 instanceof Z.b) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = userAddressMapFragment.f307496u0;
            if (map == null) {
                map = null;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) {
                com.avito.android.user_address.g gVar2 = userAddressMapFragment.f307489n0;
                gVar = gVar2 != null ? gVar2 : null;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById byId = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) map;
                int i12 = byId.f307117b;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b;
                gVar.D(i12, ((Z.b) z12).f307819b, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) map).f307118c, byId.f307120e);
                return;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
                com.avito.android.user_address.g gVar3 = userAddressMapFragment.f307489n0;
                gVar = gVar3 != null ? gVar3 : null;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest bySuggest = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) map;
                int i13 = bySuggest.f307121b;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode2 = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b;
                gVar.D(i13, ((Z.b) z12).f307819b, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) map).f307125f, bySuggest.f307127h);
                return;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress) {
                com.avito.android.user_address.g gVar4 = userAddressMapFragment.f307489n0;
                (gVar4 != null ? gVar4 : null).o1(((Z.b) z12).f307819b, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b, userAddressMapFragment.f307497v0);
                return;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) {
                com.avito.android.user_address.g gVar5 = userAddressMapFragment.f307489n0;
                (gVar5 != null ? gVar5 : null).o1(((Z.b) z12).f307819b, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c, userAddressMapFragment.f307497v0);
                return;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
                com.avito.android.user_address.g gVar6 = userAddressMapFragment.f307489n0;
                com.avito.android.user_address.g gVar7 = gVar6 != null ? gVar6 : null;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo multiGeo = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map;
                String str = multiGeo.f307128b;
                NavigationController.Mode mode3 = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map).f307134h;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode4 = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b;
                gVar7.v0(str, ((Z.b) z12).f307819b, multiGeo.f307130d, mode3, multiGeo.f307133g, userAddressMapFragment.f307497v0);
                return;
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map;
                int iOrdinal = sellerAddressFlow.f307146l.ordinal();
                String str2 = sellerAddressFlow.f307136b;
                int i14 = sellerAddressFlow.f307141g;
                if (iOrdinal == 0) {
                    com.avito.android.user_address.g gVar8 = userAddressMapFragment.f307489n0;
                    gVar = gVar8 != null ? gVar8 : null;
                    SxAddAddressSource sxAddAddressSource = SxAddAddressSource.f67543b;
                    gVar.U(i14, str2, ((Z.b) z12).f307819b);
                    return;
                }
                if (iOrdinal != 1) {
                    return;
                }
                com.avito.android.user_address.g gVar9 = userAddressMapFragment.f307489n0;
                gVar = gVar9 != null ? gVar9 : null;
                SxAddAddressSource sxAddAddressSource2 = SxAddAddressSource.f67543b;
                gVar.M(str2, i14, ((Z.b) z12).f307819b, sellerAddressFlow.f307142h);
                return;
            }
            return;
        }
        if (z12 instanceof Z.a) {
            com.avito.android.user_address.g gVar10 = userAddressMapFragment.f307489n0;
            (gVar10 != null ? gVar10 : null).O();
            return;
        }
        if (z12 instanceof Z.i) {
            Z.i iVar = (Z.i) z12;
            boolean z13 = iVar.f307841b;
            String str3 = iVar.f307840a;
            if (z13) {
                ViewGroup viewGroup = userAddressMapFragment.f307501z0;
                if (viewGroup != null) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewGroup, com.avito.android.printable_text.b.f(str3), null, null, null, f.a.f125253a, -1, ToastBarPosition.f181044b, null, false, false, null, null, 3982);
                    return;
                }
                return;
            }
            Toolbar toolbar = userAddressMapFragment.f307500y0;
            if (toolbar != null) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str3);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, toolbar, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                return;
            }
            return;
        }
        if (z12 instanceof Z.h) {
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(userAddressMapFragment.requireContext(), 0, 2, null);
            dVar.C(R.layout.delete_address_bottom_sheet_dialog, new a(dVar, userAddressMapFragment));
            j.c(dVar, userAddressMapFragment.requireContext().getResources().getString(R.string.bottom_sheet_delete_address_title), true, 0, 0, 0, 120);
            com.avito.android.lib.util.g.a(dVar);
            return;
        }
        if (z12 instanceof Z.c) {
            com.avito.android.user_address.g gVar11 = userAddressMapFragment.f307489n0;
            (gVar11 != null ? gVar11 : null).Z0();
            return;
        }
        if (z12 instanceof Z.f) {
            Z.f fVar = (Z.f) z12;
            UserAddressLink.Result.Success.Added added = new UserAddressLink.Result.Success.Added(true, fVar.f307825a, fVar.f307826b, fVar.f307827c, fVar.f307828d, fVar.f307829e, fVar.f307830f, fVar.f307831g);
            com.avito.android.user_address.g gVar12 = userAddressMapFragment.f307489n0;
            (gVar12 != null ? gVar12 : null).Q(added);
            userAddressMapFragment.q5(added);
            return;
        }
        if (z12 instanceof Z.g) {
            Z.g gVar13 = (Z.g) z12;
            UserAddressLink.Result.Success.Modified modified = new UserAddressLink.Result.Success.Modified(true, gVar13.f307832a, gVar13.f307833b, gVar13.f307834c, gVar13.f307835d, gVar13.f307836e, gVar13.f307837f, gVar13.f307838g);
            com.avito.android.user_address.g gVar14 = userAddressMapFragment.f307489n0;
            (gVar14 != null ? gVar14 : null).Q(modified);
            userAddressMapFragment.q5(modified);
            return;
        }
        if (z12 instanceof Z.e) {
            Z.e eVar = (Z.e) z12;
            UserAddressLink.Result.Success.Delete delete = new UserAddressLink.Result.Success.Delete(eVar.f307822a, eVar.f307823b, eVar.f307824c, true);
            com.avito.android.user_address.g gVar15 = userAddressMapFragment.f307489n0;
            (gVar15 != null ? gVar15 : null).Q(delete);
            userAddressMapFragment.q5(delete);
            return;
        }
        if (z12 instanceof Z.d) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map2 = userAddressMapFragment.f307496u0;
            if (map2 == null) {
                map2 = null;
            }
            if (map2 instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) {
                int iOrdinal2 = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map2).f307146l.ordinal();
                SellerAddNewAddressData sellerAddNewAddressData = ((Z.d) z12).f307821a;
                int i15 = sellerAddNewAddressData.f307561g;
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        return;
                    }
                    com.avito.android.user_address.g gVar16 = userAddressMapFragment.f307489n0;
                    (gVar16 != null ? gVar16 : null).x1(sellerAddNewAddressData.f307556b, sellerAddNewAddressData.f307557c, i15, sellerAddNewAddressData.f307562h, sellerAddNewAddressData.f307563i);
                    return;
                }
                String strValueOf = String.valueOf(i15);
                SellerAddNewAddressData.Components components = sellerAddNewAddressData.f307559e;
                String str4 = components.f307564b;
                AvitoMapPoint avitoMapPoint = sellerAddNewAddressData.f307560f;
                SxAddAddressPayload sxAddAddressPayload = new SxAddAddressPayload(sellerAddNewAddressData.f307556b, strValueOf, sellerAddNewAddressData.f307558d, sellerAddNewAddressData.f307557c, new Coordinates(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude()), str4, components.f307565c, sellerAddNewAddressData.f307563i);
                ActivityC22955m activityC22955mRequireActivity = userAddressMapFragment.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("result.user_address", sxAddAddressPayload);
                G0 g02 = G0.f406611a;
                activityC22955mRequireActivity.setResult(-1, intent);
                userAddressMapFragment.requireActivity().finish();
            }
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Z z12) {
        f(z12);
        return G0.f406611a;
    }
}
