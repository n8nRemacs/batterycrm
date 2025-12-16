package dl0;

import J81.e;
import J81.f;
import J81.i;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.publish.generated.api.api_1_publish_item_restriction_check_get.Flow;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import el0.C40125a;
import fl0.C40437a;
import gl0.C40702a;
import hl0.C40957a;
import il0.C41422a;
import il0.C41423b;
import jl0.C42396a;
import kl0.C42710a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ll0.C43790a;
import ml0.C44094a;
import ml0.p;
import nl0.C44443b;
import ol0.C44817a;
import pl0.C47109a;
import ql0.C47414a;

/* compiled from: PublishApi.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0014\u001a\u00020\n2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\b\b\u0001\u0010 \u001a\u00020\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b#\u0010$J@\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00062\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020%2\b\b\u0001\u0010(\u001a\u00020\u00022\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b+\u0010,J \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u000fH§@¢\u0006\u0004\b-\u0010\u0013J\u0082\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00103\u001a\u0004\u0018\u00010%2\n\b\u0001\u00104\u001a\u0004\u0018\u00010%2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b8\u00109J \u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00062\b\b\u0001\u0010;\u001a\u00020:H§@¢\u0006\u0004\b=\u0010>J:\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00062\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\bC\u0010DJ \u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00062\b\b\u0001\u0010;\u001a\u00020EH§@¢\u0006\u0004\bG\u0010HJ \u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00062\b\b\u0001\u0010;\u001a\u00020IH§@¢\u0006\u0004\bK\u0010LJ,\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00062\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010;\u001a\u00020NH§@¢\u0006\u0004\bP\u0010QJ.\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00062\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\bT\u0010U¨\u0006V"}, d2 = {"Ldl0/a;", "", "", "oldPrice", "newPrice", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lel0/a;", "o", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isGenerated", "isManualChanged", "m", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uid", "Lol0/a;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRewriteButton", "position", "text", "Lpl0/a;", "i", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lcom/avito/android/remote/publish/generated/api/api_1_publish_item_restriction_check_get/Flow;", MessageBody.SystemMessageBody.Platform.FLOW, "Lfl0/a;", "e", "(Ljava/lang/String;Lcom/avito/android/remote/publish/generated/api/api_1_publish_item_restriction_check_get/Flow;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verticalId", "esid", "Lkl0/a;", "c", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "price", "selectedSubsidyAmount", "Lgl0/a;", "l", "(DDJLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "publishSessionId", "vacancyTitle", "salaryFrom", "salaryTo", "periodId", "lat", AddressParameter.Value.LNG, "profession", "schedule", "Lql0/a;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnl0/b;", "request", "Lnl0/e;", "n", "(Lnl0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryId", "name", "phone", "Lhl0/a;", "f", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lml0/a;", "Lml0/p;", "a", "(Lml0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lll0/a;", "Lll0/f;", "j", "(Lll0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userAgent", "Lil0/b;", "Lil0/a;", "k", "(Ljava/lang/String;Lil0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "regnum", "Ljl0/a;", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: dl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC39749a {
    @o("4/cpt/estimate")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C44094a c44094a, @k Continuation<? super TypedResult<p>> continuation);

    @o("1/job/cv/llm/workPlaces/history/responsibilities/previous")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("uid") @k String str, @k Continuation<? super TypedResult<C44817a>> continuation);

    @f("1/publish/address/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object c(@t("verticalId") long j12, @l @t("esid") String str, @k Continuation<? super TypedResult<C42710a>> continuation);

    @f("2/job/vacancy/market_salary")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@l @t("publishSessionId") String str, @l @t("vacancyTitle") String str2, @l @t("salaryFrom") Long l12, @l @t("salaryTo") Long l13, @l @t("periodId") Long l14, @l @t("lat") Double d12, @l @t(AddressParameter.Value.LNG) Double d13, @l @t("profession") Long l15, @l @t("schedule") Long l16, @k Continuation<? super TypedResult<C47414a>> continuation);

    @f("1/publish-item-restriction/check")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@t("type") @k String str, @t(MessageBody.SystemMessageBody.Platform.FLOW) @k Flow flow, @l @t("itemId") Long l12, @k Continuation<? super TypedResult<C40437a>> continuation);

    @o("3/cpa/create_request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object f(@J81.c("categoryId") @l Long l12, @J81.c("name") @l String str, @J81.c("phone") @l String str2, @k Continuation<? super TypedResult<C40957a>> continuation);

    @f("4/publish/parameters/suggest/vin/by_reg_num")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Infm-Version-required: true"})
    @l
    Object g(@i("User-Agent") @l String str, @l @t("regnum") String str2, @k Continuation<? super TypedResult<C42396a>> continuation);

    @o("2/job/enrichment/feedback")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object h(@J81.c("text") @k String str, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/job/cv/llm/workPlaces/responsibilities/improve")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object i(@J81.c("isRewriteButton") boolean z12, @J81.c("position") @l String str, @J81.c("text") @k String str2, @J81.c("uid") @k String str3, @k Continuation<? super TypedResult<C47109a>> continuation);

    @o("4/cpt/estimate/edit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object j(@J81.a @k C43790a c43790a, @k Continuation<? super TypedResult<ll0.f>> continuation);

    @o("4/publish/parameters/suggest/reg_num/by_photo")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Infm-Version-required: true"})
    @l
    Object k(@i("User-Agent") @l String str, @J81.a @k C41423b c41423b, @k Continuation<? super TypedResult<C41422a>> continuation);

    @o("2/delivery/subsidy/settings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object l(@J81.c("latitude") double d12, @J81.c("longitude") double d13, @J81.c("price") long j12, @J81.c("selectedSubsidyAmount") @l Long l12, @k Continuation<? super TypedResult<C40702a>> continuation);

    @o("1/job/cv/llm/workPlaces/analytic/send")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object m(@J81.c("isGenerated") boolean z12, @J81.c("isManualChanged") boolean z13, @k Continuation<? super TypedResult<Object>> continuation);

    @o("2/params/suggest")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Infm-Version-required: true"})
    @l
    Object n(@J81.a @k C44443b c44443b, @k Continuation<? super TypedResult<nl0.e>> continuation);

    @f("1/delivery/item/validation")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object o(@t("oldPrice") long j12, @t("newPrice") long j13, @t("itemId") long j14, @k Continuation<? super TypedResult<C40125a>> continuation);
}
