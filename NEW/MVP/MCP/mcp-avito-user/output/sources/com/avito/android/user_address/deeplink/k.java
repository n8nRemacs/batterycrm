package com.avito.android.user_address.deeplink;

import android.content.Intent;
import com.avito.android.SxAddAddressSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.Metadata;

/* compiled from: UserAddressIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/k;", "", "a", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f307239a = a.f307240a;

    /* compiled from: UserAddressIntentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/deeplink/k$a;", "", "<init>", "()V", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f307240a = new a();
    }

    /* compiled from: UserAddressIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.k
    Intent a(@Y61.k String str, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink);

    @Y61.k
    Intent b(@Y61.l String str, @Y61.k String str2, double d12, double d13, @Y61.l DeepLink deepLink);

    @Y61.k
    Intent c(int i12, @Y61.k SxAddAddressSource sxAddAddressSource, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2);

    @Y61.k
    Intent d(@Y61.l DeepLink deepLink, @Y61.k UserAddressLink.BottomSheetState bottomSheetState, @Y61.l String str, @Y61.l String str2);

    @Y61.k
    Intent e(@Y61.k String str, @Y61.k String str2, int i12, double d12, double d13, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink);

    @Y61.k
    Intent f(@Y61.l String str, @Y61.k UserAddressLink.BottomSheetState bottomSheetState, @Y61.l String str2, @Y61.l DeepLink deepLink, boolean z12);

    @Y61.k
    Intent g(int i12, @Y61.l DeepLink deepLink, @Y61.l String str);

    @Y61.k
    Intent h(@Y61.l String str, int i12, @Y61.l String str2, @Y61.k SxAddAddressSource sxAddAddressSource);

    @Y61.k
    Intent i(@Y61.l String str, int i12, @Y61.l String str2, double d12, double d13, @Y61.k SxAddAddressSource sxAddAddressSource);

    @Y61.k
    Intent j(@Y61.l String str, @Y61.k String str2, double d12, double d13, @Y61.l DeepLink deepLink, boolean z12);
}
