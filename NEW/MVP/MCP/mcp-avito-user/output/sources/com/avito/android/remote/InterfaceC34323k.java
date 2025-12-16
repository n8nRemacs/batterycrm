package com.avito.android.remote;

import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.Shortcuts;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.internal.http2.Http2;

/* compiled from: BxContentApi.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u008e\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b\u001c\u0010\u001dJò\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u008e\u0001\u0010(\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b(\u0010)J(\u0010+\u001a\u00020*2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b+\u0010,J¼\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0001\u0010-\u001a\u00020\u00022\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b5\u00106J,\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001a2\b\b\u0001\u00107\u001a\u00020\u00022\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/avito/android/remote/k;", "", "", "beduinComponents", "beduinAgent", PresentationTypeKt.PRESENTATION_TYPE, "", "page", "", "lastStamp", "context", "pageId", "", "searchParams", "", "forcedLocationForRecommendation", "buyerFromPage", "onboardingId", "displayType", "layoutRange", "suggestLocationId", "id", "isBegin", "limit", "searchHash", "headers", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/BxContentResult;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", SearchParamsConverterKt.LOCATION_ID, "feedId", "filters", "locationForcedByUser", "showedPageCount", "withPageConstructor", "fromPage", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/Shortcuts;", "c", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemIds", "src", "notificationMessageId", "notificationId", "launchId", "groupId", "campaignId", "categoryId", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "Lkotlin/G0;", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.k, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34323k {

    /* compiled from: BxContentApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.k$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object, java.util.Map] */
        public static Object a(InterfaceC34323k interfaceC34323k, String str, String str2, Integer num, Long l12, String str3, String str4, Map map, Boolean bool, String str5, String str6, String str7, String str8, Boolean bool2, Integer num2, String str9, SuspendLambda suspendLambda, int i12) {
            return interfaceC34323k.a(str, "contract=Avito; platform=Android; version=26.0", str2, num, l12, str3, str4, map, bool, str5, (i12 & 1024) != 0 ? null : str6, str7, (i12 & 4096) != 0 ? null : str8, (i12 & 8192) != 0 ? null : bool2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2, (i12 & 32768) != 0 ? null : str9, W0.f253058a, suspendLambda);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, java.util.Map] */
        public static Object b(InterfaceC34323k interfaceC34323k, String str, String str2, Integer num, Long l12, String str3, String str4, Map map, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, Integer num2, String str11, SuspendLambda suspendLambda, int i12) {
            return interfaceC34323k.e((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : "contract=Avito; platform=Android; version=26.0", str2, num, l12, str3, str4, map, bool, str5, (i12 & 1024) != 0 ? null : str6, str7, str8, (i12 & 8192) != 0 ? null : str9, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10, (32768 & i12) != 0 ? null : bool2, (65536 & i12) != 0 ? null : num2, (i12 & 131072) != 0 ? null : str11, W0.f253058a, suspendLambda);
        }
    }

    @J81.f("11/long/items")
    @Y61.l
    Object a(@J81.i("Beduin-Components") @Y61.k String str, @J81.i("Beduin-Agent") @Y61.k String str2, @Y61.l @J81.t(PresentationTypeKt.PRESENTATION_TYPE) String str3, @Y61.l @J81.t("page") Integer num, @Y61.l @J81.t("lastStamp") Long l12, @Y61.l @J81.t("context") String str4, @Y61.l @J81.t("pageId") String str5, @J81.u @Y61.k Map<String, String> map, @Y61.l @J81.t("forceLocation") Boolean bool, @Y61.l @J81.t("buyer_from_page") String str6, @Y61.l @J81.t("onboardingId") String str7, @Y61.l @J81.t("display") String str8, @Y61.l @J81.t("itemIds") String str9, @Y61.l @J81.t("isBegin") Boolean bool2, @Y61.l @J81.t("limit") Integer num2, @Y61.l @J81.t("searchHash") String str10, @J81.j @Y61.k Map<String, String> map2, @Y61.k Continuation<? super TypedResult<BxContentResult>> continuation);

    @com.avito.android.offlinization.C(timeoutMs = 6200)
    @J81.f("3/main/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC42830m
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object b(@J81.i("Beduin-Components") @Y61.k String str, @J81.i("Beduin-Agent") @Y61.k String str2, @com.avito.android.offlinization.k @Y61.l @J81.t("offset") Integer num, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str3, @com.avito.android.offlinization.l(defaultValue = "personal_infinite_feed") @Y61.l @J81.t("feedId") String str4, @J81.u @Y61.k Map<String, String> map, @com.avito.android.offlinization.k @Y61.l @J81.t("locationForcedByUser") Boolean bool, @Y61.l @J81.t("showedPageCount") Integer num2, @Y61.l @J81.t("withPageConstructor") Boolean bool2, @Y61.l @J81.t("fromPage") String str5, @Y61.k Continuation<? super BxContentResult> continuation);

    @com.avito.android.offlinization.C(timeoutMs = 7500)
    @J81.f("5/main/shortcuts")
    @InterfaceC42830m
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object c(@Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str, @com.avito.android.offlinization.k @Y61.l @J81.t("locationForcedByUser") Boolean bool, @Y61.k Continuation<? super Shortcuts> continuation);

    @com.avito.android.offlinization.C(timeoutMs = 3200)
    @J81.f("11/items")
    @Y61.l
    Object d(@J81.t("itemIds") @Y61.k String str, @Y61.l @J81.t("src") String str2, @Y61.l @J81.t("notificationMessageId") String str3, @Y61.l @J81.t("notificationId") String str4, @Y61.l @J81.t("launchId") String str5, @Y61.l @J81.t("groupId") String str6, @Y61.l @J81.t("campaignId") String str7, @com.avito.android.offlinization.k @Y61.l @J81.t("display") String str8, @Y61.l @J81.t("categoryId") String str9, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str10, @Y61.l @J81.t("fromPage") String str11, @com.avito.android.offlinization.k @Y61.l @J81.t("layoutRange") String str12, @com.avito.android.offlinization.k @Y61.l @J81.t("context") String str13, @Y61.l @J81.t("suggestLocationId") String str14, @Y61.k Continuation<? super TypedResult<BxContentResult>> continuation);

    @com.avito.android.offlinization.C(timeoutMs = 3200)
    @J81.f("11/items")
    @Y61.l
    Object e(@J81.i("Beduin-Components") @Y61.l String str, @J81.i("Beduin-Agent") @Y61.l String str2, @Y61.l @J81.t(PresentationTypeKt.PRESENTATION_TYPE) String str3, @Y61.l @J81.t("page") Integer num, @Y61.l @J81.t("lastStamp") Long l12, @com.avito.android.offlinization.k @Y61.l @J81.t("context") String str4, @Y61.l @J81.t("pageId") String str5, @J81.u @Y61.k @com.avito.android.offlinization.n(excludeQuery = {"areNotificationsEnabled", "viewPort[width]", "viewPort[height]"}) Map<String, String> map, @Y61.l @J81.t("forceLocation") Boolean bool, @Y61.l @J81.t("buyer_from_page") String str6, @com.avito.android.offlinization.k @Y61.l @J81.t("onboardingId") String str7, @com.avito.android.offlinization.k @Y61.l @J81.t("display") String str8, @com.avito.android.offlinization.k @Y61.l @J81.t("layoutRange") String str9, @Y61.l @J81.t("suggestLocationId") String str10, @Y61.l @J81.t("itemIds") String str11, @Y61.l @J81.t("isBegin") Boolean bool2, @Y61.l @J81.t("limit") Integer num2, @Y61.l @J81.t("searchHash") String str12, @J81.j @Y61.k Map<String, String> map2, @Y61.k Continuation<? super TypedResult<BxContentResult>> continuation);

    @J81.f("1/recent_query_search/hide")
    @Y61.l
    Object f(@J81.t("query") @Y61.k String str, @Y61.l @J81.t("categoryId") String str2, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);
}
