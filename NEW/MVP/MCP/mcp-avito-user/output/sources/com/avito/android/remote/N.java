package com.avito.android.remote;

import com.avito.android.remote.model.ExtendedProfilePhoneResponse;
import com.avito.android.remote.model.ExtendedProfileResult;
import com.avito.android.remote.model.ExtendedProfileSearchPageResult;
import com.avito.android.remote.model.ExtendedProfileSearchResult;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.ProfileAdvertsResult;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.ThirdPartyApi;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ExtendedProfileApi.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JZ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJl\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010\u0016\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u001c\u0010\u001dJz\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010\u0016\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\u001f\u0010 JN\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b#\u0010$JD\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b'\u0010(J,\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/avito/android/remote/N;", "", "", "userKey", "contextId", SearchParamsConverterKt.LOCATION_ID, "", "searchParams", "Lcom/avito/android/remote/model/FloatingBuyBlock;", "floatingBuyBlock", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ExtendedProfileResult;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/FloatingBuyBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offset", "limit", "shortcut", "profileSession", "Lcom/avito/android/remote/model/ProfileAdvertsResult;", "f", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "page", "withoutCorrection", "fromPage", "", "noProfileCategoryTree", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult;", "c", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profileItemSelectionScenario", "d", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/ExtendedProfileSearchPageResult;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromSpace", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface N {

    /* compiled from: ExtendedProfileApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/user/{userKey}/extended-profile/call")
    @Y61.l
    Object a(@J81.s("userKey") @Y61.k String str, @Y61.l @J81.t("context") String str2, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f("1/user/{userKey}/extended-profile/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @Y61.l
    Object b(@J81.s("userKey") @Y61.k String str, @Y61.l @J81.t("context") String str2, @Y61.l @J81.t("s") String str3, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<ExtendedProfileSearchPageResult>> continuation);

    @J81.f("1/user/profile/items")
    @Y61.l
    Object c(@J81.t("page") int i12, @J81.t("limit") int i13, @Y61.l @J81.t("cd") Integer num, @Y61.l @J81.t("profileSession") String str, @Y61.l @J81.t("fromPage") String str2, @Y61.l @J81.t("noProfileCategoryTree") Boolean bool, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<ExtendedProfileSearchResult>> continuation);

    @J81.f("1/extended-profile/items")
    @Y61.l
    Object d(@J81.t("page") int i12, @J81.t("limit") int i13, @Y61.l @J81.t("cd") Integer num, @Y61.l @J81.t("profileSession") String str, @Y61.l @J81.t("fromPage") String str2, @Y61.l @J81.t("noProfileCategoryTree") Boolean bool, @J81.t("profileItemSelectionScenario") @Y61.k String str3, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<ExtendedProfileSearchResult>> continuation);

    @J81.f("2/user/{userKey}/extended-profile/phone")
    @Y61.l
    Object e(@J81.s("userKey") @Y61.k String str, @Y61.l @J81.t("context") String str2, @Y61.l @J81.t("profileSession") String str3, @Y61.l @J81.t("from_space") String str4, @Y61.k Continuation<? super TypedResult<ExtendedProfilePhoneResponse>> continuation);

    @J81.f("1/user/{userKey}/profile/items")
    @Y61.l
    @ThirdPartyApi
    Object f(@J81.s("userKey") @Y61.k String str, @Y61.l @J81.t("offset") Integer num, @Y61.l @J81.t("limit") Integer num2, @Y61.l @J81.t("shortcut") String str2, @Y61.l @J81.t("context") String str3, @Y61.l @J81.t("profileSession") String str4, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super ProfileAdvertsResult> continuation);

    @J81.f("3/user/{userKey}/extended-profile")
    @Y61.l
    Object g(@J81.s("userKey") @Y61.k String str, @Y61.l @J81.t("context") String str2, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str3, @J81.u @Y61.k Map<String, String> map, @Y61.l @J81.t("floatingBuyBlock") FloatingBuyBlock floatingBuyBlock, @Y61.k Continuation<? super TypedResult<ExtendedProfileResult>> continuation);
}
