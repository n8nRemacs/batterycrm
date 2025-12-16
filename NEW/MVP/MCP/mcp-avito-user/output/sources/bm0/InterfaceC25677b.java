package bm0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.InlineFilterValue;
import e30.InterfaceC39936a;
import hm0.InterfaceC40961a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAdvertsActionsApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001JB\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\f\u0010\u000bJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbm0/b;", "", "", "", "itemIds", "cptTokens", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "b", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "draftIds", "reason", "d", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bm0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25677b {

    /* compiled from: UserAdvertsActionsApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bm0.b$a */
    public static final class a {
    }

    @o("1/profile/items/restore")
    @e
    @l
    Object a(@J81.d @k Map<String, String> map, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @o("1/profile/items/activate")
    @e
    @l
    Object b(@J81.d @k Map<String, String> map, @J81.d @k Map<String, String> map2, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @o("1/profile/items/delete")
    @e
    @l
    Object c(@J81.d @k Map<String, String> map, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @o("1/profile/drafts/delete")
    @e
    @l
    Object d(@J81.d @k Map<String, String> map, @J81.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) @k String str, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @o("1/profile/items/stop")
    @e
    @l
    Object e(@J81.d @k Map<String, String> map, @J81.c("reason") @l String str, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);
}
