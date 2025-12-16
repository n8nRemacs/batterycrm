package com.avito.android.user_address.suggest;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.suggest.UserAddressSuggestFragment;
import com.avito.android.user_address.suggest.mvi.q;
import com.avito.android.user_address.suggest.view.SuggestInputViewImpl;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressSuggestFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class b extends H implements l<q, G0> {
    @Override // Y41.l
    public final G0 invoke(q qVar) {
        com.avito.android.user_address.suggest.view.g gVar;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map sellerAddressFlow;
        q qVar2 = qVar;
        UserAddressSuggestFragment userAddressSuggestFragment = (UserAddressSuggestFragment) this.receiver;
        UserAddressSuggestFragment.a aVar = UserAddressSuggestFragment.f307999z0;
        userAddressSuggestFragment.getClass();
        if (qVar2 instanceof q.a) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests = userAddressSuggestFragment.f308009w0;
            if (suggests == null) {
                suggests = null;
            }
            if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create) {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create create = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create) suggests;
                q.a aVar2 = (q.a) qVar2;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode = create.f307158c;
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode2 = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c;
                CoordsByAddressResult.Point point = aVar2.f308147c;
                sellerAddressFlow = mode == mode2 ? new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short(aVar2.f308146b, point.getLongitude(), point.getLatitude(), create.f307159d, NavigationController.Mode.f307098b, create.f307160e) : new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress(aVar2.f308146b, point.getLongitude(), point.getLatitude(), create.f307159d, NavigationController.Mode.f307098b, false);
            } else if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit) {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit edit = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit) suggests;
                int i12 = edit.f307161b;
                q.a aVar3 = (q.a) qVar2;
                CoordsByAddressResult.Point point2 = aVar3.f308147c;
                sellerAddressFlow = new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest(i12, aVar3.f308146b, point2.getLongitude(), point2.getLatitude(), userAddressSuggestFragment.f308010x0, NavigationController.Mode.f307099c, edit.f307165f);
            } else if (suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) {
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo multiGeo = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo) suggests;
                String str = multiGeo.f307166b;
                q.a aVar4 = (q.a) qVar2;
                CoordsByAddressResult.Point point3 = aVar4.f308147c;
                sellerAddressFlow = new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo(str, aVar4.f308146b, multiGeo.f307168d, point3.getLongitude(), point3.getLatitude(), multiGeo.f307170f, multiGeo.f307169e, userAddressSuggestFragment.f308010x0);
            } else {
                if (!(suggests instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow sellerAddressFlow2 = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow) suggests;
                String str2 = sellerAddressFlow2.f307173b;
                DeepLink deepLink = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow) suggests).f307179h;
                NavigationController.Mode mode3 = NavigationController.Mode.f307098b;
                q.a aVar5 = (q.a) qVar2;
                CoordsByAddressResult.Point point4 = aVar5.f308147c;
                sellerAddressFlow = new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow(str2, null, aVar5.f308146b, point4.getLongitude(), point4.getLatitude(), sellerAddressFlow2.f307174c, sellerAddressFlow2.f307177f, sellerAddressFlow2.f307178g, mode3, deepLink, sellerAddressFlow2.f307181j);
            }
            userAddressSuggestFragment.requireActivity().getIntent().putExtra("success_url_extra", userAddressSuggestFragment.f308010x0);
            com.avito.android.user_address.g gVar2 = userAddressSuggestFragment.f308000n0;
            (gVar2 != null ? gVar2 : null).z(sellerAddressFlow);
        } else if (qVar2 instanceof q.b) {
            com.avito.android.user_address.suggest.view.g gVar3 = userAddressSuggestFragment.f308008v0;
            if (gVar3 != null) {
                q.b bVar = (q.b) qVar2;
                SuggestInputViewImpl suggestInputViewImpl = gVar3.f308164e;
                if (suggestInputViewImpl != null) {
                    String text = suggestInputViewImpl.getText();
                    String str3 = bVar.f308148a;
                    if (!L.f(text, str3)) {
                        suggestInputViewImpl.setText(str3);
                    }
                }
            }
        } else if (L.f(qVar2, q.c.f308149a)) {
            com.avito.android.user_address.suggest.view.g gVar4 = userAddressSuggestFragment.f308008v0;
            if (gVar4 != null) {
                D6.w(gVar4.f308169j);
                D6.H(gVar4.f308164e);
                D6.H(gVar4.f308165f);
                ShimmerLayout shimmerLayout = gVar4.f308167h;
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                }
                D6.w(gVar4.f308168i);
                K2.d(gVar4.f308160a, true);
                D6.w(gVar4.f308166g);
            }
        } else if (L.f(qVar2, q.d.f308150a) && (gVar = userAddressSuggestFragment.f308008v0) != null) {
            D6.w(gVar.f308169j);
            D6.H(gVar.f308164e);
            D6.H(gVar.f308165f);
            ShimmerLayout shimmerLayout2 = gVar.f308167h;
            if (shimmerLayout2 != null) {
                D6.w(shimmerLayout2);
                shimmerLayout2.d();
            }
            D6.H(gVar.f308168i);
            K2.d(gVar.f308160a, true);
            D6.w(gVar.f308166g);
        }
        return G0.f406611a;
    }
}
