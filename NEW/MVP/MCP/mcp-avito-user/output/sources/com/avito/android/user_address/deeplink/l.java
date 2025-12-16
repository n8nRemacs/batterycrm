package com.avito.android.user_address.deeplink;

import android.content.Context;
import android.content.Intent;
import com.avito.android.SxAddAddressSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/deeplink/l;", "Lcom/avito/android/user_address/deeplink/k;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f307241b;

    /* compiled from: UserAddressIntentFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f307242a;

        static {
            int[] iArr = new int[UserAddressLink.BottomSheetState.values().length];
            try {
                iArr[UserAddressLink.BottomSheetState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserAddressLink.BottomSheetState.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f307242a = iArr;
        }
    }

    @Inject
    public l(@Y61.k Context context) {
        this.f307241b = context;
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink) {
        UserAddressActivity.UserAddressActivityOpenParams userAddressActivityOpenParams = new UserAddressActivity.UserAddressActivityOpenParams(null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo(str, "", null, NavigationController.Mode.f307098b, flowType, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c, deepLink));
        UserAddressActivity.f307102p.getClass();
        return UserAddressActivity.a.a(this.f307241b, userAddressActivityOpenParams, deepLink);
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent b(@Y61.l String str, @Y61.k String str2, double d12, double d13, @Y61.l DeepLink deepLink) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(str != null ? new UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId(str) : null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short(str2, d12, d13, deepLink, NavigationController.Mode.f307098b, false, 32, null)));
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent c(int i12, @Y61.k SxAddAddressSource sxAddAddressSource, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow(str, i12, str2 == null ? "" : str2, null, bool, sxAddAddressSource, null, null, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307148c, 128, null)));
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent d(@Y61.l DeepLink deepLink, @Y61.k UserAddressLink.BottomSheetState bottomSheetState, @Y61.l String str, @Y61.l String str2) {
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode;
        UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId geoSessionId = str != null ? new UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId(str) : null;
        int i12 = a.f307242a[bottomSheetState.ordinal()];
        if (i12 == 1) {
            mode = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mode = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c;
        }
        UserAddressActivity.UserAddressActivityOpenParams userAddressActivityOpenParams = new UserAddressActivity.UserAddressActivityOpenParams(geoSessionId, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List(null, str2, mode, 1, null));
        UserAddressActivity.f307102p.getClass();
        return UserAddressActivity.a.a(this.f307241b, userAddressActivityOpenParams, deepLink);
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent e(@Y61.k String str, @Y61.k String str2, int i12, double d12, double d13, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink) {
        UserAddressActivity.UserAddressActivityOpenParams userAddressActivityOpenParams = new UserAddressActivity.UserAddressActivityOpenParams(null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo(str, str2, Integer.valueOf(i12), d12, d13, flowType, NavigationController.Mode.f307099c, deepLink));
        UserAddressActivity.f307102p.getClass();
        return UserAddressActivity.a.a(this.f307241b, userAddressActivityOpenParams, deepLink);
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent f(@Y61.l String str, @Y61.k UserAddressLink.BottomSheetState bottomSheetState, @Y61.l String str2, @Y61.l DeepLink deepLink, boolean z12) {
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode;
        UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId geoSessionId = str != null ? new UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId(str) : null;
        int i12 = a.f307242a[bottomSheetState.ordinal()];
        if (i12 == 1) {
            mode = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mode = UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c;
        }
        UserAddressActivity.UserAddressActivityOpenParams userAddressActivityOpenParams = new UserAddressActivity.UserAddressActivityOpenParams(geoSessionId, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.Create(str2, mode, deepLink, z12));
        UserAddressActivity.f307102p.getClass();
        return UserAddressActivity.a.a(this.f307241b, userAddressActivityOpenParams, deepLink);
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent g(int i12, @Y61.l DeepLink deepLink, @Y61.l String str) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(str != null ? new UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId(str) : null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById(i12, deepLink, NavigationController.Mode.f307099c, true)));
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent h(@Y61.l String str, int i12, @Y61.l String str2, @Y61.k SxAddAddressSource sxAddAddressSource) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow(str, i12, str2 == null ? "" : str2, null, Boolean.TRUE, sxAddAddressSource, null, null, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307147b, 128, null)));
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent i(@Y61.l String str, int i12, @Y61.l String str2, double d12, double d13, @Y61.k SxAddAddressSource sxAddAddressSource) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow(str, null, str2 == null ? "" : str2, d12, d13, i12, Boolean.TRUE, sxAddAddressSource, NavigationController.Mode.f307098b, null, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307147b)));
    }

    @Override // com.avito.android.user_address.deeplink.k
    @Y61.k
    public final Intent j(@Y61.l String str, @Y61.k String str2, double d12, double d13, @Y61.l DeepLink deepLink, boolean z12) {
        return UserAddressActivity.a.b(UserAddressActivity.f307102p, this.f307241b, new UserAddressActivity.UserAddressActivityOpenParams(str != null ? new UserAddressActivity.UserAddressActivityOpenParams.GeoSessionId(str) : null, new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress(str2, d12, d13, deepLink, NavigationController.Mode.f307098b, z12)));
    }
}
