package EA0;

import GA0.d;
import J81.f;
import J81.o;
import J81.t;
import RA0.e;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SxAddressApi.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\f\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00022\b\b\u0001\u0010\f\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0001\u0010 \u001a\u00020\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\"\u0010\u001fJ \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\b\b\u0001\u0010\f\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b(\u0010\nJ \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b*\u0010\nJ8\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\b\b\u0001\u0010 \u001a\u00020\u00062\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b-\u0010.J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b0\u0010\u0014J \u00102\u001a\b\u0012\u0004\u0012\u0002010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b2\u0010\n¨\u00063"}, d2 = {"LEA0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LIA0/b;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sellerAddressId", "LTA0/a;", "h", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LFA0/a;", "request", "LFA0/e;", "l", "(LFA0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "esid", "LGA0/d;", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJA0/b;", "LJA0/a;", "b", "(LJA0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKA0/b;", "LKA0/a;", "d", "(LKA0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LLA0/a;", "g", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verticalId", "LRA0/e;", "k", "LQA0/b;", "LQA0/a;", "e", "(LQA0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LNA0/a;", "a", "LSA0/a;", "m", "flowType", "LPA0/a;", "f", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LHA0/d;", "n", "LMA0/a;", "c", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @f("1/verification/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("sellerAddressId") long j12, @k Continuation<? super TypedResult<NA0.a>> continuation);

    @o("1/seller/address/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @k JA0.b bVar, @k Continuation<? super TypedResult<JA0.a>> continuation);

    @f("2/seller/address/editInfo")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object c(@t("sellerAddressId") long j12, @k Continuation<? super TypedResult<MA0.a>> continuation);

    @o("1/seller/address/edit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object d(@J81.a @k KA0.b bVar, @k Continuation<? super TypedResult<KA0.a>> continuation);

    @o("1/seller/address/revalidate")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object e(@J81.a @k QA0.b bVar, @k Continuation<? super TypedResult<QA0.a>> continuation);

    @f("2/publish/address/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object f(@t("verticalId") long j12, @l @t("flowType") String str, @l @t("esid") String str2, @k Continuation<? super TypedResult<PA0.a>> continuation);

    @f("1/seller/address/editInfo")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object g(@t("sellerAddressId") long j12, @l @t("esid") String str, @k Continuation<? super TypedResult<LA0.a>> continuation);

    @o("1/file/upsert")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object h(@t("sellerAddressId") long j12, @k Continuation<? super TypedResult<TA0.a>> continuation);

    @f("1/seller/address/addInfo")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object i(@l @t("esid") String str, @k Continuation<? super TypedResult<d>> continuation);

    @f("1/addresses/links")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object j(@k Continuation<? super TypedResult<IA0.b>> continuation);

    @f("1/seller/address/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object k(@t("verticalId") long j12, @l @t("esid") String str, @k Continuation<? super TypedResult<e>> continuation);

    @o("1/seller/address/add")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true", "X-Employeemode-required: true"})
    @l
    Object l(@J81.a @k FA0.a aVar, @k Continuation<? super TypedResult<FA0.e>> continuation);

    @o("1/verification/submit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object m(@t("sellerAddressId") long j12, @k Continuation<? super TypedResult<SA0.a>> continuation);

    @f("2/seller/address/addInfo")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true", "X-Employeemode-required: true"})
    @l
    Object n(@l @t("esid") String str, @k Continuation<? super TypedResult<HA0.d>> continuation);
}
