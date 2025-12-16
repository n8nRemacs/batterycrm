package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.UserAddressActivity;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAddressMapBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_address.map.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35358k implements com.avito.android.arch.mvi.b<UserAddressMapMviInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map f307881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.map.domain.d f307882b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.map.view.e f307883c;

    @Inject
    public C35358k(@Y61.k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map, @Y61.k com.avito.android.user_address.map.domain.d dVar, @Y61.k com.avito.android.user_address.map.view.e eVar) {
        this.f307881a = map;
        this.f307882b = dVar;
        this.f307883c = eVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UserAddressMapMviInternalAction> a() {
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307881a;
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress byAddress = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress) map;
            return new kotlinx.coroutines.flow.X(C43175k.G(new C35350c(byAddress, null)), new C35351d(this, byAddress, null));
        }
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) {
            return C35372z.b(this.f307882b, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) map).f307117b);
        }
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest bySuggest = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) map;
            return new kotlinx.coroutines.flow.X(C43175k.G(new C35352e(bySuggest, null)), new C35353f(bySuggest, this, null));
        }
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short r02 = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) map;
            return new kotlinx.coroutines.flow.X(C43175k.G(new C35356i(r02, null)), new C35357j(this, r02, null));
        }
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo multiGeo = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map;
            return new kotlinx.coroutines.flow.X(C43175k.G(new C35354g(multiGeo, null)), new C35355h(this, multiGeo, null));
        }
        if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow)) {
            throw new NoWhenBranchMatchedException();
        }
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map;
        return new kotlinx.coroutines.flow.X(C43175k.G(new C35348a(sellerAddressFlow, null)), new C35349b(sellerAddressFlow, this, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
