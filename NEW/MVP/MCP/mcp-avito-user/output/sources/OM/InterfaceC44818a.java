package om;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleAutosaveResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleCounterResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleGetImagesResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleItemsResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleLoadPageResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchItemsInfoResult;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import pm.C47113d;

/* compiled from: CampaignsSaleApi.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00060\u001fH'¢\u0006\u0004\b!\u0010\"J4\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010\tJ6\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b(\u0010\u000eJ4\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b-\u0010.J*\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lom/a;", "", "", "saleId", "fromPage", "selectedItemId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleLoadPageResult;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "blocks", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleAutosaveResult;", "b", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "init", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleItemsResult;", "k", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionID", "Lpm/d;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "g", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemIds", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleGetImagesResult;", "h", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleCounterResult;", "a", "()Lio/reactivex/rxjava3/core/z;", "query", "filter", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleSearchResult;", "e", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleSearchItemsInfoResult;", "i", "itemId", "", "discount", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleSearchAddRemoveResult;", "f", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: om.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44818a {
    @f("1/campaigns/profile-counter-key")
    @k
    z<TypedResult<CampaignsSaleCounterResult>> a();

    @o("1/campaigns/sales/{saleId}/autosave")
    @e
    @l
    Object b(@s("saleId") @k String str, @d @k Map<String, String> map, @k Continuation<? super TypedResult<CampaignsSaleAutosaveResult>> continuation);

    @o("1/campaigns/sales/{saleId}/save")
    @e
    @l
    Object c(@s("saleId") @k String str, @J81.c("sessionID") @k String str2, @d @k Map<String, String> map, @k Continuation<? super TypedResult<C47113d>> continuation);

    @o("1/campaigns/sales/{saleId}/items/delete")
    @e
    @l
    Object d(@s("saleId") @k String str, @J81.c("itemId") @k String str2, @k Continuation<? super TypedResult<CampaignsSaleSearchAddRemoveResult>> continuation);

    @f("1/campaigns/sales/{saleId}/search")
    @l
    Object e(@s("saleId") @k String str, @t("query") @k String str2, @t("filter") @k String str3, @k Continuation<? super TypedResult<CampaignsSaleSearchResult>> continuation);

    @o("1/campaigns/sales/{saleId}/items/add")
    @e
    @l
    Object f(@s("saleId") @k String str, @J81.c("itemId") @k String str2, @J81.c("discount") int i12, @k Continuation<? super TypedResult<CampaignsSaleSearchAddRemoveResult>> continuation);

    @o("1/campaigns/sales/{saleId}/stop")
    @l
    Object g(@s("saleId") @k String str, @k Continuation<? super TypedResult<G0>> continuation);

    @o("1/campaigns/items/images")
    @e
    @l
    Object h(@d @k Map<String, String> map, @k Continuation<? super TypedResult<CampaignsSaleGetImagesResult>> continuation);

    @f("1/campaigns/sales/{saleId}/search/items")
    @l
    Object i(@s("saleId") @k String str, @u @k Map<String, String> map, @k Continuation<? super TypedResult<CampaignsSaleSearchItemsInfoResult>> continuation);

    @f("2/campaigns/sales/{saleId}")
    @l
    Object j(@s("saleId") @k String str, @l @t("fromPage") String str2, @l @t("selectedItemId") String str3, @k Continuation<? super TypedResult<CampaignsSaleLoadPageResult>> continuation);

    @f("2/campaigns/sales/{saleId}/items")
    @l
    Object k(@s("saleId") @k String str, @l @t("init") Boolean bool, @k Continuation<? super TypedResult<CampaignsSaleItemsResult>> continuation);
}
