package xj0;

import J81.f;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.remote.autoteka.model.AutotekaLandingResponse;
import com.avito.android.remote.model.ThirdPartyApi;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.y;

/* compiled from: AutotekaApi.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jb\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxj0/a;", "", "", "searchKey", "", "attempt", "autotekaX", "", "fromBlock", "", "utmParams", "repurchase", "Lcom/avito/android/remote/model/TypedResult;", "LHj0/c;", "c", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/autoteka/model/AutotekaLandingResponse;", "a", "(Ljava/lang/Integer;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportPublicId", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: xj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC49957a {

    /* compiled from: AutotekaApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xj0.a$a, reason: collision with other inner class name */
    public static final class C12877a {
    }

    @f("2/autoteka/landing/beduin")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object a(@l @t("fromBlock") Integer num, @u @k Map<String, String> map, @k Continuation<? super TypedResult<AutotekaLandingResponse>> continuation);

    @f("1/autoteka-on-avito/download-report-as-pdf/{reportPublicId}")
    @l
    @ThirdPartyApi
    Object b(@s("reportPublicId") @k String str, @k Continuation<? super y<ResponseBody>> continuation);

    @f("1/autoteka/preview")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object c(@t("searchKey") @k String str, @t("attempt") long j12, @t("x") @k String str2, @l @t("fromBlock") Integer num, @u @k Map<String, String> map, @l @t("repurchase") String str3, @k Continuation<? super TypedResult<Hj0.c>> continuation);
}
