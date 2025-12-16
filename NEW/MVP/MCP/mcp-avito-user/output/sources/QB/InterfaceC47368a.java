package qb;

import J81.e;
import J81.o;
import J81.s;
import Y61.k;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRawResponse;
import com.avito.android.remote.model.advertising.AvitoTargetingRawResponse;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import retrofit2.y;

/* compiled from: AvitoTargetingApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J=\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H'¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqb/a;", "", "", "creativeId", "", LocalPublishState.FIELDS, "Lio/reactivex/rxjava3/core/z;", "Lretrofit2/y;", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawResponse;", "a", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse;", "b", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "", "hideReasonId", "Lkotlin/G0;", "c", "(II)Lio/reactivex/rxjava3/core/I;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC47368a {
    @o("1/adv/creative/{creativeId}")
    @e
    @InterfaceC42830m
    @X41.o
    @k
    z<y<AvitoTargetingRawResponse>> a(@s("creativeId") @k String creativeId, @J81.d @k Map<String, Object> fields);

    @o("1/adv/network/banner")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @e
    @X41.o
    @k
    I<TypedResult<AvitoNetworkBannerRawResponse>> b(@J81.d @k Map<String, Object> params);

    @o("2/adv/network/hide")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @e
    @k
    I<TypedResult<G0>> c(@J81.c("creativeId") int creativeId, @J81.c("hideReasonId") int hideReasonId);
}
