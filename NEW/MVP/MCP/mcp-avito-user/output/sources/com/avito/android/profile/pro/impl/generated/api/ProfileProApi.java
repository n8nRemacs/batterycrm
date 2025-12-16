package com.avito.android.profile.pro.impl.generated.api;

import J81.c;
import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.parse.adapter.stream_gson.b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import x90.C49797a;
import y90.C50087a;
import z90.G;

/* compiled from: ProfileProApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/ProfileProApi;", "", "", "geoSessionId", "", "isPro", "Lcom/avito/android/remote/model/TypedResult;", "Lz90/G;", "profileTabV1", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "widgetSlugs", "Lx90/a;", "api2SellersDashboardDataPost", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly90/a;", "proEnabledV3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes16.dex */
public interface ProfileProApi {
    @o("2/sellers/dashboard/data")
    @b
    @InterfaceC39938c
    @e
    @l
    Object api2SellersDashboardDataPost(@c("widgetSlugs") @k List<String> list, @k Continuation<? super TypedResult<C49797a>> continuation);

    @f("3/pro/enabled")
    @b
    @InterfaceC39938c
    @l
    Object proEnabledV3(@k Continuation<? super TypedResult<C50087a>> continuation);

    @f("1/profile/tab")
    @b
    @InterfaceC39938c
    @J81.k({"X-Employeemode-required: true"})
    @l
    Object profileTabV1(@l @t("geoSessionId") String str, @l @t("isPro") Boolean bool, @k Continuation<? super TypedResult<G>> continuation);
}
