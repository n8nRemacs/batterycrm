package fa;

import J81.o;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.section.SectionResponse;
import com.avito.android.remote.model.section.complementary_v3.SectionResponseV3;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvertDetailsCoroutinesApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jv\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJv\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u000eJT\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfa/d;", "", "", "advertId", "segmentId", "fromSegment", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "isShutter", "", "blockEngines", "locationParams", "Lcom/avito/android/remote/model/section/SectionResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionResponseV3;", "c", "itemId", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "categoryId", "microCategoryId", "blockIds", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes10.dex */
public interface d {

    /* compiled from: AdvertDetailsCoroutinesApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @o("1/items/blocks/log")
    @J81.e
    @InterfaceC42830m
    @l
    Object a(@J81.c("itemId") @k String str, @J81.c("view") @l String str2, @J81.c("categoryId") @l String str3, @J81.c("microCategoryId") @l String str4, @J81.d @k Map<String, String> map, @k Continuation<? super G0> continuation);

    @J81.f("2/items/{advertId}/complementary")
    @l
    @InterfaceC42830m
    Object b(@s("advertId") @k String str, @l @t("segmentId") String str2, @l @t("fromSegment") String str3, @l @t(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) String str4, @l @t("isShutter") Boolean bool, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super SectionResponse> continuation);

    @J81.f("3/items/{advertId}/complementary")
    @l
    @InterfaceC42830m
    Object c(@s("advertId") @k String str, @l @t("segmentId") String str2, @l @t("fromSegment") String str3, @l @t(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) String str4, @l @t("isShutter") Boolean bool, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super SectionResponseV3> continuation);
}
