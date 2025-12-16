package Cl0;

import Dl0.C13413c;
import J81.f;
import J81.i;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SearchApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J²\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LCl0/a;", "", "", "userAgent", "xRequestId", "", "itemId", "offset", "limit", SearchParamsConverterKt.LOCATION_ID, "key", "context", "categoryId", "", "forceLocation", "locationForcedByUser", "showedPageCount", "xHash", "Lcom/avito/android/remote/model/TypedResult;", "LDl0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Cl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13319a {
    @f("3/main/shortVideos")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true", "X-Supported-Features-required: true"})
    @l
    Object a(@i("User-Agent") @l String str, @i("X-Request-Id") @l String str2, @l @t("itemId") Long l12, @l @t("offset") Long l13, @l @t("limit") Long l14, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l15, @l @t("key") String str3, @l @t("context") String str4, @l @t("categoryId") Long l16, @l @t("forceLocation") Boolean bool, @l @t("locationForcedByUser") Boolean bool2, @l @t("showedPageCount") Long l17, @l @t("xHash") String str5, @Y61.k Continuation<? super TypedResult<C13413c>> continuation);
}
