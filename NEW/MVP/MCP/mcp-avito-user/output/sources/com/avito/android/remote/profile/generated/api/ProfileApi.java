package com.avito.android.remote.profile.generated.api;

import J81.c;
import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import Yk0.C18273a;
import Zk0.C19571a;
import bl0.C25675a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.parse.adapter.stream_gson.b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ProfileApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\\\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/profile/generated/api/ProfileApi;", "", "", "sessionId", "Lcom/avito/android/remote/model/TypedResult;", "LYk0/a;", "api2ProfileFinanceGet", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromHost", "gibSessionId", "", "isAdd", "", "provider", "socialUserId", "suggestKey", "Lbl0/a;", "socialRedirectV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "platform", "page", "position", "LZk0/a;", "api3InternalBannerRotationBannersGet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes11.dex */
public interface ProfileApi {
    @f("2/profile/finance")
    @b
    @InterfaceC39938c
    @l
    Object api2ProfileFinanceGet(@l @t("sessionId") String str, @k Continuation<? super TypedResult<C18273a>> continuation);

    @f("3/internalBannerRotation/banners")
    @b
    @InterfaceC39938c
    @l
    Object api3InternalBannerRotationBannersGet(@t("platform") @k String str, @t("page") @k String str2, @l @t("position") String str3, @k Continuation<? super TypedResult<C19571a>> continuation);

    @o("2/social/redirect")
    @b
    @InterfaceC39938c
    @e
    @l
    Object socialRedirectV2(@c("fromHost") @l String str, @c("gibSessionId") @l String str2, @c("isAdd") @l Boolean bool, @c("provider") long j12, @c("socialUserId") @l String str3, @c("suggestKey") @l String str4, @k Continuation<? super TypedResult<C25675a>> continuation);
}
