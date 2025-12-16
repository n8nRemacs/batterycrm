package com.avito.android.remote;

import com.avito.android.remote.model.MapOnboardingResponse;
import com.avito.android.remote.model.MarkersResponse;
import com.avito.android.remote.model.PinAdvertsResult;
import com.avito.android.remote.model.SaveDrawAreaResponse;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MapApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000f\u0010\u0010Jb\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00032\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00032\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001b\u0010\u001aJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/n0;", "", "", "", "searchParams", "", "viewPortWidth", "viewPortHeight", SearchParamsConverterKt.DRAW_ID, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/MarkersResponse;", "b", "(Ljava/util/Map;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drawArea", "Lcom/avito/android/remote/model/SaveDrawAreaResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "limit", "searchHash", "", "isBegin", "params", "context", "Lcom/avito/android/remote/model/PinAdvertsResult;", "c", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lcom/avito/android/remote/model/MapOnboardingResponse;", "d", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.n0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34333n0 {

    /* compiled from: MapApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.n0$a */
    public static final class a {
    }

    @J81.o("1/saveDrawArea")
    @J81.e
    @Y61.l
    Object a(@J81.c("drawArea") @Y61.l String str, @Y61.k Continuation<? super TypedResult<SaveDrawAreaResponse>> continuation);

    @J81.o("1/map/markers")
    @J81.e
    @Y61.l
    Object b(@J81.d @Y61.k Map<String, String> map, @J81.c("viewPort[width]") int i12, @J81.c("viewPort[height]") int i13, @J81.c(SearchParamsConverterKt.DRAW_ID) @Y61.l String str, @Y61.k Continuation<? super TypedResult<MarkersResponse>> continuation);

    @J81.f("2/search/map/items")
    @Y61.l
    Object c(@J81.t("id") @Y61.k String str, @J81.t("limit") int i12, @J81.t("searchHash") @Y61.k String str2, @Y61.l @J81.t("isBegin") Boolean bool, @J81.u @Y61.k Map<String, String> map, @Y61.l @J81.t("context") String str3, @Y61.k Continuation<? super TypedResult<PinAdvertsResult>> continuation);

    @J81.f("1/map/onboarding")
    @Y61.l
    @InterfaceC39937b
    Object d(@J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<MapOnboardingResponse>> continuation);

    @J81.f("2/long/search/map/items")
    @Y61.l
    Object e(@J81.t("id") @Y61.k String str, @J81.t("limit") int i12, @J81.t("searchHash") @Y61.k String str2, @Y61.l @J81.t("isBegin") Boolean bool, @J81.u @Y61.k Map<String, String> map, @Y61.l @J81.t("context") String str3, @Y61.k Continuation<? super TypedResult<PinAdvertsResult>> continuation);
}
