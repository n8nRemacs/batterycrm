package sj0;

import J81.e;
import J81.i;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tj0.C48679a;
import uj0.C49067a;
import vj0.C49338a;
import wj0.C49640a;

/* compiled from: AuctionApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\tJ8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lsj0/a;", "", "", Navigation.ATTRIBUTES, "draftId", "slots", "Lcom/avito/android/remote/model/TypedResult;", "Ltj0/a;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "referer", "userAgent", "itemId", "utmSource", "Luj0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvj0/a;", "b", "Lwj0/a;", "d", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC48373a {
    @o("1/auto/auction/mobile/createLotOnItemEditing")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@i("Referer") @l String str, @i("User-Agent") @l String str2, @J81.c("itemId") @k String str3, @J81.c("utmSource") @l String str4, @k Continuation<? super TypedResult<C49067a>> continuation);

    @o("1/auto/auction/mobile/isAuctionAvailableOnItemEditing")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@i("Referer") @l String str, @i("User-Agent") @l String str2, @J81.c("itemId") @k String str3, @k Continuation<? super TypedResult<C49338a>> continuation);

    @o("1/auto/auction/mobile/createLotOnItemCreation")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c(Navigation.ATTRIBUTES) @k String str, @J81.c("draftId") @l String str2, @J81.c("slots") @k String str3, @k Continuation<? super TypedResult<C48679a>> continuation);

    @o("1/auto/auction/mobile/itemEditingTag")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@i("User-Agent") @l String str, @i("Referer") @l String str2, @J81.c("itemId") @k String str3, @k Continuation<? super TypedResult<C49640a>> continuation);
}
